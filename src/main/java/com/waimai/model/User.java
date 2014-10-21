package com.waimai.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

public class User extends IdEntity implements UserDetails{
	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -2414711442165502235L;
	private String realName;			//真实姓名
	private String username;			//用户名
	private String password;			//密码
	private boolean enabled;			//账号是否可用  true为可用，false不可用
	private boolean accountNonLocked;	//账号是否被锁！true为没锁，false为已锁
	private Date lastCloseDate;			//最近一次禁用或者注销时间
	private String email;				//邮箱
	private String mobile;				//手机号码
	private Date createTime;			//创建时间
	private Integer score;				//积分
	
	/**
	 * 所属角色
	 */
	private Set<Role> roles;	
	
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public Collection<GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> ga = new ArrayList<GrantedAuthority>();
		if(roles!=null){
			for(Role r:roles){
				ga.add(new GrantedAuthorityImpl(r.getName()));
			}
		}
		return ga;
	}

	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public boolean isAccountNonExpired() {
		return true;
	}
	
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	public boolean isCredentialsNonExpired() {
		return true;
	}

	public boolean isEnabled() {
		return enabled;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}
	public boolean getEnabled() {
		return enabled;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User){
			User u = (User)obj;
			return (u.id==id)?true:false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.intValue();
	}
	
	@Override
	public String toString() {
		return "id: "+this.id+" "+"name: "+this.username+" "+"realName: "+this.realName;
	}
	
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	
	public boolean getAccountNonLocked() {
		return accountNonLocked;
	}
	
	public Date getLastCloseDate() {
		return lastCloseDate;
	}
	public void setLastCloseDate(Date lastCloseDate) {
		this.lastCloseDate = lastCloseDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
}
