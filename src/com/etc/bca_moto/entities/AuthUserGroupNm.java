package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuthUserGroupNmDAO;
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
 * AuthUserGroupNm
 */
@DAO(daoClass = AuthUserGroupNmDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "AUTH_USER_GROUP_NM", schema = "BCA_MOTO")
public class AuthUserGroupNm implements java.io.Serializable {

	private AuthUserGroupNmId id;
	private Date updataDate;

	public AuthUserGroupNm() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "userId", column = @Column(name = "USER_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)),
			@AttributeOverride(name = "groupId", column = @Column(name = "GROUP_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)) })
	public AuthUserGroupNmId getId() {
		return this.id;
	}

	public void setId(AuthUserGroupNmId id) {
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
