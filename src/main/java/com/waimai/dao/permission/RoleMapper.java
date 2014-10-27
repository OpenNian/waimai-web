package com.waimai.dao.permission;

import java.io.Serializable;
import java.util.List;

import com.waimai.model.permission.Role;
import com.waimai.model.permission.User;


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
public interface RoleMapper {
	/**
	 * @FunName: findUserByRole
	 * @Description:  查询此角色下的所有用户
	 * @param roleId
	 * @return List<User>
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
		public List<User> findUserByRole(Serializable roleName);
		/**
		 * @FunName: finAllByAjax
		 * @Description:  ajax异步拿到所有角色的name与desc属性
		 * @return List<Object[]>
		 * @Author: 李年
		 * @CreateDate: 2013-3-28
		 */
		public List<Object[]> finAllByAjax();
		/**
		 * @FunName: findRoleByUser
		 * @Description:  查找此用户所在的角色
		 * @param userId
		 * @return
		 * @Author: 李年
		 * @CreateDate: 2013-3-28
		 */
		public List<Role> findRoleByUser(Serializable userId);
		/**
		 * @FunName: findDefaultRole
		 * @Description:  查找默认的角色l，默认的角色只有一个！
		 * @return
		 * @Author: 李年
		 * @CreateDate: 2013-4-7
		 */
		public Role findDefaultRole();
		/**
		 * @Description:根据角色名查询角色
		 * @param roleName
		 * @return
		 */
		public Role findOne(Serializable roleName);
		/**
		 * 保存角色
		 * @param role
		 * @return
		 */
		public Role save(Role role);
		/**
		 * 删除
		 * @param role
		 */
		public void delete(Role role);
		
		public void deleteById(Serializable roleName);
}
