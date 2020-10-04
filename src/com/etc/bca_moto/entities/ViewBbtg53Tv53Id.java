package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewBbtg53Tv53Id
 */
@Embeddable
public class ViewBbtg53Tv53Id implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private Long qd23Id;
	private Date thoiGianLapBb;
	private String diaDiemLapBb;
	private Long cbxlId1;
	private Long cbxlId2;
	private Long cbxlId3;
	private String chungToiGom;
	private String dsChungKien;
	private String tienHanhKham;
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
	private String tenNguoiNhanBb;
	private Date thoiGianBbLapXong;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long idNam;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private long idTvtg;
	private long soBienBan53;
	private Long indexTvtg;
	private String loaiTvtg;
	private Long soLuong;
	private String donViTinh;
	private String ghiChuTvtg;
	private String tinhTrang;

	public ViewBbtg53Tv53Id() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 30)
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

	@Column(name = "QD_23_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd23Id() {
		return this.qd23Id;
	}

	public void setQd23Id(Long qd23Id) {
		this.qd23Id = qd23Id;
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

	@Column(name = "CBXL_ID1", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId1() {
		return this.cbxlId1;
	}

	public void setCbxlId1(Long cbxlId1) {
		this.cbxlId1 = cbxlId1;
	}

	@Column(name = "CBXL_ID2", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId2() {
		return this.cbxlId2;
	}

	public void setCbxlId2(Long cbxlId2) {
		this.cbxlId2 = cbxlId2;
	}

	@Column(name = "CBXL_ID3", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId3() {
		return this.cbxlId3;
	}

	public void setCbxlId3(Long cbxlId3) {
		this.cbxlId3 = cbxlId3;
	}

	@Column(name = "CHUNG_TOI_GOM", columnDefinition = "VARCHAR2", length = 300)
	public String getChungToiGom() {
		return this.chungToiGom;
	}

	public void setChungToiGom(String chungToiGom) {
		this.chungToiGom = chungToiGom;
	}

	@Column(name = "DS_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 250)
	public String getDsChungKien() {
		return this.dsChungKien;
	}

	public void setDsChungKien(String dsChungKien) {
		this.dsChungKien = dsChungKien;
	}

	@Column(name = "TIEN_HANH_KHAM", columnDefinition = "VARCHAR2", length = 300)
	public String getTienHanhKham() {
		return this.tienHanhKham;
	}

	public void setTienHanhKham(String tienHanhKham) {
		this.tienHanhKham = tienHanhKham;
	}

	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 100)
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

	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 150)
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

	@Column(name = "TEN_NGUOI_NHAN_BB", columnDefinition = "VARCHAR2", length = 150)
	public String getTenNguoiNhanBb() {
		return this.tenNguoiNhanBb;
	}

	public void setTenNguoiNhanBb(String tenNguoiNhanBb) {
		this.tenNguoiNhanBb = tenNguoiNhanBb;
	}

	@Column(name = "THOI_GIAN_BB_LAP_XONG", columnDefinition = "DATE", length = 7)
	public Date getThoiGianBbLapXong() {
		return this.thoiGianBbLapXong;
	}

	public void setThoiGianBbLapXong(Date thoiGianBbLapXong) {
		this.thoiGianBbLapXong = thoiGianBbLapXong;
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

	@Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getIdTvtg() {
		return this.idTvtg;
	}

	public void setIdTvtg(long idTvtg) {
		this.idTvtg = idTvtg;
	}

	@Column(name = "SO_BIEN_BAN_53", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getSoBienBan53() {
		return this.soBienBan53;
	}

	public void setSoBienBan53(long soBienBan53) {
		this.soBienBan53 = soBienBan53;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewBbtg53Tv53Id))
			return false;
		ViewBbtg53Tv53Id castOther = (ViewBbtg53Tv53Id) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoBienBan() == castOther.getSoBienBan()) || (this.getSoBienBan() != null
						&& castOther.getSoBienBan() != null && this.getSoBienBan().equals(castOther.getSoBienBan())))
				&& ((this.getDonViCanhsatGtId() == castOther.getDonViCanhsatGtId())
						|| (this.getDonViCanhsatGtId() != null && castOther.getDonViCanhsatGtId() != null
								&& this.getDonViCanhsatGtId().equals(castOther.getDonViCanhsatGtId())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getNgayLapBb() == castOther.getNgayLapBb()) || (this.getNgayLapBb() != null
						&& castOther.getNgayLapBb() != null && this.getNgayLapBb().equals(castOther.getNgayLapBb())))
				&& ((this.getQd23Id() == castOther.getQd23Id()) || (this.getQd23Id() != null
						&& castOther.getQd23Id() != null && this.getQd23Id().equals(castOther.getQd23Id())))
				&& ((this.getThoiGianLapBb() == castOther.getThoiGianLapBb())
						|| (this.getThoiGianLapBb() != null && castOther.getThoiGianLapBb() != null
								&& this.getThoiGianLapBb().equals(castOther.getThoiGianLapBb())))
				&& ((this.getDiaDiemLapBb() == castOther.getDiaDiemLapBb())
						|| (this.getDiaDiemLapBb() != null && castOther.getDiaDiemLapBb() != null
								&& this.getDiaDiemLapBb().equals(castOther.getDiaDiemLapBb())))
				&& ((this.getCbxlId1() == castOther.getCbxlId1()) || (this.getCbxlId1() != null
						&& castOther.getCbxlId1() != null && this.getCbxlId1().equals(castOther.getCbxlId1())))
				&& ((this.getCbxlId2() == castOther.getCbxlId2()) || (this.getCbxlId2() != null
						&& castOther.getCbxlId2() != null && this.getCbxlId2().equals(castOther.getCbxlId2())))
				&& ((this.getCbxlId3() == castOther.getCbxlId3()) || (this.getCbxlId3() != null
						&& castOther.getCbxlId3() != null && this.getCbxlId3().equals(castOther.getCbxlId3())))
				&& ((this.getChungToiGom() == castOther.getChungToiGom())
						|| (this.getChungToiGom() != null && castOther.getChungToiGom() != null
								&& this.getChungToiGom().equals(castOther.getChungToiGom())))
				&& ((this.getDsChungKien() == castOther.getDsChungKien())
						|| (this.getDsChungKien() != null && castOther.getDsChungKien() != null
								&& this.getDsChungKien().equals(castOther.getDsChungKien())))
				&& ((this.getTienHanhKham() == castOther.getTienHanhKham())
						|| (this.getTienHanhKham() != null && castOther.getTienHanhKham() != null
								&& this.getTienHanhKham().equals(castOther.getTienHanhKham())))
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
				&& ((this.getTenNguoiNhanBb() == castOther.getTenNguoiNhanBb())
						|| (this.getTenNguoiNhanBb() != null && castOther.getTenNguoiNhanBb() != null
								&& this.getTenNguoiNhanBb().equals(castOther.getTenNguoiNhanBb())))
				&& ((this.getThoiGianBbLapXong() == castOther.getThoiGianBbLapXong())
						|| (this.getThoiGianBbLapXong() != null && castOther.getThoiGianBbLapXong() != null
								&& this.getThoiGianBbLapXong().equals(castOther.getThoiGianBbLapXong())))
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
				&& (this.getIdTvtg() == castOther.getIdTvtg()) && (this.getSoBienBan53() == castOther.getSoBienBan53())
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
						&& castOther.getTinhTrang() != null && this.getTinhTrang().equals(castOther.getTinhTrang())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoBienBan() == null ? 0 : this.getSoBienBan().hashCode());
		result = 37 * result + (getDonViCanhsatGtId() == null ? 0 : this.getDonViCanhsatGtId().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getNgayLapBb() == null ? 0 : this.getNgayLapBb().hashCode());
		result = 37 * result + (getQd23Id() == null ? 0 : this.getQd23Id().hashCode());
		result = 37 * result + (getThoiGianLapBb() == null ? 0 : this.getThoiGianLapBb().hashCode());
		result = 37 * result + (getDiaDiemLapBb() == null ? 0 : this.getDiaDiemLapBb().hashCode());
		result = 37 * result + (getCbxlId1() == null ? 0 : this.getCbxlId1().hashCode());
		result = 37 * result + (getCbxlId2() == null ? 0 : this.getCbxlId2().hashCode());
		result = 37 * result + (getCbxlId3() == null ? 0 : this.getCbxlId3().hashCode());
		result = 37 * result + (getChungToiGom() == null ? 0 : this.getChungToiGom().hashCode());
		result = 37 * result + (getDsChungKien() == null ? 0 : this.getDsChungKien().hashCode());
		result = 37 * result + (getTienHanhKham() == null ? 0 : this.getTienHanhKham().hashCode());
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
		result = 37 * result + (getTenNguoiNhanBb() == null ? 0 : this.getTenNguoiNhanBb().hashCode());
		result = 37 * result + (getThoiGianBbLapXong() == null ? 0 : this.getThoiGianBbLapXong().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getIdNam() == null ? 0 : this.getIdNam().hashCode());
		result = 37 * result + (getNamTaoQd() == null ? 0 : this.getNamTaoQd().hashCode());
		result = 37 * result + (getNhapBb() == null ? 0 : this.getNhapBb().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (int) this.getIdTvtg();
		result = 37 * result + (int) this.getSoBienBan53();
		result = 37 * result + (getIndexTvtg() == null ? 0 : this.getIndexTvtg().hashCode());
		result = 37 * result + (getLoaiTvtg() == null ? 0 : this.getLoaiTvtg().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonViTinh() == null ? 0 : this.getDonViTinh().hashCode());
		result = 37 * result + (getGhiChuTvtg() == null ? 0 : this.getGhiChuTvtg().hashCode());
		result = 37 * result + (getTinhTrang() == null ? 0 : this.getTinhTrang().hashCode());
		return result;
	}

}
