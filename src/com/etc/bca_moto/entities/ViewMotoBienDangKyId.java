package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewMotoBienDangKyId
 */
@Embeddable
public class ViewMotoBienDangKyId implements java.io.Serializable {

	private long id;
	private String diemdangky;
	private long diemDangKiId;
	private String dauBienTheoTinh;
	private String quocgia;
	private String seriChu;
	private String dauBienQuocGia;
	private String mauBien;
	private boolean dangkyTam;
	private String tu;
	private String den;
	private Long dacap;
	private Long tongSo;
	private String canboPhanphoi;
	private Date ngayPhanphoi;
	private String canboSua;
	private Date ngaySua;
	private long donViCsgtId;

	public ViewMotoBienDangKyId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "DIEMDANGKY", columnDefinition = "VARCHAR2", length = 200)
	public String getDiemdangky() {
		return this.diemdangky;
	}

	public void setDiemdangky(String diemdangky) {
		this.diemdangky = diemdangky;
	}

	@Column(name = "DIEM_DANG_KI_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDiemDangKiId() {
		return this.diemDangKiId;
	}

	public void setDiemDangKiId(long diemDangKiId) {
		this.diemDangKiId = diemDangKiId;
	}

	@Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 12)
	public String getDauBienTheoTinh() {
		return this.dauBienTheoTinh;
	}

	public void setDauBienTheoTinh(String dauBienTheoTinh) {
		this.dauBienTheoTinh = dauBienTheoTinh;
	}

	@Column(name = "QUOCGIA", columnDefinition = "VARCHAR2", length = 1020)
	public String getQuocgia() {
		return this.quocgia;
	}

	public void setQuocgia(String quocgia) {
		this.quocgia = quocgia;
	}

	@Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "DAU_BIEN_QUOC_GIA", columnDefinition = "VARCHAR2", length = 16)
	public String getDauBienQuocGia() {
		return this.dauBienQuocGia;
	}

	public void setDauBienQuocGia(String dauBienQuocGia) {
		this.dauBienQuocGia = dauBienQuocGia;
	}

	@Column(name = "MAU_BIEN", nullable = false, columnDefinition = "VARCHAR2", length = 120)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isDangkyTam() {
		return this.dangkyTam;
	}

	public void setDangkyTam(boolean dangkyTam) {
		this.dangkyTam = dangkyTam;
	}

	@Column(name = "TU", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getTu() {
		return this.tu;
	}

	public void setTu(String tu) {
		this.tu = tu;
	}

	@Column(name = "DEN", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getDen() {
		return this.den;
	}

	public void setDen(String den) {
		this.den = den;
	}

	@Column(name = "DACAP", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDacap() {
		return this.dacap;
	}

	public void setDacap(Long dacap) {
		this.dacap = dacap;
	}

	@Column(name = "TONG_SO", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTongSo() {
		return this.tongSo;
	}

	public void setTongSo(Long tongSo) {
		this.tongSo = tongSo;
	}

	@Column(name = "CANBO_PHANPHOI", columnDefinition = "VARCHAR2", length = 120)
	public String getCanboPhanphoi() {
		return this.canboPhanphoi;
	}

	public void setCanboPhanphoi(String canboPhanphoi) {
		this.canboPhanphoi = canboPhanphoi;
	}

	@Column(name = "NGAY_PHANPHOI", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayPhanphoi() {
		return this.ngayPhanphoi;
	}

	public void setNgayPhanphoi(Date ngayPhanphoi) {
		this.ngayPhanphoi = ngayPhanphoi;
	}

	@Column(name = "CANBO_SUA", columnDefinition = "VARCHAR2", length = 120)
	public String getCanboSua() {
		return this.canboSua;
	}

	public void setCanboSua(String canboSua) {
		this.canboSua = canboSua;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewMotoBienDangKyId))
			return false;
		ViewMotoBienDangKyId castOther = (ViewMotoBienDangKyId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getDiemdangky() == castOther.getDiemdangky()) || (this.getDiemdangky() != null
						&& castOther.getDiemdangky() != null && this.getDiemdangky().equals(castOther.getDiemdangky())))
				&& (this.getDiemDangKiId() == castOther.getDiemDangKiId())
				&& ((this.getDauBienTheoTinh() == castOther.getDauBienTheoTinh())
						|| (this.getDauBienTheoTinh() != null && castOther.getDauBienTheoTinh() != null
								&& this.getDauBienTheoTinh().equals(castOther.getDauBienTheoTinh())))
				&& ((this.getQuocgia() == castOther.getQuocgia()) || (this.getQuocgia() != null
						&& castOther.getQuocgia() != null && this.getQuocgia().equals(castOther.getQuocgia())))
				&& ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
						&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& ((this.getDauBienQuocGia() == castOther.getDauBienQuocGia())
						|| (this.getDauBienQuocGia() != null && castOther.getDauBienQuocGia() != null
								&& this.getDauBienQuocGia().equals(castOther.getDauBienQuocGia())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& (this.isDangkyTam() == castOther.isDangkyTam())
				&& ((this.getTu() == castOther.getTu()) || (this.getTu() != null && castOther.getTu() != null
						&& this.getTu().equals(castOther.getTu())))
				&& ((this.getDen() == castOther.getDen()) || (this.getDen() != null && castOther.getDen() != null
						&& this.getDen().equals(castOther.getDen())))
				&& ((this.getDacap() == castOther.getDacap()) || (this.getDacap() != null
						&& castOther.getDacap() != null && this.getDacap().equals(castOther.getDacap())))
				&& ((this.getTongSo() == castOther.getTongSo()) || (this.getTongSo() != null
						&& castOther.getTongSo() != null && this.getTongSo().equals(castOther.getTongSo())))
				&& ((this.getCanboPhanphoi() == castOther.getCanboPhanphoi())
						|| (this.getCanboPhanphoi() != null && castOther.getCanboPhanphoi() != null
								&& this.getCanboPhanphoi().equals(castOther.getCanboPhanphoi())))
				&& ((this.getNgayPhanphoi() == castOther.getNgayPhanphoi())
						|| (this.getNgayPhanphoi() != null && castOther.getNgayPhanphoi() != null
								&& this.getNgayPhanphoi().equals(castOther.getNgayPhanphoi())))
				&& ((this.getCanboSua() == castOther.getCanboSua()) || (this.getCanboSua() != null
						&& castOther.getCanboSua() != null && this.getCanboSua().equals(castOther.getCanboSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.getDonViCsgtId() == castOther.getDonViCsgtId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getDiemdangky() == null ? 0 : this.getDiemdangky().hashCode());
		result = 37 * result + (int) this.getDiemDangKiId();
		result = 37 * result + (getDauBienTheoTinh() == null ? 0 : this.getDauBienTheoTinh().hashCode());
		result = 37 * result + (getQuocgia() == null ? 0 : this.getQuocgia().hashCode());
		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (getDauBienQuocGia() == null ? 0 : this.getDauBienQuocGia().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (this.isDangkyTam() ? 1 : 0);
		result = 37 * result + (getTu() == null ? 0 : this.getTu().hashCode());
		result = 37 * result + (getDen() == null ? 0 : this.getDen().hashCode());
		result = 37 * result + (getDacap() == null ? 0 : this.getDacap().hashCode());
		result = 37 * result + (getTongSo() == null ? 0 : this.getTongSo().hashCode());
		result = 37 * result + (getCanboPhanphoi() == null ? 0 : this.getCanboPhanphoi().hashCode());
		result = 37 * result + (getNgayPhanphoi() == null ? 0 : this.getNgayPhanphoi().hashCode());
		result = 37 * result + (getCanboSua() == null ? 0 : this.getCanboSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (int) this.getDonViCsgtId();
		return result;
	}

}
