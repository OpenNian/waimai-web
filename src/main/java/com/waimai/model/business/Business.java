package com.waimai.model.business;  

import java.io.Serializable;
import java.util.Date;

import com.waimai.model.IdEntity;

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
	 * 商家名编号
	 */
	private String bussinesNo;
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
	 * 商家描述介绍等
	 */
	private String busdetail;
	/**
	 * 商家创建时间
	 */
	private Date createTime;
	
	
	public String getBusdetail() {
		return busdetail;
	}
	public void setBusdetail(String busdetail) {
		this.busdetail = busdetail;
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
	public String getBussinesNo() {
		return bussinesNo;
	}
	public void setBussinesNo(String bussinesNo) {
		this.bussinesNo = bussinesNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
