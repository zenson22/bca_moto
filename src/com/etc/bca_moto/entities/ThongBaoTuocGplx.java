package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ThongBaoTuocGplxDAO;
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
 * ThongBaoTuocGplx
 */
@DAO(daoClass = ThongBaoTuocGplxDAO.class)
@Caption("{%soThongBao}")
@Entity
@Table(name = "THONG_BAO_TUOC_GPLX", schema = "BCA_MOTO")
public class ThongBaoTuocGplx implements java.io.Serializable {

	private long id;
	private Long idTheoDonVi;
	private String soThongBao;
	private Long nam;
	private Long qd02Id;
	private Long bb43Id;
	private Long donViNhan;
	private String hanhViViPham;
	private Long nghiDinh;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private String noiSinh;
	private String dieu;
	private String khoan;
	private String diem;
	private String soNghiDinh;
	private Date ngayHieuLucNdinh;
	private String donViCap;
	private String soThangTuoc;
	private String loaiGiayToTuoc;
	private String soGiayTo;
	private Date ngayCapGiayTo;
	private Date ngayRaQd;
	private Date ngayRaTb;
	private String ngaySinh;
	private String thangSinh;
	private String namSinh;
	private String tuocTuNgay;
	private String tuocDenNgay;

	public ThongBaoTuocGplx() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("IdTheoDonVi")
	@Column(name = "ID_THEO_DON_VI", columnDefinition = "NUMBER", precision = 38, scale = 0)
	public Long getIdTheoDonVi() {
		return this.idTheoDonVi;
	}

	public void setIdTheoDonVi(Long idTheoDonVi) {
		this.idTheoDonVi = idTheoDonVi;
	}

	@Caption("SoThongBao")
	@Column(name = "SO_THONG_BAO", columnDefinition = "VARCHAR2", length = 20)
	public String getSoThongBao() {
		return this.soThongBao;
	}

	public void setSoThongBao(String soThongBao) {
		this.soThongBao = soThongBao;
	}

	@Caption("Nam")
	@Column(name = "NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNam() {
		return this.nam;
	}

	public void setNam(Long nam) {
		this.nam = nam;
	}

	@Caption("Qd02Id")
	@Column(name = "QD02_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd02Id() {
		return this.qd02Id;
	}

	public void setQd02Id(Long qd02Id) {
		this.qd02Id = qd02Id;
	}

	@Caption("Bb43Id")
	@Column(name = "BB43_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBb43Id() {
		return this.bb43Id;
	}

	public void setBb43Id(Long bb43Id) {
		this.bb43Id = bb43Id;
	}

	@Caption("DonViNhan")
	@Column(name = "DON_VI_NHAN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViNhan() {
		return this.donViNhan;
	}

	public void setDonViNhan(Long donViNhan) {
		this.donViNhan = donViNhan;
	}

	@Caption("HanhViViPham")
	@Column(name = "HANH_VI_VI_PHAM", columnDefinition = "VARCHAR2", length = 1000)
	public String getHanhViViPham() {
		return this.hanhViViPham;
	}

	public void setHanhViViPham(String hanhViViPham) {
		this.hanhViViPham = hanhViViPham;
	}

