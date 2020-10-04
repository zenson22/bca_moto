package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewQdtl20Tvtg20Id
 */
@Embeddable
public class ViewQdtl20Tvtg20Id implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private String tenCqCapTren;
	private String tenDonVi;
	private String soBienBanTc;
	private String diaDanhHc;
	private Date ngayLapQd;
	private String canCuXlvphc;
	private String canCuNghiDinh;
	private String canCuQdTamGiu;
	private String canBoRaQd;
	private long canBoRaQdId;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String lyDoTraLai;
	private String canCuQdKeoDai;
	private String tangVatTraLai;
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
	private Long soQd18Tc;
	private String diaChiNvp;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long soQd19Tc;
	private String donViThucHien;
	private String ghiChu;
	private Long canBoTraLai;
	private Date ngayTraLai;
	private Date ngayBatDauXl;
	private Long namTaoQd;
	private Long nhapQd;
	private Long trangThaiQd;
	private Long soBb43Tc;
	private Long qd02Id;
	private String ngaySinhNvpNhap;
	private String maVuViec;
	private String maThongTu;
	private Date ngayQuyetDinhGqxp;
	private Long linhVucGiaoThong;
	private Long donViNhapBb;
	private long idTvtg;
	private long soBienBan20;
	private long indexTvtg;
	private String loaiTvtg;
	private Long soLuong;
	private String donViTinh;
	private String ghiChuTvtg;
	private String tinhTrang;
	private String soTvtg;

	public ViewQdtl20Tvtg20Id() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Column(name = "TEN_CQ_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 200)
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

	@Column(name = "SO_BIEN_BAN_TC", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBanTc() {
		return this.soBienBanTc;
	}

	public void setSoBienBanTc(String soBienBanTc) {
		this.soBienBanTc = soBienBanTc;
	}

	@Column(name = "DIA_DANH_HC", nullable = false, columnDefinition = "VARCHAR2", length = 50)
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

	@Column(name = "CAN_CU_NGHI_DINH", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuNghiDinh() {
		return this.canCuNghiDinh;
	}

	public void setCanCuNghiDinh(String canCuNghiDinh) {
		this.canCuNghiDinh = canCuNghiDinh;
	}

	@Column(name = "CAN_CU_QD_TAM_GIU", nullable = false, columnDefinition = "VARCHAR2", length = 300)
	public String getCanCuQdTamGiu() {
		return this.canCuQdTamGiu;
	}

	public void setCanCuQdTamGiu(String canCuQdTamGiu) {
		this.canCuQdTamGiu = canCuQdTamGiu;
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

	@Column(name = "TEN_NGUOI_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 300)
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

	@Column(name = "LY_DO_TRA_LAI", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getLyDoTraLai() {
		return this.lyDoTraLai;
	}

	public void setLyDoTraLai(String lyDoTraLai) {
		this.lyDoTraLai = lyDoTraLai;
	}

	@Column(name = "CAN_CU_QD_KEO_DAI", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQdKeoDai() {
		return this.canCuQdKeoDai;
	}

	public void setCanCuQdKeoDai(String canCuQdKeoDai) {
		this.canCuQdKeoDai = canCuQdKeoDai;
	}

	@Column(name = "TANG_VAT_TRA_LAI", columnDefinition = "VARCHAR2", length = 500)
	public String getTangVatTraLai() {
		return this.tangVatTraLai;
	}

	public void setTangVatTraLai(String tangVatTraLai) {
		this.tangVatTraLai = tangVatTraLai;
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

	@Column(name = "SO_QD18_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQd18Tc() {
		return this.soQd18Tc;
	}

	public void setSoQd18Tc(Long soQd18Tc) {
		this.soQd18Tc = soQd18Tc;
	}

	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
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

	@Column(name = "SO_QD_19_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQd19Tc() {
		return this.soQd19Tc;
	}

	public void setSoQd19Tc(Long soQd19Tc) {
		this.soQd19Tc = soQd19Tc;
	}

	@Column(name = "DON_VI_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViThucHien() {
		return this.donViThucHien;
	}

	public void setDonViThucHien(String donViThucHien) {
		this.donViThucHien = donViThucHien;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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

	@Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamTaoQd() {
		return this.namTaoQd;
	}

	public void setNamTaoQd(Long namTaoQd) {
		this.namTaoQd = namTaoQd;
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

	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Column(name = "QD02_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd02Id() {
		return this.qd02Id;
	}

	public void setQd02Id(Long qd02Id) {
		this.qd02Id = qd02Id;
	}

	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
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

	@Column(name = "NGAY_QUYET_DINH_GQXP", columnDefinition = "DATE", length = 7)
	public Date getNgayQuyetDinhGqxp() {
		return this.ngayQuyetDinhGqxp;
	}

	public void setNgayQuyetDinhGqxp(Date ngayQuyetDinhGqxp) {
		this.ngayQuyetDinhGqxp = ngayQuyetDinhGqxp;
	}

	@Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLinhVucGiaoThong() {
		return this.linhVucGiaoThong;
	}

	public void setLinhVucGiaoThong(Long linhVucGiaoThong) {
		this.linhVucGiaoThong = linhVucGiaoThong;
	}

	@Column(name = "DON_VI_NHAP_BB", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViNhapBb() {
		return this.donViNhapBb;
	}

	public void setDonViNhapBb(Long donViNhapBb) {
		this.donViNhapBb = donViNhapBb;
	}

	@Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getIdTvtg() {
		return this.idTvtg;
	}

	public void setIdTvtg(long idTvtg) {
		this.idTvtg = idTvtg;
	}

	@Column(name = "SO_BIEN_BAN_20", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getSoBienBan20() {
		return this.soBienBan20;
	}

	public void setSoBienBan20(long soBienBan20) {
		this.soBienBan20 = soBienBan20;
	}

	@Column(name = "INDEX_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getIndexTvtg() {
		return this.indexTvtg;
	}

	public void setIndexTvtg(long indexTvtg) {
		this.indexTvtg = indexTvtg;
	}

	@Column(name = "LOAI_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)
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

	@Column(name = "SO_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 20)
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
		if (!(other instanceof ViewQdtl20Tvtg20Id))
			return false;
		ViewQdtl20Tvtg20Id castOther = (ViewQdtl20Tvtg20Id) other;

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
				&& ((this.getCanCuQdTamGiu() == castOther.getCanCuQdTamGiu())
						|| (this.getCanCuQdTamGiu() != null && castOther.getCanCuQdTamGiu() != null
								&& this.getCanCuQdTamGiu().equals(castOther.getCanCuQdTamGiu())))
				&& ((this.getCanBoRaQd() == castOther.getCanBoRaQd()) || (this.getCanBoRaQd() != null
						&& castOther.getCanBoRaQd() != null && this.getCanBoRaQd().equals(castOther.getCanBoRaQd())))
				&& (this.getCanBoRaQdId() == castOther.getCanBoRaQdId())
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
				&& ((this.getLyDoTraLai() == castOther.getLyDoTraLai()) || (this.getLyDoTraLai() != null
						&& castOther.getLyDoTraLai() != null && this.getLyDoTraLai().equals(castOther.getLyDoTraLai())))
				&& ((this.getCanCuQdKeoDai() == castOther.getCanCuQdKeoDai())
						|| (this.getCanCuQdKeoDai() != null && castOther.getCanCuQdKeoDai() != null
								&& this.getCanCuQdKeoDai().equals(castOther.getCanCuQdKeoDai())))
				&& ((this.getTangVatTraLai() == castOther.getTangVatTraLai())
						|| (this.getTangVatTraLai() != null && castOther.getTangVatTraLai() != null
								&& this.getTangVatTraLai().equals(castOther.getTangVatTraLai())))
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
				&& ((this.getSoQd18Tc() == castOther.getSoQd18Tc()) || (this.getSoQd18Tc() != null
						&& castOther.getSoQd18Tc() != null && this.getSoQd18Tc().equals(castOther.getSoQd18Tc())))
				&& ((this.getDiaChiNvp() == castOther.getDiaChiNvp()) || (this.getDiaChiNvp() != null
						&& castOther.getDiaChiNvp() != null && this.getDiaChiNvp().equals(castOther.getDiaChiNvp())))
				&& ((this.getIdNam() == castOther.getIdNam()) || (this.getIdNam() != null
						&& castOther.getIdNam() != null && this.getIdNam().equals(castOther.getIdNam())))
				&& ((this.getTinhThanhPhoId() == castOther.getTinhThanhPhoId())
						|| (this.getTinhThanhPhoId() != null && castOther.getTinhThanhPhoId() != null
								&& this.getTinhThanhPhoId().equals(castOther.getTinhThanhPhoId())))
				&& ((this.getSoQd19Tc() == castOther.getSoQd19Tc()) || (this.getSoQd19Tc() != null
						&& castOther.getSoQd19Tc() != null && this.getSoQd19Tc().equals(castOther.getSoQd19Tc())))
				&& ((this.getDonViThucHien() == castOther.getDonViThucHien())
						|| (this.getDonViThucHien() != null && castOther.getDonViThucHien() != null
								&& this.getDonViThucHien().equals(castOther.getDonViThucHien())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getCanBoTraLai() == castOther.getCanBoTraLai())
						|| (this.getCanBoTraLai() != null && castOther.getCanBoTraLai() != null
								&& this.getCanBoTraLai().equals(castOther.getCanBoTraLai())))
				&& ((this.getNgayTraLai() == castOther.getNgayTraLai()) || (this.getNgayTraLai() != null
						&& castOther.getNgayTraLai() != null && this.getNgayTraLai().equals(castOther.getNgayTraLai())))
				&& ((this.getNgayBatDauXl() == castOther.getNgayBatDauXl())
						|| (this.getNgayBatDauXl() != null && castOther.getNgayBatDauXl() != null
								&& this.getNgayBatDauXl().equals(castOther.getNgayBatDauXl())))
				&& ((this.getNamTaoQd() == castOther.getNamTaoQd()) || (this.getNamTaoQd() != null
						&& castOther.getNamTaoQd() != null && this.getNamTaoQd().equals(castOther.getNamTaoQd())))
				&& ((this.getNhapQd() == castOther.getNhapQd()) || (this.getNhapQd() != null
						&& castOther.getNhapQd() != null && this.getNhapQd().equals(castOther.getNhapQd())))
				&& ((this.getTrangThaiQd() == castOther.getTrangThaiQd())
						|| (this.getTrangThaiQd() != null && castOther.getTrangThaiQd() != null
								&& this.getTrangThaiQd().equals(castOther.getTrangThaiQd())))
				&& ((this.getSoBb43Tc() == castOther.getSoBb43Tc()) || (this.getSoBb43Tc() != null
						&& castOther.getSoBb43Tc() != null && this.getSoBb43Tc().equals(castOther.getSoBb43Tc())))
				&& ((this.getQd02Id() == castOther.getQd02Id()) || (this.getQd02Id() != null
						&& castOther.getQd02Id() != null && this.getQd02Id().equals(castOther.getQd02Id())))
				&& ((this.getNgaySinhNvpNhap() == castOther.getNgaySinhNvpNhap())
						|| (this.getNgaySinhNvpNhap() != null && castOther.getNgaySinhNvpNhap() != null
								&& this.getNgaySinhNvpNhap().equals(castOther.getNgaySinhNvpNhap())))
				&& ((this.getMaVuViec() == castOther.getMaVuViec()) || (this.getMaVuViec() != null
						&& castOther.getMaVuViec() != null && this.getMaVuViec().equals(castOther.getMaVuViec())))
				&& ((this.getMaThongTu() == castOther.getMaThongTu()) || (this.getMaThongTu() != null
						&& castOther.getMaThongTu() != null && this.getMaThongTu().equals(castOther.getMaThongTu())))
				&& ((this.getNgayQuyetDinhGqxp() == castOther.getNgayQuyetDinhGqxp())
						|| (this.getNgayQuyetDinhGqxp() != null && castOther.getNgayQuyetDinhGqxp() != null
								&& this.getNgayQuyetDinhGqxp().equals(castOther.getNgayQuyetDinhGqxp())))
				&& ((this.getLinhVucGiaoThong() == castOther.getLinhVucGiaoThong())
						|| (this.getLinhVucGiaoThong() != null && castOther.getLinhVucGiaoThong() != null
								&& this.getLinhVucGiaoThong().equals(castOther.getLinhVucGiaoThong())))
				&& ((this.getDonViNhapBb() == castOther.getDonViNhapBb())
						|| (this.getDonViNhapBb() != null && castOther.getDonViNhapBb() != null
								&& this.getDonViNhapBb().equals(castOther.getDonViNhapBb())))
				&& (this.getIdTvtg() == castOther.getIdTvtg()) && (this.getSoBienBan20() == castOther.getSoBienBan20())
				&& (this.getIndexTvtg() == castOther.getIndexTvtg())
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
		result = 37 * result + (getSoQuyetDinh() == null ? 0 : this.getSoQuyetDinh().hashCode());
		result = 37 * result + (getTenCqCapTren() == null ? 0 : this.getTenCqCapTren().hashCode());
		result = 37 * result + (getTenDonVi() == null ? 0 : this.getTenDonVi().hashCode());
		result = 37 * result + (getSoBienBanTc() == null ? 0 : this.getSoBienBanTc().hashCode());
		result = 37 * result + (getDiaDanhHc() == null ? 0 : this.getDiaDanhHc().hashCode());
		result = 37 * result + (getNgayLapQd() == null ? 0 : this.getNgayLapQd().hashCode());
		result = 37 * result + (getCanCuXlvphc() == null ? 0 : this.getCanCuXlvphc().hashCode());
		result = 37 * result + (getCanCuNghiDinh() == null ? 0 : this.getCanCuNghiDinh().hashCode());
		result = 37 * result + (getCanCuQdTamGiu() == null ? 0 : this.getCanCuQdTamGiu().hashCode());
		result = 37 * result + (getCanBoRaQd() == null ? 0 : this.getCanBoRaQd().hashCode());
		result = 37 * result + (int) this.getCanBoRaQdId();
		result = 37 * result + (getTenNguoiNvp() == null ? 0 : this.getTenNguoiNvp().hashCode());
		result = 37 * result + (getNgaySinhNvp() == null ? 0 : this.getNgaySinhNvp().hashCode());
		result = 37 * result + (getQuocTichNvp() == null ? 0 : this.getQuocTichNvp().hashCode());
		result = 37 * result + (getNgheNghiepNvp() == null ? 0 : this.getNgheNghiepNvp().hashCode());
		result = 37 * result + (getSoCmndNvp() == null ? 0 : this.getSoCmndNvp().hashCode());
		result = 37 * result + (getNgayCapCmndNvp() == null ? 0 : this.getNgayCapCmndNvp().hashCode());
		result = 37 * result + (getNoiCapCmndNvp() == null ? 0 : this.getNoiCapCmndNvp().hashCode());
		result = 37 * result + (getLyDoTraLai() == null ? 0 : this.getLyDoTraLai().hashCode());
		result = 37 * result + (getCanCuQdKeoDai() == null ? 0 : this.getCanCuQdKeoDai().hashCode());
		result = 37 * result + (getTangVatTraLai() == null ? 0 : this.getTangVatTraLai().hashCode());
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
		result = 37 * result + (getSoQd18Tc() == null ? 0 : this.getSoQd18Tc().hashCode());
		result = 37 * result + (getDiaChiNvp() == null ? 0 : this.getDiaChiNvp().hashCode());
		result = 37 * result + (getIdNam() == null ? 0 : this.getIdNam().hashCode());
		result = 37 * result + (getTinhThanhPhoId() == null ? 0 : this.getTinhThanhPhoId().hashCode());
		result = 37 * result + (getSoQd19Tc() == null ? 0 : this.getSoQd19Tc().hashCode());
		result = 37 * result + (getDonViThucHien() == null ? 0 : this.getDonViThucHien().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getCanBoTraLai() == null ? 0 : this.getCanBoTraLai().hashCode());
		result = 37 * result + (getNgayTraLai() == null ? 0 : this.getNgayTraLai().hashCode());
		result = 37 * result + (getNgayBatDauXl() == null ? 0 : this.getNgayBatDauXl().hashCode());
		result = 37 * result + (getNamTaoQd() == null ? 0 : this.getNamTaoQd().hashCode());
		result = 37 * result + (getNhapQd() == null ? 0 : this.getNhapQd().hashCode());
		result = 37 * result + (getTrangThaiQd() == null ? 0 : this.getTrangThaiQd().hashCode());
		result = 37 * result + (getSoBb43Tc() == null ? 0 : this.getSoBb43Tc().hashCode());
		result = 37 * result + (getQd02Id() == null ? 0 : this.getQd02Id().hashCode());
		result = 37 * result + (getNgaySinhNvpNhap() == null ? 0 : this.getNgaySinhNvpNhap().hashCode());
		result = 37 * result + (getMaVuViec() == null ? 0 : this.getMaVuViec().hashCode());
		result = 37 * result + (getMaThongTu() == null ? 0 : this.getMaThongTu().hashCode());
		result = 37 * result + (getNgayQuyetDinhGqxp() == null ? 0 : this.getNgayQuyetDinhGqxp().hashCode());
		result = 37 * result + (getLinhVucGiaoThong() == null ? 0 : this.getLinhVucGiaoThong().hashCode());
		result = 37 * result + (getDonViNhapBb() == null ? 0 : this.getDonViNhapBb().hashCode());
		result = 37 * result + (int) this.getIdTvtg();
		result = 37 * result + (int) this.getSoBienBan20();
		result = 37 * result + (int) this.getIndexTvtg();
		result = 37 * result + (getLoaiTvtg() == null ? 0 : this.getLoaiTvtg().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonViTinh() == null ? 0 : this.getDonViTinh().hashCode());
		result = 37 * result + (getGhiChuTvtg() == null ? 0 : this.getGhiChuTvtg().hashCode());
		result = 37 * result + (getTinhTrang() == null ? 0 : this.getTinhTrang().hashCode());
		result = 37 * result + (getSoTvtg() == null ? 0 : this.getSoTvtg().hashCode());
		return result;
	}

}
