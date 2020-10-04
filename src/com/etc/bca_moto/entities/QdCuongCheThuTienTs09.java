package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdCuongCheThuTienTs09DAO;
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
 * QdCuongCheThuTienTs09
 */
@DAO(daoClass = QdCuongCheThuTienTs09DAO.class)
@Caption("{%coQuanChuQuan}")
@Entity
@Table(name = "QD_CUONG_CHE_THU_TIEN_TS_09", schema = "BCA_MOTO")
public class QdCuongCheThuTienTs09 implements java.io.Serializable {

	private long id;
	private String coQuanChuQuan;
	private String soQuyetDinh;
	private Long qd32Id;
	private Long qd02Id;
	private Date ngayTaoQuyetDinh;
	private String canCuQdSo;
	private Date canCuQdNgay;
	private String vphcSo;
	private Date vphcNgay;
	private String vphcKy;
	private Long canBoRaQdId;
	private String capBacChucVu;
	private String donVi;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String diaChiNvp;
	private String lyDoCuongChe;
	private String tienPhatBangSo;
	private String tienPhatBangChu;
	private String toChucGiuTien;
	private String diaChiToChuc;
	private String diaDiemThucHien;
	private Short thoiGianThucHien;
	private String toChucPhoiHop;
	private String ngayHieuLuc;
	private String toChucThuTien;
	private String phoiHopThucHien;
	private String toChucThucHien;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private String diaDanhHc;
	private String ngaySinhNvpNhap;
	private Long tinhThanhPhoId;
	private String canBoLap;
	private Long trangThaiQd;
	private String maVuViec;
	private String maThongTu;
	private Long namLapQd;
	private Long donViNhapBb;

	public QdCuongCheThuTienTs09() {
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

	@Caption("CoQuanChuQuan")
	@Column(name = "CO_QUAN_CHU_QUAN", columnDefinition = "VARCHAR2", length = 200)
	public String getCoQuanChuQuan() {
		return this.coQuanChuQuan;
	}

	public void setCoQuanChuQuan(String coQuanChuQuan) {
		this.coQuanChuQuan = coQuanChuQuan;
	}

	@Caption("SoQuyetDinh")
	@Column(name = "SO_QUYET_DINH", columnDefinition = "VARCHAR2", length = 100)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Caption("Qd32Id")
	@Column(name = "QD32_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd32Id() {
		return this.qd32Id;
	}

	public void setQd32Id(Long qd32Id) {
		this.qd32Id = qd32Id;
	}

	@Caption("Qd02Id")
	@Column(name = "QD02_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd02Id() {
		return this.qd02Id;
	}

	public void setQd02Id(Long qd02Id) {
		this.qd02Id = qd02Id;
	}

	@Caption("NgayTaoQuyetDinh")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO_QUYET_DINH", columnDefinition = "DATE", length = 7)
	public Date getNgayTaoQuyetDinh() {
		return this.ngayTaoQuyetDinh;
	}

	public void setNgayTaoQuyetDinh(Date ngayTaoQuyetDinh) {
		this.ngayTaoQuyetDinh = ngayTaoQuyetDinh;
	}

	@Caption("CanCuQdSo")
	@Column(name = "CAN_CU_QD_SO", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQdSo() {
		return this.canCuQdSo;
	}

	public void setCanCuQdSo(String canCuQdSo) {
		this.canCuQdSo = canCuQdSo;
	}

	@Caption("CanCuQdNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QD_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdNgay() {
		return this.canCuQdNgay;
	}

	public void setCanCuQdNgay(Date canCuQdNgay) {
		this.canCuQdNgay = canCuQdNgay;
	}

	@Caption("VphcSo")
	@Column(name = "VPHC_SO", columnDefinition = "VARCHAR2", length = 200)
	public String getVphcSo() {
		return this.vphcSo;
	}

	public void setVphcSo(String vphcSo) {
		this.vphcSo = vphcSo;
	}

	@Caption("VphcNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "VPHC_NGAY", columnDefinition = "DATE", length = 7)
	public Date getVphcNgay() {
		return this.vphcNgay;
	}

	public void setVphcNgay(Date vphcNgay) {
		this.vphcNgay = vphcNgay;
	}

	@Caption("VphcKy")
	@Column(name = "VPHC_KY", columnDefinition = "VARCHAR2", length = 200)
	public String getVphcKy() {
		return this.vphcKy;
	}

	public void setVphcKy(String vphcKy) {
		this.vphcKy = vphcKy;
	}

	@Caption("CanBoRaQdId")
	@Column(name = "CAN_BO_RA_QD_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoRaQdId() {
		return this.canBoRaQdId;
	}

	public void setCanBoRaQdId(Long canBoRaQdId) {
		this.canBoRaQdId = canBoRaQdId;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 200)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Caption("DonVi")
	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 200)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Caption("TenNguoiNvp")
	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiNvp() {
		return this.tenNguoiNvp;
	}

	public void setTenNguoiNvp(String tenNguoiNvp) {
		this.tenNguoiNvp = tenNguoiNvp;
	}

	@Caption("NgaySinhNvp")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)
	public Date getNgaySinhNvp() {
		return this.ngaySinhNvp;
	}

	public void setNgaySinhNvp(Date ngaySinhNvp) {
		this.ngaySinhNvp = ngaySinhNvp;
	}

	@Caption("QuocTichNvp")
	@Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)
	public String getQuocTichNvp() {
		return this.quocTichNvp;
	}

