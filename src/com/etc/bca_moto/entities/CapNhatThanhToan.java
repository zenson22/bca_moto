package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.CapNhatThanhToanDAO;
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
 * CapNhatThanhToan
 */
@DAO(daoClass = CapNhatThanhToanDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "CAP_NHAT_THANH_TOAN", schema = "BCA_MOTO")
public class CapNhatThanhToan implements java.io.Serializable {

	private String id;
	private String soThamChieu;
	private String donViThanhToan;
	private String thongTinThanhToan;
	private String bienLaiThanhToan;
	private String duongDan;
	private Date thoiGian;
	private Long donViTraGiayTo;

	public CapNhatThanhToan() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NVARCHAR2", length = 60)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Caption("SoThamChieu")
	@Column(name = "SO_THAM_CHIEU", columnDefinition = "VARCHAR2", length = 100)
	public String getSoThamChieu() {
		return this.soThamChieu;
	}

	public void setSoThamChieu(String soThamChieu) {
		this.soThamChieu = soThamChieu;
	}

	@Caption("DonViThanhToan")
	@Column(name = "DON_VI_THANH_TOAN", columnDefinition = "VARCHAR2", length = 200)
	public String getDonViThanhToan() {
		return this.donViThanhToan;
	}

	public void setDonViThanhToan(String donViThanhToan) {
		this.donViThanhToan = donViThanhToan;
	}

	@Caption("ThongTinThanhToan")
	@Column(name = "THONG_TIN_THANH_TOAN", columnDefinition = "VARCHAR2", length = 1000)
	public String getThongTinThanhToan() {
		return this.thongTinThanhToan;
	}

	public void setThongTinThanhToan(String thongTinThanhToan) {
		this.thongTinThanhToan = thongTinThanhToan;
	}

	@Caption("BienLaiThanhToan")
	@Column(name = "BIEN_LAI_THANH_TOAN", nullable = false, columnDefinition = "VARCHAR2", length = 4000)
	public String getBienLaiThanhToan() {
		return this.bienLaiThanhToan;
	}

	public void setBienLaiThanhToan(String bienLaiThanhToan) {
		this.bienLaiThanhToan = bienLaiThanhToan;
	}

	@Caption("DuongDan")
	@Column(name = "DUONG_DAN", columnDefinition = "VARCHAR2", length = 500)
	public String getDuongDan() {
		return this.duongDan;
	}

	public void setDuongDan(String duongDan) {
		this.duongDan = duongDan;
	}

	@Caption("ThoiGian")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "THOI_GIAN", columnDefinition = "TIMESTAMP(6)")
	public Date getThoiGian() {
		return this.thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

	@Caption("DonViTraGiayTo")
	@Column(name = "DON_VI_TRA_GIAY_TO", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViTraGiayTo() {
		return this.donViTraGiayTo;
	}

	public void setDonViTraGiayTo(Long donViTraGiayTo) {
		this.donViTraGiayTo = donViTraGiayTo;
	}

}
