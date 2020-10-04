package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.CapBacDAO;
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
 * CapBac
 */
@DAO(daoClass = CapBacDAO.class)
@Caption("{%tenCapBac}")
@Entity
@Table(name = "CAP_BAC", schema = "BCA_MOTO")
public class CapBac implements java.io.Serializable {

	private long id;
	private String tenCapBac;
	private String cap;
	private Long nguoiTaoId;
	private Date ngayTao;

	public CapBac() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("TenCapBac")
	@Column(name = "TEN_CAP_BAC", columnDefinition = "VARCHAR2", length = 200)
	public String getTenCapBac() {
		return this.tenCapBac;
	}

	public void setTenCapBac(String tenCapBac) {
		this.tenCapBac = tenCapBac;
	}

	@Caption("Cap")
	@Column(name = "CAP", columnDefinition = "VARCHAR2", length = 100)
	public String getCap() {
		return this.cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

}