	@Caption("NghiDinh")
	@Column(name = "NGHI_DINH", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNghiDinh() {
		return this.nghiDinh;
	}

	public void setNghiDinh(Long nghiDinh) {
		this.nghiDinh = nghiDinh;
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

	@Caption("NoiSinh")
	@Column(name = "NOI_SINH", columnDefinition = "VARCHAR2", length = 300)
	public String getNoiSinh() {
		return this.noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	@Caption("Dieu")
	@Column(name = "DIEU", columnDefinition = "VARCHAR2", length = 20)
	public String getDieu() {
		return this.dieu;
	}

	public void setDieu(String dieu) {
		this.dieu = dieu;
	}

	@Caption("Khoan")
	@Column(name = "KHOAN", columnDefinition = "VARCHAR2", length = 20)
	public String getKhoan() {
		return this.khoan;
	}

	public void setKhoan(String khoan) {
		this.khoan = khoan;
	}

	@Caption("Diem")
	@Column(name = "DIEM", columnDefinition = "VARCHAR2", length = 20)
	public String getDiem() {
		return this.diem;
	}

	public void setDiem(String diem) {
		this.diem = diem;
	}

	@Caption("SoNghiDinh")
	@Column(name = "SO_NGHI_DINH", columnDefinition = "VARCHAR2", length = 100)
	public String getSoNghiDinh() {
		return this.soNghiDinh;
	}

	public void setSoNghiDinh(String soNghiDinh) {
		this.soNghiDinh = soNghiDinh;
	}

	@Caption("NgayHieuLucNdinh")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HIEU_LUC_NDINH", columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLucNdinh() {
		return this.ngayHieuLucNdinh;
	}

	public void setNgayHieuLucNdinh(Date ngayHieuLucNdinh) {
		this.ngayHieuLucNdinh = ngayHieuLucNdinh;
	}

	@Caption("DonViCap")
	@Column(name = "DON_VI_CAP", columnDefinition = "VARCHAR2", length = 200)
	public String getDonViCap() {
		return this.donViCap;
	}

	public void setDonViCap(String donViCap) {
		this.donViCap = donViCap;
	}

	@Caption("SoThangTuoc")
	@Column(name = "SO_THANG_TUOC", columnDefinition = "VARCHAR2", length = 20)
	public String getSoThangTuoc() {
		return this.soThangTuoc;
	}

	public void setSoThangTuoc(String soThangTuoc) {
		this.soThangTuoc = soThangTuoc;
	}

	@Caption("LoaiGiayToTuoc")
	@Column(name = "LOAI_GIAY_TO_TUOC", columnDefinition = "VARCHAR2", length = 300)
	public String getLoaiGiayToTuoc() {
		return this.loaiGiayToTuoc;
	}

	public void setLoaiGiayToTuoc(String loaiGiayToTuoc) {
		this.loaiGiayToTuoc = loaiGiayToTuoc;
	}

	@Caption("SoGiayTo")
	@Column(name = "SO_GIAY_TO", columnDefinition = "VARCHAR2", length = 50)
	public String getSoGiayTo() {
		return this.soGiayTo;
	}

	public void setSoGiayTo(String soGiayTo) {
		this.soGiayTo = soGiayTo;
	}

	@Caption("NgayCapGiayTo")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP_GIAY_TO", columnDefinition = "DATE", length = 7)
	public Date getNgayCapGiayTo() {
		return this.ngayCapGiayTo;
	}

	public void setNgayCapGiayTo(Date ngayCapGiayTo) {
		this.ngayCapGiayTo = ngayCapGiayTo;
	}

	@Caption("NgayRaQd")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_RA_QD", columnDefinition = "DATE", length = 7)
	public Date getNgayRaQd() {
		return this.ngayRaQd;
	}

	public void setNgayRaQd(Date ngayRaQd) {
		this.ngayRaQd = ngayRaQd;
	}

	@Caption("NgayRaTb")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_RA_TB", columnDefinition = "DATE", length = 7)
	public Date getNgayRaTb() {
		return this.ngayRaTb;
	}

	public void setNgayRaTb(Date ngayRaTb) {
		this.ngayRaTb = ngayRaTb;
	}

	@Caption("NgaySinh")
	@Column(name = "NGAY_SINH", columnDefinition = "VARCHAR2", length = 10)
	public String getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	@Caption("ThangSinh")
	@Column(name = "THANG_SINH", columnDefinition = "VARCHAR2", length = 10)
	public String getThangSinh() {
		return this.thangSinh;
	}

	public void setThangSinh(String thangSinh) {
		this.thangSinh = thangSinh;
	}

	@Caption("NamSinh")
	@Column(name = "NAM_SINH", columnDefinition = "VARCHAR2", length = 10)
	public String getNamSinh() {
		return this.namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	@Caption("TuocTuNgay")
	@Column(name = "TUOC_TU_NGAY", columnDefinition = "VARCHAR2", length = 20)
	public String getTuocTuNgay() {
		return this.tuocTuNgay;
	}

	public void setTuocTuNgay(String tuocTuNgay) {
		this.tuocTuNgay = tuocTuNgay;
	}

	@Caption("TuocDenNgay")
	@Column(name = "TUOC_DEN_NGAY", columnDefinition = "VARCHAR2", length = 20)
	public String getTuocDenNgay() {
		return this.tuocDenNgay;
	}

	public void setTuocDenNgay(String tuocDenNgay) {
		this.tuocDenNgay = tuocDenNgay;
	}

}
