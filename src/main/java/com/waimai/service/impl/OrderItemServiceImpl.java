package com.waimai.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.OrderItemMapper;
import com.waimai.service.OrderItemService;

@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService{
	@Autowired
	private OrderItemMapper orderItemDao;
	
}
