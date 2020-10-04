package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewBbmp65Tvtg43Id
 */
@Embeddable
public class ViewBbmp65Tvtg43Id implements java.io.Serializable {

	private long id;
	private String soBienBanMnp;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private String canCu;
	private Date ngayLapBb;
	private String gioLapBb;
	private String phutLapBb;
	private String diaDiemLap;
	private Long canBoLapId;
	private String capBacChucVu;
	private String donVi;
	private String nguoiChungKien;
	private String nguoiBaoQuan;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String qdMoTvSo;
	private Date qdMoTvNgay;
	private String thuTucHcSo;
	private Date thuTucHcNgay;
	private String YKienBoSung;
	private Long bb64Id;
	private Date ngayLapBbXong;
	private String gioLapBbXong;
	private String phutLapBbXong;
	private String giaoCho;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private String ngaySinhNvpNhap;
	private String diaChiNvp;
	private String canBoLap;
	private String qdTamgiuSo;
	private Date qdTamgiuNgay;
	private Long soBb43Tc;
	private String tangVat1;
	private String tangVat2;
	private long idTvtg;
	private long soBienBan;
	private long indexTvtg;
	private long loaiTvtgId;
	private String loaiTvtg;
	private String soTvtg;
	private String hangTvtg;
	private String noiCapTvtg;
	private String hieuLucTvtg;
	private String ghiChu;
	private String tinhTrang;
	private Long soLuong;
	private String donViTinh;

