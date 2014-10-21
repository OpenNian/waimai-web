package com.waimai.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.GoodOrderMapper;
import com.waimai.service.GoodOrderService;

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
