package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NoiCapViewId
 */
@Embeddable
public class NoiCapViewId implements java.io.Serializable {

	private String id;
	private String ten;
	private String loai;

	public NoiCapViewId() {
	}

	@Column(name = "ID", columnDefinition = "VARCHAR2", length = 160)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "TEN", columnDefinition = "VARCHAR2", length = 4000)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "LOAI", columnDefinition = "CHAR", length = 2)
	public String getLoai() {
		return this.loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NoiCapViewId))
			return false;
		NoiCapViewId castOther = (NoiCapViewId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getTen() == castOther.getTen()) || (this.getTen() != null && castOther.getTen() != null
						&& this.getTen().equals(castOther.getTen())))
				&& ((this.getLoai() == castOther.getLoai()) || (this.getLoai() != null && castOther.getLoai() != null
						&& this.getLoai().equals(castOther.getLoai())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (getLoai() == null ? 0 : this.getLoai().hashCode());
		return result;
	}

}
