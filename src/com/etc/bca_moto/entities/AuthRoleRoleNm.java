package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuthRoleRoleNmDAO;
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
 * AuthRoleRoleNm
 */
@DAO(daoClass = AuthRoleRoleNmDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "AUTH_ROLE_ROLE_NM", schema = "BCA_MOTO")
public class AuthRoleRoleNm implements java.io.Serializable {

	private AuthRoleRoleNmId id;
	private Date updataDate;

	public AuthRoleRoleNm() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "childRoleId", column = @Column(name = "CHILD_ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)),
			@AttributeOverride(name = "parentRoleId", column = @Column(name = "PARENT_ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)) })
	public AuthRoleRoleNmId getId() {
		return this.id;
	}

	public void setId(AuthRoleRoleNmId id) {
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
