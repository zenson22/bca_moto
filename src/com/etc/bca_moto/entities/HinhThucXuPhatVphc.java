package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.HinhThucXuPhatVphcDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * HinhThucXuPhatVphc
 */
@DAO(daoClass = HinhThucXuPhatVphcDAO.class)
@Caption("{%tenHinhThuc}")
@Entity
@Table(name = "HINH_THUC_XU_PHAT_VPHC", schema = "BCA_MOTO")
public class HinhThucXuPhatVphc implements java.io.Serializable {

	private long id;
	private String tenHinhThuc;
	private String ghiChu;

	public HinhThucXuPhatVphc() {
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

	@Caption("TenHinhThuc")
	@Column(name = "TEN_HINH_THUC", nullable = false, columnDefinition = "VARCHAR2", length = 500)
	public String getTenHinhThuc() {
		return this.tenHinhThuc;
	}

	public void setTenHinhThuc(String tenHinhThuc) {
		this.tenHinhThuc = tenHinhThuc;
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
