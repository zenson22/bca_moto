package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdXpvphc02DAO;
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
 * QdXpvphc02
 */
@DAO(daoClass = QdXpvphc02DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_XPVPHC_02", schema = "BCA_MOTO")
public class QdXpvphc02 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private String tenCqCapTren;
	private String tenDonVi;
	private String soBienBanTc;
	private String diaDanhHc;
	private Date ngayLapQd;
	private String canCuXlvphc;
	private String canCuNghiDinh;
	private String canCuBienBan;
	private String canCuBbGt;
	private Date ngayThangGt;
	private String canBoRaQd;
	private Long canBoRaQdId;
	private String hinhThucXp;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String tnGiamNhe;
	private String xuPhatBoSung;
	private String bienPhapNganChan;
	private String bienPhapKhacPhuc;
	private String thoiHanXpbs;
	private String thoiHanKphq;
	private String kinhPhiKp;
	private String kinhPhiBangChu;
	private String donViKp;
	private Long tongMucPhat;
	private String mucPhatBangChu;
	private Date ngayHieuLuc;
	private String diaChiNopTien;
	private String thoiHanNopPhat;
	private String donViThuTien;
	private String dvThiHanhQd;
	private String ghiChu;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private Long capTrenPheDuyet;
	private Long capDuoiKyNhay;
	private String canBoNhanXuLy;
	private Long cbxlId;
	private String capBacChucVu;
	private String ngayLapBb;
	private String diaChiNvp;
	private String hanhViVp;
	private Long soBb43Tc;
	private Long canBoTraLai;
	private Date ngayTraLai;
	private Date ngayBatDauXl;
	private Long idTheoNam;
	private Long diaDanhHcId;
	private Long namLapQd;
	private Long nhapQd;
	private Long trangThaiQd;
	private String tenNvpDvc;
	private String soDienThoai;
	private Long maTinhThanh;
	private String gplx;
	private Date ngayTaoBb;
	private String kiemDinh;
	private Long capBacNhap;
	private Long chucVuNhap;
	private String tenCanBoNhap;
	private Long maKhoBac;
	private String cancuQdGqxp;
	private String ngayCcqdgqxp;
	private Date tuNgayXpbs;
	private Date denNgayXpbs;
	private Long dvThQd;
	private String maTinhThanhPho;
	private String maDonVi;
	private String ngaySinhNvpNhap;
	private Long capDonVi;
	private String soQdThongbao;
	private String donviNhanTb;
	private Long xpbsId;
	private Long linhVucGiaoThong;
	private String maVuViec;
	private String maThongTu;
	private String soBienLai;
	private String ngayThanhToan;
	private Long noiNopPhatId;
	private Long donViRaQdId;

	public QdXpvphc02() {
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

	@Caption("SoQuyetDinh")
	@Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 30)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Caption("TenCqCapTren")
	@Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 150)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 150)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("SoBienBanTc")
	@Column(name = "SO_BIEN_BAN_TC", columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBanTc() {
		return this.soBienBanTc;
	}

	public void setSoBienBanTc(String soBienBanTc) {
		this.soBienBanTc = soBienBanTc;
	}

	@Caption("DiaDanhHc")
	@Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Caption("NgayLapQd")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_QD", columnDefinition = "DATE", length = 7)
	public Date getNgayLapQd() {
		return this.ngayLapQd;
	}

	public void setNgayLapQd(Date ngayLapQd) {
		this.ngayLapQd = ngayLapQd;
	}

	@Caption("CanCuXlvphc")
	@Column(name = "CAN_CU_XLVPHC", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuXlvphc() {
		return this.canCuXlvphc;
	}

	public void setCanCuXlvphc(String canCuXlvphc) {
		this.canCuXlvphc = canCuXlvphc;
	}

	@Caption("CanCuNghiDinh")
	@Column(name = "CAN_CU_NGHI_DINH", columnDefinition = "VARCHAR2", length = 1000)
	public String getCanCuNghiDinh() {
		return this.canCuNghiDinh;
	}

	public void setCanCuNghiDinh(String canCuNghiDinh) {
		this.canCuNghiDinh = canCuNghiDinh;
	}

	@Caption("CanCuBienBan")
	@Column(name = "CAN_CU_BIEN_BAN", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuBienBan() {
		return this.canCuBienBan;
	}

	public void setCanCuBienBan(String canCuBienBan) {
		this.canCuBienBan = canCuBienBan;
	}

	@Caption("CanCuBbGt")
	@Column(name = "CAN_CU_BB_GT", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuBbGt() {
		return this.canCuBbGt;
	}

	public void setCanCuBbGt(String canCuBbGt) {
		this.canCuBbGt = canCuBbGt;
	}

	@Caption("NgayThangGt")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_THANG_GT", columnDefinition = "DATE", length = 7)
	public Date getNgayThangGt() {
		return this.ngayThangGt;
	}

	public void setNgayThangGt(Date ngayThangGt) {
		this.ngayThangGt = ngayThangGt;
	}

	@Caption("CanBoRaQd")
	@Column(name = "CAN_BO_RA_QD", columnDefinition = "VARCHAR2", length = 150)
	public String getCanBoRaQd() {
		return this.canBoRaQd;
	}

	public void setCanBoRaQd(String canBoRaQd) {
		this.canBoRaQd = canBoRaQd;
	}

	@Caption("CanBoRaQdId")
	@Column(name = "CAN_BO_RA_QD_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCanBoRaQdId() {
		return this.canBoRaQdId;
	}

	public void setCanBoRaQdId(Long canBoRaQdId) {
		this.canBoRaQdId = canBoRaQdId;
	}

	@Caption("HinhThucXp")
	@Column(name = "HINH_THUC_XP", columnDefinition = "VARCHAR2", length = 500)
	public String getHinhThucXp() {
		return this.hinhThucXp;
	}

	public void setHinhThucXp(String hinhThucXp) {
		this.hinhThucXp = hinhThucXp;
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
	@Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 100)
	public String getQuocTichNvp() {
		return this.quocTichNvp;
	}

	public void setQuocTichNvp(String quocTichNvp) {
		this.quocTichNvp = quocTichNvp;
	}

	@Caption("NgheNghiepNvp")
	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 150)
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

	@Caption("TnGiamNhe")
	@Column(name = "TN_GIAM_NHE", columnDefinition = "VARCHAR2", length = 100)
	public String getTnGiamNhe() {
		return this.tnGiamNhe;
	}

	public void setTnGiamNhe(String tnGiamNhe) {
		this.tnGiamNhe = tnGiamNhe;
	}

	@Caption("XuPhatBoSung")
	@Column(name = "XU_PHAT_BO_SUNG", columnDefinition = "VARCHAR2", length = 200)
	public String getXuPhatBoSung() {
		return this.xuPhatBoSung;
	}

	public void setXuPhatBoSung(String xuPhatBoSung) {
		this.xuPhatBoSung = xuPhatBoSung;
	}

	@Caption("BienPhapNganChan")
	@Column(name = "BIEN_PHAP_NGAN_CHAN", columnDefinition = "VARCHAR2", length = 200)
	public String getBienPhapNganChan() {
		return this.bienPhapNganChan;
	}

	public void setBienPhapNganChan(String bienPhapNganChan) {
		this.bienPhapNganChan = bienPhapNganChan;
	}

	@Caption("BienPhapKhacPhuc")
	@Column(name = "BIEN_PHAP_KHAC_PHUC", columnDefinition = "VARCHAR2", length = 200)
	public String getBienPhapKhacPhuc() {
		return this.bienPhapKhacPhuc;
	}

	public void setBienPhapKhacPhuc(String bienPhapKhacPhuc) {
		this.bienPhapKhacPhuc = bienPhapKhacPhuc;
	}

	@Caption("ThoiHanXpbs")
	@Column(name = "THOI_HAN_XPBS", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanXpbs() {
		return this.thoiHanXpbs;
	}

	public void setThoiHanXpbs(String thoiHanXpbs) {
		this.thoiHanXpbs = thoiHanXpbs;
	}

	@Caption("ThoiHanKphq")
	@Column(name = "THOI_HAN_KPHQ", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanKphq() {
		return this.thoiHanKphq;
	}

	public void setThoiHanKphq(String thoiHanKphq) {
		this.thoiHanKphq = thoiHanKphq;
	}

	@Caption("KinhPhiKp")
	@Column(name = "KINH_PHI_KP", columnDefinition = "VARCHAR2", length = 20)
	public String getKinhPhiKp() {
		return this.kinhPhiKp;
	}

	public void setKinhPhiKp(String kinhPhiKp) {
		this.kinhPhiKp = kinhPhiKp;
	}

	@Caption("KinhPhiBangChu")
	@Column(name = "KINH_PHI_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getKinhPhiBangChu() {
		return this.kinhPhiBangChu;
	}

	public void setKinhPhiBangChu(String kinhPhiBangChu) {
		this.kinhPhiBangChu = kinhPhiBangChu;
	}

	@Caption("DonViKp")
	@Column(name = "DON_VI_KP", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViKp() {
		return this.donViKp;
	}

	public void setDonViKp(String donViKp) {
		this.donViKp = donViKp;
	}

	@Caption("TongMucPhat")
	@Column(name = "TONG_MUC_PHAT", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTongMucPhat() {
		return this.tongMucPhat;
	}

	public void setTongMucPhat(Long tongMucPhat) {
		this.tongMucPhat = tongMucPhat;
	}

	@Caption("MucPhatBangChu")
	@Column(name = "MUC_PHAT_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getMucPhatBangChu() {
		return this.mucPhatBangChu;
	}

	public void setMucPhatBangChu(String mucPhatBangChu) {
		this.mucPhatBangChu = mucPhatBangChu;
	}

	@Caption("NgayHieuLuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HIEU_LUC", columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Caption("DiaChiNopTien")
	@Column(name = "DIA_CHI_NOP_TIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaChiNopTien() {
		return this.diaChiNopTien;
	}

	public void setDiaChiNopTien(String diaChiNopTien) {
		this.diaChiNopTien = diaChiNopTien;
	}

	@Caption("ThoiHanNopPhat")
	@Column(name = "THOI_HAN_NOP_PHAT", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanNopPhat() {
		return this.thoiHanNopPhat;
	}

	public void setThoiHanNopPhat(String thoiHanNopPhat) {
		this.thoiHanNopPhat = thoiHanNopPhat;
	}

	@Caption("DonViThuTien")
	@Column(name = "DON_VI_THU_TIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getDonViThuTien() {
		return this.donViThuTien;
	}

	public void setDonViThuTien(String donViThuTien) {
		this.donViThuTien = donViThuTien;
	}

	@Caption("DvThiHanhQd")
	@Column(name = "DV_THI_HANH_QD", columnDefinition = "VARCHAR2", length = 100)
	public String getDvThiHanhQd() {
		return this.dvThiHanhQd;
	}

	public void setDvThiHanhQd(String dvThiHanhQd) {
		this.dvThiHanhQd = dvThiHanhQd;
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

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("CapTrenPheDuyet")
	@Column(name = "CAP_TREN_PHE_DUYET", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapTrenPheDuyet() {
		return this.capTrenPheDuyet;
	}

	public void setCapTrenPheDuyet(Long capTrenPheDuyet) {
		this.capTrenPheDuyet = capTrenPheDuyet;
	}

	@Caption("CapDuoiKyNhay")
	@Column(name = "CAP_DUOI_KY_NHAY", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapDuoiKyNhay() {
		return this.capDuoiKyNhay;
	}

	public void setCapDuoiKyNhay(Long capDuoiKyNhay) {
		this.capDuoiKyNhay = capDuoiKyNhay;
	}

	@Caption("CanBoNhanXuLy")
	@Column(name = "CAN_BO_NHAN_XU_LY", columnDefinition = "VARCHAR2", length = 70)
	public String getCanBoNhanXuLy() {
		return this.canBoNhanXuLy;
	}

	public void setCanBoNhanXuLy(String canBoNhanXuLy) {
		this.canBoNhanXuLy = canBoNhanXuLy;
	}

	@Caption("CbxlId")
	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Caption("NgayLapBb")
	@Column(name = "NGAY_LAP_BB", columnDefinition = "VARCHAR2", length = 20)
	public String getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(String ngayLapBb) {
		this.ngayLapBb = ngayLapBb;
	}

	@Caption("DiaChiNvp")
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Caption("HanhViVp")
	@Column(name = "HANH_VI_VP", columnDefinition = "VARCHAR2", length = 2000)
	public String getHanhViVp() {
		return this.hanhViVp;
	}

	public void setHanhViVp(String hanhViVp) {
		this.hanhViVp = hanhViVp;
	}

	@Caption("SoBb43Tc")
	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Caption("CanBoTraLai")
	@Column(name = "CAN_BO_TRA_LAI", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoTraLai() {
		return this.canBoTraLai;
	}

	public void setCanBoTraLai(Long canBoTraLai) {
		this.canBoTraLai = canBoTraLai;
	}

	@Caption("NgayTraLai")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TRA_LAI", columnDefinition = "DATE", length = 7)
	public Date getNgayTraLai() {
		return this.ngayTraLai;
	}

	public void setNgayTraLai(Date ngayTraLai) {
		this.ngayTraLai = ngayTraLai;
	}

	@Caption("NgayBatDauXl")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_BAT_DAU_XL", columnDefinition = "DATE", length = 7)
	public Date getNgayBatDauXl() {
		return this.ngayBatDauXl;
	}

	public void setNgayBatDauXl(Date ngayBatDauXl) {
		this.ngayBatDauXl = ngayBatDauXl;
	}

	@Caption("IdTheoNam")
	@Column(name = "ID_THEO_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdTheoNam() {
		return this.idTheoNam;
	}

	public void setIdTheoNam(Long idTheoNam) {
		this.idTheoNam = idTheoNam;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Caption("NamLapQd")
	@Column(name = "NAM_LAP_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamLapQd() {
		return this.namLapQd;
	}

	public void setNamLapQd(Long namLapQd) {
		this.namLapQd = namLapQd;
	}

	@Caption("NhapQd")
	@Column(name = "NHAP_QD", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapQd() {
		return this.nhapQd;
	}

	public void setNhapQd(Long nhapQd) {
		this.nhapQd = nhapQd;
	}

	@Caption("TrangThaiQd")
	@Column(name = "TRANG_THAI_QD", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiQd() {
		return this.trangThaiQd;
	}

	public void setTrangThaiQd(Long trangThaiQd) {
		this.trangThaiQd = trangThaiQd;
	}

	@Caption("TenNvpDvc")
	@Column(name = "TEN_NVP_DVC", columnDefinition = "VARCHAR2", length = 300)
	public String getTenNvpDvc() {
		return this.tenNvpDvc;
	}

	public void setTenNvpDvc(String tenNvpDvc) {
		this.tenNvpDvc = tenNvpDvc;
	}

	@Caption("SoDienThoai")
	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Caption("MaTinhThanh")
	@Column(name = "MA_TINH_THANH", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMaTinhThanh() {
		return this.maTinhThanh;
	}

	public void setMaTinhThanh(Long maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}

	@Caption("Gplx")
	@Column(name = "GPLX", columnDefinition = "VARCHAR2", length = 100)
	public String getGplx() {
		return this.gplx;
	}

	public void setGplx(String gplx) {
		this.gplx = gplx;
	}

	@Caption("NgayTaoBb")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO_BB", columnDefinition = "DATE", length = 7)
	public Date getNgayTaoBb() {
		return this.ngayTaoBb;
	}

	public void setNgayTaoBb(Date ngayTaoBb) {
		this.ngayTaoBb = ngayTaoBb;
	}

	@Caption("KiemDinh")
	@Column(name = "KIEM_DINH", columnDefinition = "VARCHAR2", length = 50)
	public String getKiemDinh() {
		return this.kiemDinh;
	}

	public void setKiemDinh(String kiemDinh) {
		this.kiemDinh = kiemDinh;
	}

	@Caption("CapBacNhap")
	@Column(name = "CAP_BAC_NHAP", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getCapBacNhap() {
		return this.capBacNhap;
	}

	public void setCapBacNhap(Long capBacNhap) {
		this.capBacNhap = capBacNhap;
	}

	@Caption("ChucVuNhap")
	@Column(name = "CHUC_VU_NHAP", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getChucVuNhap() {
		return this.chucVuNhap;
	}

	public void setChucVuNhap(Long chucVuNhap) {
		this.chucVuNhap = chucVuNhap;
	}

	@Caption("TenCanBoNhap")
	@Column(name = "TEN_CAN_BO_NHAP", columnDefinition = "VARCHAR2", length = 100)
	public String getTenCanBoNhap() {
		return this.tenCanBoNhap;
	}

	public void setTenCanBoNhap(String tenCanBoNhap) {
		this.tenCanBoNhap = tenCanBoNhap;
	}

	@Caption("MaKhoBac")
	@Column(name = "MA_KHO_BAC", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMaKhoBac() {
		return this.maKhoBac;
	}

	public void setMaKhoBac(Long maKhoBac) {
		this.maKhoBac = maKhoBac;
	}

	@Caption("CancuQdGqxp")
	@Column(name = "CANCU_QD_GQXP", columnDefinition = "VARCHAR2", length = 300)
	public String getCancuQdGqxp() {
		return this.cancuQdGqxp;
	}

	public void setCancuQdGqxp(String cancuQdGqxp) {
		this.cancuQdGqxp = cancuQdGqxp;
	}

	@Caption("NgayCcqdgqxp")
	@Column(name = "NGAY_CCQDGQXP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgayCcqdgqxp() {
		return this.ngayCcqdgqxp;
	}

	public void setNgayCcqdgqxp(String ngayCcqdgqxp) {
		this.ngayCcqdgqxp = ngayCcqdgqxp;
	}

	@Caption("TuNgayXpbs")
	@Temporal(TemporalType.DATE)
	@Column(name = "TU_NGAY_XPBS", columnDefinition = "DATE", length = 7)
	public Date getTuNgayXpbs() {
		return this.tuNgayXpbs;
	}

	public void setTuNgayXpbs(Date tuNgayXpbs) {
		this.tuNgayXpbs = tuNgayXpbs;
	}

	@Caption("DenNgayXpbs")
	@Temporal(TemporalType.DATE)
	@Column(name = "DEN_NGAY_XPBS", columnDefinition = "DATE", length = 7)
	public Date getDenNgayXpbs() {
		return this.denNgayXpbs;
	}

	public void setDenNgayXpbs(Date denNgayXpbs) {
		this.denNgayXpbs = denNgayXpbs;
	}

	@Caption("DvThQd")
	@Column(name = "DV_TH_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDvThQd() {
		return this.dvThQd;
	}

	public void setDvThQd(Long dvThQd) {
		this.dvThQd = dvThQd;
	}

	@Caption("MaTinhThanhPho")
	@Column(name = "MA_TINH_THANH_PHO", columnDefinition = "VARCHAR2", length = 50)
	public String getMaTinhThanhPho() {
		return this.maTinhThanhPho;
	}

	public void setMaTinhThanhPho(String maTinhThanhPho) {
		this.maTinhThanhPho = maTinhThanhPho;
	}

	@Caption("MaDonVi")
	@Column(name = "MA_DON_VI", columnDefinition = "VARCHAR2", length = 50)
	public String getMaDonVi() {
		return this.maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}

	@Caption("NgaySinhNvpNhap")
	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Caption("CapDonVi")
	@Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getCapDonVi() {
		return this.capDonVi;
	}

	public void setCapDonVi(Long capDonVi) {
		this.capDonVi = capDonVi;
	}

	@Caption("SoQdThongbao")
	@Column(name = "SO_QD_THONGBAO", columnDefinition = "VARCHAR2", length = 20)
	public String getSoQdThongbao() {
		return this.soQdThongbao;
	}

	public void setSoQdThongbao(String soQdThongbao) {
		this.soQdThongbao = soQdThongbao;
	}

	@Caption("DonviNhanTb")
	@Column(name = "DONVI_NHAN_TB", columnDefinition = "VARCHAR2", length = 300)
	public String getDonviNhanTb() {
		return this.donviNhanTb;
	}

	public void setDonviNhanTb(String donviNhanTb) {
		this.donviNhanTb = donviNhanTb;
	}

	@Caption("XpbsId")
	@Column(name = "XPBS_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getXpbsId() {
		return this.xpbsId;
	}

	public void setXpbsId(Long xpbsId) {
		this.xpbsId = xpbsId;
	}

	@Caption("LinhVucGiaoThong")
	@Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLinhVucGiaoThong() {
		return this.linhVucGiaoThong;
	}

	public void setLinhVucGiaoThong(Long linhVucGiaoThong) {
		this.linhVucGiaoThong = linhVucGiaoThong;
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

	@Caption("SoBienLai")
	@Column(name = "SO_BIEN_LAI", columnDefinition = "VARCHAR2", length = 100)
	public String getSoBienLai() {
		return this.soBienLai;
	}

	public void setSoBienLai(String soBienLai) {
		this.soBienLai = soBienLai;
	}

	@Caption("NgayThanhToan")
	@Column(name = "NGAY_THANH_TOAN", columnDefinition = "VARCHAR2", length = 100)
	public String getNgayThanhToan() {
		return this.ngayThanhToan;
	}

	public void setNgayThanhToan(String ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}

	@Caption("NoiNopPhatId")
	@Column(name = "NOI_NOP_PHAT_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNoiNopPhatId() {
		return this.noiNopPhatId;
	}

	public void setNoiNopPhatId(Long noiNopPhatId) {
		this.noiNopPhatId = noiNopPhatId;
	}

	@Caption("DonViRaQdId")
	@Column(name = "DON_VI_RA_QD_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDonViRaQdId() {
		return this.donViRaQdId;
	}

	public void setDonViRaQdId(Long donViRaQdId) {
		this.donViRaQdId = donViRaQdId;
	}

}
