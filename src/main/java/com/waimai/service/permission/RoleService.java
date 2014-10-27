package com.waimai.service.permission;

import java.io.Serializable;
import java.util.List;

import com.waimai.model.permission.Role;
import com.waimai.model.permission.User;


public interface RoleService {
	
	/**
	 * @FunName: loadRoleByName
	 * @Description:  根据角色名获取角色信息
	 * @param roleName
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Role loadRoleByName(String roleName);
	/**
	 * @FunName: saveRole
	 * @Description:  保存角色
	 * @param role
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Role saveRole(Role role);
	/**
	 * @FunName: delRole
	 * @Description:  删除角色
	 * @param role
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public void delRole(Role role);
	
	/**
	 * @FunName: findRoleByUser
	 * @Description:  查看此用户的所有角色
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public List<Role> findRoleByUser(User u);
	/**
	 * @FunName: findDefault
	 * @Description:  查询默认的角色，只有一个！
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Role findDefault();
	/**
	 * @FunName: findUserByRole
	 * @Description:  查询某角色下的用户对象
	 * @param roleId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<User> findUserByRole(Serializable roleId);
	public Object findAllByAjax();
}
