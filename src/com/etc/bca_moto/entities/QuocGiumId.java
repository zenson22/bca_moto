package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QuocGiumId
 */
@Embeddable
public class QuocGiumId implements java.io.Serializable {

	private long id;
	private String ten;
	private String vietTat;
	private boolean latochucQuocte;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private String ghiChu;
	private String tenEn;
	private String tenDayDu;
	private String tenTiengViet;

	public QuocGiumId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "VIET_TAT", columnDefinition = "VARCHAR2", length = 40)
	public String getVietTat() {
		return this.vietTat;
	}

	public void setVietTat(String vietTat) {
		this.vietTat = vietTat;
	}

	@Column(name = "LATOCHUC_QUOCTE", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isLatochucQuocte() {
		return this.latochucQuocte;
	}

	public void setLatochucQuocte(boolean latochucQuocte) {
		this.latochucQuocte = latochucQuocte;
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

	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 500)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "TEN_EN", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenEn() {
		return this.tenEn;
	}

	public void setTenEn(String tenEn) {
		this.tenEn = tenEn;
	}

	@Column(name = "TEN_DAY_DU", columnDefinition = "VARCHAR2", length = 50)
	public String getTenDayDu() {
		return this.tenDayDu;
	}

	public void setTenDayDu(String tenDayDu) {
		this.tenDayDu = tenDayDu;
	}

	@Column(name = "TEN_TIENG_VIET", columnDefinition = "VARCHAR2", length = 50)
	public String getTenTiengViet() {
		return this.tenTiengViet;
	}

	public void setTenTiengViet(String tenTiengViet) {
		this.tenTiengViet = tenTiengViet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QuocGiumId))
			return false;
		QuocGiumId castOther = (QuocGiumId) other;

		return (this.getId() == castOther.getId()) && ((this.getTen() == castOther.getTen())
				|| (this.getTen() != null && castOther.getTen() != null && this.getTen().equals(castOther.getTen())))
				&& ((this.getVietTat() == castOther.getVietTat()) || (this.getVietTat() != null
						&& castOther.getVietTat() != null && this.getVietTat().equals(castOther.getVietTat())))
				&& (this.isLatochucQuocte() == castOther.isLatochucQuocte())
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat())
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getTenEn() == castOther.getTenEn()) || (this.getTenEn() != null
						&& castOther.getTenEn() != null && this.getTenEn().equals(castOther.getTenEn())))
				&& ((this.getTenDayDu() == castOther.getTenDayDu()) || (this.getTenDayDu() != null
						&& castOther.getTenDayDu() != null && this.getTenDayDu().equals(castOther.getTenDayDu())))
				&& ((this.getTenTiengViet() == castOther.getTenTiengViet())
						|| (this.getTenTiengViet() != null && castOther.getTenTiengViet() != null
								&& this.getTenTiengViet().equals(castOther.getTenTiengViet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (getVietTat() == null ? 0 : this.getVietTat().hashCode());
		result = 37 * result + (this.isLatochucQuocte() ? 1 : 0);
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getTenEn() == null ? 0 : this.getTenEn().hashCode());
		result = 37 * result + (getTenDayDu() == null ? 0 : this.getTenDayDu().hashCode());
		result = 37 * result + (getTenTiengViet() == null ? 0 : this.getTenTiengViet().hashCode());
		return result;
	}

}
