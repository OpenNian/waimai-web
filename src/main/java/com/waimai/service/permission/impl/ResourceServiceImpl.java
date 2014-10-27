package com.waimai.service.permission.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.permission.MenuMapper;
import com.waimai.dao.permission.ResourceMapper;
import com.waimai.model.permission.Menu;
import com.waimai.model.permission.Resource;
import com.waimai.service.permission.ResourceService;

@Service("resourceService")
public class ResourceServiceImpl implements ResourceService{
	@Autowired
	private ResourceMapper resourceDao;
	@Autowired
	private MenuMapper menuDao;
	
	/**
	 * @FunName: loadMenuByResourceId
	 * @Description:  查找权限资源所属的二级菜单
	 * @param resourceId 资源Id
	 * @return 所属的二级菜单
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Menu loadMenuByResourceId(Integer resourceId){
		return menuDao.loadMenuByResourceId(resourceId);
	}
	
	/**
	 * @FunName: findResourceByParentId
	 * @Description:  根据二级菜单查询资源,只获取能够显示的资源
	 * @param menuId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<Resource> findResourceByParentId(Integer menuId){
		return resourceDao.findResourceByParentId(menuId);
	}
	/**
	 * @FunName: findResourceByParentId
	 * @Description:  根据二级菜单查询全部资源
	 * @param menuId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<Resource> findAllResourceByParentId(Integer menuId){
		return resourceDao.findAllResourceByParentId(menuId);
	}
	/**
	 * @FunName: findResourceByRole
	 * @Description:  根据角色查看能访问的资源
	 * @param name
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<Resource> findResourceByRole(String name) {
		return resourceDao.findResourceByRole(name);
	}
	
	/**
	 * @FunName: loadResourceByResource
	 * @Description:  根据资源Id查询资源对象
	 * @param id
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Resource loadResourceByResource(Integer id){
		return resourceDao.loadResourceByResourceId(id,menuDao.findOne(id));
	}
}
