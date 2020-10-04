package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TangVatTg43DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TangVatTg43
 */
@DAO(daoClass = TangVatTg43DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "TANG_VAT_TG43", schema = "BCA_MOTO")
public class TangVatTg43 implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private long indexTvtg;
	private long loaiTvtgId;
	private String loaiTvtg;
	private String soTvtg;
	private String hangTvtg;
	private String noiCapTvtg;
	private String hieuLucTvtg;
	private String ghiChu;
	private long soBbTc;
	private String tinhTrang;
	private Long soLuong;
	private String donViTinh;

	public TangVatTg43() {
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
	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(String soBienBan) {
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

	@Caption("LoaiTvtgId")
	@Column(name = "LOAI_TVTG_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getLoaiTvtgId() {
		return this.loaiTvtgId;
	}

	public void setLoaiTvtgId(long loaiTvtgId) {
		this.loaiTvtgId = loaiTvtgId;
	}

	@Caption("LoaiTvtg")
	@Column(name = "LOAI_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getLoaiTvtg() {
		return this.loaiTvtg;
	}

	public void setLoaiTvtg(String loaiTvtg) {
		this.loaiTvtg = loaiTvtg;
	}

	@Caption("SoTvtg")
	@Column(name = "SO_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getSoTvtg() {
		return this.soTvtg;
	}

	public void setSoTvtg(String soTvtg) {
		this.soTvtg = soTvtg;
	}

	@Caption("HangTvtg")
	@Column(name = "HANG_TVTG", columnDefinition = "VARCHAR2", length = 20)
	public String getHangTvtg() {
		return this.hangTvtg;
	}

	public void setHangTvtg(String hangTvtg) {
		this.hangTvtg = hangTvtg;
	}

	@Caption("NoiCapTvtg")
	@Column(name = "NOI_CAP_TVTG", columnDefinition = "VARCHAR2", length = 80)
	public String getNoiCapTvtg() {
		return this.noiCapTvtg;
	}

	public void setNoiCapTvtg(String noiCapTvtg) {
		this.noiCapTvtg = noiCapTvtg;
	}

	@Caption("HieuLucTvtg")
	@Column(name = "HIEU_LUC_TVTG", columnDefinition = "VARCHAR2", length = 20)
	public String getHieuLucTvtg() {
		return this.hieuLucTvtg;
	}

	public void setHieuLucTvtg(String hieuLucTvtg) {
		this.hieuLucTvtg = hieuLucTvtg;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("SoBbTc")
	@Column(name = "SO_BB_TC", nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getSoBbTc() {
		return this.soBbTc;
	}

	public void setSoBbTc(long soBbTc) {
		this.soBbTc = soBbTc;
	}

	@Caption("TinhTrang")
	@Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)
	public String getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Caption("SoLuong")
	@Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
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

}
