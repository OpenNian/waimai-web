package com.waimai.model;  

import java.io.Serializable;

/**
 * ClassName: Business
 * Desc: 菜品提供商（商家）
 * date: 2014-9-22 下午2:30:02
 * @author li.n1 
 * @since JDK 1.6
 */
public class Business implements Serializable{
	/** 
	 * serialVersionUID:序列化
	 * @since JDK 1.6 
	 */ 
	private static final long serialVersionUID = 2926907568693709547L;
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
