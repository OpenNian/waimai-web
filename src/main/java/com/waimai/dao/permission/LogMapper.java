package com.waimai.dao.permission;

import java.util.List;

import com.waimai.model.permission.Log;

public interface LogMapper {

	int save(Log log);
	
	List<Log> findAll();
}
