package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DanhMucThongTinDAO;
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
 * DanhMucThongTin
 */
@DAO(daoClass = DanhMucThongTinDAO.class)
@Caption("{%soThongTin}")
@Entity
@Table(name = "DANH_MUC_THONG_TIN", schema = "BCA_MOTO")
public class DanhMucThongTin implements java.io.Serializable {

	private long id;
	private String soThongTin;
	private Date thoiGianCapNhat;
	private String noiDungCapNhat;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private String duongDan;

	public DanhMucThongTin() {
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

	@Caption("SoThongTin")
	@Column(name = "SO_THONG_TIN", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoThongTin() {
		return this.soThongTin;
	}

	public void setSoThongTin(String soThongTin) {
		this.soThongTin = soThongTin;
	}

	@Caption("ThoiGianCapNhat")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_GIAN_CAP_NHAT", columnDefinition = "DATE", length = 7)
	public Date getThoiGianCapNhat() {
		return this.thoiGianCapNhat;
	}

	public void setThoiGianCapNhat(Date thoiGianCapNhat) {
		this.thoiGianCapNhat = thoiGianCapNhat;
	}

	@Caption("NoiDungCapNhat")
	@Column(name = "NOI_DUNG_CAP_NHAT", columnDefinition = "VARCHAR2", length = 2000)
	public String getNoiDungCapNhat() {
		return this.noiDungCapNhat;
	}

	public void setNoiDungCapNhat(String noiDungCapNhat) {
		this.noiDungCapNhat = noiDungCapNhat;
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
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("DuongDan")
	@Column(name = "DUONG_DAN", columnDefinition = "VARCHAR2", length = 300)
	public String getDuongDan() {
		return this.duongDan;
	}

	public void setDuongDan(String duongDan) {
		this.duongDan = duongDan;
	}

}
