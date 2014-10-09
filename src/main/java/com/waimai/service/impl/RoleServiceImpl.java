package com.waimai.service.impl;

import java.util.List;
import com.waimai.service.RoleService;


public class RoleServiceImpl extends RoleService{
	/**
	 * @FunName: findAllByAjax
	 * @Description:  ajax异步拿到所有角色的name与desc属性
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<Object[]> findAllByAjax() {
		return this.getRoleDao().finAllByAjax();
	}
	
}
