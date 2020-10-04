package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AuthUserGroupNmId
 */
@Embeddable
public class AuthUserGroupNmId implements java.io.Serializable {

	private long userId;
	private long groupId;

	public AuthUserGroupNmId() {
	}

	@Column(name = "USER_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "GROUP_ID", nullable = false, columnDefinition = "NUMBER", precision = 6, scale = 0)
	public long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AuthUserGroupNmId))
			return false;
		AuthUserGroupNmId castOther = (AuthUserGroupNmId) other;

		return (this.getUserId() == castOther.getUserId()) && (this.getGroupId() == castOther.getGroupId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getUserId();
		result = 37 * result + (int) this.getGroupId();
		return result;
	}

}
