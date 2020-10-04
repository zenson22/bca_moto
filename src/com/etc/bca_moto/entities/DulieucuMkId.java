package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DulieucuMkId
 */
@Embeddable
public class DulieucuMkId implements java.io.Serializable {

	private Long donViCsgtId;
	private Long canBoId;
	private String bienSo;
	private String matKhau;
	private Boolean daCap;
	private String nguoiTao;
	private Date ngayTao;
	private String nguoiSua;
	private Date ngaySua;
	private Boolean mauBien;
	private Long id;

	public DulieucuMkId() {
	}

	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "CAN_BO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getCanBoId() {
		return this.canBoId;
	}

	public void setCanBoId(Long canBoId) {
		this.canBoId = canBoId;
	}

	@Column(name = "BIEN_SO", columnDefinition = "VARCHAR2", length = 20)
	public String getBienSo() {
		return this.bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	@Column(name = "MAT_KHAU", columnDefinition = "VARCHAR2", length = 25)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Column(name = "DA_CAP", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getDaCap() {
		return this.daCap;
	}

	public void setDaCap(Boolean daCap) {
		this.daCap = daCap;
	}

	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 30)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 30)
	public String getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Column(name = "MAU_BIEN", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(Boolean mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DulieucuMkId))
			return false;
		DulieucuMkId castOther = (DulieucuMkId) other;

		return ((this.getDonViCsgtId() == castOther.getDonViCsgtId()) || (this.getDonViCsgtId() != null
				&& castOther.getDonViCsgtId() != null && this.getDonViCsgtId().equals(castOther.getDonViCsgtId())))
				&& ((this.getCanBoId() == castOther.getCanBoId()) || (this.getCanBoId() != null
						&& castOther.getCanBoId() != null && this.getCanBoId().equals(castOther.getCanBoId())))
				&& ((this.getBienSo() == castOther.getBienSo()) || (this.getBienSo() != null
						&& castOther.getBienSo() != null && this.getBienSo().equals(castOther.getBienSo())))
				&& ((this.getMatKhau() == castOther.getMatKhau()) || (this.getMatKhau() != null
						&& castOther.getMatKhau() != null && this.getMatKhau().equals(castOther.getMatKhau())))
				&& ((this.getDaCap() == castOther.getDaCap()) || (this.getDaCap() != null
						&& castOther.getDaCap() != null && this.getDaCap().equals(castOther.getDaCap())))
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& ((this.getId() == castOther.getId()) || (this.getId() != null && castOther.getId() != null
						&& this.getId().equals(castOther.getId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDonViCsgtId() == null ? 0 : this.getDonViCsgtId().hashCode());
		result = 37 * result + (getCanBoId() == null ? 0 : this.getCanBoId().hashCode());
		result = 37 * result + (getBienSo() == null ? 0 : this.getBienSo().hashCode());
		result = 37 * result + (getMatKhau() == null ? 0 : this.getMatKhau().hashCode());
		result = 37 * result + (getDaCap() == null ? 0 : this.getDaCap().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		return result;
	}

}
