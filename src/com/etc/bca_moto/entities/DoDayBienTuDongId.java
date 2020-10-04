package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DoDayBienTuDongId
 */
@Embeddable
public class DoDayBienTuDongId implements java.io.Serializable {

	private long id;
	private long donViCsgtId;
	private Long diemDkId;
	private String mauBien;
	private String seriChu;
	private Long tu;
	private Long den;
	private long luongBienCap;
	private long luongBienCon;
	private boolean trangThai;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Boolean daSuDung;
	private String dauBienTheoTinh;
	private Boolean ketThuc;
	private String dauBienQuocGia;

	public DoDayBienTuDongId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "DIEM_DK_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiemDkId() {
		return this.diemDkId;
	}

	public void setDiemDkId(Long diemDkId) {
		this.diemDkId = diemDkId;
	}

	@Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 30)
	public String getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(String mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "TU", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTu() {
		return this.tu;
	}

	public void setTu(Long tu) {
		this.tu = tu;
	}

	@Column(name = "DEN", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDen() {
		return this.den;
	}

	public void setDen(Long den) {
		this.den = den;
	}

	@Column(name = "LUONG_BIEN_CAP", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getLuongBienCap() {
		return this.luongBienCap;
	}

	public void setLuongBienCap(long luongBienCap) {
		this.luongBienCap = luongBienCap;
	}

	@Column(name = "LUONG_BIEN_CON", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getLuongBienCon() {
		return this.luongBienCon;
	}

	public void setLuongBienCon(long luongBienCon) {
		this.luongBienCon = luongBienCon;
	}

	@Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
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

	@Column(name = "DA_SU_DUNG", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getDaSuDung() {
		return this.daSuDung;
	}

	public void setDaSuDung(Boolean daSuDung) {
		this.daSuDung = daSuDung;
	}

	@Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 3)
	public String getDauBienTheoTinh() {
		return this.dauBienTheoTinh;
	}

	public void setDauBienTheoTinh(String dauBienTheoTinh) {
		this.dauBienTheoTinh = dauBienTheoTinh;
	}

	@Column(name = "KET_THUC", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getKetThuc() {
		return this.ketThuc;
	}

	public void setKetThuc(Boolean ketThuc) {
		this.ketThuc = ketThuc;
	}

	@Column(name = "DAU_BIEN_QUOC_GIA", columnDefinition = "VARCHAR2", length = 3)
	public String getDauBienQuocGia() {
		return this.dauBienQuocGia;
	}

	public void setDauBienQuocGia(String dauBienQuocGia) {
		this.dauBienQuocGia = dauBienQuocGia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DoDayBienTuDongId))
			return false;
		DoDayBienTuDongId castOther = (DoDayBienTuDongId) other;

		return (this.getId() == castOther.getId()) && (this.getDonViCsgtId() == castOther.getDonViCsgtId())
				&& ((this.getDiemDkId() == castOther.getDiemDkId()) || (this.getDiemDkId() != null
						&& castOther.getDiemDkId() != null && this.getDiemDkId().equals(castOther.getDiemDkId())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
						&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& ((this.getTu() == castOther.getTu()) || (this.getTu() != null && castOther.getTu() != null
						&& this.getTu().equals(castOther.getTu())))
				&& ((this.getDen() == castOther.getDen()) || (this.getDen() != null && castOther.getDen() != null
						&& this.getDen().equals(castOther.getDen())))
				&& (this.getLuongBienCap() == castOther.getLuongBienCap())
				&& (this.getLuongBienCon() == castOther.getLuongBienCon())
				&& (this.isTrangThai() == castOther.isTrangThai()) && (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getDaSuDung() == castOther.getDaSuDung()) || (this.getDaSuDung() != null
						&& castOther.getDaSuDung() != null && this.getDaSuDung().equals(castOther.getDaSuDung())))
				&& ((this.getDauBienTheoTinh() == castOther.getDauBienTheoTinh())
						|| (this.getDauBienTheoTinh() != null && castOther.getDauBienTheoTinh() != null
								&& this.getDauBienTheoTinh().equals(castOther.getDauBienTheoTinh())))
				&& ((this.getKetThuc() == castOther.getKetThuc()) || (this.getKetThuc() != null
						&& castOther.getKetThuc() != null && this.getKetThuc().equals(castOther.getKetThuc())))
				&& ((this.getDauBienQuocGia() == castOther.getDauBienQuocGia())
						|| (this.getDauBienQuocGia() != null && castOther.getDauBienQuocGia() != null
								&& this.getDauBienQuocGia().equals(castOther.getDauBienQuocGia())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (int) this.getDonViCsgtId();
		result = 37 * result + (getDiemDkId() == null ? 0 : this.getDiemDkId().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (getTu() == null ? 0 : this.getTu().hashCode());
		result = 37 * result + (getDen() == null ? 0 : this.getDen().hashCode());
		result = 37 * result + (int) this.getLuongBienCap();
		result = 37 * result + (int) this.getLuongBienCon();
		result = 37 * result + (this.isTrangThai() ? 1 : 0);
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getDaSuDung() == null ? 0 : this.getDaSuDung().hashCode());
		result = 37 * result + (getDauBienTheoTinh() == null ? 0 : this.getDauBienTheoTinh().hashCode());
		result = 37 * result + (getKetThuc() == null ? 0 : this.getKetThuc().hashCode());
		result = 37 * result + (getDauBienQuocGia() == null ? 0 : this.getDauBienQuocGia().hashCode());
		return result;
	}

}
