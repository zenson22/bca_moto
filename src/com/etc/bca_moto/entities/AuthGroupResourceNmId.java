package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AuthGroupResourceNmId
 */
@Embeddable
public class AuthGroupResourceNmId implements java.io.Serializable {

	private long groupId;
	private long resourceId;

	public AuthGroupResourceNmId() {
	}

	@Column(name = "GROUP_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
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
		if (!(other instanceof AuthGroupResourceNmId))
			return false;
		AuthGroupResourceNmId castOther = (AuthGroupResourceNmId) other;

		return (this.getGroupId() == castOther.getGroupId()) && (this.getResourceId() == castOther.getResourceId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getGroupId();
		result = 37 * result + (int) this.getResourceId();
		return result;
	}

}
