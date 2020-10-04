package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * View1Id
 */
@Embeddable
public class View1Id implements java.io.Serializable {

	private Long soBienBan;
	private Long indexHvvp;

	public View1Id() {
	}

	@Column(name = "SO_BIEN_BAN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(Long soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Column(name = "INDEX_HVVP", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIndexHvvp() {
		return this.indexHvvp;
	}

	public void setIndexHvvp(Long indexHvvp) {
		this.indexHvvp = indexHvvp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof View1Id))
			return false;
		View1Id castOther = (View1Id) other;

		return ((this.getSoBienBan() == castOther.getSoBienBan()) || (this.getSoBienBan() != null
				&& castOther.getSoBienBan() != null && this.getSoBienBan().equals(castOther.getSoBienBan())))
				&& ((this.getIndexHvvp() == castOther.getIndexHvvp()) || (this.getIndexHvvp() != null
						&& castOther.getIndexHvvp() != null && this.getIndexHvvp().equals(castOther.getIndexHvvp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSoBienBan() == null ? 0 : this.getSoBienBan().hashCode());
		result = 37 * result + (getIndexHvvp() == null ? 0 : this.getIndexHvvp().hashCode());
		return result;
	}

}