	public ViewBbmp65Tvtg43Id() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_BIEN_BAN_MNP", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBanMnp() {
		return this.soBienBanMnp;
	}

	public void setSoBienBanMnp(String soBienBanMnp) {
		this.soBienBanMnp = soBienBanMnp;
	}

	@Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCanhsatGtId() {
		return this.donViCanhsatGtId;
	}

	public void setDonViCanhsatGtId(Long donViCanhsatGtId) {
		this.donViCanhsatGtId = donViCanhsatGtId;
	}

	@Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Column(name = "CAN_CU", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCu() {
		return this.canCu;
	}

	public void setCanCu(String canCu) {
		this.canCu = canCu;
	}

	@Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(Date ngayLapBb) {
		this.ngayLapBb = ngayLapBb;
	}

	@Column(name = "GIO_LAP_BB", columnDefinition = "VARCHAR2", length = 2)
	public String getGioLapBb() {
		return this.gioLapBb;
	}

	public void setGioLapBb(String gioLapBb) {
		this.gioLapBb = gioLapBb;
	}

	@Column(name = "PHUT_LAP_BB", columnDefinition = "VARCHAR2", length = 2)
	public String getPhutLapBb() {
		return this.phutLapBb;
	}

	public void setPhutLapBb(String phutLapBb) {
		this.phutLapBb = phutLapBb;
	}

	@Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDiemLap() {
		return this.diaDiemLap;
	}

	public void setDiaDiemLap(String diaDiemLap) {
		this.diaDiemLap = diaDiemLap;
	}

	@Column(name = "CAN_BO_LAP_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoLapId() {
		return this.canBoLapId;
	}

	public void setCanBoLapId(Long canBoLapId) {
		this.canBoLapId = canBoLapId;
	}

	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Column(name = "NGUOI_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getNguoiChungKien() {
		return this.nguoiChungKien;
	}

	public void setNguoiChungKien(String nguoiChungKien) {
		this.nguoiChungKien = nguoiChungKien;
	}

	@Column(name = "NGUOI_BAO_QUAN", columnDefinition = "VARCHAR2", length = 200)
	public String getNguoiBaoQuan() {
		return this.nguoiBaoQuan;
	}

	public void setNguoiBaoQuan(String nguoiBaoQuan) {
		this.nguoiBaoQuan = nguoiBaoQuan;
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

	@Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 100)
	public String getNoiCapCmndNvp() {
		return this.noiCapCmndNvp;
	}

	public void setNoiCapCmndNvp(String noiCapCmndNvp) {
		this.noiCapCmndNvp = noiCapCmndNvp;
	}

	@Column(name = "QD_MO_TV_SO", columnDefinition = "VARCHAR2", length = 60)
	public String getQdMoTvSo() {
		return this.qdMoTvSo;
	}

	public void setQdMoTvSo(String qdMoTvSo) {
		this.qdMoTvSo = qdMoTvSo;
	}

	@Column(name = "QD_MO_TV_NGAY", columnDefinition = "DATE", length = 7)
	public Date getQdMoTvNgay() {
		return this.qdMoTvNgay;
	}

	public void setQdMoTvNgay(Date qdMoTvNgay) {
		this.qdMoTvNgay = qdMoTvNgay;
	}

	@Column(name = "THU_TUC_HC_SO", columnDefinition = "VARCHAR2", length = 60)
	public String getThuTucHcSo() {
		return this.thuTucHcSo;
	}

	public void setThuTucHcSo(String thuTucHcSo) {
		this.thuTucHcSo = thuTucHcSo;
	}

	@Column(name = "THU_TUC_HC_NGAY", columnDefinition = "DATE", length = 7)
	public Date getThuTucHcNgay() {
		return this.thuTucHcNgay;
	}

	public void setThuTucHcNgay(Date thuTucHcNgay) {
		this.thuTucHcNgay = thuTucHcNgay;
	}

	@Column(name = "Y_KIEN_BO_SUNG", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienBoSung() {
		return this.YKienBoSung;
	}

	public void setYKienBoSung(String YKienBoSung) {
		this.YKienBoSung = YKienBoSung;
	}

	@Column(name = "BB64_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBb64Id() {
		return this.bb64Id;
	}

	public void setBb64Id(Long bb64Id) {
		this.bb64Id = bb64Id;
	}

	@Column(name = "NGAY_LAP_BB_XONG", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBbXong() {
		return this.ngayLapBbXong;
	}

	public void setNgayLapBbXong(Date ngayLapBbXong) {
		this.ngayLapBbXong = ngayLapBbXong;
	}

	@Column(name = "GIO_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)
	public String getGioLapBbXong() {
		return this.gioLapBbXong;
	}

	public void setGioLapBbXong(String gioLapBbXong) {
		this.gioLapBbXong = gioLapBbXong;
	}

	@Column(name = "PHUT_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)
	public String getPhutLapBbXong() {
		return this.phutLapBbXong;
	}

	public void setPhutLapBbXong(String phutLapBbXong) {
		this.phutLapBbXong = phutLapBbXong;
	}

	@Column(name = "GIAO_CHO", columnDefinition = "VARCHAR2", length = 100)
	public String getGiaoCho() {
		return this.giaoCho;
	}

	public void setGiaoCho(String giaoCho) {
		this.giaoCho = giaoCho;
	}

	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
	}

	@Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdNam() {
		return this.idNam;
	}

	public void setIdNam(Long idNam) {
		this.idNam = idNam;
	}

	@Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTinhThanhPhoId() {
		return this.tinhThanhPhoId;
	}

	public void setTinhThanhPhoId(Long tinhThanhPhoId) {
		this.tinhThanhPhoId = tinhThanhPhoId;
	}

	@Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamTaoQd() {
		return this.namTaoQd;
	}

	public void setNamTaoQd(Long namTaoQd) {
		this.namTaoQd = namTaoQd;
	}

	@Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapBb() {
		return this.nhapBb;
	}

	public void setNhapBb(Long nhapBb) {
		this.nhapBb = nhapBb;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Column(name = "CAN_BO_LAP", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLap() {
		return this.canBoLap;
	}

	public void setCanBoLap(String canBoLap) {
		this.canBoLap = canBoLap;
	}

	@Column(name = "QD_TAMGIU_SO", columnDefinition = "VARCHAR2", length = 60)
	public String getQdTamgiuSo() {
		return this.qdTamgiuSo;
	}

	public void setQdTamgiuSo(String qdTamgiuSo) {
		this.qdTamgiuSo = qdTamgiuSo;
	}

	@Column(name = "QD_TAMGIU_NGAY", columnDefinition = "DATE", length = 7)
	public Date getQdTamgiuNgay() {
		return this.qdTamgiuNgay;
	}

	public void setQdTamgiuNgay(Date qdTamgiuNgay) {
		this.qdTamgiuNgay = qdTamgiuNgay;
	}

	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Column(name = "TANG_VAT1", columnDefinition = "VARCHAR2", length = 500)
	public String getTangVat1() {
		return this.tangVat1;
	}

	public void setTangVat1(String tangVat1) {
		this.tangVat1 = tangVat1;
	}

	@Column(name = "TANG_VAT2", columnDefinition = "VARCHAR2", length = 500)
	public String getTangVat2() {
		return this.tangVat2;
	}

	public void setTangVat2(String tangVat2) {
		this.tangVat2 = tangVat2;
	}

	@Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getIdTvtg() {
		return this.idTvtg;
	}

	public void setIdTvtg(long idTvtg) {
		this.idTvtg = idTvtg;
	}

	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(long soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Column(name = "INDEX_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getIndexTvtg() {
		return this.indexTvtg;
	}

	public void setIndexTvtg(long indexTvtg) {
		this.indexTvtg = indexTvtg;
	}

	@Column(name = "LOAI_TVTG_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getLoaiTvtgId() {
		return this.loaiTvtgId;
	}

	public void setLoaiTvtgId(long loaiTvtgId) {
		this.loaiTvtgId = loaiTvtgId;
	}

	@Column(name = "LOAI_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getLoaiTvtg() {
		return this.loaiTvtg;
	}

	public void setLoaiTvtg(String loaiTvtg) {
		this.loaiTvtg = loaiTvtg;
	}

	@Column(name = "SO_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getSoTvtg() {
		return this.soTvtg;
	}

	public void setSoTvtg(String soTvtg) {
		this.soTvtg = soTvtg;
	}

	@Column(name = "HANG_TVTG", columnDefinition = "VARCHAR2", length = 20)
	public String getHangTvtg() {
		return this.hangTvtg;
	}

	public void setHangTvtg(String hangTvtg) {
		this.hangTvtg = hangTvtg;
	}

	@Column(name = "NOI_CAP_TVTG", columnDefinition = "VARCHAR2", length = 80)
	public String getNoiCapTvtg() {
		return this.noiCapTvtg;
	}

	public void setNoiCapTvtg(String noiCapTvtg) {
		this.noiCapTvtg = noiCapTvtg;
	}

	@Column(name = "HIEU_LUC_TVTG", columnDefinition = "VARCHAR2", length = 20)
	public String getHieuLucTvtg() {
		return this.hieuLucTvtg;
	}

	public void setHieuLucTvtg(String hieuLucTvtg) {
		this.hieuLucTvtg = hieuLucTvtg;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)
	public String getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(Long soLuong) {
		this.soLuong = soLuong;
	}

	@Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)
	public String getDonViTinh() {
		return this.donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewBbmp65Tvtg43Id))
			return false;
		ViewBbmp65Tvtg43Id castOther = (ViewBbmp65Tvtg43Id) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoBienBanMnp() == castOther.getSoBienBanMnp())
						|| (this.getSoBienBanMnp() != null && castOther.getSoBienBanMnp() != null
								&& this.getSoBienBanMnp().equals(castOther.getSoBienBanMnp())))
				&& ((this.getDonViCanhsatGtId() == castOther.getDonViCanhsatGtId())
						|| (this.getDonViCanhsatGtId() != null && castOther.getDonViCanhsatGtId() != null
								&& this.getDonViCanhsatGtId().equals(castOther.getDonViCanhsatGtId())))
				&& ((this.getTenCqCapTren() == castOther.getTenCqCapTren())
						|| (this.getTenCqCapTren() != null && castOther.getTenCqCapTren() != null
								&& this.getTenCqCapTren().equals(castOther.getTenCqCapTren())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getCanCu() == castOther.getCanCu()) || (this.getCanCu() != null
						&& castOther.getCanCu() != null && this.getCanCu().equals(castOther.getCanCu())))
				&& ((this.getNgayLapBb() == castOther.getNgayLapBb()) || (this.getNgayLapBb() != null
						&& castOther.getNgayLapBb() != null && this.getNgayLapBb().equals(castOther.getNgayLapBb())))
				&& ((this.getGioLapBb() == castOther.getGioLapBb()) || (this.getGioLapBb() != null
						&& castOther.getGioLapBb() != null && this.getGioLapBb().equals(castOther.getGioLapBb())))
				&& ((this.getPhutLapBb() == castOther.getPhutLapBb()) || (this.getPhutLapBb() != null
						&& castOther.getPhutLapBb() != null && this.getPhutLapBb().equals(castOther.getPhutLapBb())))
				&& ((this.getDiaDiemLap() == castOther.getDiaDiemLap()) || (this.getDiaDiemLap() != null
						&& castOther.getDiaDiemLap() != null && this.getDiaDiemLap().equals(castOther.getDiaDiemLap())))
				&& ((this.getCanBoLapId() == castOther.getCanBoLapId()) || (this.getCanBoLapId() != null
						&& castOther.getCanBoLapId() != null && this.getCanBoLapId().equals(castOther.getCanBoLapId())))
				&& ((this.getCapBacChucVu() == castOther.getCapBacChucVu())
						|| (this.getCapBacChucVu() != null && castOther.getCapBacChucVu() != null
								&& this.getCapBacChucVu().equals(castOther.getCapBacChucVu())))
				&& ((this.getDonVi() == castOther.getDonVi()) || (this.getDonVi() != null
						&& castOther.getDonVi() != null && this.getDonVi().equals(castOther.getDonVi())))
				&& ((this.getNguoiChungKien() == castOther.getNguoiChungKien())
						|| (this.getNguoiChungKien() != null && castOther.getNguoiChungKien() != null
								&& this.getNguoiChungKien().equals(castOther.getNguoiChungKien())))
				&& ((this.getNguoiBaoQuan() == castOther.getNguoiBaoQuan())
						|| (this.getNguoiBaoQuan() != null && castOther.getNguoiBaoQuan() != null
								&& this.getNguoiBaoQuan().equals(castOther.getNguoiBaoQuan())))
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
				&& ((this.getQdMoTvSo() == castOther.getQdMoTvSo()) || (this.getQdMoTvSo() != null
						&& castOther.getQdMoTvSo() != null && this.getQdMoTvSo().equals(castOther.getQdMoTvSo())))
				&& ((this.getQdMoTvNgay() == castOther.getQdMoTvNgay()) || (this.getQdMoTvNgay() != null
						&& castOther.getQdMoTvNgay() != null && this.getQdMoTvNgay().equals(castOther.getQdMoTvNgay())))
				&& ((this.getThuTucHcSo() == castOther.getThuTucHcSo()) || (this.getThuTucHcSo() != null
						&& castOther.getThuTucHcSo() != null && this.getThuTucHcSo().equals(castOther.getThuTucHcSo())))
				&& ((this.getThuTucHcNgay() == castOther.getThuTucHcNgay())
						|| (this.getThuTucHcNgay() != null && castOther.getThuTucHcNgay() != null
								&& this.getThuTucHcNgay().equals(castOther.getThuTucHcNgay())))
				&& ((this.getYKienBoSung() == castOther.getYKienBoSung())
						|| (this.getYKienBoSung() != null && castOther.getYKienBoSung() != null
								&& this.getYKienBoSung().equals(castOther.getYKienBoSung())))
				&& ((this.getBb64Id() == castOther.getBb64Id()) || (this.getBb64Id() != null
						&& castOther.getBb64Id() != null && this.getBb64Id().equals(castOther.getBb64Id())))
				&& ((this.getNgayLapBbXong() == castOther.getNgayLapBbXong())
						|| (this.getNgayLapBbXong() != null && castOther.getNgayLapBbXong() != null
								&& this.getNgayLapBbXong().equals(castOther.getNgayLapBbXong())))
				&& ((this.getGioLapBbXong() == castOther.getGioLapBbXong())
						|| (this.getGioLapBbXong() != null && castOther.getGioLapBbXong() != null
								&& this.getGioLapBbXong().equals(castOther.getGioLapBbXong())))
				&& ((this.getPhutLapBbXong() == castOther.getPhutLapBbXong())
						|| (this.getPhutLapBbXong() != null && castOther.getPhutLapBbXong() != null
								&& this.getPhutLapBbXong().equals(castOther.getPhutLapBbXong())))
				&& ((this.getGiaoCho() == castOther.getGiaoCho()) || (this.getGiaoCho() != null
						&& castOther.getGiaoCho() != null && this.getGiaoCho().equals(castOther.getGiaoCho())))
				&& ((this.getCbxlId() == castOther.getCbxlId()) || (this.getCbxlId() != null
						&& castOther.getCbxlId() != null && this.getCbxlId().equals(castOther.getCbxlId())))
				&& ((this.getIdNam() == castOther.getIdNam()) || (this.getIdNam() != null
						&& castOther.getIdNam() != null && this.getIdNam().equals(castOther.getIdNam())))
				&& ((this.getTinhThanhPhoId() == castOther.getTinhThanhPhoId())
						|| (this.getTinhThanhPhoId() != null && castOther.getTinhThanhPhoId() != null
								&& this.getTinhThanhPhoId().equals(castOther.getTinhThanhPhoId())))
				&& ((this.getNamTaoQd() == castOther.getNamTaoQd()) || (this.getNamTaoQd() != null
						&& castOther.getNamTaoQd() != null && this.getNamTaoQd().equals(castOther.getNamTaoQd())))
				&& ((this.getNhapBb() == castOther.getNhapBb()) || (this.getNhapBb() != null
						&& castOther.getNhapBb() != null && this.getNhapBb().equals(castOther.getNhapBb())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getNgaySinhNvpNhap() == castOther.getNgaySinhNvpNhap())
						|| (this.getNgaySinhNvpNhap() != null && castOther.getNgaySinhNvpNhap() != null
								&& this.getNgaySinhNvpNhap().equals(castOther.getNgaySinhNvpNhap())))
				&& ((this.getDiaChiNvp() == castOther.getDiaChiNvp()) || (this.getDiaChiNvp() != null
						&& castOther.getDiaChiNvp() != null && this.getDiaChiNvp().equals(castOther.getDiaChiNvp())))
				&& ((this.getCanBoLap() == castOther.getCanBoLap()) || (this.getCanBoLap() != null
						&& castOther.getCanBoLap() != null && this.getCanBoLap().equals(castOther.getCanBoLap())))
				&& ((this.getQdTamgiuSo() == castOther.getQdTamgiuSo()) || (this.getQdTamgiuSo() != null
						&& castOther.getQdTamgiuSo() != null && this.getQdTamgiuSo().equals(castOther.getQdTamgiuSo())))
				&& ((this.getQdTamgiuNgay() == castOther.getQdTamgiuNgay())
						|| (this.getQdTamgiuNgay() != null && castOther.getQdTamgiuNgay() != null
								&& this.getQdTamgiuNgay().equals(castOther.getQdTamgiuNgay())))
				&& ((this.getSoBb43Tc() == castOther.getSoBb43Tc()) || (this.getSoBb43Tc() != null
						&& castOther.getSoBb43Tc() != null && this.getSoBb43Tc().equals(castOther.getSoBb43Tc())))
				&& ((this.getTangVat1() == castOther.getTangVat1()) || (this.getTangVat1() != null
						&& castOther.getTangVat1() != null && this.getTangVat1().equals(castOther.getTangVat1())))
				&& ((this.getTangVat2() == castOther.getTangVat2()) || (this.getTangVat2() != null
						&& castOther.getTangVat2() != null && this.getTangVat2().equals(castOther.getTangVat2())))
				&& (this.getIdTvtg() == castOther.getIdTvtg()) && (this.getSoBienBan() == castOther.getSoBienBan())
				&& (this.getIndexTvtg() == castOther.getIndexTvtg())
				&& (this.getLoaiTvtgId() == castOther.getLoaiTvtgId())
				&& ((this.getLoaiTvtg() == castOther.getLoaiTvtg()) || (this.getLoaiTvtg() != null
						&& castOther.getLoaiTvtg() != null && this.getLoaiTvtg().equals(castOther.getLoaiTvtg())))
				&& ((this.getSoTvtg() == castOther.getSoTvtg()) || (this.getSoTvtg() != null
						&& castOther.getSoTvtg() != null && this.getSoTvtg().equals(castOther.getSoTvtg())))
				&& ((this.getHangTvtg() == castOther.getHangTvtg()) || (this.getHangTvtg() != null
						&& castOther.getHangTvtg() != null && this.getHangTvtg().equals(castOther.getHangTvtg())))
				&& ((this.getNoiCapTvtg() == castOther.getNoiCapTvtg()) || (this.getNoiCapTvtg() != null
						&& castOther.getNoiCapTvtg() != null && this.getNoiCapTvtg().equals(castOther.getNoiCapTvtg())))
				&& ((this.getHieuLucTvtg() == castOther.getHieuLucTvtg())
						|| (this.getHieuLucTvtg() != null && castOther.getHieuLucTvtg() != null
								&& this.getHieuLucTvtg().equals(castOther.getHieuLucTvtg())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getTinhTrang() == castOther.getTinhTrang()) || (this.getTinhTrang() != null
						&& castOther.getTinhTrang() != null && this.getTinhTrang().equals(castOther.getTinhTrang())))
				&& ((this.getSoLuong() == castOther.getSoLuong()) || (this.getSoLuong() != null
						&& castOther.getSoLuong() != null && this.getSoLuong().equals(castOther.getSoLuong())))
				&& ((this.getDonViTinh() == castOther.getDonViTinh()) || (this.getDonViTinh() != null
						&& castOther.getDonViTinh() != null && this.getDonViTinh().equals(castOther.getDonViTinh())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoBienBanMnp() == null ? 0 : this.getSoBienBanMnp().hashCode());
		result = 37 * result + (getDonViCanhsatGtId() == null ? 0 : this.getDonViCanhsatGtId().hashCode());
		result = 37 * result + (getTenCqCapTren() == null ? 0 : this.getTenCqCapTren().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getCanCu() == null ? 0 : this.getCanCu().hashCode());
		result = 37 * result + (getNgayLapBb() == null ? 0 : this.getNgayLapBb().hashCode());
		result = 37 * result + (getGioLapBb() == null ? 0 : this.getGioLapBb().hashCode());
		result = 37 * result + (getPhutLapBb() == null ? 0 : this.getPhutLapBb().hashCode());
		result = 37 * result + (getDiaDiemLap() == null ? 0 : this.getDiaDiemLap().hashCode());
		result = 37 * result + (getCanBoLapId() == null ? 0 : this.getCanBoLapId().hashCode());
		result = 37 * result + (getCapBacChucVu() == null ? 0 : this.getCapBacChucVu().hashCode());
		result = 37 * result + (getDonVi() == null ? 0 : this.getDonVi().hashCode());
		result = 37 * result + (getNguoiChungKien() == null ? 0 : this.getNguoiChungKien().hashCode());
		result = 37 * result + (getNguoiBaoQuan() == null ? 0 : this.getNguoiBaoQuan().hashCode());
		result = 37 * result + (getTenNguoiNvp() == null ? 0 : this.getTenNguoiNvp().hashCode());
		result = 37 * result + (getNgaySinhNvp() == null ? 0 : this.getNgaySinhNvp().hashCode());
		result = 37 * result + (getQuocTichNvp() == null ? 0 : this.getQuocTichNvp().hashCode());
		result = 37 * result + (getNgheNghiepNvp() == null ? 0 : this.getNgheNghiepNvp().hashCode());
		result = 37 * result + (getSoCmndNvp() == null ? 0 : this.getSoCmndNvp().hashCode());
		result = 37 * result + (getNgayCapCmndNvp() == null ? 0 : this.getNgayCapCmndNvp().hashCode());
		result = 37 * result + (getNoiCapCmndNvp() == null ? 0 : this.getNoiCapCmndNvp().hashCode());
		result = 37 * result + (getQdMoTvSo() == null ? 0 : this.getQdMoTvSo().hashCode());
		result = 37 * result + (getQdMoTvNgay() == null ? 0 : this.getQdMoTvNgay().hashCode());
		result = 37 * result + (getThuTucHcSo() == null ? 0 : this.getThuTucHcSo().hashCode());
		result = 37 * result + (getThuTucHcNgay() == null ? 0 : this.getThuTucHcNgay().hashCode());
		result = 37 * result + (getYKienBoSung() == null ? 0 : this.getYKienBoSung().hashCode());
		result = 37 * result + (getBb64Id() == null ? 0 : this.getBb64Id().hashCode());
		result = 37 * result + (getNgayLapBbXong() == null ? 0 : this.getNgayLapBbXong().hashCode());
		result = 37 * result + (getGioLapBbXong() == null ? 0 : this.getGioLapBbXong().hashCode());
		result = 37 * result + (getPhutLapBbXong() == null ? 0 : this.getPhutLapBbXong().hashCode());
		result = 37 * result + (getGiaoCho() == null ? 0 : this.getGiaoCho().hashCode());
		result = 37 * result + (getCbxlId() == null ? 0 : this.getCbxlId().hashCode());
		result = 37 * result + (getIdNam() == null ? 0 : this.getIdNam().hashCode());
		result = 37 * result + (getTinhThanhPhoId() == null ? 0 : this.getTinhThanhPhoId().hashCode());
		result = 37 * result + (getNamTaoQd() == null ? 0 : this.getNamTaoQd().hashCode());
		result = 37 * result + (getNhapBb() == null ? 0 : this.getNhapBb().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getNgaySinhNvpNhap() == null ? 0 : this.getNgaySinhNvpNhap().hashCode());
		result = 37 * result + (getDiaChiNvp() == null ? 0 : this.getDiaChiNvp().hashCode());
		result = 37 * result + (getCanBoLap() == null ? 0 : this.getCanBoLap().hashCode());
		result = 37 * result + (getQdTamgiuSo() == null ? 0 : this.getQdTamgiuSo().hashCode());
		result = 37 * result + (getQdTamgiuNgay() == null ? 0 : this.getQdTamgiuNgay().hashCode());
		result = 37 * result + (getSoBb43Tc() == null ? 0 : this.getSoBb43Tc().hashCode());
		result = 37 * result + (getTangVat1() == null ? 0 : this.getTangVat1().hashCode());
		result = 37 * result + (getTangVat2() == null ? 0 : this.getTangVat2().hashCode());
		result = 37 * result + (int) this.getIdTvtg();
		result = 37 * result + (int) this.getSoBienBan();
		result = 37 * result + (int) this.getIndexTvtg();
		result = 37 * result + (int) this.getLoaiTvtgId();
		result = 37 * result + (getLoaiTvtg() == null ? 0 : this.getLoaiTvtg().hashCode());
		result = 37 * result + (getSoTvtg() == null ? 0 : this.getSoTvtg().hashCode());
		result = 37 * result + (getHangTvtg() == null ? 0 : this.getHangTvtg().hashCode());
		result = 37 * result + (getNoiCapTvtg() == null ? 0 : this.getNoiCapTvtg().hashCode());
		result = 37 * result + (getHieuLucTvtg() == null ? 0 : this.getHieuLucTvtg().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getTinhTrang() == null ? 0 : this.getTinhTrang().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonViTinh() == null ? 0 : this.getDonViTinh().hashCode());
		return result;
	}

}
