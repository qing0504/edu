package wusc.edu.facade.role.entity;

import java.util.Date;

import wusc.edu.common.entity.BaseEntity;


/**
 * @描述: 角色 .
 * @作者: WuShuicheng .
 * @创建时间: 2015-1-26,上午11:23:47 .
 * @版本号: V1.0 .
 */
public class PmsRole extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long roleId;// 角色ID
	private String roleName; // 角色名称
	private Integer status; // 状态(100:可用，101:不可用 )
	private Date createTime;// 创建时间
	private Date updateTime;// 更新时间
	private String remark; // 描述

	public Long getRoleId() {
		return roleId;
	}



	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}



	public String getRoleName() {
		return roleName;
	}



	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}



	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}



	public Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	public Date getUpdateTime() {
		return updateTime;
	}



	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}



	public String getRemark() {
		return remark;
	}



	public void setRemark(String remark) {
		this.remark = remark;
	}



	/**
	 * 描述
	 * 
	 * @return
	 */
	public PmsRole() {

	}

}
