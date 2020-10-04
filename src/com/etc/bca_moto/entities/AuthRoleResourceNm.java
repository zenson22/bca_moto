package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuthRoleResourceNmDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AuthRoleResourceNm
 */
@DAO(daoClass = AuthRoleResourceNmDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "AUTH_ROLE_RESOURCE_NM", schema = "BCA_MOTO")
public class AuthRoleResourceNm implements java.io.Serializable {

	private AuthRoleResourceNmId id;
	private Date updataDate;

	public AuthRoleResourceNm() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)),
			@AttributeOverride(name = "resourceId", column = @Column(name = "RESOURCE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)) })
	public AuthRoleResourceNmId getId() {
		return this.id;
	}

	public void setId(AuthRoleResourceNmId id) {
		this.id = id;
	}

	@Caption("UpdataDate")
	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATA_DATE", columnDefinition = "DATE", length = 7)
	public Date getUpdataDate() {
		return this.updataDate;
	}

	public void setUpdataDate(Date updataDate) {
		this.updataDate = updataDate;
	}

}
