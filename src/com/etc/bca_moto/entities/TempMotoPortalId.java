package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TempMotoPortalId
 */
@Embeddable
public class TempMotoPortalId implements java.io.Serializable {

	private long id;
	private String ten;
	private Long quocGiaId;
	private Long diadanhHanhchinhId;
	private String diaChi;
	private String soDienThoai;
	private Long motoMaLoaiXeId;
	private Long motoNhanhieuLoaixeId;
	private String soLoai;
	private String soMay;
	private String soKhung;
	private Long phanloaiQuanlyId;
	private String loaiGiayto;
	private String idSo;
	private Date idNgayCap;
	private String idNoiCap;
	private String maSoThue;
	private String taiKhoan;
	private String nganHang;
	private String mauXe;
	private Long mauSon;
	private String loaiNhienLieu;
	private String dungTich;
	private Long songuoiDuocphepcho;
	private Long nuocSx;
	private Long namSx;
	private Date nienHanSuDung;
	private String nguonGoc;
	private String soChungTu;
	private Date ngaycapChungtu;
	private String coquanCapchungtu;
	private String ghiChu;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private String trangThai;
	private String maHoso;
	private String maNhom;
	private String trangThaiDangKy;
	private Date ngayDk;
	private Short soxeDangky;
	private String thoigianDk;
	private Long diemDkId;
	private String bienSo;
	private String oldTen;
	private Long oldQuocGiaId;
	private Long oldDiadanhHanhchinhId;
	private String oldDiaChi;
	private String oldSoDienThoai;
	private Long oldPhanloaiQuanlyId;
	private String oldLoaiGiayto;
	private String oldIdSo;
	private Date oldIdNgayCap;
	private String oldIdNoiCap;
	private String loaiSangten;
	private String lydoThuhoiDoicap;
	private String bienSoTrunc;
	private String hinhthucCaitao;
	private String canhanTochuc;
	private String mauBien;
	private String oldCanhanTochuc;
	private String lyDoKhac;
	private String giaytoKemtheo;
	private String coquanGuiDenghithuhoi;
	private String motoNhanhieukhac;
	private String mauSonKhac;
	private String lyDoThuHoi;
	private String motoLoaixekhac;
	private String maNopThueTruocBa;
	private String cmndThue;
	private String noiDungCaiTaoKhac;
	private String lyDoStdc;
	private Date ngayDen;
	private Date ngayDi;
	private String diemDi;
	private String diemDen;

