package com.etc.bca_moto.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.etc.bca_moto.dal.AuthRoleDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * AuthRole
 */
@DAO(daoClass = AuthRoleDAO.class)
@Caption("{%name}")
@Entity
@Table(name = "AUTH_ROLE", schema = "BCA_MOTO")
public class AuthRole implements java.io.Serializable {

	private long id;
	private String name;
	private String description;
	private String usersId;
	private Date updateDate;
	private Long groupRole;
	private Set<AuthRolePermission> authRolePermissions = new HashSet<>(0);

	public AuthRole() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	@Caption("Name")
	@Column(name = "NAME", columnDefinition = "VARCHAR2", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Caption("Description")
	@Column(name = "DESCRIPTION", columnDefinition = "VARCHAR2", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Caption("UsersId")
	@Column(name = "USERS_ID", columnDefinition = "VARCHAR2", length = 50)
	public String getUsersId() {
		return this.usersId;
	}

	public void setUsersId(final String usersId) {
		this.usersId = usersId;
	}

	@Caption("UpdateDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_DATE", columnDefinition = "DATE", length = 7)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(final Date updateDate) {
		this.updateDate = updateDate;
	}

	@Caption("GroupRole")
	@Column(name = "GROUP_ROLE", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getGroupRole() {
		return this.groupRole;
	}

	public void setGroupRole(final Long groupRole) {
		this.groupRole = groupRole;
	}

	@Caption("AuthRolePermissions")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "authRole")
	public Set<AuthRolePermission> getAuthRolePermissions() {
		return this.authRolePermissions;
	}

	public void setAuthRolePermissions(final Set<AuthRolePermission> authRolePermissions) {
		this.authRolePermissions = authRolePermissions;
	}

}