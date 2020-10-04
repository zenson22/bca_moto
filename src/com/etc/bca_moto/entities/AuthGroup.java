package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuthGroupDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * AuthGroup
 */
@DAO(daoClass = AuthGroupDAO.class)
@Caption("{%status}")
@Entity
@Table(name = "AUTH_GROUP", schema = "BCA_MOTO")
public class AuthGroup implements java.io.Serializable {

	private long id;
	private String status;
	private String name;
	private String description;
	private Date updateDate;
	private Long roleId;
	private String usersId;
	private Long groupRole;

	public AuthGroup() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("Status")
	@Column(name = "STATUS", columnDefinition = "NVARCHAR2", length = 40)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Caption("Name")
	@Column(name = "NAME", columnDefinition = "NVARCHAR2", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Caption("Description")
	@Column(name = "DESCRIPTION", columnDefinition = "NVARCHAR2", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Caption("UpdateDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_DATE", columnDefinition = "DATE", length = 7)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Caption("RoleId")
	@Column(name = "ROLE_ID", columnDefinition = "NUMBER", precision = 6, scale = 0)
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Caption("UsersId")
	@Column(name = "USERS_ID", columnDefinition = "NVARCHAR2", length = 40)
	public String getUsersId() {
		return this.usersId;
	}

	public void setUsersId(String usersId) {
		this.usersId = usersId;
	}

	@Caption("GroupRole")
	@Column(name = "GROUP_ROLE", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getGroupRole() {
		return this.groupRole;
	}

	public void setGroupRole(Long groupRole) {
		this.groupRole = groupRole;
	}

}
