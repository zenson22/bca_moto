package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TestQdXpvphc01Id
 */
@Embeddable
public class TestQdXpvphc01Id implements java.io.Serializable {

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
	private String tangVatTg;
	private Long idTheoNam;
	private Long diaDanhHcId;
	private Long nhapQd;
	private Long trangThaiQd;
	private Long namLapQd;
	private Long toChuc;
	private Long tinhThanhId;
	private Long quocGiaId;
	private Long cancuNdId;
	private String bienKiemSoat;
	private String tgDiadiemVp;
	private String gioNhanQd;
	private String phutNhanQd;
	private Long linhVucGiaoThong;
	private String maVuViec;
	private String maThongTu;
	private String dobNvp;
	private String nguoiGiamHo;
	private Date ngayCanCuXphc;
	private String diaDiemLap;
	private String loaiPhuongTien;
	private Long loaiPhuongTienId;
	private String ngayThangVphc;
	private String thoiGianVphc;
	private String diaDiemVphc;

	public TestQdXpvphc01Id() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_QUYET_DINH", columnDefinition = "VARCHAR2", length = 50)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 100)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Column(name = "SO_BIEN_BAN_TC", columnDefinition = "VARCHAR2", length = 20)
	public String getSoBienBanTc() {
		return this.soBienBanTc;
	}

	public void setSoBienBanTc(String soBienBanTc) {
		this.soBienBanTc = soBienBanTc;
	}

