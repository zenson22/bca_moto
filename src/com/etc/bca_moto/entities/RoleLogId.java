package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RoleLogId
 */
@Embeddable
public class RoleLogId implements java.io.Serializable {

	private long id;
	private String tableName;
	private boolean sel;
	private boolean ins;
	private boolean upd;
	private boolean del;

	public RoleLogId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TABLE_NAME", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Column(name = "SEL", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isSel() {
		return this.sel;
	}

	public void setSel(boolean sel) {
		this.sel = sel;
	}

	@Column(name = "INS", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isIns() {
		return this.ins;
	}

	public void setIns(boolean ins) {
		this.ins = ins;
	}

	@Column(name = "UPD", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isUpd() {
		return this.upd;
	}

	public void setUpd(boolean upd) {
		this.upd = upd;
	}

	@Column(name = "DEL", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isDel() {
		return this.del;
	}

	public void setDel(boolean del) {
		this.del = del;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RoleLogId))
			return false;
		RoleLogId castOther = (RoleLogId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getTableName() == castOther.getTableName()) || (this.getTableName() != null
						&& castOther.getTableName() != null && this.getTableName().equals(castOther.getTableName())))
				&& (this.isSel() == castOther.isSel()) && (this.isIns() == castOther.isIns())
				&& (this.isUpd() == castOther.isUpd()) && (this.isDel() == castOther.isDel());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTableName() == null ? 0 : this.getTableName().hashCode());
		result = 37 * result + (this.isSel() ? 1 : 0);
		result = 37 * result + (this.isIns() ? 1 : 0);
		result = 37 * result + (this.isUpd() ? 1 : 0);
		result = 37 * result + (this.isDel() ? 1 : 0);
		return result;
	}

}
