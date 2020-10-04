package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MaTranQuyenId
 */
@Embeddable
public class MaTranQuyenId implements java.io.Serializable {

	private long id;
	private long quyenId;
	private long roleId;
	private boolean sel;
	private boolean ins;
	private boolean upd;
	private boolean del;
	private String nguoiTao;
	private Date ngayTao;

	public MaTranQuyenId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "QUYEN_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getQuyenId() {
		return this.quyenId;
	}

	public void setQuyenId(long quyenId) {
		this.quyenId = quyenId;
	}

	@Column(name = "ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
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

	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 120)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MaTranQuyenId))
			return false;
		MaTranQuyenId castOther = (MaTranQuyenId) other;

		return (this.getId() == castOther.getId()) && (this.getQuyenId() == castOther.getQuyenId())
				&& (this.getRoleId() == castOther.getRoleId()) && (this.isSel() == castOther.isSel())
				&& (this.isIns() == castOther.isIns()) && (this.isUpd() == castOther.isUpd())
				&& (this.isDel() == castOther.isDel())
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (int) this.getQuyenId();
		result = 37 * result + (int) this.getRoleId();
		result = 37 * result + (this.isSel() ? 1 : 0);
		result = 37 * result + (this.isIns() ? 1 : 0);
		result = 37 * result + (this.isUpd() ? 1 : 0);
		result = 37 * result + (this.isDel() ? 1 : 0);
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		return result;
	}

}
