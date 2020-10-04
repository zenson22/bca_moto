package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TamGiuBb57DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TamGiuBb57
 */
@DAO(daoClass = TamGiuBb57DAO.class)
@Caption("{%loaiTvtg}")
@Entity
@Table(name = "TAM_GIU_BB57", schema = "BCA_MOTO")
public class TamGiuBb57 implements java.io.Serializable {

	private long id;
	private long soBienBan;
	private Long indexTvtg;
	private Long loaiTvtgId;
	private String loaiTvtg;
	private String soTvtg;
	private String hangTvtg;
	private String noiCapTvtg;
	private String hieuLucTvtg;
	private String ghiChu;
	private String tinhTrang;
	private Long soLuong;
	private String donViTinh;

	public TamGiuBb57() {
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
	@Column(name = "INDEX_TVTG", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getIndexTvtg() {
		return this.indexTvtg;
	}

	public void setIndexTvtg(Long indexTvtg) {
		this.indexTvtg = indexTvtg;
	}

	@Caption("LoaiTvtgId")
	@Column(name = "LOAI_TVTG_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLoaiTvtgId() {
		return this.loaiTvtgId;
	}

	public void setLoaiTvtgId(Long loaiTvtgId) {
		this.loaiTvtgId = loaiTvtgId;
	}

	@Caption("LoaiTvtg")
	@Column(name = "LOAI_TVTG", columnDefinition = "VARCHAR2", length = 50)
	public String getLoaiTvtg() {
		return this.loaiTvtg;
	}

	public void setLoaiTvtg(String loaiTvtg) {
		this.loaiTvtg = loaiTvtg;
	}

	@Caption("SoTvtg")
	@Column(name = "SO_TVTG", columnDefinition = "VARCHAR2", length = 20)
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

	@Caption("TinhTrang")
	@Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)
	public String getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
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

}
