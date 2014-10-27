package com.waimai.dao.permission;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.waimai.model.permission.User;

/**
 * 
 * @author li.n1
 *
 */

public interface UserMapper{
	/**
	 * @FunName: findByName
	 * @Description:  通过用户名获得User对象
	 * @param username
	 * @return User
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public User findByName(String username);
	/**
	 * @FunName: findUserByLike
	 * @Description:  模糊查询
	 * @param username
	 * @return List<User>
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public List<User> findUserByLike(String keyword);
	/**
	 * @FunName: getPasswordById
	 * @Description:  得到密码（已经加密）
	 * @param id
	 * @return String
	 * @Author: 李年
	 * @CreateDate: 2013-3-28
	 */
	public String getPasswordById(Serializable id);
	
	public Boolean changePassword(@Param("username") String username,@Param("password") String password);
	/**
	 * @FunName: unsubscribe
	 * @Description:  通过username注销用户
	 * @param username
	 * @Author: 李年
	 * @CreateDate: 2013-5-8
	 */
	public Boolean unsubscribe(String username);
	/**
	 * @FunName: unsubscribe
	 * @Description:  通过User主键注销用户
	 * @param id
	 * @Author: 李年
	 * @CreateDate: 2013-5-8
	 */
	public Boolean unsubscribe(Serializable id);
	public Boolean delete(User model);
	public Boolean delete(Serializable id);
	/**
	 * 批量删除
	 */
	public Boolean deleteInBatch(List<User> users);
	
	public Long count();
	
	public User findOne(Serializable id);
	/**
	 * 批量添加
	 */
	public List<User> save(List<User> lists);
	
	public User save(User model);
}
