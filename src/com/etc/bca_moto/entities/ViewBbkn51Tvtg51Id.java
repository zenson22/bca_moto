package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewBbkn51Tvtg51Id
 */
@Embeddable
public class ViewBbkn51Tvtg51Id implements java.io.Serializable {

	private long id;
	private String soBienBanKn;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private Long qd21Id;
	private String thuTucHcSo;
	private Date thuTucHcNgay;
	private String thuTucHcKy;
	private Date thoiGianLapBb;
	private String diaDiemLapBb;
	private Long cbxlId;
	private String capBac;
	private String chucVu;
	private String donVi;
	private String soCmnd;
	private String soDienThoai;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String diaChiNvp;
	private String YKienTrinhBay;
	private Date thoiGianKhamKt;
	private String nguoiNhanBb;
	private Date thoiGianBbLapXong;
	private String nguoiLapBb;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long idNam;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private String danhSachNguoiCk;
	private String gioLapBbXong;
	private String phutLapBbXong;
	private long idTvtg;
	private long soBienBan;
	private long indexTvtg;
	private String tenTvtg;
	private Long soLuong;
	private String donViTinh;
	private String ghiChu;
	private String tinhTrang;
	private String diaDiemTvtg;

	public ViewBbkn51Tvtg51Id() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_BIEN_BAN_KN", nullable = false, columnDefinition = "VARCHAR2", length = 30)
	public String getSoBienBanKn() {
		return this.soBienBanKn;
	}

	public void setSoBienBanKn(String soBienBanKn) {
		this.soBienBanKn = soBienBanKn;
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

	@Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(Date ngayLapBb) {
		this.ngayLapBb = ngayLapBb;
	}

	@Column(name = "QD_21_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd21Id() {
		return this.qd21Id;
	}

	public void setQd21Id(Long qd21Id) {
		this.qd21Id = qd21Id;
	}

	@Column(name = "THU_TUC_HC_SO", columnDefinition = "VARCHAR2", length = 100)
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

	@Column(name = "THU_TUC_HC_KY", columnDefinition = "VARCHAR2", length = 100)
	public String getThuTucHcKy() {
		return this.thuTucHcKy;
	}

	public void setThuTucHcKy(String thuTucHcKy) {
		this.thuTucHcKy = thuTucHcKy;
	}

	@Column(name = "THOI_GIAN_LAP_BB", columnDefinition = "DATE", length = 7)
	public Date getThoiGianLapBb() {
		return this.thoiGianLapBb;
	}

	public void setThoiGianLapBb(Date thoiGianLapBb) {
		this.thoiGianLapBb = thoiGianLapBb;
	}

	@Column(name = "DIA_DIEM_LAP_BB", columnDefinition = "VARCHAR2", length = 120)
	public String getDiaDiemLapBb() {
		return this.diaDiemLapBb;
	}

	public void setDiaDiemLapBb(String diaDiemLapBb) {
		this.diaDiemLapBb = diaDiemLapBb;
	}

	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
	}

