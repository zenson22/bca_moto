package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewTracuuLschId
 */
@Embeddable
public class ViewTracuuLschId implements java.io.Serializable {

	private String tenNguoiNvp;
	private Long diaDanhHcId;
	private Long soBienBan;
	private Long indexHvvp;
	private String noiDungVphc;
	private String bienKs;
	private String gplx;
	private Long loaiPtId;
	private String thoiGianVphc;
	private String diaDiemVphc;
	private String loaiPhuongTien;

	public ViewTracuuLschId() {
	}

	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getTenNguoiNvp() {
		return this.tenNguoiNvp;
	}

	public void setTenNguoiNvp(String tenNguoiNvp) {
		this.tenNguoiNvp = tenNguoiNvp;
	}

	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Column(name = "SO_BIEN_BAN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(Long soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Column(name = "INDEX_HVVP", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIndexHvvp() {
		return this.indexHvvp;
	}

	public void setIndexHvvp(Long indexHvvp) {
		this.indexHvvp = indexHvvp;
	}

	@Column(name = "NOI_DUNG_VPHC", columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDungVphc() {
		return this.noiDungVphc;
	}

	public void setNoiDungVphc(String noiDungVphc) {
		this.noiDungVphc = noiDungVphc;
	}

	@Column(name = "BIEN_KS", columnDefinition = "VARCHAR2", length = 50)
	public String getBienKs() {
		return this.bienKs;
	}

	public void setBienKs(String bienKs) {
		this.bienKs = bienKs;
	}

	@Column(name = "GPLX", columnDefinition = "VARCHAR2", length = 50)
	public String getGplx() {
		return this.gplx;
	}

	public void setGplx(String gplx) {
		this.gplx = gplx;
	}

	@Column(name = "LOAI_PT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getLoaiPtId() {
		return this.loaiPtId;
	}

	public void setLoaiPtId(Long loaiPtId) {
		this.loaiPtId = loaiPtId;
	}

	@Column(name = "THOI_GIAN_VPHC", columnDefinition = "VARCHAR2", length = 128)
	public String getThoiGianVphc() {
		return this.thoiGianVphc;
	}

	public void setThoiGianVphc(String thoiGianVphc) {
		this.thoiGianVphc = thoiGianVphc;
	}

	@Column(name = "DIA_DIEM_VPHC", columnDefinition = "VARCHAR2", length = 1824)
	public String getDiaDiemVphc() {
		return this.diaDiemVphc;
	}

	public void setDiaDiemVphc(String diaDiemVphc) {
		this.diaDiemVphc = diaDiemVphc;
	}

	@Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getLoaiPhuongTien() {
		return this.loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewTracuuLschId))
			return false;
		ViewTracuuLschId castOther = (ViewTracuuLschId) other;

		return ((this.getTenNguoiNvp() == castOther.getTenNguoiNvp()) || (this.getTenNguoiNvp() != null
				&& castOther.getTenNguoiNvp() != null && this.getTenNguoiNvp().equals(castOther.getTenNguoiNvp())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getSoBienBan() == castOther.getSoBienBan()) || (this.getSoBienBan() != null
						&& castOther.getSoBienBan() != null && this.getSoBienBan().equals(castOther.getSoBienBan())))
				&& ((this.getIndexHvvp() == castOther.getIndexHvvp()) || (this.getIndexHvvp() != null
						&& castOther.getIndexHvvp() != null && this.getIndexHvvp().equals(castOther.getIndexHvvp())))
				&& ((this.getNoiDungVphc() == castOther.getNoiDungVphc())
						|| (this.getNoiDungVphc() != null && castOther.getNoiDungVphc() != null
								&& this.getNoiDungVphc().equals(castOther.getNoiDungVphc())))
				&& ((this.getBienKs() == castOther.getBienKs()) || (this.getBienKs() != null
						&& castOther.getBienKs() != null && this.getBienKs().equals(castOther.getBienKs())))
				&& ((this.getGplx() == castOther.getGplx()) || (this.getGplx() != null && castOther.getGplx() != null
						&& this.getGplx().equals(castOther.getGplx())))
				&& ((this.getLoaiPtId() == castOther.getLoaiPtId()) || (this.getLoaiPtId() != null
						&& castOther.getLoaiPtId() != null && this.getLoaiPtId().equals(castOther.getLoaiPtId())))
				&& ((this.getThoiGianVphc() == castOther.getThoiGianVphc())
						|| (this.getThoiGianVphc() != null && castOther.getThoiGianVphc() != null
								&& this.getThoiGianVphc().equals(castOther.getThoiGianVphc())))
				&& ((this.getDiaDiemVphc() == castOther.getDiaDiemVphc())
						|| (this.getDiaDiemVphc() != null && castOther.getDiaDiemVphc() != null
								&& this.getDiaDiemVphc().equals(castOther.getDiaDiemVphc())))
				&& ((this.getLoaiPhuongTien() == castOther.getLoaiPhuongTien())
						|| (this.getLoaiPhuongTien() != null && castOther.getLoaiPhuongTien() != null
								&& this.getLoaiPhuongTien().equals(castOther.getLoaiPhuongTien())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTenNguoiNvp() == null ? 0 : this.getTenNguoiNvp().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getSoBienBan() == null ? 0 : this.getSoBienBan().hashCode());
		result = 37 * result + (getIndexHvvp() == null ? 0 : this.getIndexHvvp().hashCode());
		result = 37 * result + (getNoiDungVphc() == null ? 0 : this.getNoiDungVphc().hashCode());
		result = 37 * result + (getBienKs() == null ? 0 : this.getBienKs().hashCode());
		result = 37 * result + (getGplx() == null ? 0 : this.getGplx().hashCode());
		result = 37 * result + (getLoaiPtId() == null ? 0 : this.getLoaiPtId().hashCode());
		result = 37 * result + (getThoiGianVphc() == null ? 0 : this.getThoiGianVphc().hashCode());
		result = 37 * result + (getDiaDiemVphc() == null ? 0 : this.getDiaDiemVphc().hashCode());
		result = 37 * result + (getLoaiPhuongTien() == null ? 0 : this.getLoaiPhuongTien().hashCode());
		return result;
	}

}
