package com.waimai.model.permission;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Role implements Serializable {
	private static final long serialVersionUID = -3498056750436845009L;
	private String name;				//角色名
	private String desc;				//角色描述
	@Deprecated
	private String marking;				//角色标识，自动生成，没有意义，可废弃
	private boolean defaultOrNo;		//是否默认角色
	private Date createDate;			//创建角色日期
	private List<User> users;			//角色下用户
	private List<Resource> resources;	//角色能操作的资源
	private List<Menu> menus;			//角色能展现的菜单
	
	
	public Role(){
	}
	
	public Role(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	//只需要设置mappedBy="games"表明role实体是关系被维护端就可以了
    //级联保存、级联删除等之类的属性在多对多关系中是不需要设置
    //不能说删了角色,把用户也删掉,用户还可以有其他的角色
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	
	@Override
	public String toString() {
		return "name:"+name+",describle:"+desc;
	}
	@Deprecated
	public String getMarking() {
		return marking;
	}
	@Deprecated
	public void setMarking(String marking) {
		this.marking = marking;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public boolean isDefaultOrNo() {
		return defaultOrNo;
	}
	public void setDefaultOrNo(boolean defaultOrNo) {
		this.defaultOrNo = defaultOrNo;
	}
	
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
