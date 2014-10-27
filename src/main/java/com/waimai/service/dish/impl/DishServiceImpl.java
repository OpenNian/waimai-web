package com.waimai.service.dish.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.dish.DishMapper;
import com.waimai.service.dish.DishService;

@Service("dishService")
public class DishServiceImpl implements DishService{
	@Autowired
	private DishMapper dishDao;

	public DishMapper getDishDao() {
		return dishDao;
	}
	public void setDishDao(DishMapper dishDao) {
		this.dishDao = dishDao;
	}
	
}
