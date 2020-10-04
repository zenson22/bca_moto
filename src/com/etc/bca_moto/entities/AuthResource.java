package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuthResourceDAO;
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
 * AuthResource
 */
@DAO(daoClass = AuthResourceDAO.class)
@Caption("{%name}")
@Entity
@Table(name = "AUTH_RESOURCE", schema = "BCA_MOTO")
public class AuthResource implements java.io.Serializable {

	private long id;
	private String name;
	private String description;
	private Long refResourceId;
	private Date updateDate;

	public AuthResource() {
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

	@Caption("Name")
	@Column(name = "NAME", columnDefinition = "NVARCHAR2", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Caption("Description")
	@Column(name = "DESCRIPTION", columnDefinition = "NVARCHAR2", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Caption("RefResourceId")
	@Column(name = "REF_RESOURCE_ID", columnDefinition = "NUMBER", precision = 6, scale = 0)
	public Long getRefResourceId() {
		return this.refResourceId;
	}

	public void setRefResourceId(Long refResourceId) {
		this.refResourceId = refResourceId;
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

}
