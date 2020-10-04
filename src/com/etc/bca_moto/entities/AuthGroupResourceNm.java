package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuthGroupResourceNmDAO;
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
 * AuthGroupResourceNm
 */
@DAO(daoClass = AuthGroupResourceNmDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "AUTH_GROUP_RESOURCE_NM", schema = "BCA_MOTO")
public class AuthGroupResourceNm implements java.io.Serializable {

	private AuthGroupResourceNmId id;
	private Date updataDate;

	public AuthGroupResourceNm() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "groupId", column = @Column(name = "GROUP_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)),
			@AttributeOverride(name = "resourceId", column = @Column(name = "RESOURCE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)) })
	public AuthGroupResourceNmId getId() {
		return this.id;
	}

	public void setId(AuthGroupResourceNmId id) {
		this.id = id;
	}

	@Caption("UpdataDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATA_DATE", columnDefinition = "TIMESTAMP(6)")
	public Date getUpdataDate() {
		return this.updataDate;
	}

	public void setUpdataDate(Date updataDate) {
		this.updataDate = updataDate;
	}

}
