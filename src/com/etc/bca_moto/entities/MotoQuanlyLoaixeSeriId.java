package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MotoQuanlyLoaixeSeriId
 */
@Embeddable
public class MotoQuanlyLoaixeSeriId implements java.io.Serializable {

	private Long phanloaiQuanlyId;
	private long motoLoaiXe;
	private String mauBien;
	private String ghiChu;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private long id;
	private Long motoSeriChuid;
	private boolean dangkyTam;

	public MotoQuanlyLoaixeSeriId() {
	}

	@Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getPhanloaiQuanlyId() {
		return this.phanloaiQuanlyId;
	}

	public void setPhanloaiQuanlyId(Long phanloaiQuanlyId) {
		this.phanloaiQuanlyId = phanloaiQuanlyId;
	}

	@Column(name = "MOTO_LOAI_XE", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getMotoLoaiXe() {
		return this.motoLoaiXe;
	}

	public void setMotoLoaiXe(long motoLoaiXe) {
		this.motoLoaiXe = motoLoaiXe;
	}

	@Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 120)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "MOTO_SERI_CHUID", columnDefinition = "NUMBER", scale = 0)
	public Long getMotoSeriChuid() {
		return this.motoSeriChuid;
	}

	public void setMotoSeriChuid(Long motoSeriChuid) {
		this.motoSeriChuid = motoSeriChuid;
	}

	@Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isDangkyTam() {
		return this.dangkyTam;
	}

	public void setDangkyTam(boolean dangkyTam) {
		this.dangkyTam = dangkyTam;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MotoQuanlyLoaixeSeriId))
			return false;
		MotoQuanlyLoaixeSeriId castOther = (MotoQuanlyLoaixeSeriId) other;

		return ((this.getPhanloaiQuanlyId() == castOther.getPhanloaiQuanlyId())
				|| (this.getPhanloaiQuanlyId() != null && castOther.getPhanloaiQuanlyId() != null
						&& this.getPhanloaiQuanlyId().equals(castOther.getPhanloaiQuanlyId())))
				&& (this.getMotoLoaiXe() == castOther.getMotoLoaiXe())
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat())
				&& (this.getId() == castOther.getId())
				&& ((this.getMotoSeriChuid() == castOther.getMotoSeriChuid())
						|| (this.getMotoSeriChuid() != null && castOther.getMotoSeriChuid() != null
								&& this.getMotoSeriChuid().equals(castOther.getMotoSeriChuid())))
				&& (this.isDangkyTam() == castOther.isDangkyTam());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPhanloaiQuanlyId() == null ? 0 : this.getPhanloaiQuanlyId().hashCode());
		result = 37 * result + (int) this.getMotoLoaiXe();
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		result = 37 * result + (int) this.getId();
		result = 37 * result + (getMotoSeriChuid() == null ? 0 : this.getMotoSeriChuid().hashCode());
		result = 37 * result + (this.isDangkyTam() ? 1 : 0);
		return result;
	}

}
