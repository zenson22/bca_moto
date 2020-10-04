package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QuocTichDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * QuocTich
 */
@DAO(daoClass = QuocTichDAO.class)
@Caption("{%quocGia}")
@Entity
@Table(name = "QUOC_TICH", schema = "BCA_MOTO")
public class QuocTich implements java.io.Serializable {

	private long id;
	private String quocGia;
	private String quocTich;
	private Long maQuocGia;
	private String loaiTienTe;
	private String ghiChu;

	public QuocTich() {
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

	@Caption("QuocGia")
	@Column(name = "QUOC_GIA", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getQuocGia() {
		return this.quocGia;
	}

	public void setQuocGia(String quocGia) {
		this.quocGia = quocGia;
	}

	@Caption("QuocTich")
	@Column(name = "QUOC_TICH", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getQuocTich() {
		return this.quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	@Caption("MaQuocGia")
	@Column(name = "MA_QUOC_GIA", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMaQuocGia() {
		return this.maQuocGia;
	}

	public void setMaQuocGia(Long maQuocGia) {
		this.maQuocGia = maQuocGia;
	}

	@Caption("LoaiTienTe")
	@Column(name = "LOAI_TIEN_TE", columnDefinition = "VARCHAR2", length = 20)
	public String getLoaiTienTe() {
		return this.loaiTienTe;
	}

	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
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
