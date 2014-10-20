package com.waimai.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.GoodOrderDao;
import com.waimai.service.GoodOrderService;

@Service
public class GoodOrderServiceImpl implements GoodOrderService{
	@Autowired
	private GoodOrderDao goodOrderDao;

	public GoodOrderDao getGoodOrderDao() {
		return goodOrderDao;
	}
	public void setGoodOrderDao(GoodOrderDao goodOrderDao) {
		this.goodOrderDao = goodOrderDao;
	}
	
}
