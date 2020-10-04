package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.PhuongTienTggtDAO;
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
 * PhuongTienTggt
 */
@DAO(daoClass = PhuongTienTggtDAO.class)
@Caption("{%tenPhuongTien}")
@Entity
@Table(name = "PHUONG_TIEN_TGGT", schema = "BCA_MOTO")
public class PhuongTienTggt implements java.io.Serializable {

	private long id;
	private String tenPhuongTien;
	private String bangCapYeuCau;
	private String xeNhaNuoc;
	private String xeNgoaiGiao;
	private String yeuCauKiemDinh;
	private String ghiChu;
	private Long loaiPt;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private String ma;
	private String moTa;
	private Boolean trangThaiKichHoat;

	public PhuongTienTggt() {
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

	@Caption("TenPhuongTien")
	@Column(name = "TEN_PHUONG_TIEN", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTenPhuongTien() {
		return this.tenPhuongTien;
	}

	public void setTenPhuongTien(String tenPhuongTien) {
		this.tenPhuongTien = tenPhuongTien;
	}

	@Caption("BangCapYeuCau")
	@Column(name = "BANG_CAP_YEU_CAU", columnDefinition = "VARCHAR2", length = 50)
	public String getBangCapYeuCau() {
		return this.bangCapYeuCau;
	}

	public void setBangCapYeuCau(String bangCapYeuCau) {
		this.bangCapYeuCau = bangCapYeuCau;
	}

	@Caption("XeNhaNuoc")
	@Column(name = "XE_NHA_NUOC", columnDefinition = "VARCHAR2", length = 50)
	public String getXeNhaNuoc() {
		return this.xeNhaNuoc;
	}

	public void setXeNhaNuoc(String xeNhaNuoc) {
		this.xeNhaNuoc = xeNhaNuoc;
	}

	@Caption("XeNgoaiGiao")
	@Column(name = "XE_NGOAI_GIAO", columnDefinition = "VARCHAR2", length = 20)
	public String getXeNgoaiGiao() {
		return this.xeNgoaiGiao;
	}

	public void setXeNgoaiGiao(String xeNgoaiGiao) {
		this.xeNgoaiGiao = xeNgoaiGiao;
	}

	@Caption("YeuCauKiemDinh")
	@Column(name = "YEU_CAU_KIEM_DINH", columnDefinition = "VARCHAR2", length = 20)
	public String getYeuCauKiemDinh() {
		return this.yeuCauKiemDinh;
	}

	public void setYeuCauKiemDinh(String yeuCauKiemDinh) {
		this.yeuCauKiemDinh = yeuCauKiemDinh;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("LoaiPt")
	@Column(name = "LOAI_PT", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLoaiPt() {
		return this.loaiPt;
	}

	public void setLoaiPt(Long loaiPt) {
		this.loaiPt = loaiPt;
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

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 20)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("MoTa")
	@Column(name = "MO_TA", columnDefinition = "VARCHAR2", length = 1000)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Caption("TrangThaiKichHoat")
	@Column(name = "TRANG_THAI_KICH_HOAT", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(Boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

}
