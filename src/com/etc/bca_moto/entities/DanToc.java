package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DanTocDAO;
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
 * DanToc
 */
@DAO(daoClass = DanTocDAO.class)
@Caption("{%ten}")
@Entity
@Table(name = "DAN_TOC", schema = "BCA_MOTO")
public class DanToc implements java.io.Serializable {

	private long id;
	private String ten;
	private String ma;
	private String tenKhac;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private String ghiChu;

	public DanToc() {
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

	@Caption("Ten")
	@Column(name = "TEN", columnDefinition = "VARCHAR2", length = 1020)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 40)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("TenKhac")
	@Column(name = "TEN_KHAC", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenKhac() {
		return this.tenKhac;
	}

	public void setTenKhac(String tenKhac) {
		this.tenKhac = tenKhac;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)
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

	@Caption("TrangThaiKichHoat")
	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 500)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
