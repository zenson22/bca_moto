package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LuatDuongBoDAO;
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
 * LuatDuongBo
 */
@DAO(daoClass = LuatDuongBoDAO.class)
@Caption("{%diem}")
@Entity
@Table(name = "LUAT_DUONG_BO", schema = "BCA_MOTO")
public class LuatDuongBo implements java.io.Serializable {

	private long id;
	private long nghiDinh;
	private long dieu;
	private long khoan;
	private String diem;
	private String noiDung;
	private long soTienLonNhat;
	private long soTienNhoNhat;
	private Long soTienMacDinh;
	private Long kieu;
	private Boolean loaiKhuVuc;
	private Date ngayHieuLuc;
	private Date ngayHetHl;
	private long trangThai;
	private long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private long loaiPhuongTienId;
	private String truyVanNhanh;
	private String tomTat;
	private String ghiChu;
	private String noiDungDieu;
	private String noiDungKhoan;
	private Long stlnTc;
	private Long stnnTc;
	private Long stmdTc;
	private String listLoaiPhuongTienId;
	private Long luatBoSungId;
	private Long nghiDinhBoSungId;
	private Long phanLoaiDuongLdb;
	private String capXuPhat;

	public LuatDuongBo() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Caption("Khoan")
	@Column(name = "KHOAN", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getKhoan() {
		return this.khoan;
	}

	public void setKhoan(long khoan) {
		this.khoan = khoan;
	}

	@Caption("Diem")
	@Column(name = "DIEM", columnDefinition = "VARCHAR2", length = 10)
	public String getDiem() {
		return this.diem;
	}

	public void setDiem(String diem) {
		this.diem = diem;
	}

	@Caption("NoiDung")
	@Column(name = "NOI_DUNG", nullable = false, columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Caption("SoTienLonNhat")
	@Column(name = "SO_TIEN_LON_NHAT", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getSoTienLonNhat() {
		return this.soTienLonNhat;
	}

	public void setSoTienLonNhat(long soTienLonNhat) {
		this.soTienLonNhat = soTienLonNhat;
	}

	@Caption("SoTienNhoNhat")
	@Column(name = "SO_TIEN_NHO_NHAT", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getSoTienNhoNhat() {
		return this.soTienNhoNhat;
	}

	public void setSoTienNhoNhat(long soTienNhoNhat) {
		this.soTienNhoNhat = soTienNhoNhat;
	}

	@Caption("SoTienMacDinh")
	@Column(name = "SO_TIEN_MAC_DINH", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienMacDinh() {
		return this.soTienMacDinh;
	}

	public void setSoTienMacDinh(Long soTienMacDinh) {
		this.soTienMacDinh = soTienMacDinh;
	}

	@Caption("Kieu")
	@Column(name = "KIEU", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getKieu() {
		return this.kieu;
	}

	public void setKieu(Long kieu) {
		this.kieu = kieu;
	}

	@Caption("LoaiKhuVuc")
	@Column(name = "LOAI_KHU_VUC", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getLoaiKhuVuc() {
		return this.loaiKhuVuc;
	}

	public void setLoaiKhuVuc(Boolean loaiKhuVuc) {
		this.loaiKhuVuc = loaiKhuVuc;
	}

	@Caption("NgayHieuLuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HIEU_LUC", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Caption("NgayHetHl")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HET_HL", columnDefinition = "DATE", length = 7)
	public Date getNgayHetHl() {
		return this.ngayHetHl;
	}

	public void setNgayHetHl(Date ngayHetHl) {
		this.ngayHetHl = ngayHetHl;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
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

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Caption("LoaiPhuongTienId")
	@Column(name = "LOAI_PHUONG_TIEN_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getLoaiPhuongTienId() {
		return this.loaiPhuongTienId;
	}

	public void setLoaiPhuongTienId(long loaiPhuongTienId) {
		this.loaiPhuongTienId = loaiPhuongTienId;
	}

	@Caption("TruyVanNhanh")
	@Column(name = "TRUY_VAN_NHANH", columnDefinition = "VARCHAR2", length = 20)
	public String getTruyVanNhanh() {
		return this.truyVanNhanh;
	}

	public void setTruyVanNhanh(String truyVanNhanh) {
		this.truyVanNhanh = truyVanNhanh;
	}

	@Caption("TomTat")
	@Column(name = "TOM_TAT", columnDefinition = "VARCHAR2", length = 1000)
	public String getTomTat() {
		return this.tomTat;
	}

	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("NoiDungDieu")
	@Column(name = "NOI_DUNG_DIEU", columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDungDieu() {
		return this.noiDungDieu;
	}

	public void setNoiDungDieu(String noiDungDieu) {
		this.noiDungDieu = noiDungDieu;
	}

	@Caption("NoiDungKhoan")
	@Column(name = "NOI_DUNG_KHOAN", columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDungKhoan() {
		return this.noiDungKhoan;
	}

	public void setNoiDungKhoan(String noiDungKhoan) {
		this.noiDungKhoan = noiDungKhoan;
	}

	@Caption("StlnTc")
	@Column(name = "STLN_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getStlnTc() {
		return this.stlnTc;
	}

	public void setStlnTc(Long stlnTc) {
		this.stlnTc = stlnTc;
	}

	@Caption("StnnTc")
	@Column(name = "STNN_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getStnnTc() {
		return this.stnnTc;
	}

	public void setStnnTc(Long stnnTc) {
		this.stnnTc = stnnTc;
	}

	@Caption("StmdTc")
	@Column(name = "STMD_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getStmdTc() {
		return this.stmdTc;
	}

	public void setStmdTc(Long stmdTc) {
		this.stmdTc = stmdTc;
	}

	@Caption("ListLoaiPhuongTienId")
	@Column(name = "LIST_LOAI_PHUONG_TIEN_ID", columnDefinition = "VARCHAR2", length = 50)
	public String getListLoaiPhuongTienId() {
		return this.listLoaiPhuongTienId;
	}

	public void setListLoaiPhuongTienId(String listLoaiPhuongTienId) {
		this.listLoaiPhuongTienId = listLoaiPhuongTienId;
	}

	@Caption("LuatBoSungId")
	@Column(name = "LUAT_BO_SUNG_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLuatBoSungId() {
		return this.luatBoSungId;
	}

	public void setLuatBoSungId(Long luatBoSungId) {
		this.luatBoSungId = luatBoSungId;
	}

	@Caption("NghiDinhBoSungId")
	@Column(name = "NGHI_DINH_BO_SUNG_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNghiDinhBoSungId() {
		return this.nghiDinhBoSungId;
	}

	public void setNghiDinhBoSungId(Long nghiDinhBoSungId) {
		this.nghiDinhBoSungId = nghiDinhBoSungId;
	}

	@Caption("PhanLoaiDuongLdb")
	@Column(name = "PHAN_LOAI_DUONG_LDB", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getPhanLoaiDuongLdb() {
		return this.phanLoaiDuongLdb;
	}

	public void setPhanLoaiDuongLdb(Long phanLoaiDuongLdb) {
		this.phanLoaiDuongLdb = phanLoaiDuongLdb;
	}

	@Caption("CapXuPhat")
	@Column(name = "CAP_XU_PHAT", columnDefinition = "VARCHAR2", length = 50)
	public String getCapXuPhat() {
		return this.capXuPhat;
	}

	public void setCapXuPhat(String capXuPhat) {
		this.capXuPhat = capXuPhat;
	}

}