	@Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 60)
	public String getCapBac() {
		return this.capBac;
	}

	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}

	@Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 60)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Column(name = "SO_CMND", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmnd() {
		return this.soCmnd;
	}

	public void setSoCmnd(String soCmnd) {
		this.soCmnd = soCmnd;
	}

	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
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

	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 120)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Column(name = "Y_KIEN_TRINH_BAY", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienTrinhBay() {
		return this.YKienTrinhBay;
	}

	public void setYKienTrinhBay(String YKienTrinhBay) {
		this.YKienTrinhBay = YKienTrinhBay;
	}

	@Column(name = "THOI_GIAN_KHAM_KT", columnDefinition = "DATE", length = 7)
	public Date getThoiGianKhamKt() {
		return this.thoiGianKhamKt;
	}

	public void setThoiGianKhamKt(Date thoiGianKhamKt) {
		this.thoiGianKhamKt = thoiGianKhamKt;
	}

	@Column(name = "NGUOI_NHAN_BB", columnDefinition = "VARCHAR2", length = 150)
	public String getNguoiNhanBb() {
		return this.nguoiNhanBb;
	}

	public void setNguoiNhanBb(String nguoiNhanBb) {
		this.nguoiNhanBb = nguoiNhanBb;
	}

	@Column(name = "THOI_GIAN_BB_LAP_XONG", columnDefinition = "DATE", length = 7)
	public Date getThoiGianBbLapXong() {
		return this.thoiGianBbLapXong;
	}

	public void setThoiGianBbLapXong(Date thoiGianBbLapXong) {
		this.thoiGianBbLapXong = thoiGianBbLapXong;
	}

	@Column(name = "NGUOI_LAP_BB", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiLapBb() {
		return this.nguoiLapBb;
	}

	public void setNguoiLapBb(String nguoiLapBb) {
		this.nguoiLapBb = nguoiLapBb;
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

	@Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdNam() {
		return this.idNam;
	}

	public void setIdNam(Long idNam) {
		this.idNam = idNam;
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

	@Column(name = "DANH_SACH_NGUOI_CK", columnDefinition = "VARCHAR2", length = 2000)
	public String getDanhSachNguoiCk() {
		return this.danhSachNguoiCk;
	}

	public void setDanhSachNguoiCk(String danhSachNguoiCk) {
		this.danhSachNguoiCk = danhSachNguoiCk;
	}

	@Column(name = "GIO_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 20)
	public String getGioLapBbXong() {
		return this.gioLapBbXong;
	}

	public void setGioLapBbXong(String gioLapBbXong) {
		this.gioLapBbXong = gioLapBbXong;
	}

	@Column(name = "PHUT_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 20)
	public String getPhutLapBbXong() {
		return this.phutLapBbXong;
	}

	public void setPhutLapBbXong(String phutLapBbXong) {
		this.phutLapBbXong = phutLapBbXong;
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

	@Column(name = "TEN_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTenTvtg() {
		return this.tenTvtg;
	}

	public void setTenTvtg(String tenTvtg) {
		this.tenTvtg = tenTvtg;
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

	@Column(name = "DIA_DIEM_TVTG", columnDefinition = "VARCHAR2", length = 120)
	public String getDiaDiemTvtg() {
		return this.diaDiemTvtg;
	}

	public void setDiaDiemTvtg(String diaDiemTvtg) {
		this.diaDiemTvtg = diaDiemTvtg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewBbkn51Tvtg51Id))
			return false;
		ViewBbkn51Tvtg51Id castOther = (ViewBbkn51Tvtg51Id) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoBienBanKn() == castOther.getSoBienBanKn())
						|| (this.getSoBienBanKn() != null && castOther.getSoBienBanKn() != null
								&& this.getSoBienBanKn().equals(castOther.getSoBienBanKn())))
				&& ((this.getDonViCanhsatGtId() == castOther.getDonViCanhsatGtId())
						|| (this.getDonViCanhsatGtId() != null && castOther.getDonViCanhsatGtId() != null
								&& this.getDonViCanhsatGtId().equals(castOther.getDonViCanhsatGtId())))
				&& ((this.getTenCqCapTren() == castOther.getTenCqCapTren())
						|| (this.getTenCqCapTren() != null && castOther.getTenCqCapTren() != null
								&& this.getTenCqCapTren().equals(castOther.getTenCqCapTren())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getNgayLapBb() == castOther.getNgayLapBb()) || (this.getNgayLapBb() != null
						&& castOther.getNgayLapBb() != null && this.getNgayLapBb().equals(castOther.getNgayLapBb())))
				&& ((this.getQd21Id() == castOther.getQd21Id()) || (this.getQd21Id() != null
						&& castOther.getQd21Id() != null && this.getQd21Id().equals(castOther.getQd21Id())))
				&& ((this.getThuTucHcSo() == castOther.getThuTucHcSo()) || (this.getThuTucHcSo() != null
						&& castOther.getThuTucHcSo() != null && this.getThuTucHcSo().equals(castOther.getThuTucHcSo())))
				&& ((this.getThuTucHcNgay() == castOther.getThuTucHcNgay())
						|| (this.getThuTucHcNgay() != null && castOther.getThuTucHcNgay() != null
								&& this.getThuTucHcNgay().equals(castOther.getThuTucHcNgay())))
				&& ((this.getThuTucHcKy() == castOther.getThuTucHcKy()) || (this.getThuTucHcKy() != null
						&& castOther.getThuTucHcKy() != null && this.getThuTucHcKy().equals(castOther.getThuTucHcKy())))
				&& ((this.getThoiGianLapBb() == castOther.getThoiGianLapBb())
						|| (this.getThoiGianLapBb() != null && castOther.getThoiGianLapBb() != null
								&& this.getThoiGianLapBb().equals(castOther.getThoiGianLapBb())))
				&& ((this.getDiaDiemLapBb() == castOther.getDiaDiemLapBb())
						|| (this.getDiaDiemLapBb() != null && castOther.getDiaDiemLapBb() != null
								&& this.getDiaDiemLapBb().equals(castOther.getDiaDiemLapBb())))
				&& ((this.getCbxlId() == castOther.getCbxlId()) || (this.getCbxlId() != null
						&& castOther.getCbxlId() != null && this.getCbxlId().equals(castOther.getCbxlId())))
				&& ((this.getCapBac() == castOther.getCapBac()) || (this.getCapBac() != null
						&& castOther.getCapBac() != null && this.getCapBac().equals(castOther.getCapBac())))
				&& ((this.getChucVu() == castOther.getChucVu()) || (this.getChucVu() != null
						&& castOther.getChucVu() != null && this.getChucVu().equals(castOther.getChucVu())))
				&& ((this.getDonVi() == castOther.getDonVi()) || (this.getDonVi() != null
						&& castOther.getDonVi() != null && this.getDonVi().equals(castOther.getDonVi())))
				&& ((this.getSoCmnd() == castOther.getSoCmnd()) || (this.getSoCmnd() != null
						&& castOther.getSoCmnd() != null && this.getSoCmnd().equals(castOther.getSoCmnd())))
				&& ((this.getSoDienThoai() == castOther.getSoDienThoai())
						|| (this.getSoDienThoai() != null && castOther.getSoDienThoai() != null
								&& this.getSoDienThoai().equals(castOther.getSoDienThoai())))
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
				&& ((this.getDiaChiNvp() == castOther.getDiaChiNvp()) || (this.getDiaChiNvp() != null
						&& castOther.getDiaChiNvp() != null && this.getDiaChiNvp().equals(castOther.getDiaChiNvp())))
				&& ((this.getYKienTrinhBay() == castOther.getYKienTrinhBay())
						|| (this.getYKienTrinhBay() != null && castOther.getYKienTrinhBay() != null
								&& this.getYKienTrinhBay().equals(castOther.getYKienTrinhBay())))
				&& ((this.getThoiGianKhamKt() == castOther.getThoiGianKhamKt())
						|| (this.getThoiGianKhamKt() != null && castOther.getThoiGianKhamKt() != null
								&& this.getThoiGianKhamKt().equals(castOther.getThoiGianKhamKt())))
				&& ((this.getNguoiNhanBb() == castOther.getNguoiNhanBb())
						|| (this.getNguoiNhanBb() != null && castOther.getNguoiNhanBb() != null
								&& this.getNguoiNhanBb().equals(castOther.getNguoiNhanBb())))
				&& ((this.getThoiGianBbLapXong() == castOther.getThoiGianBbLapXong())
						|| (this.getThoiGianBbLapXong() != null && castOther.getThoiGianBbLapXong() != null
								&& this.getThoiGianBbLapXong().equals(castOther.getThoiGianBbLapXong())))
				&& ((this.getNguoiLapBb() == castOther.getNguoiLapBb()) || (this.getNguoiLapBb() != null
						&& castOther.getNguoiLapBb() != null && this.getNguoiLapBb().equals(castOther.getNguoiLapBb())))
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getIdNam() == castOther.getIdNam()) || (this.getIdNam() != null
						&& castOther.getIdNam() != null && this.getIdNam().equals(castOther.getIdNam())))
				&& ((this.getNamTaoQd() == castOther.getNamTaoQd()) || (this.getNamTaoQd() != null
						&& castOther.getNamTaoQd() != null && this.getNamTaoQd().equals(castOther.getNamTaoQd())))
				&& ((this.getNhapBb() == castOther.getNhapBb()) || (this.getNhapBb() != null
						&& castOther.getNhapBb() != null && this.getNhapBb().equals(castOther.getNhapBb())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getDanhSachNguoiCk() == castOther.getDanhSachNguoiCk())
						|| (this.getDanhSachNguoiCk() != null && castOther.getDanhSachNguoiCk() != null
								&& this.getDanhSachNguoiCk().equals(castOther.getDanhSachNguoiCk())))
				&& ((this.getGioLapBbXong() == castOther.getGioLapBbXong())
						|| (this.getGioLapBbXong() != null && castOther.getGioLapBbXong() != null
								&& this.getGioLapBbXong().equals(castOther.getGioLapBbXong())))
				&& ((this.getPhutLapBbXong() == castOther.getPhutLapBbXong())
						|| (this.getPhutLapBbXong() != null && castOther.getPhutLapBbXong() != null
								&& this.getPhutLapBbXong().equals(castOther.getPhutLapBbXong())))
				&& (this.getIdTvtg() == castOther.getIdTvtg()) && (this.getSoBienBan() == castOther.getSoBienBan())
				&& (this.getIndexTvtg() == castOther.getIndexTvtg())
				&& ((this.getTenTvtg() == castOther.getTenTvtg()) || (this.getTenTvtg() != null
						&& castOther.getTenTvtg() != null && this.getTenTvtg().equals(castOther.getTenTvtg())))
				&& ((this.getSoLuong() == castOther.getSoLuong()) || (this.getSoLuong() != null
						&& castOther.getSoLuong() != null && this.getSoLuong().equals(castOther.getSoLuong())))
				&& ((this.getDonViTinh() == castOther.getDonViTinh()) || (this.getDonViTinh() != null
						&& castOther.getDonViTinh() != null && this.getDonViTinh().equals(castOther.getDonViTinh())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getTinhTrang() == castOther.getTinhTrang()) || (this.getTinhTrang() != null
						&& castOther.getTinhTrang() != null && this.getTinhTrang().equals(castOther.getTinhTrang())))
				&& ((this.getDiaDiemTvtg() == castOther.getDiaDiemTvtg())
						|| (this.getDiaDiemTvtg() != null && castOther.getDiaDiemTvtg() != null
								&& this.getDiaDiemTvtg().equals(castOther.getDiaDiemTvtg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoBienBanKn() == null ? 0 : this.getSoBienBanKn().hashCode());
		result = 37 * result + (getDonViCanhsatGtId() == null ? 0 : this.getDonViCanhsatGtId().hashCode());
		result = 37 * result + (getTenCqCapTren() == null ? 0 : this.getTenCqCapTren().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getNgayLapBb() == null ? 0 : this.getNgayLapBb().hashCode());
		result = 37 * result + (getQd21Id() == null ? 0 : this.getQd21Id().hashCode());
		result = 37 * result + (getThuTucHcSo() == null ? 0 : this.getThuTucHcSo().hashCode());
		result = 37 * result + (getThuTucHcNgay() == null ? 0 : this.getThuTucHcNgay().hashCode());
		result = 37 * result + (getThuTucHcKy() == null ? 0 : this.getThuTucHcKy().hashCode());
		result = 37 * result + (getThoiGianLapBb() == null ? 0 : this.getThoiGianLapBb().hashCode());
		result = 37 * result + (getDiaDiemLapBb() == null ? 0 : this.getDiaDiemLapBb().hashCode());
		result = 37 * result + (getCbxlId() == null ? 0 : this.getCbxlId().hashCode());
		result = 37 * result + (getCapBac() == null ? 0 : this.getCapBac().hashCode());
		result = 37 * result + (getChucVu() == null ? 0 : this.getChucVu().hashCode());
		result = 37 * result + (getDonVi() == null ? 0 : this.getDonVi().hashCode());
		result = 37 * result + (getSoCmnd() == null ? 0 : this.getSoCmnd().hashCode());
		result = 37 * result + (getSoDienThoai() == null ? 0 : this.getSoDienThoai().hashCode());
		result = 37 * result + (getTenNguoiNvp() == null ? 0 : this.getTenNguoiNvp().hashCode());
		result = 37 * result + (getNgaySinhNvp() == null ? 0 : this.getNgaySinhNvp().hashCode());
		result = 37 * result + (getQuocTichNvp() == null ? 0 : this.getQuocTichNvp().hashCode());
		result = 37 * result + (getNgheNghiepNvp() == null ? 0 : this.getNgheNghiepNvp().hashCode());
		result = 37 * result + (getSoCmndNvp() == null ? 0 : this.getSoCmndNvp().hashCode());
		result = 37 * result + (getNgayCapCmndNvp() == null ? 0 : this.getNgayCapCmndNvp().hashCode());
		result = 37 * result + (getNoiCapCmndNvp() == null ? 0 : this.getNoiCapCmndNvp().hashCode());
		result = 37 * result + (getDiaChiNvp() == null ? 0 : this.getDiaChiNvp().hashCode());
		result = 37 * result + (getYKienTrinhBay() == null ? 0 : this.getYKienTrinhBay().hashCode());
		result = 37 * result + (getThoiGianKhamKt() == null ? 0 : this.getThoiGianKhamKt().hashCode());
		result = 37 * result + (getNguoiNhanBb() == null ? 0 : this.getNguoiNhanBb().hashCode());
		result = 37 * result + (getThoiGianBbLapXong() == null ? 0 : this.getThoiGianBbLapXong().hashCode());
		result = 37 * result + (getNguoiLapBb() == null ? 0 : this.getNguoiLapBb().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getIdNam() == null ? 0 : this.getIdNam().hashCode());
		result = 37 * result + (getNamTaoQd() == null ? 0 : this.getNamTaoQd().hashCode());
		result = 37 * result + (getNhapBb() == null ? 0 : this.getNhapBb().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getDanhSachNguoiCk() == null ? 0 : this.getDanhSachNguoiCk().hashCode());
		result = 37 * result + (getGioLapBbXong() == null ? 0 : this.getGioLapBbXong().hashCode());
		result = 37 * result + (getPhutLapBbXong() == null ? 0 : this.getPhutLapBbXong().hashCode());
		result = 37 * result + (int) this.getIdTvtg();
		result = 37 * result + (int) this.getSoBienBan();
		result = 37 * result + (int) this.getIndexTvtg();
		result = 37 * result + (getTenTvtg() == null ? 0 : this.getTenTvtg().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonViTinh() == null ? 0 : this.getDonViTinh().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getTinhTrang() == null ? 0 : this.getTinhTrang().hashCode());
		result = 37 * result + (getDiaDiemTvtg() == null ? 0 : this.getDiaDiemTvtg().hashCode());
		return result;
	}

}
