package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QdXpvphc02BakId
 */
@Embeddable
public class QdXpvphc02BakId implements java.io.Serializable {

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
	private long canBoRaQdId;
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

	public QdXpvphc02BakId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 30)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Column(name = "TEN_CQ_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Column(name = "TEN_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Column(name = "SO_BIEN_BAN_TC", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getSoBienBanTc() {
		return this.soBienBanTc;
	}

	public void setSoBienBanTc(String soBienBanTc) {
		this.soBienBanTc = soBienBanTc;
	}

	@Column(name = "DIA_DANH_HC", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Column(name = "NGAY_LAP_QD", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayLapQd() {
		return this.ngayLapQd;
	}

	public void setNgayLapQd(Date ngayLapQd) {
		this.ngayLapQd = ngayLapQd;
	}

	@Column(name = "CAN_CU_XLVPHC", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuXlvphc() {
		return this.canCuXlvphc;
	}

	public void setCanCuXlvphc(String canCuXlvphc) {
		this.canCuXlvphc = canCuXlvphc;
	}

	@Column(name = "CAN_CU_NGHI_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuNghiDinh() {
		return this.canCuNghiDinh;
	}

	public void setCanCuNghiDinh(String canCuNghiDinh) {
		this.canCuNghiDinh = canCuNghiDinh;
	}

	@Column(name = "CAN_CU_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 200)
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

	@Column(name = "CAN_BO_RA_QD", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getCanBoRaQd() {
		return this.canBoRaQd;
	}

	public void setCanBoRaQd(String canBoRaQd) {
		this.canBoRaQd = canBoRaQd;
	}

	@Column(name = "CAN_BO_RA_QD_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanBoRaQdId() {
		return this.canBoRaQdId;
	}

	public void setCanBoRaQdId(long canBoRaQdId) {
		this.canBoRaQdId = canBoRaQdId;
	}

	@Column(name = "HINH_THUC_XP", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getHinhThucXp() {
		return this.hinhThucXp;
	}

	public void setHinhThucXp(String hinhThucXp) {
		this.hinhThucXp = hinhThucXp;
	}

	@Column(name = "TEN_NGUOI_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 50)
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

	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 50)
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

	@Column(name = "NGAY_HIEU_LUC", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Column(name = "DIA_CHI_NOP_TIEN", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getDiaChiNopTien() {
		return this.diaChiNopTien;
	}

	public void setDiaChiNopTien(String diaChiNopTien) {
		this.diaChiNopTien = diaChiNopTien;
	}

	@Column(name = "THOI_HAN_NOP_PHAT", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanNopPhat() {
		return this.thoiHanNopPhat;
	}

	public void setThoiHanNopPhat(String thoiHanNopPhat) {
		this.thoiHanNopPhat = thoiHanNopPhat;
	}

	@Column(name = "DON_VI_THU_TIEN", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getDonViThuTien() {
		return this.donViThuTien;
	}

	public void setDonViThuTien(String donViThuTien) {
		this.donViThuTien = donViThuTien;
	}

	@Column(name = "DV_THI_HANH_QD", nullable = false, columnDefinition = "VARCHAR2", length = 100)
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

	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
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

	@Column(name = "HANH_VI_VP", columnDefinition = "VARCHAR2", length = 2000)
	public String getHanhViVp() {
		return this.hanhViVp;
	}

	public void setHanhViVp(String hanhViVp) {
		this.hanhViVp = hanhViVp;
	}

	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Column(name = "CAN_BO_TRA_LAI", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoTraLai() {
		return this.canBoTraLai;
	}

	public void setCanBoTraLai(Long canBoTraLai) {
		this.canBoTraLai = canBoTraLai;
	}

	@Column(name = "NGAY_TRA_LAI", columnDefinition = "DATE", length = 7)
	public Date getNgayTraLai() {
		return this.ngayTraLai;
	}

	public void setNgayTraLai(Date ngayTraLai) {
		this.ngayTraLai = ngayTraLai;
	}

	@Column(name = "NGAY_BAT_DAU_XL", columnDefinition = "DATE", length = 7)
	public Date getNgayBatDauXl() {
		return this.ngayBatDauXl;
	}

	public void setNgayBatDauXl(Date ngayBatDauXl) {
		this.ngayBatDauXl = ngayBatDauXl;
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

	@Column(name = "NAM_LAP_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamLapQd() {
		return this.namLapQd;
	}

	public void setNamLapQd(Long namLapQd) {
		this.namLapQd = namLapQd;
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

	@Column(name = "TEN_NVP_DVC", columnDefinition = "VARCHAR2", length = 300)
	public String getTenNvpDvc() {
		return this.tenNvpDvc;
	}

	public void setTenNvpDvc(String tenNvpDvc) {
		this.tenNvpDvc = tenNvpDvc;
	}

	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QdXpvphc02BakId))
			return false;
		QdXpvphc02BakId castOther = (QdXpvphc02BakId) other;

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
				&& (this.getCanBoRaQdId() == castOther.getCanBoRaQdId())
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
				&& ((this.getSoBb43Tc() == castOther.getSoBb43Tc()) || (this.getSoBb43Tc() != null
						&& castOther.getSoBb43Tc() != null && this.getSoBb43Tc().equals(castOther.getSoBb43Tc())))
				&& ((this.getCanBoTraLai() == castOther.getCanBoTraLai())
						|| (this.getCanBoTraLai() != null && castOther.getCanBoTraLai() != null
								&& this.getCanBoTraLai().equals(castOther.getCanBoTraLai())))
				&& ((this.getNgayTraLai() == castOther.getNgayTraLai()) || (this.getNgayTraLai() != null
						&& castOther.getNgayTraLai() != null && this.getNgayTraLai().equals(castOther.getNgayTraLai())))
				&& ((this.getNgayBatDauXl() == castOther.getNgayBatDauXl())
						|| (this.getNgayBatDauXl() != null && castOther.getNgayBatDauXl() != null
								&& this.getNgayBatDauXl().equals(castOther.getNgayBatDauXl())))
				&& ((this.getIdTheoNam() == castOther.getIdTheoNam()) || (this.getIdTheoNam() != null
						&& castOther.getIdTheoNam() != null && this.getIdTheoNam().equals(castOther.getIdTheoNam())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getNamLapQd() == castOther.getNamLapQd()) || (this.getNamLapQd() != null
						&& castOther.getNamLapQd() != null && this.getNamLapQd().equals(castOther.getNamLapQd())))
				&& ((this.getNhapQd() == castOther.getNhapQd()) || (this.getNhapQd() != null
						&& castOther.getNhapQd() != null && this.getNhapQd().equals(castOther.getNhapQd())))
				&& ((this.getTrangThaiQd() == castOther.getTrangThaiQd())
						|| (this.getTrangThaiQd() != null && castOther.getTrangThaiQd() != null
								&& this.getTrangThaiQd().equals(castOther.getTrangThaiQd())))
				&& ((this.getTenNvpDvc() == castOther.getTenNvpDvc()) || (this.getTenNvpDvc() != null
						&& castOther.getTenNvpDvc() != null && this.getTenNvpDvc().equals(castOther.getTenNvpDvc())))
				&& ((this.getSoDienThoai() == castOther.getSoDienThoai())
						|| (this.getSoDienThoai() != null && castOther.getSoDienThoai() != null
								&& this.getSoDienThoai().equals(castOther.getSoDienThoai())));
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
		result = 37 * result + (int) this.getCanBoRaQdId();
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
		result = 37 * result + (getSoBb43Tc() == null ? 0 : this.getSoBb43Tc().hashCode());
		result = 37 * result + (getCanBoTraLai() == null ? 0 : this.getCanBoTraLai().hashCode());
		result = 37 * result + (getNgayTraLai() == null ? 0 : this.getNgayTraLai().hashCode());
		result = 37 * result + (getNgayBatDauXl() == null ? 0 : this.getNgayBatDauXl().hashCode());
		result = 37 * result + (getIdTheoNam() == null ? 0 : this.getIdTheoNam().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getNamLapQd() == null ? 0 : this.getNamLapQd().hashCode());
		result = 37 * result + (getNhapQd() == null ? 0 : this.getNhapQd().hashCode());
		result = 37 * result + (getTrangThaiQd() == null ? 0 : this.getTrangThaiQd().hashCode());
		result = 37 * result + (getTenNvpDvc() == null ? 0 : this.getTenNvpDvc().hashCode());
		result = 37 * result + (getSoDienThoai() == null ? 0 : this.getSoDienThoai().hashCode());
		return result;
	}

}
