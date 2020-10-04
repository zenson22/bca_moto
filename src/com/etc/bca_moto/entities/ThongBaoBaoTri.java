package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ThongBaoBaoTriDAO;
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
 * ThongBaoBaoTri
 */
@DAO(daoClass = ThongBaoBaoTriDAO.class)
@Caption("{%soThongBao}")
@Entity
@Table(name = "THONG_BAO_BAO_TRI", schema = "BCA_MOTO")
public class ThongBaoBaoTri implements java.io.Serializable {

	private long id;
	private String soThongBao;
	private Date thoiGianBatDau;
	private Date thoiGianKetThuc;
	private String noiDungThongBao;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private String tomTat;

	public ThongBaoBaoTri() {
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

	@Caption("SoThongBao")
	@Column(name = "SO_THONG_BAO", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoThongBao() {
		return this.soThongBao;
	}

	public void setSoThongBao(String soThongBao) {
		this.soThongBao = soThongBao;
	}

	@Caption("ThoiGianBatDau")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_GIAN_BAT_DAU", columnDefinition = "DATE", length = 7)
	public Date getThoiGianBatDau() {
		return this.thoiGianBatDau;
	}

	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	@Caption("ThoiGianKetThuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_GIAN_KET_THUC", columnDefinition = "DATE", length = 7)
	public Date getThoiGianKetThuc() {
		return this.thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	@Caption("NoiDungThongBao")
	@Column(name = "NOI_DUNG_THONG_BAO", columnDefinition = "VARCHAR2", length = 250)
	public String getNoiDungThongBao() {
		return this.noiDungThongBao;
	}

	public void setNoiDungThongBao(String noiDungThongBao) {
		this.noiDungThongBao = noiDungThongBao;
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

	@Caption("TomTat")
	@Column(name = "TOM_TAT", columnDefinition = "VARCHAR2", length = 100)
	public String getTomTat() {
		return this.tomTat;
	}

	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
	}

}
