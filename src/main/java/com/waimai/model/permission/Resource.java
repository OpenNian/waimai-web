package com.waimai.model.permission;

import java.io.Serializable;
import java.util.List;

import com.waimai.model.IdEntity;

public class Resource extends IdEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;		//资源名
	private String res_type;	//资源类型，目前有两种资源类型。即METHOD与URL两种
	private String res_string;	//资源字符串
	private Integer priority;	//资源显示的优先值
	private String descn;		//资源在授权时显示的中文汉字
	private Boolean display;	//是否显示在授权页面
	private List<Role> roles;	//能访问此资源的角色
	private Menu menu;			//资源所属的菜单
	
	//临时变量，满足业务需求
	private String ruName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public String getRes_type() {
		return res_type;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public void setRes_type(String res_type) {
		this.res_type = res_type;
	}
	public String getRes_string() {
		return res_string;
	}
	public void setRes_string(String res_string) {
		this.res_string = res_string;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getDescn() {
		return descn;
	}
	public void setDescn(String descn) {
		this.descn = descn;
	}
	public String getRuName() {
		return ruName;
	}
	public void setRuName(String ruName) {
		this.ruName = ruName;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "name："+this.name+"res_url："+this.res_string+"res_type："+this.res_type;
	}
	public Boolean getDisplay() {
		return display;
	}
	public void setDisplay(Boolean display) {
		this.display = display;
	}
}
