package com.waimai.service;

import java.io.Serializable;

import com.waimai.dao.MenuDao;
import com.waimai.model.Menu;


public interface MenuService {
	
	public void delMenu(Serializable id);
	
	public Menu saveMenu(Menu m);
	
	public Menu loadMenuById(Serializable id);

}
