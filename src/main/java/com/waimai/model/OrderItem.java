package com.waimai.model;  

import java.io.Serializable;

public class OrderItem implements Serializable{
	/** 
	 * serialVersionUID:序列化
	 * @since JDK 1.6 
	 */ 
	private static final long serialVersionUID = -3715889807000320027L;
	private int id;
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
	private Dish dish;
	/**
	 * 订单号
	 */
	private GoodOrder goodOrder;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Dish getDish() {
		return dish;
	}
	public void setDish(Dish dish) {
		this.dish = dish;
	}
	public GoodOrder getGoodOrder() {
		return goodOrder;
	}
	public void setGoodOrder(GoodOrder goodOrder) {
		this.goodOrder = goodOrder;
	}
}
