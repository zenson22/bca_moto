package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LuatNghidinhDAO;
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
 * LuatNghidinh
 */
@DAO(daoClass = LuatNghidinhDAO.class)
@Caption("{%dieuNdungTomTat}")
@Entity
@Table(name = "LUAT_NGHIDINH", schema = "BCA_MOTO")
public class LuatNghidinh implements java.io.Serializable {

	private long id;
	private long nghiDinh;
	private long dieu;
	private String dieuNdungTomTat;
	private String dieuNdungChiTiet;
	private Long khoan;
	private String khoanNdungTomTat;
	private String khoanNdungChiTiet;
	private String diem;
	private String diemNdungChiTiet;
	private String maHanhViViPham;
	private String hanhViViPham;
	private Long soTienNnCaNhan;
	private Long soTienLnCaNhan;
	private Long soTienMacDinhCn;
	private Long soTienNnToChuc;
	private Long soTienLnToChuc;
	private Long soTienMacDinhTc;
	private String phuongTien;
	private Long phuongTienId;
	private Long giaiTrinh;
	private Long nhanHeSo;
	private String hinhThucXpBoSung;
	private String bienPhapKhacPhucHq;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Long trangThai;
	private Date ngayHieuLuc;
	private Date ngayHetHieuLuc;
	private Long suaDoiId;
	private Long hanhViVpThuongXuyen;
	private Date ngaySuaDoiHieuLuc;
	private String tenNghiDinh;
	private String ghiChu;

