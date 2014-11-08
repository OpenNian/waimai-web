package com.waimai.dao.business;  

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import com.waimai.model.business.Business;

public interface BusinessMapper {
	/**
	 * @FunName: findParentMenuByRole
	 * @Description:  根据所属角色查找能访问的一级菜单
	 * @param roles
	 * @return
	 * @Author: 胡小龙
	 * @CreateDate: 2013-3-28
	 */
	public List<Business> findBusiness(Collection<Business> Business);

	public Business findOne(Serializable id);
	
	public void delete(Serializable id);
	
	public Business save(Business bus);
}
