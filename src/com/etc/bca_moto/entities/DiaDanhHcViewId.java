package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DiaDanhHcViewId
 */
@Embeddable
public class DiaDanhHcViewId implements java.io.Serializable {

	private Long id;
	private String ma;
	private String ten;
	private Long ddResourseId;
	private Long capHanhChinh;
	private Long ddCapTren;

	public DiaDanhHcViewId() {
	}

	@Column(name = "ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 20)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Column(name = "TEN", columnDefinition = "VARCHAR2", length = 100)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "DD_RESOURSE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDdResourseId() {
		return this.ddResourseId;
	}

	public void setDdResourseId(Long ddResourseId) {
		this.ddResourseId = ddResourseId;
	}

	@Column(name = "CAP_HANH_CHINH", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapHanhChinh() {
		return this.capHanhChinh;
	}

	public void setCapHanhChinh(Long capHanhChinh) {
		this.capHanhChinh = capHanhChinh;
	}

	@Column(name = "DD_CAP_TREN", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDdCapTren() {
		return this.ddCapTren;
	}

	public void setDdCapTren(Long ddCapTren) {
		this.ddCapTren = ddCapTren;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DiaDanhHcViewId))
			return false;
		DiaDanhHcViewId castOther = (DiaDanhHcViewId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getMa() == castOther.getMa()) || (this.getMa() != null && castOther.getMa() != null
						&& this.getMa().equals(castOther.getMa())))
				&& ((this.getTen() == castOther.getTen()) || (this.getTen() != null && castOther.getTen() != null
						&& this.getTen().equals(castOther.getTen())))
				&& ((this.getDdResourseId() == castOther.getDdResourseId())
						|| (this.getDdResourseId() != null && castOther.getDdResourseId() != null
								&& this.getDdResourseId().equals(castOther.getDdResourseId())))
				&& ((this.getCapHanhChinh() == castOther.getCapHanhChinh())
						|| (this.getCapHanhChinh() != null && castOther.getCapHanhChinh() != null
								&& this.getCapHanhChinh().equals(castOther.getCapHanhChinh())))
				&& ((this.getDdCapTren() == castOther.getDdCapTren()) || (this.getDdCapTren() != null
						&& castOther.getDdCapTren() != null && this.getDdCapTren().equals(castOther.getDdCapTren())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getMa() == null ? 0 : this.getMa().hashCode());
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (getDdResourseId() == null ? 0 : this.getDdResourseId().hashCode());
		result = 37 * result + (getCapHanhChinh() == null ? 0 : this.getCapHanhChinh().hashCode());
		result = 37 * result + (getDdCapTren() == null ? 0 : this.getDdCapTren().hashCode());
		return result;
	}

}
