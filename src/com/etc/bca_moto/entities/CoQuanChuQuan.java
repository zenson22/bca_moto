package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.CoQuanChuQuanDAO;
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
 * CoQuanChuQuan
 */
@DAO(daoClass = CoQuanChuQuanDAO.class)
@Caption("{%tenCoQuan}")
@Entity
@Table(name = "CO_QUAN_CHU_QUAN", schema = "BCA_MOTO")
public class CoQuanChuQuan implements java.io.Serializable {

	private long id;
	private long maCoQuan;
	private String tenCoQuan;
	private long dvCsgtCaptrenId;
	private long diadanhHcId;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private long trangThaiKichHoat;
	private Long capDonVi;
	private String diaChiCoQuan;
	private String ghiChu;

	public CoQuanChuQuan() {
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

	@Caption("MaCoQuan")
	@Column(name = "MA_CO_QUAN", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getMaCoQuan() {
		return this.maCoQuan;
	}

	public void setMaCoQuan(long maCoQuan) {
		this.maCoQuan = maCoQuan;
	}

	@Caption("TenCoQuan")
	@Column(name = "TEN_CO_QUAN", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getTenCoQuan() {
		return this.tenCoQuan;
	}

	public void setTenCoQuan(String tenCoQuan) {
		this.tenCoQuan = tenCoQuan;
	}

	@Caption("DvCsgtCaptrenId")
	@Column(name = "DV_CSGT_CAPTREN_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDvCsgtCaptrenId() {
		return this.dvCsgtCaptrenId;
	}

	public void setDvCsgtCaptrenId(long dvCsgtCaptrenId) {
		this.dvCsgtCaptrenId = dvCsgtCaptrenId;
	}

	@Caption("DiadanhHcId")
	@Column(name = "DIADANH_HC_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDiadanhHcId() {
		return this.diadanhHcId;
	}

	public void setDiadanhHcId(long diadanhHcId) {
		this.diadanhHcId = diadanhHcId;
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
	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(long trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Caption("CapDonVi")
	@Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapDonVi() {
		return this.capDonVi;
	}

	public void setCapDonVi(Long capDonVi) {
		this.capDonVi = capDonVi;
	}

	@Caption("DiaChiCoQuan")
	@Column(name = "DIA_CHI_CO_QUAN", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaChiCoQuan() {
		return this.diaChiCoQuan;
	}

	public void setDiaChiCoQuan(String diaChiCoQuan) {
		this.diaChiCoQuan = diaChiCoQuan;
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
