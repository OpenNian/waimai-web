package com.waimai.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waimai.dao.RoleDao;
import com.waimai.model.Role;
import com.waimai.model.User;
import com.waimai.service.RoleService;
import com.waimai.util.PageRainier;

@Service
public class RoleServiceImpl extends RoleService{
	@Autowired
	private RoleDao roleDao;
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

	public PageRainier<Role> findAll(Integer pageNo, Integer pageSize, boolean b) {
		return null;
	}
	/**
	 * @FunName: loadRoleByName
	 * @Description:  根据角色名获取角色信息
	 * @param roleName
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Role loadRoleByName(String roleName){
		return roleDao.findOne(roleName);
	}
	/**
	 * @FunName: saveRole
	 * @Description:  保存角色
	 * @param role
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Role saveRole(Role role){
		try {
			Role r = roleDao.save(role);
			if(r!=null){
				return r;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * @FunName: delRole
	 * @Description:  删除角色
	 * @param role
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public void delRole(Role role){
		try {
			roleDao.delete(role);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @FunName: findRoleByUser
	 * @Description:  查看此用户的所有角色
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public List<Role> findRoleByUser(User u){
		return roleDao.findRoleByUser(u.getId());
	}
	/**
	 * @FunName: findDefault
	 * @Description:  查询默认的角色，只有一个！
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public Role findDefault(){
		return roleDao.findDefaultRole();
	}
	/**
	 * @FunName: findUserByRole
	 * @Description:  查询某角色下的用户对象
	 * @param roleId
	 * @return
	 * @Author: 李年
	 * @CreateDate: 2013-5-24
	 */
	public List<User> findUserByRole(Serializable roleId){
		return roleDao.findUserByRole(roleId);
	}
}