	@Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 50)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Column(name = "NGAY_LAP_QD", columnDefinition = "DATE", length = 7)
	public Date getNgayLapQd() {
		return this.ngayLapQd;
	}

	public void setNgayLapQd(Date ngayLapQd) {
		this.ngayLapQd = ngayLapQd;
	}

	@Column(name = "CAN_CU_XLVPHC", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuXlvphc() {
		return this.canCuXlvphc;
	}

	public void setCanCuXlvphc(String canCuXlvphc) {
		this.canCuXlvphc = canCuXlvphc;
	}

	@Column(name = "CAN_CU_NGHI_DINH", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuNghiDinh() {
		return this.canCuNghiDinh;
	}

	public void setCanCuNghiDinh(String canCuNghiDinh) {
		this.canCuNghiDinh = canCuNghiDinh;
	}

	@Column(name = "CAN_CU_BIEN_BAN", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuBienBan() {
		return this.canCuBienBan;
	}

	public void setCanCuBienBan(String canCuBienBan) {
		this.canCuBienBan = canCuBienBan;
	}

	@Column(name = "CAN_CU_BB_GT", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuBbGt() {
		return this.canCuBbGt;
	}

	public void setCanCuBbGt(String canCuBbGt) {
		this.canCuBbGt = canCuBbGt;
	}

	@Column(name = "NGAY_THANG_GT", columnDefinition = "DATE", length = 7)
	public Date getNgayThangGt() {
		return this.ngayThangGt;
	}

	public void setNgayThangGt(Date ngayThangGt) {
		this.ngayThangGt = ngayThangGt;
	}

	@Column(name = "CAN_BO_RA_QD", columnDefinition = "VARCHAR2", length = 50)
	public String getCanBoRaQd() {
		return this.canBoRaQd;
	}

	public void setCanBoRaQd(String canBoRaQd) {
		this.canBoRaQd = canBoRaQd;
	}

	@Column(name = "CAN_BO_RA_QD_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCanBoRaQdId() {
		return this.canBoRaQdId;
	}

	public void setCanBoRaQdId(Long canBoRaQdId) {
		this.canBoRaQdId = canBoRaQdId;
	}

	@Column(name = "HINH_THUC_XP", columnDefinition = "VARCHAR2", length = 250)
	public String getHinhThucXp() {
		return this.hinhThucXp;
	}

	public void setHinhThucXp(String hinhThucXp) {
		this.hinhThucXp = hinhThucXp;
	}

	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiNvp() {
		return this.tenNguoiNvp;
	}

	public void setTenNguoiNvp(String tenNguoiNvp) {
		this.tenNguoiNvp = tenNguoiNvp;
	}

	@Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)
	public Date getNgaySinhNvp() {
		return this.ngaySinhNvp;
	}

	public void setNgaySinhNvp(Date ngaySinhNvp) {
		this.ngaySinhNvp = ngaySinhNvp;
	}

	@Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)
	public String getQuocTichNvp() {
		return this.quocTichNvp;
	}

	public void setQuocTichNvp(String quocTichNvp) {
		this.quocTichNvp = quocTichNvp;
	}

	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 500)
	public String getNgheNghiepNvp() {
		return this.ngheNghiepNvp;
	}

	public void setNgheNghiepNvp(String ngheNghiepNvp) {
		this.ngheNghiepNvp = ngheNghiepNvp;
	}

	@Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNvp() {
		return this.soCmndNvp;
	}

	public void setSoCmndNvp(String soCmndNvp) {
		this.soCmndNvp = soCmndNvp;
	}

	@Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmndNvp() {
		return this.ngayCapCmndNvp;
	}

	public void setNgayCapCmndNvp(Date ngayCapCmndNvp) {
		this.ngayCapCmndNvp = ngayCapCmndNvp;
	}

	@Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)
	public String getNoiCapCmndNvp() {
		return this.noiCapCmndNvp;
	}

	public void setNoiCapCmndNvp(String noiCapCmndNvp) {
		this.noiCapCmndNvp = noiCapCmndNvp;
	}

	@Column(name = "TN_GIAM_NHE", columnDefinition = "VARCHAR2", length = 100)
	public String getTnGiamNhe() {
		return this.tnGiamNhe;
	}

	public void setTnGiamNhe(String tnGiamNhe) {
		this.tnGiamNhe = tnGiamNhe;
	}

	@Column(name = "XU_PHAT_BO_SUNG", columnDefinition = "VARCHAR2", length = 200)
	public String getXuPhatBoSung() {
		return this.xuPhatBoSung;
	}

	public void setXuPhatBoSung(String xuPhatBoSung) {
		this.xuPhatBoSung = xuPhatBoSung;
	}

	@Column(name = "BIEN_PHAP_NGAN_CHAN", columnDefinition = "VARCHAR2", length = 200)
	public String getBienPhapNganChan() {
		return this.bienPhapNganChan;
	}

	public void setBienPhapNganChan(String bienPhapNganChan) {
		this.bienPhapNganChan = bienPhapNganChan;
	}

	@Column(name = "BIEN_PHAP_KHAC_PHUC", columnDefinition = "VARCHAR2", length = 200)
	public String getBienPhapKhacPhuc() {
		return this.bienPhapKhacPhuc;
	}

	public void setBienPhapKhacPhuc(String bienPhapKhacPhuc) {
		this.bienPhapKhacPhuc = bienPhapKhacPhuc;
	}

	@Column(name = "THOI_HAN_XPBS", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanXpbs() {
		return this.thoiHanXpbs;
	}

	public void setThoiHanXpbs(String thoiHanXpbs) {
		this.thoiHanXpbs = thoiHanXpbs;
	}

	@Column(name = "THOI_HAN_KPHQ", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanKphq() {
		return this.thoiHanKphq;
	}

	public void setThoiHanKphq(String thoiHanKphq) {
		this.thoiHanKphq = thoiHanKphq;
	}

	@Column(name = "KINH_PHI_KP", columnDefinition = "VARCHAR2", length = 20)
	public String getKinhPhiKp() {
		return this.kinhPhiKp;
	}

	public void setKinhPhiKp(String kinhPhiKp) {
		this.kinhPhiKp = kinhPhiKp;
	}

	@Column(name = "KINH_PHI_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getKinhPhiBangChu() {
		return this.kinhPhiBangChu;
	}

	public void setKinhPhiBangChu(String kinhPhiBangChu) {
		this.kinhPhiBangChu = kinhPhiBangChu;
	}

	@Column(name = "DON_VI_KP", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViKp() {
		return this.donViKp;
	}

	public void setDonViKp(String donViKp) {
		this.donViKp = donViKp;
	}

	@Column(name = "TONG_MUC_PHAT", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTongMucPhat() {
		return this.tongMucPhat;
	}

	public void setTongMucPhat(Long tongMucPhat) {
		this.tongMucPhat = tongMucPhat;
	}

	@Column(name = "MUC_PHAT_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getMucPhatBangChu() {
		return this.mucPhatBangChu;
	}

	public void setMucPhatBangChu(String mucPhatBangChu) {
		this.mucPhatBangChu = mucPhatBangChu;
	}

	@Column(name = "NGAY_HIEU_LUC", columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Column(name = "DIA_CHI_NOP_TIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaChiNopTien() {
		return this.diaChiNopTien;
	}

	public void setDiaChiNopTien(String diaChiNopTien) {
		this.diaChiNopTien = diaChiNopTien;
	}

	@Column(name = "THOI_HAN_NOP_PHAT", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanNopPhat() {
		return this.thoiHanNopPhat;
	}

	public void setThoiHanNopPhat(String thoiHanNopPhat) {
		this.thoiHanNopPhat = thoiHanNopPhat;
	}

	@Column(name = "DON_VI_THU_TIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getDonViThuTien() {
		return this.donViThuTien;
	}

	public void setDonViThuTien(String donViThuTien) {
		this.donViThuTien = donViThuTien;
	}

	@Column(name = "DV_THI_HANH_QD", columnDefinition = "VARCHAR2", length = 100)
	public String getDvThiHanhQd() {
		return this.dvThiHanhQd;
	}

	public void setDvThiHanhQd(String dvThiHanhQd) {
		this.dvThiHanhQd = dvThiHanhQd;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "CAP_TREN_PHE_DUYET", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapTrenPheDuyet() {
		return this.capTrenPheDuyet;
	}

	public void setCapTrenPheDuyet(Long capTrenPheDuyet) {
		this.capTrenPheDuyet = capTrenPheDuyet;
	}

	@Column(name = "CAP_DUOI_KY_NHAY", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapDuoiKyNhay() {
		return this.capDuoiKyNhay;
	}

	public void setCapDuoiKyNhay(Long capDuoiKyNhay) {
		this.capDuoiKyNhay = capDuoiKyNhay;
	}

	@Column(name = "CAN_BO_NHAN_XU_LY", columnDefinition = "VARCHAR2", length = 70)
	public String getCanBoNhanXuLy() {
		return this.canBoNhanXuLy;
	}

	public void setCanBoNhanXuLy(String canBoNhanXuLy) {
		this.canBoNhanXuLy = canBoNhanXuLy;
	}

	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
	}

	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Column(name = "NGAY_LAP_BB", columnDefinition = "VARCHAR2", length = 20)
	public String getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(String ngayLapBb) {
		this.ngayLapBb = ngayLapBb;
	}

	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Column(name = "HANH_VI_VP", columnDefinition = "VARCHAR2", length = 4000)
	public String getHanhViVp() {
		return this.hanhViVp;
	}

	public void setHanhViVp(String hanhViVp) {
		this.hanhViVp = hanhViVp;
	}

	@Column(name = "TANG_VAT_TG", columnDefinition = "VARCHAR2", length = 500)
	public String getTangVatTg() {
		return this.tangVatTg;
	}

	public void setTangVatTg(String tangVatTg) {
		this.tangVatTg = tangVatTg;
	}

	@Column(name = "ID_THEO_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdTheoNam() {
		return this.idTheoNam;
	}

	public void setIdTheoNam(Long idTheoNam) {
		this.idTheoNam = idTheoNam;
	}

	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Column(name = "NHAP_QD", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapQd() {
		return this.nhapQd;
	}

	public void setNhapQd(Long nhapQd) {
		this.nhapQd = nhapQd;
	}

	@Column(name = "TRANG_THAI_QD", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiQd() {
		return this.trangThaiQd;
	}

	public void setTrangThaiQd(Long trangThaiQd) {
		this.trangThaiQd = trangThaiQd;
	}

	@Column(name = "NAM_LAP_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamLapQd() {
		return this.namLapQd;
	}

	public void setNamLapQd(Long namLapQd) {
		this.namLapQd = namLapQd;
	}

	@Column(name = "TO_CHUC", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getToChuc() {
		return this.toChuc;
	}

	public void setToChuc(Long toChuc) {
		this.toChuc = toChuc;
	}

	@Column(name = "TINH_THANH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTinhThanhId() {
		return this.tinhThanhId;
	}

	public void setTinhThanhId(Long tinhThanhId) {
		this.tinhThanhId = tinhThanhId;
	}

	@Column(name = "QUOC_GIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getQuocGiaId() {
		return this.quocGiaId;
	}

	public void setQuocGiaId(Long quocGiaId) {
		this.quocGiaId = quocGiaId;
	}

	@Column(name = "CANCU_ND_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCancuNdId() {
		return this.cancuNdId;
	}

	public void setCancuNdId(Long cancuNdId) {
		this.cancuNdId = cancuNdId;
	}

	@Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 20)
	public String getBienKiemSoat() {
		return this.bienKiemSoat;
	}

	public void setBienKiemSoat(String bienKiemSoat) {
		this.bienKiemSoat = bienKiemSoat;
	}

	@Column(name = "TG_DIADIEM_VP", columnDefinition = "VARCHAR2", length = 500)
	public String getTgDiadiemVp() {
		return this.tgDiadiemVp;
	}

	public void setTgDiadiemVp(String tgDiadiemVp) {
		this.tgDiadiemVp = tgDiadiemVp;
	}

	@Column(name = "GIO_NHAN_QD", columnDefinition = "VARCHAR2", length = 20)
	public String getGioNhanQd() {
		return this.gioNhanQd;
	}

	public void setGioNhanQd(String gioNhanQd) {
		this.gioNhanQd = gioNhanQd;
	}

	@Column(name = "PHUT_NHAN_QD", columnDefinition = "VARCHAR2", length = 20)
	public String getPhutNhanQd() {
		return this.phutNhanQd;
	}

	public void setPhutNhanQd(String phutNhanQd) {
		this.phutNhanQd = phutNhanQd;
	}

	@Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLinhVucGiaoThong() {
		return this.linhVucGiaoThong;
	}

	public void setLinhVucGiaoThong(Long linhVucGiaoThong) {
		this.linhVucGiaoThong = linhVucGiaoThong;
	}

	@Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)
	public String getMaVuViec() {
		return this.maVuViec;
	}

	public void setMaVuViec(String maVuViec) {
		this.maVuViec = maVuViec;
	}

	@Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)
	public String getMaThongTu() {
		return this.maThongTu;
	}

	public void setMaThongTu(String maThongTu) {
		this.maThongTu = maThongTu;
	}

	@Column(name = "DOB_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getDobNvp() {
		return this.dobNvp;
	}

	public void setDobNvp(String dobNvp) {
		this.dobNvp = dobNvp;
	}

	@Column(name = "NGUOI_GIAM_HO", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiGiamHo() {
		return this.nguoiGiamHo;
	}

	public void setNguoiGiamHo(String nguoiGiamHo) {
		this.nguoiGiamHo = nguoiGiamHo;
	}

	@Column(name = "NGAY_CAN_CU_XPHC", columnDefinition = "DATE", length = 7)
	public Date getNgayCanCuXphc() {
		return this.ngayCanCuXphc;
	}

	public void setNgayCanCuXphc(Date ngayCanCuXphc) {
		this.ngayCanCuXphc = ngayCanCuXphc;
	}

	@Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDiemLap() {
		return this.diaDiemLap;
	}

	public void setDiaDiemLap(String diaDiemLap) {
		this.diaDiemLap = diaDiemLap;
	}

	@Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getLoaiPhuongTien() {
		return this.loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	@Column(name = "LOAI_PHUONG_TIEN_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLoaiPhuongTienId() {
		return this.loaiPhuongTienId;
	}

	public void setLoaiPhuongTienId(Long loaiPhuongTienId) {
		this.loaiPhuongTienId = loaiPhuongTienId;
	}

	@Column(name = "NGAY_THANG_VPHC", columnDefinition = "VARCHAR2", length = 80)
	public String getNgayThangVphc() {
		return this.ngayThangVphc;
	}

	public void setNgayThangVphc(String ngayThangVphc) {
		this.ngayThangVphc = ngayThangVphc;
	}

	@Column(name = "THOI_GIAN_VPHC", columnDefinition = "VARCHAR2", length = 80)
	public String getThoiGianVphc() {
		return this.thoiGianVphc;
	}

	public void setThoiGianVphc(String thoiGianVphc) {
		this.thoiGianVphc = thoiGianVphc;
	}

	@Column(name = "DIA_DIEM_VPHC", columnDefinition = "VARCHAR2", length = 2000)
	public String getDiaDiemVphc() {
		return this.diaDiemVphc;
	}

	public void setDiaDiemVphc(String diaDiemVphc) {
		this.diaDiemVphc = diaDiemVphc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TestQdXpvphc01Id))
			return false;
		TestQdXpvphc01Id castOther = (TestQdXpvphc01Id) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoQuyetDinh() == castOther.getSoQuyetDinh())
						|| (this.getSoQuyetDinh() != null && castOther.getSoQuyetDinh() != null
								&& this.getSoQuyetDinh().equals(castOther.getSoQuyetDinh())))
				&& ((this.getTenCqCapTren() == castOther.getTenCqCapTren())
						|| (this.getTenCqCapTren() != null && castOther.getTenCqCapTren() != null
								&& this.getTenCqCapTren().equals(castOther.getTenCqCapTren())))
				&& ((this.getTenDonVi() == castOther.getTenDonVi()) || (this.getTenDonVi() != null
						&& castOther.getTenDonVi() != null && this.getTenDonVi().equals(castOther.getTenDonVi())))
				&& ((this.getSoBienBanTc() == castOther.getSoBienBanTc())
						|| (this.getSoBienBanTc() != null && castOther.getSoBienBanTc() != null
								&& this.getSoBienBanTc().equals(castOther.getSoBienBanTc())))
				&& ((this.getDiaDanhHc() == castOther.getDiaDanhHc()) || (this.getDiaDanhHc() != null
						&& castOther.getDiaDanhHc() != null && this.getDiaDanhHc().equals(castOther.getDiaDanhHc())))
				&& ((this.getNgayLapQd() == castOther.getNgayLapQd()) || (this.getNgayLapQd() != null
						&& castOther.getNgayLapQd() != null && this.getNgayLapQd().equals(castOther.getNgayLapQd())))
				&& ((this.getCanCuXlvphc() == castOther.getCanCuXlvphc())
						|| (this.getCanCuXlvphc() != null && castOther.getCanCuXlvphc() != null
								&& this.getCanCuXlvphc().equals(castOther.getCanCuXlvphc())))
				&& ((this.getCanCuNghiDinh() == castOther.getCanCuNghiDinh())
						|| (this.getCanCuNghiDinh() != null && castOther.getCanCuNghiDinh() != null
								&& this.getCanCuNghiDinh().equals(castOther.getCanCuNghiDinh())))
				&& ((this.getCanCuBienBan() == castOther.getCanCuBienBan())
						|| (this.getCanCuBienBan() != null && castOther.getCanCuBienBan() != null
								&& this.getCanCuBienBan().equals(castOther.getCanCuBienBan())))
				&& ((this.getCanCuBbGt() == castOther.getCanCuBbGt()) || (this.getCanCuBbGt() != null
						&& castOther.getCanCuBbGt() != null && this.getCanCuBbGt().equals(castOther.getCanCuBbGt())))
				&& ((this.getNgayThangGt() == castOther.getNgayThangGt())
						|| (this.getNgayThangGt() != null && castOther.getNgayThangGt() != null
								&& this.getNgayThangGt().equals(castOther.getNgayThangGt())))
				&& ((this.getCanBoRaQd() == castOther.getCanBoRaQd()) || (this.getCanBoRaQd() != null
						&& castOther.getCanBoRaQd() != null && this.getCanBoRaQd().equals(castOther.getCanBoRaQd())))
				&& ((this.getCanBoRaQdId() == castOther.getCanBoRaQdId())
						|| (this.getCanBoRaQdId() != null && castOther.getCanBoRaQdId() != null
								&& this.getCanBoRaQdId().equals(castOther.getCanBoRaQdId())))
				&& ((this.getHinhThucXp() == castOther.getHinhThucXp()) || (this.getHinhThucXp() != null
						&& castOther.getHinhThucXp() != null && this.getHinhThucXp().equals(castOther.getHinhThucXp())))
				&& ((this.getTenNguoiNvp() == castOther.getTenNguoiNvp())
						|| (this.getTenNguoiNvp() != null && castOther.getTenNguoiNvp() != null
								&& this.getTenNguoiNvp().equals(castOther.getTenNguoiNvp())))
				&& ((this.getNgaySinhNvp() == castOther.getNgaySinhNvp())
						|| (this.getNgaySinhNvp() != null && castOther.getNgaySinhNvp() != null
								&& this.getNgaySinhNvp().equals(castOther.getNgaySinhNvp())))
				&& ((this.getQuocTichNvp() == castOther.getQuocTichNvp())
						|| (this.getQuocTichNvp() != null && castOther.getQuocTichNvp() != null
								&& this.getQuocTichNvp().equals(castOther.getQuocTichNvp())))
				&& ((this.getNgheNghiepNvp() == castOther.getNgheNghiepNvp())
						|| (this.getNgheNghiepNvp() != null && castOther.getNgheNghiepNvp() != null
								&& this.getNgheNghiepNvp().equals(castOther.getNgheNghiepNvp())))
				&& ((this.getSoCmndNvp() == castOther.getSoCmndNvp()) || (this.getSoCmndNvp() != null
						&& castOther.getSoCmndNvp() != null && this.getSoCmndNvp().equals(castOther.getSoCmndNvp())))
				&& ((this.getNgayCapCmndNvp() == castOther.getNgayCapCmndNvp())
						|| (this.getNgayCapCmndNvp() != null && castOther.getNgayCapCmndNvp() != null
								&& this.getNgayCapCmndNvp().equals(castOther.getNgayCapCmndNvp())))
				&& ((this.getNoiCapCmndNvp() == castOther.getNoiCapCmndNvp())
						|| (this.getNoiCapCmndNvp() != null && castOther.getNoiCapCmndNvp() != null
								&& this.getNoiCapCmndNvp().equals(castOther.getNoiCapCmndNvp())))
				&& ((this.getTnGiamNhe() == castOther.getTnGiamNhe()) || (this.getTnGiamNhe() != null
						&& castOther.getTnGiamNhe() != null && this.getTnGiamNhe().equals(castOther.getTnGiamNhe())))
				&& ((this.getXuPhatBoSung() == castOther.getXuPhatBoSung())
						|| (this.getXuPhatBoSung() != null && castOther.getXuPhatBoSung() != null
								&& this.getXuPhatBoSung().equals(castOther.getXuPhatBoSung())))
				&& ((this.getBienPhapNganChan() == castOther.getBienPhapNganChan())
						|| (this.getBienPhapNganChan() != null && castOther.getBienPhapNganChan() != null
								&& this.getBienPhapNganChan().equals(castOther.getBienPhapNganChan())))
				&& ((this.getBienPhapKhacPhuc() == castOther.getBienPhapKhacPhuc())
						|| (this.getBienPhapKhacPhuc() != null && castOther.getBienPhapKhacPhuc() != null
								&& this.getBienPhapKhacPhuc().equals(castOther.getBienPhapKhacPhuc())))
				&& ((this.getThoiHanXpbs() == castOther.getThoiHanXpbs())
						|| (this.getThoiHanXpbs() != null && castOther.getThoiHanXpbs() != null
								&& this.getThoiHanXpbs().equals(castOther.getThoiHanXpbs())))
				&& ((this.getThoiHanKphq() == castOther.getThoiHanKphq())
						|| (this.getThoiHanKphq() != null && castOther.getThoiHanKphq() != null
								&& this.getThoiHanKphq().equals(castOther.getThoiHanKphq())))
				&& ((this.getKinhPhiKp() == castOther.getKinhPhiKp()) || (this.getKinhPhiKp() != null
						&& castOther.getKinhPhiKp() != null && this.getKinhPhiKp().equals(castOther.getKinhPhiKp())))
				&& ((this.getKinhPhiBangChu() == castOther.getKinhPhiBangChu())
						|| (this.getKinhPhiBangChu() != null && castOther.getKinhPhiBangChu() != null
								&& this.getKinhPhiBangChu().equals(castOther.getKinhPhiBangChu())))
				&& ((this.getDonViKp() == castOther.getDonViKp()) || (this.getDonViKp() != null
						&& castOther.getDonViKp() != null && this.getDonViKp().equals(castOther.getDonViKp())))
				&& ((this.getTongMucPhat() == castOther.getTongMucPhat())
						|| (this.getTongMucPhat() != null && castOther.getTongMucPhat() != null
								&& this.getTongMucPhat().equals(castOther.getTongMucPhat())))
				&& ((this.getMucPhatBangChu() == castOther.getMucPhatBangChu())
						|| (this.getMucPhatBangChu() != null && castOther.getMucPhatBangChu() != null
								&& this.getMucPhatBangChu().equals(castOther.getMucPhatBangChu())))
				&& ((this.getNgayHieuLuc() == castOther.getNgayHieuLuc())
						|| (this.getNgayHieuLuc() != null && castOther.getNgayHieuLuc() != null
								&& this.getNgayHieuLuc().equals(castOther.getNgayHieuLuc())))
				&& ((this.getDiaChiNopTien() == castOther.getDiaChiNopTien())
						|| (this.getDiaChiNopTien() != null && castOther.getDiaChiNopTien() != null
								&& this.getDiaChiNopTien().equals(castOther.getDiaChiNopTien())))
				&& ((this.getThoiHanNopPhat() == castOther.getThoiHanNopPhat())
						|| (this.getThoiHanNopPhat() != null && castOther.getThoiHanNopPhat() != null
								&& this.getThoiHanNopPhat().equals(castOther.getThoiHanNopPhat())))
				&& ((this.getDonViThuTien() == castOther.getDonViThuTien())
						|| (this.getDonViThuTien() != null && castOther.getDonViThuTien() != null
								&& this.getDonViThuTien().equals(castOther.getDonViThuTien())))
				&& ((this.getDvThiHanhQd() == castOther.getDvThiHanhQd())
						|| (this.getDvThiHanhQd() != null && castOther.getDvThiHanhQd() != null
								&& this.getDvThiHanhQd().equals(castOther.getDvThiHanhQd())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getCapTrenPheDuyet() == castOther.getCapTrenPheDuyet())
						|| (this.getCapTrenPheDuyet() != null && castOther.getCapTrenPheDuyet() != null
								&& this.getCapTrenPheDuyet().equals(castOther.getCapTrenPheDuyet())))
				&& ((this.getCapDuoiKyNhay() == castOther.getCapDuoiKyNhay())
						|| (this.getCapDuoiKyNhay() != null && castOther.getCapDuoiKyNhay() != null
								&& this.getCapDuoiKyNhay().equals(castOther.getCapDuoiKyNhay())))
				&& ((this.getCanBoNhanXuLy() == castOther.getCanBoNhanXuLy())
						|| (this.getCanBoNhanXuLy() != null && castOther.getCanBoNhanXuLy() != null
								&& this.getCanBoNhanXuLy().equals(castOther.getCanBoNhanXuLy())))
				&& ((this.getCbxlId() == castOther.getCbxlId()) || (this.getCbxlId() != null
						&& castOther.getCbxlId() != null && this.getCbxlId().equals(castOther.getCbxlId())))
				&& ((this.getCapBacChucVu() == castOther.getCapBacChucVu())
						|| (this.getCapBacChucVu() != null && castOther.getCapBacChucVu() != null
								&& this.getCapBacChucVu().equals(castOther.getCapBacChucVu())))
				&& ((this.getNgayLapBb() == castOther.getNgayLapBb()) || (this.getNgayLapBb() != null
						&& castOther.getNgayLapBb() != null && this.getNgayLapBb().equals(castOther.getNgayLapBb())))
				&& ((this.getDiaChiNvp() == castOther.getDiaChiNvp()) || (this.getDiaChiNvp() != null
						&& castOther.getDiaChiNvp() != null && this.getDiaChiNvp().equals(castOther.getDiaChiNvp())))
				&& ((this.getHanhViVp() == castOther.getHanhViVp()) || (this.getHanhViVp() != null
						&& castOther.getHanhViVp() != null && this.getHanhViVp().equals(castOther.getHanhViVp())))
				&& ((this.getTangVatTg() == castOther.getTangVatTg()) || (this.getTangVatTg() != null
						&& castOther.getTangVatTg() != null && this.getTangVatTg().equals(castOther.getTangVatTg())))
				&& ((this.getIdTheoNam() == castOther.getIdTheoNam()) || (this.getIdTheoNam() != null
						&& castOther.getIdTheoNam() != null && this.getIdTheoNam().equals(castOther.getIdTheoNam())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getNhapQd() == castOther.getNhapQd()) || (this.getNhapQd() != null
						&& castOther.getNhapQd() != null && this.getNhapQd().equals(castOther.getNhapQd())))
				&& ((this.getTrangThaiQd() == castOther.getTrangThaiQd())
						|| (this.getTrangThaiQd() != null && castOther.getTrangThaiQd() != null
								&& this.getTrangThaiQd().equals(castOther.getTrangThaiQd())))
				&& ((this.getNamLapQd() == castOther.getNamLapQd()) || (this.getNamLapQd() != null
						&& castOther.getNamLapQd() != null && this.getNamLapQd().equals(castOther.getNamLapQd())))
				&& ((this.getToChuc() == castOther.getToChuc()) || (this.getToChuc() != null
						&& castOther.getToChuc() != null && this.getToChuc().equals(castOther.getToChuc())))
				&& ((this.getTinhThanhId() == castOther.getTinhThanhId())
						|| (this.getTinhThanhId() != null && castOther.getTinhThanhId() != null
								&& this.getTinhThanhId().equals(castOther.getTinhThanhId())))
				&& ((this.getQuocGiaId() == castOther.getQuocGiaId()) || (this.getQuocGiaId() != null
						&& castOther.getQuocGiaId() != null && this.getQuocGiaId().equals(castOther.getQuocGiaId())))
				&& ((this.getCancuNdId() == castOther.getCancuNdId()) || (this.getCancuNdId() != null
						&& castOther.getCancuNdId() != null && this.getCancuNdId().equals(castOther.getCancuNdId())))
				&& ((this.getBienKiemSoat() == castOther.getBienKiemSoat())
						|| (this.getBienKiemSoat() != null && castOther.getBienKiemSoat() != null
								&& this.getBienKiemSoat().equals(castOther.getBienKiemSoat())))
				&& ((this.getTgDiadiemVp() == castOther.getTgDiadiemVp())
						|| (this.getTgDiadiemVp() != null && castOther.getTgDiadiemVp() != null
								&& this.getTgDiadiemVp().equals(castOther.getTgDiadiemVp())))
				&& ((this.getGioNhanQd() == castOther.getGioNhanQd()) || (this.getGioNhanQd() != null
						&& castOther.getGioNhanQd() != null && this.getGioNhanQd().equals(castOther.getGioNhanQd())))
				&& ((this.getPhutNhanQd() == castOther.getPhutNhanQd()) || (this.getPhutNhanQd() != null
						&& castOther.getPhutNhanQd() != null && this.getPhutNhanQd().equals(castOther.getPhutNhanQd())))
				&& ((this.getLinhVucGiaoThong() == castOther.getLinhVucGiaoThong())
						|| (this.getLinhVucGiaoThong() != null && castOther.getLinhVucGiaoThong() != null
								&& this.getLinhVucGiaoThong().equals(castOther.getLinhVucGiaoThong())))
				&& ((this.getMaVuViec() == castOther.getMaVuViec()) || (this.getMaVuViec() != null
						&& castOther.getMaVuViec() != null && this.getMaVuViec().equals(castOther.getMaVuViec())))
				&& ((this.getMaThongTu() == castOther.getMaThongTu()) || (this.getMaThongTu() != null
						&& castOther.getMaThongTu() != null && this.getMaThongTu().equals(castOther.getMaThongTu())))
				&& ((this.getDobNvp() == castOther.getDobNvp()) || (this.getDobNvp() != null
						&& castOther.getDobNvp() != null && this.getDobNvp().equals(castOther.getDobNvp())))
				&& ((this.getNguoiGiamHo() == castOther.getNguoiGiamHo())
						|| (this.getNguoiGiamHo() != null && castOther.getNguoiGiamHo() != null
								&& this.getNguoiGiamHo().equals(castOther.getNguoiGiamHo())))
				&& ((this.getNgayCanCuXphc() == castOther.getNgayCanCuXphc())
						|| (this.getNgayCanCuXphc() != null && castOther.getNgayCanCuXphc() != null
								&& this.getNgayCanCuXphc().equals(castOther.getNgayCanCuXphc())))
				&& ((this.getDiaDiemLap() == castOther.getDiaDiemLap()) || (this.getDiaDiemLap() != null
						&& castOther.getDiaDiemLap() != null && this.getDiaDiemLap().equals(castOther.getDiaDiemLap())))
				&& ((this.getLoaiPhuongTien() == castOther.getLoaiPhuongTien())
						|| (this.getLoaiPhuongTien() != null && castOther.getLoaiPhuongTien() != null
								&& this.getLoaiPhuongTien().equals(castOther.getLoaiPhuongTien())))
				&& ((this.getLoaiPhuongTienId() == castOther.getLoaiPhuongTienId())
						|| (this.getLoaiPhuongTienId() != null && castOther.getLoaiPhuongTienId() != null
								&& this.getLoaiPhuongTienId().equals(castOther.getLoaiPhuongTienId())))
				&& ((this.getNgayThangVphc() == castOther.getNgayThangVphc())
						|| (this.getNgayThangVphc() != null && castOther.getNgayThangVphc() != null
								&& this.getNgayThangVphc().equals(castOther.getNgayThangVphc())))
				&& ((this.getThoiGianVphc() == castOther.getThoiGianVphc())
						|| (this.getThoiGianVphc() != null && castOther.getThoiGianVphc() != null
								&& this.getThoiGianVphc().equals(castOther.getThoiGianVphc())))
				&& ((this.getDiaDiemVphc() == castOther.getDiaDiemVphc())
						|| (this.getDiaDiemVphc() != null && castOther.getDiaDiemVphc() != null
								&& this.getDiaDiemVphc().equals(castOther.getDiaDiemVphc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoQuyetDinh() == null ? 0 : this.getSoQuyetDinh().hashCode());
		result = 37 * result + (getTenCqCapTren() == null ? 0 : this.getTenCqCapTren().hashCode());
		result = 37 * result + (getTenDonVi() == null ? 0 : this.getTenDonVi().hashCode());
		result = 37 * result + (getSoBienBanTc() == null ? 0 : this.getSoBienBanTc().hashCode());
		result = 37 * result + (getDiaDanhHc() == null ? 0 : this.getDiaDanhHc().hashCode());
		result = 37 * result + (getNgayLapQd() == null ? 0 : this.getNgayLapQd().hashCode());
		result = 37 * result + (getCanCuXlvphc() == null ? 0 : this.getCanCuXlvphc().hashCode());
		result = 37 * result + (getCanCuNghiDinh() == null ? 0 : this.getCanCuNghiDinh().hashCode());
		result = 37 * result + (getCanCuBienBan() == null ? 0 : this.getCanCuBienBan().hashCode());
		result = 37 * result + (getCanCuBbGt() == null ? 0 : this.getCanCuBbGt().hashCode());
		result = 37 * result + (getNgayThangGt() == null ? 0 : this.getNgayThangGt().hashCode());
		result = 37 * result + (getCanBoRaQd() == null ? 0 : this.getCanBoRaQd().hashCode());
		result = 37 * result + (getCanBoRaQdId() == null ? 0 : this.getCanBoRaQdId().hashCode());
		result = 37 * result + (getHinhThucXp() == null ? 0 : this.getHinhThucXp().hashCode());
		result = 37 * result + (getTenNguoiNvp() == null ? 0 : this.getTenNguoiNvp().hashCode());
		result = 37 * result + (getNgaySinhNvp() == null ? 0 : this.getNgaySinhNvp().hashCode());
		result = 37 * result + (getQuocTichNvp() == null ? 0 : this.getQuocTichNvp().hashCode());
		result = 37 * result + (getNgheNghiepNvp() == null ? 0 : this.getNgheNghiepNvp().hashCode());
		result = 37 * result + (getSoCmndNvp() == null ? 0 : this.getSoCmndNvp().hashCode());
		result = 37 * result + (getNgayCapCmndNvp() == null ? 0 : this.getNgayCapCmndNvp().hashCode());
		result = 37 * result + (getNoiCapCmndNvp() == null ? 0 : this.getNoiCapCmndNvp().hashCode());
		result = 37 * result + (getTnGiamNhe() == null ? 0 : this.getTnGiamNhe().hashCode());
		result = 37 * result + (getXuPhatBoSung() == null ? 0 : this.getXuPhatBoSung().hashCode());
		result = 37 * result + (getBienPhapNganChan() == null ? 0 : this.getBienPhapNganChan().hashCode());
		result = 37 * result + (getBienPhapKhacPhuc() == null ? 0 : this.getBienPhapKhacPhuc().hashCode());
		result = 37 * result + (getThoiHanXpbs() == null ? 0 : this.getThoiHanXpbs().hashCode());
		result = 37 * result + (getThoiHanKphq() == null ? 0 : this.getThoiHanKphq().hashCode());
		result = 37 * result + (getKinhPhiKp() == null ? 0 : this.getKinhPhiKp().hashCode());
		result = 37 * result + (getKinhPhiBangChu() == null ? 0 : this.getKinhPhiBangChu().hashCode());
		result = 37 * result + (getDonViKp() == null ? 0 : this.getDonViKp().hashCode());
		result = 37 * result + (getTongMucPhat() == null ? 0 : this.getTongMucPhat().hashCode());
		result = 37 * result + (getMucPhatBangChu() == null ? 0 : this.getMucPhatBangChu().hashCode());
		result = 37 * result + (getNgayHieuLuc() == null ? 0 : this.getNgayHieuLuc().hashCode());
		result = 37 * result + (getDiaChiNopTien() == null ? 0 : this.getDiaChiNopTien().hashCode());
		result = 37 * result + (getThoiHanNopPhat() == null ? 0 : this.getThoiHanNopPhat().hashCode());
		result = 37 * result + (getDonViThuTien() == null ? 0 : this.getDonViThuTien().hashCode());
		result = 37 * result + (getDvThiHanhQd() == null ? 0 : this.getDvThiHanhQd().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getCapTrenPheDuyet() == null ? 0 : this.getCapTrenPheDuyet().hashCode());
		result = 37 * result + (getCapDuoiKyNhay() == null ? 0 : this.getCapDuoiKyNhay().hashCode());
		result = 37 * result + (getCanBoNhanXuLy() == null ? 0 : this.getCanBoNhanXuLy().hashCode());
		result = 37 * result + (getCbxlId() == null ? 0 : this.getCbxlId().hashCode());
		result = 37 * result + (getCapBacChucVu() == null ? 0 : this.getCapBacChucVu().hashCode());
		result = 37 * result + (getNgayLapBb() == null ? 0 : this.getNgayLapBb().hashCode());
		result = 37 * result + (getDiaChiNvp() == null ? 0 : this.getDiaChiNvp().hashCode());
		result = 37 * result + (getHanhViVp() == null ? 0 : this.getHanhViVp().hashCode());
		result = 37 * result + (getTangVatTg() == null ? 0 : this.getTangVatTg().hashCode());
		result = 37 * result + (getIdTheoNam() == null ? 0 : this.getIdTheoNam().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getNhapQd() == null ? 0 : this.getNhapQd().hashCode());
		result = 37 * result + (getTrangThaiQd() == null ? 0 : this.getTrangThaiQd().hashCode());
		result = 37 * result + (getNamLapQd() == null ? 0 : this.getNamLapQd().hashCode());
		result = 37 * result + (getToChuc() == null ? 0 : this.getToChuc().hashCode());
		result = 37 * result + (getTinhThanhId() == null ? 0 : this.getTinhThanhId().hashCode());
		result = 37 * result + (getQuocGiaId() == null ? 0 : this.getQuocGiaId().hashCode());
		result = 37 * result + (getCancuNdId() == null ? 0 : this.getCancuNdId().hashCode());
		result = 37 * result + (getBienKiemSoat() == null ? 0 : this.getBienKiemSoat().hashCode());
		result = 37 * result + (getTgDiadiemVp() == null ? 0 : this.getTgDiadiemVp().hashCode());
		result = 37 * result + (getGioNhanQd() == null ? 0 : this.getGioNhanQd().hashCode());
		result = 37 * result + (getPhutNhanQd() == null ? 0 : this.getPhutNhanQd().hashCode());
		result = 37 * result + (getLinhVucGiaoThong() == null ? 0 : this.getLinhVucGiaoThong().hashCode());
		result = 37 * result + (getMaVuViec() == null ? 0 : this.getMaVuViec().hashCode());
		result = 37 * result + (getMaThongTu() == null ? 0 : this.getMaThongTu().hashCode());
		result = 37 * result + (getDobNvp() == null ? 0 : this.getDobNvp().hashCode());
		result = 37 * result + (getNguoiGiamHo() == null ? 0 : this.getNguoiGiamHo().hashCode());
		result = 37 * result + (getNgayCanCuXphc() == null ? 0 : this.getNgayCanCuXphc().hashCode());
		result = 37 * result + (getDiaDiemLap() == null ? 0 : this.getDiaDiemLap().hashCode());
		result = 37 * result + (getLoaiPhuongTien() == null ? 0 : this.getLoaiPhuongTien().hashCode());
		result = 37 * result + (getLoaiPhuongTienId() == null ? 0 : this.getLoaiPhuongTienId().hashCode());
		result = 37 * result + (getNgayThangVphc() == null ? 0 : this.getNgayThangVphc().hashCode());
		result = 37 * result + (getThoiGianVphc() == null ? 0 : this.getThoiGianVphc().hashCode());
		result = 37 * result + (getDiaDiemVphc() == null ? 0 : this.getDiaDiemVphc().hashCode());
		return result;
	}

}
