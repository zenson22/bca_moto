package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QuyenNguoidungId
 */
@Embeddable
public class QuyenNguoidungId implements java.io.Serializable {

	private long id;
	private long quyenid;
	private long canBoId;
	private boolean trangThai;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean sel;
	private boolean ins;
	private boolean upd;
	private boolean del;
	private String nguoiTao;

	public QuyenNguoidungId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "QUYENID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getQuyenid() {
		return this.quyenid;
	}

	public void setQuyenid(long quyenid) {
		this.quyenid = quyenid;
	}

	@Column(name = "CAN_BO_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanBoId() {
		return this.canBoId;
	}

	public void setCanBoId(long canBoId) {
		this.canBoId = canBoId;
	}

	@Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
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

	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 200)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QuyenNguoidungId))
			return false;
		QuyenNguoidungId castOther = (QuyenNguoidungId) other;

		return (this.getId() == castOther.getId()) && (this.getQuyenid() == castOther.getQuyenid())
				&& (this.getCanBoId() == castOther.getCanBoId()) && (this.isTrangThai() == castOther.isTrangThai())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isSel() == castOther.isSel()) && (this.isIns() == castOther.isIns())
				&& (this.isUpd() == castOther.isUpd()) && (this.isDel() == castOther.isDel())
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (int) this.getQuyenid();
		result = 37 * result + (int) this.getCanBoId();
		result = 37 * result + (this.isTrangThai() ? 1 : 0);
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isSel() ? 1 : 0);
		result = 37 * result + (this.isIns() ? 1 : 0);
		result = 37 * result + (this.isUpd() ? 1 : 0);
		result = 37 * result + (this.isDel() ? 1 : 0);
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		return result;
	}

}
