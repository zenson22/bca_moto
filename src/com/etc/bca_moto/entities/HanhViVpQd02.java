package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.HanhViVpQd02DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * HanhViVpQd02
 */
@DAO(daoClass = HanhViVpQd02DAO.class)
@Caption("{%noiDungVphc}")
@Entity
@Table(name = "HANH_VI_VP_QD02", schema = "BCA_MOTO")
public class HanhViVpQd02 implements java.io.Serializable {

	private long id;
	private long soBienBan;
	private long indexHvvp;
	private String noiDungVphc;
	private String luatThamChieu;
	private long loaiPtId;
	private String bienKs;
	private String ghiChu;
	private Long nguoiTaoId;
	private Long nguoiSuaId;
	private long hanhViVpId;
	private long luatTcId;
	private String soTienPhatTt;

	public HanhViVpQd02() {
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

	@Caption("IndexHvvp")
	@Column(name = "INDEX_HVVP", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getIndexHvvp() {
		return this.indexHvvp;
	}

	public void setIndexHvvp(long indexHvvp) {
		this.indexHvvp = indexHvvp;
	}

	@Caption("NoiDungVphc")
	@Column(name = "NOI_DUNG_VPHC", nullable = false, columnDefinition = "VARCHAR2", length = 500)
	public String getNoiDungVphc() {
		return this.noiDungVphc;
	}

	public void setNoiDungVphc(String noiDungVphc) {
		this.noiDungVphc = noiDungVphc;
	}

	@Caption("LuatThamChieu")
	@Column(name = "LUAT_THAM_CHIEU", columnDefinition = "VARCHAR2", length = 500)
	public String getLuatThamChieu() {
		return this.luatThamChieu;
	}

	public void setLuatThamChieu(String luatThamChieu) {
		this.luatThamChieu = luatThamChieu;
	}

	@Caption("LoaiPtId")
	@Column(name = "LOAI_PT_ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getLoaiPtId() {
		return this.loaiPtId;
	}

	public void setLoaiPtId(long loaiPtId) {
		this.loaiPtId = loaiPtId;
	}

	@Caption("BienKs")
	@Column(name = "BIEN_KS", columnDefinition = "VARCHAR2", length = 50)
	public String getBienKs() {
		return this.bienKs;
	}

	public void setBienKs(String bienKs) {
		this.bienKs = bienKs;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
	}

	@Caption("HanhViVpId")
	@Column(name = "HANH_VI_VP_ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getHanhViVpId() {
		return this.hanhViVpId;
	}

	public void setHanhViVpId(long hanhViVpId) {
		this.hanhViVpId = hanhViVpId;
	}

	@Caption("LuatTcId")
	@Column(name = "LUAT_TC_ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getLuatTcId() {
		return this.luatTcId;
	}

	public void setLuatTcId(long luatTcId) {
		this.luatTcId = luatTcId;
	}

	@Caption("SoTienPhatTt")
	@Column(name = "SO_TIEN_PHAT_TT", columnDefinition = "VARCHAR2", length = 30)
	public String getSoTienPhatTt() {
		return this.soTienPhatTt;
	}

	public void setSoTienPhatTt(String soTienPhatTt) {
		this.soTienPhatTt = soTienPhatTt;
	}

}
