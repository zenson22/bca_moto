package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MotoKhuKtdbId
 */
@Embeddable
public class MotoKhuKtdbId implements java.io.Serializable {

	private long id;
	private String seriChu;
	private Boolean dangkyTam;
	private long donViCsgtId;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long motoSeriChuid;
	private String tenEn;
	private String ten;
	private boolean trangThaiKichHoat;

	public MotoKhuKtdbId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SERI_CHU", nullable = false, columnDefinition = "VARCHAR2", length = 8)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "DANGKY_TAM", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getDangkyTam() {
		return this.dangkyTam;
	}

	public void setDangkyTam(Boolean dangkyTam) {
		this.dangkyTam = dangkyTam;
	}

	@Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		this.nguoiTao = nguoiTao;
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

	@Column(name = "MOTO_SERI_CHUID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoSeriChuid() {
		return this.motoSeriChuid;
	}

	public void setMotoSeriChuid(Long motoSeriChuid) {
		this.motoSeriChuid = motoSeriChuid;
	}

	@Column(name = "TEN_EN", columnDefinition = "VARCHAR2", length = 30)
	public String getTenEn() {
		return this.tenEn;
	}

	public void setTenEn(String tenEn) {
		this.tenEn = tenEn;
	}

	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 30)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MotoKhuKtdbId))
			return false;
		MotoKhuKtdbId castOther = (MotoKhuKtdbId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
						&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& ((this.getDangkyTam() == castOther.getDangkyTam()) || (this.getDangkyTam() != null
						&& castOther.getDangkyTam() != null && this.getDangkyTam().equals(castOther.getDangkyTam())))
				&& (this.getDonViCsgtId() == castOther.getDonViCsgtId())
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getMotoSeriChuid() == castOther.getMotoSeriChuid())
						|| (this.getMotoSeriChuid() != null && castOther.getMotoSeriChuid() != null
								&& this.getMotoSeriChuid().equals(castOther.getMotoSeriChuid())))
				&& ((this.getTenEn() == castOther.getTenEn()) || (this.getTenEn() != null
						&& castOther.getTenEn() != null && this.getTenEn().equals(castOther.getTenEn())))
				&& ((this.getTen() == castOther.getTen()) || (this.getTen() != null && castOther.getTen() != null
						&& this.getTen().equals(castOther.getTen())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (getDangkyTam() == null ? 0 : this.getDangkyTam().hashCode());
		result = 37 * result + (int) this.getDonViCsgtId();
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getMotoSeriChuid() == null ? 0 : this.getMotoSeriChuid().hashCode());
		result = 37 * result + (getTenEn() == null ? 0 : this.getTenEn().hashCode());
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		return result;
	}

}