	public void setQuocTichNvp(String quocTichNvp) {
		this.quocTichNvp = quocTichNvp;
	}

	@Caption("NgheNghiepNvp")
	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 500)
	public String getNgheNghiepNvp() {
		return this.ngheNghiepNvp;
	}

	public void setNgheNghiepNvp(String ngheNghiepNvp) {
		this.ngheNghiepNvp = ngheNghiepNvp;
	}

	@Caption("SoCmndNvp")
	@Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNvp() {
		return this.soCmndNvp;
	}

	public void setSoCmndNvp(String soCmndNvp) {
		this.soCmndNvp = soCmndNvp;
	}

	@Caption("NgayCapCmndNvp")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmndNvp() {
		return this.ngayCapCmndNvp;
	}

	public void setNgayCapCmndNvp(Date ngayCapCmndNvp) {
		this.ngayCapCmndNvp = ngayCapCmndNvp;
	}

	@Caption("NoiCapCmndNvp")
	@Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)
	public String getNoiCapCmndNvp() {
		return this.noiCapCmndNvp;
	}

	public void setNoiCapCmndNvp(String noiCapCmndNvp) {
		this.noiCapCmndNvp = noiCapCmndNvp;
	}

	@Caption("DiaChiNvp")
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 150)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Caption("LyDoCuongChe")
	@Column(name = "LY_DO_CUONG_CHE", columnDefinition = "VARCHAR2", length = 200)
	public String getLyDoCuongChe() {
		return this.lyDoCuongChe;
	}

	public void setLyDoCuongChe(String lyDoCuongChe) {
		this.lyDoCuongChe = lyDoCuongChe;
	}

	@Caption("TienPhatBangSo")
	@Column(name = "TIEN_PHAT_BANG_SO", columnDefinition = "VARCHAR2", length = 20)
	public String getTienPhatBangSo() {
		return this.tienPhatBangSo;
	}

	public void setTienPhatBangSo(String tienPhatBangSo) {
		this.tienPhatBangSo = tienPhatBangSo;
	}

	@Caption("TienPhatBangChu")
	@Column(name = "TIEN_PHAT_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getTienPhatBangChu() {
		return this.tienPhatBangChu;
	}

	public void setTienPhatBangChu(String tienPhatBangChu) {
		this.tienPhatBangChu = tienPhatBangChu;
	}

	@Caption("ToChucGiuTien")
	@Column(name = "TO_CHUC_GIU_TIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getToChucGiuTien() {
		return this.toChucGiuTien;
	}

	public void setToChucGiuTien(String toChucGiuTien) {
		this.toChucGiuTien = toChucGiuTien;
	}

	@Caption("DiaChiToChuc")
	@Column(name = "DIA_CHI_TO_CHUC", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaChiToChuc() {
		return this.diaChiToChuc;
	}

	public void setDiaChiToChuc(String diaChiToChuc) {
		this.diaChiToChuc = diaChiToChuc;
	}

	@Caption("DiaDiemThucHien")
	@Column(name = "DIA_DIEM_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDiemThucHien() {
		return this.diaDiemThucHien;
	}

	public void setDiaDiemThucHien(String diaDiemThucHien) {
		this.diaDiemThucHien = diaDiemThucHien;
	}

	@Caption("ThoiGianThucHien")
	@Column(name = "THOI_GIAN_THUC_HIEN", columnDefinition = "NUMBER", precision = 3, scale = 0)
	public Short getThoiGianThucHien() {
		return this.thoiGianThucHien;
	}

	public void setThoiGianThucHien(Short thoiGianThucHien) {
		this.thoiGianThucHien = thoiGianThucHien;
	}

	@Caption("ToChucPhoiHop")
	@Column(name = "TO_CHUC_PHOI_HOP", columnDefinition = "VARCHAR2", length = 100)
	public String getToChucPhoiHop() {
		return this.toChucPhoiHop;
	}

	public void setToChucPhoiHop(String toChucPhoiHop) {
		this.toChucPhoiHop = toChucPhoiHop;
	}

	@Caption("NgayHieuLuc")
	@Column(name = "NGAY_HIEU_LUC", columnDefinition = "VARCHAR2", length = 50)
	public String getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(String ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Caption("ToChucThuTien")
	@Column(name = "TO_CHUC_THU_TIEN", columnDefinition = "VARCHAR2", length = 150)
	public String getToChucThuTien() {
		return this.toChucThuTien;
	}

	public void setToChucThuTien(String toChucThuTien) {
		this.toChucThuTien = toChucThuTien;
	}

	@Caption("PhoiHopThucHien")
	@Column(name = "PHOI_HOP_THUC_HIEN", columnDefinition = "VARCHAR2", length = 150)
	public String getPhoiHopThucHien() {
		return this.phoiHopThucHien;
	}

	public void setPhoiHopThucHien(String phoiHopThucHien) {
		this.phoiHopThucHien = phoiHopThucHien;
	}

	@Caption("ToChucThucHien")
	@Column(name = "TO_CHUC_THUC_HIEN", columnDefinition = "VARCHAR2", length = 150)
	public String getToChucThucHien() {
		return this.toChucThucHien;
	}

	public void setToChucThucHien(String toChucThucHien) {
		this.toChucThucHien = toChucThucHien;
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

	@Caption("DiaDanhHc")
	@Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 50)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Caption("NgaySinhNvpNhap")
	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Caption("TinhThanhPhoId")
	@Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTinhThanhPhoId() {
		return this.tinhThanhPhoId;
	}

	public void setTinhThanhPhoId(Long tinhThanhPhoId) {
		this.tinhThanhPhoId = tinhThanhPhoId;
	}

	@Caption("CanBoLap")
	@Column(name = "CAN_BO_LAP", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLap() {
		return this.canBoLap;
	}

	public void setCanBoLap(String canBoLap) {
		this.canBoLap = canBoLap;
	}

	@Caption("TrangThaiQd")
	@Column(name = "TRANG_THAI_QD", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiQd() {
		return this.trangThaiQd;
	}

	public void setTrangThaiQd(Long trangThaiQd) {
		this.trangThaiQd = trangThaiQd;
	}

	@Caption("MaVuViec")
	@Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)
	public String getMaVuViec() {
		return this.maVuViec;
	}

	public void setMaVuViec(String maVuViec) {
		this.maVuViec = maVuViec;
	}

	@Caption("MaThongTu")
	@Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)
	public String getMaThongTu() {
		return this.maThongTu;
	}

	public void setMaThongTu(String maThongTu) {
		this.maThongTu = maThongTu;
	}

	@Caption("NamLapQd")
	@Column(name = "NAM_LAP_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamLapQd() {
		return this.namLapQd;
	}

	public void setNamLapQd(Long namLapQd) {
		this.namLapQd = namLapQd;
	}

	@Caption("DonViNhapBb")
	@Column(name = "DON_VI_NHAP_BB", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViNhapBb() {
		return this.donViNhapBb;
	}

	public void setDonViNhapBb(Long donViNhapBb) {
		this.donViNhapBb = donViNhapBb;
	}

}
