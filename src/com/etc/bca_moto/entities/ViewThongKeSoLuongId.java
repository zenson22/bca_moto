package com.etc.bca_moto.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewThongKeSoLuongId
 */
@Embeddable
public class ViewThongKeSoLuongId implements java.io.Serializable {

	private Long donViCsgtId;
	private String ngays;
	private Long dangKyMoi;
	private Long dangKyTam;
	private Long dangKyNghiepVu;
	private Long sangTen;
	private Long chuyenDi;
	private Long chuyenDen;
	private Long thuHoi;
	private Long doiCap;
	private Long traBien;
	private Long dangKyTraBien;
	private Long tongSoDk;

	public ViewThongKeSoLuongId() {
	}

	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "NGAYS", columnDefinition = "VARCHAR2", length = 10)
	public String getNgays() {
		return this.ngays;
	}

	public void setNgays(String ngays) {
		this.ngays = ngays;
	}

	@Column(name = "DANG_KY_MOI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDangKyMoi() {
		return this.dangKyMoi;
	}

	public void setDangKyMoi(Long dangKyMoi) {
		this.dangKyMoi = dangKyMoi;
	}

	@Column(name = "DANG_KY_TAM", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDangKyTam() {
		return this.dangKyTam;
	}

	public void setDangKyTam(Long dangKyTam) {
		this.dangKyTam = dangKyTam;
	}

	@Column(name = "DANG_KY_NGHIEP_VU", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDangKyNghiepVu() {
		return this.dangKyNghiepVu;
	}

	public void setDangKyNghiepVu(Long dangKyNghiepVu) {
		this.dangKyNghiepVu = dangKyNghiepVu;
	}

	@Column(name = "SANG_TEN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getSangTen() {
		return this.sangTen;
	}

	public void setSangTen(Long sangTen) {
		this.sangTen = sangTen;
	}

	@Column(name = "CHUYEN_DI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getChuyenDi() {
		return this.chuyenDi;
	}

	public void setChuyenDi(Long chuyenDi) {
		this.chuyenDi = chuyenDi;
	}

	@Column(name = "CHUYEN_DEN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getChuyenDen() {
		return this.chuyenDen;
	}

	public void setChuyenDen(Long chuyenDen) {
		this.chuyenDen = chuyenDen;
	}

	@Column(name = "THU_HOI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getThuHoi() {
		return this.thuHoi;
	}

	public void setThuHoi(Long thuHoi) {
		this.thuHoi = thuHoi;
	}

	@Column(name = "DOI_CAP", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDoiCap() {
		return this.doiCap;
	}

	public void setDoiCap(Long doiCap) {
		this.doiCap = doiCap;
	}

	@Column(name = "TRA_BIEN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTraBien() {
		return this.traBien;
	}

	public void setTraBien(Long traBien) {
		this.traBien = traBien;
	}

	@Column(name = "DANG_KY_TRA_BIEN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDangKyTraBien() {
		return this.dangKyTraBien;
	}

	public void setDangKyTraBien(Long dangKyTraBien) {
		this.dangKyTraBien = dangKyTraBien;
	}

	@Column(name = "TONG_SO_DK", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTongSoDk() {
		return this.tongSoDk;
	}

	public void setTongSoDk(Long tongSoDk) {
		this.tongSoDk = tongSoDk;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewThongKeSoLuongId))
			return false;
		ViewThongKeSoLuongId castOther = (ViewThongKeSoLuongId) other;

		return ((this.getDonViCsgtId() == castOther.getDonViCsgtId()) || (this.getDonViCsgtId() != null
				&& castOther.getDonViCsgtId() != null && this.getDonViCsgtId().equals(castOther.getDonViCsgtId())))
				&& ((this.getNgays() == castOther.getNgays()) || (this.getNgays() != null
						&& castOther.getNgays() != null && this.getNgays().equals(castOther.getNgays())))
				&& ((this.getDangKyMoi() == castOther.getDangKyMoi()) || (this.getDangKyMoi() != null
						&& castOther.getDangKyMoi() != null && this.getDangKyMoi().equals(castOther.getDangKyMoi())))
				&& ((this.getDangKyTam() == castOther.getDangKyTam()) || (this.getDangKyTam() != null
						&& castOther.getDangKyTam() != null && this.getDangKyTam().equals(castOther.getDangKyTam())))
				&& ((this.getDangKyNghiepVu() == castOther.getDangKyNghiepVu())
						|| (this.getDangKyNghiepVu() != null && castOther.getDangKyNghiepVu() != null
								&& this.getDangKyNghiepVu().equals(castOther.getDangKyNghiepVu())))
				&& ((this.getSangTen() == castOther.getSangTen()) || (this.getSangTen() != null
						&& castOther.getSangTen() != null && this.getSangTen().equals(castOther.getSangTen())))
				&& ((this.getChuyenDi() == castOther.getChuyenDi()) || (this.getChuyenDi() != null
						&& castOther.getChuyenDi() != null && this.getChuyenDi().equals(castOther.getChuyenDi())))
				&& ((this.getChuyenDen() == castOther.getChuyenDen()) || (this.getChuyenDen() != null
						&& castOther.getChuyenDen() != null && this.getChuyenDen().equals(castOther.getChuyenDen())))
				&& ((this.getThuHoi() == castOther.getThuHoi()) || (this.getThuHoi() != null
						&& castOther.getThuHoi() != null && this.getThuHoi().equals(castOther.getThuHoi())))
				&& ((this.getDoiCap() == castOther.getDoiCap()) || (this.getDoiCap() != null
						&& castOther.getDoiCap() != null && this.getDoiCap().equals(castOther.getDoiCap())))
				&& ((this.getTraBien() == castOther.getTraBien()) || (this.getTraBien() != null
						&& castOther.getTraBien() != null && this.getTraBien().equals(castOther.getTraBien())))
				&& ((this.getDangKyTraBien() == castOther.getDangKyTraBien())
						|| (this.getDangKyTraBien() != null && castOther.getDangKyTraBien() != null
								&& this.getDangKyTraBien().equals(castOther.getDangKyTraBien())))
				&& ((this.getTongSoDk() == castOther.getTongSoDk()) || (this.getTongSoDk() != null
						&& castOther.getTongSoDk() != null && this.getTongSoDk().equals(castOther.getTongSoDk())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDonViCsgtId() == null ? 0 : this.getDonViCsgtId().hashCode());
		result = 37 * result + (getNgays() == null ? 0 : this.getNgays().hashCode());
		result = 37 * result + (getDangKyMoi() == null ? 0 : this.getDangKyMoi().hashCode());
		result = 37 * result + (getDangKyTam() == null ? 0 : this.getDangKyTam().hashCode());
		result = 37 * result + (getDangKyNghiepVu() == null ? 0 : this.getDangKyNghiepVu().hashCode());
		result = 37 * result + (getSangTen() == null ? 0 : this.getSangTen().hashCode());
		result = 37 * result + (getChuyenDi() == null ? 0 : this.getChuyenDi().hashCode());
		result = 37 * result + (getChuyenDen() == null ? 0 : this.getChuyenDen().hashCode());
		result = 37 * result + (getThuHoi() == null ? 0 : this.getThuHoi().hashCode());
		result = 37 * result + (getDoiCap() == null ? 0 : this.getDoiCap().hashCode());
		result = 37 * result + (getTraBien() == null ? 0 : this.getTraBien().hashCode());
		result = 37 * result + (getDangKyTraBien() == null ? 0 : this.getDangKyTraBien().hashCode());
		result = 37 * result + (getTongSoDk() == null ? 0 : this.getTongSoDk().hashCode());
		return result;
	}

}
