package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.NghiDinhCpDAO;
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
 * NghiDinhCp
 */
@DAO(daoClass = NghiDinhCpDAO.class)
@Caption("{%ten}")
@Entity
@Table(name = "NGHI_DINH_CP", schema = "BCA_MOTO")
public class NghiDinhCp implements java.io.Serializable {

	private long id;
	private Long so;
	private String ten;
	private String noiDung;
	private long nghiDinhChaId;
	private String tomTat;
	private String ghiChu;
	private String ngayHieuLuc;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Boolean trangThaiKichHoat;
	private Date ngayHetHieuLuc;
	private Date ngayBanHanh;
	private String ma;
	private Long phanLoaiDuong;

	public NghiDinhCp() {
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

	@Caption("So")
	@Column(name = "SO", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSo() {
		return this.so;
	}

	public void setSo(Long so) {
		this.so = so;
	}

	@Caption("Ten")
	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("NoiDung")
	@Column(name = "NOI_DUNG", nullable = false, columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Caption("NghiDinhChaId")
	@Column(name = "NGHI_DINH_CHA_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNghiDinhChaId() {
		return this.nghiDinhChaId;
	}

	public void setNghiDinhChaId(long nghiDinhChaId) {
		this.nghiDinhChaId = nghiDinhChaId;
	}

	@Caption("TomTat")
	@Column(name = "TOM_TAT", columnDefinition = "VARCHAR2", length = 500)
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

	@Caption("NgayHieuLuc")
	@Column(name = "NGAY_HIEU_LUC", columnDefinition = "VARCHAR2", length = 20)
	public String getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(String ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
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

	@Caption("TrangThaiKichHoat")
	@Column(name = "TRANG_THAI_KICH_HOAT", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(Boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
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

	@Caption("NgayBanHanh")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_BAN_HANH", columnDefinition = "DATE", length = 7)
	public Date getNgayBanHanh() {
		return this.ngayBanHanh;
	}

	public void setNgayBanHanh(Date ngayBanHanh) {
		this.ngayBanHanh = ngayBanHanh;
	}

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "NVARCHAR2", length = 100)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("PhanLoaiDuong")
	@Column(name = "PHAN_LOAI_DUONG", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getPhanLoaiDuong() {
		return this.phanLoaiDuong;
	}

	public void setPhanLoaiDuong(Long phanLoaiDuong) {
		this.phanLoaiDuong = phanLoaiDuong;
	}

}
