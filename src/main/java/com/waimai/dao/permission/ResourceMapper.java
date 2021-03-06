package com.waimai.dao.permission;

import java.util.List;

import com.waimai.model.permission.Menu;
import com.waimai.model.permission.Resource;


/**
 * @Project: auth_core
 * @ModuleID: 
 * @Comments: 
 * @JDK Version Used:<JDK1.6>		
 * @Author: 李年
 * @Create Date: 2013-3-28
 * @Modified By: 
 * @Modified Date: 
 * @Why & What is modified: ? <修改原因描述>		
 * @Version:1.0<版本号>
 */

public interface ResourceMapper {
	/**
	 * @FunName: getAllResource
	 * @Description:  拿到所有资源
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public List<Resource> findAll();
	/**
	 * @FunName: findResourceByParentId
	 * @Description:  通过二级菜单获取三级可以显示的资源
	 * @param menuId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public List<Resource> findResourceByParentId(Integer menuId);
	/**
	 * @FunName: findResourceByParentId
	 * @Description:  通过二级菜单获取全部三级资源
	 * @param menuId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public List<Resource> findAllResourceByParentId(Integer menuId);
	/**
	 * @FunName: findResourceByRole
	 * @Description:  通过角色拿到所有资源
	 * @param name
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public List<Resource> findResourceByRole(String name);
	/**
	 * @FunName: loadResourceByResourceId
	 * @Description:  查找权限菜单所属的子菜单
	 * @param id
	 * @param menu
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public Resource loadResourceByResourceId(Integer id,Menu menu);
}
