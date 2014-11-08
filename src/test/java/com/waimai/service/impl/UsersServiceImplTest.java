package com.waimai.service.impl;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.waimai.model.permission.User;
import com.waimai.service.permission.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml","classpath:spring-security.xml","classpath:spring/application-permission.xml"})
public class UsersServiceImplTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void testfindUserByName()
	{
		String name = "ln";
		User user = userService.loadUserByName(name);
		System.out.println(user.getRealName()+user.getUsername());
		assertNotNull(user);
		
		
	}
	
}
