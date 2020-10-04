package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbGiaiTrinh45DAO;
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
 * BbGiaiTrinh45
 */
@DAO(daoClass = BbGiaiTrinh45DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BB_GIAI_TRINH_45", schema = "BCA_MOTO")
public class BbGiaiTrinh45 implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private String canCuBbVphc;
	private Date ngayLapBbVphc;
	private Date ngayGiaiTrinhTt;
	private String nguoiGiaiTrinhTt;
	private String canCuVbUyquyen;
	private String canCuThongbaoSo;
	private Date canCuThongbaoNgay;
	private String canCuThongbaoCua;
	private Date ngayLapBb;
	private String gioLap;
	private String phutLap;
	private String diaDiemLap;
	private String nguoiToChucGiaitrinh;
	private String nguoiGiaiTrinh;
	private Date ngaySinhGt;
	private String quocTichGt;
	private String ngheNghiepGt;
	private String diaChiGt;
	private String soCmndGt;
	private Date ngayCapCmndGt;
	private String noiCapCmndXm;
	private String canCuPhapLy;
	private String tinhTietChungCu;
	private String hinhThucXuPhat;
	private String YKien;
	private String gioKetThuc;
	private String phutKetThuc;
	private String canBoLap;
	private String capBacChucVu;
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
	private String tenDonVi;
	private Long soBb43Tc;

	public BbGiaiTrinh45() {
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
	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 50)
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

	@Caption("TenCqCapTren")
	@Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Caption("CanCuBbVphc")
	@Column(name = "CAN_CU_BB_VPHC", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuBbVphc() {
		return this.canCuBbVphc;
	}

	public void setCanCuBbVphc(String canCuBbVphc) {
		this.canCuBbVphc = canCuBbVphc;
	}

	@Caption("NgayLapBbVphc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_BB_VPHC", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBbVphc() {
		return this.ngayLapBbVphc;
	}

	public void setNgayLapBbVphc(Date ngayLapBbVphc) {
		this.ngayLapBbVphc = ngayLapBbVphc;
	}

	@Caption("NgayGiaiTrinhTt")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_GIAI_TRINH_TT", columnDefinition = "DATE", length = 7)
	public Date getNgayGiaiTrinhTt() {
		return this.ngayGiaiTrinhTt;
	}

	public void setNgayGiaiTrinhTt(Date ngayGiaiTrinhTt) {
		this.ngayGiaiTrinhTt = ngayGiaiTrinhTt;
	}

	@Caption("NguoiGiaiTrinhTt")
	@Column(name = "NGUOI_GIAI_TRINH_TT", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiGiaiTrinhTt() {
		return this.nguoiGiaiTrinhTt;
	}

	public void setNguoiGiaiTrinhTt(String nguoiGiaiTrinhTt) {
		this.nguoiGiaiTrinhTt = nguoiGiaiTrinhTt;
	}

	@Caption("CanCuVbUyquyen")
	@Column(name = "CAN_CU_VB_UYQUYEN", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuVbUyquyen() {
		return this.canCuVbUyquyen;
	}

	public void setCanCuVbUyquyen(String canCuVbUyquyen) {
		this.canCuVbUyquyen = canCuVbUyquyen;
	}

	@Caption("CanCuThongbaoSo")
	@Column(name = "CAN_CU_THONGBAO_SO", columnDefinition = "VARCHAR2", length = 60)
	public String getCanCuThongbaoSo() {
		return this.canCuThongbaoSo;
	}

	public void setCanCuThongbaoSo(String canCuThongbaoSo) {
		this.canCuThongbaoSo = canCuThongbaoSo;
	}

	@Caption("CanCuThongbaoNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_THONGBAO_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuThongbaoNgay() {
		return this.canCuThongbaoNgay;
	}

	public void setCanCuThongbaoNgay(Date canCuThongbaoNgay) {
		this.canCuThongbaoNgay = canCuThongbaoNgay;
	}

	@Caption("CanCuThongbaoCua")
	@Column(name = "CAN_CU_THONGBAO_CUA", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuThongbaoCua() {
		return this.canCuThongbaoCua;
	}

	public void setCanCuThongbaoCua(String canCuThongbaoCua) {
		this.canCuThongbaoCua = canCuThongbaoCua;
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
	@Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDiemLap() {
		return this.diaDiemLap;
	}

	public void setDiaDiemLap(String diaDiemLap) {
		this.diaDiemLap = diaDiemLap;
	}

	@Caption("NguoiToChucGiaitrinh")
	@Column(name = "NGUOI_TO_CHUC_GIAITRINH", columnDefinition = "VARCHAR2", length = 600)
	public String getNguoiToChucGiaitrinh() {
		return this.nguoiToChucGiaitrinh;
	}

	public void setNguoiToChucGiaitrinh(String nguoiToChucGiaitrinh) {
		this.nguoiToChucGiaitrinh = nguoiToChucGiaitrinh;
	}

	@Caption("NguoiGiaiTrinh")
	@Column(name = "NGUOI_GIAI_TRINH", columnDefinition = "VARCHAR2", length = 120)
	public String getNguoiGiaiTrinh() {
		return this.nguoiGiaiTrinh;
	}

	public void setNguoiGiaiTrinh(String nguoiGiaiTrinh) {
		this.nguoiGiaiTrinh = nguoiGiaiTrinh;
	}

	@Caption("NgaySinhGt")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SINH_GT", columnDefinition = "DATE", length = 7)
	public Date getNgaySinhGt() {
		return this.ngaySinhGt;
	}

	public void setNgaySinhGt(Date ngaySinhGt) {
		this.ngaySinhGt = ngaySinhGt;
	}

	@Caption("QuocTichGt")
	@Column(name = "QUOC_TICH_GT", columnDefinition = "VARCHAR2", length = 50)
	public String getQuocTichGt() {
		return this.quocTichGt;
	}

	public void setQuocTichGt(String quocTichGt) {
		this.quocTichGt = quocTichGt;
	}

	@Caption("NgheNghiepGt")
	@Column(name = "NGHE_NGHIEP_GT", columnDefinition = "VARCHAR2", length = 50)
	public String getNgheNghiepGt() {
		return this.ngheNghiepGt;
	}

	public void setNgheNghiepGt(String ngheNghiepGt) {
		this.ngheNghiepGt = ngheNghiepGt;
	}

	@Caption("DiaChiGt")
	@Column(name = "DIA_CHI_GT", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiGt() {
		return this.diaChiGt;
	}

	public void setDiaChiGt(String diaChiGt) {
		this.diaChiGt = diaChiGt;
	}

	@Caption("SoCmndGt")
	@Column(name = "SO_CMND_GT", columnDefinition = "VARCHAR2", length = 12)
	public String getSoCmndGt() {
		return this.soCmndGt;
	}

	public void setSoCmndGt(String soCmndGt) {
		this.soCmndGt = soCmndGt;
	}

	@Caption("NgayCapCmndGt")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP_CMND_GT", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmndGt() {
		return this.ngayCapCmndGt;
	}

	public void setNgayCapCmndGt(Date ngayCapCmndGt) {
		this.ngayCapCmndGt = ngayCapCmndGt;
	}

	@Caption("NoiCapCmndXm")
	@Column(name = "NOI_CAP_CMND_XM", columnDefinition = "VARCHAR2", length = 50)
	public String getNoiCapCmndXm() {
		return this.noiCapCmndXm;
	}

	public void setNoiCapCmndXm(String noiCapCmndXm) {
		this.noiCapCmndXm = noiCapCmndXm;
	}

	@Caption("CanCuPhapLy")
	@Column(name = "CAN_CU_PHAP_LY", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuPhapLy() {
		return this.canCuPhapLy;
	}

	public void setCanCuPhapLy(String canCuPhapLy) {
		this.canCuPhapLy = canCuPhapLy;
	}

	@Caption("TinhTietChungCu")
	@Column(name = "TINH_TIET_CHUNG_CU", columnDefinition = "VARCHAR2", length = 700)
	public String getTinhTietChungCu() {
		return this.tinhTietChungCu;
	}

	public void setTinhTietChungCu(String tinhTietChungCu) {
		this.tinhTietChungCu = tinhTietChungCu;
	}

	@Caption("HinhThucXuPhat")
	@Column(name = "HINH_THUC_XU_PHAT", columnDefinition = "VARCHAR2", length = 600)
	public String getHinhThucXuPhat() {
		return this.hinhThucXuPhat;
	}

	public void setHinhThucXuPhat(String hinhThucXuPhat) {
		this.hinhThucXuPhat = hinhThucXuPhat;
	}

	@Caption("YKien")
	@Column(name = "Y_KIEN", columnDefinition = "VARCHAR2", length = 700)
	public String getYKien() {
		return this.YKien;
	}

	public void setYKien(String YKien) {
		this.YKien = YKien;
	}

	@Caption("GioKetThuc")
	@Column(name = "GIO_KET_THUC", columnDefinition = "VARCHAR2", length = 2)
	public String getGioKetThuc() {
		return this.gioKetThuc;
	}

	public void setGioKetThuc(String gioKetThuc) {
		this.gioKetThuc = gioKetThuc;
	}

	@Caption("PhutKetThuc")
	@Column(name = "PHUT_KET_THUC", columnDefinition = "VARCHAR2", length = 2)
	public String getPhutKetThuc() {
		return this.phutKetThuc;
	}

	public void setPhutKetThuc(String phutKetThuc) {
		this.phutKetThuc = phutKetThuc;
	}

	@Caption("CanBoLap")
	@Column(name = "CAN_BO_LAP", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLap() {
		return this.canBoLap;
	}

	public void setCanBoLap(String canBoLap) {
		this.canBoLap = canBoLap;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
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

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 50)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("SoBb43Tc")
	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

}
