package com.waimai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.MenuDao;
import com.waimai.dao.ResourceDao;
import com.waimai.model.Menu;
import com.waimai.model.Resource;
import com.waimai.service.ResourceService;

@Service
public class ResourceServiceImpl extends ResourceService{
	@Autowired
	private ResourceDao resourceDao;
	@Autowired
	private MenuDao menuDao;
	/**
	 * 通过父菜单得到资源
	 * （通过二级菜单得到三级资源）
	 * 只获取可以显示的资源
	 */
	public List<Resource> findResourceByParentId(Integer menuId){
		return this.getResourceDao().findResourceByParentId(menuId);
	}
	/**
	 * @FunName: findAllResourceByParentId
	 * @Description:  获取全部子资源
	 * @param menuId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-6-5
	 */
	public List<Resource> findAllResourceByParentId(Integer menuId){
		return this.getResourceDao().findAllResourceByParentId(menuId);
	}
	/**
	 * 通过角色拿到所有能访问的资源
	 */
	public List<Resource> findResourceByRole(String name) {
		return this.getResourceDao().findResourceByRole(name);
	}
	/**
	 * @FunName: loadMenuByResourceId
	 * @Description:  查找权限资源所属的二级菜单
	 * @param resourceId 资源Id
	 * @return 所属的二级菜单
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Menu loadMenuByResourceId(Integer resourceId){
		return this.getMenuDao().loadMenuByResourceId(resourceId);
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
		return this.getResourceDao().loadResourceByResourceId(id,menuDao.findOne(id));
	}
}
