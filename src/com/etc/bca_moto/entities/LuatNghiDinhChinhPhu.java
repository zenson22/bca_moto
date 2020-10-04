package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LuatNghiDinhChinhPhuDAO;
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
 * LuatNghiDinhChinhPhu
 */
@DAO(daoClass = LuatNghiDinhChinhPhuDAO.class)
@Caption("{%noiDungTtDieu}")
@Entity
@Table(name = "LUAT_NGHI_DINH_CHINH_PHU", schema = "BCA_MOTO")
public class LuatNghiDinhChinhPhu implements java.io.Serializable {

	private long id;
	private Long nghiDinh;
	private Long dieu;
	private String noiDungTtDieu;
	private String noiDungCtDieu;
	private Long khoan;
	private String noiDungTtKhoan;
	private String noiDungCtKhoan;
	private String diem;
	private String noiDungDiem;
	private String maHvvp;
	private Long soHvvp;
	private String hanhViViPham;
	private Long soTienNnCn;
	private Long soTienLnCn;
	private Long soTienMdCn;
	private Long soTienNnTc;
	private Long soTienLnTc;
	private Long soTienMdTc;
	private Long loaiPhuongTien;
	private Boolean giaiTrinh;
	private Long nhanHeSo;
	private String hinhThucXpbs;
	private String bienPhapKphq;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private Long suaDoiId;
	private String tenNghiDinh;
	private String ghiChu;
	private Long hvvpThuongXuyen;

