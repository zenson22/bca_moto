package com.etc.bca_moto.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.etc.bca_moto.dal.QdCuongCheKhauTruTienTuTk07DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * QdCuongCheKhauTruTienTuTk07
 */
@DAO(daoClass = QdCuongCheKhauTruTienTuTk07DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_CUONG_CHE_KHAU_TRU_TIEN_TU_TK07", schema = "BCA_MOTO")
public class QdCuongCheKhauTruTienTuTk07 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private String diaDiemLapQd;
	private Date ngayLapQuyetDinh;
	private Long soCanCuQdGqcc;
	private long nguoiRaQuyetDinh;
	private long soQdXpvphc;
	private String soTaiKhoanNvp;
	private String nganHangNvp;
	private long soTienKhauTru;
	private String soTienBangChu;
	private String soTkKhoBac;
	private long khoBacId;
	private Date ngayHieuLuc;
	private String thoiHan;
	private long donViThiHanhQd;
	private boolean active;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private String soQdXphc;
	private Date ngayQdXphc;
	private String tenNvp;
	private String ngaysinhNvp;
	private String quoctichNvp;
	private String nghenghiepNvp;
	private String diachiNvp;
	private String soCmndNvp;
	private Date ngayCapCmnd;
	private String noiCapCmnd;
	private String canBoRaQd;
	private String nguoiKy;
	private String tenCoQuanCapTren;
	private String capbacChucvu;
	private String tenDonVi;
	private String tenDonViThiHanhQd;
	private String tenDiaChiNganHangThuTien;
	private long cbxlid;
	private Date ngayCuongChe;
	private String tenDV2;
	public QdCuongCheKhauTruTienTuTk07() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	@Caption("SoQuyetDinh")
	@Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(final String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Caption("DiaDiemLapQd")
	@Column(name = "DIA_DIEM_LAP_QD", nullable = false, columnDefinition = "VARCHAR2", length = 500)
	public String getDiaDiemLapQd() {
		return this.diaDiemLapQd;
	}

	public void setDiaDiemLapQd(final String diaDiemLapQd) {
		this.diaDiemLapQd = diaDiemLapQd;
	}
	
	
	
	@Caption("TenDV2")
	@Column(name = "TEN_DV2", nullable = true, columnDefinition = "VARCHAR2", length = 200)
	public String getTenDV2() {
		return this.tenDV2;
	}

	public void setTenDV2(final String tenDV2) {
		this.tenDV2 = tenDV2;
	}
	
	
	

	@Caption("NgayLapQuyetDinh")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_QUYET_DINH", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayLapQuyetDinh() {
		return this.ngayLapQuyetDinh;
	}

	public void setNgayLapQuyetDinh(final Date ngayLapQuyetDinh) {
		this.ngayLapQuyetDinh = ngayLapQuyetDinh;
	}

	@Caption("SoCanCuQdGqcc")
	@Column(name = "SO_CAN_CU_QD_GQCC", columnDefinition = "NUMBER", precision = 38, scale = 0)
	public Long getSoCanCuQdGqcc() {
		return this.soCanCuQdGqcc;
	}

	public void setSoCanCuQdGqcc(final Long soCanCuQdGqcc) {
		this.soCanCuQdGqcc = soCanCuQdGqcc;
	}

	@Caption("NguoiRaQuyetDinh")
	@Column(name = "NGUOI_RA_QUYET_DINH", nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getNguoiRaQuyetDinh() {
		return this.nguoiRaQuyetDinh;
	}

	public void setNguoiRaQuyetDinh(final long nguoiRaQuyetDinh) {
		this.nguoiRaQuyetDinh = nguoiRaQuyetDinh;
	}

	@Caption("SoQdXpvphc")
	@Column(name = "SO_QD_XPVPHC", nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getSoQdXpvphc() {
		return this.soQdXpvphc;
	}

	public void setSoQdXpvphc(final long soQdXpvphc) {
		this.soQdXpvphc = soQdXpvphc;
	}

	@Caption("SoTaiKhoanNvp")
	@Column(name = "SO_TAI_KHOAN_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getSoTaiKhoanNvp() {
		return this.soTaiKhoanNvp;
	}

	public void setSoTaiKhoanNvp(final String soTaiKhoanNvp) {
		this.soTaiKhoanNvp = soTaiKhoanNvp;
	}

	@Caption("NganHangNvp")
	@Column(name = "NGAN_HANG_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getNganHangNvp() {
		return this.nganHangNvp;
	}

	public void setNganHangNvp(final String nganHangNvp) {
		this.nganHangNvp = nganHangNvp;
	}

	@Caption("SoTienKhauTru")
	@Column(name = "SO_TIEN_KHAU_TRU", nullable = true, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getSoTienKhauTru() {
		return this.soTienKhauTru;
	}

	public void setSoTienKhauTru(final long soTienKhauTru) {
		this.soTienKhauTru = soTienKhauTru;
	}

	@Caption("SoTienBangChu")
	@Column(name = "SO_TIEN_BANG_CHU", nullable = false, columnDefinition = "VARCHAR2", length = 500)
	public String getSoTienBangChu() {
		return this.soTienBangChu;
	}

	public void setSoTienBangChu(final String soTienBangChu) {
		this.soTienBangChu = soTienBangChu;
	}

	@Caption("SoTkKhoBac")
	@Column(name = "SO_TK_KHO_BAC", nullable = false, columnDefinition = "VARCHAR2", length = 30)
	public String getSoTkKhoBac() {
		return this.soTkKhoBac;
	}

	public void setSoTkKhoBac(final String soTkKhoBac) {
		this.soTkKhoBac = soTkKhoBac;
	}

	@Caption("KhoBacId")
	@Column(name = "KHO_BAC_ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getKhoBacId() {
		return this.khoBacId;
	}

	public void setKhoBacId(final long khoBacId) {
		this.khoBacId = khoBacId;
	}
	
	@Caption("CBXL_ID")
	@Column(name = "CBXL_ID", nullable = true, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getCBXL_ID() {
		return this.cbxlid;
	}

	public void setCBXL_ID(final long cbxlid) {
		this.cbxlid = cbxlid;
	}
	
	@Caption("NgayCuongChe")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_GIAO_QUYEN_CC", nullable = true, columnDefinition = "DATE", length = 7)
	public Date getNgayCuongChe() {
		return this.ngayCuongChe;
	}

	public void setNgayCuongChe(final Date ngayCuongChe) {
		this.ngayCuongChe = ngayCuongChe;
	}

	
	
	
	
	
	
	
	
	@Caption("NgayHieuLuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HIEU_LUC", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(final Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Caption("ThoiHan")
	@Column(name = "THOI_HAN", nullable = false, columnDefinition = "VARCHAR2", length = 5)
	public String getThoiHan() {
		return this.thoiHan;
	}

	public void setThoiHan(final String thoiHan) {
		this.thoiHan = thoiHan;
	}

	@Caption("DonViThiHanhQd")
	@Column(name = "DON_VI_THI_HANH_QD", nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getDonViThiHanhQd() {
		return this.donViThiHanhQd;
	}

	public void setDonViThiHanhQd(final long donViThiHanhQd) {
		this.donViThiHanhQd = donViThiHanhQd;
	}

	@Caption("Active")
	@Column(name = "ACTIVE", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(final boolean active) {
		this.active = active;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(final Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(final Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(final Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
	}

	@Caption("NgaySua")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(final Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Caption("SoQdXphc")
	@Column(name = "SO_QD_XPHC", columnDefinition = "VARCHAR2", length = 50)
	public String getSoQdXphc() {
		return this.soQdXphc;
	}

	public void setSoQdXphc(final String soQdXphc) {
		this.soQdXphc = soQdXphc;
	}

	@Caption("NgayQdXphc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_QD_XPHC", columnDefinition = "DATE", length = 7)
	public Date getNgayQdXphc() {
		return this.ngayQdXphc;
	}

	public void setNgayQdXphc(final Date ngayQdXphc) {
		this.ngayQdXphc = ngayQdXphc;
	}

	@Caption("TenNvp")
	@Column(name = "TEN_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNvp() {
		return this.tenNvp;
	}

	public void setTenNvp(final String tenNvp) {
		this.tenNvp = tenNvp;
	}

	@Caption("NgaysinhNvp")
	@Column(name = "NGAYSINH_NVP", columnDefinition = "VARCHAR2", length = 30)
	public String getNgaysinhNvp() {
		return this.ngaysinhNvp;
	}

	public void setNgaysinhNvp(final String ngaysinhNvp) {
		this.ngaysinhNvp = ngaysinhNvp;
	}

	@Caption("QuoctichNvp")
	@Column(name = "QUOCTICH_NVP", columnDefinition = "VARCHAR2", length = 100)
	public String getQuoctichNvp() {
		return this.quoctichNvp;
	}

	public void setQuoctichNvp(final String quoctichNvp) {
		this.quoctichNvp = quoctichNvp;
	}

	@Caption("NghenghiepNvp")
	@Column(name = "NGHENGHIEP_NVP", columnDefinition = "VARCHAR2", length = 100)
	public String getNghenghiepNvp() {
		return this.nghenghiepNvp;
	}

	public void setNghenghiepNvp(final String nghenghiepNvp) {
		this.nghenghiepNvp = nghenghiepNvp;
	}

	@Caption("DiachiNvp")
	@Column(name = "DIACHI_NVP", columnDefinition = "VARCHAR2", length = 500)
	public String getDiachiNvp() {
		return this.diachiNvp;
	}

	public void setDiachiNvp(final String diachiNvp) {
		this.diachiNvp = diachiNvp;
	}

	@Caption("SoCmndNvp")
	@Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNvp() {
		return this.soCmndNvp;
	}

	public void setSoCmndNvp(final String soCmndNvp) {
		this.soCmndNvp = soCmndNvp;
	}

	@Caption("NgayCapCmnd")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP_CMND", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmnd() {
		return this.ngayCapCmnd;
	}

	public void setNgayCapCmnd(final Date ngayCapCmnd) {
		this.ngayCapCmnd = ngayCapCmnd;
	}

	@Caption("NoiCapCmnd")
	@Column(name = "NOI_CAP_CMND", columnDefinition = "VARCHAR2", length = 100)
	public String getNoiCapCmnd() {
		return this.noiCapCmnd;
	}

	public void setNoiCapCmnd(final String noiCapCmnd) {
		this.noiCapCmnd = noiCapCmnd;
	}

	@Caption("CanBoRaQd")
	@Column(name = "CAN_BO_RA_QD", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoRaQd() {
		return this.canBoRaQd;
	}

	public void setCanBoRaQd(final String canBoRaQd) {
		this.canBoRaQd = canBoRaQd;
	}

	@Caption("NguoiKy")
	@Column(name = "NGUOI_KY", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiKy() {
		return this.nguoiKy;
	}

	public void setNguoiKy(final String nguoiKy) {
		this.nguoiKy = nguoiKy;
	}

	@Caption("TenCoQuanCapTren")
	@Column(name = "TEN_CO_QUAN_CAP_TREN", columnDefinition = "VARCHAR2", length = 200)
	public String getTenCoQuanCapTren() {
		return this.tenCoQuanCapTren;
	}

	public void setTenCoQuanCapTren(final String tenCoQuanCapTren) {
		this.tenCoQuanCapTren = tenCoQuanCapTren;
	}

	@Caption("CapbacChucvu")
	@Column(name = "CAPBAC_CHUCVU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapbacChucvu() {
		return this.capbacChucvu;
	}

	public void setCapbacChucvu(final String capbacChucvu) {
		this.capbacChucvu = capbacChucvu;
	}

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(final String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("TenDonViThiHanhQd")
	@Column(name = "TEN_DON_VI_THI_HANH_QD", columnDefinition = "VARCHAR2", length = 100)
	public String getTenDonViThiHanhQd() {
		return this.tenDonViThiHanhQd;
	}

	public void setTenDonViThiHanhQd(final String tenDonViThiHanhQd) {
		this.tenDonViThiHanhQd = tenDonViThiHanhQd;
	}
	
	@Caption("TenDiaChiNganHangThuTien")
	@Column(name = "TEN_DIACHI_NGANHANGTHUTIEN",columnDefinition = "VARCHAR2", length = 500 )
	public String getTenDiaChiNganHangThuTien() {
		return this.tenDiaChiNganHangThuTien;
	}

	public void setTenDiaChiNganHangThuTien(final String tenDiaChiNganHangThuTien) {
		this.tenDiaChiNganHangThuTien = tenDiaChiNganHangThuTien;
	}

}
