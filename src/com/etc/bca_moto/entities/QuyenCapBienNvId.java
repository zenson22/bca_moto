package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QuyenCapBienNvId
 */
@Embeddable
public class QuyenCapBienNvId implements java.io.Serializable {

	private long id;
	private Long canBoId;
	private Long congVanId;
	private String matKhau;
	private Long daCap;
	private String ghiChu;
	private String soKhung;
	private String soMay;
	private Long motoBienSoId;

	public QuyenCapBienNvId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "CAN_BO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getCanBoId() {
		return this.canBoId;
	}

	public void setCanBoId(Long canBoId) {
		this.canBoId = canBoId;
	}

	@Column(name = "CONG_VAN_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getCongVanId() {
		return this.congVanId;
	}

	public void setCongVanId(Long congVanId) {
		this.congVanId = congVanId;
	}

	@Column(name = "MAT_KHAU", columnDefinition = "VARCHAR2", length = 25)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Column(name = "DA_CAP", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDaCap() {
		return this.daCap;
	}

	public void setDaCap(Long daCap) {
		this.daCap = daCap;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 500)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2", length = 26)
	public String getSoKhung() {
		return this.soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	@Column(name = "SO_MAY", columnDefinition = "VARCHAR2", length = 26)
	public String getSoMay() {
		return this.soMay;
	}

	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

	@Column(name = "MOTO_BIEN_SO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMotoBienSoId() {
		return this.motoBienSoId;
	}

	public void setMotoBienSoId(Long motoBienSoId) {
		this.motoBienSoId = motoBienSoId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QuyenCapBienNvId))
			return false;
		QuyenCapBienNvId castOther = (QuyenCapBienNvId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getCanBoId() == castOther.getCanBoId()) || (this.getCanBoId() != null
						&& castOther.getCanBoId() != null && this.getCanBoId().equals(castOther.getCanBoId())))
				&& ((this.getCongVanId() == castOther.getCongVanId()) || (this.getCongVanId() != null
						&& castOther.getCongVanId() != null && this.getCongVanId().equals(castOther.getCongVanId())))
				&& ((this.getMatKhau() == castOther.getMatKhau()) || (this.getMatKhau() != null
						&& castOther.getMatKhau() != null && this.getMatKhau().equals(castOther.getMatKhau())))
				&& ((this.getDaCap() == castOther.getDaCap()) || (this.getDaCap() != null
						&& castOther.getDaCap() != null && this.getDaCap().equals(castOther.getDaCap())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getSoKhung() == castOther.getSoKhung()) || (this.getSoKhung() != null
						&& castOther.getSoKhung() != null && this.getSoKhung().equals(castOther.getSoKhung())))
				&& ((this.getSoMay() == castOther.getSoMay()) || (this.getSoMay() != null
						&& castOther.getSoMay() != null && this.getSoMay().equals(castOther.getSoMay())))
				&& ((this.getMotoBienSoId() == castOther.getMotoBienSoId())
						|| (this.getMotoBienSoId() != null && castOther.getMotoBienSoId() != null
								&& this.getMotoBienSoId().equals(castOther.getMotoBienSoId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getCanBoId() == null ? 0 : this.getCanBoId().hashCode());
		result = 37 * result + (getCongVanId() == null ? 0 : this.getCongVanId().hashCode());
		result = 37 * result + (getMatKhau() == null ? 0 : this.getMatKhau().hashCode());
		result = 37 * result + (getDaCap() == null ? 0 : this.getDaCap().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getSoKhung() == null ? 0 : this.getSoKhung().hashCode());
		result = 37 * result + (getSoMay() == null ? 0 : this.getSoMay().hashCode());
		result = 37 * result + (getMotoBienSoId() == null ? 0 : this.getMotoBienSoId().hashCode());
		return result;
	}

}
