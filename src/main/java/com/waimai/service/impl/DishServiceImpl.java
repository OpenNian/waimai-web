package com.waimai.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.DishDao;
import com.waimai.service.DishService;

@Service
public class DishServiceImpl implements DishService{
	@Autowired
	private DishDao dishDao;

	public DishDao getDishDao() {
		return dishDao;
	}
	public void setDishDao(DishDao dishDao) {
		this.dishDao = dishDao;
	}
	
}
