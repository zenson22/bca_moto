package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuthRolePermissionDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;

/**
 * AuthRolePermission
 */
@DAO(daoClass = AuthRolePermissionDAO.class)
@Caption("{%resourceName}")
@Entity
@Table(name = "AUTH_ROLE_PERMISSIONS", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = { "ID",
		"ROLE_ID", "RESOURCE_NAME" }))
public class AuthRolePermission implements java.io.Serializable {

	private long id;
	private AuthRole authRole;
	private String resourceName;
	private long activity;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;

	public AuthRolePermission() {
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

	@Caption("AuthRole")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ROLE_ID", nullable = false, columnDefinition = "NUMBER")
	public AuthRole getAuthRole() {
		return this.authRole;
	}

	public void setAuthRole(AuthRole authRole) {
		this.authRole = authRole;
	}

	@Caption("ResourceName")
	@Column(name = "RESOURCE_NAME", nullable = false, columnDefinition = "VARCHAR2", length = 800)
	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	@Caption("Activity")
	@Column(name = "ACTIVITY", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getActivity() {
		return this.activity;
	}

	public void setActivity(long activity) {
		this.activity = activity;
	}

	@Caption("CreatedBy")
	@Column(name = "CREATED_BY", columnDefinition = "VARCHAR2", length = 200)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Caption("CreatedDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", columnDefinition = "TIMESTAMP(6) WITH TIME ZONE")
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Caption("UpdatedBy")
	@Column(name = "UPDATED_BY", columnDefinition = "VARCHAR2", length = 200)
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Caption("UpdatedDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", columnDefinition = "TIMESTAMP(6) WITH TIME ZONE")
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
