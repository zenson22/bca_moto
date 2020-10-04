package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BaoCaoThMotoId
 */
@Embeddable
public class BaoCaoThMotoId implements java.io.Serializable {

	private long id;
	private String biensoDaydu;
	private String biensoCu;
	private String tenCanBoDangKy;
	private String login;
	private Long donViCsgtId;
	private String tenDonViCsgt;
	private Long diemDangKiId;
	private String tenDdk;
	private Long quocgiaId;
	private String tenQuocgia;
	private String ten;
	private String soDienThoai;
	private Long diadanhHanhchinhId;
	private String tenDdhcxa;
	private Long idHuyen;
	private String tenHuyen;
	private Long idTinh;
	private String tenTinh;
	private String diaChi;
	private String mauBien;
	private String tenMauBien;
	private Date ngayDangky;
	private String strNgayDangky;
	private Date thongkeNgay;
	private Long maLoaiXeId;
	private String tenLoaiXe;
	private Long nhanhieuLoaixeId;
	private String tenNhanHieu;
	private String soLoai;
	private String soKhung;
	private String soMay;
	private Long phanloaiQuanlyId;
	private String tenPhanLoaiQuanly;
	private String loaiGiayto;
	private String tenLoaiGiayTo;
	private String idSo;
	private Date idNgayCap;
	private String idNoiCap;
	private String tenNoiCapCmnd;
	private String maSoThue;
	private String taiKhoan;
	private String nganHang;
	private Long mauXe;
	private String tenMauXe;
	private String loaiNhienLieu;
	private String tenLoaiNhienLieu;
	private String congSuat;
	private String dungTich;
	private Long nuocSx;
	private String tenQuocGiaSx;
	private Long namSx;
	private Date nienHanSuDung;
	private Date hieulucDenngay;
	private String nguonGoc;
	private String tenNguonGoc;
	private String soChungTu;
	private Date ngaycapChungtu;
	private String coquanCapchungtu;
	private String trangThai;
	private String tenTrangThaiXe;
	private String soChungnhandk;
	private String trangthaiHoso;
	private String tenTrangthaiHoso;
	private String trangthaiDangky;
	private String tenTrangthaiDangky;
	private String ghiChu;
	private String seriChu;
	private Date ngayDkLandau;
	private String strNgayDkLandau;
	private Date ngayDi;
	private Date ngayDen;
	private String hinhthucCaitao;
	private String tenLoaiCaiTao;
	private String lydoThuhoiDoicap;
	private String tenLoaiDoiCap;
	private Long maGiaoDich;
	private Date ngayCaiTao;
	private Date ngayThuHoi;
	private Date ngayDiChuyen;
	private Long motoId;
	private Long songuoiDuocphepcho;

