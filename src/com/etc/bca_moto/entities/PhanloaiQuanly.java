package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.PhanloaiQuanlyDAO;
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
 * PhanloaiQuanly
 */
@DAO(daoClass = PhanloaiQuanlyDAO.class)
@Caption("{%tenPhanLoai}")
@Entity
@Table(name = "PHANLOAI_QUANLY", schema = "BCA_MOTO")
public class PhanloaiQuanly implements java.io.Serializable {

	private long id;
	private String tenPhanLoai;
	private String maPhanLoai;
	private Long nhomQlyId;
	private boolean loaiDoituong;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private String ghiChu;
	private Boolean coBienNvu;

	public PhanloaiQuanly() {
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

	@Caption("TenPhanLoai")
	@Column(name = "TEN_PHAN_LOAI", nullable = false, columnDefinition = "VARCHAR2", length = 1020)
	public String getTenPhanLoai() {
		return this.tenPhanLoai;
	}

	public void setTenPhanLoai(String tenPhanLoai) {
		this.tenPhanLoai = tenPhanLoai;
	}

	@Caption("MaPhanLoai")
	@Column(name = "MA_PHAN_LOAI", nullable = false, columnDefinition = "VARCHAR2", length = 80)
	public String getMaPhanLoai() {
		return this.maPhanLoai;
	}

	public void setMaPhanLoai(String maPhanLoai) {
		this.maPhanLoai = maPhanLoai;
	}

	@Caption("NhomQlyId")
	@Column(name = "NHOM_QLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNhomQlyId() {
		return this.nhomQlyId;
	}

	public void setNhomQlyId(Long nhomQlyId) {
		this.nhomQlyId = nhomQlyId;
	}

	@Caption("LoaiDoituong")
	@Column(name = "LOAI_DOITUONG", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isLoaiDoituong() {
		return this.loaiDoituong;
	}

	public void setLoaiDoituong(boolean loaiDoituong) {
		this.loaiDoituong = loaiDoituong;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
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

	@Caption("TrangThaiKichHoat")
	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("CoBienNvu")
	@Column(name = "CO_BIEN_NVU", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getCoBienNvu() {
		return this.coBienNvu;
	}

	public void setCoBienNvu(Boolean coBienNvu) {
		this.coBienNvu = coBienNvu;
	}

}
