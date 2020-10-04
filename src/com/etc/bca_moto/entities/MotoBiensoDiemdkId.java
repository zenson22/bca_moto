package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MotoBiensoDiemdkId
 */
@Embeddable
public class MotoBiensoDiemdkId implements java.io.Serializable {

	private String dauBienTheoTinh;
	private String seriChu;
	private Long biensoQuocgiaId;
	private String dauBienQuocGia;
	private String mauBien;
	private boolean dangkyTam;
	private String tu;
	private String den;
	private long diemDangKiId;
	private long canboPhanphoiId;
	private Date ngayPhanphoi;
	private Long nguoiSua;
	private Date ngaySua;
	private long id;
	private Long seriChuId;
	private Long conLai;
	private Long daCap;
	private Long tongSo;

	public MotoBiensoDiemdkId() {
	}

	@Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 12)
	public String getDauBienTheoTinh() {
		return this.dauBienTheoTinh;
	}

	public void setDauBienTheoTinh(String dauBienTheoTinh) {
		this.dauBienTheoTinh = dauBienTheoTinh;
	}

	@Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "BIENSO_QUOCGIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getBiensoQuocgiaId() {
		return this.biensoQuocgiaId;
	}

	public void setBiensoQuocgiaId(Long biensoQuocgiaId) {
		this.biensoQuocgiaId = biensoQuocgiaId;
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

	@Column(name = "DIEM_DANG_KI_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDiemDangKiId() {
		return this.diemDangKiId;
	}

	public void setDiemDangKiId(long diemDangKiId) {
		this.diemDangKiId = diemDangKiId;
	}

	@Column(name = "CANBO_PHANPHOI_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanboPhanphoiId() {
		return this.canboPhanphoiId;
	}

	public void setCanboPhanphoiId(long canboPhanphoiId) {
		this.canboPhanphoiId = canboPhanphoiId;
	}

	@Column(name = "NGAY_PHANPHOI", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayPhanphoi() {
		return this.ngayPhanphoi;
	}

	public void setNgayPhanphoi(Date ngayPhanphoi) {
		this.ngayPhanphoi = ngayPhanphoi;
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

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SERI_CHU_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSeriChuId() {
		return this.seriChuId;
	}

	public void setSeriChuId(Long seriChuId) {
		this.seriChuId = seriChuId;
	}

	@Column(name = "CON_LAI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getConLai() {
		return this.conLai;
	}

	public void setConLai(Long conLai) {
		this.conLai = conLai;
	}

	@Column(name = "DA_CAP", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDaCap() {
		return this.daCap;
	}

	public void setDaCap(Long daCap) {
		this.daCap = daCap;
	}

	@Column(name = "TONG_SO", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTongSo() {
		return this.tongSo;
	}

	public void setTongSo(Long tongSo) {
		this.tongSo = tongSo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MotoBiensoDiemdkId))
			return false;
		MotoBiensoDiemdkId castOther = (MotoBiensoDiemdkId) other;

		return ((this.getDauBienTheoTinh() == castOther.getDauBienTheoTinh())
				|| (this.getDauBienTheoTinh() != null && castOther.getDauBienTheoTinh() != null
						&& this.getDauBienTheoTinh().equals(castOther.getDauBienTheoTinh())))
				&& ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
						&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& ((this.getBiensoQuocgiaId() == castOther.getBiensoQuocgiaId())
						|| (this.getBiensoQuocgiaId() != null && castOther.getBiensoQuocgiaId() != null
								&& this.getBiensoQuocgiaId().equals(castOther.getBiensoQuocgiaId())))
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
				&& (this.getDiemDangKiId() == castOther.getDiemDangKiId())
				&& (this.getCanboPhanphoiId() == castOther.getCanboPhanphoiId())
				&& ((this.getNgayPhanphoi() == castOther.getNgayPhanphoi())
						|| (this.getNgayPhanphoi() != null && castOther.getNgayPhanphoi() != null
								&& this.getNgayPhanphoi().equals(castOther.getNgayPhanphoi())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.getId() == castOther.getId())
				&& ((this.getSeriChuId() == castOther.getSeriChuId()) || (this.getSeriChuId() != null
						&& castOther.getSeriChuId() != null && this.getSeriChuId().equals(castOther.getSeriChuId())))
				&& ((this.getConLai() == castOther.getConLai()) || (this.getConLai() != null
						&& castOther.getConLai() != null && this.getConLai().equals(castOther.getConLai())))
				&& ((this.getDaCap() == castOther.getDaCap()) || (this.getDaCap() != null
						&& castOther.getDaCap() != null && this.getDaCap().equals(castOther.getDaCap())))
				&& ((this.getTongSo() == castOther.getTongSo()) || (this.getTongSo() != null
						&& castOther.getTongSo() != null && this.getTongSo().equals(castOther.getTongSo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDauBienTheoTinh() == null ? 0 : this.getDauBienTheoTinh().hashCode());
		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (getBiensoQuocgiaId() == null ? 0 : this.getBiensoQuocgiaId().hashCode());
		result = 37 * result + (getDauBienQuocGia() == null ? 0 : this.getDauBienQuocGia().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (this.isDangkyTam() ? 1 : 0);
		result = 37 * result + (getTu() == null ? 0 : this.getTu().hashCode());
		result = 37 * result + (getDen() == null ? 0 : this.getDen().hashCode());
		result = 37 * result + (int) this.getDiemDangKiId();
		result = 37 * result + (int) this.getCanboPhanphoiId();
		result = 37 * result + (getNgayPhanphoi() == null ? 0 : this.getNgayPhanphoi().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSeriChuId() == null ? 0 : this.getSeriChuId().hashCode());
		result = 37 * result + (getConLai() == null ? 0 : this.getConLai().hashCode());
		result = 37 * result + (getDaCap() == null ? 0 : this.getDaCap().hashCode());
		result = 37 * result + (getTongSo() == null ? 0 : this.getTongSo().hashCode());
		return result;
	}

}
