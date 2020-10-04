package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MaMauId
 */
@Embeddable
public class MaMauId implements java.io.Serializable {

	private long id;
	private String tenMau;
	private String maMau;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;

	public MaMauId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TEN_MAU", unique = true, columnDefinition = "VARCHAR2", length = 1020)
	public String getTenMau() {
		return this.tenMau;
	}

	public void setTenMau(String tenMau) {
		this.tenMau = tenMau;
	}

	@Column(name = "MA_MAU", unique = true, columnDefinition = "VARCHAR2", length = 20)
	public String getMaMau() {
		return this.maMau;
	}

	public void setMaMau(String maMau) {
		this.maMau = maMau;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MaMauId))
			return false;
		MaMauId castOther = (MaMauId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getTenMau() == castOther.getTenMau()) || (this.getTenMau() != null
						&& castOther.getTenMau() != null && this.getTenMau().equals(castOther.getTenMau())))
				&& ((this.getMaMau() == castOther.getMaMau()) || (this.getMaMau() != null
						&& castOther.getMaMau() != null && this.getMaMau().equals(castOther.getMaMau())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTenMau() == null ? 0 : this.getTenMau().hashCode());
		result = 37 * result + (getMaMau() == null ? 0 : this.getMaMau().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		return result;
	}

}
