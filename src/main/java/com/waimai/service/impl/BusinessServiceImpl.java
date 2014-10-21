package com.waimai.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.BusinessMapper;
import com.waimai.service.BusinessService;

@Service("businessService")
public class BusinessServiceImpl implements BusinessService{
	@Autowired
	private BusinessMapper businessDao;
	
}
