package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LogDatumId
 */
@Embeddable
public class LogDatumId implements java.io.Serializable {

	private long id;
	private String action;
	private String dataXml;
	private long logId;

	public LogDatumId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "ACTION", nullable = false, columnDefinition = "VARCHAR2", length = 12)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "DATA_XML", nullable = false, columnDefinition = "VARCHAR2", length = 1020)
	public String getDataXml() {
		return this.dataXml;
	}

	public void setDataXml(String dataXml) {
		this.dataXml = dataXml;
	}

	@Column(name = "LOG_ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getLogId() {
		return this.logId;
	}

	public void setLogId(long logId) {
		this.logId = logId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LogDatumId))
			return false;
		LogDatumId castOther = (LogDatumId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getAction() == castOther.getAction()) || (this.getAction() != null
						&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& ((this.getDataXml() == castOther.getDataXml()) || (this.getDataXml() != null
						&& castOther.getDataXml() != null && this.getDataXml().equals(castOther.getDataXml())))
				&& (this.getLogId() == castOther.getLogId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (getDataXml() == null ? 0 : this.getDataXml().hashCode());
		result = 37 * result + (int) this.getLogId();
		return result;
	}

}
