package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MotoSeriChuId
 */
@Embeddable
public class MotoSeriChuId implements java.io.Serializable {

	private String seriChu;
	private boolean dangkyTam;
	private String ghiChu;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Boolean trangThaiKichHoat;
	private long id;
	private Boolean trongNuoc;

	public MotoSeriChuId() {
	}

	@Column(name = "SERI_CHU", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isDangkyTam() {
		return this.dangkyTam;
	}

	public void setDangkyTam(boolean dangkyTam) {
		this.dangkyTam = dangkyTam;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 400)
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

	@Column(name = "TRANG_THAI_KICH_HOAT", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(Boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TRONG_NUOC", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrongNuoc() {
		return this.trongNuoc;
	}

	public void setTrongNuoc(Boolean trongNuoc) {
		this.trongNuoc = trongNuoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MotoSeriChuId))
			return false;
		MotoSeriChuId castOther = (MotoSeriChuId) other;

		return ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
				&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& (this.isDangkyTam() == castOther.isDangkyTam())
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getTrangThaiKichHoat() == castOther.getTrangThaiKichHoat())
						|| (this.getTrangThaiKichHoat() != null && castOther.getTrangThaiKichHoat() != null
								&& this.getTrangThaiKichHoat().equals(castOther.getTrangThaiKichHoat())))
				&& (this.getId() == castOther.getId())
				&& ((this.getTrongNuoc() == castOther.getTrongNuoc()) || (this.getTrongNuoc() != null
						&& castOther.getTrongNuoc() != null && this.getTrongNuoc().equals(castOther.getTrongNuoc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (this.isDangkyTam() ? 1 : 0);
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getTrangThaiKichHoat() == null ? 0 : this.getTrangThaiKichHoat().hashCode());
		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTrongNuoc() == null ? 0 : this.getTrongNuoc().hashCode());
		return result;
	}

}
