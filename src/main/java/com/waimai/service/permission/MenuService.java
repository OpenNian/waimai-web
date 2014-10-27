package com.waimai.service.permission;

import java.io.Serializable;

import com.waimai.dao.permission.MenuMapper;
import com.waimai.model.permission.Menu;


public interface MenuService {
	
	public void delMenu(Serializable id);
	
	public Menu saveMenu(Menu m);
	
	public Menu loadMenuById(Serializable id);

}
