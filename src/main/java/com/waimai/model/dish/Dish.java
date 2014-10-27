package com.waimai.model.dish;  

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.waimai.model.IdEntity;
import com.waimai.model.business.Business;

/**
 * ClassName: Dish
 * Desc: 菜品实体类
 * date: 2014-9-22 下午2:27:16
 * @author li.n1 
 * @since JDK 1.6
 */
public class Dish extends IdEntity implements Serializable{
	/** 
	 * serialVersionUID:序列化
	 * @since JDK 1.6 
	 */ 
	private static final long serialVersionUID = 9121389848184203713L;
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
	private Set<Business> businesses;
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
	/**
	 * 菜品唯一的编码；
	 */
	private String dishNo;
	/**
	 * 菜品创建时间
	 */
	private Date createTime;
	
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
	public Set<Business> getBusinesses() {
		return businesses;
	}
	public void setBusinesses(Set<Business> businesses) {
		this.businesses = businesses;
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
	public String getDishNo() {
		return dishNo;
	}
	public void setDishNo(String dishNo) {
		this.dishNo = dishNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
