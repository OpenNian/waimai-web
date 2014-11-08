package com.waimai.model.message;

import java.io.Serializable;
import java.util.Date;

import com.waimai.model.IdEntity;
/**
 * ClassName: Dish
 * Desc: 短信实体类
 * date: 2014-9-22 下午2:27:16
 * @author li.n1 
 * @since JDK 1.6
 */
public class Message extends IdEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 表主键id 
	 */
    private String MesageId;
    
	/**
     * 订单编号
     *  
     */
    private String Orgid;
	/**
     * 联系电话 
     */
    private String telephone;
    /**
     * 短信内容 
     * 
     */
    private String content;
    /**
	 * 短信发送时间
	 */
	private Date createTime;
    
   
	public String getOrgid() {
		return Orgid;
	}
	public void setOrgid(String orgid) {
		Orgid = orgid;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getMesageId() {
		return MesageId;
	}
	public void setMesageId(String mesageId) {
		MesageId = mesageId;
	}
}
