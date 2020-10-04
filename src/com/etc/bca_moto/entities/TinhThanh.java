package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TinhThanhDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TinhThanh
 */
@DAO(daoClass = TinhThanhDAO.class)
@Caption("{%tenTinhThanh}")
@Entity
@Table(name = "TINH_THANH", schema = "BCA_MOTO")
public class TinhThanh implements java.io.Serializable {

	private long id;
	private String tenTinhThanh;
	private String tinhLy;
	private String khuVuc;
	private String bienSo;
	private Long maVungDt;
	private Long uuTien;
	private Long thanhPho;
	private String ghiChu;

	public TinhThanh() {
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

	@Caption("TenTinhThanh")
	@Column(name = "TEN_TINH_THANH", nullable = false, columnDefinition = "VARCHAR2", length = 250)
	public String getTenTinhThanh() {
		return this.tenTinhThanh;
	}

	public void setTenTinhThanh(String tenTinhThanh) {
		this.tenTinhThanh = tenTinhThanh;
	}

	@Caption("TinhLy")
	@Column(name = "TINH_LY", columnDefinition = "VARCHAR2", length = 250)
	public String getTinhLy() {
		return this.tinhLy;
	}

	public void setTinhLy(String tinhLy) {
		this.tinhLy = tinhLy;
	}

	@Caption("KhuVuc")
	@Column(name = "KHU_VUC", columnDefinition = "VARCHAR2", length = 250)
	public String getKhuVuc() {
		return this.khuVuc;
	}

	public void setKhuVuc(String khuVuc) {
		this.khuVuc = khuVuc;
	}

	@Caption("BienSo")
	@Column(name = "BIEN_SO", columnDefinition = "VARCHAR2", length = 30)
	public String getBienSo() {
		return this.bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	@Caption("MaVungDt")
	@Column(name = "MA_VUNG_DT", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMaVungDt() {
		return this.maVungDt;
	}

	public void setMaVungDt(Long maVungDt) {
		this.maVungDt = maVungDt;
	}

	@Caption("UuTien")
	@Column(name = "UU_TIEN", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getUuTien() {
		return this.uuTien;
	}

	public void setUuTien(Long uuTien) {
		this.uuTien = uuTien;
	}

	@Caption("ThanhPho")
	@Column(name = "THANH_PHO", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getThanhPho() {
		return this.thanhPho;
	}

	public void setThanhPho(Long thanhPho) {
		this.thanhPho = thanhPho;
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
