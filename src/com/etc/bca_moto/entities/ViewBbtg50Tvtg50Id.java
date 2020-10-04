package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewBbtg50Tvtg50Id
 */
@Embeddable
public class ViewBbtg50Tvtg50Id implements java.io.Serializable {

	private long id;
	private String soBienBanTg;
	private String tenCqCapTren;
	private String tenDonVi;
	private String soBienBanTc;
	private String diaDanhHc;
	private Date ngayLapBbTg;
	private String canCuXlvphc;
	private String danhSachCanBo;
	private String canCuQuyetDinhTg;
	private String canBoTaoBbTg;
	private long canBoTaoBbTgId;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private Long soQuyetDinhTgTc;
	private Date ngayQuyetDinhTd;
	private String canBoKyQdTg;
	private Date thoiGianLapBbTg;
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
	private Long idNam;
	private Long tinhThanhPhoId;
	private Date thoiGianTg;
	private String danhSachNguoiCk;
	private String YKienNvp;
	private String YKienNck;
	private String YKienBoSung;
	private String lyDoKhongKyBb;
	private String diaDiemTg;
	private Date ngayBatDauXl;
	private Long canBoTraLai;
	private Date ngayTraLai;
	private Long namTaoBb;
	private Long nhapBb;
	private Long trangThaiBb;
	private Long soBb43Tc;
	private String gioLapBb;
	private String phutLapBb;
	private String canBo18;
	private String maVuViec;
	private String maThongTu;
	private String dacDiemTangVat1;
	private String dacDiemTangVat2;
	private String ghiChu1;
	private String ghiChu2;
	private String ngaySinhNvpNhap;
	private Long linhVucGiaoThong;
	private long idTvtg;
	private long soBienBan50;
	private long indexTvtg;
	private String loaiTvtg;
	private Long soLuong;
	private String donViTinh;
	private String ghiChuTvtg;
	private String tinhTrang;
	private String soTvtg;
	private String dacDiemChung;

