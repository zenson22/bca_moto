package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LsMotoDangKyId
 */
@Embeddable
public class LsMotoDangKyId implements java.io.Serializable {

	private long id;
	private long motoId;
	private Long chuSoHuuId;
	private Long phanloaiQuanlyId;
	private String dauBienTheoTinh;
	private String biensoQuocgiaId;
	private String biensoDaydu;
	private String biensoCu;
	private long canboDangkyId;
	private Date ngayDangky;
	private String trangthaiDangky;
	private Boolean hieuLucDk;
	private Date ngayTradangky;
	private Date ngayDkLandau;
	private Date hieulucDenngay;
	private String soChungnhandk;
	private String trangthaiHoso;
	private String lydoThuhoiDoicap;
	private String hinhthucCaitao;
	private String ghiChu;
	private String noiTamNhap;
	private Date ngayTamNhap;
	private String noiTaiXuat;
	private Date ngayTaiXuat;
	private String duocphepDitu;
	private Date ngayDi;
	private String duocphepDiden;
	private Date ngayDen;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Boolean daTaiXuat;
	private String capPheDuyet;
	private Date ngayPheDuyet;
	private String mucDichSuDung;
	private String noiDungPheDuyet;
	private Long khuKtdbId;
	private String dauBienQuocGia;
	private Long motoBienSoid;
	private Boolean lanhDaoDuyet;
	private Boolean doiTruongDuyet;
	private Boolean khoa;
	private String seriChu;
	private String mauBien;
	private String phamViHoatDong;
	private String bienSoNuocNgoai;
	private Boolean loaiDangKyTam;
	private String coQuanCapPhep;
	private Date ngayCapPhep;
	private Long lanhDaoId;
	private Long doiTruongId;
	private String lyDoThuHoi;
	private String soPhuHieuKs;
	private Date ngayCapPhuHieu;
	private Date phuHieuHlTuNgay;
	private Date phuHieuHlDenNgay;
	private Long donViChuyenDen;
	private Long laKhuKtdb;
	private Long soLanDoiCap;
	private Boolean duLieuCu;
	private Long maGiaoDich;
	private Boolean matBien;
	private Boolean matDangKy;
	private String biensoTam;
	private String canCu;
	private String bienHeThongCu;
	private Date dkMoi;
	private Date ngayCaiTao;
	private Date ngayThuHoi;
	private Date ngayDiChuyen;
	private String bienSoTrunc;
	private Boolean coThayDoi;
	private Boolean dangkyTam;
	private Long diemDkId;
	private Long donViCsgtId;
	private Long loaiStnt;
	private String lyDoTraBien;
	private Date ngayThayDoi;
	private Date ngayTuDongHoanThanh;
	private Boolean nhapDuLieuCu;
	private Long seriSo;
	private String maNopThueTruocBa;

