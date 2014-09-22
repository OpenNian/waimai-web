package com.waimai.model;  

import java.io.Serializable;

/**
 * ClassName: Dish
 * Desc: 菜品实体类
 * date: 2014-9-22 下午2:27:16
 * @author li.n1 
 * @since JDK 1.6
 */
public class Dish implements Serializable{
	/** 
	 * serialVersionUID:序列化
	 * @since JDK 1.6 
	 */ 
	private static final long serialVersionUID = 9121389848184203713L;
	private int id;
	/**
	 * 菜品名称
	 */
	private String name;
	/**
	 * 菜品价格
	 */
	private double price;
	/**
	 * 菜品的提供商
	 */
	private Business business;
	/**
	 * 菜品图片
	 */
	private String img;
	/**
	 * 销售份数
	 */
	private long saleNum;
	/**
	 * 排序号
	 */
	private int sortNum;
	/**
	 *是否推荐 
	 */
	private boolean recommendOrNot;
	/**
	 * 是否热门
	 */
	private boolean hotOrNot;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public long getSaleNum() {
		return saleNum;
	}
	public void setSaleNum(long saleNum) {
		this.saleNum = saleNum;
	}
	public int getSortNum() {
		return sortNum;
	}
	public void setSortNum(int sortNum) {
		this.sortNum = sortNum;
	}
	public boolean isRecommendOrNot() {
		return recommendOrNot;
	}
	public void setRecommendOrNot(boolean recommendOrNot) {
		this.recommendOrNot = recommendOrNot;
	}
	public boolean isHotOrNot() {
		return hotOrNot;
	}
	public void setHotOrNot(boolean hotOrNot) {
		this.hotOrNot = hotOrNot;
	}
	
}
