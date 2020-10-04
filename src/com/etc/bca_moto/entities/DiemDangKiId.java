package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DiemDangKiId
 */
@Embeddable
public class DiemDangKiId implements java.io.Serializable {

	private long id;
	private String ten;
	private String diaChi;
	private String loaiPtdk;
	private long donViCsgtId;
	private long diadanhHanhchinhId;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private Long soLuongBien;
	private String tenDayDu;
	private Long quanHuyenId;
	private String dong1;
	private String dong2;
	private String dong3;
	private String tcxmTieuDe1;
	private String tcxmTieuDe2;

	public DiemDangKiId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TEN", columnDefinition = "VARCHAR2", length = 200)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 400)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "LOAI_PTDK", columnDefinition = "VARCHAR2", length = 120)
	public String getLoaiPtdk() {
		return this.loaiPtdk;
	}

	public void setLoaiPtdk(String loaiPtdk) {
		this.loaiPtdk = loaiPtdk;
	}

	@Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
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

	@Column(name = "SO_LUONG_BIEN", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSoLuongBien() {
		return this.soLuongBien;
	}

	public void setSoLuongBien(Long soLuongBien) {
		this.soLuongBien = soLuongBien;
	}

	@Column(name = "TEN_DAY_DU", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenDayDu() {
		return this.tenDayDu;
	}

	public void setTenDayDu(String tenDayDu) {
		this.tenDayDu = tenDayDu;
	}

	@Column(name = "QUAN_HUYEN_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getQuanHuyenId() {
		return this.quanHuyenId;
	}

	public void setQuanHuyenId(Long quanHuyenId) {
		this.quanHuyenId = quanHuyenId;
	}

	@Column(name = "DONG1", columnDefinition = "VARCHAR2", length = 500)
	public String getDong1() {
		return this.dong1;
	}

	public void setDong1(String dong1) {
		this.dong1 = dong1;
	}

	@Column(name = "DONG2", columnDefinition = "VARCHAR2", length = 500)
	public String getDong2() {
		return this.dong2;
	}

	public void setDong2(String dong2) {
		this.dong2 = dong2;
	}

	@Column(name = "DONG3", columnDefinition = "VARCHAR2", length = 500)
	public String getDong3() {
		return this.dong3;
	}

	public void setDong3(String dong3) {
		this.dong3 = dong3;
	}

	@Column(name = "TCXM_TIEU_DE1", columnDefinition = "VARCHAR2", length = 500)
	public String getTcxmTieuDe1() {
		return this.tcxmTieuDe1;
	}

	public void setTcxmTieuDe1(String tcxmTieuDe1) {
		this.tcxmTieuDe1 = tcxmTieuDe1;
	}

	@Column(name = "TCXM_TIEU_DE2", columnDefinition = "VARCHAR2", length = 500)
	public String getTcxmTieuDe2() {
		return this.tcxmTieuDe2;
	}

	public void setTcxmTieuDe2(String tcxmTieuDe2) {
		this.tcxmTieuDe2 = tcxmTieuDe2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DiemDangKiId))
			return false;
		DiemDangKiId castOther = (DiemDangKiId) other;

		return (this.getId() == castOther.getId()) && ((this.getTen() == castOther.getTen())
				|| (this.getTen() != null && castOther.getTen() != null && this.getTen().equals(castOther.getTen())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getLoaiPtdk() == castOther.getLoaiPtdk()) || (this.getLoaiPtdk() != null
						&& castOther.getLoaiPtdk() != null && this.getLoaiPtdk().equals(castOther.getLoaiPtdk())))
				&& (this.getDonViCsgtId() == castOther.getDonViCsgtId())
				&& (this.getDiadanhHanhchinhId() == castOther.getDiadanhHanhchinhId())
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat())
				&& ((this.getSoLuongBien() == castOther.getSoLuongBien())
						|| (this.getSoLuongBien() != null && castOther.getSoLuongBien() != null
								&& this.getSoLuongBien().equals(castOther.getSoLuongBien())))
				&& ((this.getTenDayDu() == castOther.getTenDayDu()) || (this.getTenDayDu() != null
						&& castOther.getTenDayDu() != null && this.getTenDayDu().equals(castOther.getTenDayDu())))
				&& ((this.getQuanHuyenId() == castOther.getQuanHuyenId())
						|| (this.getQuanHuyenId() != null && castOther.getQuanHuyenId() != null
								&& this.getQuanHuyenId().equals(castOther.getQuanHuyenId())))
				&& ((this.getDong1() == castOther.getDong1()) || (this.getDong1() != null
						&& castOther.getDong1() != null && this.getDong1().equals(castOther.getDong1())))
				&& ((this.getDong2() == castOther.getDong2()) || (this.getDong2() != null
						&& castOther.getDong2() != null && this.getDong2().equals(castOther.getDong2())))
				&& ((this.getDong3() == castOther.getDong3()) || (this.getDong3() != null
						&& castOther.getDong3() != null && this.getDong3().equals(castOther.getDong3())))
				&& ((this.getTcxmTieuDe1() == castOther.getTcxmTieuDe1())
						|| (this.getTcxmTieuDe1() != null && castOther.getTcxmTieuDe1() != null
								&& this.getTcxmTieuDe1().equals(castOther.getTcxmTieuDe1())))
				&& ((this.getTcxmTieuDe2() == castOther.getTcxmTieuDe2())
						|| (this.getTcxmTieuDe2() != null && castOther.getTcxmTieuDe2() != null
								&& this.getTcxmTieuDe2().equals(castOther.getTcxmTieuDe2())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getLoaiPtdk() == null ? 0 : this.getLoaiPtdk().hashCode());
		result = 37 * result + (int) this.getDonViCsgtId();
		result = 37 * result + (int) this.getDiadanhHanhchinhId();
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		result = 37 * result + (getSoLuongBien() == null ? 0 : this.getSoLuongBien().hashCode());
		result = 37 * result + (getTenDayDu() == null ? 0 : this.getTenDayDu().hashCode());
		result = 37 * result + (getQuanHuyenId() == null ? 0 : this.getQuanHuyenId().hashCode());
		result = 37 * result + (getDong1() == null ? 0 : this.getDong1().hashCode());
		result = 37 * result + (getDong2() == null ? 0 : this.getDong2().hashCode());
		result = 37 * result + (getDong3() == null ? 0 : this.getDong3().hashCode());
		result = 37 * result + (getTcxmTieuDe1() == null ? 0 : this.getTcxmTieuDe1().hashCode());
		result = 37 * result + (getTcxmTieuDe2() == null ? 0 : this.getTcxmTieuDe2().hashCode());
		return result;
	}

}
