package com.waimai.service.impl;  

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.waimai.model.dish.Dish;
import com.waimai.service.dish.DishService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="applicationContext.xml")
public class DishServiceImplTest {
	@Autowired
	private DishService dishService;
	
	@Test
	public void testList(){
		//Page<Dish> page = dishService.list();
		//assertNotNull(page);
		//assertTrue(page.data.size()>0);
	}

	public DishService getDishService() {
		return dishService;
	}

	public void setDishService(DishService dishService) {
		this.dishService = dishService;
	}
}