	public ViewBbtg50Tvtg50Id() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_BIEN_BAN_TG", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBanTg() {
		return this.soBienBanTg;
	}

	public void setSoBienBanTg(String soBienBanTg) {
		this.soBienBanTg = soBienBanTg;
	}

	@Column(name = "TEN_CQ_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Column(name = "TEN_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 150)
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

	@Column(name = "NGAY_LAP_BB_TG", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayLapBbTg() {
		return this.ngayLapBbTg;
	}

	public void setNgayLapBbTg(Date ngayLapBbTg) {
		this.ngayLapBbTg = ngayLapBbTg;
	}

	@Column(name = "CAN_CU_XLVPHC", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuXlvphc() {
		return this.canCuXlvphc;
	}

	public void setCanCuXlvphc(String canCuXlvphc) {
		this.canCuXlvphc = canCuXlvphc;
	}

	@Column(name = "DANH_SACH_CAN_BO", columnDefinition = "VARCHAR2", length = 2000)
	public String getDanhSachCanBo() {
		return this.danhSachCanBo;
	}

	public void setDanhSachCanBo(String danhSachCanBo) {
		this.danhSachCanBo = danhSachCanBo;
	}

	@Column(name = "CAN_CU_QUYET_DINH_TG", columnDefinition = "VARCHAR2", length = 300)
	public String getCanCuQuyetDinhTg() {
		return this.canCuQuyetDinhTg;
	}

	public void setCanCuQuyetDinhTg(String canCuQuyetDinhTg) {
		this.canCuQuyetDinhTg = canCuQuyetDinhTg;
	}

	@Column(name = "CAN_BO_TAO_BB_TG", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getCanBoTaoBbTg() {
		return this.canBoTaoBbTg;
	}

	public void setCanBoTaoBbTg(String canBoTaoBbTg) {
		this.canBoTaoBbTg = canBoTaoBbTg;
	}

	@Column(name = "CAN_BO_TAO_BB_TG_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanBoTaoBbTgId() {
		return this.canBoTaoBbTgId;
	}

	public void setCanBoTaoBbTgId(long canBoTaoBbTgId) {
		this.canBoTaoBbTgId = canBoTaoBbTgId;
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

	@Column(name = "SO_QUYET_DINH_TG_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQuyetDinhTgTc() {
		return this.soQuyetDinhTgTc;
	}

	public void setSoQuyetDinhTgTc(Long soQuyetDinhTgTc) {
		this.soQuyetDinhTgTc = soQuyetDinhTgTc;
	}

	@Column(name = "NGAY_QUYET_DINH_TD", columnDefinition = "DATE", length = 7)
	public Date getNgayQuyetDinhTd() {
		return this.ngayQuyetDinhTd;
	}

	public void setNgayQuyetDinhTd(Date ngayQuyetDinhTd) {
		this.ngayQuyetDinhTd = ngayQuyetDinhTd;
	}

	@Column(name = "CAN_BO_KY_QD_TG", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoKyQdTg() {
		return this.canBoKyQdTg;
	}

	public void setCanBoKyQdTg(String canBoKyQdTg) {
		this.canBoKyQdTg = canBoKyQdTg;
	}

	@Column(name = "THOI_GIAN_LAP_BB_TG", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getThoiGianLapBbTg() {
		return this.thoiGianLapBbTg;
	}

	public void setThoiGianLapBbTg(Date thoiGianLapBbTg) {
		this.thoiGianLapBbTg = thoiGianLapBbTg;
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

	@Column(name = "THOI_GIAN_TG", columnDefinition = "DATE", length = 7)
	public Date getThoiGianTg() {
		return this.thoiGianTg;
	}

	public void setThoiGianTg(Date thoiGianTg) {
		this.thoiGianTg = thoiGianTg;
	}

	@Column(name = "DANH_SACH_NGUOI_CK", columnDefinition = "VARCHAR2", length = 2000)
	public String getDanhSachNguoiCk() {
		return this.danhSachNguoiCk;
	}

	public void setDanhSachNguoiCk(String danhSachNguoiCk) {
		this.danhSachNguoiCk = danhSachNguoiCk;
	}

	@Column(name = "Y_KIEN_NVP", columnDefinition = "VARCHAR2", length = 500)
	public String getYKienNvp() {
		return this.YKienNvp;
	}

	public void setYKienNvp(String YKienNvp) {
		this.YKienNvp = YKienNvp;
	}

	@Column(name = "Y_KIEN_NCK", columnDefinition = "VARCHAR2", length = 500)
	public String getYKienNck() {
		return this.YKienNck;
	}

	public void setYKienNck(String YKienNck) {
		this.YKienNck = YKienNck;
	}

	@Column(name = "Y_KIEN_BO_SUNG", columnDefinition = "VARCHAR2", length = 500)
	public String getYKienBoSung() {
		return this.YKienBoSung;
	}

	public void setYKienBoSung(String YKienBoSung) {
		this.YKienBoSung = YKienBoSung;
	}

	@Column(name = "LY_DO_KHONG_KY_BB", columnDefinition = "VARCHAR2", length = 300)
	public String getLyDoKhongKyBb() {
		return this.lyDoKhongKyBb;
	}

	public void setLyDoKhongKyBb(String lyDoKhongKyBb) {
		this.lyDoKhongKyBb = lyDoKhongKyBb;
	}

	@Column(name = "DIA_DIEM_TG", columnDefinition = "VARCHAR2", length = 500)
	public String getDiaDiemTg() {
		return this.diaDiemTg;
	}

	public void setDiaDiemTg(String diaDiemTg) {
		this.diaDiemTg = diaDiemTg;
	}

	@Column(name = "NGAY_BAT_DAU_XL", columnDefinition = "DATE", length = 7)
	public Date getNgayBatDauXl() {
		return this.ngayBatDauXl;
	}

	public void setNgayBatDauXl(Date ngayBatDauXl) {
		this.ngayBatDauXl = ngayBatDauXl;
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

	@Column(name = "NAM_TAO_BB", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamTaoBb() {
		return this.namTaoBb;
	}

	public void setNamTaoBb(Long namTaoBb) {
		this.namTaoBb = namTaoBb;
	}

	@Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapBb() {
		return this.nhapBb;
	}

	public void setNhapBb(Long nhapBb) {
		this.nhapBb = nhapBb;
	}

	@Column(name = "TRANG_THAI_BB", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiBb() {
		return this.trangThaiBb;
	}

	public void setTrangThaiBb(Long trangThaiBb) {
		this.trangThaiBb = trangThaiBb;
	}

	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Column(name = "GIO_LAP_BB", columnDefinition = "VARCHAR2", length = 20)
	public String getGioLapBb() {
		return this.gioLapBb;
	}

	public void setGioLapBb(String gioLapBb) {
		this.gioLapBb = gioLapBb;
	}

	@Column(name = "PHUT_LAP_BB", columnDefinition = "VARCHAR2", length = 20)
	public String getPhutLapBb() {
		return this.phutLapBb;
	}

	public void setPhutLapBb(String phutLapBb) {
		this.phutLapBb = phutLapBb;
	}

	@Column(name = "CAN_BO_18", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBo18() {
		return this.canBo18;
	}

	public void setCanBo18(String canBo18) {
		this.canBo18 = canBo18;
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

	@Column(name = "DAC_DIEM_TANG_VAT1", columnDefinition = "VARCHAR2", length = 1000)
	public String getDacDiemTangVat1() {
		return this.dacDiemTangVat1;
	}

	public void setDacDiemTangVat1(String dacDiemTangVat1) {
		this.dacDiemTangVat1 = dacDiemTangVat1;
	}

	@Column(name = "DAC_DIEM_TANG_VAT2", columnDefinition = "VARCHAR2", length = 500)
	public String getDacDiemTangVat2() {
		return this.dacDiemTangVat2;
	}

	public void setDacDiemTangVat2(String dacDiemTangVat2) {
		this.dacDiemTangVat2 = dacDiemTangVat2;
	}

	@Column(name = "GHI_CHU1", columnDefinition = "VARCHAR2", length = 500)
	public String getGhiChu1() {
		return this.ghiChu1;
	}

	public void setGhiChu1(String ghiChu1) {
		this.ghiChu1 = ghiChu1;
	}

	@Column(name = "GHI_CHU2", columnDefinition = "VARCHAR2", length = 500)
	public String getGhiChu2() {
		return this.ghiChu2;
	}

	public void setGhiChu2(String ghiChu2) {
		this.ghiChu2 = ghiChu2;
	}

	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLinhVucGiaoThong() {
		return this.linhVucGiaoThong;
	}

	public void setLinhVucGiaoThong(Long linhVucGiaoThong) {
		this.linhVucGiaoThong = linhVucGiaoThong;
	}

	@Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getIdTvtg() {
		return this.idTvtg;
	}

	public void setIdTvtg(long idTvtg) {
		this.idTvtg = idTvtg;
	}

	@Column(name = "SO_BIEN_BAN_50", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getSoBienBan50() {
		return this.soBienBan50;
	}

	public void setSoBienBan50(long soBienBan50) {
		this.soBienBan50 = soBienBan50;
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

	@Column(name = "SO_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoTvtg() {
		return this.soTvtg;
	}

	public void setSoTvtg(String soTvtg) {
		this.soTvtg = soTvtg;
	}

	@Column(name = "DAC_DIEM_CHUNG", columnDefinition = "VARCHAR2", length = 500)
	public String getDacDiemChung() {
		return this.dacDiemChung;
	}

	public void setDacDiemChung(String dacDiemChung) {
		this.dacDiemChung = dacDiemChung;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewBbtg50Tvtg50Id))
			return false;
		ViewBbtg50Tvtg50Id castOther = (ViewBbtg50Tvtg50Id) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoBienBanTg() == castOther.getSoBienBanTg())
						|| (this.getSoBienBanTg() != null && castOther.getSoBienBanTg() != null
								&& this.getSoBienBanTg().equals(castOther.getSoBienBanTg())))
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
				&& ((this.getNgayLapBbTg() == castOther.getNgayLapBbTg())
						|| (this.getNgayLapBbTg() != null && castOther.getNgayLapBbTg() != null
								&& this.getNgayLapBbTg().equals(castOther.getNgayLapBbTg())))
				&& ((this.getCanCuXlvphc() == castOther.getCanCuXlvphc())
						|| (this.getCanCuXlvphc() != null && castOther.getCanCuXlvphc() != null
								&& this.getCanCuXlvphc().equals(castOther.getCanCuXlvphc())))
				&& ((this.getDanhSachCanBo() == castOther.getDanhSachCanBo())
						|| (this.getDanhSachCanBo() != null && castOther.getDanhSachCanBo() != null
								&& this.getDanhSachCanBo().equals(castOther.getDanhSachCanBo())))
				&& ((this.getCanCuQuyetDinhTg() == castOther.getCanCuQuyetDinhTg())
						|| (this.getCanCuQuyetDinhTg() != null && castOther.getCanCuQuyetDinhTg() != null
								&& this.getCanCuQuyetDinhTg().equals(castOther.getCanCuQuyetDinhTg())))
				&& ((this.getCanBoTaoBbTg() == castOther.getCanBoTaoBbTg())
						|| (this.getCanBoTaoBbTg() != null && castOther.getCanBoTaoBbTg() != null
								&& this.getCanBoTaoBbTg().equals(castOther.getCanBoTaoBbTg())))
				&& (this.getCanBoTaoBbTgId() == castOther.getCanBoTaoBbTgId())
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
				&& ((this.getSoQuyetDinhTgTc() == castOther.getSoQuyetDinhTgTc())
						|| (this.getSoQuyetDinhTgTc() != null && castOther.getSoQuyetDinhTgTc() != null
								&& this.getSoQuyetDinhTgTc().equals(castOther.getSoQuyetDinhTgTc())))
				&& ((this.getNgayQuyetDinhTd() == castOther.getNgayQuyetDinhTd())
						|| (this.getNgayQuyetDinhTd() != null && castOther.getNgayQuyetDinhTd() != null
								&& this.getNgayQuyetDinhTd().equals(castOther.getNgayQuyetDinhTd())))
				&& ((this.getCanBoKyQdTg() == castOther.getCanBoKyQdTg())
						|| (this.getCanBoKyQdTg() != null && castOther.getCanBoKyQdTg() != null
								&& this.getCanBoKyQdTg().equals(castOther.getCanBoKyQdTg())))
				&& ((this.getThoiGianLapBbTg() == castOther.getThoiGianLapBbTg())
						|| (this.getThoiGianLapBbTg() != null && castOther.getThoiGianLapBbTg() != null
								&& this.getThoiGianLapBbTg().equals(castOther.getThoiGianLapBbTg())))
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
				&& ((this.getIdNam() == castOther.getIdNam()) || (this.getIdNam() != null
						&& castOther.getIdNam() != null && this.getIdNam().equals(castOther.getIdNam())))
				&& ((this.getTinhThanhPhoId() == castOther.getTinhThanhPhoId())
						|| (this.getTinhThanhPhoId() != null && castOther.getTinhThanhPhoId() != null
								&& this.getTinhThanhPhoId().equals(castOther.getTinhThanhPhoId())))
				&& ((this.getThoiGianTg() == castOther.getThoiGianTg()) || (this.getThoiGianTg() != null
						&& castOther.getThoiGianTg() != null && this.getThoiGianTg().equals(castOther.getThoiGianTg())))
				&& ((this.getDanhSachNguoiCk() == castOther.getDanhSachNguoiCk())
						|| (this.getDanhSachNguoiCk() != null && castOther.getDanhSachNguoiCk() != null
								&& this.getDanhSachNguoiCk().equals(castOther.getDanhSachNguoiCk())))
				&& ((this.getYKienNvp() == castOther.getYKienNvp()) || (this.getYKienNvp() != null
						&& castOther.getYKienNvp() != null && this.getYKienNvp().equals(castOther.getYKienNvp())))
				&& ((this.getYKienNck() == castOther.getYKienNck()) || (this.getYKienNck() != null
						&& castOther.getYKienNck() != null && this.getYKienNck().equals(castOther.getYKienNck())))
				&& ((this.getYKienBoSung() == castOther.getYKienBoSung())
						|| (this.getYKienBoSung() != null && castOther.getYKienBoSung() != null
								&& this.getYKienBoSung().equals(castOther.getYKienBoSung())))
				&& ((this.getLyDoKhongKyBb() == castOther.getLyDoKhongKyBb())
						|| (this.getLyDoKhongKyBb() != null && castOther.getLyDoKhongKyBb() != null
								&& this.getLyDoKhongKyBb().equals(castOther.getLyDoKhongKyBb())))
				&& ((this.getDiaDiemTg() == castOther.getDiaDiemTg()) || (this.getDiaDiemTg() != null
						&& castOther.getDiaDiemTg() != null && this.getDiaDiemTg().equals(castOther.getDiaDiemTg())))
				&& ((this.getNgayBatDauXl() == castOther.getNgayBatDauXl())
						|| (this.getNgayBatDauXl() != null && castOther.getNgayBatDauXl() != null
								&& this.getNgayBatDauXl().equals(castOther.getNgayBatDauXl())))
				&& ((this.getCanBoTraLai() == castOther.getCanBoTraLai())
						|| (this.getCanBoTraLai() != null && castOther.getCanBoTraLai() != null
								&& this.getCanBoTraLai().equals(castOther.getCanBoTraLai())))
				&& ((this.getNgayTraLai() == castOther.getNgayTraLai()) || (this.getNgayTraLai() != null
						&& castOther.getNgayTraLai() != null && this.getNgayTraLai().equals(castOther.getNgayTraLai())))
				&& ((this.getNamTaoBb() == castOther.getNamTaoBb()) || (this.getNamTaoBb() != null
						&& castOther.getNamTaoBb() != null && this.getNamTaoBb().equals(castOther.getNamTaoBb())))
				&& ((this.getNhapBb() == castOther.getNhapBb()) || (this.getNhapBb() != null
						&& castOther.getNhapBb() != null && this.getNhapBb().equals(castOther.getNhapBb())))
				&& ((this.getTrangThaiBb() == castOther.getTrangThaiBb())
						|| (this.getTrangThaiBb() != null && castOther.getTrangThaiBb() != null
								&& this.getTrangThaiBb().equals(castOther.getTrangThaiBb())))
				&& ((this.getSoBb43Tc() == castOther.getSoBb43Tc()) || (this.getSoBb43Tc() != null
						&& castOther.getSoBb43Tc() != null && this.getSoBb43Tc().equals(castOther.getSoBb43Tc())))
				&& ((this.getGioLapBb() == castOther.getGioLapBb()) || (this.getGioLapBb() != null
						&& castOther.getGioLapBb() != null && this.getGioLapBb().equals(castOther.getGioLapBb())))
				&& ((this.getPhutLapBb() == castOther.getPhutLapBb()) || (this.getPhutLapBb() != null
						&& castOther.getPhutLapBb() != null && this.getPhutLapBb().equals(castOther.getPhutLapBb())))
				&& ((this.getCanBo18() == castOther.getCanBo18()) || (this.getCanBo18() != null
						&& castOther.getCanBo18() != null && this.getCanBo18().equals(castOther.getCanBo18())))
				&& ((this.getMaVuViec() == castOther.getMaVuViec()) || (this.getMaVuViec() != null
						&& castOther.getMaVuViec() != null && this.getMaVuViec().equals(castOther.getMaVuViec())))
				&& ((this.getMaThongTu() == castOther.getMaThongTu()) || (this.getMaThongTu() != null
						&& castOther.getMaThongTu() != null && this.getMaThongTu().equals(castOther.getMaThongTu())))
				&& ((this.getDacDiemTangVat1() == castOther.getDacDiemTangVat1())
						|| (this.getDacDiemTangVat1() != null && castOther.getDacDiemTangVat1() != null
								&& this.getDacDiemTangVat1().equals(castOther.getDacDiemTangVat1())))
				&& ((this.getDacDiemTangVat2() == castOther.getDacDiemTangVat2())
						|| (this.getDacDiemTangVat2() != null && castOther.getDacDiemTangVat2() != null
								&& this.getDacDiemTangVat2().equals(castOther.getDacDiemTangVat2())))
				&& ((this.getGhiChu1() == castOther.getGhiChu1()) || (this.getGhiChu1() != null
						&& castOther.getGhiChu1() != null && this.getGhiChu1().equals(castOther.getGhiChu1())))
				&& ((this.getGhiChu2() == castOther.getGhiChu2()) || (this.getGhiChu2() != null
						&& castOther.getGhiChu2() != null && this.getGhiChu2().equals(castOther.getGhiChu2())))
				&& ((this.getNgaySinhNvpNhap() == castOther.getNgaySinhNvpNhap())
						|| (this.getNgaySinhNvpNhap() != null && castOther.getNgaySinhNvpNhap() != null
								&& this.getNgaySinhNvpNhap().equals(castOther.getNgaySinhNvpNhap())))
				&& ((this.getLinhVucGiaoThong() == castOther.getLinhVucGiaoThong())
						|| (this.getLinhVucGiaoThong() != null && castOther.getLinhVucGiaoThong() != null
								&& this.getLinhVucGiaoThong().equals(castOther.getLinhVucGiaoThong())))
				&& (this.getIdTvtg() == castOther.getIdTvtg()) && (this.getSoBienBan50() == castOther.getSoBienBan50())
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
						&& castOther.getSoTvtg() != null && this.getSoTvtg().equals(castOther.getSoTvtg())))
				&& ((this.getDacDiemChung() == castOther.getDacDiemChung())
						|| (this.getDacDiemChung() != null && castOther.getDacDiemChung() != null
								&& this.getDacDiemChung().equals(castOther.getDacDiemChung())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoBienBanTg() == null ? 0 : this.getSoBienBanTg().hashCode());
		result = 37 * result + (getTenCqCapTren() == null ? 0 : this.getTenCqCapTren().hashCode());
		result = 37 * result + (getTenDonVi() == null ? 0 : this.getTenDonVi().hashCode());
		result = 37 * result + (getSoBienBanTc() == null ? 0 : this.getSoBienBanTc().hashCode());
		result = 37 * result + (getDiaDanhHc() == null ? 0 : this.getDiaDanhHc().hashCode());
		result = 37 * result + (getNgayLapBbTg() == null ? 0 : this.getNgayLapBbTg().hashCode());
		result = 37 * result + (getCanCuXlvphc() == null ? 0 : this.getCanCuXlvphc().hashCode());
		result = 37 * result + (getDanhSachCanBo() == null ? 0 : this.getDanhSachCanBo().hashCode());
		result = 37 * result + (getCanCuQuyetDinhTg() == null ? 0 : this.getCanCuQuyetDinhTg().hashCode());
		result = 37 * result + (getCanBoTaoBbTg() == null ? 0 : this.getCanBoTaoBbTg().hashCode());
		result = 37 * result + (int) this.getCanBoTaoBbTgId();
		result = 37 * result + (getTenNguoiNvp() == null ? 0 : this.getTenNguoiNvp().hashCode());
		result = 37 * result + (getNgaySinhNvp() == null ? 0 : this.getNgaySinhNvp().hashCode());
		result = 37 * result + (getQuocTichNvp() == null ? 0 : this.getQuocTichNvp().hashCode());
		result = 37 * result + (getNgheNghiepNvp() == null ? 0 : this.getNgheNghiepNvp().hashCode());
		result = 37 * result + (getSoCmndNvp() == null ? 0 : this.getSoCmndNvp().hashCode());
		result = 37 * result + (getNgayCapCmndNvp() == null ? 0 : this.getNgayCapCmndNvp().hashCode());
		result = 37 * result + (getNoiCapCmndNvp() == null ? 0 : this.getNoiCapCmndNvp().hashCode());
		result = 37 * result + (getSoQuyetDinhTgTc() == null ? 0 : this.getSoQuyetDinhTgTc().hashCode());
		result = 37 * result + (getNgayQuyetDinhTd() == null ? 0 : this.getNgayQuyetDinhTd().hashCode());
		result = 37 * result + (getCanBoKyQdTg() == null ? 0 : this.getCanBoKyQdTg().hashCode());
		result = 37 * result + (getThoiGianLapBbTg() == null ? 0 : this.getThoiGianLapBbTg().hashCode());
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
		result = 37 * result + (getIdNam() == null ? 0 : this.getIdNam().hashCode());
		result = 37 * result + (getTinhThanhPhoId() == null ? 0 : this.getTinhThanhPhoId().hashCode());
		result = 37 * result + (getThoiGianTg() == null ? 0 : this.getThoiGianTg().hashCode());
		result = 37 * result + (getDanhSachNguoiCk() == null ? 0 : this.getDanhSachNguoiCk().hashCode());
		result = 37 * result + (getYKienNvp() == null ? 0 : this.getYKienNvp().hashCode());
		result = 37 * result + (getYKienNck() == null ? 0 : this.getYKienNck().hashCode());
		result = 37 * result + (getYKienBoSung() == null ? 0 : this.getYKienBoSung().hashCode());
		result = 37 * result + (getLyDoKhongKyBb() == null ? 0 : this.getLyDoKhongKyBb().hashCode());
		result = 37 * result + (getDiaDiemTg() == null ? 0 : this.getDiaDiemTg().hashCode());
		result = 37 * result + (getNgayBatDauXl() == null ? 0 : this.getNgayBatDauXl().hashCode());
		result = 37 * result + (getCanBoTraLai() == null ? 0 : this.getCanBoTraLai().hashCode());
		result = 37 * result + (getNgayTraLai() == null ? 0 : this.getNgayTraLai().hashCode());
		result = 37 * result + (getNamTaoBb() == null ? 0 : this.getNamTaoBb().hashCode());
		result = 37 * result + (getNhapBb() == null ? 0 : this.getNhapBb().hashCode());
		result = 37 * result + (getTrangThaiBb() == null ? 0 : this.getTrangThaiBb().hashCode());
		result = 37 * result + (getSoBb43Tc() == null ? 0 : this.getSoBb43Tc().hashCode());
		result = 37 * result + (getGioLapBb() == null ? 0 : this.getGioLapBb().hashCode());
		result = 37 * result + (getPhutLapBb() == null ? 0 : this.getPhutLapBb().hashCode());
		result = 37 * result + (getCanBo18() == null ? 0 : this.getCanBo18().hashCode());
		result = 37 * result + (getMaVuViec() == null ? 0 : this.getMaVuViec().hashCode());
		result = 37 * result + (getMaThongTu() == null ? 0 : this.getMaThongTu().hashCode());
		result = 37 * result + (getDacDiemTangVat1() == null ? 0 : this.getDacDiemTangVat1().hashCode());
		result = 37 * result + (getDacDiemTangVat2() == null ? 0 : this.getDacDiemTangVat2().hashCode());
		result = 37 * result + (getGhiChu1() == null ? 0 : this.getGhiChu1().hashCode());
		result = 37 * result + (getGhiChu2() == null ? 0 : this.getGhiChu2().hashCode());
		result = 37 * result + (getNgaySinhNvpNhap() == null ? 0 : this.getNgaySinhNvpNhap().hashCode());
		result = 37 * result + (getLinhVucGiaoThong() == null ? 0 : this.getLinhVucGiaoThong().hashCode());
		result = 37 * result + (int) this.getIdTvtg();
		result = 37 * result + (int) this.getSoBienBan50();
		result = 37 * result + (int) this.getIndexTvtg();
		result = 37 * result + (getLoaiTvtg() == null ? 0 : this.getLoaiTvtg().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonViTinh() == null ? 0 : this.getDonViTinh().hashCode());
		result = 37 * result + (getGhiChuTvtg() == null ? 0 : this.getGhiChuTvtg().hashCode());
		result = 37 * result + (getTinhTrang() == null ? 0 : this.getTinhTrang().hashCode());
		result = 37 * result + (getSoTvtg() == null ? 0 : this.getSoTvtg().hashCode());
		result = 37 * result + (getDacDiemChung() == null ? 0 : this.getDacDiemChung().hashCode());
		return result;
	}

}