	public BaoCaoThMotoId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "BIENSO_DAYDU", columnDefinition = "VARCHAR2", length = 60)
	public String getBiensoDaydu() {
		return this.biensoDaydu;
	}

	public void setBiensoDaydu(String biensoDaydu) {
		this.biensoDaydu = biensoDaydu;
	}

	@Column(name = "BIENSO_CU", columnDefinition = "VARCHAR2", length = 60)
	public String getBiensoCu() {
		return this.biensoCu;
	}

	public void setBiensoCu(String biensoCu) {
		this.biensoCu = biensoCu;
	}

	@Column(name = "TEN_CAN_BO_DANG_KY", columnDefinition = "VARCHAR2", length = 200)
	public String getTenCanBoDangKy() {
		return this.tenCanBoDangKy;
	}

	public void setTenCanBoDangKy(String tenCanBoDangKy) {
		this.tenCanBoDangKy = tenCanBoDangKy;
	}

	@Column(name = "LOGIN", columnDefinition = "VARCHAR2", length = 120)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "TEN_DON_VI_CSGT", columnDefinition = "VARCHAR2", length = 200)
	public String getTenDonViCsgt() {
		return this.tenDonViCsgt;
	}

	public void setTenDonViCsgt(String tenDonViCsgt) {
		this.tenDonViCsgt = tenDonViCsgt;
	}

	@Column(name = "DIEM_DANG_KI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiemDangKiId() {
		return this.diemDangKiId;
	}

	public void setDiemDangKiId(Long diemDangKiId) {
		this.diemDangKiId = diemDangKiId;
	}

	@Column(name = "TEN_DDK", columnDefinition = "VARCHAR2", length = 200)
	public String getTenDdk() {
		return this.tenDdk;
	}

	public void setTenDdk(String tenDdk) {
		this.tenDdk = tenDdk;
	}

	@Column(name = "QUOCGIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getQuocgiaId() {
		return this.quocgiaId;
	}

	public void setQuocgiaId(Long quocgiaId) {
		this.quocgiaId = quocgiaId;
	}

	@Column(name = "TEN_QUOCGIA", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenQuocgia() {
		return this.tenQuocgia;
	}

	public void setTenQuocgia(String tenQuocgia) {
		this.tenQuocgia = tenQuocgia;
	}

	@Column(name = "TEN", columnDefinition = "VARCHAR2", length = 1020)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 1020)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Column(name = "DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiadanhHanhchinhId() {
		return this.diadanhHanhchinhId;
	}

	public void setDiadanhHanhchinhId(Long diadanhHanhchinhId) {
		this.diadanhHanhchinhId = diadanhHanhchinhId;
	}

	@Column(name = "TEN_DDHCXA", columnDefinition = "VARCHAR2", length = 200)
	public String getTenDdhcxa() {
		return this.tenDdhcxa;
	}

	public void setTenDdhcxa(String tenDdhcxa) {
		this.tenDdhcxa = tenDdhcxa;
	}

	@Column(name = "ID_HUYEN", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getIdHuyen() {
		return this.idHuyen;
	}

	public void setIdHuyen(Long idHuyen) {
		this.idHuyen = idHuyen;
	}

	@Column(name = "TEN_HUYEN", columnDefinition = "VARCHAR2", length = 200)
	public String getTenHuyen() {
		return this.tenHuyen;
	}

	public void setTenHuyen(String tenHuyen) {
		this.tenHuyen = tenHuyen;
	}

	@Column(name = "ID_TINH", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getIdTinh() {
		return this.idTinh;
	}

	public void setIdTinh(Long idTinh) {
		this.idTinh = idTinh;
	}

	@Column(name = "TEN_TINH", columnDefinition = "VARCHAR2", length = 200)
	public String getTenTinh() {
		return this.tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 2048)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 30)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "TEN_MAU_BIEN", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenMauBien() {
		return this.tenMauBien;
	}

	public void setTenMauBien(String tenMauBien) {
		this.tenMauBien = tenMauBien;
	}

	@Column(name = "NGAY_DANGKY", columnDefinition = "DATE", length = 7)
	public Date getNgayDangky() {
		return this.ngayDangky;
	}

	public void setNgayDangky(Date ngayDangky) {
		this.ngayDangky = ngayDangky;
	}

	@Column(name = "STR_NGAY_DANGKY", columnDefinition = "VARCHAR2", length = 8)
	public String getStrNgayDangky() {
		return this.strNgayDangky;
	}

	public void setStrNgayDangky(String strNgayDangky) {
		this.strNgayDangky = strNgayDangky;
	}

	@Column(name = "THONGKE_NGAY", columnDefinition = "DATE", length = 7)
	public Date getThongkeNgay() {
		return this.thongkeNgay;
	}

	public void setThongkeNgay(Date thongkeNgay) {
		this.thongkeNgay = thongkeNgay;
	}

	@Column(name = "MA_LOAI_XE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMaLoaiXeId() {
		return this.maLoaiXeId;
	}

	public void setMaLoaiXeId(Long maLoaiXeId) {
		this.maLoaiXeId = maLoaiXeId;
	}

	@Column(name = "TEN_LOAI_XE", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenLoaiXe() {
		return this.tenLoaiXe;
	}

	public void setTenLoaiXe(String tenLoaiXe) {
		this.tenLoaiXe = tenLoaiXe;
	}

	@Column(name = "NHANHIEU_LOAIXE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNhanhieuLoaixeId() {
		return this.nhanhieuLoaixeId;
	}

	public void setNhanhieuLoaixeId(Long nhanhieuLoaixeId) {
		this.nhanhieuLoaixeId = nhanhieuLoaixeId;
	}

	@Column(name = "TEN_NHAN_HIEU", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenNhanHieu() {
		return this.tenNhanHieu;
	}

	public void setTenNhanHieu(String tenNhanHieu) {
		this.tenNhanHieu = tenNhanHieu;
	}

	@Column(name = "SO_LOAI", columnDefinition = "VARCHAR2")
	public String getSoLoai() {
		return this.soLoai;
	}

	public void setSoLoai(String soLoai) {
		this.soLoai = soLoai;
	}

	@Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2", length = 120)
	public String getSoKhung() {
		return this.soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	@Column(name = "SO_MAY", columnDefinition = "VARCHAR2", length = 120)
	public String getSoMay() {
		return this.soMay;
	}

	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

	@Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getPhanloaiQuanlyId() {
		return this.phanloaiQuanlyId;
	}

	public void setPhanloaiQuanlyId(Long phanloaiQuanlyId) {
		this.phanloaiQuanlyId = phanloaiQuanlyId;
	}

	@Column(name = "TEN_PHAN_LOAI_QUANLY", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenPhanLoaiQuanly() {
		return this.tenPhanLoaiQuanly;
	}

	public void setTenPhanLoaiQuanly(String tenPhanLoaiQuanly) {
		this.tenPhanLoaiQuanly = tenPhanLoaiQuanly;
	}

	@Column(name = "LOAI_GIAYTO", columnDefinition = "VARCHAR2", length = 120)
	public String getLoaiGiayto() {
		return this.loaiGiayto;
	}

	public void setLoaiGiayto(String loaiGiayto) {
		this.loaiGiayto = loaiGiayto;
	}

	@Column(name = "TEN_LOAI_GIAY_TO", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenLoaiGiayTo() {
		return this.tenLoaiGiayTo;
	}

	public void setTenLoaiGiayTo(String tenLoaiGiayTo) {
		this.tenLoaiGiayTo = tenLoaiGiayTo;
	}

	@Column(name = "ID_SO", columnDefinition = "VARCHAR2", length = 1020)
	public String getIdSo() {
		return this.idSo;
	}

	public void setIdSo(String idSo) {
		this.idSo = idSo;
	}

	@Column(name = "ID_NGAY_CAP", columnDefinition = "DATE", length = 7)
	public Date getIdNgayCap() {
		return this.idNgayCap;
	}

	public void setIdNgayCap(Date idNgayCap) {
		this.idNgayCap = idNgayCap;
	}

	@Column(name = "ID_NOI_CAP", columnDefinition = "VARCHAR2", length = 1020)
	public String getIdNoiCap() {
		return this.idNoiCap;
	}

	public void setIdNoiCap(String idNoiCap) {
		this.idNoiCap = idNoiCap;
	}

	@Column(name = "TEN_NOI_CAP_CMND", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenNoiCapCmnd() {
		return this.tenNoiCapCmnd;
	}

	public void setTenNoiCapCmnd(String tenNoiCapCmnd) {
		this.tenNoiCapCmnd = tenNoiCapCmnd;
	}

	@Column(name = "MA_SO_THUE", columnDefinition = "VARCHAR2", length = 20)
	public String getMaSoThue() {
		return this.maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	@Column(name = "TAI_KHOAN", columnDefinition = "VARCHAR2", length = 30)
	public String getTaiKhoan() {
		return this.taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@Column(name = "NGAN_HANG", columnDefinition = "VARCHAR2", length = 50)
	public String getNganHang() {
		return this.nganHang;
	}

	public void setNganHang(String nganHang) {
		this.nganHang = nganHang;
	}

	@Column(name = "MAU_XE", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMauXe() {
		return this.mauXe;
	}

	public void setMauXe(Long mauXe) {
		this.mauXe = mauXe;
	}

	@Column(name = "TEN_MAU_XE", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenMauXe() {
		return this.tenMauXe;
	}

	public void setTenMauXe(String tenMauXe) {
		this.tenMauXe = tenMauXe;
	}

	@Column(name = "LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2", length = 120)
	public String getLoaiNhienLieu() {
		return this.loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Column(name = "TEN_LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenLoaiNhienLieu() {
		return this.tenLoaiNhienLieu;
	}

	public void setTenLoaiNhienLieu(String tenLoaiNhienLieu) {
		this.tenLoaiNhienLieu = tenLoaiNhienLieu;
	}

	@Column(name = "CONG_SUAT", columnDefinition = "VARCHAR2", length = 120)
	public String getCongSuat() {
		return this.congSuat;
	}

	public void setCongSuat(String congSuat) {
		this.congSuat = congSuat;
	}

	@Column(name = "DUNG_TICH", columnDefinition = "VARCHAR2", length = 120)
	public String getDungTich() {
		return this.dungTich;
	}

	public void setDungTich(String dungTich) {
		this.dungTich = dungTich;
	}

	@Column(name = "NUOC_SX", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNuocSx() {
		return this.nuocSx;
	}

	public void setNuocSx(Long nuocSx) {
		this.nuocSx = nuocSx;
	}

	@Column(name = "TEN_QUOC_GIA_SX", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenQuocGiaSx() {
		return this.tenQuocGiaSx;
	}

	public void setTenQuocGiaSx(String tenQuocGiaSx) {
		this.tenQuocGiaSx = tenQuocGiaSx;
	}

	@Column(name = "NAM_SX", columnDefinition = "NUMBER", precision = 4, scale = 0)
	public Long getNamSx() {
		return this.namSx;
	}

	public void setNamSx(Long namSx) {
		this.namSx = namSx;
	}

	@Column(name = "NIEN_HAN_SU_DUNG", columnDefinition = "DATE", length = 7)
	public Date getNienHanSuDung() {
		return this.nienHanSuDung;
	}

	public void setNienHanSuDung(Date nienHanSuDung) {
		this.nienHanSuDung = nienHanSuDung;
	}

	@Column(name = "HIEULUC_DENNGAY", columnDefinition = "DATE", length = 7)
	public Date getHieulucDenngay() {
		return this.hieulucDenngay;
	}

	public void setHieulucDenngay(Date hieulucDenngay) {
		this.hieulucDenngay = hieulucDenngay;
	}

	@Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 120)
	public String getNguonGoc() {
		return this.nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	@Column(name = "TEN_NGUON_GOC", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenNguonGoc() {
		return this.tenNguonGoc;
	}

	public void setTenNguonGoc(String tenNguonGoc) {
		this.tenNguonGoc = tenNguonGoc;
	}

	@Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 80)
	public String getSoChungTu() {
		return this.soChungTu;
	}

	public void setSoChungTu(String soChungTu) {
		this.soChungTu = soChungTu;
	}

	@Column(name = "NGAYCAP_CHUNGTU", columnDefinition = "DATE", length = 7)
	public Date getNgaycapChungtu() {
		return this.ngaycapChungtu;
	}

	public void setNgaycapChungtu(Date ngaycapChungtu) {
		this.ngaycapChungtu = ngaycapChungtu;
	}

	@Column(name = "COQUAN_CAPCHUNGTU", columnDefinition = "VARCHAR2", length = 200)
	public String getCoquanCapchungtu() {
		return this.coquanCapchungtu;
	}

	public void setCoquanCapchungtu(String coquanCapchungtu) {
		this.coquanCapchungtu = coquanCapchungtu;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 120)
	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "TEN_TRANG_THAI_XE", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenTrangThaiXe() {
		return this.tenTrangThaiXe;
	}

	public void setTenTrangThaiXe(String tenTrangThaiXe) {
		this.tenTrangThaiXe = tenTrangThaiXe;
	}

	@Column(name = "SO_CHUNGNHANDK", columnDefinition = "VARCHAR2", length = 40)
	public String getSoChungnhandk() {
		return this.soChungnhandk;
	}

	public void setSoChungnhandk(String soChungnhandk) {
		this.soChungnhandk = soChungnhandk;
	}

	@Column(name = "TRANGTHAI_HOSO", columnDefinition = "VARCHAR2", length = 120)
	public String getTrangthaiHoso() {
		return this.trangthaiHoso;
	}

	public void setTrangthaiHoso(String trangthaiHoso) {
		this.trangthaiHoso = trangthaiHoso;
	}

	@Column(name = "TEN_TRANGTHAI_HOSO", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenTrangthaiHoso() {
		return this.tenTrangthaiHoso;
	}

	public void setTenTrangthaiHoso(String tenTrangthaiHoso) {
		this.tenTrangthaiHoso = tenTrangthaiHoso;
	}

	@Column(name = "TRANGTHAI_DANGKY", columnDefinition = "VARCHAR2", length = 120)
	public String getTrangthaiDangky() {
		return this.trangthaiDangky;
	}

	public void setTrangthaiDangky(String trangthaiDangky) {
		this.trangthaiDangky = trangthaiDangky;
	}

	@Column(name = "TEN_TRANGTHAI_DANGKY", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenTrangthaiDangky() {
		return this.tenTrangthaiDangky;
	}

	public void setTenTrangthaiDangky(String tenTrangthaiDangky) {
		this.tenTrangthaiDangky = tenTrangthaiDangky;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "NGAY_DK_LANDAU", columnDefinition = "DATE", length = 7)
	public Date getNgayDkLandau() {
		return this.ngayDkLandau;
	}

	public void setNgayDkLandau(Date ngayDkLandau) {
		this.ngayDkLandau = ngayDkLandau;
	}

	@Column(name = "STR_NGAY_DK_LANDAU", columnDefinition = "VARCHAR2", length = 8)
	public String getStrNgayDkLandau() {
		return this.strNgayDkLandau;
	}

	public void setStrNgayDkLandau(String strNgayDkLandau) {
		this.strNgayDkLandau = strNgayDkLandau;
	}

	@Column(name = "NGAY_DI", columnDefinition = "DATE", length = 7)
	public Date getNgayDi() {
		return this.ngayDi;
	}

	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}

	@Column(name = "NGAY_DEN", columnDefinition = "DATE", length = 7)
	public Date getNgayDen() {
		return this.ngayDen;
	}

	public void setNgayDen(Date ngayDen) {
		this.ngayDen = ngayDen;
	}

	@Column(name = "HINHTHUC_CAITAO", columnDefinition = "VARCHAR2", length = 120)
	public String getHinhthucCaitao() {
		return this.hinhthucCaitao;
	}

	public void setHinhthucCaitao(String hinhthucCaitao) {
		this.hinhthucCaitao = hinhthucCaitao;
	}

	@Column(name = "TEN_LOAI_CAI_TAO", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenLoaiCaiTao() {
		return this.tenLoaiCaiTao;
	}

	public void setTenLoaiCaiTao(String tenLoaiCaiTao) {
		this.tenLoaiCaiTao = tenLoaiCaiTao;
	}

	@Column(name = "LYDO_THUHOI_DOICAP", columnDefinition = "VARCHAR2", length = 120)
	public String getLydoThuhoiDoicap() {
		return this.lydoThuhoiDoicap;
	}

	public void setLydoThuhoiDoicap(String lydoThuhoiDoicap) {
		this.lydoThuhoiDoicap = lydoThuhoiDoicap;
	}

	@Column(name = "TEN_LOAI_DOI_CAP", columnDefinition = "VARCHAR2", length = 4000)
	public String getTenLoaiDoiCap() {
		return this.tenLoaiDoiCap;
	}

	public void setTenLoaiDoiCap(String tenLoaiDoiCap) {
		this.tenLoaiDoiCap = tenLoaiDoiCap;
	}

	@Column(name = "MA_GIAO_DICH", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMaGiaoDich() {
		return this.maGiaoDich;
	}

	public void setMaGiaoDich(Long maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	@Column(name = "NGAY_CAI_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayCaiTao() {
		return this.ngayCaiTao;
	}

	public void setNgayCaiTao(Date ngayCaiTao) {
		this.ngayCaiTao = ngayCaiTao;
	}

	@Column(name = "NGAY_THU_HOI", columnDefinition = "DATE", length = 7)
	public Date getNgayThuHoi() {
		return this.ngayThuHoi;
	}

	public void setNgayThuHoi(Date ngayThuHoi) {
		this.ngayThuHoi = ngayThuHoi;
	}

	@Column(name = "NGAY_DI_CHUYEN", columnDefinition = "DATE", length = 7)
	public Date getNgayDiChuyen() {
		return this.ngayDiChuyen;
	}

	public void setNgayDiChuyen(Date ngayDiChuyen) {
		this.ngayDiChuyen = ngayDiChuyen;
	}

	@Column(name = "MOTO_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoId() {
		return this.motoId;
	}

	public void setMotoId(Long motoId) {
		this.motoId = motoId;
	}

	@Column(name = "SONGUOI_DUOCPHEPCHO", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getSonguoiDuocphepcho() {
		return this.songuoiDuocphepcho;
	}

	public void setSonguoiDuocphepcho(Long songuoiDuocphepcho) {
		this.songuoiDuocphepcho = songuoiDuocphepcho;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BaoCaoThMotoId))
			return false;
		BaoCaoThMotoId castOther = (BaoCaoThMotoId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getBiensoDaydu() == castOther.getBiensoDaydu())
						|| (this.getBiensoDaydu() != null && castOther.getBiensoDaydu() != null
								&& this.getBiensoDaydu().equals(castOther.getBiensoDaydu())))
				&& ((this.getBiensoCu() == castOther.getBiensoCu()) || (this.getBiensoCu() != null
						&& castOther.getBiensoCu() != null && this.getBiensoCu().equals(castOther.getBiensoCu())))
				&& ((this.getTenCanBoDangKy() == castOther.getTenCanBoDangKy())
						|| (this.getTenCanBoDangKy() != null && castOther.getTenCanBoDangKy() != null
								&& this.getTenCanBoDangKy().equals(castOther.getTenCanBoDangKy())))
				&& ((this.getLogin() == castOther.getLogin()) || (this.getLogin() != null
						&& castOther.getLogin() != null && this.getLogin().equals(castOther.getLogin())))
				&& ((this.getDonViCsgtId() == castOther.getDonViCsgtId())
						|| (this.getDonViCsgtId() != null && castOther.getDonViCsgtId() != null
								&& this.getDonViCsgtId().equals(castOther.getDonViCsgtId())))
				&& ((this.getTenDonViCsgt() == castOther.getTenDonViCsgt())
						|| (this.getTenDonViCsgt() != null && castOther.getTenDonViCsgt() != null
								&& this.getTenDonViCsgt().equals(castOther.getTenDonViCsgt())))
				&& ((this.getDiemDangKiId() == castOther.getDiemDangKiId())
						|| (this.getDiemDangKiId() != null && castOther.getDiemDangKiId() != null
								&& this.getDiemDangKiId().equals(castOther.getDiemDangKiId())))
				&& ((this.getTenDdk() == castOther.getTenDdk()) || (this.getTenDdk() != null
						&& castOther.getTenDdk() != null && this.getTenDdk().equals(castOther.getTenDdk())))
				&& ((this.getQuocgiaId() == castOther.getQuocgiaId()) || (this.getQuocgiaId() != null
						&& castOther.getQuocgiaId() != null && this.getQuocgiaId().equals(castOther.getQuocgiaId())))
				&& ((this.getTenQuocgia() == castOther.getTenQuocgia()) || (this.getTenQuocgia() != null
						&& castOther.getTenQuocgia() != null && this.getTenQuocgia().equals(castOther.getTenQuocgia())))
				&& ((this.getTen() == castOther.getTen()) || (this.getTen() != null && castOther.getTen() != null
						&& this.getTen().equals(castOther.getTen())))
				&& ((this.getSoDienThoai() == castOther.getSoDienThoai())
						|| (this.getSoDienThoai() != null && castOther.getSoDienThoai() != null
								&& this.getSoDienThoai().equals(castOther.getSoDienThoai())))
				&& ((this.getDiadanhHanhchinhId() == castOther.getDiadanhHanhchinhId())
						|| (this.getDiadanhHanhchinhId() != null && castOther.getDiadanhHanhchinhId() != null
								&& this.getDiadanhHanhchinhId().equals(castOther.getDiadanhHanhchinhId())))
				&& ((this.getTenDdhcxa() == castOther.getTenDdhcxa()) || (this.getTenDdhcxa() != null
						&& castOther.getTenDdhcxa() != null && this.getTenDdhcxa().equals(castOther.getTenDdhcxa())))
				&& ((this.getIdHuyen() == castOther.getIdHuyen()) || (this.getIdHuyen() != null
						&& castOther.getIdHuyen() != null && this.getIdHuyen().equals(castOther.getIdHuyen())))
				&& ((this.getTenHuyen() == castOther.getTenHuyen()) || (this.getTenHuyen() != null
						&& castOther.getTenHuyen() != null && this.getTenHuyen().equals(castOther.getTenHuyen())))
				&& ((this.getIdTinh() == castOther.getIdTinh()) || (this.getIdTinh() != null
						&& castOther.getIdTinh() != null && this.getIdTinh().equals(castOther.getIdTinh())))
				&& ((this.getTenTinh() == castOther.getTenTinh()) || (this.getTenTinh() != null
						&& castOther.getTenTinh() != null && this.getTenTinh().equals(castOther.getTenTinh())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& ((this.getTenMauBien() == castOther.getTenMauBien()) || (this.getTenMauBien() != null
						&& castOther.getTenMauBien() != null && this.getTenMauBien().equals(castOther.getTenMauBien())))
				&& ((this.getNgayDangky() == castOther.getNgayDangky()) || (this.getNgayDangky() != null
						&& castOther.getNgayDangky() != null && this.getNgayDangky().equals(castOther.getNgayDangky())))
				&& ((this.getStrNgayDangky() == castOther.getStrNgayDangky())
						|| (this.getStrNgayDangky() != null && castOther.getStrNgayDangky() != null
								&& this.getStrNgayDangky().equals(castOther.getStrNgayDangky())))
				&& ((this.getThongkeNgay() == castOther.getThongkeNgay())
						|| (this.getThongkeNgay() != null && castOther.getThongkeNgay() != null
								&& this.getThongkeNgay().equals(castOther.getThongkeNgay())))
				&& ((this.getMaLoaiXeId() == castOther.getMaLoaiXeId()) || (this.getMaLoaiXeId() != null
						&& castOther.getMaLoaiXeId() != null && this.getMaLoaiXeId().equals(castOther.getMaLoaiXeId())))
				&& ((this.getTenLoaiXe() == castOther.getTenLoaiXe()) || (this.getTenLoaiXe() != null
						&& castOther.getTenLoaiXe() != null && this.getTenLoaiXe().equals(castOther.getTenLoaiXe())))
				&& ((this.getNhanhieuLoaixeId() == castOther.getNhanhieuLoaixeId())
						|| (this.getNhanhieuLoaixeId() != null && castOther.getNhanhieuLoaixeId() != null
								&& this.getNhanhieuLoaixeId().equals(castOther.getNhanhieuLoaixeId())))
				&& ((this.getTenNhanHieu() == castOther.getTenNhanHieu())
						|| (this.getTenNhanHieu() != null && castOther.getTenNhanHieu() != null
								&& this.getTenNhanHieu().equals(castOther.getTenNhanHieu())))
				&& ((this.getSoLoai() == castOther.getSoLoai()) || (this.getSoLoai() != null
						&& castOther.getSoLoai() != null && this.getSoLoai().equals(castOther.getSoLoai())))
				&& ((this.getSoKhung() == castOther.getSoKhung()) || (this.getSoKhung() != null
						&& castOther.getSoKhung() != null && this.getSoKhung().equals(castOther.getSoKhung())))
				&& ((this.getSoMay() == castOther.getSoMay()) || (this.getSoMay() != null
						&& castOther.getSoMay() != null && this.getSoMay().equals(castOther.getSoMay())))
				&& ((this.getPhanloaiQuanlyId() == castOther.getPhanloaiQuanlyId())
						|| (this.getPhanloaiQuanlyId() != null && castOther.getPhanloaiQuanlyId() != null
								&& this.getPhanloaiQuanlyId().equals(castOther.getPhanloaiQuanlyId())))
				&& ((this.getTenPhanLoaiQuanly() == castOther.getTenPhanLoaiQuanly())
						|| (this.getTenPhanLoaiQuanly() != null && castOther.getTenPhanLoaiQuanly() != null
								&& this.getTenPhanLoaiQuanly().equals(castOther.getTenPhanLoaiQuanly())))
				&& ((this.getLoaiGiayto() == castOther.getLoaiGiayto()) || (this.getLoaiGiayto() != null
						&& castOther.getLoaiGiayto() != null && this.getLoaiGiayto().equals(castOther.getLoaiGiayto())))
				&& ((this.getTenLoaiGiayTo() == castOther.getTenLoaiGiayTo())
						|| (this.getTenLoaiGiayTo() != null && castOther.getTenLoaiGiayTo() != null
								&& this.getTenLoaiGiayTo().equals(castOther.getTenLoaiGiayTo())))
				&& ((this.getIdSo() == castOther.getIdSo()) || (this.getIdSo() != null && castOther.getIdSo() != null
						&& this.getIdSo().equals(castOther.getIdSo())))
				&& ((this.getIdNgayCap() == castOther.getIdNgayCap()) || (this.getIdNgayCap() != null
						&& castOther.getIdNgayCap() != null && this.getIdNgayCap().equals(castOther.getIdNgayCap())))
				&& ((this.getIdNoiCap() == castOther.getIdNoiCap()) || (this.getIdNoiCap() != null
						&& castOther.getIdNoiCap() != null && this.getIdNoiCap().equals(castOther.getIdNoiCap())))
				&& ((this.getTenNoiCapCmnd() == castOther.getTenNoiCapCmnd())
						|| (this.getTenNoiCapCmnd() != null && castOther.getTenNoiCapCmnd() != null
								&& this.getTenNoiCapCmnd().equals(castOther.getTenNoiCapCmnd())))
				&& ((this.getMaSoThue() == castOther.getMaSoThue()) || (this.getMaSoThue() != null
						&& castOther.getMaSoThue() != null && this.getMaSoThue().equals(castOther.getMaSoThue())))
				&& ((this.getTaiKhoan() == castOther.getTaiKhoan()) || (this.getTaiKhoan() != null
						&& castOther.getTaiKhoan() != null && this.getTaiKhoan().equals(castOther.getTaiKhoan())))
				&& ((this.getNganHang() == castOther.getNganHang()) || (this.getNganHang() != null
						&& castOther.getNganHang() != null && this.getNganHang().equals(castOther.getNganHang())))
				&& ((this.getMauXe() == castOther.getMauXe()) || (this.getMauXe() != null
						&& castOther.getMauXe() != null && this.getMauXe().equals(castOther.getMauXe())))
				&& ((this.getTenMauXe() == castOther.getTenMauXe()) || (this.getTenMauXe() != null
						&& castOther.getTenMauXe() != null && this.getTenMauXe().equals(castOther.getTenMauXe())))
				&& ((this.getLoaiNhienLieu() == castOther.getLoaiNhienLieu())
						|| (this.getLoaiNhienLieu() != null && castOther.getLoaiNhienLieu() != null
								&& this.getLoaiNhienLieu().equals(castOther.getLoaiNhienLieu())))
				&& ((this.getTenLoaiNhienLieu() == castOther.getTenLoaiNhienLieu())
						|| (this.getTenLoaiNhienLieu() != null && castOther.getTenLoaiNhienLieu() != null
								&& this.getTenLoaiNhienLieu().equals(castOther.getTenLoaiNhienLieu())))
				&& ((this.getCongSuat() == castOther.getCongSuat()) || (this.getCongSuat() != null
						&& castOther.getCongSuat() != null && this.getCongSuat().equals(castOther.getCongSuat())))
				&& ((this.getDungTich() == castOther.getDungTich()) || (this.getDungTich() != null
						&& castOther.getDungTich() != null && this.getDungTich().equals(castOther.getDungTich())))
				&& ((this.getNuocSx() == castOther.getNuocSx()) || (this.getNuocSx() != null
						&& castOther.getNuocSx() != null && this.getNuocSx().equals(castOther.getNuocSx())))
				&& ((this.getTenQuocGiaSx() == castOther.getTenQuocGiaSx())
						|| (this.getTenQuocGiaSx() != null && castOther.getTenQuocGiaSx() != null
								&& this.getTenQuocGiaSx().equals(castOther.getTenQuocGiaSx())))
				&& ((this.getNamSx() == castOther.getNamSx()) || (this.getNamSx() != null
						&& castOther.getNamSx() != null && this.getNamSx().equals(castOther.getNamSx())))
				&& ((this.getNienHanSuDung() == castOther.getNienHanSuDung())
						|| (this.getNienHanSuDung() != null && castOther.getNienHanSuDung() != null
								&& this.getNienHanSuDung().equals(castOther.getNienHanSuDung())))
				&& ((this.getHieulucDenngay() == castOther.getHieulucDenngay())
						|| (this.getHieulucDenngay() != null && castOther.getHieulucDenngay() != null
								&& this.getHieulucDenngay().equals(castOther.getHieulucDenngay())))
				&& ((this.getNguonGoc() == castOther.getNguonGoc()) || (this.getNguonGoc() != null
						&& castOther.getNguonGoc() != null && this.getNguonGoc().equals(castOther.getNguonGoc())))
				&& ((this.getTenNguonGoc() == castOther.getTenNguonGoc())
						|| (this.getTenNguonGoc() != null && castOther.getTenNguonGoc() != null
								&& this.getTenNguonGoc().equals(castOther.getTenNguonGoc())))
				&& ((this.getSoChungTu() == castOther.getSoChungTu()) || (this.getSoChungTu() != null
						&& castOther.getSoChungTu() != null && this.getSoChungTu().equals(castOther.getSoChungTu())))
				&& ((this.getNgaycapChungtu() == castOther.getNgaycapChungtu())
						|| (this.getNgaycapChungtu() != null && castOther.getNgaycapChungtu() != null
								&& this.getNgaycapChungtu().equals(castOther.getNgaycapChungtu())))
				&& ((this.getCoquanCapchungtu() == castOther.getCoquanCapchungtu())
						|| (this.getCoquanCapchungtu() != null && castOther.getCoquanCapchungtu() != null
								&& this.getCoquanCapchungtu().equals(castOther.getCoquanCapchungtu())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getTenTrangThaiXe() == castOther.getTenTrangThaiXe())
						|| (this.getTenTrangThaiXe() != null && castOther.getTenTrangThaiXe() != null
								&& this.getTenTrangThaiXe().equals(castOther.getTenTrangThaiXe())))
				&& ((this.getSoChungnhandk() == castOther.getSoChungnhandk())
						|| (this.getSoChungnhandk() != null && castOther.getSoChungnhandk() != null
								&& this.getSoChungnhandk().equals(castOther.getSoChungnhandk())))
				&& ((this.getTrangthaiHoso() == castOther.getTrangthaiHoso())
						|| (this.getTrangthaiHoso() != null && castOther.getTrangthaiHoso() != null
								&& this.getTrangthaiHoso().equals(castOther.getTrangthaiHoso())))
				&& ((this.getTenTrangthaiHoso() == castOther.getTenTrangthaiHoso())
						|| (this.getTenTrangthaiHoso() != null && castOther.getTenTrangthaiHoso() != null
								&& this.getTenTrangthaiHoso().equals(castOther.getTenTrangthaiHoso())))
				&& ((this.getTrangthaiDangky() == castOther.getTrangthaiDangky())
						|| (this.getTrangthaiDangky() != null && castOther.getTrangthaiDangky() != null
								&& this.getTrangthaiDangky().equals(castOther.getTrangthaiDangky())))
				&& ((this.getTenTrangthaiDangky() == castOther.getTenTrangthaiDangky())
						|| (this.getTenTrangthaiDangky() != null && castOther.getTenTrangthaiDangky() != null
								&& this.getTenTrangthaiDangky().equals(castOther.getTenTrangthaiDangky())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
						&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& ((this.getNgayDkLandau() == castOther.getNgayDkLandau())
						|| (this.getNgayDkLandau() != null && castOther.getNgayDkLandau() != null
								&& this.getNgayDkLandau().equals(castOther.getNgayDkLandau())))
				&& ((this.getStrNgayDkLandau() == castOther.getStrNgayDkLandau())
						|| (this.getStrNgayDkLandau() != null && castOther.getStrNgayDkLandau() != null
								&& this.getStrNgayDkLandau().equals(castOther.getStrNgayDkLandau())))
				&& ((this.getNgayDi() == castOther.getNgayDi()) || (this.getNgayDi() != null
						&& castOther.getNgayDi() != null && this.getNgayDi().equals(castOther.getNgayDi())))
				&& ((this.getNgayDen() == castOther.getNgayDen()) || (this.getNgayDen() != null
						&& castOther.getNgayDen() != null && this.getNgayDen().equals(castOther.getNgayDen())))
				&& ((this.getHinhthucCaitao() == castOther.getHinhthucCaitao())
						|| (this.getHinhthucCaitao() != null && castOther.getHinhthucCaitao() != null
								&& this.getHinhthucCaitao().equals(castOther.getHinhthucCaitao())))
				&& ((this.getTenLoaiCaiTao() == castOther.getTenLoaiCaiTao())
						|| (this.getTenLoaiCaiTao() != null && castOther.getTenLoaiCaiTao() != null
								&& this.getTenLoaiCaiTao().equals(castOther.getTenLoaiCaiTao())))
				&& ((this.getLydoThuhoiDoicap() == castOther.getLydoThuhoiDoicap())
						|| (this.getLydoThuhoiDoicap() != null && castOther.getLydoThuhoiDoicap() != null
								&& this.getLydoThuhoiDoicap().equals(castOther.getLydoThuhoiDoicap())))
				&& ((this.getTenLoaiDoiCap() == castOther.getTenLoaiDoiCap())
						|| (this.getTenLoaiDoiCap() != null && castOther.getTenLoaiDoiCap() != null
								&& this.getTenLoaiDoiCap().equals(castOther.getTenLoaiDoiCap())))
				&& ((this.getMaGiaoDich() == castOther.getMaGiaoDich()) || (this.getMaGiaoDich() != null
						&& castOther.getMaGiaoDich() != null && this.getMaGiaoDich().equals(castOther.getMaGiaoDich())))
				&& ((this.getNgayCaiTao() == castOther.getNgayCaiTao()) || (this.getNgayCaiTao() != null
						&& castOther.getNgayCaiTao() != null && this.getNgayCaiTao().equals(castOther.getNgayCaiTao())))
				&& ((this.getNgayThuHoi() == castOther.getNgayThuHoi()) || (this.getNgayThuHoi() != null
						&& castOther.getNgayThuHoi() != null && this.getNgayThuHoi().equals(castOther.getNgayThuHoi())))
				&& ((this.getNgayDiChuyen() == castOther.getNgayDiChuyen())
						|| (this.getNgayDiChuyen() != null && castOther.getNgayDiChuyen() != null
								&& this.getNgayDiChuyen().equals(castOther.getNgayDiChuyen())))
				&& ((this.getMotoId() == castOther.getMotoId()) || (this.getMotoId() != null
						&& castOther.getMotoId() != null && this.getMotoId().equals(castOther.getMotoId())))
				&& ((this.getSonguoiDuocphepcho() == castOther.getSonguoiDuocphepcho())
						|| (this.getSonguoiDuocphepcho() != null && castOther.getSonguoiDuocphepcho() != null
								&& this.getSonguoiDuocphepcho().equals(castOther.getSonguoiDuocphepcho())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getBiensoDaydu() == null ? 0 : this.getBiensoDaydu().hashCode());
		result = 37 * result + (getBiensoCu() == null ? 0 : this.getBiensoCu().hashCode());
		result = 37 * result + (getTenCanBoDangKy() == null ? 0 : this.getTenCanBoDangKy().hashCode());
		result = 37 * result + (getLogin() == null ? 0 : this.getLogin().hashCode());
		result = 37 * result + (getDonViCsgtId() == null ? 0 : this.getDonViCsgtId().hashCode());
		result = 37 * result + (getTenDonViCsgt() == null ? 0 : this.getTenDonViCsgt().hashCode());
		result = 37 * result + (getDiemDangKiId() == null ? 0 : this.getDiemDangKiId().hashCode());
		result = 37 * result + (getTenDdk() == null ? 0 : this.getTenDdk().hashCode());
		result = 37 * result + (getQuocgiaId() == null ? 0 : this.getQuocgiaId().hashCode());
		result = 37 * result + (getTenQuocgia() == null ? 0 : this.getTenQuocgia().hashCode());
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (getSoDienThoai() == null ? 0 : this.getSoDienThoai().hashCode());
		result = 37 * result + (getDiadanhHanhchinhId() == null ? 0 : this.getDiadanhHanhchinhId().hashCode());
		result = 37 * result + (getTenDdhcxa() == null ? 0 : this.getTenDdhcxa().hashCode());
		result = 37 * result + (getIdHuyen() == null ? 0 : this.getIdHuyen().hashCode());
		result = 37 * result + (getTenHuyen() == null ? 0 : this.getTenHuyen().hashCode());
		result = 37 * result + (getIdTinh() == null ? 0 : this.getIdTinh().hashCode());
		result = 37 * result + (getTenTinh() == null ? 0 : this.getTenTinh().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (getTenMauBien() == null ? 0 : this.getTenMauBien().hashCode());
		result = 37 * result + (getNgayDangky() == null ? 0 : this.getNgayDangky().hashCode());
		result = 37 * result + (getStrNgayDangky() == null ? 0 : this.getStrNgayDangky().hashCode());
		result = 37 * result + (getThongkeNgay() == null ? 0 : this.getThongkeNgay().hashCode());
		result = 37 * result + (getMaLoaiXeId() == null ? 0 : this.getMaLoaiXeId().hashCode());
		result = 37 * result + (getTenLoaiXe() == null ? 0 : this.getTenLoaiXe().hashCode());
		result = 37 * result + (getNhanhieuLoaixeId() == null ? 0 : this.getNhanhieuLoaixeId().hashCode());
		result = 37 * result + (getTenNhanHieu() == null ? 0 : this.getTenNhanHieu().hashCode());
		result = 37 * result + (getSoLoai() == null ? 0 : this.getSoLoai().hashCode());
		result = 37 * result + (getSoKhung() == null ? 0 : this.getSoKhung().hashCode());
		result = 37 * result + (getSoMay() == null ? 0 : this.getSoMay().hashCode());
		result = 37 * result + (getPhanloaiQuanlyId() == null ? 0 : this.getPhanloaiQuanlyId().hashCode());
		result = 37 * result + (getTenPhanLoaiQuanly() == null ? 0 : this.getTenPhanLoaiQuanly().hashCode());
		result = 37 * result + (getLoaiGiayto() == null ? 0 : this.getLoaiGiayto().hashCode());
		result = 37 * result + (getTenLoaiGiayTo() == null ? 0 : this.getTenLoaiGiayTo().hashCode());
		result = 37 * result + (getIdSo() == null ? 0 : this.getIdSo().hashCode());
		result = 37 * result + (getIdNgayCap() == null ? 0 : this.getIdNgayCap().hashCode());
		result = 37 * result + (getIdNoiCap() == null ? 0 : this.getIdNoiCap().hashCode());
		result = 37 * result + (getTenNoiCapCmnd() == null ? 0 : this.getTenNoiCapCmnd().hashCode());
		result = 37 * result + (getMaSoThue() == null ? 0 : this.getMaSoThue().hashCode());
		result = 37 * result + (getTaiKhoan() == null ? 0 : this.getTaiKhoan().hashCode());
		result = 37 * result + (getNganHang() == null ? 0 : this.getNganHang().hashCode());
		result = 37 * result + (getMauXe() == null ? 0 : this.getMauXe().hashCode());
		result = 37 * result + (getTenMauXe() == null ? 0 : this.getTenMauXe().hashCode());
		result = 37 * result + (getLoaiNhienLieu() == null ? 0 : this.getLoaiNhienLieu().hashCode());
		result = 37 * result + (getTenLoaiNhienLieu() == null ? 0 : this.getTenLoaiNhienLieu().hashCode());
		result = 37 * result + (getCongSuat() == null ? 0 : this.getCongSuat().hashCode());
		result = 37 * result + (getDungTich() == null ? 0 : this.getDungTich().hashCode());
		result = 37 * result + (getNuocSx() == null ? 0 : this.getNuocSx().hashCode());
		result = 37 * result + (getTenQuocGiaSx() == null ? 0 : this.getTenQuocGiaSx().hashCode());
		result = 37 * result + (getNamSx() == null ? 0 : this.getNamSx().hashCode());
		result = 37 * result + (getNienHanSuDung() == null ? 0 : this.getNienHanSuDung().hashCode());
		result = 37 * result + (getHieulucDenngay() == null ? 0 : this.getHieulucDenngay().hashCode());
		result = 37 * result + (getNguonGoc() == null ? 0 : this.getNguonGoc().hashCode());
		result = 37 * result + (getTenNguonGoc() == null ? 0 : this.getTenNguonGoc().hashCode());
		result = 37 * result + (getSoChungTu() == null ? 0 : this.getSoChungTu().hashCode());
		result = 37 * result + (getNgaycapChungtu() == null ? 0 : this.getNgaycapChungtu().hashCode());
		result = 37 * result + (getCoquanCapchungtu() == null ? 0 : this.getCoquanCapchungtu().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getTenTrangThaiXe() == null ? 0 : this.getTenTrangThaiXe().hashCode());
		result = 37 * result + (getSoChungnhandk() == null ? 0 : this.getSoChungnhandk().hashCode());
		result = 37 * result + (getTrangthaiHoso() == null ? 0 : this.getTrangthaiHoso().hashCode());
		result = 37 * result + (getTenTrangthaiHoso() == null ? 0 : this.getTenTrangthaiHoso().hashCode());
		result = 37 * result + (getTrangthaiDangky() == null ? 0 : this.getTrangthaiDangky().hashCode());
		result = 37 * result + (getTenTrangthaiDangky() == null ? 0 : this.getTenTrangthaiDangky().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (getNgayDkLandau() == null ? 0 : this.getNgayDkLandau().hashCode());
		result = 37 * result + (getStrNgayDkLandau() == null ? 0 : this.getStrNgayDkLandau().hashCode());
		result = 37 * result + (getNgayDi() == null ? 0 : this.getNgayDi().hashCode());
		result = 37 * result + (getNgayDen() == null ? 0 : this.getNgayDen().hashCode());
		result = 37 * result + (getHinhthucCaitao() == null ? 0 : this.getHinhthucCaitao().hashCode());
		result = 37 * result + (getTenLoaiCaiTao() == null ? 0 : this.getTenLoaiCaiTao().hashCode());
		result = 37 * result + (getLydoThuhoiDoicap() == null ? 0 : this.getLydoThuhoiDoicap().hashCode());
		result = 37 * result + (getTenLoaiDoiCap() == null ? 0 : this.getTenLoaiDoiCap().hashCode());
		result = 37 * result + (getMaGiaoDich() == null ? 0 : this.getMaGiaoDich().hashCode());
		result = 37 * result + (getNgayCaiTao() == null ? 0 : this.getNgayCaiTao().hashCode());
		result = 37 * result + (getNgayThuHoi() == null ? 0 : this.getNgayThuHoi().hashCode());
		result = 37 * result + (getNgayDiChuyen() == null ? 0 : this.getNgayDiChuyen().hashCode());
		result = 37 * result + (getMotoId() == null ? 0 : this.getMotoId().hashCode());
		result = 37 * result + (getSonguoiDuocphepcho() == null ? 0 : this.getSonguoiDuocphepcho().hashCode());
		return result;
	}

}
