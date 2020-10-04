package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.VuViecVpDAO;
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
 * VuViecVp
 */
@DAO(daoClass = VuViecVpDAO.class)
@Caption("{%uuid}")
@Entity
@Table(name = "VU_VIEC_VP", schema = "BCA_MOTO")
public class VuViecVp implements java.io.Serializable {

	private String uuid;
	private long id;
	private Long loaiBbQd;
	private Long bbQdId;
	private String maTheoTt;
	private String maRutgon;
	private String maVuViec;
	private Long loaiPtId;
	private String bienKs;
	private String tenNvp;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private String ghiChu;
	private Long dvCsgtId;

	public VuViecVp() {
	}

	@Caption("Uuid")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "UUID", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Caption("Id")
	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("LoaiBbQd")
	@Column(name = "LOAI_BB_QD", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLoaiBbQd() {
		return this.loaiBbQd;
	}

	public void setLoaiBbQd(Long loaiBbQd) {
		this.loaiBbQd = loaiBbQd;
	}

	@Caption("BbQdId")
	@Column(name = "BB_QD_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getBbQdId() {
		return this.bbQdId;
	}

	public void setBbQdId(Long bbQdId) {
		this.bbQdId = bbQdId;
	}

	@Caption("MaTheoTt")
	@Column(name = "MA_THEO_TT", columnDefinition = "VARCHAR2", length = 100)
	public String getMaTheoTt() {
		return this.maTheoTt;
	}

	public void setMaTheoTt(String maTheoTt) {
		this.maTheoTt = maTheoTt;
	}

	@Caption("MaRutgon")
	@Column(name = "MA_RUTGON", columnDefinition = "VARCHAR2", length = 50)
	public String getMaRutgon() {
		return this.maRutgon;
	}

	public void setMaRutgon(String maRutgon) {
		this.maRutgon = maRutgon;
	}

	@Caption("MaVuViec")
	@Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 100)
	public String getMaVuViec() {
		return this.maVuViec;
	}

	public void setMaVuViec(String maVuViec) {
		this.maVuViec = maVuViec;
	}

	@Caption("LoaiPtId")
	@Column(name = "LOAI_PT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLoaiPtId() {
		return this.loaiPtId;
	}

	public void setLoaiPtId(Long loaiPtId) {
		this.loaiPtId = loaiPtId;
	}

	@Caption("BienKs")
	@Column(name = "BIEN_KS", columnDefinition = "VARCHAR2", length = 30)
	public String getBienKs() {
		return this.bienKs;
	}

	public void setBienKs(String bienKs) {
		this.bienKs = bienKs;
	}

	@Caption("TenNvp")
	@Column(name = "TEN_NVP", columnDefinition = "VARCHAR2", length = 500)
	public String getTenNvp() {
		return this.tenNvp;
	}

	public void setTenNvp(String tenNvp) {
		this.tenNvp = tenNvp;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 22, scale = 0)
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
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 22, scale = 0)
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
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 20)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("DvCsgtId")
	@Column(name = "DV_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDvCsgtId() {
		return this.dvCsgtId;
	}

	public void setDvCsgtId(Long dvCsgtId) {
		this.dvCsgtId = dvCsgtId;
	}

}
