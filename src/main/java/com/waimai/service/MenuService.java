package com.waimai.service;

import java.io.Serializable;

import com.waimai.dao.MenuDao;
import com.waimai.model.Menu;


public abstract class MenuService {
	private MenuDao menuDao;
	
	public void delMenu(Serializable id){
		menuDao.delete(id);
	}
	
	public Menu saveMenu(Menu m){
		return menuDao.save(m);
	}
	
	public Menu loadMenuById(Serializable id){
		return menuDao.findOne(id);
	}

	public MenuDao getMenuDao() {
		return menuDao;
	}
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}
	
}
