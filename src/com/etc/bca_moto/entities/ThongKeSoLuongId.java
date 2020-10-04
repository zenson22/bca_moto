package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ThongKeSoLuongId
 */
@Embeddable
public class ThongKeSoLuongId implements java.io.Serializable {

	private Long dangKyMoi;
	private Long dangKyTam;
	private Long dangKyNv;
	private Long sangTen;
	private Long chuyenDi;
	private Long chuyenDen;
	private Long thuHoi;
	private Long caiTao;
	private Long traBien;
	private Long tongSoDk;
	private Long tongSoQl;
	private Date ngay;
	private Long dangKyTraBien;
	private Long donViCsgtId;
	private long id;

	public ThongKeSoLuongId() {
	}

	@Column(name = "DANG_KY_MOI", columnDefinition = "NUMBER", scale = 0)
	public Long getDangKyMoi() {
		return this.dangKyMoi;
	}

	public void setDangKyMoi(Long dangKyMoi) {
		this.dangKyMoi = dangKyMoi;
	}

	@Column(name = "DANG_KY_TAM", columnDefinition = "NUMBER", scale = 0)
	public Long getDangKyTam() {
		return this.dangKyTam;
	}

	public void setDangKyTam(Long dangKyTam) {
		this.dangKyTam = dangKyTam;
	}

	@Column(name = "DANG_KY_NV", columnDefinition = "NUMBER", scale = 0)
	public Long getDangKyNv() {
		return this.dangKyNv;
	}

	public void setDangKyNv(Long dangKyNv) {
		this.dangKyNv = dangKyNv;
	}

	@Column(name = "SANG_TEN", columnDefinition = "NUMBER", scale = 0)
	public Long getSangTen() {
		return this.sangTen;
	}

	public void setSangTen(Long sangTen) {
		this.sangTen = sangTen;
	}

	@Column(name = "CHUYEN_DI", columnDefinition = "NUMBER", scale = 0)
	public Long getChuyenDi() {
		return this.chuyenDi;
	}

	public void setChuyenDi(Long chuyenDi) {
		this.chuyenDi = chuyenDi;
	}

	@Column(name = "CHUYEN_DEN", columnDefinition = "NUMBER", scale = 0)
	public Long getChuyenDen() {
		return this.chuyenDen;
	}

	public void setChuyenDen(Long chuyenDen) {
		this.chuyenDen = chuyenDen;
	}

	@Column(name = "THU_HOI", columnDefinition = "NUMBER", scale = 0)
	public Long getThuHoi() {
		return this.thuHoi;
	}

	public void setThuHoi(Long thuHoi) {
		this.thuHoi = thuHoi;
	}

	@Column(name = "CAI_TAO", columnDefinition = "NUMBER", scale = 0)
	public Long getCaiTao() {
		return this.caiTao;
	}

	public void setCaiTao(Long caiTao) {
		this.caiTao = caiTao;
	}

	@Column(name = "TRA_BIEN", columnDefinition = "NUMBER", scale = 0)
	public Long getTraBien() {
		return this.traBien;
	}

	public void setTraBien(Long traBien) {
		this.traBien = traBien;
	}

	@Column(name = "TONG_SO_DK", columnDefinition = "NUMBER", scale = 0)
	public Long getTongSoDk() {
		return this.tongSoDk;
	}

	public void setTongSoDk(Long tongSoDk) {
		this.tongSoDk = tongSoDk;
	}

	@Column(name = "TONG_SO_QL", columnDefinition = "NUMBER", scale = 0)
	public Long getTongSoQl() {
		return this.tongSoQl;
	}

	public void setTongSoQl(Long tongSoQl) {
		this.tongSoQl = tongSoQl;
	}

