package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewBb58Tvtg58Id
 */
@Embeddable
public class ViewBb58Tvtg58Id implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private String gioLapBb;
	private String phutLapBb;
	private String diaDiemLap;
	private Long qd36Id;
	private String tenNguoiGiao1;
	private String capBacChucVuNg1;
	private String donViNg1;
	private String tenNguoiGiao2;
	private String capBacChucVuNg2;
	private String donViNg2;
	private String tenNguoiNvp;
	private String ngaySinhNvp;
	private String quocTichNvp;
	private String diaChiNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String gioLapBbXong;
	private String phutLapBbXong;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private long idTvtg;
	private long soBienBan58;
	private Long indexTvtg;
	private String loaiTvtg;
	private Long soLuong;
	private String donViTinh;
	private String ghiChuTvtg;
	private String tinhTrang;
	private String soTvtg;

	public ViewBb58Tvtg58Id() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(String soBienBan) {
		this.soBienBan = soBienBan;
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

	@Column(name = "QD36_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd36Id() {
		return this.qd36Id;
	}

	public void setQd36Id(Long qd36Id) {
		this.qd36Id = qd36Id;
	}

	@Column(name = "TEN_NGUOI_GIAO1", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiGiao1() {
		return this.tenNguoiGiao1;
	}

	public void setTenNguoiGiao1(String tenNguoiGiao1) {
		this.tenNguoiGiao1 = tenNguoiGiao1;
	}

	@Column(name = "CAP_BAC_CHUC_VU_NG1", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVuNg1() {
		return this.capBacChucVuNg1;
	}

	public void setCapBacChucVuNg1(String capBacChucVuNg1) {
		this.capBacChucVuNg1 = capBacChucVuNg1;
	}

	@Column(name = "DON_VI_NG1", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViNg1() {
		return this.donViNg1;
	}

	public void setDonViNg1(String donViNg1) {
		this.donViNg1 = donViNg1;
	}

	@Column(name = "TEN_NGUOI_GIAO2", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiGiao2() {
		return this.tenNguoiGiao2;
	}

	public void setTenNguoiGiao2(String tenNguoiGiao2) {
		this.tenNguoiGiao2 = tenNguoiGiao2;
	}

	@Column(name = "CAP_BAC_CHUC_VU_NG2", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVuNg2() {
		return this.capBacChucVuNg2;
	}

	public void setCapBacChucVuNg2(String capBacChucVuNg2) {
		this.capBacChucVuNg2 = capBacChucVuNg2;
	}

	@Column(name = "DON_VI_NG2", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViNg2() {
		return this.donViNg2;
	}

	public void setDonViNg2(String donViNg2) {
		this.donViNg2 = donViNg2;
	}

	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiNvp() {
		return this.tenNguoiNvp;
	}

	public void setTenNguoiNvp(String tenNguoiNvp) {
		this.tenNguoiNvp = tenNguoiNvp;
	}

	@Column(name = "NGAY_SINH_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvp() {
		return this.ngaySinhNvp;
	}

	public void setNgaySinhNvp(String ngaySinhNvp) {
		this.ngaySinhNvp = ngaySinhNvp;
	}

	@Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)
	public String getQuocTichNvp() {
		return this.quocTichNvp;
	}

	public void setQuocTichNvp(String quocTichNvp) {
		this.quocTichNvp = quocTichNvp;
	}

	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 200)
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

	@Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getIdTvtg() {
		return this.idTvtg;
	}

	public void setIdTvtg(long idTvtg) {
		this.idTvtg = idTvtg;
	}

	@Column(name = "SO_BIEN_BAN_58", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getSoBienBan58() {
		return this.soBienBan58;
	}

	public void setSoBienBan58(long soBienBan58) {
		this.soBienBan58 = soBienBan58;
	}

	@Column(name = "INDEX_TVTG", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getIndexTvtg() {
		return this.indexTvtg;
	}

	public void setIndexTvtg(Long indexTvtg) {
		this.indexTvtg = indexTvtg;
	}

	@Column(name = "LOAI_TVTG", columnDefinition = "VARCHAR2", length = 50)
	public String getLoaiTvtg() {
		return this.loaiTvtg;
	}

	public void setLoaiTvtg(String loaiTvtg) {
		this.loaiTvtg = loaiTvtg;
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

	@Column(name = "GHI_CHU_TVTG", columnDefinition = "VARCHAR2")
	public String getGhiChuTvtg() {
		return this.ghiChuTvtg;
	}

	public void setGhiChuTvtg(String ghiChuTvtg) {
		this.ghiChuTvtg = ghiChuTvtg;
	}

	@Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)
	public String getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Column(name = "SO_TVTG", columnDefinition = "VARCHAR2", length = 20)
	public String getSoTvtg() {
		return this.soTvtg;
	}

	public void setSoTvtg(String soTvtg) {
		this.soTvtg = soTvtg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewBb58Tvtg58Id))
			return false;
		ViewBb58Tvtg58Id castOther = (ViewBb58Tvtg58Id) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoBienBan() == castOther.getSoBienBan()) || (this.getSoBienBan() != null
						&& castOther.getSoBienBan() != null && this.getSoBienBan().equals(castOther.getSoBienBan())))
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
				&& ((this.getGioLapBb() == castOther.getGioLapBb()) || (this.getGioLapBb() != null
						&& castOther.getGioLapBb() != null && this.getGioLapBb().equals(castOther.getGioLapBb())))
				&& ((this.getPhutLapBb() == castOther.getPhutLapBb()) || (this.getPhutLapBb() != null
						&& castOther.getPhutLapBb() != null && this.getPhutLapBb().equals(castOther.getPhutLapBb())))
				&& ((this.getDiaDiemLap() == castOther.getDiaDiemLap()) || (this.getDiaDiemLap() != null
						&& castOther.getDiaDiemLap() != null && this.getDiaDiemLap().equals(castOther.getDiaDiemLap())))
				&& ((this.getQd36Id() == castOther.getQd36Id()) || (this.getQd36Id() != null
						&& castOther.getQd36Id() != null && this.getQd36Id().equals(castOther.getQd36Id())))
				&& ((this.getTenNguoiGiao1() == castOther.getTenNguoiGiao1())
						|| (this.getTenNguoiGiao1() != null && castOther.getTenNguoiGiao1() != null
								&& this.getTenNguoiGiao1().equals(castOther.getTenNguoiGiao1())))
				&& ((this.getCapBacChucVuNg1() == castOther.getCapBacChucVuNg1())
						|| (this.getCapBacChucVuNg1() != null && castOther.getCapBacChucVuNg1() != null
								&& this.getCapBacChucVuNg1().equals(castOther.getCapBacChucVuNg1())))
				&& ((this.getDonViNg1() == castOther.getDonViNg1()) || (this.getDonViNg1() != null
						&& castOther.getDonViNg1() != null && this.getDonViNg1().equals(castOther.getDonViNg1())))
				&& ((this.getTenNguoiGiao2() == castOther.getTenNguoiGiao2())
						|| (this.getTenNguoiGiao2() != null && castOther.getTenNguoiGiao2() != null
								&& this.getTenNguoiGiao2().equals(castOther.getTenNguoiGiao2())))
				&& ((this.getCapBacChucVuNg2() == castOther.getCapBacChucVuNg2())
						|| (this.getCapBacChucVuNg2() != null && castOther.getCapBacChucVuNg2() != null
								&& this.getCapBacChucVuNg2().equals(castOther.getCapBacChucVuNg2())))
				&& ((this.getDonViNg2() == castOther.getDonViNg2()) || (this.getDonViNg2() != null
						&& castOther.getDonViNg2() != null && this.getDonViNg2().equals(castOther.getDonViNg2())))
				&& ((this.getTenNguoiNvp() == castOther.getTenNguoiNvp())
						|| (this.getTenNguoiNvp() != null && castOther.getTenNguoiNvp() != null
								&& this.getTenNguoiNvp().equals(castOther.getTenNguoiNvp())))
				&& ((this.getNgaySinhNvp() == castOther.getNgaySinhNvp())
						|| (this.getNgaySinhNvp() != null && castOther.getNgaySinhNvp() != null
								&& this.getNgaySinhNvp().equals(castOther.getNgaySinhNvp())))
				&& ((this.getQuocTichNvp() == castOther.getQuocTichNvp())
						|| (this.getQuocTichNvp() != null && castOther.getQuocTichNvp() != null
								&& this.getQuocTichNvp().equals(castOther.getQuocTichNvp())))
				&& ((this.getDiaChiNvp() == castOther.getDiaChiNvp()) || (this.getDiaChiNvp() != null
						&& castOther.getDiaChiNvp() != null && this.getDiaChiNvp().equals(castOther.getDiaChiNvp())))
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
				&& ((this.getGioLapBbXong() == castOther.getGioLapBbXong())
						|| (this.getGioLapBbXong() != null && castOther.getGioLapBbXong() != null
								&& this.getGioLapBbXong().equals(castOther.getGioLapBbXong())))
				&& ((this.getPhutLapBbXong() == castOther.getPhutLapBbXong())
						|| (this.getPhutLapBbXong() != null && castOther.getPhutLapBbXong() != null
								&& this.getPhutLapBbXong().equals(castOther.getPhutLapBbXong())))
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
				&& (this.getIdTvtg() == castOther.getIdTvtg()) && (this.getSoBienBan58() == castOther.getSoBienBan58())
				&& ((this.getIndexTvtg() == castOther.getIndexTvtg()) || (this.getIndexTvtg() != null
						&& castOther.getIndexTvtg() != null && this.getIndexTvtg().equals(castOther.getIndexTvtg())))
				&& ((this.getLoaiTvtg() == castOther.getLoaiTvtg()) || (this.getLoaiTvtg() != null
						&& castOther.getLoaiTvtg() != null && this.getLoaiTvtg().equals(castOther.getLoaiTvtg())))
				&& ((this.getSoLuong() == castOther.getSoLuong()) || (this.getSoLuong() != null
						&& castOther.getSoLuong() != null && this.getSoLuong().equals(castOther.getSoLuong())))
				&& ((this.getDonViTinh() == castOther.getDonViTinh()) || (this.getDonViTinh() != null
						&& castOther.getDonViTinh() != null && this.getDonViTinh().equals(castOther.getDonViTinh())))
				&& ((this.getGhiChuTvtg() == castOther.getGhiChuTvtg()) || (this.getGhiChuTvtg() != null
						&& castOther.getGhiChuTvtg() != null && this.getGhiChuTvtg().equals(castOther.getGhiChuTvtg())))
				&& ((this.getTinhTrang() == castOther.getTinhTrang()) || (this.getTinhTrang() != null
						&& castOther.getTinhTrang() != null && this.getTinhTrang().equals(castOther.getTinhTrang())))
				&& ((this.getSoTvtg() == castOther.getSoTvtg()) || (this.getSoTvtg() != null
						&& castOther.getSoTvtg() != null && this.getSoTvtg().equals(castOther.getSoTvtg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoBienBan() == null ? 0 : this.getSoBienBan().hashCode());
		result = 37 * result + (getDonViCanhsatGtId() == null ? 0 : this.getDonViCanhsatGtId().hashCode());
		result = 37 * result + (getTenCqCapTren() == null ? 0 : this.getTenCqCapTren().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getNgayLapBb() == null ? 0 : this.getNgayLapBb().hashCode());
		result = 37 * result + (getGioLapBb() == null ? 0 : this.getGioLapBb().hashCode());
		result = 37 * result + (getPhutLapBb() == null ? 0 : this.getPhutLapBb().hashCode());
		result = 37 * result + (getDiaDiemLap() == null ? 0 : this.getDiaDiemLap().hashCode());
		result = 37 * result + (getQd36Id() == null ? 0 : this.getQd36Id().hashCode());
		result = 37 * result + (getTenNguoiGiao1() == null ? 0 : this.getTenNguoiGiao1().hashCode());
		result = 37 * result + (getCapBacChucVuNg1() == null ? 0 : this.getCapBacChucVuNg1().hashCode());
		result = 37 * result + (getDonViNg1() == null ? 0 : this.getDonViNg1().hashCode());
		result = 37 * result + (getTenNguoiGiao2() == null ? 0 : this.getTenNguoiGiao2().hashCode());
		result = 37 * result + (getCapBacChucVuNg2() == null ? 0 : this.getCapBacChucVuNg2().hashCode());
		result = 37 * result + (getDonViNg2() == null ? 0 : this.getDonViNg2().hashCode());
		result = 37 * result + (getTenNguoiNvp() == null ? 0 : this.getTenNguoiNvp().hashCode());
		result = 37 * result + (getNgaySinhNvp() == null ? 0 : this.getNgaySinhNvp().hashCode());
		result = 37 * result + (getQuocTichNvp() == null ? 0 : this.getQuocTichNvp().hashCode());
		result = 37 * result + (getDiaChiNvp() == null ? 0 : this.getDiaChiNvp().hashCode());
		result = 37 * result + (getNgheNghiepNvp() == null ? 0 : this.getNgheNghiepNvp().hashCode());
		result = 37 * result + (getSoCmndNvp() == null ? 0 : this.getSoCmndNvp().hashCode());
		result = 37 * result + (getNgayCapCmndNvp() == null ? 0 : this.getNgayCapCmndNvp().hashCode());
		result = 37 * result + (getNoiCapCmndNvp() == null ? 0 : this.getNoiCapCmndNvp().hashCode());
		result = 37 * result + (getGioLapBbXong() == null ? 0 : this.getGioLapBbXong().hashCode());
		result = 37 * result + (getPhutLapBbXong() == null ? 0 : this.getPhutLapBbXong().hashCode());
		result = 37 * result + (getCbxlId() == null ? 0 : this.getCbxlId().hashCode());
		result = 37 * result + (getIdNam() == null ? 0 : this.getIdNam().hashCode());
		result = 37 * result + (getTinhThanhPhoId() == null ? 0 : this.getTinhThanhPhoId().hashCode());
		result = 37 * result + (getNamTaoQd() == null ? 0 : this.getNamTaoQd().hashCode());
		result = 37 * result + (getNhapBb() == null ? 0 : this.getNhapBb().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (int) this.getIdTvtg();
		result = 37 * result + (int) this.getSoBienBan58();
		result = 37 * result + (getIndexTvtg() == null ? 0 : this.getIndexTvtg().hashCode());
		result = 37 * result + (getLoaiTvtg() == null ? 0 : this.getLoaiTvtg().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonViTinh() == null ? 0 : this.getDonViTinh().hashCode());
		result = 37 * result + (getGhiChuTvtg() == null ? 0 : this.getGhiChuTvtg().hashCode());
		result = 37 * result + (getTinhTrang() == null ? 0 : this.getTinhTrang().hashCode());
		result = 37 * result + (getSoTvtg() == null ? 0 : this.getSoTvtg().hashCode());
		return result;
	}

}
