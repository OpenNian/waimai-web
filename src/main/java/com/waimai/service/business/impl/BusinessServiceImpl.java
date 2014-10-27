package com.waimai.service.business.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.business.BusinessMapper;
import com.waimai.service.business.BusinessService;

@Service("businessService")
public class BusinessServiceImpl implements BusinessService{
	@Autowired
	private BusinessMapper businessDao;
	
}
