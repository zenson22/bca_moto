package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.NgheNghiepDAO;
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
 * NgheNghiep
 */
@DAO(daoClass = NgheNghiepDAO.class)
@Caption("{%tenNgheNghiep}")
@Entity
@Table(name = "NGHE_NGHIEP", schema = "BCA_MOTO")
public class NgheNghiep implements java.io.Serializable {

	private long id;
	private String tenNgheNghiep;
	private String moTa;
	private Long nguoiTao;
	private Date ngayTao;
	private Date ngaySua;
	private Long nguoiSua;
	private Boolean trangThaiKichHoat;

	public NgheNghiep() {
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

	@Caption("TenNgheNghiep")
	@Column(name = "TEN_NGHE_NGHIEP", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTenNgheNghiep() {
		return this.tenNgheNghiep;
	}

	public void setTenNgheNghiep(String tenNgheNghiep) {
		this.tenNgheNghiep = tenNgheNghiep;
	}

	@Caption("MoTa")
	@Column(name = "MO_TA", columnDefinition = "VARCHAR2", length = 100)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
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

	@Caption("NgaySua")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Caption("TrangThaiKichHoat")
	@Column(name = "TRANG_THAI_KICH_HOAT", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(Boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

}
