package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LinhVucHoatDongDnDAO;
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
 * LinhVucHoatDongDn
 */
@DAO(daoClass = LinhVucHoatDongDnDAO.class)
@Caption("{%cap1}")
@Entity
@Table(name = "LINH_VUC_HOAT_DONG_DN", schema = "BCA_MOTO")
public class LinhVucHoatDongDn implements java.io.Serializable {

	private long id;
	private String cap1;
	private String cap2;
	private String cap3;
	private String cap4;
	private String cap5;
	private String tenNganh;
	private String moTaChiTiet;
	private String ghiChu;
	private String nguoiTao;
	private Long nguoiTaoId;
	private Date ngayTao;
	private String nguoiSua;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Long trangThai;

	public LinhVucHoatDongDn() {
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

	@Caption("Cap1")
	@Column(name = "CAP_1", columnDefinition = "VARCHAR2", length = 2)
	public String getCap1() {
		return this.cap1;
	}

	public void setCap1(String cap1) {
		this.cap1 = cap1;
	}

	@Caption("Cap2")
	@Column(name = "CAP_2", columnDefinition = "VARCHAR2", length = 5)
	public String getCap2() {
		return this.cap2;
	}

	public void setCap2(String cap2) {
		this.cap2 = cap2;
	}

	@Caption("Cap3")
	@Column(name = "CAP_3", columnDefinition = "VARCHAR2", length = 10)
	public String getCap3() {
		return this.cap3;
	}

	public void setCap3(String cap3) {
		this.cap3 = cap3;
	}

	@Caption("Cap4")
	@Column(name = "CAP_4", columnDefinition = "VARCHAR2", length = 10)
	public String getCap4() {
		return this.cap4;
	}

	public void setCap4(String cap4) {
		this.cap4 = cap4;
	}

	@Caption("Cap5")
	@Column(name = "CAP_5", columnDefinition = "VARCHAR2", length = 20)
	public String getCap5() {
		return this.cap5;
	}

	public void setCap5(String cap5) {
		this.cap5 = cap5;
	}

	@Caption("TenNganh")
	@Column(name = "TEN_NGANH", nullable = false, columnDefinition = "VARCHAR2", length = 800)
	public String getTenNganh() {
		return this.tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	@Caption("MoTaChiTiet")
	@Column(name = "MO_TA_CHI_TIET", columnDefinition = "VARCHAR2", length = 200)
	public String getMoTaChiTiet() {
		return this.moTaChiTiet;
	}

	public void setMoTaChiTiet(String moTaChiTiet) {
		this.moTaChiTiet = moTaChiTiet;
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
	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

}
