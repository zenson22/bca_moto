package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AuthRoleRoleNmId
 */
@Embeddable
public class AuthRoleRoleNmId implements java.io.Serializable {

	private long childRoleId;
	private long parentRoleId;

	public AuthRoleRoleNmId() {
	}

	@Column(name = "CHILD_ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getChildRoleId() {
		return this.childRoleId;
	}

	public void setChildRoleId(long childRoleId) {
		this.childRoleId = childRoleId;
	}

	@Column(name = "PARENT_ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getParentRoleId() {
		return this.parentRoleId;
	}

	public void setParentRoleId(long parentRoleId) {
		this.parentRoleId = parentRoleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AuthRoleRoleNmId))
			return false;
		AuthRoleRoleNmId castOther = (AuthRoleRoleNmId) other;

		return (this.getChildRoleId() == castOther.getChildRoleId())
				&& (this.getParentRoleId() == castOther.getParentRoleId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getChildRoleId();
		result = 37 * result + (int) this.getParentRoleId();
		return result;
	}

}
