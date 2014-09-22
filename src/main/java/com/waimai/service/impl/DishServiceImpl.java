package com.waimai.service.impl;  

import com.waimai.dao.DishDao;
import com.waimai.service.DishService;

public class DishServiceImpl implements DishService{
	private DishDao dishDao;

	public DishDao getDishDao() {
		return dishDao;
	}
	public void setDishDao(DishDao dishDao) {
		this.dishDao = dishDao;
	}
	
}
