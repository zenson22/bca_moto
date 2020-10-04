package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoTraBienDAO;
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
 * MotoTraBien
 */
@DAO(daoClass = MotoTraBienDAO.class)
@Caption("{%biensoDaydu}")
@Entity
@Table(name = "MOTO_TRA_BIEN", schema = "BCA_MOTO")
public class MotoTraBien implements java.io.Serializable {

	private long id;
	private String biensoDaydu;
	private String soKhung;
	private String soMay;
	private String lyDoTraBien;
	private String noiDung;
	private Long dauBienTinhId;
	private Long dauBienQgId;
	private Long seriChuId;
	private Long mauBienId;
	private long capLaiBien;
	private String nguoiTao;
	private Date ngayTao;
	private Long donViCsgtId;

	public MotoTraBien() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("BiensoDaydu")
	@Column(name = "BIENSO_DAYDU", nullable = false, columnDefinition = "VARCHAR2")
	public String getBiensoDaydu() {
		return this.biensoDaydu;
	}

	public void setBiensoDaydu(String biensoDaydu) {
		this.biensoDaydu = biensoDaydu;
	}

	@Caption("SoKhung")
	@Column(name = "SO_KHUNG", nullable = false, columnDefinition = "VARCHAR2")
	public String getSoKhung() {
		return this.soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	@Caption("SoMay")
	@Column(name = "SO_MAY", nullable = false, columnDefinition = "VARCHAR2")
	public String getSoMay() {
		return this.soMay;
	}

	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

	@Caption("LyDoTraBien")
	@Column(name = "LY_DO_TRA_BIEN", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getLyDoTraBien() {
		return this.lyDoTraBien;
	}

	public void setLyDoTraBien(String lyDoTraBien) {
		this.lyDoTraBien = lyDoTraBien;
	}

	@Caption("NoiDung")
	@Column(name = "NOI_DUNG", columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Caption("DauBienTinhId")
	@Column(name = "DAU_BIEN_TINH_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDauBienTinhId() {
		return this.dauBienTinhId;
	}

	public void setDauBienTinhId(Long dauBienTinhId) {
		this.dauBienTinhId = dauBienTinhId;
	}

	@Caption("DauBienQgId")
	@Column(name = "DAU_BIEN_QG_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDauBienQgId() {
		return this.dauBienQgId;
	}

	public void setDauBienQgId(Long dauBienQgId) {
		this.dauBienQgId = dauBienQgId;
	}

	@Caption("SeriChuId")
	@Column(name = "SERI_CHU_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getSeriChuId() {
		return this.seriChuId;
	}

	public void setSeriChuId(Long seriChuId) {
		this.seriChuId = seriChuId;
	}

	@Caption("MauBienId")
	@Column(name = "MAU_BIEN_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMauBienId() {
		return this.mauBienId;
	}

	public void setMauBienId(Long mauBienId) {
		this.mauBienId = mauBienId;
	}

	@Caption("CapLaiBien")
	@Column(name = "CAP_LAI_BIEN", nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getCapLaiBien() {
		return this.capLaiBien;
	}

	public void setCapLaiBien(long capLaiBien) {
		this.capLaiBien = capLaiBien;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
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

	@Caption("DonViCsgtId")
	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

}