	public LuatNghidinh() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("NghiDinh")
	@Column(name = "NGHI_DINH", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNghiDinh() {
		return this.nghiDinh;
	}

	public void setNghiDinh(long nghiDinh) {
		this.nghiDinh = nghiDinh;
	}

	@Caption("Dieu")
	@Column(name = "DIEU", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDieu() {
		return this.dieu;
	}

	public void setDieu(long dieu) {
		this.dieu = dieu;
	}

	@Caption("DieuNdungTomTat")
	@Column(name = "DIEU_NDUNG_TOM_TAT", nullable = false, columnDefinition = "VARCHAR2", length = 1000)
	public String getDieuNdungTomTat() {
		return this.dieuNdungTomTat;
	}

	public void setDieuNdungTomTat(String dieuNdungTomTat) {
		this.dieuNdungTomTat = dieuNdungTomTat;
	}

	@Caption("DieuNdungChiTiet")
	@Column(name = "DIEU_NDUNG_CHI_TIET", nullable = false, columnDefinition = "VARCHAR2", length = 3000)
	public String getDieuNdungChiTiet() {
		return this.dieuNdungChiTiet;
	}

	public void setDieuNdungChiTiet(String dieuNdungChiTiet) {
		this.dieuNdungChiTiet = dieuNdungChiTiet;
	}

	@Caption("Khoan")
	@Column(name = "KHOAN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getKhoan() {
		return this.khoan;
	}

	public void setKhoan(Long khoan) {
		this.khoan = khoan;
	}

	@Caption("KhoanNdungTomTat")
	@Column(name = "KHOAN_NDUNG_TOM_TAT", columnDefinition = "VARCHAR2", length = 1000)
	public String getKhoanNdungTomTat() {
		return this.khoanNdungTomTat;
	}

	public void setKhoanNdungTomTat(String khoanNdungTomTat) {
		this.khoanNdungTomTat = khoanNdungTomTat;
	}

	@Caption("KhoanNdungChiTiet")
	@Column(name = "KHOAN_NDUNG_CHI_TIET", columnDefinition = "VARCHAR2", length = 3000)
	public String getKhoanNdungChiTiet() {
		return this.khoanNdungChiTiet;
	}

	public void setKhoanNdungChiTiet(String khoanNdungChiTiet) {
		this.khoanNdungChiTiet = khoanNdungChiTiet;
	}

	@Caption("Diem")
	@Column(name = "DIEM", columnDefinition = "VARCHAR2", length = 20)
	public String getDiem() {
		return this.diem;
	}

	public void setDiem(String diem) {
		this.diem = diem;
	}

	@Caption("DiemNdungChiTiet")
	@Column(name = "DIEM_NDUNG_CHI_TIET", columnDefinition = "VARCHAR2", length = 3000)
	public String getDiemNdungChiTiet() {
		return this.diemNdungChiTiet;
	}

	public void setDiemNdungChiTiet(String diemNdungChiTiet) {
		this.diemNdungChiTiet = diemNdungChiTiet;
	}

	@Caption("MaHanhViViPham")
	@Column(name = "MA_HANH_VI_VI_PHAM", columnDefinition = "VARCHAR2", length = 100)
	public String getMaHanhViViPham() {
		return this.maHanhViViPham;
	}

	public void setMaHanhViViPham(String maHanhViViPham) {
		this.maHanhViViPham = maHanhViViPham;
	}

	@Caption("HanhViViPham")
	@Column(name = "HANH_VI_VI_PHAM", columnDefinition = "VARCHAR2", length = 3000)
	public String getHanhViViPham() {
		return this.hanhViViPham;
	}

	public void setHanhViViPham(String hanhViViPham) {
		this.hanhViViPham = hanhViViPham;
	}

	@Caption("SoTienNnCaNhan")
	@Column(name = "SO_TIEN_NN_CA_NHAN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienNnCaNhan() {
		return this.soTienNnCaNhan;
	}

	public void setSoTienNnCaNhan(Long soTienNnCaNhan) {
		this.soTienNnCaNhan = soTienNnCaNhan;
	}

	@Caption("SoTienLnCaNhan")
	@Column(name = "SO_TIEN_LN_CA_NHAN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienLnCaNhan() {
		return this.soTienLnCaNhan;
	}

	public void setSoTienLnCaNhan(Long soTienLnCaNhan) {
		this.soTienLnCaNhan = soTienLnCaNhan;
	}

	@Caption("SoTienMacDinhCn")
	@Column(name = "SO_TIEN_MAC_DINH_CN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienMacDinhCn() {
		return this.soTienMacDinhCn;
	}

	public void setSoTienMacDinhCn(Long soTienMacDinhCn) {
		this.soTienMacDinhCn = soTienMacDinhCn;
	}

	@Caption("SoTienNnToChuc")
	@Column(name = "SO_TIEN_NN_TO_CHUC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienNnToChuc() {
		return this.soTienNnToChuc;
	}

	public void setSoTienNnToChuc(Long soTienNnToChuc) {
		this.soTienNnToChuc = soTienNnToChuc;
	}

	@Caption("SoTienLnToChuc")
	@Column(name = "SO_TIEN_LN_TO_CHUC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienLnToChuc() {
		return this.soTienLnToChuc;
	}

	public void setSoTienLnToChuc(Long soTienLnToChuc) {
		this.soTienLnToChuc = soTienLnToChuc;
	}

	@Caption("SoTienMacDinhTc")
	@Column(name = "SO_TIEN_MAC_DINH_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienMacDinhTc() {
		return this.soTienMacDinhTc;
	}

	public void setSoTienMacDinhTc(Long soTienMacDinhTc) {
		this.soTienMacDinhTc = soTienMacDinhTc;
	}

	@Caption("PhuongTien")
	@Column(name = "PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getPhuongTien() {
		return this.phuongTien;
	}

	public void setPhuongTien(String phuongTien) {
		this.phuongTien = phuongTien;
	}

	@Caption("PhuongTienId")
	@Column(name = "PHUONG_TIEN_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getPhuongTienId() {
		return this.phuongTienId;
	}

	public void setPhuongTienId(Long phuongTienId) {
		this.phuongTienId = phuongTienId;
	}

	@Caption("GiaiTrinh")
	@Column(name = "GIAI_TRINH", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getGiaiTrinh() {
		return this.giaiTrinh;
	}

	public void setGiaiTrinh(Long giaiTrinh) {
		this.giaiTrinh = giaiTrinh;
	}

	@Caption("NhanHeSo")
	@Column(name = "NHAN_HE_SO", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNhanHeSo() {
		return this.nhanHeSo;
	}

	public void setNhanHeSo(Long nhanHeSo) {
		this.nhanHeSo = nhanHeSo;
	}

	@Caption("HinhThucXpBoSung")
	@Column(name = "HINH_THUC_XP_BO_SUNG", columnDefinition = "VARCHAR2", length = 1000)
	public String getHinhThucXpBoSung() {
		return this.hinhThucXpBoSung;
	}

	public void setHinhThucXpBoSung(String hinhThucXpBoSung) {
		this.hinhThucXpBoSung = hinhThucXpBoSung;
	}

	@Caption("BienPhapKhacPhucHq")
	@Column(name = "BIEN_PHAP_KHAC_PHUC_HQ", columnDefinition = "VARCHAR2", length = 2000)
	public String getBienPhapKhacPhucHq() {
		return this.bienPhapKhacPhucHq;
	}

	public void setBienPhapKhacPhucHq(String bienPhapKhacPhucHq) {
		this.bienPhapKhacPhucHq = bienPhapKhacPhucHq;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
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
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NgayHieuLuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HIEU_LUC", columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Caption("NgayHetHieuLuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HET_HIEU_LUC", columnDefinition = "DATE", length = 7)
	public Date getNgayHetHieuLuc() {
		return this.ngayHetHieuLuc;
	}

	public void setNgayHetHieuLuc(Date ngayHetHieuLuc) {
		this.ngayHetHieuLuc = ngayHetHieuLuc;
	}

	@Caption("SuaDoiId")
	@Column(name = "SUA_DOI_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getSuaDoiId() {
		return this.suaDoiId;
	}

	public void setSuaDoiId(Long suaDoiId) {
		this.suaDoiId = suaDoiId;
	}

	@Caption("HanhViVpThuongXuyen")
	@Column(name = "HANH_VI_VP_THUONG_XUYEN", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getHanhViVpThuongXuyen() {
		return this.hanhViVpThuongXuyen;
	}

	public void setHanhViVpThuongXuyen(Long hanhViVpThuongXuyen) {
		this.hanhViVpThuongXuyen = hanhViVpThuongXuyen;
	}

	@Caption("NgaySuaDoiHieuLuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA_DOI_HIEU_LUC", columnDefinition = "DATE", length = 7)
	public Date getNgaySuaDoiHieuLuc() {
		return this.ngaySuaDoiHieuLuc;
	}

	public void setNgaySuaDoiHieuLuc(Date ngaySuaDoiHieuLuc) {
		this.ngaySuaDoiHieuLuc = ngaySuaDoiHieuLuc;
	}

	@Caption("TenNghiDinh")
	@Column(name = "TEN_NGHI_DINH", columnDefinition = "VARCHAR2", length = 100)
	public String getTenNghiDinh() {
		return this.tenNghiDinh;
	}

	public void setTenNghiDinh(String tenNghiDinh) {
		this.tenNghiDinh = tenNghiDinh;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
