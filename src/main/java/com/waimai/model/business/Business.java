package com.waimai.model.business;  

import java.io.Serializable;
import java.util.Set;

import com.waimai.model.IdEntity;
import com.waimai.model.dish.Dish;

/**
 * ClassName: Business
 * Desc: 菜品提供商（商家）
 * date: 2014-9-22 下午2:30:02
 * @author li.n1 
 * @since JDK 1.6
 */
public class Business extends IdEntity implements Serializable{
	/** 
	 * serialVersionUID:序列化
	 * @since JDK 1.6 
	 */ 
	private static final long serialVersionUID = 2926907568693709547L;
	/**
	 * 商家名称
	 */
	private String name;
	/**
	 * 商家地址
	 */
	private String address;
	/**
	 * 负责人名称
	 */
	private String headName;
	/**
	 * 负责人电话号码
	 */
	private String telephone;
	/**
	 * 商家所有菜品
	 */
	private Set<Dish> dishes;
	/**
	 * 商家描述介绍等
	 */
	private String describe;
	
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHeadName() {
		return headName;
	}
	public void setHeadName(String headName) {
		this.headName = headName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Set<Dish> getDishes() {
		return dishes;
	}
	public void setDishes(Set<Dish> dishes) {
		this.dishes = dishes;
	}
}
