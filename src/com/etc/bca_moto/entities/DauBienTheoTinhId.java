package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DauBienTheoTinhId
 */
@Embeddable
public class DauBienTheoTinhId implements java.io.Serializable {

	private String dauBienTheoTinh;
	private long donViCsgtId;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private String ghiChu;

	public DauBienTheoTinhId() {
	}

	@Column(name = "DAU_BIEN_THEO_TINH", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 12)
	public String getDauBienTheoTinh() {
		return this.dauBienTheoTinh;
	}

	public void setDauBienTheoTinh(String dauBienTheoTinh) {
		this.dauBienTheoTinh = dauBienTheoTinh;
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

	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 2000)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DauBienTheoTinhId))
			return false;
		DauBienTheoTinhId castOther = (DauBienTheoTinhId) other;

		return ((this.getDauBienTheoTinh() == castOther.getDauBienTheoTinh())
				|| (this.getDauBienTheoTinh() != null && castOther.getDauBienTheoTinh() != null
						&& this.getDauBienTheoTinh().equals(castOther.getDauBienTheoTinh())))
				&& (this.getDonViCsgtId() == castOther.getDonViCsgtId())
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat())
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDauBienTheoTinh() == null ? 0 : this.getDauBienTheoTinh().hashCode());
		result = 37 * result + (int) this.getDonViCsgtId();
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		return result;
	}

}
