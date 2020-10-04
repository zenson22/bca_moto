package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbXacMinh44DAO;
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
 * BbXacMinh44
 */
@DAO(daoClass = BbXacMinh44DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BB_XAC_MINH_44", schema = "BCA_MOTO")
public class BbXacMinh44 implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private String gioLap;
	private String phutLap;
	private String diaDiemLap;
	private String canBoLap1;
	private String canBoLap2;
	private String capBacChucVu1;
	private String capBacChucVu2;
	private String donVi1;
	private String donVi2;
	private String tenNguoiXm;
	private Date ngaySinhXm;
	private String quocTichXm;
	private String ngheNghiepXm;
	private String diaChiXm;
	private String soCmndXm;
	private Date ngayCapCmndXm;
	private String noiCapCmndXm;
	private String soDienThoaiXm;
	private String noiDungXm;
	private String gioLapXong;
	private String phutLapXong;
	private String nguoiDuocXm;
	private String nguoiChungKien;
	private String nguoiLapBb;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private Date ngaySinhCk;
	private String quocTichCk;
	private String ngheNghiepCk;
	private String soCmndCk;
	private Date ngayCapCmndCk;
	private String noiCapCmndCk;
	private String soDienThoaiCk;
	private String tenCqCapTren;
	private String tenDonVi;
	private String diaChiCk;

	public BbXacMinh44() {
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

	@Caption("SoBienBan")
	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(String soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Caption("DonViCanhsatGtId")
	@Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCanhsatGtId() {
		return this.donViCanhsatGtId;
	}

	public void setDonViCanhsatGtId(Long donViCanhsatGtId) {
		this.donViCanhsatGtId = donViCanhsatGtId;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Caption("NgayLapBb")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(Date ngayLapBb) {
		this.ngayLapBb = ngayLapBb;
	}

	@Caption("GioLap")
	@Column(name = "GIO_LAP", columnDefinition = "VARCHAR2", length = 2)
	public String getGioLap() {
		return this.gioLap;
	}

	public void setGioLap(String gioLap) {
		this.gioLap = gioLap;
	}

	@Caption("PhutLap")
	@Column(name = "PHUT_LAP", columnDefinition = "VARCHAR2", length = 2)
	public String getPhutLap() {
		return this.phutLap;
	}

	public void setPhutLap(String phutLap) {
		this.phutLap = phutLap;
	}

	@Caption("DiaDiemLap")
	@Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaDiemLap() {
		return this.diaDiemLap;
	}

	public void setDiaDiemLap(String diaDiemLap) {
		this.diaDiemLap = diaDiemLap;
	}

	@Caption("CanBoLap1")
	@Column(name = "CAN_BO_LAP1", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLap1() {
		return this.canBoLap1;
	}

	public void setCanBoLap1(String canBoLap1) {
		this.canBoLap1 = canBoLap1;
	}

	@Caption("CanBoLap2")
	@Column(name = "CAN_BO_LAP2", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLap2() {
		return this.canBoLap2;
	}

	public void setCanBoLap2(String canBoLap2) {
		this.canBoLap2 = canBoLap2;
	}

	@Caption("CapBacChucVu1")
	@Column(name = "CAP_BAC_CHUC_VU_1", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu1() {
		return this.capBacChucVu1;
	}

	public void setCapBacChucVu1(String capBacChucVu1) {
		this.capBacChucVu1 = capBacChucVu1;
	}

	@Caption("CapBacChucVu2")
	@Column(name = "CAP_BAC_CHUC_VU_2", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu2() {
		return this.capBacChucVu2;
	}

	public void setCapBacChucVu2(String capBacChucVu2) {
		this.capBacChucVu2 = capBacChucVu2;
	}

	@Caption("DonVi1")
	@Column(name = "DON_VI_1", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi1() {
		return this.donVi1;
	}

	public void setDonVi1(String donVi1) {
		this.donVi1 = donVi1;
	}

	@Caption("DonVi2")
	@Column(name = "DON_VI_2", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi2() {
		return this.donVi2;
	}

	public void setDonVi2(String donVi2) {
		this.donVi2 = donVi2;
	}

	@Caption("TenNguoiXm")
	@Column(name = "TEN_NGUOI_XM", columnDefinition = "VARCHAR2", length = 50)
	public String getTenNguoiXm() {
		return this.tenNguoiXm;
	}

	public void setTenNguoiXm(String tenNguoiXm) {
		this.tenNguoiXm = tenNguoiXm;
	}

	@Caption("NgaySinhXm")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SINH_XM", columnDefinition = "DATE", length = 7)
	public Date getNgaySinhXm() {
		return this.ngaySinhXm;
	}

	public void setNgaySinhXm(Date ngaySinhXm) {
		this.ngaySinhXm = ngaySinhXm;
	}

	@Caption("QuocTichXm")
	@Column(name = "QUOC_TICH_XM", columnDefinition = "VARCHAR2", length = 50)
	public String getQuocTichXm() {
		return this.quocTichXm;
	}

	public void setQuocTichXm(String quocTichXm) {
		this.quocTichXm = quocTichXm;
	}

	@Caption("NgheNghiepXm")
	@Column(name = "NGHE_NGHIEP_XM", columnDefinition = "VARCHAR2", length = 50)
	public String getNgheNghiepXm() {
		return this.ngheNghiepXm;
	}

	public void setNgheNghiepXm(String ngheNghiepXm) {
		this.ngheNghiepXm = ngheNghiepXm;
	}

	@Caption("DiaChiXm")
	@Column(name = "DIA_CHI_XM", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiXm() {
		return this.diaChiXm;
	}

	public void setDiaChiXm(String diaChiXm) {
		this.diaChiXm = diaChiXm;
	}

	@Caption("SoCmndXm")
	@Column(name = "SO_CMND_XM", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndXm() {
		return this.soCmndXm;
	}

	public void setSoCmndXm(String soCmndXm) {
		this.soCmndXm = soCmndXm;
	}

	@Caption("NgayCapCmndXm")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP_CMND_XM", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmndXm() {
		return this.ngayCapCmndXm;
	}

	public void setNgayCapCmndXm(Date ngayCapCmndXm) {
		this.ngayCapCmndXm = ngayCapCmndXm;
	}

	@Caption("NoiCapCmndXm")
	@Column(name = "NOI_CAP_CMND_XM", columnDefinition = "VARCHAR2", length = 150)
	public String getNoiCapCmndXm() {
		return this.noiCapCmndXm;
	}

	public void setNoiCapCmndXm(String noiCapCmndXm) {
		this.noiCapCmndXm = noiCapCmndXm;
	}

	@Caption("SoDienThoaiXm")
	@Column(name = "SO_DIEN_THOAI_XM", columnDefinition = "VARCHAR2", length = 15)
	public String getSoDienThoaiXm() {
		return this.soDienThoaiXm;
	}

	public void setSoDienThoaiXm(String soDienThoaiXm) {
		this.soDienThoaiXm = soDienThoaiXm;
	}

	@Caption("NoiDungXm")
	@Column(name = "NOI_DUNG_XM", columnDefinition = "VARCHAR2", length = 4000)
	public String getNoiDungXm() {
		return this.noiDungXm;
	}

	public void setNoiDungXm(String noiDungXm) {
		this.noiDungXm = noiDungXm;
	}

	@Caption("GioLapXong")
	@Column(name = "GIO_LAP_XONG", columnDefinition = "VARCHAR2", length = 2)
	public String getGioLapXong() {
		return this.gioLapXong;
	}

	public void setGioLapXong(String gioLapXong) {
		this.gioLapXong = gioLapXong;
	}

	@Caption("PhutLapXong")
	@Column(name = "PHUT_LAP_XONG", columnDefinition = "VARCHAR2", length = 20)
	public String getPhutLapXong() {
		return this.phutLapXong;
	}

	public void setPhutLapXong(String phutLapXong) {
		this.phutLapXong = phutLapXong;
	}

	@Caption("NguoiDuocXm")
	@Column(name = "NGUOI_DUOC_XM", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiDuocXm() {
		return this.nguoiDuocXm;
	}

	public void setNguoiDuocXm(String nguoiDuocXm) {
		this.nguoiDuocXm = nguoiDuocXm;
	}

	@Caption("NguoiChungKien")
	@Column(name = "NGUOI_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiChungKien() {
		return this.nguoiChungKien;
	}

	public void setNguoiChungKien(String nguoiChungKien) {
		this.nguoiChungKien = nguoiChungKien;
	}

	@Caption("NguoiLapBb")
	@Column(name = "NGUOI_LAP_BB", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiLapBb() {
		return this.nguoiLapBb;
	}

	public void setNguoiLapBb(String nguoiLapBb) {
		this.nguoiLapBb = nguoiLapBb;
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

	@Caption("CbxlId")
	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
	}

	@Caption("IdNam")
	@Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdNam() {
		return this.idNam;
	}

	public void setIdNam(Long idNam) {
		this.idNam = idNam;
	}

	@Caption("TinhThanhPhoId")
	@Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTinhThanhPhoId() {
		return this.tinhThanhPhoId;
	}

	public void setTinhThanhPhoId(Long tinhThanhPhoId) {
		this.tinhThanhPhoId = tinhThanhPhoId;
	}

	@Caption("NamTaoQd")
	@Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamTaoQd() {
		return this.namTaoQd;
	}

	public void setNamTaoQd(Long namTaoQd) {
		this.namTaoQd = namTaoQd;
	}

	@Caption("NhapBb")
	@Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapBb() {
		return this.nhapBb;
	}

	public void setNhapBb(Long nhapBb) {
		this.nhapBb = nhapBb;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NgaySinhCk")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SINH_CK", columnDefinition = "DATE", length = 7)
	public Date getNgaySinhCk() {
		return this.ngaySinhCk;
	}

	public void setNgaySinhCk(Date ngaySinhCk) {
		this.ngaySinhCk = ngaySinhCk;
	}

	@Caption("QuocTichCk")
	@Column(name = "QUOC_TICH_CK", columnDefinition = "VARCHAR2", length = 50)
	public String getQuocTichCk() {
		return this.quocTichCk;
	}

	public void setQuocTichCk(String quocTichCk) {
		this.quocTichCk = quocTichCk;
	}

	@Caption("NgheNghiepCk")
	@Column(name = "NGHE_NGHIEP_CK", columnDefinition = "VARCHAR2", length = 50)
	public String getNgheNghiepCk() {
		return this.ngheNghiepCk;
	}

	public void setNgheNghiepCk(String ngheNghiepCk) {
		this.ngheNghiepCk = ngheNghiepCk;
	}

	@Caption("SoCmndCk")
	@Column(name = "SO_CMND_CK", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndCk() {
		return this.soCmndCk;
	}

	public void setSoCmndCk(String soCmndCk) {
		this.soCmndCk = soCmndCk;
	}

	@Caption("NgayCapCmndCk")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP_CMND_CK", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmndCk() {
		return this.ngayCapCmndCk;
	}

	public void setNgayCapCmndCk(Date ngayCapCmndCk) {
		this.ngayCapCmndCk = ngayCapCmndCk;
	}

	@Caption("NoiCapCmndCk")
	@Column(name = "NOI_CAP_CMND_CK", columnDefinition = "VARCHAR2", length = 150)
	public String getNoiCapCmndCk() {
		return this.noiCapCmndCk;
	}

	public void setNoiCapCmndCk(String noiCapCmndCk) {
		this.noiCapCmndCk = noiCapCmndCk;
	}

	@Caption("SoDienThoaiCk")
	@Column(name = "SO_DIEN_THOAI_CK", columnDefinition = "VARCHAR2", length = 15)
	public String getSoDienThoaiCk() {
		return this.soDienThoaiCk;
	}

	public void setSoDienThoaiCk(String soDienThoaiCk) {
		this.soDienThoaiCk = soDienThoaiCk;
	}

	@Caption("TenCqCapTren")
	@Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 50)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("DiaChiCk")
	@Column(name = "DIA_CHI_CK", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiCk() {
		return this.diaChiCk;
	}

	public void setDiaChiCk(String diaChiCk) {
		this.diaChiCk = diaChiCk;
	}

}
