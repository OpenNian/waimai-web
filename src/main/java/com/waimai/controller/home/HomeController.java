package com.waimai.controller.home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waimai.model.permission.User;
import com.waimai.service.permission.UserService;
import com.waimai.service.permission.impl.LogUtil;
import com.waimai.util.LogType;


/**
 * Handles requests for the application home page.
 */
@Controller
@Scope("prototype")
@RequestMapping("/background")
public class HomeController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private AuthenticationManager myAuthenticationManager;
	
	private final static Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value={"/index","/",""}, method = RequestMethod.GET)
	public String home(Model model) {
		return "admin/index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model,HttpServletRequest request) {
		//重新登录时销毁该用户的Session
		Object o = request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");
		if(null != o){
			request.getSession().removeAttribute("SPRING_SECURITY_CONTEXT");
		}
		return "admin/login";
	}
	
	@RequestMapping (value = "/loginCheck", method = RequestMethod.POST)
	public String loginCheck(String username,String password,HttpServletRequest request){
		try {
			if (!request.getMethod().equals("POST")) {
				request.setAttribute("error","支持POST方法提交！");
			}
			if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
				request.setAttribute("error","用户名或密码不能为空！");
				return "/admin/login";
			}
			// 验证用户账号与密码是否正确
			User users = this.userService.loadUserByName(username);
			if (users == null || !users.getPassword().equals(DigestUtils.md5Hex(password))) {
				request.setAttribute("error", "用户或密码不正确！");
			    return "/admin/login";
			}
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username,DigestUtils.md5Hex(password));
			Authentication authentication = myAuthenticationManager
					.authenticate(token);
			SecurityContext securityContext = SecurityContextHolder.getContext();
			securityContext.setAuthentication(authentication);
			HttpSession session = request.getSession(true);  
		    session.setAttribute("SPRING_SECURITY_CONTEXT", securityContext);  
		    // 当验证都通过后，把用户信息放在session里
			request.getSession().setAttribute("userSession", users);
			// 记录登录信息
			//UserLoginList userLoginList = new UserLoginList();
			//userLoginList.setUserId(users.getUserId());
			//userLoginList.setLoginIp(Common.toIpAddr(request));
			//userLoginListService.add(userLoginList);
			LogUtil.getInstance().log(LogType.LOGIN, "用户登录");
		} catch (AuthenticationException ae) {
			logger.error("登录异常，请联系管理员！", ae);
			request.setAttribute("error", "登录异常，请联系管理员！");
		    return "/admin/login";
		}
		return "redirect:index.htm";
	}
	
}
