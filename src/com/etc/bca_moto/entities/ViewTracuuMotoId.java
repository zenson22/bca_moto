package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewTracuuMotoId
 */
@Embeddable
public class ViewTracuuMotoId implements java.io.Serializable {

	private long id;
	private String biensoDaydu;
	private String mauBien;
	private String chuSoHuu;
	private String diaChi;
	private String loaiXe;
	private String nhanHieu;
	private String mauXe;
	private Date ngayDangky;
	private Date ngayDkLandau;
	private Date ngaySua;

	public ViewTracuuMotoId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "BIENSO_DAYDU", columnDefinition = "VARCHAR2", length = 60)
	public String getBiensoDaydu() {
		return this.biensoDaydu;
	}

	public void setBiensoDaydu(String biensoDaydu) {
		this.biensoDaydu = biensoDaydu;
	}

	@Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 4000)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "CHU_SO_HUU", columnDefinition = "VARCHAR2", length = 1020)
	public String getChuSoHuu() {
		return this.chuSoHuu;
	}

	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 2048)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "LOAI_XE", columnDefinition = "VARCHAR2", length = 1020)
	public String getLoaiXe() {
		return this.loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	@Column(name = "NHAN_HIEU", columnDefinition = "VARCHAR2", length = 1020)
	public String getNhanHieu() {
		return this.nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}

	@Column(name = "MAU_XE", columnDefinition = "VARCHAR2", length = 1020)
	public String getMauXe() {
		return this.mauXe;
	}

	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}

	@Column(name = "NGAY_DANGKY", columnDefinition = "DATE", length = 7)
	public Date getNgayDangky() {
		return this.ngayDangky;
	}

	public void setNgayDangky(Date ngayDangky) {
		this.ngayDangky = ngayDangky;
	}

	@Column(name = "NGAY_DK_LANDAU", columnDefinition = "DATE", length = 7)
	public Date getNgayDkLandau() {
		return this.ngayDkLandau;
	}

	public void setNgayDkLandau(Date ngayDkLandau) {
		this.ngayDkLandau = ngayDkLandau;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewTracuuMotoId))
			return false;
		ViewTracuuMotoId castOther = (ViewTracuuMotoId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getBiensoDaydu() == castOther.getBiensoDaydu())
						|| (this.getBiensoDaydu() != null && castOther.getBiensoDaydu() != null
								&& this.getBiensoDaydu().equals(castOther.getBiensoDaydu())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& ((this.getChuSoHuu() == castOther.getChuSoHuu()) || (this.getChuSoHuu() != null
						&& castOther.getChuSoHuu() != null && this.getChuSoHuu().equals(castOther.getChuSoHuu())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getLoaiXe() == castOther.getLoaiXe()) || (this.getLoaiXe() != null
						&& castOther.getLoaiXe() != null && this.getLoaiXe().equals(castOther.getLoaiXe())))
				&& ((this.getNhanHieu() == castOther.getNhanHieu()) || (this.getNhanHieu() != null
						&& castOther.getNhanHieu() != null && this.getNhanHieu().equals(castOther.getNhanHieu())))
				&& ((this.getMauXe() == castOther.getMauXe()) || (this.getMauXe() != null
						&& castOther.getMauXe() != null && this.getMauXe().equals(castOther.getMauXe())))
				&& ((this.getNgayDangky() == castOther.getNgayDangky()) || (this.getNgayDangky() != null
						&& castOther.getNgayDangky() != null && this.getNgayDangky().equals(castOther.getNgayDangky())))
				&& ((this.getNgayDkLandau() == castOther.getNgayDkLandau())
						|| (this.getNgayDkLandau() != null && castOther.getNgayDkLandau() != null
								&& this.getNgayDkLandau().equals(castOther.getNgayDkLandau())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getBiensoDaydu() == null ? 0 : this.getBiensoDaydu().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (getChuSoHuu() == null ? 0 : this.getChuSoHuu().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getLoaiXe() == null ? 0 : this.getLoaiXe().hashCode());
		result = 37 * result + (getNhanHieu() == null ? 0 : this.getNhanHieu().hashCode());
		result = 37 * result + (getMauXe() == null ? 0 : this.getMauXe().hashCode());
		result = 37 * result + (getNgayDangky() == null ? 0 : this.getNgayDangky().hashCode());
		result = 37 * result + (getNgayDkLandau() == null ? 0 : this.getNgayDkLandau().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		return result;
	}

}
