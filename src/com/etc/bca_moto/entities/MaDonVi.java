package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MaDonViDAO;
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
 * MaDonVi
 */
@DAO(daoClass = MaDonViDAO.class)
@Caption("{%maDvCap1}")
@Entity
@Table(name = "MA_DON_VI", schema = "BCA_MOTO")
public class MaDonVi implements java.io.Serializable {

	private long id;
	private String maDvCap1;
	private String maDvCap2;
	private String maDvCap3;
	private String maDvCap4;
	private String tenDonVi;
	private Long trangThai;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private String ghiChu;

	public MaDonVi() {
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

	@Caption("MaDvCap1")
	@Column(name = "MA_DV_CAP1", columnDefinition = "VARCHAR2", length = 10)
	public String getMaDvCap1() {
		return this.maDvCap1;
	}

	public void setMaDvCap1(String maDvCap1) {
		this.maDvCap1 = maDvCap1;
	}

	@Caption("MaDvCap2")
	@Column(name = "MA_DV_CAP2", columnDefinition = "VARCHAR2", length = 10)
	public String getMaDvCap2() {
		return this.maDvCap2;
	}

	public void setMaDvCap2(String maDvCap2) {
		this.maDvCap2 = maDvCap2;
	}

	@Caption("MaDvCap3")
	@Column(name = "MA_DV_CAP3", columnDefinition = "VARCHAR2", length = 10)
	public String getMaDvCap3() {
		return this.maDvCap3;
	}

	public void setMaDvCap3(String maDvCap3) {
		this.maDvCap3 = maDvCap3;
	}

	@Caption("MaDvCap4")
	@Column(name = "MA_DV_CAP4", columnDefinition = "VARCHAR2", length = 10)
	public String getMaDvCap4() {
		return this.maDvCap4;
	}

	public void setMaDvCap4(String maDvCap4) {
		this.maDvCap4 = maDvCap4;
	}

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 500)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 10, scale = 0)
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
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
