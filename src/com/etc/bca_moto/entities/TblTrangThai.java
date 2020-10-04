package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TblTrangThaiDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
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

/**
 * TblTrangThai
 */
@DAO(daoClass = TblTrangThaiDAO.class)
@Caption("{%dscp}")
@Entity
@Table(name = "TBL_TRANG_THAI", schema = "BCA_MOTO")
public class TblTrangThai implements java.io.Serializable {

	private long id;
	private String dscp;
	private String createBy;
	private Date dtCreate;
	private String updateBy;
	private Date dtUpdate;
	private Set<QdXpvphc01> qdXpvphc01s = new HashSet<QdXpvphc01>(0);
	private Set<BienbanViphamHc> bienbanViphamHcs = new HashSet<BienbanViphamHc>(0);

	public TblTrangThai() {
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

	@Caption("Dscp")
	@Column(name = "DSCP", columnDefinition = "VARCHAR2", length = 500)
	public String getDscp() {
		return this.dscp;
	}

	public void setDscp(String dscp) {
		this.dscp = dscp;
	}

	@Caption("CreateBy")
	@Column(name = "CREATE_BY", columnDefinition = "VARCHAR2", length = 100)
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Caption("DtCreate")
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_CREATE", columnDefinition = "DATE", length = 7)
	public Date getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Caption("UpdateBy")
	@Column(name = "UPDATE_BY", columnDefinition = "VARCHAR2", length = 100)
	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Caption("DtUpdate")
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_UPDATE", columnDefinition = "DATE", length = 7)
	public Date getDtUpdate() {
		return this.dtUpdate;
	}

	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
	}

	@Caption("QdXpvphc01s")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblTrangThai")
	public Set<QdXpvphc01> getQdXpvphc01s() {
		return this.qdXpvphc01s;
	}

	public void setQdXpvphc01s(Set<QdXpvphc01> qdXpvphc01s) {
		this.qdXpvphc01s = qdXpvphc01s;
	}

	@Caption("BienbanViphamHcs")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblTrangThai")
	public Set<BienbanViphamHc> getBienbanViphamHcs() {
		return this.bienbanViphamHcs;
	}

	public void setBienbanViphamHcs(Set<BienbanViphamHc> bienbanViphamHcs) {
		this.bienbanViphamHcs = bienbanViphamHcs;
	}

}
