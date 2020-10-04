package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TraCuuXacMinhId
 */
@Embeddable
public class TraCuuXacMinhId implements java.io.Serializable {

	private Long canBoId;
	private String thamSo;

	public TraCuuXacMinhId() {
	}

	@Column(name = "CAN_BO_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCanBoId() {
		return this.canBoId;
	}

	public void setCanBoId(Long canBoId) {
		this.canBoId = canBoId;
	}

	@Column(name = "THAM_SO", columnDefinition = "VARCHAR2", length = 4000)
	public String getThamSo() {
		return this.thamSo;
	}

	public void setThamSo(String thamSo) {
		this.thamSo = thamSo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TraCuuXacMinhId))
			return false;
		TraCuuXacMinhId castOther = (TraCuuXacMinhId) other;

		return ((this.getCanBoId() == castOther.getCanBoId()) || (this.getCanBoId() != null
				&& castOther.getCanBoId() != null && this.getCanBoId().equals(castOther.getCanBoId())))
				&& ((this.getThamSo() == castOther.getThamSo()) || (this.getThamSo() != null
						&& castOther.getThamSo() != null && this.getThamSo().equals(castOther.getThamSo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCanBoId() == null ? 0 : this.getCanBoId().hashCode());
		result = 37 * result + (getThamSo() == null ? 0 : this.getThamSo().hashCode());
		return result;
	}

}
