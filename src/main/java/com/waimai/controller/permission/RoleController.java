package com.waimai.controller.permission;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.waimai.model.permission.Menu;
import com.waimai.model.permission.Resource;
import com.waimai.model.permission.Role;
import com.waimai.model.permission.User;
import com.waimai.service.permission.RoleService;
import com.waimai.service.permission.impl.LogUtil;
import com.waimai.service.permission.impl.MenuServiceImpl;
import com.waimai.service.permission.impl.ResourceServiceImpl;
import com.waimai.service.permission.impl.RoleServiceImpl;
import com.waimai.util.LogType;
import com.waimai.util.MsgUtil;
import com.waimai.util.PageRainier;
import com.waimai.util.UUIDGenerator;

@Controller
@RequestMapping("/background/sys")
@Scope("prototype")
public class RoleController {
	@Autowired
	private RoleService roleService;
	private PageRainier<Role> roles;
	private Integer pageSize = 10;
	@Autowired
	private ResourceServiceImpl resourceService;
	@Autowired
	private MenuServiceImpl menuService;
	
	/**
	 * @FunName: getRolesByAjax
	 * @Description:  通过ajax请求获得角色标识与描述
	 * @return
	 * @Author: 李年
	 */
	@RequestMapping(value="/role/getRolesByAjax",method=RequestMethod.GET)
	@ResponseBody
	public List<Object[]> getRolesByAjax(){
		List<Object[]> rolesByAjax = roleService.findAllByAjax();
		return rolesByAjax;
	}
	
	@RequestMapping("/role/{pageNo}")
	public String list(@PathVariable Integer pageNo,String keyword,
			Model model,HttpServletRequest request){
		System.out.println(pageNo+"="+"=====");
		roles = roleService.findAll(keyword,pageNo, pageSize);
		model.addAttribute("page",roles);//map
		return "admin/sys/role/list";
	}
	
	@RequestMapping("/role/add")
	public String add(Model model) {
		return "admin/sys/role/add";
	}
	
	@RequestMapping(value="/role/add",method=RequestMethod.POST)
	public String add(Role role, HttpServletRequest request) {
		try {
			String marking = UUIDGenerator.getUUID().toUpperCase();
			role.setName("ROLE_"+marking);
			role.setCreateDate(new Date());
			roleService.saveRole(role);
			MsgUtil.setMsgAdd("success");
			LogUtil.getInstance().log(LogType.ADD,"角色："+role.getDesc());
		} catch (Exception e) {
			MsgUtil.setMsgAdd("error");
			e.printStackTrace();
		}
		return InternalResourceViewResolver.REDIRECT_URL_PREFIX+"/admin/sys/role/roles/1";
	}
	
	@RequestMapping(value="/role/{roleName}/update",method=RequestMethod.GET)
	public String update(@PathVariable String roleName,Model model) {
		if (roleName != null) {
			model.addAttribute("model",roleService.loadRoleByName(roleName));
		}
		return "admin/sys/role/update";
	}
	
	@RequestMapping(value="/role/{roleName}/update",method=RequestMethod.POST)
	public String update(@PathVariable String roleName,Role role) {
		if(roleName!=null){
			Role temp = roleService.loadRoleByName(role.getName());
			String ryName = temp.getDesc();
			temp.setDesc(role.getDesc());
			roleService.saveRole(temp);
			MsgUtil.setMsgUpdate("success");
			LogUtil.getInstance().log(LogType.EDIT,"角色由\""+ryName+"\"修改为：\""+temp.getDesc()+"\"");
		}
		return "redirect:/admin/sys/role/roles/1";
	}
	
	@RequestMapping(value="/role/{roleName}/del",method=RequestMethod.GET)
	public String del(@PathVariable String roleName){
		if(roleName!=null){
			Role role = roleService.loadRoleByName(roleName);
			for(User u : role.getUsers()){
				u.getRoles().remove(role);
			}
			roleService.delRole(role);
			MsgUtil.setMsgDelete("success");
			LogUtil.getInstance().log(LogType.DEL,"角色名为："+role.getDesc());
		}
		return "redirect:/admin/admin/sys/role/roles/1";
	}
	
	@RequestMapping(value="/role/qxfp",method=RequestMethod.GET)
	public String qxfp(){
		return "admin/sys/role/qxfp";
	}
	
	@RequestMapping(value="/role/{roleName}/distribute",method=RequestMethod.POST)
	public String distribute(@PathVariable String roleName,HttpServletRequest request,HttpSession session){
		try {
			if(roleName!=null){
				//此处strIds既包括menuId也包括resourceId
				String strIds = request.getParameter("str");
				String[] strIdArr = null;
				Role model = roleService.loadRoleByName(roleName);
				if(strIds!=null&&strIds.trim()!=""){
					strIdArr = strIds.split(",");
					List<Resource> ress = new ArrayList<Resource>();
					List<Menu> menus = new ArrayList<Menu>();
					List<Resource> resources = null;
					Resource res = null;
					Menu menu = null;
					for(String str : strIdArr){
						if(str.startsWith("r_")){
							res = resourceService.loadResourceByResource(Integer.parseInt(str.substring(2)));
							ress.add(res);
						}else{
							menu = menuService.loadMenuById(Long.parseLong(str));
							resources = resourceService.findResourceByParentId(menu.getId());
							if(menu.getParentMenu()!=null&&resources!=null&&resources.size()==0){
								ress.addAll(resourceService.findAllResourceByParentId(menu.getId()));
							}
							menus.add(menu);
						}
					}
					model.setResources(ress);
					model.setMenus(menus);
				}else{
					if(strIds!=null){
						model.setResources(null);
						model.setMenus(null);
					}
				}
				roleService.saveRole(model);
				MsgUtil.setMsg("success", "成功分配【"+model.getDesc()+"】权限！");
				LogUtil.getInstance().log(LogType.DISTRIBUTE, "重新分配了"+model.getDesc()+"的权限");
				try {
					//resourceDetailsMonitor.afterPropertiesSet();
					//session.removeAttribute("menuXml");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else{
				MsgUtil.setMsg("error", "分配权限失败！");
			}
		} catch (NumberFormatException e) {
			MsgUtil.setMsg("error", "分配权限失败！");
		}
		return "redirect:/admin/sys/role/roles/1";
	}

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public PageRainier<Role> getRoles() {
		return roles;
	}

	public void setRoles(PageRainier<Role> roles) {
		this.roles = roles;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
}
