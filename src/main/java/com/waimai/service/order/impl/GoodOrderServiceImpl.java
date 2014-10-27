package com.waimai.service.order.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.order.GoodOrderMapper;
import com.waimai.service.order.GoodOrderService;

@Service("goodOrderService")
public class GoodOrderServiceImpl implements GoodOrderService{
	@Autowired
	private GoodOrderMapper goodOrderDao;

	public GoodOrderMapper getGoodOrderDao() {
		return goodOrderDao;
	}
	public void setGoodOrderDao(GoodOrderMapper goodOrderDao) {
		this.goodOrderDao = goodOrderDao;
	}
	
}