	@Column(name = "NGAY", columnDefinition = "DATE", length = 7)
	public Date getNgay() {
		return this.ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	@Column(name = "DANG_KY_TRA_BIEN", columnDefinition = "NUMBER", scale = 0)
	public Long getDangKyTraBien() {
		return this.dangKyTraBien;
	}

	public void setDangKyTraBien(Long dangKyTraBien) {
		this.dangKyTraBien = dangKyTraBien;
	}

	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ThongKeSoLuongId))
			return false;
		ThongKeSoLuongId castOther = (ThongKeSoLuongId) other;

		return ((this.getDangKyMoi() == castOther.getDangKyMoi()) || (this.getDangKyMoi() != null
				&& castOther.getDangKyMoi() != null && this.getDangKyMoi().equals(castOther.getDangKyMoi())))
				&& ((this.getDangKyTam() == castOther.getDangKyTam()) || (this.getDangKyTam() != null
						&& castOther.getDangKyTam() != null && this.getDangKyTam().equals(castOther.getDangKyTam())))
				&& ((this.getDangKyNv() == castOther.getDangKyNv()) || (this.getDangKyNv() != null
						&& castOther.getDangKyNv() != null && this.getDangKyNv().equals(castOther.getDangKyNv())))
				&& ((this.getSangTen() == castOther.getSangTen()) || (this.getSangTen() != null
						&& castOther.getSangTen() != null && this.getSangTen().equals(castOther.getSangTen())))
				&& ((this.getChuyenDi() == castOther.getChuyenDi()) || (this.getChuyenDi() != null
						&& castOther.getChuyenDi() != null && this.getChuyenDi().equals(castOther.getChuyenDi())))
				&& ((this.getChuyenDen() == castOther.getChuyenDen()) || (this.getChuyenDen() != null
						&& castOther.getChuyenDen() != null && this.getChuyenDen().equals(castOther.getChuyenDen())))
				&& ((this.getThuHoi() == castOther.getThuHoi()) || (this.getThuHoi() != null
						&& castOther.getThuHoi() != null && this.getThuHoi().equals(castOther.getThuHoi())))
				&& ((this.getCaiTao() == castOther.getCaiTao()) || (this.getCaiTao() != null
						&& castOther.getCaiTao() != null && this.getCaiTao().equals(castOther.getCaiTao())))
				&& ((this.getTraBien() == castOther.getTraBien()) || (this.getTraBien() != null
						&& castOther.getTraBien() != null && this.getTraBien().equals(castOther.getTraBien())))
				&& ((this.getTongSoDk() == castOther.getTongSoDk()) || (this.getTongSoDk() != null
						&& castOther.getTongSoDk() != null && this.getTongSoDk().equals(castOther.getTongSoDk())))
				&& ((this.getTongSoQl() == castOther.getTongSoQl()) || (this.getTongSoQl() != null
						&& castOther.getTongSoQl() != null && this.getTongSoQl().equals(castOther.getTongSoQl())))
				&& ((this.getNgay() == castOther.getNgay()) || (this.getNgay() != null && castOther.getNgay() != null
						&& this.getNgay().equals(castOther.getNgay())))
				&& ((this.getDangKyTraBien() == castOther.getDangKyTraBien())
						|| (this.getDangKyTraBien() != null && castOther.getDangKyTraBien() != null
								&& this.getDangKyTraBien().equals(castOther.getDangKyTraBien())))
				&& ((this.getDonViCsgtId() == castOther.getDonViCsgtId())
						|| (this.getDonViCsgtId() != null && castOther.getDonViCsgtId() != null
								&& this.getDonViCsgtId().equals(castOther.getDonViCsgtId())))
				&& (this.getId() == castOther.getId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDangKyMoi() == null ? 0 : this.getDangKyMoi().hashCode());
		result = 37 * result + (getDangKyTam() == null ? 0 : this.getDangKyTam().hashCode());
		result = 37 * result + (getDangKyNv() == null ? 0 : this.getDangKyNv().hashCode());
		result = 37 * result + (getSangTen() == null ? 0 : this.getSangTen().hashCode());
		result = 37 * result + (getChuyenDi() == null ? 0 : this.getChuyenDi().hashCode());
		result = 37 * result + (getChuyenDen() == null ? 0 : this.getChuyenDen().hashCode());
		result = 37 * result + (getThuHoi() == null ? 0 : this.getThuHoi().hashCode());
		result = 37 * result + (getCaiTao() == null ? 0 : this.getCaiTao().hashCode());
		result = 37 * result + (getTraBien() == null ? 0 : this.getTraBien().hashCode());
		result = 37 * result + (getTongSoDk() == null ? 0 : this.getTongSoDk().hashCode());
		result = 37 * result + (getTongSoQl() == null ? 0 : this.getTongSoQl().hashCode());
		result = 37 * result + (getNgay() == null ? 0 : this.getNgay().hashCode());
		result = 37 * result + (getDangKyTraBien() == null ? 0 : this.getDangKyTraBien().hashCode());
		result = 37 * result + (getDonViCsgtId() == null ? 0 : this.getDonViCsgtId().hashCode());
		result = 37 * result + (int) this.getId();
		return result;
	}

}
