package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DonViCsgtId
 */
@Embeddable
public class DonViCsgtId implements java.io.Serializable {

	private long id;
	private String maDonVi;
	private String tenDonVi;
	private String diaChi;
	private String ghiChu;
	private Long dvCsgtCaptrenId;
	private long diadanhHanhchinhId;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private Boolean capDonVi;
	private Long khoangCachIn;

	public DonViCsgtId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "MA_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getMaDonVi() {
		return this.maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}

	@Column(name = "TEN_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 1020)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "DV_CSGT_CAPTREN_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDvCsgtCaptrenId() {
		return this.dvCsgtCaptrenId;
	}

	public void setDvCsgtCaptrenId(Long dvCsgtCaptrenId) {
		this.dvCsgtCaptrenId = dvCsgtCaptrenId;
	}

	@Column(name = "DIADANH_HANHCHINH_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDiadanhHanhchinhId() {
		return this.diadanhHanhchinhId;
	}

	public void setDiadanhHanhchinhId(long diadanhHanhchinhId) {
		this.diadanhHanhchinhId = diadanhHanhchinhId;
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

	@Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getCapDonVi() {
		return this.capDonVi;
	}

	public void setCapDonVi(Boolean capDonVi) {
		this.capDonVi = capDonVi;
	}

	@Column(name = "KHOANG_CACH_IN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getKhoangCachIn() {
		return this.khoangCachIn;
	}

	public void setKhoangCachIn(Long khoangCachIn) {
		this.khoangCachIn = khoangCachIn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DonViCsgtId))
			return false;
		DonViCsgtId castOther = (DonViCsgtId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getMaDonVi() == castOther.getMaDonVi()) || (this.getMaDonVi() != null
						&& castOther.getMaDonVi() != null && this.getMaDonVi().equals(castOther.getMaDonVi())))
				&& ((this.getTenDonVi() == castOther.getTenDonVi()) || (this.getTenDonVi() != null
						&& castOther.getTenDonVi() != null && this.getTenDonVi().equals(castOther.getTenDonVi())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getDvCsgtCaptrenId() == castOther.getDvCsgtCaptrenId())
						|| (this.getDvCsgtCaptrenId() != null && castOther.getDvCsgtCaptrenId() != null
								&& this.getDvCsgtCaptrenId().equals(castOther.getDvCsgtCaptrenId())))
				&& (this.getDiadanhHanhchinhId() == castOther.getDiadanhHanhchinhId())
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat())
				&& ((this.getCapDonVi() == castOther.getCapDonVi()) || (this.getCapDonVi() != null
						&& castOther.getCapDonVi() != null && this.getCapDonVi().equals(castOther.getCapDonVi())))
				&& ((this.getKhoangCachIn() == castOther.getKhoangCachIn())
						|| (this.getKhoangCachIn() != null && castOther.getKhoangCachIn() != null
								&& this.getKhoangCachIn().equals(castOther.getKhoangCachIn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getMaDonVi() == null ? 0 : this.getMaDonVi().hashCode());
		result = 37 * result + (getTenDonVi() == null ? 0 : this.getTenDonVi().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getDvCsgtCaptrenId() == null ? 0 : this.getDvCsgtCaptrenId().hashCode());
		result = 37 * result + (int) this.getDiadanhHanhchinhId();
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		result = 37 * result + (getCapDonVi() == null ? 0 : this.getCapDonVi().hashCode());
		result = 37 * result + (getKhoangCachIn() == null ? 0 : this.getKhoangCachIn().hashCode());
		return result;
	}

}
