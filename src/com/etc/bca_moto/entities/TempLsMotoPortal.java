package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TempLsMotoPortalDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * TempLsMotoPortal
 */
@DAO(daoClass = TempLsMotoPortalDAO.class)
@Caption("{%ten}")
@Entity
@Table(name = "TEMP_LS_MOTO_PORTAL", schema = "BCA_MOTO")
public class TempLsMotoPortal implements java.io.Serializable {

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
	private Date ngayDi;
	private Date ngayDen;
	private String diemDi;
	private String diemDen;

	public TempLsMotoPortal() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("Ten")
	@Column(name = "TEN", columnDefinition = "NVARCHAR2", length = 510)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("QuocGiaId")
	@Column(name = "QUOC_GIA_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getQuocGiaId() {
		return this.quocGiaId;
	}

	public void setQuocGiaId(Long quocGiaId) {
		this.quocGiaId = quocGiaId;
	}

	@Caption("DiadanhHanhchinhId")
	@Column(name = "DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getDiadanhHanhchinhId() {
		return this.diadanhHanhchinhId;
	}

	public void setDiadanhHanhchinhId(Long diadanhHanhchinhId) {
		this.diadanhHanhchinhId = diadanhHanhchinhId;
	}

	@Caption("DiaChi")
	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 500)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Caption("SoDienThoai")
	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Caption("MotoMaLoaiXeId")
	@Column(name = "MOTO_MA_LOAI_XE_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoMaLoaiXeId() {
		return this.motoMaLoaiXeId;
	}

	public void setMotoMaLoaiXeId(Long motoMaLoaiXeId) {
		this.motoMaLoaiXeId = motoMaLoaiXeId;
	}

	@Caption("MotoNhanhieuLoaixeId")
	@Column(name = "MOTO_NHANHIEU_LOAIXE_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoNhanhieuLoaixeId() {
		return this.motoNhanhieuLoaixeId;
	}

	public void setMotoNhanhieuLoaixeId(Long motoNhanhieuLoaixeId) {
		this.motoNhanhieuLoaixeId = motoNhanhieuLoaixeId;
	}

	@Caption("SoLoai")
	@Column(name = "SO_LOAI", columnDefinition = "VARCHAR2")
	public String getSoLoai() {
		return this.soLoai;
	}

	public void setSoLoai(String soLoai) {
		this.soLoai = soLoai;
	}

	@Caption("SoMay")
	@Column(name = "SO_MAY", columnDefinition = "VARCHAR2")
	public String getSoMay() {
		return this.soMay;
	}

	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

	@Caption("SoKhung")
	@Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2")
	public String getSoKhung() {
		return this.soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	@Caption("PhanloaiQuanlyId")
	@Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getPhanloaiQuanlyId() {
		return this.phanloaiQuanlyId;
	}

	public void setPhanloaiQuanlyId(Long phanloaiQuanlyId) {
		this.phanloaiQuanlyId = phanloaiQuanlyId;
	}

	@Caption("LoaiGiayto")
	@Column(name = "LOAI_GIAYTO", columnDefinition = "VARCHAR2")
	public String getLoaiGiayto() {
		return this.loaiGiayto;
	}

	public void setLoaiGiayto(String loaiGiayto) {
		this.loaiGiayto = loaiGiayto;
	}

	@Caption("IdSo")
	@Column(name = "ID_SO", columnDefinition = "VARCHAR2")
	public String getIdSo() {
		return this.idSo;
	}

	public void setIdSo(String idSo) {
		this.idSo = idSo;
	}

	@Caption("IdNgayCap")
	@Temporal(TemporalType.DATE)
	@Column(name = "ID_NGAY_CAP", columnDefinition = "DATE", length = 7)
	public Date getIdNgayCap() {
		return this.idNgayCap;
	}

	public void setIdNgayCap(Date idNgayCap) {
		this.idNgayCap = idNgayCap;
	}

	@Caption("IdNoiCap")
	@Column(name = "ID_NOI_CAP", columnDefinition = "VARCHAR2")
	public String getIdNoiCap() {
		return this.idNoiCap;
	}

	public void setIdNoiCap(String idNoiCap) {
		this.idNoiCap = idNoiCap;
	}

	@Caption("MaSoThue")
	@Column(name = "MA_SO_THUE", columnDefinition = "VARCHAR2")
	public String getMaSoThue() {
		return this.maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	@Caption("TaiKhoan")
	@Column(name = "TAI_KHOAN", columnDefinition = "VARCHAR2")
	public String getTaiKhoan() {
		return this.taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@Caption("NganHang")
	@Column(name = "NGAN_HANG", columnDefinition = "VARCHAR2")
	public String getNganHang() {
		return this.nganHang;
	}

	public void setNganHang(String nganHang) {
		this.nganHang = nganHang;
	}

	@Caption("MauXe")
	@Column(name = "MAU_XE", columnDefinition = "VARCHAR2")
	public String getMauXe() {
		return this.mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	@Caption("MauSon")
	@Column(name = "MAU_SON", columnDefinition = "NUMBER", scale = 0)
	public Long getMauSon() {
		return this.mauSon;
	}

	public void setMauSon(Long mauSon) {
		this.mauSon = mauSon;
	}

	@Caption("LoaiNhienLieu")
	@Column(name = "LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2")
	public String getLoaiNhienLieu() {
		return this.loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Caption("DungTich")
	@Column(name = "DUNG_TICH", columnDefinition = "VARCHAR2")
	public String getDungTich() {
		return this.dungTich;
	}

	public void setDungTich(String dungTich) {
		this.dungTich = dungTich;
	}

	@Caption("SonguoiDuocphepcho")
	@Column(name = "SONGUOI_DUOCPHEPCHO", columnDefinition = "NUMBER", precision = 6, scale = 0)
	public Long getSonguoiDuocphepcho() {
		return this.songuoiDuocphepcho;
	}

	public void setSonguoiDuocphepcho(Long songuoiDuocphepcho) {
		this.songuoiDuocphepcho = songuoiDuocphepcho;
	}

	@Caption("NuocSx")
	@Column(name = "NUOC_SX", columnDefinition = "NUMBER", scale = 0)
	public Long getNuocSx() {
		return this.nuocSx;
	}

	public void setNuocSx(Long nuocSx) {
		this.nuocSx = nuocSx;
	}

	@Caption("NamSx")
	@Column(name = "NAM_SX", columnDefinition = "NUMBER", precision = 4, scale = 0)
	public Long getNamSx() {
		return this.namSx;
	}

	public void setNamSx(Long namSx) {
		this.namSx = namSx;
	}

	@Caption("NienHanSuDung")
	@Temporal(TemporalType.DATE)
	@Column(name = "NIEN_HAN_SU_DUNG", columnDefinition = "DATE", length = 7)
	public Date getNienHanSuDung() {
		return this.nienHanSuDung;
	}

	public void setNienHanSuDung(Date nienHanSuDung) {
		this.nienHanSuDung = nienHanSuDung;
	}

	@Caption("NguonGoc")
	@Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 30)
	public String getNguonGoc() {
		return this.nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	@Caption("SoChungTu")
	@Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 14)
	public String getSoChungTu() {
		return this.soChungTu;
	}

	public void setSoChungTu(String soChungTu) {
		this.soChungTu = soChungTu;
	}

	@Caption("NgaycapChungtu")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAYCAP_CHUNGTU", columnDefinition = "DATE", length = 7)
	public Date getNgaycapChungtu() {
		return this.ngaycapChungtu;
	}

	public void setNgaycapChungtu(Date ngaycapChungtu) {
		this.ngaycapChungtu = ngaycapChungtu;
	}

	@Caption("CoquanCapchungtu")
	@Column(name = "COQUAN_CAPCHUNGTU", columnDefinition = "VARCHAR2", length = 50)
	public String getCoquanCapchungtu() {
		return this.coquanCapchungtu;
	}

	public void setCoquanCapchungtu(String coquanCapchungtu) {
		this.coquanCapchungtu = coquanCapchungtu;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1000)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Caption("NgaySua")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 30)
	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("MaHoso")
	@Column(name = "MA_HOSO", columnDefinition = "VARCHAR2")
	public String getMaHoso() {
		return this.maHoso;
	}

	public void setMaHoso(String maHoso) {
		this.maHoso = maHoso;
	}

	@Caption("MaNhom")
	@Column(name = "MA_NHOM", columnDefinition = "VARCHAR2")
	public String getMaNhom() {
		return this.maNhom;
	}

	public void setMaNhom(String maNhom) {
		this.maNhom = maNhom;
	}

	@Caption("TrangThaiDangKy")
	@Column(name = "TRANG_THAI_DANG_KY", columnDefinition = "NVARCHAR2", length = 40)
	public String getTrangThaiDangKy() {
		return this.trangThaiDangKy;
	}

	public void setTrangThaiDangKy(String trangThaiDangKy) {
		this.trangThaiDangKy = trangThaiDangKy;
	}

	@Caption("NgayDk")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_DK", columnDefinition = "DATE", length = 7)
	public Date getNgayDk() {
		return this.ngayDk;
	}

	public void setNgayDk(Date ngayDk) {
		this.ngayDk = ngayDk;
	}

	@Caption("SoxeDangky")
	@Column(name = "SOXE_DANGKY", columnDefinition = "NUMBER", precision = 3, scale = 0)
	public Short getSoxeDangky() {
		return this.soxeDangky;
	}

	public void setSoxeDangky(Short soxeDangky) {
		this.soxeDangky = soxeDangky;
	}

	@Caption("ThoigianDk")
	@Column(name = "THOIGIAN_DK", columnDefinition = "VARCHAR2", length = 30)
	public String getThoigianDk() {
		return this.thoigianDk;
	}

	public void setThoigianDk(String thoigianDk) {
		this.thoigianDk = thoigianDk;
	}

	@Caption("DiemDkId")
	@Column(name = "DIEM_DK_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getDiemDkId() {
		return this.diemDkId;
	}

	public void setDiemDkId(Long diemDkId) {
		this.diemDkId = diemDkId;
	}

	@Caption("BienSo")
	@Column(name = "BIEN_SO", columnDefinition = "VARCHAR2", length = 30)
	public String getBienSo() {
		return this.bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	@Caption("OldTen")
	@Column(name = "OLD_TEN", columnDefinition = "VARCHAR2")
	public String getOldTen() {
		return this.oldTen;
	}

	public void setOldTen(String oldTen) {
		this.oldTen = oldTen;
	}

	@Caption("OldQuocGiaId")
	@Column(name = "OLD_QUOC_GIA_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getOldQuocGiaId() {
		return this.oldQuocGiaId;
	}

	public void setOldQuocGiaId(Long oldQuocGiaId) {
		this.oldQuocGiaId = oldQuocGiaId;
	}

	@Caption("OldDiadanhHanhchinhId")
	@Column(name = "OLD_DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getOldDiadanhHanhchinhId() {
		return this.oldDiadanhHanhchinhId;
	}

	public void setOldDiadanhHanhchinhId(Long oldDiadanhHanhchinhId) {
		this.oldDiadanhHanhchinhId = oldDiadanhHanhchinhId;
	}

	@Caption("OldDiaChi")
	@Column(name = "OLD_DIA_CHI", columnDefinition = "VARCHAR2", length = 500)
	public String getOldDiaChi() {
		return this.oldDiaChi;
	}

	public void setOldDiaChi(String oldDiaChi) {
		this.oldDiaChi = oldDiaChi;
	}

	@Caption("OldSoDienThoai")
	@Column(name = "OLD_SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getOldSoDienThoai() {
		return this.oldSoDienThoai;
	}

	public void setOldSoDienThoai(String oldSoDienThoai) {
		this.oldSoDienThoai = oldSoDienThoai;
	}

	@Caption("OldPhanloaiQuanlyId")
	@Column(name = "OLD_PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getOldPhanloaiQuanlyId() {
		return this.oldPhanloaiQuanlyId;
	}

	public void setOldPhanloaiQuanlyId(Long oldPhanloaiQuanlyId) {
		this.oldPhanloaiQuanlyId = oldPhanloaiQuanlyId;
	}

	@Caption("OldLoaiGiayto")
	@Column(name = "OLD_LOAI_GIAYTO", columnDefinition = "VARCHAR2")
	public String getOldLoaiGiayto() {
		return this.oldLoaiGiayto;
	}

	public void setOldLoaiGiayto(String oldLoaiGiayto) {
		this.oldLoaiGiayto = oldLoaiGiayto;
	}

	@Caption("OldIdSo")
	@Column(name = "OLD_ID_SO", columnDefinition = "VARCHAR2")
	public String getOldIdSo() {
		return this.oldIdSo;
	}

	public void setOldIdSo(String oldIdSo) {
		this.oldIdSo = oldIdSo;
	}

	@Caption("OldIdNgayCap")
	@Temporal(TemporalType.DATE)
	@Column(name = "OLD_ID_NGAY_CAP", columnDefinition = "DATE", length = 7)
	public Date getOldIdNgayCap() {
		return this.oldIdNgayCap;
	}

	public void setOldIdNgayCap(Date oldIdNgayCap) {
		this.oldIdNgayCap = oldIdNgayCap;
	}

	@Caption("OldIdNoiCap")
	@Column(name = "OLD_ID_NOI_CAP", columnDefinition = "VARCHAR2")
	public String getOldIdNoiCap() {
		return this.oldIdNoiCap;
	}

	public void setOldIdNoiCap(String oldIdNoiCap) {
		this.oldIdNoiCap = oldIdNoiCap;
	}

	@Caption("LoaiSangten")
	@Column(name = "LOAI_SANGTEN", columnDefinition = "VARCHAR2", length = 20)
	public String getLoaiSangten() {
		return this.loaiSangten;
	}

	public void setLoaiSangten(String loaiSangten) {
		this.loaiSangten = loaiSangten;
	}

	@Caption("LydoThuhoiDoicap")
	@Column(name = "LYDO_THUHOI_DOICAP", columnDefinition = "VARCHAR2", length = 20)
	public String getLydoThuhoiDoicap() {
		return this.lydoThuhoiDoicap;
	}

	public void setLydoThuhoiDoicap(String lydoThuhoiDoicap) {
		this.lydoThuhoiDoicap = lydoThuhoiDoicap;
	}

	@Caption("BienSoTrunc")
	@Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 30)
	public String getBienSoTrunc() {
		return this.bienSoTrunc;
	}

	public void setBienSoTrunc(String bienSoTrunc) {
		this.bienSoTrunc = bienSoTrunc;
	}

	@Caption("HinhthucCaitao")
	@Column(name = "HINHTHUC_CAITAO", columnDefinition = "VARCHAR2", length = 20)
	public String getHinhthucCaitao() {
		return this.hinhthucCaitao;
	}

	public void setHinhthucCaitao(String hinhthucCaitao) {
		this.hinhthucCaitao = hinhthucCaitao;
	}

	@Caption("CanhanTochuc")
	@Column(name = "CANHAN_TOCHUC", columnDefinition = "VARCHAR2", length = 10)
	public String getCanhanTochuc() {
		return this.canhanTochuc;
	}

	public void setCanhanTochuc(String canhanTochuc) {
		this.canhanTochuc = canhanTochuc;
	}

	@Caption("MauBien")
	@Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 10)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Caption("OldCanhanTochuc")
	@Column(name = "OLD_CANHAN_TOCHUC", columnDefinition = "VARCHAR2", length = 20)
	public String getOldCanhanTochuc() {
		return this.oldCanhanTochuc;
	}

	public void setOldCanhanTochuc(String oldCanhanTochuc) {
		this.oldCanhanTochuc = oldCanhanTochuc;
	}

	@Caption("LyDoKhac")
	@Column(name = "LY_DO_KHAC", columnDefinition = "VARCHAR2", length = 200)
	public String getLyDoKhac() {
		return this.lyDoKhac;
	}

	public void setLyDoKhac(String lyDoKhac) {
		this.lyDoKhac = lyDoKhac;
	}

	@Caption("GiaytoKemtheo")
	@Column(name = "GIAYTO_KEMTHEO", columnDefinition = "VARCHAR2", length = 500)
	public String getGiaytoKemtheo() {
		return this.giaytoKemtheo;
	}

	public void setGiaytoKemtheo(String giaytoKemtheo) {
		this.giaytoKemtheo = giaytoKemtheo;
	}

	@Caption("CoquanGuiDenghithuhoi")
	@Column(name = "COQUAN_GUI_DENGHITHUHOI", columnDefinition = "VARCHAR2", length = 500)
	public String getCoquanGuiDenghithuhoi() {
		return this.coquanGuiDenghithuhoi;
	}

	public void setCoquanGuiDenghithuhoi(String coquanGuiDenghithuhoi) {
		this.coquanGuiDenghithuhoi = coquanGuiDenghithuhoi;
	}

	@Caption("MotoNhanhieukhac")
	@Column(name = "MOTO_NHANHIEUKHAC", columnDefinition = "VARCHAR2", length = 200)
	public String getMotoNhanhieukhac() {
		return this.motoNhanhieukhac;
	}

	public void setMotoNhanhieukhac(String motoNhanhieukhac) {
		this.motoNhanhieukhac = motoNhanhieukhac;
	}

	@Caption("MauSonKhac")
	@Column(name = "MAU_SON_KHAC", columnDefinition = "VARCHAR2", length = 200)
	public String getMauSonKhac() {
		return this.mauSonKhac;
	}

	public void setMauSonKhac(String mauSonKhac) {
		this.mauSonKhac = mauSonKhac;
	}

	@Caption("LyDoThuHoi")
	@Column(name = "LY_DO_THU_HOI", columnDefinition = "NVARCHAR2", length = 40)
	public String getLyDoThuHoi() {
		return this.lyDoThuHoi;
	}

	public void setLyDoThuHoi(String lyDoThuHoi) {
		this.lyDoThuHoi = lyDoThuHoi;
	}

	@Caption("MotoLoaixekhac")
	@Column(name = "MOTO_LOAIXEKHAC", columnDefinition = "VARCHAR2", length = 200)
	public String getMotoLoaixekhac() {
		return this.motoLoaixekhac;
	}

	public void setMotoLoaixekhac(String motoLoaixekhac) {
		this.motoLoaixekhac = motoLoaixekhac;
	}

	@Caption("MaNopThueTruocBa")
	@Column(name = "MA_NOP_THUE_TRUOC_BA", columnDefinition = "VARCHAR2", length = 50)
	public String getMaNopThueTruocBa() {
		return this.maNopThueTruocBa;
	}

	public void setMaNopThueTruocBa(String maNopThueTruocBa) {
		this.maNopThueTruocBa = maNopThueTruocBa;
	}

	@Caption("CmndThue")
	@Column(name = "CMND_THUE", columnDefinition = "VARCHAR2", length = 20)
	public String getCmndThue() {
		return this.cmndThue;
	}

	public void setCmndThue(String cmndThue) {
		this.cmndThue = cmndThue;
	}

	@Caption("NoiDungCaiTaoKhac")
	@Column(name = "NOI_DUNG_CAI_TAO_KHAC", columnDefinition = "VARCHAR2", length = 500)
	public String getNoiDungCaiTaoKhac() {
		return this.noiDungCaiTaoKhac;
	}

	public void setNoiDungCaiTaoKhac(String noiDungCaiTaoKhac) {
		this.noiDungCaiTaoKhac = noiDungCaiTaoKhac;
	}

	@Caption("LyDoStdc")
	@Column(name = "LY_DO_STDC", columnDefinition = "VARCHAR2", length = 500)
	public String getLyDoStdc() {
		return this.lyDoStdc;
	}

	public void setLyDoStdc(String lyDoStdc) {
		this.lyDoStdc = lyDoStdc;
	}

	@Caption("NgayDi")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_DI", columnDefinition = "DATE", length = 7)
	public Date getNgayDi() {
		return this.ngayDi;
	}

	public void setNgayDi(Date ngayDi) {
		this.ngayDi = ngayDi;
	}

	@Caption("NgayDen")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_DEN", columnDefinition = "DATE", length = 7)
	public Date getNgayDen() {
		return this.ngayDen;
	}

	public void setNgayDen(Date ngayDen) {
		this.ngayDen = ngayDen;
	}

	@Caption("DiemDi")
	@Column(name = "DIEM_DI", columnDefinition = "VARCHAR2", length = 200)
	public String getDiemDi() {
		return this.diemDi;
	}

	public void setDiemDi(String diemDi) {
		this.diemDi = diemDi;
	}

	@Caption("DiemDen")
	@Column(name = "DIEM_DEN", columnDefinition = "VARCHAR2", length = 200)
	public String getDiemDen() {
		return this.diemDen;
	}

	public void setDiemDen(String diemDen) {
		this.diemDen = diemDen;
	}

}
