package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.AuthGroupGroupNmDAO;
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
 * AuthGroupGroupNm
 */
@DAO(daoClass = AuthGroupGroupNmDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "AUTH_GROUP_GROUP_NM", schema = "BCA_MOTO")
public class AuthGroupGroupNm implements java.io.Serializable {

	private AuthGroupGroupNmId id;
	private Date updataDate;

	public AuthGroupGroupNm() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "childGroupId", column = @Column(name = "CHILD_GROUP_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)),
			@AttributeOverride(name = "parentGroupId", column = @Column(name = "PARENT_GROUP_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)) })
	public AuthGroupGroupNmId getId() {
		return this.id;
	}

	public void setId(AuthGroupGroupNmId id) {
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
