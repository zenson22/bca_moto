package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DiaDiemNopPhatDAO;
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
 * DiaDiemNopPhat
 */
@DAO(daoClass = DiaDiemNopPhatDAO.class)
@Caption("{%diaDanhHc}")
@Entity
@Table(name = "DIA_DIEM_NOP_PHAT", schema = "BCA_MOTO")
public class DiaDiemNopPhat implements java.io.Serializable {

	private long id;
	private String diaDanhHc;
	private long diaDanhHcId;
	private Long diaDanhHcChaId;
	private String tenDiaDiem;
	private String diaChi;
	private String tenNganHang;
	private String tenVietTat;
	private String ghiChu;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;

	public DiaDiemNopPhat() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("DiaDanhHc")
	@Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Caption("DiaDanhHcChaId")
	@Column(name = "DIA_DANH_HC_CHA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcChaId() {
		return this.diaDanhHcChaId;
	}

	public void setDiaDanhHcChaId(Long diaDanhHcChaId) {
		this.diaDanhHcChaId = diaDanhHcChaId;
	}

	@Caption("TenDiaDiem")
	@Column(name = "TEN_DIA_DIEM", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getTenDiaDiem() {
		return this.tenDiaDiem;
	}

	public void setTenDiaDiem(String tenDiaDiem) {
		this.tenDiaDiem = tenDiaDiem;
	}

	@Caption("DiaChi")
	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 500)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Caption("TenNganHang")
	@Column(name = "TEN_NGAN_HANG", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNganHang() {
		return this.tenNganHang;
	}

	public void setTenNganHang(String tenNganHang) {
		this.tenNganHang = tenNganHang;
	}

	@Caption("TenVietTat")
	@Column(name = "TEN_VIET_TAT", columnDefinition = "VARCHAR2", length = 50)
	public String getTenVietTat() {
		return this.tenVietTat;
	}

	public void setTenVietTat(String tenVietTat) {
		this.tenVietTat = tenVietTat;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
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

}
