package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BangThamsoId
 */
@Embeddable
public class BangThamsoId implements java.io.Serializable {

	private long id;
	private String vungDulieu;
	private String maThamso;
	private String dienGiai;
	private boolean thamsoNguoidung;
	private Boolean trangThai;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long bangThamsoId;
	private String ghiChu;
	private Long sapXep;

	public BangThamsoId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "VUNG_DULIEU", nullable = false, columnDefinition = "VARCHAR2", length = 120)
	public String getVungDulieu() {
		return this.vungDulieu;
	}

	public void setVungDulieu(String vungDulieu) {
		this.vungDulieu = vungDulieu;
	}

	@Column(name = "MA_THAMSO", nullable = false, columnDefinition = "VARCHAR2", length = 120)
	public String getMaThamso() {
		return this.maThamso;
	}

	public void setMaThamso(String maThamso) {
		this.maThamso = maThamso;
	}

	@Column(name = "DIEN_GIAI", nullable = false, columnDefinition = "VARCHAR2", length = 4000)
	public String getDienGiai() {
		return this.dienGiai;
	}

	public void setDienGiai(String dienGiai) {
		this.dienGiai = dienGiai;
	}

	@Column(name = "THAMSO_NGUOIDUNG", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isThamsoNguoidung() {
		return this.thamsoNguoidung;
	}

	public void setThamsoNguoidung(boolean thamsoNguoidung) {
		this.thamsoNguoidung = thamsoNguoidung;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
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

	@Column(name = "BANG_THAMSO_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getBangThamsoId() {
		return this.bangThamsoId;
	}

	public void setBangThamsoId(Long bangThamsoId) {
		this.bangThamsoId = bangThamsoId;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 4000)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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
		if (!(other instanceof BangThamsoId))
			return false;
		BangThamsoId castOther = (BangThamsoId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getVungDulieu() == castOther.getVungDulieu()) || (this.getVungDulieu() != null
						&& castOther.getVungDulieu() != null && this.getVungDulieu().equals(castOther.getVungDulieu())))
				&& ((this.getMaThamso() == castOther.getMaThamso()) || (this.getMaThamso() != null
						&& castOther.getMaThamso() != null && this.getMaThamso().equals(castOther.getMaThamso())))
				&& ((this.getDienGiai() == castOther.getDienGiai()) || (this.getDienGiai() != null
						&& castOther.getDienGiai() != null && this.getDienGiai().equals(castOther.getDienGiai())))
				&& (this.isThamsoNguoidung() == castOther.isThamsoNguoidung())
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getBangThamsoId() == castOther.getBangThamsoId())
						|| (this.getBangThamsoId() != null && castOther.getBangThamsoId() != null
								&& this.getBangThamsoId().equals(castOther.getBangThamsoId())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getSapXep() == castOther.getSapXep()) || (this.getSapXep() != null
						&& castOther.getSapXep() != null && this.getSapXep().equals(castOther.getSapXep())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getVungDulieu() == null ? 0 : this.getVungDulieu().hashCode());
		result = 37 * result + (getMaThamso() == null ? 0 : this.getMaThamso().hashCode());
		result = 37 * result + (getDienGiai() == null ? 0 : this.getDienGiai().hashCode());
		result = 37 * result + (this.isThamsoNguoidung() ? 1 : 0);
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getBangThamsoId() == null ? 0 : this.getBangThamsoId().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getSapXep() == null ? 0 : this.getSapXep().hashCode());
		return result;
	}

}
