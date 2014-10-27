package com.waimai.service.permission;

import java.util.List;

import com.waimai.model.permission.Resource;


public interface ResourceService {
	
	/**
	 * @FunName: findResourceByParentId
	 * @Description:  根据二级菜单查询资源,只获取能够显示的资源
	 * @param menuId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<Resource> findResourceByParentId(Integer menuId);
	/**
	 * @FunName: findResourceByParentId
	 * @Description:  根据二级菜单查询全部资源
	 * @param menuId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<Resource> findAllResourceByParentId(Integer menuId);
	/**
	 * @FunName: findResourceByRole
	 * @Description:  根据角色查看能访问的资源
	 * @param name
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<Resource> findResourceByRole(String name) ;
	
	/**
	 * @FunName: loadResourceByResource
	 * @Description:  根据资源Id查询资源对象
	 * @param id
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Resource loadResourceByResource(Integer id);
	
}