	public LuatNghiDinhChinhPhu() {
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
	@Column(name = "NGHI_DINH", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNghiDinh() {
		return this.nghiDinh;
	}

	public void setNghiDinh(Long nghiDinh) {
		this.nghiDinh = nghiDinh;
	}

	@Caption("Dieu")
	@Column(name = "DIEU", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDieu() {
		return this.dieu;
	}

	public void setDieu(Long dieu) {
		this.dieu = dieu;
	}

	@Caption("NoiDungTtDieu")
	@Column(name = "NOI_DUNG_TT_DIEU", columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDungTtDieu() {
		return this.noiDungTtDieu;
	}

	public void setNoiDungTtDieu(String noiDungTtDieu) {
		this.noiDungTtDieu = noiDungTtDieu;
	}

	@Caption("NoiDungCtDieu")
	@Column(name = "NOI_DUNG_CT_DIEU", columnDefinition = "VARCHAR2", length = 2000)
	public String getNoiDungCtDieu() {
		return this.noiDungCtDieu;
	}

	public void setNoiDungCtDieu(String noiDungCtDieu) {
		this.noiDungCtDieu = noiDungCtDieu;
	}

	@Caption("Khoan")
	@Column(name = "KHOAN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getKhoan() {
		return this.khoan;
	}

	public void setKhoan(Long khoan) {
		this.khoan = khoan;
	}

	@Caption("NoiDungTtKhoan")
	@Column(name = "NOI_DUNG_TT_KHOAN", columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDungTtKhoan() {
		return this.noiDungTtKhoan;
	}

	public void setNoiDungTtKhoan(String noiDungTtKhoan) {
		this.noiDungTtKhoan = noiDungTtKhoan;
	}

	@Caption("NoiDungCtKhoan")
	@Column(name = "NOI_DUNG_CT_KHOAN", columnDefinition = "VARCHAR2", length = 2000)
	public String getNoiDungCtKhoan() {
		return this.noiDungCtKhoan;
	}

	public void setNoiDungCtKhoan(String noiDungCtKhoan) {
		this.noiDungCtKhoan = noiDungCtKhoan;
	}

	@Caption("Diem")
	@Column(name = "DIEM", columnDefinition = "VARCHAR2", length = 50)
	public String getDiem() {
		return this.diem;
	}

	public void setDiem(String diem) {
		this.diem = diem;
	}

	@Caption("NoiDungDiem")
	@Column(name = "NOI_DUNG_DIEM", columnDefinition = "VARCHAR2", length = 2000)
	public String getNoiDungDiem() {
		return this.noiDungDiem;
	}

	public void setNoiDungDiem(String noiDungDiem) {
		this.noiDungDiem = noiDungDiem;
	}

	@Caption("MaHvvp")
	@Column(name = "MA_HVVP", columnDefinition = "VARCHAR2", length = 50)
	public String getMaHvvp() {
		return this.maHvvp;
	}

	public void setMaHvvp(String maHvvp) {
		this.maHvvp = maHvvp;
	}

	@Caption("SoHvvp")
	@Column(name = "SO_HVVP", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSoHvvp() {
		return this.soHvvp;
	}

	public void setSoHvvp(Long soHvvp) {
		this.soHvvp = soHvvp;
	}

	@Caption("HanhViViPham")
	@Column(name = "HANH_VI_VI_PHAM", columnDefinition = "VARCHAR2", length = 2000)
	public String getHanhViViPham() {
		return this.hanhViViPham;
	}

	public void setHanhViViPham(String hanhViViPham) {
		this.hanhViViPham = hanhViViPham;
	}

	@Caption("SoTienNnCn")
	@Column(name = "SO_TIEN_NN_CN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienNnCn() {
		return this.soTienNnCn;
	}

	public void setSoTienNnCn(Long soTienNnCn) {
		this.soTienNnCn = soTienNnCn;
	}

	@Caption("SoTienLnCn")
	@Column(name = "SO_TIEN_LN_CN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienLnCn() {
		return this.soTienLnCn;
	}

	public void setSoTienLnCn(Long soTienLnCn) {
		this.soTienLnCn = soTienLnCn;
	}

	@Caption("SoTienMdCn")
	@Column(name = "SO_TIEN_MD_CN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienMdCn() {
		return this.soTienMdCn;
	}

	public void setSoTienMdCn(Long soTienMdCn) {
		this.soTienMdCn = soTienMdCn;
	}

	@Caption("SoTienNnTc")
	@Column(name = "SO_TIEN_NN_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienNnTc() {
		return this.soTienNnTc;
	}

	public void setSoTienNnTc(Long soTienNnTc) {
		this.soTienNnTc = soTienNnTc;
	}

	@Caption("SoTienLnTc")
	@Column(name = "SO_TIEN_LN_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienLnTc() {
		return this.soTienLnTc;
	}

	public void setSoTienLnTc(Long soTienLnTc) {
		this.soTienLnTc = soTienLnTc;
	}

	@Caption("SoTienMdTc")
	@Column(name = "SO_TIEN_MD_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienMdTc() {
		return this.soTienMdTc;
	}

	public void setSoTienMdTc(Long soTienMdTc) {
		this.soTienMdTc = soTienMdTc;
	}

	@Caption("LoaiPhuongTien")
	@Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getLoaiPhuongTien() {
		return this.loaiPhuongTien;
	}

	public void setLoaiPhuongTien(Long loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	@Caption("GiaiTrinh")
	@Column(name = "GIAI_TRINH", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getGiaiTrinh() {
		return this.giaiTrinh;
	}

	public void setGiaiTrinh(Boolean giaiTrinh) {
		this.giaiTrinh = giaiTrinh;
	}

	@Caption("NhanHeSo")
	@Column(name = "NHAN_HE_SO", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getNhanHeSo() {
		return this.nhanHeSo;
	}

	public void setNhanHeSo(Long nhanHeSo) {
		this.nhanHeSo = nhanHeSo;
	}

	@Caption("HinhThucXpbs")
	@Column(name = "HINH_THUC_XPBS", columnDefinition = "VARCHAR2", length = 2000)
	public String getHinhThucXpbs() {
		return this.hinhThucXpbs;
	}

	public void setHinhThucXpbs(String hinhThucXpbs) {
		this.hinhThucXpbs = hinhThucXpbs;
	}

	@Caption("BienPhapKphq")
	@Column(name = "BIEN_PHAP_KPHQ", columnDefinition = "VARCHAR2", length = 2000)
	public String getBienPhapKphq() {
		return this.bienPhapKphq;
	}

	public void setBienPhapKphq(String bienPhapKphq) {
		this.bienPhapKphq = bienPhapKphq;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
		this.nguoiTao = nguoiTao;
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

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)
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
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("SuaDoiId")
	@Column(name = "SUA_DOI_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSuaDoiId() {
		return this.suaDoiId;
	}

	public void setSuaDoiId(Long suaDoiId) {
		this.suaDoiId = suaDoiId;
	}

	@Caption("TenNghiDinh")
	@Column(name = "TEN_NGHI_DINH", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNghiDinh() {
		return this.tenNghiDinh;
	}

	public void setTenNghiDinh(String tenNghiDinh) {
		this.tenNghiDinh = tenNghiDinh;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 300)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("HvvpThuongXuyen")
	@Column(name = "HVVP_THUONG_XUYEN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getHvvpThuongXuyen() {
		return this.hvvpThuongXuyen;
	}

	public void setHvvpThuongXuyen(Long hvvpThuongXuyen) {
		this.hvvpThuongXuyen = hvvpThuongXuyen;
	}

}
