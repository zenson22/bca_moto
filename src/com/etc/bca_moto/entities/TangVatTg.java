package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TangVatTgDAO;
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
 * TangVatTg
 */
@DAO(daoClass = TangVatTgDAO.class)
@Caption("{%tenTangVat}")
@Entity
@Table(name = "TANG_VAT_TG", schema = "BCA_MOTO")
public class TangVatTg implements java.io.Serializable {

	private long id;
	private String tenTangVat;
	private String moTa;
	private String ghiChu;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Set<NoicapGiayto> noicapGiaytos = new HashSet<NoicapGiayto>(0);

	public TangVatTg() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("TenTangVat")
	@Column(name = "TEN_TANG_VAT", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTenTangVat() {
		return this.tenTangVat;
	}

	public void setTenTangVat(String tenTangVat) {
		this.tenTangVat = tenTangVat;
	}

	@Caption("MoTa")
	@Column(name = "MO_TA", columnDefinition = "VARCHAR2", length = 100)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
		this.nguoiTao = nguoiTao;
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

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Caption("NgaySua")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Caption("NoicapGiaytos")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tangVatTg")
	public Set<NoicapGiayto> getNoicapGiaytos() {
		return this.noicapGiaytos;
	}

	public void setNoicapGiaytos(Set<NoicapGiayto> noicapGiaytos) {
		this.noicapGiaytos = noicapGiaytos;
	}

}
