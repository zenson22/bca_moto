package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TempLsMotoHsKemtheoDAO;
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
 * TempLsMotoHsKemtheo
 */
@DAO(daoClass = TempLsMotoHsKemtheoDAO.class)
@Caption("{%ten}")
@Entity
@Table(name = "TEMP_LS_MOTO_HS_KEMTHEO", schema = "BCA_MOTO")
public class TempLsMotoHsKemtheo implements java.io.Serializable {

	private long id;
	private Long motoId;
	private Short checked;
	private String ten;
	private String loaiGiayto;
	private Long mangTheo;
	private String ghiChu;
	private String ma;
	private String kieuHoSo;
	private String soGiayto;
	private Date ngayCap;
	private String noiCap;
	private String soTrang;

	public TempLsMotoHsKemtheo() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("MotoId")
	@Column(name = "MOTO_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoId() {
		return this.motoId;
	}

	public void setMotoId(Long motoId) {
		this.motoId = motoId;
	}

	@Caption("Checked")
	@Column(name = "CHECKED", columnDefinition = "NUMBER", precision = 3, scale = 0)
	public Short getChecked() {
		return this.checked;
	}

	public void setChecked(Short checked) {
		this.checked = checked;
	}

	@Caption("Ten")
	@Column(name = "TEN", columnDefinition = "VARCHAR2", length = 500)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("LoaiGiayto")
	@Column(name = "LOAI_GIAYTO", columnDefinition = "VARCHAR2", length = 30)
	public String getLoaiGiayto() {
		return this.loaiGiayto;
	}

	public void setLoaiGiayto(String loaiGiayto) {
		this.loaiGiayto = loaiGiayto;
	}

	@Caption("MangTheo")
	@Column(name = "MANG_THEO", columnDefinition = "NUMBER", scale = 0)
	public Long getMangTheo() {
		return this.mangTheo;
	}

	public void setMangTheo(Long mangTheo) {
		this.mangTheo = mangTheo;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 30)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("KieuHoSo")
	@Column(name = "KIEU_HO_SO", columnDefinition = "VARCHAR2", length = 10)
	public String getKieuHoSo() {
		return this.kieuHoSo;
	}

	public void setKieuHoSo(String kieuHoSo) {
		this.kieuHoSo = kieuHoSo;
	}

	@Caption("SoGiayto")
	@Column(name = "SO_GIAYTO", columnDefinition = "VARCHAR2", length = 30)
	public String getSoGiayto() {
		return this.soGiayto;
	}

	public void setSoGiayto(String soGiayto) {
		this.soGiayto = soGiayto;
	}

	@Caption("NgayCap")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP", columnDefinition = "DATE", length = 7)
	public Date getNgayCap() {
		return this.ngayCap;
	}

	public void setNgayCap(Date ngayCap) {
		this.ngayCap = ngayCap;
	}

	@Caption("NoiCap")
	@Column(name = "NOI_CAP", columnDefinition = "VARCHAR2", length = 40)
	public String getNoiCap() {
		return this.noiCap;
	}

	public void setNoiCap(String noiCap) {
		this.noiCap = noiCap;
	}

	@Caption("SoTrang")
	@Column(name = "SO_TRANG", columnDefinition = "VARCHAR2", length = 20)
	public String getSoTrang() {
		return this.soTrang;
	}

	public void setSoTrang(String soTrang) {
		this.soTrang = soTrang;
	}

}
