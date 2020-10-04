package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AuthGroupGroupNmId
 */
@Embeddable
public class AuthGroupGroupNmId implements java.io.Serializable {

	private long childGroupId;
	private long parentGroupId;

	public AuthGroupGroupNmId() {
	}

	@Column(name = "CHILD_GROUP_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getChildGroupId() {
		return this.childGroupId;
	}

	public void setChildGroupId(long childGroupId) {
		this.childGroupId = childGroupId;
	}

	@Column(name = "PARENT_GROUP_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getParentGroupId() {
		return this.parentGroupId;
	}

	public void setParentGroupId(long parentGroupId) {
		this.parentGroupId = parentGroupId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AuthGroupGroupNmId))
			return false;
		AuthGroupGroupNmId castOther = (AuthGroupGroupNmId) other;

		return (this.getChildGroupId() == castOther.getChildGroupId())
				&& (this.getParentGroupId() == castOther.getParentGroupId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getChildGroupId();
		result = 37 * result + (int) this.getParentGroupId();
		return result;
	}

}
