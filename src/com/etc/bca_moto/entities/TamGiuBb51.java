package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TamGiuBb51DAO;
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
 * TamGiuBb51
 */
@DAO(daoClass = TamGiuBb51DAO.class)
@Caption("{%tenTvtg}")
@Entity
@Table(name = "TAM_GIU_BB51", schema = "BCA_MOTO")
public class TamGiuBb51 implements java.io.Serializable {

	private long id;
	private long soBienBan;
	private long indexTvtg;
	private String tenTvtg;
	private Long soLuong;
	private String donViTinh;
	private String ghiChu;
	private String tinhTrang;
	private String diaDiemTvtg;
	private Date ngayTao;

	public TamGiuBb51() {
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

	@Caption("SoBienBan")
	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(long soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Caption("IndexTvtg")
	@Column(name = "INDEX_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getIndexTvtg() {
		return this.indexTvtg;
	}

	public void setIndexTvtg(long indexTvtg) {
		this.indexTvtg = indexTvtg;
	}

	@Caption("TenTvtg")
	@Column(name = "TEN_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTenTvtg() {
		return this.tenTvtg;
	}

	public void setTenTvtg(String tenTvtg) {
		this.tenTvtg = tenTvtg;
	}

	@Caption("SoLuong")
	@Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(Long soLuong) {
		this.soLuong = soLuong;
	}

	@Caption("DonViTinh")
	@Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)
	public String getDonViTinh() {
		return this.donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("TinhTrang")
	@Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)
	public String getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Caption("DiaDiemTvtg")
	@Column(name = "DIA_DIEM_TVTG", columnDefinition = "VARCHAR2", length = 120)
	public String getDiaDiemTvtg() {
		return this.diaDiemTvtg;
	}

	public void setDiaDiemTvtg(String diaDiemTvtg) {
		this.diaDiemTvtg = diaDiemTvtg;
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

}