	public TempMotoPortalId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TEN", columnDefinition = "VARCHAR2")
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "QUOC_GIA_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getQuocGiaId() {
		return this.quocGiaId;
	}

	public void setQuocGiaId(Long quocGiaId) {
		this.quocGiaId = quocGiaId;
	}

	@Column(name = "DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getDiadanhHanhchinhId() {
		return this.diadanhHanhchinhId;
	}

	public void setDiadanhHanhchinhId(Long diadanhHanhchinhId) {
		this.diadanhHanhchinhId = diadanhHanhchinhId;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 500)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Column(name = "MOTO_MA_LOAI_XE_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoMaLoaiXeId() {
		return this.motoMaLoaiXeId;
	}

	public void setMotoMaLoaiXeId(Long motoMaLoaiXeId) {
		this.motoMaLoaiXeId = motoMaLoaiXeId;
	}

	@Column(name = "MOTO_NHANHIEU_LOAIXE_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoNhanhieuLoaixeId() {
		return this.motoNhanhieuLoaixeId;
	}

	public void setMotoNhanhieuLoaixeId(Long motoNhanhieuLoaixeId) {
		this.motoNhanhieuLoaixeId = motoNhanhieuLoaixeId;
	}

	@Column(name = "SO_LOAI", columnDefinition = "VARCHAR2")
	public String getSoLoai() {
		return this.soLoai;
	}

	public void setSoLoai(String soLoai) {
		this.soLoai = soLoai;
	}

	@Column(name = "SO_MAY", columnDefinition = "VARCHAR2")
	public String getSoMay() {
		return this.soMay;
	}

	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

	@Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2")
	public String getSoKhung() {
		return this.soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	@Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getPhanloaiQuanlyId() {
		return this.phanloaiQuanlyId;
	}

	public void setPhanloaiQuanlyId(Long phanloaiQuanlyId) {
		this.phanloaiQuanlyId = phanloaiQuanlyId;
	}

	@Column(name = "LOAI_GIAYTO", columnDefinition = "VARCHAR2")
	public String getLoaiGiayto() {
		return this.loaiGiayto;
	}

	public void setLoaiGiayto(String loaiGiayto) {
		this.loaiGiayto = loaiGiayto;
	}

	@Column(name = "ID_SO", columnDefinition = "VARCHAR2")
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

	@Column(name = "ID_NOI_CAP", columnDefinition = "VARCHAR2")
	public String getIdNoiCap() {
		return this.idNoiCap;
	}

	public void setIdNoiCap(String idNoiCap) {
		this.idNoiCap = idNoiCap;
	}

	@Column(name = "MA_SO_THUE", columnDefinition = "VARCHAR2")
	public String getMaSoThue() {
		return this.maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	@Column(name = "TAI_KHOAN", columnDefinition = "VARCHAR2")
	public String getTaiKhoan() {
		return this.taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@Column(name = "NGAN_HANG", columnDefinition = "VARCHAR2")
	public String getNganHang() {
		return this.nganHang;
	}

	public void setNganHang(String nganHang) {
		this.nganHang = nganHang;
	}

	@Column(name = "MAU_XE", columnDefinition = "VARCHAR2")
	public String getMauXe() {
		return this.mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	@Column(name = "MAU_SON", columnDefinition = "NUMBER", scale = 0)
	public Long getMauSon() {
		return this.mauSon;
	}

	public void setMauSon(Long mauSon) {
		this.mauSon = mauSon;
	}

	@Column(name = "LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2")
	public String getLoaiNhienLieu() {
		return this.loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Column(name = "DUNG_TICH", columnDefinition = "VARCHAR2")
	public String getDungTich() {
		return this.dungTich;
	}

	public void setDungTich(String dungTich) {
		this.dungTich = dungTich;
	}

	@Column(name = "SONGUOI_DUOCPHEPCHO", columnDefinition = "NUMBER", precision = 6, scale = 0)
	public Long getSonguoiDuocphepcho() {
		return this.songuoiDuocphepcho;
	}

	public void setSonguoiDuocphepcho(Long songuoiDuocphepcho) {
		this.songuoiDuocphepcho = songuoiDuocphepcho;
	}

	@Column(name = "NUOC_SX", columnDefinition = "NUMBER", scale = 0)
	public Long getNuocSx() {
		return this.nuocSx;
	}

	public void setNuocSx(Long nuocSx) {
		this.nuocSx = nuocSx;
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

	@Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 30)
	public String getNguonGoc() {
		return this.nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	@Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 14)
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

	@Column(name = "COQUAN_CAPCHUNGTU", columnDefinition = "VARCHAR2", length = 50)
	public String getCoquanCapchungtu() {
		return this.coquanCapchungtu;
	}

	public void setCoquanCapchungtu(String coquanCapchungtu) {
		this.coquanCapchungtu = coquanCapchungtu;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1000)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
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

	@Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 30)
	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "MA_HOSO", columnDefinition = "VARCHAR2")
	public String getMaHoso() {
		return this.maHoso;
	}

	public void setMaHoso(String maHoso) {
		this.maHoso = maHoso;
	}

	@Column(name = "MA_NHOM", columnDefinition = "VARCHAR2")
	public String getMaNhom() {
		return this.maNhom;
	}

	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}

	@Column(name = "TRANG_THAI_DANG_KY", columnDefinition = "NVARCHAR2", length = 40)
	public String getTrangThaiDangKy() {
		return this.trangThaiDangKy;
	}

	public void setTrangThaiDangKy(String trangThaiDangKy) {
		this.trangThaiDangKy = trangThaiDangKy;
	}

	@Column(name = "NGAY_DK", columnDefinition = "DATE", length = 7)
	public Date getNgayDk() {
		return this.ngayDk;
	}

	public void setNgayDk(Date ngayDk) {
		this.ngayDk = ngayDk;
	}

	@Column(name = "SOXE_DANGKY", columnDefinition = "NUMBER", precision = 3, scale = 0)
	public Short getSoxeDangky() {
		return this.soxeDangky;
	}

	public void setSoxeDangky(Short soxeDangky) {
		this.soxeDangky = soxeDangky;
	}

	@Column(name = "THOIGIAN_DK", columnDefinition = "VARCHAR2", length = 30)
	public String getThoigianDk() {
		return this.thoigianDk;
	}

	public void setThoigianDk(String thoigianDk) {
		this.thoigianDk = thoigianDk;
	}

	@Column(name = "DIEM_DK_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getDiemDkId() {
		return this.diemDkId;
	}

	public void setDiemDkId(Long diemDkId) {
		this.diemDkId = diemDkId;
	}

	@Column(name = "BIEN_SO", columnDefinition = "VARCHAR2", length = 30)
	public String getBienSo() {
		return this.bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	@Column(name = "OLD_TEN", columnDefinition = "VARCHAR2")
	public String getOldTen() {
		return this.oldTen;
	}

	public void setOldTen(String oldTen) {
		this.oldTen = oldTen;
	}

	@Column(name = "OLD_QUOC_GIA_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getOldQuocGiaId() {
		return this.oldQuocGiaId;
	}

	public void setOldQuocGiaId(Long oldQuocGiaId) {
		this.oldQuocGiaId = oldQuocGiaId;
	}

	@Column(name = "OLD_DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getOldDiadanhHanhchinhId() {
		return this.oldDiadanhHanhchinhId;
	}

	public void setOldDiadanhHanhchinhId(Long oldDiadanhHanhchinhId) {
		this.oldDiadanhHanhchinhId = oldDiadanhHanhchinhId;
	}

	@Column(name = "OLD_DIA_CHI", columnDefinition = "VARCHAR2", length = 500)
	public String getOldDiaChi() {
		return this.oldDiaChi;
	}

	public void setOldDiaChi(String oldDiaChi) {
		this.oldDiaChi = oldDiaChi;
	}

	@Column(name = "OLD_SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getOldSoDienThoai() {
		return this.oldSoDienThoai;
	}

	public void setOldSoDienThoai(String oldSoDienThoai) {
		this.oldSoDienThoai = oldSoDienThoai;
	}

	@Column(name = "OLD_PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getOldPhanloaiQuanlyId() {
		return this.oldPhanloaiQuanlyId;
	}

	public void setOldPhanloaiQuanlyId(Long oldPhanloaiQuanlyId) {
		this.oldPhanloaiQuanlyId = oldPhanloaiQuanlyId;
	}

	@Column(name = "OLD_LOAI_GIAYTO", columnDefinition = "VARCHAR2")
	public String getOldLoaiGiayto() {
		return this.oldLoaiGiayto;
	}

	public void setOldLoaiGiayto(String oldLoaiGiayto) {
		this.oldLoaiGiayto = oldLoaiGiayto;
	}

	@Column(name = "OLD_ID_SO", columnDefinition = "VARCHAR2")
	public String getOldIdSo() {
		return this.oldIdSo;
	}

	public void setOldIdSo(String oldIdSo) {
		this.oldIdSo = oldIdSo;
	}

	@Column(name = "OLD_ID_NGAY_CAP", columnDefinition = "DATE", length = 7)
	public Date getOldIdNgayCap() {
		return this.oldIdNgayCap;
	}

	public void setOldIdNgayCap(Date oldIdNgayCap) {
		this.oldIdNgayCap = oldIdNgayCap;
	}

	@Column(name = "OLD_ID_NOI_CAP", columnDefinition = "VARCHAR2")
	public String getOldIdNoiCap() {
		return this.oldIdNoiCap;
	}

	public void setOldIdNoiCap(String oldIdNoiCap) {
		this.oldIdNoiCap = oldIdNoiCap;
	}

	@Column(name = "LOAI_SANGTEN", columnDefinition = "VARCHAR2", length = 20)
	public String getLoaiSangten() {
		return this.loaiSangten;
	}

	public void setLoaiSangten(String loaiSangten) {
		this.loaiSangten = loaiSangten;
	}

	@Column(name = "LYDO_THUHOI_DOICAP", columnDefinition = "VARCHAR2", length = 20)
	public String getLydoThuhoiDoicap() {
		return this.lydoThuhoiDoicap;
	}

	public void setLydoThuhoiDoicap(String lydoThuhoiDoicap) {
		this.lydoThuhoiDoicap = lydoThuhoiDoicap;
	}

	@Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 30)
	public String getBienSoTrunc() {
		return this.bienSoTrunc;
	}

	public void setBienSoTrunc(String bienSoTrunc) {
		this.bienSoTrunc = bienSoTrunc;
	}

	@Column(name = "HINHTHUC_CAITAO", columnDefinition = "VARCHAR2", length = 20)
	public String getHinhthucCaitao() {
		return this.hinhthucCaitao;
	}

	public void setHinhthucCaitao(String hinhthucCaitao) {
		this.hinhthucCaitao = hinhthucCaitao;
	}

	@Column(name = "CANHAN_TOCHUC", columnDefinition = "VARCHAR2", length = 10)
	public String getCanhanTochuc() {
		return this.canhanTochuc;
	}

	public void setCanhanTochuc(String canhanTochuc) {
		this.canhanTochuc = canhanTochuc;
	}

	@Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 10)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "OLD_CANHAN_TOCHUC", columnDefinition = "VARCHAR2", length = 20)
	public String getOldCanhanTochuc() {
		return this.oldCanhanTochuc;
	}

	public void setOldCanhanTochuc(String oldCanhanTochuc) {
		this.oldCanhanTochuc = oldCanhanTochuc;
	}

	@Column(name = "LY_DO_KHAC", columnDefinition = "VARCHAR2", length = 200)
	public String getLyDoKhac() {
		return this.lyDoKhac;
	}

	public void setLyDoKhac(String lyDoKhac) {
		this.lyDoKhac = lyDoKhac;
	}

	@Column(name = "GIAYTO_KEMTHEO", columnDefinition = "VARCHAR2", length = 500)
	public String getGiaytoKemtheo() {
		return this.giaytoKemtheo;
	}

	public void setGiaytoKemtheo(String giaytoKemtheo) {
		this.giaytoKemtheo = giaytoKemtheo;
	}

	@Column(name = "COQUAN_GUI_DENGHITHUHOI", columnDefinition = "VARCHAR2", length = 500)
	public String getCoquanGuiDenghithuhoi() {
		return this.coquanGuiDenghithuhoi;
	}

	public void setCoquanGuiDenghithuhoi(String coquanGuiDenghithuhoi) {
		this.coquanGuiDenghithuhoi = coquanGuiDenghithuhoi;
	}

	@Column(name = "MOTO_NHANHIEUKHAC", columnDefinition = "VARCHAR2", length = 200)
	public String getMotoNhanhieukhac() {
		return this.motoNhanhieukhac;
	}

	public void setMotoNhanhieukhac(String motoNhanhieukhac) {
		this.motoNhanhieukhac = motoNhanhieukhac;
	}

	@Column(name = "MAU_SON_KHAC", columnDefinition = "VARCHAR2", length = 200)
	public String getMauSonKhac() {
		return this.mauSonKhac;
	}

	public void setMauSonKhac(String mauSonKhac) {
		this.mauSonKhac = mauSonKhac;
	}

	@Column(name = "LY_DO_THU_HOI", columnDefinition = "NVARCHAR2", length = 40)
	public String getLyDoThuHoi() {
		return this.lyDoThuHoi;
	}

	public void setLyDoThuHoi(String lyDoThuHoi) {
		this.lyDoThuHoi = lyDoThuHoi;
	}

	@Column(name = "MOTO_LOAIXEKHAC", columnDefinition = "VARCHAR2", length = 200)
	public String getMotoLoaixekhac() {
		return this.motoLoaixekhac;
	}

	public void setMotoLoaixekhac(String motoLoaixekhac) {
		this.motoLoaixekhac = motoLoaixekhac;
	}

	@Column(name = "MA_NOP_THUE_TRUOC_BA", columnDefinition = "VARCHAR2", length = 50)
	public String getMaNopThueTruocBa() {
		return this.maNopThueTruocBa;
	}

	public void setMaNopThueTruocBa(String maNopThueTruocBa) {
		this.maNopThueTruocBa = maNopThueTruocBa;
	}

	@Column(name = "CMND_THUE", columnDefinition = "VARCHAR2", length = 20)
	public String getCmndThue() {
		return this.cmndThue;
	}

	public void setCmndThue(String cmndThue) {
		this.cmndThue = cmndThue;
	}

	@Column(name = "NOI_DUNG_CAI_TAO_KHAC", columnDefinition = "VARCHAR2", length = 500)
	public String getNoiDungCaiTaoKhac() {
		return this.noiDungCaiTaoKhac;
	}

	public void setNoiDungCaiTaoKhac(String noiDungCaiTaoKhac) {
		this.noiDungCaiTaoKhac = noiDungCaiTaoKhac;
	}

	@Column(name = "LY_DO_STDC", columnDefinition = "VARCHAR2", length = 50)
	public String getLyDoStdc() {
		return this.lyDoStdc;
	}

	public void setLyDoStdc(String lyDoStdc) {
		this.lyDoStdc = lyDoStdc;
	}

	@Column(name = "NGAY_DEN", columnDefinition = "DATE", length = 7)
	public Date getNgayDen() {
		return this.ngayDen;
	}

	public void setNgayDen(Date ngayDen) {
		this.ngayDen = ngayDen;
	}

	@Column(name = "NGAY_DI", columnDefinition = "DATE", length = 7)
	public Date getNgayDi() {
		return this.ngayDi;
	}

	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}

	@Column(name = "DIEM_DI", columnDefinition = "VARCHAR2", length = 200)
	public String getDiemDi() {
		return this.diemDi;
	}

	public void setDiemDi(String diemDi) {
		this.diemDi = diemDi;
	}

	@Column(name = "DIEM_DEN", columnDefinition = "VARCHAR2", length = 200)
	public String getDiemDen() {
		return this.diemDen;
	}

	public void setDiemDen(String diemDen) {
		this.diemDen = diemDen;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TempMotoPortalId))
			return false;
		TempMotoPortalId castOther = (TempMotoPortalId) other;

		return (this.getId() == castOther.getId()) && ((this.getTen() == castOther.getTen())
				|| (this.getTen() != null && castOther.getTen() != null && this.getTen().equals(castOther.getTen())))
				&& ((this.getQuocGiaId() == castOther.getQuocGiaId()) || (this.getQuocGiaId() != null
						&& castOther.getQuocGiaId() != null && this.getQuocGiaId().equals(castOther.getQuocGiaId())))
				&& ((this.getDiadanhHanhchinhId() == castOther.getDiadanhHanhchinhId())
						|| (this.getDiadanhHanhchinhId() != null && castOther.getDiadanhHanhchinhId() != null
								&& this.getDiadanhHanhchinhId().equals(castOther.getDiadanhHanhchinhId())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getSoDienThoai() == castOther.getSoDienThoai())
						|| (this.getSoDienThoai() != null && castOther.getSoDienThoai() != null
								&& this.getSoDienThoai().equals(castOther.getSoDienThoai())))
				&& ((this.getMotoMaLoaiXeId() == castOther.getMotoMaLoaiXeId())
						|| (this.getMotoMaLoaiXeId() != null && castOther.getMotoMaLoaiXeId() != null
								&& this.getMotoMaLoaiXeId().equals(castOther.getMotoMaLoaiXeId())))
				&& ((this.getMotoNhanhieuLoaixeId() == castOther.getMotoNhanhieuLoaixeId())
						|| (this.getMotoNhanhieuLoaixeId() != null && castOther.getMotoNhanhieuLoaixeId() != null
								&& this.getMotoNhanhieuLoaixeId().equals(castOther.getMotoNhanhieuLoaixeId())))
				&& ((this.getSoLoai() == castOther.getSoLoai()) || (this.getSoLoai() != null
						&& castOther.getSoLoai() != null && this.getSoLoai().equals(castOther.getSoLoai())))
				&& ((this.getSoMay() == castOther.getSoMay()) || (this.getSoMay() != null
						&& castOther.getSoMay() != null && this.getSoMay().equals(castOther.getSoMay())))
				&& ((this.getSoKhung() == castOther.getSoKhung()) || (this.getSoKhung() != null
						&& castOther.getSoKhung() != null && this.getSoKhung().equals(castOther.getSoKhung())))
				&& ((this.getPhanloaiQuanlyId() == castOther.getPhanloaiQuanlyId())
						|| (this.getPhanloaiQuanlyId() != null && castOther.getPhanloaiQuanlyId() != null
								&& this.getPhanloaiQuanlyId().equals(castOther.getPhanloaiQuanlyId())))
				&& ((this.getLoaiGiayto() == castOther.getLoaiGiayto()) || (this.getLoaiGiayto() != null
						&& castOther.getLoaiGiayto() != null && this.getLoaiGiayto().equals(castOther.getLoaiGiayto())))
				&& ((this.getIdSo() == castOther.getIdSo()) || (this.getIdSo() != null && castOther.getIdSo() != null
						&& this.getIdSo().equals(castOther.getIdSo())))
				&& ((this.getIdNgayCap() == castOther.getIdNgayCap()) || (this.getIdNgayCap() != null
						&& castOther.getIdNgayCap() != null && this.getIdNgayCap().equals(castOther.getIdNgayCap())))
				&& ((this.getIdNoiCap() == castOther.getIdNoiCap()) || (this.getIdNoiCap() != null
						&& castOther.getIdNoiCap() != null && this.getIdNoiCap().equals(castOther.getIdNoiCap())))
				&& ((this.getMaSoThue() == castOther.getMaSoThue()) || (this.getMaSoThue() != null
						&& castOther.getMaSoThue() != null && this.getMaSoThue().equals(castOther.getMaSoThue())))
				&& ((this.getTaiKhoan() == castOther.getTaiKhoan()) || (this.getTaiKhoan() != null
						&& castOther.getTaiKhoan() != null && this.getTaiKhoan().equals(castOther.getTaiKhoan())))
				&& ((this.getNganHang() == castOther.getNganHang()) || (this.getNganHang() != null
						&& castOther.getNganHang() != null && this.getNganHang().equals(castOther.getNganHang())))
				&& ((this.getMauXe() == castOther.getMauXe()) || (this.getMauXe() != null
						&& castOther.getMauXe() != null && this.getMauXe().equals(castOther.getMauXe())))
				&& ((this.getMauSon() == castOther.getMauSon()) || (this.getMauSon() != null
						&& castOther.getMauSon() != null && this.getMauSon().equals(castOther.getMauSon())))
				&& ((this.getLoaiNhienLieu() == castOther.getLoaiNhienLieu())
						|| (this.getLoaiNhienLieu() != null && castOther.getLoaiNhienLieu() != null
								&& this.getLoaiNhienLieu().equals(castOther.getLoaiNhienLieu())))
				&& ((this.getDungTich() == castOther.getDungTich()) || (this.getDungTich() != null
						&& castOther.getDungTich() != null && this.getDungTich().equals(castOther.getDungTich())))
				&& ((this.getSonguoiDuocphepcho() == castOther.getSonguoiDuocphepcho())
						|| (this.getSonguoiDuocphepcho() != null && castOther.getSonguoiDuocphepcho() != null
								&& this.getSonguoiDuocphepcho().equals(castOther.getSonguoiDuocphepcho())))
				&& ((this.getNuocSx() == castOther.getNuocSx()) || (this.getNuocSx() != null
						&& castOther.getNuocSx() != null && this.getNuocSx().equals(castOther.getNuocSx())))
				&& ((this.getNamSx() == castOther.getNamSx()) || (this.getNamSx() != null
						&& castOther.getNamSx() != null && this.getNamSx().equals(castOther.getNamSx())))
				&& ((this.getNienHanSuDung() == castOther.getNienHanSuDung())
						|| (this.getNienHanSuDung() != null && castOther.getNienHanSuDung() != null
								&& this.getNienHanSuDung().equals(castOther.getNienHanSuDung())))
				&& ((this.getNguonGoc() == castOther.getNguonGoc()) || (this.getNguonGoc() != null
						&& castOther.getNguonGoc() != null && this.getNguonGoc().equals(castOther.getNguonGoc())))
				&& ((this.getSoChungTu() == castOther.getSoChungTu()) || (this.getSoChungTu() != null
						&& castOther.getSoChungTu() != null && this.getSoChungTu().equals(castOther.getSoChungTu())))
				&& ((this.getNgaycapChungtu() == castOther.getNgaycapChungtu())
						|| (this.getNgaycapChungtu() != null && castOther.getNgaycapChungtu() != null
								&& this.getNgaycapChungtu().equals(castOther.getNgaycapChungtu())))
				&& ((this.getCoquanCapchungtu() == castOther.getCoquanCapchungtu())
						|| (this.getCoquanCapchungtu() != null && castOther.getCoquanCapchungtu() != null
								&& this.getCoquanCapchungtu().equals(castOther.getCoquanCapchungtu())))
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
				&& ((this.getMaHoso() == castOther.getMaHoso()) || (this.getMaHoso() != null
						&& castOther.getMaHoso() != null && this.getMaHoso().equals(castOther.getMaHoso())))
				&& ((this.getMaNhom() == castOther.getMaNhom()) || (this.getMaNhom() != null
						&& castOther.getMaNhom() != null && this.getMaNhom().equals(castOther.getMaNhom())))
				&& ((this.getTrangThaiDangKy() == castOther.getTrangThaiDangKy())
						|| (this.getTrangThaiDangKy() != null && castOther.getTrangThaiDangKy() != null
								&& this.getTrangThaiDangKy().equals(castOther.getTrangThaiDangKy())))
				&& ((this.getNgayDk() == castOther.getNgayDk()) || (this.getNgayDk() != null
						&& castOther.getNgayDk() != null && this.getNgayDk().equals(castOther.getNgayDk())))
				&& ((this.getSoxeDangky() == castOther.getSoxeDangky()) || (this.getSoxeDangky() != null
						&& castOther.getSoxeDangky() != null && this.getSoxeDangky().equals(castOther.getSoxeDangky())))
				&& ((this.getThoigianDk() == castOther.getThoigianDk()) || (this.getThoigianDk() != null
						&& castOther.getThoigianDk() != null && this.getThoigianDk().equals(castOther.getThoigianDk())))
				&& ((this.getDiemDkId() == castOther.getDiemDkId()) || (this.getDiemDkId() != null
						&& castOther.getDiemDkId() != null && this.getDiemDkId().equals(castOther.getDiemDkId())))
				&& ((this.getBienSo() == castOther.getBienSo()) || (this.getBienSo() != null
						&& castOther.getBienSo() != null && this.getBienSo().equals(castOther.getBienSo())))
				&& ((this.getOldTen() == castOther.getOldTen()) || (this.getOldTen() != null
						&& castOther.getOldTen() != null && this.getOldTen().equals(castOther.getOldTen())))
				&& ((this.getOldQuocGiaId() == castOther.getOldQuocGiaId())
						|| (this.getOldQuocGiaId() != null && castOther.getOldQuocGiaId() != null
								&& this.getOldQuocGiaId().equals(castOther.getOldQuocGiaId())))
				&& ((this.getOldDiadanhHanhchinhId() == castOther.getOldDiadanhHanhchinhId())
						|| (this.getOldDiadanhHanhchinhId() != null && castOther.getOldDiadanhHanhchinhId() != null
								&& this.getOldDiadanhHanhchinhId().equals(castOther.getOldDiadanhHanhchinhId())))
				&& ((this.getOldDiaChi() == castOther.getOldDiaChi()) || (this.getOldDiaChi() != null
						&& castOther.getOldDiaChi() != null && this.getOldDiaChi().equals(castOther.getOldDiaChi())))
				&& ((this.getOldSoDienThoai() == castOther.getOldSoDienThoai())
						|| (this.getOldSoDienThoai() != null && castOther.getOldSoDienThoai() != null
								&& this.getOldSoDienThoai().equals(castOther.getOldSoDienThoai())))
				&& ((this.getOldPhanloaiQuanlyId() == castOther.getOldPhanloaiQuanlyId())
						|| (this.getOldPhanloaiQuanlyId() != null && castOther.getOldPhanloaiQuanlyId() != null
								&& this.getOldPhanloaiQuanlyId().equals(castOther.getOldPhanloaiQuanlyId())))
				&& ((this.getOldLoaiGiayto() == castOther.getOldLoaiGiayto())
						|| (this.getOldLoaiGiayto() != null && castOther.getOldLoaiGiayto() != null
								&& this.getOldLoaiGiayto().equals(castOther.getOldLoaiGiayto())))
				&& ((this.getOldIdSo() == castOther.getOldIdSo()) || (this.getOldIdSo() != null
						&& castOther.getOldIdSo() != null && this.getOldIdSo().equals(castOther.getOldIdSo())))
				&& ((this.getOldIdNgayCap() == castOther.getOldIdNgayCap())
						|| (this.getOldIdNgayCap() != null && castOther.getOldIdNgayCap() != null
								&& this.getOldIdNgayCap().equals(castOther.getOldIdNgayCap())))
				&& ((this.getOldIdNoiCap() == castOther.getOldIdNoiCap())
						|| (this.getOldIdNoiCap() != null && castOther.getOldIdNoiCap() != null
								&& this.getOldIdNoiCap().equals(castOther.getOldIdNoiCap())))
				&& ((this.getLoaiSangten() == castOther.getLoaiSangten())
						|| (this.getLoaiSangten() != null && castOther.getLoaiSangten() != null
								&& this.getLoaiSangten().equals(castOther.getLoaiSangten())))
				&& ((this.getLydoThuhoiDoicap() == castOther.getLydoThuhoiDoicap())
						|| (this.getLydoThuhoiDoicap() != null && castOther.getLydoThuhoiDoicap() != null
								&& this.getLydoThuhoiDoicap().equals(castOther.getLydoThuhoiDoicap())))
				&& ((this.getBienSoTrunc() == castOther.getBienSoTrunc())
						|| (this.getBienSoTrunc() != null && castOther.getBienSoTrunc() != null
								&& this.getBienSoTrunc().equals(castOther.getBienSoTrunc())))
				&& ((this.getHinhthucCaitao() == castOther.getHinhthucCaitao())
						|| (this.getHinhthucCaitao() != null && castOther.getHinhthucCaitao() != null
								&& this.getHinhthucCaitao().equals(castOther.getHinhthucCaitao())))
				&& ((this.getCanhanTochuc() == castOther.getCanhanTochuc())
						|| (this.getCanhanTochuc() != null && castOther.getCanhanTochuc() != null
								&& this.getCanhanTochuc().equals(castOther.getCanhanTochuc())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& ((this.getOldCanhanTochuc() == castOther.getOldCanhanTochuc())
						|| (this.getOldCanhanTochuc() != null && castOther.getOldCanhanTochuc() != null
								&& this.getOldCanhanTochuc().equals(castOther.getOldCanhanTochuc())))
				&& ((this.getLyDoKhac() == castOther.getLyDoKhac()) || (this.getLyDoKhac() != null
						&& castOther.getLyDoKhac() != null && this.getLyDoKhac().equals(castOther.getLyDoKhac())))
				&& ((this.getGiaytoKemtheo() == castOther.getGiaytoKemtheo())
						|| (this.getGiaytoKemtheo() != null && castOther.getGiaytoKemtheo() != null
								&& this.getGiaytoKemtheo().equals(castOther.getGiaytoKemtheo())))
				&& ((this.getCoquanGuiDenghithuhoi() == castOther.getCoquanGuiDenghithuhoi())
						|| (this.getCoquanGuiDenghithuhoi() != null && castOther.getCoquanGuiDenghithuhoi() != null
								&& this.getCoquanGuiDenghithuhoi().equals(castOther.getCoquanGuiDenghithuhoi())))
				&& ((this.getMotoNhanhieukhac() == castOther.getMotoNhanhieukhac())
						|| (this.getMotoNhanhieukhac() != null && castOther.getMotoNhanhieukhac() != null
								&& this.getMotoNhanhieukhac().equals(castOther.getMotoNhanhieukhac())))
				&& ((this.getMauSonKhac() == castOther.getMauSonKhac()) || (this.getMauSonKhac() != null
						&& castOther.getMauSonKhac() != null && this.getMauSonKhac().equals(castOther.getMauSonKhac())))
				&& ((this.getLyDoThuHoi() == castOther.getLyDoThuHoi()) || (this.getLyDoThuHoi() != null
						&& castOther.getLyDoThuHoi() != null && this.getLyDoThuHoi().equals(castOther.getLyDoThuHoi())))
				&& ((this.getMotoLoaixekhac() == castOther.getMotoLoaixekhac())
						|| (this.getMotoLoaixekhac() != null && castOther.getMotoLoaixekhac() != null
								&& this.getMotoLoaixekhac().equals(castOther.getMotoLoaixekhac())))
				&& ((this.getMaNopThueTruocBa() == castOther.getMaNopThueTruocBa())
						|| (this.getMaNopThueTruocBa() != null && castOther.getMaNopThueTruocBa() != null
								&& this.getMaNopThueTruocBa().equals(castOther.getMaNopThueTruocBa())))
				&& ((this.getCmndThue() == castOther.getCmndThue()) || (this.getCmndThue() != null
						&& castOther.getCmndThue() != null && this.getCmndThue().equals(castOther.getCmndThue())))
				&& ((this.getNoiDungCaiTaoKhac() == castOther.getNoiDungCaiTaoKhac())
						|| (this.getNoiDungCaiTaoKhac() != null && castOther.getNoiDungCaiTaoKhac() != null
								&& this.getNoiDungCaiTaoKhac().equals(castOther.getNoiDungCaiTaoKhac())))
				&& ((this.getLyDoStdc() == castOther.getLyDoStdc()) || (this.getLyDoStdc() != null
						&& castOther.getLyDoStdc() != null && this.getLyDoStdc().equals(castOther.getLyDoStdc())))
				&& ((this.getNgayDen() == castOther.getNgayDen()) || (this.getNgayDen() != null
						&& castOther.getNgayDen() != null && this.getNgayDen().equals(castOther.getNgayDen())))
				&& ((this.getNgayDi() == castOther.getNgayDi()) || (this.getNgayDi() != null
						&& castOther.getNgayDi() != null && this.getNgayDi().equals(castOther.getNgayDi())))
				&& ((this.getDiemDi() == castOther.getDiemDi()) || (this.getDiemDi() != null
						&& castOther.getDiemDi() != null && this.getDiemDi().equals(castOther.getDiemDi())))
				&& ((this.getDiemDen() == castOther.getDiemDen()) || (this.getDiemDen() != null
						&& castOther.getDiemDen() != null && this.getDiemDen().equals(castOther.getDiemDen())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (getQuocGiaId() == null ? 0 : this.getQuocGiaId().hashCode());
		result = 37 * result + (getDiadanhHanhchinhId() == null ? 0 : this.getDiadanhHanhchinhId().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getSoDienThoai() == null ? 0 : this.getSoDienThoai().hashCode());
		result = 37 * result + (getMotoMaLoaiXeId() == null ? 0 : this.getMotoMaLoaiXeId().hashCode());
		result = 37 * result + (getMotoNhanhieuLoaixeId() == null ? 0 : this.getMotoNhanhieuLoaixeId().hashCode());
		result = 37 * result + (getSoLoai() == null ? 0 : this.getSoLoai().hashCode());
		result = 37 * result + (getSoMay() == null ? 0 : this.getSoMay().hashCode());
		result = 37 * result + (getSoKhung() == null ? 0 : this.getSoKhung().hashCode());
		result = 37 * result + (getPhanloaiQuanlyId() == null ? 0 : this.getPhanloaiQuanlyId().hashCode());
		result = 37 * result + (getLoaiGiayto() == null ? 0 : this.getLoaiGiayto().hashCode());
		result = 37 * result + (getIdSo() == null ? 0 : this.getIdSo().hashCode());
		result = 37 * result + (getIdNgayCap() == null ? 0 : this.getIdNgayCap().hashCode());
		result = 37 * result + (getIdNoiCap() == null ? 0 : this.getIdNoiCap().hashCode());
		result = 37 * result + (getMaSoThue() == null ? 0 : this.getMaSoThue().hashCode());
		result = 37 * result + (getTaiKhoan() == null ? 0 : this.getTaiKhoan().hashCode());
		result = 37 * result + (getNganHang() == null ? 0 : this.getNganHang().hashCode());
		result = 37 * result + (getMauXe() == null ? 0 : this.getMauXe().hashCode());
		result = 37 * result + (getMauSon() == null ? 0 : this.getMauSon().hashCode());
		result = 37 * result + (getLoaiNhienLieu() == null ? 0 : this.getLoaiNhienLieu().hashCode());
		result = 37 * result + (getDungTich() == null ? 0 : this.getDungTich().hashCode());
		result = 37 * result + (getSonguoiDuocphepcho() == null ? 0 : this.getSonguoiDuocphepcho().hashCode());
		result = 37 * result + (getNuocSx() == null ? 0 : this.getNuocSx().hashCode());
		result = 37 * result + (getNamSx() == null ? 0 : this.getNamSx().hashCode());
		result = 37 * result + (getNienHanSuDung() == null ? 0 : this.getNienHanSuDung().hashCode());
		result = 37 * result + (getNguonGoc() == null ? 0 : this.getNguonGoc().hashCode());
		result = 37 * result + (getSoChungTu() == null ? 0 : this.getSoChungTu().hashCode());
		result = 37 * result + (getNgaycapChungtu() == null ? 0 : this.getNgaycapChungtu().hashCode());
		result = 37 * result + (getCoquanCapchungtu() == null ? 0 : this.getCoquanCapchungtu().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getMaHoso() == null ? 0 : this.getMaHoso().hashCode());
		result = 37 * result + (getMaNhom() == null ? 0 : this.getMaNhom().hashCode());
		result = 37 * result + (getTrangThaiDangKy() == null ? 0 : this.getTrangThaiDangKy().hashCode());
		result = 37 * result + (getNgayDk() == null ? 0 : this.getNgayDk().hashCode());
		result = 37 * result + (getSoxeDangky() == null ? 0 : this.getSoxeDangky().hashCode());
		result = 37 * result + (getThoigianDk() == null ? 0 : this.getThoigianDk().hashCode());
		result = 37 * result + (getDiemDkId() == null ? 0 : this.getDiemDkId().hashCode());
		result = 37 * result + (getBienSo() == null ? 0 : this.getBienSo().hashCode());
		result = 37 * result + (getOldTen() == null ? 0 : this.getOldTen().hashCode());
		result = 37 * result + (getOldQuocGiaId() == null ? 0 : this.getOldQuocGiaId().hashCode());
		result = 37 * result + (getOldDiadanhHanhchinhId() == null ? 0 : this.getOldDiadanhHanhchinhId().hashCode());
		result = 37 * result + (getOldDiaChi() == null ? 0 : this.getOldDiaChi().hashCode());
		result = 37 * result + (getOldSoDienThoai() == null ? 0 : this.getOldSoDienThoai().hashCode());
		result = 37 * result + (getOldPhanloaiQuanlyId() == null ? 0 : this.getOldPhanloaiQuanlyId().hashCode());
		result = 37 * result + (getOldLoaiGiayto() == null ? 0 : this.getOldLoaiGiayto().hashCode());
		result = 37 * result + (getOldIdSo() == null ? 0 : this.getOldIdSo().hashCode());
		result = 37 * result + (getOldIdNgayCap() == null ? 0 : this.getOldIdNgayCap().hashCode());
		result = 37 * result + (getOldIdNoiCap() == null ? 0 : this.getOldIdNoiCap().hashCode());
		result = 37 * result + (getLoaiSangten() == null ? 0 : this.getLoaiSangten().hashCode());
		result = 37 * result + (getLydoThuhoiDoicap() == null ? 0 : this.getLydoThuhoiDoicap().hashCode());
		result = 37 * result + (getBienSoTrunc() == null ? 0 : this.getBienSoTrunc().hashCode());
		result = 37 * result + (getHinhthucCaitao() == null ? 0 : this.getHinhthucCaitao().hashCode());
		result = 37 * result + (getCanhanTochuc() == null ? 0 : this.getCanhanTochuc().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (getOldCanhanTochuc() == null ? 0 : this.getOldCanhanTochuc().hashCode());
		result = 37 * result + (getLyDoKhac() == null ? 0 : this.getLyDoKhac().hashCode());
		result = 37 * result + (getGiaytoKemtheo() == null ? 0 : this.getGiaytoKemtheo().hashCode());
		result = 37 * result + (getCoquanGuiDenghithuhoi() == null ? 0 : this.getCoquanGuiDenghithuhoi().hashCode());
		result = 37 * result + (getMotoNhanhieukhac() == null ? 0 : this.getMotoNhanhieukhac().hashCode());
		result = 37 * result + (getMauSonKhac() == null ? 0 : this.getMauSonKhac().hashCode());
		result = 37 * result + (getLyDoThuHoi() == null ? 0 : this.getLyDoThuHoi().hashCode());
		result = 37 * result + (getMotoLoaixekhac() == null ? 0 : this.getMotoLoaixekhac().hashCode());
		result = 37 * result + (getMaNopThueTruocBa() == null ? 0 : this.getMaNopThueTruocBa().hashCode());
		result = 37 * result + (getCmndThue() == null ? 0 : this.getCmndThue().hashCode());
		result = 37 * result + (getNoiDungCaiTaoKhac() == null ? 0 : this.getNoiDungCaiTaoKhac().hashCode());
		result = 37 * result + (getLyDoStdc() == null ? 0 : this.getLyDoStdc().hashCode());
		result = 37 * result + (getNgayDen() == null ? 0 : this.getNgayDen().hashCode());
		result = 37 * result + (getNgayDi() == null ? 0 : this.getNgayDi().hashCode());
		result = 37 * result + (getDiemDi() == null ? 0 : this.getDiemDi().hashCode());
		result = 37 * result + (getDiemDen() == null ? 0 : this.getDiemDen().hashCode());
		return result;
	}

}
