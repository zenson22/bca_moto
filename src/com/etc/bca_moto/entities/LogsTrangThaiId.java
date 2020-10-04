package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LogsTrangThaiId
 */
@Embeddable
public class LogsTrangThaiId implements java.io.Serializable {

	private long id;
	private String loai;
	private Long qdId;
	private Long trangThaiId;
	private String trangThai;
	private Long nguoiTao;
	private Date ngayTao;

	public LogsTrangThaiId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "LOAI", columnDefinition = "VARCHAR2", length = 10)
	public String getLoai() {
		return this.loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	@Column(name = "QD_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQdId() {
		return this.qdId;
	}

	public void setQdId(Long qdId) {
		this.qdId = qdId;
	}

	@Column(name = "TRANG_THAI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiId() {
		return this.trangThaiId;
	}

	public void setTrangThaiId(Long trangThaiId) {
		this.trangThaiId = trangThaiId;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 50)
	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
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
		if (!(other instanceof LogsTrangThaiId))
			return false;
		LogsTrangThaiId castOther = (LogsTrangThaiId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getLoai() == castOther.getLoai()) || (this.getLoai() != null && castOther.getLoai() != null
						&& this.getLoai().equals(castOther.getLoai())))
				&& ((this.getQdId() == castOther.getQdId()) || (this.getQdId() != null && castOther.getQdId() != null
						&& this.getQdId().equals(castOther.getQdId())))
				&& ((this.getTrangThaiId() == castOther.getTrangThaiId())
						|| (this.getTrangThaiId() != null && castOther.getTrangThaiId() != null
								&& this.getTrangThaiId().equals(castOther.getTrangThaiId())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getLoai() == null ? 0 : this.getLoai().hashCode());
		result = 37 * result + (getQdId() == null ? 0 : this.getQdId().hashCode());
		result = 37 * result + (getTrangThaiId() == null ? 0 : this.getTrangThaiId().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		return result;
	}

}
