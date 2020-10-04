package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MotoMaNhanHieuId
 */
@Embeddable
public class MotoMaNhanHieuId implements java.io.Serializable {

	private long id;
	private String ma;
	private String ten;
	private String ghiChu;
	private Long nhomNhanhieuid;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private Long kiemSoatSoKhung;
	private Long kiemSoatSoMay;
	private Long sapXep;

	public MotoMaNhanHieuId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "MA", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 40)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "NHOM_NHANHIEUID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNhomNhanhieuid() {
		return this.nhomNhanhieuid;
	}

	public void setNhomNhanhieuid(Long nhomNhanhieuid) {
		this.nhomNhanhieuid = nhomNhanhieuid;
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

	@Column(name = "KIEM_SOAT_SO_KHUNG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getKiemSoatSoKhung() {
		return this.kiemSoatSoKhung;
	}

	public void setKiemSoatSoKhung(Long kiemSoatSoKhung) {
		this.kiemSoatSoKhung = kiemSoatSoKhung;
	}

	@Column(name = "KIEM_SOAT_SO_MAY", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getKiemSoatSoMay() {
		return this.kiemSoatSoMay;
	}

	public void setKiemSoatSoMay(Long kiemSoatSoMay) {
		this.kiemSoatSoMay = kiemSoatSoMay;
	}

	@Column(name = "SAP_XEP", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getSapXep() {
		return this.sapXep;
	}

	public void setSapXep(Long sapXep) {
		this.sapXep = sapXep;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MotoMaNhanHieuId))
			return false;
		MotoMaNhanHieuId castOther = (MotoMaNhanHieuId) other;

		return (this.getId() == castOther.getId()) && ((this.getMa() == castOther.getMa())
				|| (this.getMa() != null && castOther.getMa() != null && this.getMa().equals(castOther.getMa())))
				&& ((this.getTen() == castOther.getTen()) || (this.getTen() != null && castOther.getTen() != null
						&& this.getTen().equals(castOther.getTen())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getNhomNhanhieuid() == castOther.getNhomNhanhieuid())
						|| (this.getNhomNhanhieuid() != null && castOther.getNhomNhanhieuid() != null
								&& this.getNhomNhanhieuid().equals(castOther.getNhomNhanhieuid())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat())
				&& ((this.getKiemSoatSoKhung() == castOther.getKiemSoatSoKhung())
						|| (this.getKiemSoatSoKhung() != null && castOther.getKiemSoatSoKhung() != null
								&& this.getKiemSoatSoKhung().equals(castOther.getKiemSoatSoKhung())))
				&& ((this.getKiemSoatSoMay() == castOther.getKiemSoatSoMay())
						|| (this.getKiemSoatSoMay() != null && castOther.getKiemSoatSoMay() != null
								&& this.getKiemSoatSoMay().equals(castOther.getKiemSoatSoMay())))
				&& ((this.getSapXep() == castOther.getSapXep()) || (this.getSapXep() != null
						&& castOther.getSapXep() != null && this.getSapXep().equals(castOther.getSapXep())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getMa() == null ? 0 : this.getMa().hashCode());
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getNhomNhanhieuid() == null ? 0 : this.getNhomNhanhieuid().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		result = 37 * result + (getKiemSoatSoKhung() == null ? 0 : this.getKiemSoatSoKhung().hashCode());
		result = 37 * result + (getKiemSoatSoMay() == null ? 0 : this.getKiemSoatSoMay().hashCode());
		result = 37 * result + (getSapXep() == null ? 0 : this.getSapXep().hashCode());
		return result;
	}

}
