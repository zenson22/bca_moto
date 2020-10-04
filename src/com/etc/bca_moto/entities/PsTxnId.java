package com.etc.bca_moto.entities;

import java.util.Arrays;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PsTxnId
 */
@Embeddable
public class PsTxnId implements java.io.Serializable {

	private Long id;
	private Long parentid;
	private Long collid;
	private byte[] content;
	private Date creationDate;

	public PsTxnId() {
	}

	@Column(name = "ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "PARENTID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getParentid() {
		return this.parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	@Column(name = "COLLID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCollid() {
		return this.collid;
	}

	public void setCollid(Long collid) {
		this.collid = collid;
	}

	@Column(name = "CONTENT", columnDefinition = "BLOB")
	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	@Column(name = "CREATION_DATE", columnDefinition = "DATE", length = 7)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PsTxnId))
			return false;
		PsTxnId castOther = (PsTxnId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getParentid() == castOther.getParentid()) || (this.getParentid() != null
						&& castOther.getParentid() != null && this.getParentid().equals(castOther.getParentid())))
				&& ((this.getCollid() == castOther.getCollid()) || (this.getCollid() != null
						&& castOther.getCollid() != null && this.getCollid().equals(castOther.getCollid())))
				&& ((this.getContent() == castOther.getContent()) || (this.getContent() != null
						&& castOther.getContent() != null && Arrays.equals(this.getContent(), castOther.getContent())))
				&& ((this.getCreationDate() == castOther.getCreationDate())
						|| (this.getCreationDate() != null && castOther.getCreationDate() != null
								&& this.getCreationDate().equals(castOther.getCreationDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getParentid() == null ? 0 : this.getParentid().hashCode());
		result = 37 * result + (getCollid() == null ? 0 : this.getCollid().hashCode());
		result = 37 * result + (getContent() == null ? 0 : Arrays.hashCode(this.getContent()));
		result = 37 * result + (getCreationDate() == null ? 0 : this.getCreationDate().hashCode());
		return result;
	}

}
