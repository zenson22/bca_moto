package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AuthRoleResourceNmId
 */
@Embeddable
public class AuthRoleResourceNmId implements java.io.Serializable {

	private long roleId;
	private long resourceId;

	public AuthRoleResourceNmId() {
	}

	@Column(name = "ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	@Column(name = "RESOURCE_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(long resourceId) {
		this.resourceId = resourceId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AuthRoleResourceNmId))
			return false;
		AuthRoleResourceNmId castOther = (AuthRoleResourceNmId) other;

		return (this.getRoleId() == castOther.getRoleId()) && (this.getResourceId() == castOther.getResourceId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getRoleId();
		result = 37 * result + (int) this.getResourceId();
		return result;
	}

}
