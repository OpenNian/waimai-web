package com.waimai.model;  

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * ClassName: GoodOrder
 * Desc: 菜品订单
 * date: 2014-9-22 下午2:43:34
 * @author li.n1 
 * @since JDK 1.6
 */
public class GoodOrder implements Serializable{
	/** 
	 * serialVersionUID:序列化 
	 * @since JDK 1.6 
	 */ 
	private static final long serialVersionUID = -1323789713783799855L;
	private int id;
	/**
	 * 订单号
	 */
	private int orderNo;
	/**
	 * 订单产生时间
	 */
	private Date createTime;
	/**
	 * 订单项
	 */
	private List<OrderItem> items;
	/**
	 * 菜品总数
	 */
	private int goodNum;
	/**
	 * 菜品总价
	 */
	private double goodPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	public int getGoodNum() {
		return goodNum;
	}
	public void setGoodNum(int goodNum) {
		this.goodNum = goodNum;
	}
	public double getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}
}
