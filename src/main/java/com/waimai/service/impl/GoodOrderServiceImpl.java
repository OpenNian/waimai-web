package com.waimai.service.impl;  

import com.waimai.dao.GoodOrderDao;
import com.waimai.service.GoodOrderService;

public class GoodOrderServiceImpl implements GoodOrderService{
	private GoodOrderDao goodOrderDao;

	public GoodOrderDao getGoodOrderDao() {
		return goodOrderDao;
	}
	public void setGoodOrderDao(GoodOrderDao goodOrderDao) {
		this.goodOrderDao = goodOrderDao;
	}
	
}
