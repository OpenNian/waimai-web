package com.waimai.service.order.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.order.OrderItemMapper;
import com.waimai.service.order.OrderItemService;

@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService{
	@Autowired
	private OrderItemMapper orderItemDao;
	
}
