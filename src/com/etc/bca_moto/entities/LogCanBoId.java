package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LogCanBoId
 */
@Embeddable
public class LogCanBoId implements java.io.Serializable {

	private long id;
	private String tenCanBo;
	private String donVi;
	private Date thoiGianThaoTac;
	private String chucNangSuDung;
	private String moTa;
	private long canBoId;

	public LogCanBoId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TEN_CAN_BO", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenCanBo() {
		return this.tenCanBo;
	}

	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}

	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 1020)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Column(name = "THOI_GIAN_THAO_TAC", columnDefinition = "DATE", length = 7)
	public Date getThoiGianThaoTac() {
		return this.thoiGianThaoTac;
	}

	public void setThoiGianThaoTac(Date thoiGianThaoTac) {
		this.thoiGianThaoTac = thoiGianThaoTac;
	}

	@Column(name = "CHUC_NANG_SU_DUNG", columnDefinition = "VARCHAR2", length = 1020)
	public String getChucNangSuDung() {
		return this.chucNangSuDung;
	}

	public void setChucNangSuDung(String chucNangSuDung) {
		this.chucNangSuDung = chucNangSuDung;
	}

	@Column(name = "MO_TA", columnDefinition = "VARCHAR2", length = 4000)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	@Column(name = "CAN_BO_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanBoId() {
		return this.canBoId;
	}

	public void setCanBoId(long canBoId) {
		this.canBoId = canBoId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LogCanBoId))
			return false;
		LogCanBoId castOther = (LogCanBoId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getTenCanBo() == castOther.getTenCanBo()) || (this.getTenCanBo() != null
						&& castOther.getTenCanBo() != null && this.getTenCanBo().equals(castOther.getTenCanBo())))
				&& ((this.getDonVi() == castOther.getDonVi()) || (this.getDonVi() != null
						&& castOther.getDonVi() != null && this.getDonVi().equals(castOther.getDonVi())))
				&& ((this.getThoiGianThaoTac() == castOther.getThoiGianThaoTac())
						|| (this.getThoiGianThaoTac() != null && castOther.getThoiGianThaoTac() != null
								&& this.getThoiGianThaoTac().equals(castOther.getThoiGianThaoTac())))
				&& ((this.getChucNangSuDung() == castOther.getChucNangSuDung())
						|| (this.getChucNangSuDung() != null && castOther.getChucNangSuDung() != null
								&& this.getChucNangSuDung().equals(castOther.getChucNangSuDung())))
				&& ((this.getMoTa() == castOther.getMoTa()) || (this.getMoTa() != null && castOther.getMoTa() != null
						&& this.getMoTa().equals(castOther.getMoTa())))
				&& (this.getCanBoId() == castOther.getCanBoId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTenCanBo() == null ? 0 : this.getTenCanBo().hashCode());
		result = 37 * result + (getDonVi() == null ? 0 : this.getDonVi().hashCode());
		result = 37 * result + (getThoiGianThaoTac() == null ? 0 : this.getThoiGianThaoTac().hashCode());
		result = 37 * result + (getChucNangSuDung() == null ? 0 : this.getChucNangSuDung().hashCode());
		result = 37 * result + (getMoTa() == null ? 0 : this.getMoTa().hashCode());
		result = 37 * result + (int) this.getCanBoId();
		return result;
	}

}
