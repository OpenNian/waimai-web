package com.waimai.model.order;  

import java.io.Serializable;
import java.util.Date;

import com.waimai.model.IdEntity;

public class OrderItem extends IdEntity implements Serializable{
	/** 
	 * serialVersionUID:序列化
	 * @since JDK 1.6 
	 */ 
	private static final long serialVersionUID = -3715889807000320027L;
	/**
	 * 购买数量
	 */
	private int size;
	/**
	 * 单价
	 */
	private double unitPrice;
	/**
	 * 菜品
	 */
	private String dishNo;
	/**
	 * 订单号
	 */
	private String orderNo;
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDishNo() {
		return dishNo;
	}
	public void setDishNo(String dishNo) {
		this.dishNo = dishNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