	public LsMotoDangKyId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "MOTO_ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getMotoId() {
		return this.motoId;
	}

	public void setMotoId(long motoId) {
		this.motoId = motoId;
	}

	@Column(name = "CHU_SO_HUU_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getChuSoHuuId() {
		return this.chuSoHuuId;
	}

	public void setChuSoHuuId(Long chuSoHuuId) {
		this.chuSoHuuId = chuSoHuuId;
	}

	@Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getPhanloaiQuanlyId() {
		return this.phanloaiQuanlyId;
	}

	public void setPhanloaiQuanlyId(Long phanloaiQuanlyId) {
		this.phanloaiQuanlyId = phanloaiQuanlyId;
	}

	@Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 12)
	public String getDauBienTheoTinh() {
		return this.dauBienTheoTinh;
	}

	public void setDauBienTheoTinh(String dauBienTheoTinh) {
		this.dauBienTheoTinh = dauBienTheoTinh;
	}

	@Column(name = "BIENSO_QUOCGIA_ID", columnDefinition = "VARCHAR2", length = 16)
	public String getBiensoQuocgiaId() {
		return this.biensoQuocgiaId;
	}

	public void setBiensoQuocgiaId(String biensoQuocgiaId) {
		this.biensoQuocgiaId = biensoQuocgiaId;
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

	@Column(name = "CANBO_DANGKY_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanboDangkyId() {
		return this.canboDangkyId;
	}

	public void setCanboDangkyId(long canboDangkyId) {
		this.canboDangkyId = canboDangkyId;
	}

	@Column(name = "NGAY_DANGKY", columnDefinition = "DATE", length = 7)
	public Date getNgayDangky() {
		return this.ngayDangky;
	}

	public void setNgayDangky(Date ngayDangky) {
		this.ngayDangky = ngayDangky;
	}

	@Column(name = "TRANGTHAI_DANGKY", columnDefinition = "VARCHAR2", length = 120)
	public String getTrangthaiDangky() {
		return this.trangthaiDangky;
	}

	public void setTrangthaiDangky(String trangthaiDangky) {
		this.trangthaiDangky = trangthaiDangky;
	}

	@Column(name = "HIEU_LUC_DK", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getHieuLucDk() {
		return this.hieuLucDk;
	}

	public void setHieuLucDk(Boolean hieuLucDk) {
		this.hieuLucDk = hieuLucDk;
	}

	@Column(name = "NGAY_TRADANGKY", columnDefinition = "DATE", length = 7)
	public Date getNgayTradangky() {
		return this.ngayTradangky;
	}

	public void setNgayTradangky(Date ngayTradangky) {
		this.ngayTradangky = ngayTradangky;
	}

	@Column(name = "NGAY_DK_LANDAU", columnDefinition = "DATE", length = 7)
	public Date getNgayDkLandau() {
		return this.ngayDkLandau;
	}

	public void setNgayDkLandau(Date ngayDkLandau) {
		this.ngayDkLandau = ngayDkLandau;
	}

	@Column(name = "HIEULUC_DENNGAY", columnDefinition = "DATE", length = 7)
	public Date getHieulucDenngay() {
		return this.hieulucDenngay;
	}

	public void setHieulucDenngay(Date hieulucDenngay) {
		this.hieulucDenngay = hieulucDenngay;
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

	@Column(name = "LYDO_THUHOI_DOICAP", columnDefinition = "VARCHAR2", length = 120)
	public String getLydoThuhoiDoicap() {
		return this.lydoThuhoiDoicap;
	}

	public void setLydoThuhoiDoicap(String lydoThuhoiDoicap) {
		this.lydoThuhoiDoicap = lydoThuhoiDoicap;
	}

	@Column(name = "HINHTHUC_CAITAO", columnDefinition = "VARCHAR2", length = 120)
	public String getHinhthucCaitao() {
		return this.hinhthucCaitao;
	}

	public void setHinhthucCaitao(String hinhthucCaitao) {
		this.hinhthucCaitao = hinhthucCaitao;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "NOI_TAM_NHAP", columnDefinition = "VARCHAR2", length = 400)
	public String getNoiTamNhap() {
		return this.noiTamNhap;
	}

	public void setNoiTamNhap(String noiTamNhap) {
		this.noiTamNhap = noiTamNhap;
	}

	@Column(name = "NGAY_TAM_NHAP", columnDefinition = "DATE", length = 7)
	public Date getNgayTamNhap() {
		return this.ngayTamNhap;
	}

	public void setNgayTamNhap(Date ngayTamNhap) {
		this.ngayTamNhap = ngayTamNhap;
	}

	@Column(name = "NOI_TAI_XUAT", columnDefinition = "VARCHAR2", length = 400)
	public String getNoiTaiXuat() {
		return this.noiTaiXuat;
	}

	public void setNoiTaiXuat(String noiTaiXuat) {
		this.noiTaiXuat = noiTaiXuat;
	}

	@Column(name = "NGAY_TAI_XUAT", columnDefinition = "DATE", length = 7)
	public Date getNgayTaiXuat() {
		return this.ngayTaiXuat;
	}

	public void setNgayTaiXuat(Date ngayTaiXuat) {
		this.ngayTaiXuat = ngayTaiXuat;
	}

	@Column(name = "DUOCPHEP_DITU", columnDefinition = "VARCHAR2", length = 1020)
	public String getDuocphepDitu() {
		return this.duocphepDitu;
	}

	public void setDuocphepDitu(String duocphepDitu) {
		this.duocphepDitu = duocphepDitu;
	}

	@Column(name = "NGAY_DI", columnDefinition = "DATE", length = 7)
	public Date getNgayDi() {
		return this.ngayDi;
	}

	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}

	@Column(name = "DUOCPHEP_DIDEN", columnDefinition = "VARCHAR2", length = 1020)
	public String getDuocphepDiden() {
		return this.duocphepDiden;
	}

	public void setDuocphepDiden(String duocphepDiden) {
		this.duocphepDiden = duocphepDiden;
	}

	@Column(name = "NGAY_DEN", columnDefinition = "DATE", length = 7)
	public Date getNgayDen() {
		return this.ngayDen;
	}

	public void setNgayDen(Date ngayDen) {
		this.ngayDen = ngayDen;
	}

	@Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Column(name = "DA_TAI_XUAT", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getDaTaiXuat() {
		return this.daTaiXuat;
	}

	public void setDaTaiXuat(Boolean daTaiXuat) {
		this.daTaiXuat = daTaiXuat;
	}

	@Column(name = "CAP_PHE_DUYET", columnDefinition = "VARCHAR2", length = 1020)
	public String getCapPheDuyet() {
		return this.capPheDuyet;
	}

	public void setCapPheDuyet(String capPheDuyet) {
		this.capPheDuyet = capPheDuyet;
	}

	@Column(name = "NGAY_PHE_DUYET", columnDefinition = "DATE", length = 7)
	public Date getNgayPheDuyet() {
		return this.ngayPheDuyet;
	}

	public void setNgayPheDuyet(Date ngayPheDuyet) {
		this.ngayPheDuyet = ngayPheDuyet;
	}

	@Column(name = "MUC_DICH_SU_DUNG", columnDefinition = "VARCHAR2", length = 1020)
	public String getMucDichSuDung() {
		return this.mucDichSuDung;
	}

	public void setMucDichSuDung(String mucDichSuDung) {
		this.mucDichSuDung = mucDichSuDung;
	}

	@Column(name = "NOI_DUNG_PHE_DUYET", columnDefinition = "VARCHAR2", length = 1020)
	public String getNoiDungPheDuyet() {
		return this.noiDungPheDuyet;
	}

	public void setNoiDungPheDuyet(String noiDungPheDuyet) {
		this.noiDungPheDuyet = noiDungPheDuyet;
	}

	@Column(name = "KHU_KTDB_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getKhuKtdbId() {
		return this.khuKtdbId;
	}

	public void setKhuKtdbId(Long khuKtdbId) {
		this.khuKtdbId = khuKtdbId;
	}

	@Column(name = "DAU_BIEN_QUOC_GIA", columnDefinition = "VARCHAR2", length = 5)
	public String getDauBienQuocGia() {
		return this.dauBienQuocGia;
	}

	public void setDauBienQuocGia(String dauBienQuocGia) {
		this.dauBienQuocGia = dauBienQuocGia;
	}

	@Column(name = "MOTO_BIEN_SOID", columnDefinition = "NUMBER", precision = 30, scale = 0)
	public Long getMotoBienSoid() {
		return this.motoBienSoid;
	}

	public void setMotoBienSoid(Long motoBienSoid) {
		this.motoBienSoid = motoBienSoid;
	}

	@Column(name = "LANH_DAO_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getLanhDaoDuyet() {
		return this.lanhDaoDuyet;
	}

	public void setLanhDaoDuyet(Boolean lanhDaoDuyet) {
		this.lanhDaoDuyet = lanhDaoDuyet;
	}

	@Column(name = "DOI_TRUONG_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getDoiTruongDuyet() {
		return this.doiTruongDuyet;
	}

	public void setDoiTruongDuyet(Boolean doiTruongDuyet) {
		this.doiTruongDuyet = doiTruongDuyet;
	}

	@Column(name = "KHOA", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getKhoa() {
		return this.khoa;
	}

	public void setKhoa(Boolean khoa) {
		this.khoa = khoa;
	}

	@Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 30)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "PHAM_VI_HOAT_DONG", columnDefinition = "VARCHAR2")
	public String getPhamViHoatDong() {
		return this.phamViHoatDong;
	}

	public void setPhamViHoatDong(String phamViHoatDong) {
		this.phamViHoatDong = phamViHoatDong;
	}

	@Column(name = "BIEN_SO_NUOC_NGOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getBienSoNuocNgoai() {
		return this.bienSoNuocNgoai;
	}

	public void setBienSoNuocNgoai(String bienSoNuocNgoai) {
		this.bienSoNuocNgoai = bienSoNuocNgoai;
	}

	@Column(name = "LOAI_DANG_KY_TAM", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getLoaiDangKyTam() {
		return this.loaiDangKyTam;
	}

	public void setLoaiDangKyTam(Boolean loaiDangKyTam) {
		this.loaiDangKyTam = loaiDangKyTam;
	}

	@Column(name = "CO_QUAN_CAP_PHEP", columnDefinition = "VARCHAR2", length = 400)
	public String getCoQuanCapPhep() {
		return this.coQuanCapPhep;
	}

	public void setCoQuanCapPhep(String coQuanCapPhep) {
		this.coQuanCapPhep = coQuanCapPhep;
	}

	@Column(name = "NGAY_CAP_PHEP", columnDefinition = "DATE", length = 7)
	public Date getNgayCapPhep() {
		return this.ngayCapPhep;
	}

	public void setNgayCapPhep(Date ngayCapPhep) {
		this.ngayCapPhep = ngayCapPhep;
	}

	@Column(name = "LANH_DAO_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getLanhDaoId() {
		return this.lanhDaoId;
	}

	public void setLanhDaoId(Long lanhDaoId) {
		this.lanhDaoId = lanhDaoId;
	}

	@Column(name = "DOI_TRUONG_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getDoiTruongId() {
		return this.doiTruongId;
	}

	public void setDoiTruongId(Long doiTruongId) {
		this.doiTruongId = doiTruongId;
	}

	@Column(name = "LY_DO_THU_HOI", columnDefinition = "VARCHAR2", length = 20)
	public String getLyDoThuHoi() {
		return this.lyDoThuHoi;
	}

	public void setLyDoThuHoi(String lyDoThuHoi) {
		this.lyDoThuHoi = lyDoThuHoi;
	}

	@Column(name = "SO_PHU_HIEU_KS", columnDefinition = "VARCHAR2", length = 20)
	public String getSoPhuHieuKs() {
		return this.soPhuHieuKs;
	}

	public void setSoPhuHieuKs(String soPhuHieuKs) {
		this.soPhuHieuKs = soPhuHieuKs;
	}

	@Column(name = "NGAY_CAP_PHU_HIEU", columnDefinition = "DATE", length = 7)
	public Date getNgayCapPhuHieu() {
		return this.ngayCapPhuHieu;
	}

	public void setNgayCapPhuHieu(Date ngayCapPhuHieu) {
		this.ngayCapPhuHieu = ngayCapPhuHieu;
	}

	@Column(name = "PHU_HIEU_HL_TU_NGAY", columnDefinition = "DATE", length = 7)
	public Date getPhuHieuHlTuNgay() {
		return this.phuHieuHlTuNgay;
	}

	public void setPhuHieuHlTuNgay(Date phuHieuHlTuNgay) {
		this.phuHieuHlTuNgay = phuHieuHlTuNgay;
	}

	@Column(name = "PHU_HIEU_HL_DEN_NGAY", columnDefinition = "DATE", length = 7)
	public Date getPhuHieuHlDenNgay() {
		return this.phuHieuHlDenNgay;
	}

	public void setPhuHieuHlDenNgay(Date phuHieuHlDenNgay) {
		this.phuHieuHlDenNgay = phuHieuHlDenNgay;
	}

	@Column(name = "DON_VI_CHUYEN_DEN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViChuyenDen() {
		return this.donViChuyenDen;
	}

	public void setDonViChuyenDen(Long donViChuyenDen) {
		this.donViChuyenDen = donViChuyenDen;
	}

	@Column(name = "LA_KHU_KTDB", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLaKhuKtdb() {
		return this.laKhuKtdb;
	}

	public void setLaKhuKtdb(Long laKhuKtdb) {
		this.laKhuKtdb = laKhuKtdb;
	}

	@Column(name = "SO_LAN_DOI_CAP", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getSoLanDoiCap() {
		return this.soLanDoiCap;
	}

	public void setSoLanDoiCap(Long soLanDoiCap) {
		this.soLanDoiCap = soLanDoiCap;
	}

	@Column(name = "DU_LIEU_CU", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getDuLieuCu() {
		return this.duLieuCu;
	}

	public void setDuLieuCu(Boolean duLieuCu) {
		this.duLieuCu = duLieuCu;
	}

	@Column(name = "MA_GIAO_DICH", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMaGiaoDich() {
		return this.maGiaoDich;
	}

	public void setMaGiaoDich(Long maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	@Column(name = "MAT_BIEN", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getMatBien() {
		return this.matBien;
	}

	public void setMatBien(Boolean matBien) {
		this.matBien = matBien;
	}

	@Column(name = "MAT_DANG_KY", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getMatDangKy() {
		return this.matDangKy;
	}

	public void setMatDangKy(Boolean matDangKy) {
		this.matDangKy = matDangKy;
	}

	@Column(name = "BIENSO_TAM", columnDefinition = "VARCHAR2", length = 60)
	public String getBiensoTam() {
		return this.biensoTam;
	}

	public void setBiensoTam(String biensoTam) {
		this.biensoTam = biensoTam;
	}

	@Column(name = "CAN_CU", columnDefinition = "VARCHAR2")
	public String getCanCu() {
		return this.canCu;
	}

	public void setCanCu(String canCu) {
		this.canCu = canCu;
	}

	@Column(name = "BIEN_HE_THONG_CU", columnDefinition = "VARCHAR2", length = 15)
	public String getBienHeThongCu() {
		return this.bienHeThongCu;
	}

	public void setBienHeThongCu(String bienHeThongCu) {
		this.bienHeThongCu = bienHeThongCu;
	}

	@Column(name = "DK_MOI", columnDefinition = "DATE", length = 7)
	public Date getDkMoi() {
		return this.dkMoi;
	}

	public void setDkMoi(Date dkMoi) {
		this.dkMoi = dkMoi;
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

	@Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 20)
	public String getBienSoTrunc() {
		return this.bienSoTrunc;
	}

	public void setBienSoTrunc(String bienSoTrunc) {
		this.bienSoTrunc = bienSoTrunc;
	}

	@Column(name = "CO_THAY_DOI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getCoThayDoi() {
		return this.coThayDoi;
	}

	public void setCoThayDoi(Boolean coThayDoi) {
		this.coThayDoi = coThayDoi;
	}

	@Column(name = "DANGKY_TAM", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getDangkyTam() {
		return this.dangkyTam;
	}

	public void setDangkyTam(Boolean dangkyTam) {
		this.dangkyTam = dangkyTam;
	}

	@Column(name = "DIEM_DK_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDiemDkId() {
		return this.diemDkId;
	}

	public void setDiemDkId(Long diemDkId) {
		this.diemDkId = diemDkId;
	}

	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "LOAI_STNT", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLoaiStnt() {
		return this.loaiStnt;
	}

	public void setLoaiStnt(Long loaiStnt) {
		this.loaiStnt = loaiStnt;
	}

	@Column(name = "LY_DO_TRA_BIEN", columnDefinition = "VARCHAR2", length = 1020)
	public String getLyDoTraBien() {
		return this.lyDoTraBien;
	}

	public void setLyDoTraBien(String lyDoTraBien) {
		this.lyDoTraBien = lyDoTraBien;
	}

	@Column(name = "NGAY_THAY_DOI", columnDefinition = "DATE", length = 7)
	public Date getNgayThayDoi() {
		return this.ngayThayDoi;
	}

	public void setNgayThayDoi(Date ngayThayDoi) {
		this.ngayThayDoi = ngayThayDoi;
	}

	@Column(name = "NGAY_TU_DONG_HOAN_THANH", columnDefinition = "DATE", length = 7)
	public Date getNgayTuDongHoanThanh() {
		return this.ngayTuDongHoanThanh;
	}

	public void setNgayTuDongHoanThanh(Date ngayTuDongHoanThanh) {
		this.ngayTuDongHoanThanh = ngayTuDongHoanThanh;
	}

	@Column(name = "NHAP_DU_LIEU_CU", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getNhapDuLieuCu() {
		return this.nhapDuLieuCu;
	}

	public void setNhapDuLieuCu(Boolean nhapDuLieuCu) {
		this.nhapDuLieuCu = nhapDuLieuCu;
	}

	@Column(name = "SERI_SO", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSeriSo() {
		return this.seriSo;
	}

	public void setSeriSo(Long seriSo) {
		this.seriSo = seriSo;
	}

	@Column(name = "MA_NOP_THUE_TRUOC_BA", columnDefinition = "VARCHAR2", length = 50)
	public String getMaNopThueTruocBa() {
		return this.maNopThueTruocBa;
	}

	public void setMaNopThueTruocBa(String maNopThueTruocBa) {
		this.maNopThueTruocBa = maNopThueTruocBa;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LsMotoDangKyId))
			return false;
		LsMotoDangKyId castOther = (LsMotoDangKyId) other;

		return (this.getId() == castOther.getId()) && (this.getMotoId() == castOther.getMotoId())
				&& ((this.getChuSoHuuId() == castOther.getChuSoHuuId()) || (this.getChuSoHuuId() != null
						&& castOther.getChuSoHuuId() != null && this.getChuSoHuuId().equals(castOther.getChuSoHuuId())))
				&& ((this.getPhanloaiQuanlyId() == castOther.getPhanloaiQuanlyId())
						|| (this.getPhanloaiQuanlyId() != null && castOther.getPhanloaiQuanlyId() != null
								&& this.getPhanloaiQuanlyId().equals(castOther.getPhanloaiQuanlyId())))
				&& ((this.getDauBienTheoTinh() == castOther.getDauBienTheoTinh())
						|| (this.getDauBienTheoTinh() != null && castOther.getDauBienTheoTinh() != null
								&& this.getDauBienTheoTinh().equals(castOther.getDauBienTheoTinh())))
				&& ((this.getBiensoQuocgiaId() == castOther.getBiensoQuocgiaId())
						|| (this.getBiensoQuocgiaId() != null && castOther.getBiensoQuocgiaId() != null
								&& this.getBiensoQuocgiaId().equals(castOther.getBiensoQuocgiaId())))
				&& ((this.getBiensoDaydu() == castOther.getBiensoDaydu())
						|| (this.getBiensoDaydu() != null && castOther.getBiensoDaydu() != null
								&& this.getBiensoDaydu().equals(castOther.getBiensoDaydu())))
				&& ((this.getBiensoCu() == castOther.getBiensoCu()) || (this.getBiensoCu() != null
						&& castOther.getBiensoCu() != null && this.getBiensoCu().equals(castOther.getBiensoCu())))
				&& (this.getCanboDangkyId() == castOther.getCanboDangkyId())
				&& ((this.getNgayDangky() == castOther.getNgayDangky()) || (this.getNgayDangky() != null
						&& castOther.getNgayDangky() != null && this.getNgayDangky().equals(castOther.getNgayDangky())))
				&& ((this.getTrangthaiDangky() == castOther.getTrangthaiDangky())
						|| (this.getTrangthaiDangky() != null && castOther.getTrangthaiDangky() != null
								&& this.getTrangthaiDangky().equals(castOther.getTrangthaiDangky())))
				&& ((this.getHieuLucDk() == castOther.getHieuLucDk()) || (this.getHieuLucDk() != null
						&& castOther.getHieuLucDk() != null && this.getHieuLucDk().equals(castOther.getHieuLucDk())))
				&& ((this.getNgayTradangky() == castOther.getNgayTradangky())
						|| (this.getNgayTradangky() != null && castOther.getNgayTradangky() != null
								&& this.getNgayTradangky().equals(castOther.getNgayTradangky())))
				&& ((this.getNgayDkLandau() == castOther.getNgayDkLandau())
						|| (this.getNgayDkLandau() != null && castOther.getNgayDkLandau() != null
								&& this.getNgayDkLandau().equals(castOther.getNgayDkLandau())))
				&& ((this.getHieulucDenngay() == castOther.getHieulucDenngay())
						|| (this.getHieulucDenngay() != null && castOther.getHieulucDenngay() != null
								&& this.getHieulucDenngay().equals(castOther.getHieulucDenngay())))
				&& ((this.getSoChungnhandk() == castOther.getSoChungnhandk())
						|| (this.getSoChungnhandk() != null && castOther.getSoChungnhandk() != null
								&& this.getSoChungnhandk().equals(castOther.getSoChungnhandk())))
				&& ((this.getTrangthaiHoso() == castOther.getTrangthaiHoso())
						|| (this.getTrangthaiHoso() != null && castOther.getTrangthaiHoso() != null
								&& this.getTrangthaiHoso().equals(castOther.getTrangthaiHoso())))
				&& ((this.getLydoThuhoiDoicap() == castOther.getLydoThuhoiDoicap())
						|| (this.getLydoThuhoiDoicap() != null && castOther.getLydoThuhoiDoicap() != null
								&& this.getLydoThuhoiDoicap().equals(castOther.getLydoThuhoiDoicap())))
				&& ((this.getHinhthucCaitao() == castOther.getHinhthucCaitao())
						|| (this.getHinhthucCaitao() != null && castOther.getHinhthucCaitao() != null
								&& this.getHinhthucCaitao().equals(castOther.getHinhthucCaitao())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getNoiTamNhap() == castOther.getNoiTamNhap()) || (this.getNoiTamNhap() != null
						&& castOther.getNoiTamNhap() != null && this.getNoiTamNhap().equals(castOther.getNoiTamNhap())))
				&& ((this.getNgayTamNhap() == castOther.getNgayTamNhap())
						|| (this.getNgayTamNhap() != null && castOther.getNgayTamNhap() != null
								&& this.getNgayTamNhap().equals(castOther.getNgayTamNhap())))
				&& ((this.getNoiTaiXuat() == castOther.getNoiTaiXuat()) || (this.getNoiTaiXuat() != null
						&& castOther.getNoiTaiXuat() != null && this.getNoiTaiXuat().equals(castOther.getNoiTaiXuat())))
				&& ((this.getNgayTaiXuat() == castOther.getNgayTaiXuat())
						|| (this.getNgayTaiXuat() != null && castOther.getNgayTaiXuat() != null
								&& this.getNgayTaiXuat().equals(castOther.getNgayTaiXuat())))
				&& ((this.getDuocphepDitu() == castOther.getDuocphepDitu())
						|| (this.getDuocphepDitu() != null && castOther.getDuocphepDitu() != null
								&& this.getDuocphepDitu().equals(castOther.getDuocphepDitu())))
				&& ((this.getNgayDi() == castOther.getNgayDi()) || (this.getNgayDi() != null
						&& castOther.getNgayDi() != null && this.getNgayDi().equals(castOther.getNgayDi())))
				&& ((this.getDuocphepDiden() == castOther.getDuocphepDiden())
						|| (this.getDuocphepDiden() != null && castOther.getDuocphepDiden() != null
								&& this.getDuocphepDiden().equals(castOther.getDuocphepDiden())))
				&& ((this.getNgayDen() == castOther.getNgayDen()) || (this.getNgayDen() != null
						&& castOther.getNgayDen() != null && this.getNgayDen().equals(castOther.getNgayDen())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getDaTaiXuat() == castOther.getDaTaiXuat()) || (this.getDaTaiXuat() != null
						&& castOther.getDaTaiXuat() != null && this.getDaTaiXuat().equals(castOther.getDaTaiXuat())))
				&& ((this.getCapPheDuyet() == castOther.getCapPheDuyet())
						|| (this.getCapPheDuyet() != null && castOther.getCapPheDuyet() != null
								&& this.getCapPheDuyet().equals(castOther.getCapPheDuyet())))
				&& ((this.getNgayPheDuyet() == castOther.getNgayPheDuyet())
						|| (this.getNgayPheDuyet() != null && castOther.getNgayPheDuyet() != null
								&& this.getNgayPheDuyet().equals(castOther.getNgayPheDuyet())))
				&& ((this.getMucDichSuDung() == castOther.getMucDichSuDung())
						|| (this.getMucDichSuDung() != null && castOther.getMucDichSuDung() != null
								&& this.getMucDichSuDung().equals(castOther.getMucDichSuDung())))
				&& ((this.getNoiDungPheDuyet() == castOther.getNoiDungPheDuyet())
						|| (this.getNoiDungPheDuyet() != null && castOther.getNoiDungPheDuyet() != null
								&& this.getNoiDungPheDuyet().equals(castOther.getNoiDungPheDuyet())))
				&& ((this.getKhuKtdbId() == castOther.getKhuKtdbId()) || (this.getKhuKtdbId() != null
						&& castOther.getKhuKtdbId() != null && this.getKhuKtdbId().equals(castOther.getKhuKtdbId())))
				&& ((this.getDauBienQuocGia() == castOther.getDauBienQuocGia())
						|| (this.getDauBienQuocGia() != null && castOther.getDauBienQuocGia() != null
								&& this.getDauBienQuocGia().equals(castOther.getDauBienQuocGia())))
				&& ((this.getMotoBienSoid() == castOther.getMotoBienSoid())
						|| (this.getMotoBienSoid() != null && castOther.getMotoBienSoid() != null
								&& this.getMotoBienSoid().equals(castOther.getMotoBienSoid())))
				&& ((this.getLanhDaoDuyet() == castOther.getLanhDaoDuyet())
						|| (this.getLanhDaoDuyet() != null && castOther.getLanhDaoDuyet() != null
								&& this.getLanhDaoDuyet().equals(castOther.getLanhDaoDuyet())))
				&& ((this.getDoiTruongDuyet() == castOther.getDoiTruongDuyet())
						|| (this.getDoiTruongDuyet() != null && castOther.getDoiTruongDuyet() != null
								&& this.getDoiTruongDuyet().equals(castOther.getDoiTruongDuyet())))
				&& ((this.getKhoa() == castOther.getKhoa()) || (this.getKhoa() != null && castOther.getKhoa() != null
						&& this.getKhoa().equals(castOther.getKhoa())))
				&& ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
						&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& ((this.getPhamViHoatDong() == castOther.getPhamViHoatDong())
						|| (this.getPhamViHoatDong() != null && castOther.getPhamViHoatDong() != null
								&& this.getPhamViHoatDong().equals(castOther.getPhamViHoatDong())))
				&& ((this.getBienSoNuocNgoai() == castOther.getBienSoNuocNgoai())
						|| (this.getBienSoNuocNgoai() != null && castOther.getBienSoNuocNgoai() != null
								&& this.getBienSoNuocNgoai().equals(castOther.getBienSoNuocNgoai())))
				&& ((this.getLoaiDangKyTam() == castOther.getLoaiDangKyTam())
						|| (this.getLoaiDangKyTam() != null && castOther.getLoaiDangKyTam() != null
								&& this.getLoaiDangKyTam().equals(castOther.getLoaiDangKyTam())))
				&& ((this.getCoQuanCapPhep() == castOther.getCoQuanCapPhep())
						|| (this.getCoQuanCapPhep() != null && castOther.getCoQuanCapPhep() != null
								&& this.getCoQuanCapPhep().equals(castOther.getCoQuanCapPhep())))
				&& ((this.getNgayCapPhep() == castOther.getNgayCapPhep())
						|| (this.getNgayCapPhep() != null && castOther.getNgayCapPhep() != null
								&& this.getNgayCapPhep().equals(castOther.getNgayCapPhep())))
				&& ((this.getLanhDaoId() == castOther.getLanhDaoId()) || (this.getLanhDaoId() != null
						&& castOther.getLanhDaoId() != null && this.getLanhDaoId().equals(castOther.getLanhDaoId())))
				&& ((this.getDoiTruongId() == castOther.getDoiTruongId())
						|| (this.getDoiTruongId() != null && castOther.getDoiTruongId() != null
								&& this.getDoiTruongId().equals(castOther.getDoiTruongId())))
				&& ((this.getLyDoThuHoi() == castOther.getLyDoThuHoi()) || (this.getLyDoThuHoi() != null
						&& castOther.getLyDoThuHoi() != null && this.getLyDoThuHoi().equals(castOther.getLyDoThuHoi())))
				&& ((this.getSoPhuHieuKs() == castOther.getSoPhuHieuKs())
						|| (this.getSoPhuHieuKs() != null && castOther.getSoPhuHieuKs() != null
								&& this.getSoPhuHieuKs().equals(castOther.getSoPhuHieuKs())))
				&& ((this.getNgayCapPhuHieu() == castOther.getNgayCapPhuHieu())
						|| (this.getNgayCapPhuHieu() != null && castOther.getNgayCapPhuHieu() != null
								&& this.getNgayCapPhuHieu().equals(castOther.getNgayCapPhuHieu())))
				&& ((this.getPhuHieuHlTuNgay() == castOther.getPhuHieuHlTuNgay())
						|| (this.getPhuHieuHlTuNgay() != null && castOther.getPhuHieuHlTuNgay() != null
								&& this.getPhuHieuHlTuNgay().equals(castOther.getPhuHieuHlTuNgay())))
				&& ((this.getPhuHieuHlDenNgay() == castOther.getPhuHieuHlDenNgay())
						|| (this.getPhuHieuHlDenNgay() != null && castOther.getPhuHieuHlDenNgay() != null
								&& this.getPhuHieuHlDenNgay().equals(castOther.getPhuHieuHlDenNgay())))
				&& ((this.getDonViChuyenDen() == castOther.getDonViChuyenDen())
						|| (this.getDonViChuyenDen() != null && castOther.getDonViChuyenDen() != null
								&& this.getDonViChuyenDen().equals(castOther.getDonViChuyenDen())))
				&& ((this.getLaKhuKtdb() == castOther.getLaKhuKtdb()) || (this.getLaKhuKtdb() != null
						&& castOther.getLaKhuKtdb() != null && this.getLaKhuKtdb().equals(castOther.getLaKhuKtdb())))
				&& ((this.getSoLanDoiCap() == castOther.getSoLanDoiCap())
						|| (this.getSoLanDoiCap() != null && castOther.getSoLanDoiCap() != null
								&& this.getSoLanDoiCap().equals(castOther.getSoLanDoiCap())))
				&& ((this.getDuLieuCu() == castOther.getDuLieuCu()) || (this.getDuLieuCu() != null
						&& castOther.getDuLieuCu() != null && this.getDuLieuCu().equals(castOther.getDuLieuCu())))
				&& ((this.getMaGiaoDich() == castOther.getMaGiaoDich()) || (this.getMaGiaoDich() != null
						&& castOther.getMaGiaoDich() != null && this.getMaGiaoDich().equals(castOther.getMaGiaoDich())))
				&& ((this.getMatBien() == castOther.getMatBien()) || (this.getMatBien() != null
						&& castOther.getMatBien() != null && this.getMatBien().equals(castOther.getMatBien())))
				&& ((this.getMatDangKy() == castOther.getMatDangKy()) || (this.getMatDangKy() != null
						&& castOther.getMatDangKy() != null && this.getMatDangKy().equals(castOther.getMatDangKy())))
				&& ((this.getBiensoTam() == castOther.getBiensoTam()) || (this.getBiensoTam() != null
						&& castOther.getBiensoTam() != null && this.getBiensoTam().equals(castOther.getBiensoTam())))
				&& ((this.getCanCu() == castOther.getCanCu()) || (this.getCanCu() != null
						&& castOther.getCanCu() != null && this.getCanCu().equals(castOther.getCanCu())))
				&& ((this.getBienHeThongCu() == castOther.getBienHeThongCu())
						|| (this.getBienHeThongCu() != null && castOther.getBienHeThongCu() != null
								&& this.getBienHeThongCu().equals(castOther.getBienHeThongCu())))
				&& ((this.getDkMoi() == castOther.getDkMoi()) || (this.getDkMoi() != null
						&& castOther.getDkMoi() != null && this.getDkMoi().equals(castOther.getDkMoi())))
				&& ((this.getNgayCaiTao() == castOther.getNgayCaiTao()) || (this.getNgayCaiTao() != null
						&& castOther.getNgayCaiTao() != null && this.getNgayCaiTao().equals(castOther.getNgayCaiTao())))
				&& ((this.getNgayThuHoi() == castOther.getNgayThuHoi()) || (this.getNgayThuHoi() != null
						&& castOther.getNgayThuHoi() != null && this.getNgayThuHoi().equals(castOther.getNgayThuHoi())))
				&& ((this.getNgayDiChuyen() == castOther.getNgayDiChuyen())
						|| (this.getNgayDiChuyen() != null && castOther.getNgayDiChuyen() != null
								&& this.getNgayDiChuyen().equals(castOther.getNgayDiChuyen())))
				&& ((this.getBienSoTrunc() == castOther.getBienSoTrunc())
						|| (this.getBienSoTrunc() != null && castOther.getBienSoTrunc() != null
								&& this.getBienSoTrunc().equals(castOther.getBienSoTrunc())))
				&& ((this.getCoThayDoi() == castOther.getCoThayDoi()) || (this.getCoThayDoi() != null
						&& castOther.getCoThayDoi() != null && this.getCoThayDoi().equals(castOther.getCoThayDoi())))
				&& ((this.getDangkyTam() == castOther.getDangkyTam()) || (this.getDangkyTam() != null
						&& castOther.getDangkyTam() != null && this.getDangkyTam().equals(castOther.getDangkyTam())))
				&& ((this.getDiemDkId() == castOther.getDiemDkId()) || (this.getDiemDkId() != null
						&& castOther.getDiemDkId() != null && this.getDiemDkId().equals(castOther.getDiemDkId())))
				&& ((this.getDonViCsgtId() == castOther.getDonViCsgtId())
						|| (this.getDonViCsgtId() != null && castOther.getDonViCsgtId() != null
								&& this.getDonViCsgtId().equals(castOther.getDonViCsgtId())))
				&& ((this.getLoaiStnt() == castOther.getLoaiStnt()) || (this.getLoaiStnt() != null
						&& castOther.getLoaiStnt() != null && this.getLoaiStnt().equals(castOther.getLoaiStnt())))
				&& ((this.getLyDoTraBien() == castOther.getLyDoTraBien())
						|| (this.getLyDoTraBien() != null && castOther.getLyDoTraBien() != null
								&& this.getLyDoTraBien().equals(castOther.getLyDoTraBien())))
				&& ((this.getNgayThayDoi() == castOther.getNgayThayDoi())
						|| (this.getNgayThayDoi() != null && castOther.getNgayThayDoi() != null
								&& this.getNgayThayDoi().equals(castOther.getNgayThayDoi())))
				&& ((this.getNgayTuDongHoanThanh() == castOther.getNgayTuDongHoanThanh())
						|| (this.getNgayTuDongHoanThanh() != null && castOther.getNgayTuDongHoanThanh() != null
								&& this.getNgayTuDongHoanThanh().equals(castOther.getNgayTuDongHoanThanh())))
				&& ((this.getNhapDuLieuCu() == castOther.getNhapDuLieuCu())
						|| (this.getNhapDuLieuCu() != null && castOther.getNhapDuLieuCu() != null
								&& this.getNhapDuLieuCu().equals(castOther.getNhapDuLieuCu())))
				&& ((this.getSeriSo() == castOther.getSeriSo()) || (this.getSeriSo() != null
						&& castOther.getSeriSo() != null && this.getSeriSo().equals(castOther.getSeriSo())))
				&& ((this.getMaNopThueTruocBa() == castOther.getMaNopThueTruocBa())
						|| (this.getMaNopThueTruocBa() != null && castOther.getMaNopThueTruocBa() != null
								&& this.getMaNopThueTruocBa().equals(castOther.getMaNopThueTruocBa())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (int) this.getMotoId();
		result = 37 * result + (getChuSoHuuId() == null ? 0 : this.getChuSoHuuId().hashCode());
		result = 37 * result + (getPhanloaiQuanlyId() == null ? 0 : this.getPhanloaiQuanlyId().hashCode());
		result = 37 * result + (getDauBienTheoTinh() == null ? 0 : this.getDauBienTheoTinh().hashCode());
		result = 37 * result + (getBiensoQuocgiaId() == null ? 0 : this.getBiensoQuocgiaId().hashCode());
		result = 37 * result + (getBiensoDaydu() == null ? 0 : this.getBiensoDaydu().hashCode());
		result = 37 * result + (getBiensoCu() == null ? 0 : this.getBiensoCu().hashCode());
		result = 37 * result + (int) this.getCanboDangkyId();
		result = 37 * result + (getNgayDangky() == null ? 0 : this.getNgayDangky().hashCode());
		result = 37 * result + (getTrangthaiDangky() == null ? 0 : this.getTrangthaiDangky().hashCode());
		result = 37 * result + (getHieuLucDk() == null ? 0 : this.getHieuLucDk().hashCode());
		result = 37 * result + (getNgayTradangky() == null ? 0 : this.getNgayTradangky().hashCode());
		result = 37 * result + (getNgayDkLandau() == null ? 0 : this.getNgayDkLandau().hashCode());
		result = 37 * result + (getHieulucDenngay() == null ? 0 : this.getHieulucDenngay().hashCode());
		result = 37 * result + (getSoChungnhandk() == null ? 0 : this.getSoChungnhandk().hashCode());
		result = 37 * result + (getTrangthaiHoso() == null ? 0 : this.getTrangthaiHoso().hashCode());
		result = 37 * result + (getLydoThuhoiDoicap() == null ? 0 : this.getLydoThuhoiDoicap().hashCode());
		result = 37 * result + (getHinhthucCaitao() == null ? 0 : this.getHinhthucCaitao().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getNoiTamNhap() == null ? 0 : this.getNoiTamNhap().hashCode());
		result = 37 * result + (getNgayTamNhap() == null ? 0 : this.getNgayTamNhap().hashCode());
		result = 37 * result + (getNoiTaiXuat() == null ? 0 : this.getNoiTaiXuat().hashCode());
		result = 37 * result + (getNgayTaiXuat() == null ? 0 : this.getNgayTaiXuat().hashCode());
		result = 37 * result + (getDuocphepDitu() == null ? 0 : this.getDuocphepDitu().hashCode());
		result = 37 * result + (getNgayDi() == null ? 0 : this.getNgayDi().hashCode());
		result = 37 * result + (getDuocphepDiden() == null ? 0 : this.getDuocphepDiden().hashCode());
		result = 37 * result + (getNgayDen() == null ? 0 : this.getNgayDen().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getDaTaiXuat() == null ? 0 : this.getDaTaiXuat().hashCode());
		result = 37 * result + (getCapPheDuyet() == null ? 0 : this.getCapPheDuyet().hashCode());
		result = 37 * result + (getNgayPheDuyet() == null ? 0 : this.getNgayPheDuyet().hashCode());
		result = 37 * result + (getMucDichSuDung() == null ? 0 : this.getMucDichSuDung().hashCode());
		result = 37 * result + (getNoiDungPheDuyet() == null ? 0 : this.getNoiDungPheDuyet().hashCode());
		result = 37 * result + (getKhuKtdbId() == null ? 0 : this.getKhuKtdbId().hashCode());
		result = 37 * result + (getDauBienQuocGia() == null ? 0 : this.getDauBienQuocGia().hashCode());
		result = 37 * result + (getMotoBienSoid() == null ? 0 : this.getMotoBienSoid().hashCode());
		result = 37 * result + (getLanhDaoDuyet() == null ? 0 : this.getLanhDaoDuyet().hashCode());
		result = 37 * result + (getDoiTruongDuyet() == null ? 0 : this.getDoiTruongDuyet().hashCode());
		result = 37 * result + (getKhoa() == null ? 0 : this.getKhoa().hashCode());
		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (getPhamViHoatDong() == null ? 0 : this.getPhamViHoatDong().hashCode());
		result = 37 * result + (getBienSoNuocNgoai() == null ? 0 : this.getBienSoNuocNgoai().hashCode());
		result = 37 * result + (getLoaiDangKyTam() == null ? 0 : this.getLoaiDangKyTam().hashCode());
		result = 37 * result + (getCoQuanCapPhep() == null ? 0 : this.getCoQuanCapPhep().hashCode());
		result = 37 * result + (getNgayCapPhep() == null ? 0 : this.getNgayCapPhep().hashCode());
		result = 37 * result + (getLanhDaoId() == null ? 0 : this.getLanhDaoId().hashCode());
		result = 37 * result + (getDoiTruongId() == null ? 0 : this.getDoiTruongId().hashCode());
		result = 37 * result + (getLyDoThuHoi() == null ? 0 : this.getLyDoThuHoi().hashCode());
		result = 37 * result + (getSoPhuHieuKs() == null ? 0 : this.getSoPhuHieuKs().hashCode());
		result = 37 * result + (getNgayCapPhuHieu() == null ? 0 : this.getNgayCapPhuHieu().hashCode());
		result = 37 * result + (getPhuHieuHlTuNgay() == null ? 0 : this.getPhuHieuHlTuNgay().hashCode());
		result = 37 * result + (getPhuHieuHlDenNgay() == null ? 0 : this.getPhuHieuHlDenNgay().hashCode());
		result = 37 * result + (getDonViChuyenDen() == null ? 0 : this.getDonViChuyenDen().hashCode());
		result = 37 * result + (getLaKhuKtdb() == null ? 0 : this.getLaKhuKtdb().hashCode());
		result = 37 * result + (getSoLanDoiCap() == null ? 0 : this.getSoLanDoiCap().hashCode());
		result = 37 * result + (getDuLieuCu() == null ? 0 : this.getDuLieuCu().hashCode());
		result = 37 * result + (getMaGiaoDich() == null ? 0 : this.getMaGiaoDich().hashCode());
		result = 37 * result + (getMatBien() == null ? 0 : this.getMatBien().hashCode());
		result = 37 * result + (getMatDangKy() == null ? 0 : this.getMatDangKy().hashCode());
		result = 37 * result + (getBiensoTam() == null ? 0 : this.getBiensoTam().hashCode());
		result = 37 * result + (getCanCu() == null ? 0 : this.getCanCu().hashCode());
		result = 37 * result + (getBienHeThongCu() == null ? 0 : this.getBienHeThongCu().hashCode());
		result = 37 * result + (getDkMoi() == null ? 0 : this.getDkMoi().hashCode());
		result = 37 * result + (getNgayCaiTao() == null ? 0 : this.getNgayCaiTao().hashCode());
		result = 37 * result + (getNgayThuHoi() == null ? 0 : this.getNgayThuHoi().hashCode());
		result = 37 * result + (getNgayDiChuyen() == null ? 0 : this.getNgayDiChuyen().hashCode());
		result = 37 * result + (getBienSoTrunc() == null ? 0 : this.getBienSoTrunc().hashCode());
		result = 37 * result + (getCoThayDoi() == null ? 0 : this.getCoThayDoi().hashCode());
		result = 37 * result + (getDangkyTam() == null ? 0 : this.getDangkyTam().hashCode());
		result = 37 * result + (getDiemDkId() == null ? 0 : this.getDiemDkId().hashCode());
		result = 37 * result + (getDonViCsgtId() == null ? 0 : this.getDonViCsgtId().hashCode());
		result = 37 * result + (getLoaiStnt() == null ? 0 : this.getLoaiStnt().hashCode());
		result = 37 * result + (getLyDoTraBien() == null ? 0 : this.getLyDoTraBien().hashCode());
		result = 37 * result + (getNgayThayDoi() == null ? 0 : this.getNgayThayDoi().hashCode());
		result = 37 * result + (getNgayTuDongHoanThanh() == null ? 0 : this.getNgayTuDongHoanThanh().hashCode());
		result = 37 * result + (getNhapDuLieuCu() == null ? 0 : this.getNhapDuLieuCu().hashCode());
		result = 37 * result + (getSeriSo() == null ? 0 : this.getSeriSo().hashCode());
		result = 37 * result + (getMaNopThueTruocBa() == null ? 0 : this.getMaNopThueTruocBa().hashCode());
		return result;
	}

}
