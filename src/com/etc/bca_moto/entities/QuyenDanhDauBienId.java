package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QuyenDanhDauBienId
 */
@Embeddable
public class QuyenDanhDauBienId implements java.io.Serializable {

	private long id;
	private String gddvSoCongVan;
	private Date gddvNgayCongVan;
	private String gddvNguoiDuyet;
	private String gddvNoiDung;
	private String ldcSoCongVan;
	private Date ldcNgayCongVan;
	private String ldcNguoiDuyet;
	private String ldcNoiDung;
	private String ldbSoCongVan;
	private Date ldbNgayCongVan;
	private String ldbNguoiDuyet;
	private String ldbNoiDung;
	private String matKhau;
	private Long canBoId;
	private Short luongBien;
	private Date ngayTao;
	private Long nguoiTao;
	private Short soBienDaDanhDau;
	private Long soBienDaCap;
	private Date ngayDuyet;
	private String nguoiDuyet;
	private Long nguoiQuanLy;
	private Long ttDuyet;

	public QuyenDanhDauBienId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "GDDV_SO_CONG_VAN", columnDefinition = "VARCHAR2", length = 50)
	public String getGddvSoCongVan() {
		return this.gddvSoCongVan;
	}

	public void setGddvSoCongVan(String gddvSoCongVan) {
		this.gddvSoCongVan = gddvSoCongVan;
	}

	@Column(name = "GDDV_NGAY_CONG_VAN", columnDefinition = "DATE", length = 7)
	public Date getGddvNgayCongVan() {
		return this.gddvNgayCongVan;
	}

	public void setGddvNgayCongVan(Date gddvNgayCongVan) {
		this.gddvNgayCongVan = gddvNgayCongVan;
	}

	@Column(name = "GDDV_NGUOI_DUYET", columnDefinition = "VARCHAR2", length = 400)
	public String getGddvNguoiDuyet() {
		return this.gddvNguoiDuyet;
	}

	public void setGddvNguoiDuyet(String gddvNguoiDuyet) {
		this.gddvNguoiDuyet = gddvNguoiDuyet;
	}

	@Column(name = "GDDV_NOI_DUNG", columnDefinition = "VARCHAR2", length = 512)
	public String getGddvNoiDung() {
		return this.gddvNoiDung;
	}

	public void setGddvNoiDung(String gddvNoiDung) {
		this.gddvNoiDung = gddvNoiDung;
	}

	@Column(name = "LDC_SO_CONG_VAN", columnDefinition = "VARCHAR2", length = 50)
	public String getLdcSoCongVan() {
		return this.ldcSoCongVan;
	}

	public void setLdcSoCongVan(String ldcSoCongVan) {
		this.ldcSoCongVan = ldcSoCongVan;
	}

	@Column(name = "LDC_NGAY_CONG_VAN", columnDefinition = "DATE", length = 7)
	public Date getLdcNgayCongVan() {
		return this.ldcNgayCongVan;
	}

	public void setLdcNgayCongVan(Date ldcNgayCongVan) {
		this.ldcNgayCongVan = ldcNgayCongVan;
	}

	@Column(name = "LDC_NGUOI_DUYET", columnDefinition = "VARCHAR2", length = 400)
	public String getLdcNguoiDuyet() {
		return this.ldcNguoiDuyet;
	}

	public void setLdcNguoiDuyet(String ldcNguoiDuyet) {
		this.ldcNguoiDuyet = ldcNguoiDuyet;
	}

	@Column(name = "LDC_NOI_DUNG", columnDefinition = "VARCHAR2", length = 512)
	public String getLdcNoiDung() {
		return this.ldcNoiDung;
	}

	public void setLdcNoiDung(String ldcNoiDung) {
		this.ldcNoiDung = ldcNoiDung;
	}

	@Column(name = "LDB_SO_CONG_VAN", columnDefinition = "VARCHAR2", length = 50)
	public String getLdbSoCongVan() {
		return this.ldbSoCongVan;
	}

	public void setLdbSoCongVan(String ldbSoCongVan) {
		this.ldbSoCongVan = ldbSoCongVan;
	}

	@Column(name = "LDB_NGAY_CONG_VAN", columnDefinition = "DATE", length = 7)
	public Date getLdbNgayCongVan() {
		return this.ldbNgayCongVan;
	}

	public void setLdbNgayCongVan(Date ldbNgayCongVan) {
		this.ldbNgayCongVan = ldbNgayCongVan;
	}

	@Column(name = "LDB_NGUOI_DUYET", columnDefinition = "VARCHAR2", length = 400)
	public String getLdbNguoiDuyet() {
		return this.ldbNguoiDuyet;
	}

	public void setLdbNguoiDuyet(String ldbNguoiDuyet) {
		this.ldbNguoiDuyet = ldbNguoiDuyet;
	}

	@Column(name = "LDB_NOI_DUNG", columnDefinition = "VARCHAR2", length = 512)
	public String getLdbNoiDung() {
		return this.ldbNoiDung;
	}

	public void setLdbNoiDung(String ldbNoiDung) {
		this.ldbNoiDung = ldbNoiDung;
	}

	@Column(name = "MAT_KHAU", columnDefinition = "VARCHAR2", length = 25)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Column(name = "CAN_BO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getCanBoId() {
		return this.canBoId;
	}

	public void setCanBoId(Long canBoId) {
		this.canBoId = canBoId;
	}

	@Column(name = "LUONG_BIEN", columnDefinition = "NUMBER", precision = 3, scale = 0)
	public Short getLuongBien() {
		return this.luongBien;
	}

	public void setLuongBien(Short luongBien) {
		this.luongBien = luongBien;
	}

	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Column(name = "SO_BIEN_DA_DANH_DAU", columnDefinition = "NUMBER", precision = 3, scale = 0)
	public Short getSoBienDaDanhDau() {
		return this.soBienDaDanhDau;
	}

	public void setSoBienDaDanhDau(Short soBienDaDanhDau) {
		this.soBienDaDanhDau = soBienDaDanhDau;
	}

	@Column(name = "SO_BIEN_DA_CAP", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getSoBienDaCap() {
		return this.soBienDaCap;
	}

	public void setSoBienDaCap(Long soBienDaCap) {
		this.soBienDaCap = soBienDaCap;
	}

	@Column(name = "NGAY_DUYET", columnDefinition = "DATE", length = 7)
	public Date getNgayDuyet() {
		return this.ngayDuyet;
	}

	public void setNgayDuyet(Date ngayDuyet) {
		this.ngayDuyet = ngayDuyet;
	}

	@Column(name = "NGUOI_DUYET", columnDefinition = "VARCHAR2", length = 50)
	public String getNguoiDuyet() {
		return this.nguoiDuyet;
	}

	public void setNguoiDuyet(String nguoiDuyet) {
		this.nguoiDuyet = nguoiDuyet;
	}

	@Column(name = "NGUOI_QUAN_LY", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getNguoiQuanLy() {
		return this.nguoiQuanLy;
	}

	public void setNguoiQuanLy(Long nguoiQuanLy) {
		this.nguoiQuanLy = nguoiQuanLy;
	}

	@Column(name = "TT_DUYET", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTtDuyet() {
		return this.ttDuyet;
	}

	public void setTtDuyet(Long ttDuyet) {
		this.ttDuyet = ttDuyet;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QuyenDanhDauBienId))
			return false;
		QuyenDanhDauBienId castOther = (QuyenDanhDauBienId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getGddvSoCongVan() == castOther.getGddvSoCongVan())
						|| (this.getGddvSoCongVan() != null && castOther.getGddvSoCongVan() != null
								&& this.getGddvSoCongVan().equals(castOther.getGddvSoCongVan())))
				&& ((this.getGddvNgayCongVan() == castOther.getGddvNgayCongVan())
						|| (this.getGddvNgayCongVan() != null && castOther.getGddvNgayCongVan() != null
								&& this.getGddvNgayCongVan().equals(castOther.getGddvNgayCongVan())))
				&& ((this.getGddvNguoiDuyet() == castOther.getGddvNguoiDuyet())
						|| (this.getGddvNguoiDuyet() != null && castOther.getGddvNguoiDuyet() != null
								&& this.getGddvNguoiDuyet().equals(castOther.getGddvNguoiDuyet())))
				&& ((this.getGddvNoiDung() == castOther.getGddvNoiDung())
						|| (this.getGddvNoiDung() != null && castOther.getGddvNoiDung() != null
								&& this.getGddvNoiDung().equals(castOther.getGddvNoiDung())))
				&& ((this.getLdcSoCongVan() == castOther.getLdcSoCongVan())
						|| (this.getLdcSoCongVan() != null && castOther.getLdcSoCongVan() != null
								&& this.getLdcSoCongVan().equals(castOther.getLdcSoCongVan())))
				&& ((this.getLdcNgayCongVan() == castOther.getLdcNgayCongVan())
						|| (this.getLdcNgayCongVan() != null && castOther.getLdcNgayCongVan() != null
								&& this.getLdcNgayCongVan().equals(castOther.getLdcNgayCongVan())))
				&& ((this.getLdcNguoiDuyet() == castOther.getLdcNguoiDuyet())
						|| (this.getLdcNguoiDuyet() != null && castOther.getLdcNguoiDuyet() != null
								&& this.getLdcNguoiDuyet().equals(castOther.getLdcNguoiDuyet())))
				&& ((this.getLdcNoiDung() == castOther.getLdcNoiDung()) || (this.getLdcNoiDung() != null
						&& castOther.getLdcNoiDung() != null && this.getLdcNoiDung().equals(castOther.getLdcNoiDung())))
				&& ((this.getLdbSoCongVan() == castOther.getLdbSoCongVan())
						|| (this.getLdbSoCongVan() != null && castOther.getLdbSoCongVan() != null
								&& this.getLdbSoCongVan().equals(castOther.getLdbSoCongVan())))
				&& ((this.getLdbNgayCongVan() == castOther.getLdbNgayCongVan())
						|| (this.getLdbNgayCongVan() != null && castOther.getLdbNgayCongVan() != null
								&& this.getLdbNgayCongVan().equals(castOther.getLdbNgayCongVan())))
				&& ((this.getLdbNguoiDuyet() == castOther.getLdbNguoiDuyet())
						|| (this.getLdbNguoiDuyet() != null && castOther.getLdbNguoiDuyet() != null
								&& this.getLdbNguoiDuyet().equals(castOther.getLdbNguoiDuyet())))
				&& ((this.getLdbNoiDung() == castOther.getLdbNoiDung()) || (this.getLdbNoiDung() != null
						&& castOther.getLdbNoiDung() != null && this.getLdbNoiDung().equals(castOther.getLdbNoiDung())))
				&& ((this.getMatKhau() == castOther.getMatKhau()) || (this.getMatKhau() != null
						&& castOther.getMatKhau() != null && this.getMatKhau().equals(castOther.getMatKhau())))
				&& ((this.getCanBoId() == castOther.getCanBoId()) || (this.getCanBoId() != null
						&& castOther.getCanBoId() != null && this.getCanBoId().equals(castOther.getCanBoId())))
				&& ((this.getLuongBien() == castOther.getLuongBien()) || (this.getLuongBien() != null
						&& castOther.getLuongBien() != null && this.getLuongBien().equals(castOther.getLuongBien())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())))
				&& ((this.getSoBienDaDanhDau() == castOther.getSoBienDaDanhDau())
						|| (this.getSoBienDaDanhDau() != null && castOther.getSoBienDaDanhDau() != null
								&& this.getSoBienDaDanhDau().equals(castOther.getSoBienDaDanhDau())))
				&& ((this.getSoBienDaCap() == castOther.getSoBienDaCap())
						|| (this.getSoBienDaCap() != null && castOther.getSoBienDaCap() != null
								&& this.getSoBienDaCap().equals(castOther.getSoBienDaCap())))
				&& ((this.getNgayDuyet() == castOther.getNgayDuyet()) || (this.getNgayDuyet() != null
						&& castOther.getNgayDuyet() != null && this.getNgayDuyet().equals(castOther.getNgayDuyet())))
				&& ((this.getNguoiDuyet() == castOther.getNguoiDuyet()) || (this.getNguoiDuyet() != null
						&& castOther.getNguoiDuyet() != null && this.getNguoiDuyet().equals(castOther.getNguoiDuyet())))
				&& ((this.getNguoiQuanLy() == castOther.getNguoiQuanLy())
						|| (this.getNguoiQuanLy() != null && castOther.getNguoiQuanLy() != null
								&& this.getNguoiQuanLy().equals(castOther.getNguoiQuanLy())))
				&& ((this.getTtDuyet() == castOther.getTtDuyet()) || (this.getTtDuyet() != null
						&& castOther.getTtDuyet() != null && this.getTtDuyet().equals(castOther.getTtDuyet())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getGddvSoCongVan() == null ? 0 : this.getGddvSoCongVan().hashCode());
		result = 37 * result + (getGddvNgayCongVan() == null ? 0 : this.getGddvNgayCongVan().hashCode());
		result = 37 * result + (getGddvNguoiDuyet() == null ? 0 : this.getGddvNguoiDuyet().hashCode());
		result = 37 * result + (getGddvNoiDung() == null ? 0 : this.getGddvNoiDung().hashCode());
		result = 37 * result + (getLdcSoCongVan() == null ? 0 : this.getLdcSoCongVan().hashCode());
		result = 37 * result + (getLdcNgayCongVan() == null ? 0 : this.getLdcNgayCongVan().hashCode());
		result = 37 * result + (getLdcNguoiDuyet() == null ? 0 : this.getLdcNguoiDuyet().hashCode());
		result = 37 * result + (getLdcNoiDung() == null ? 0 : this.getLdcNoiDung().hashCode());
		result = 37 * result + (getLdbSoCongVan() == null ? 0 : this.getLdbSoCongVan().hashCode());
		result = 37 * result + (getLdbNgayCongVan() == null ? 0 : this.getLdbNgayCongVan().hashCode());
		result = 37 * result + (getLdbNguoiDuyet() == null ? 0 : this.getLdbNguoiDuyet().hashCode());
		result = 37 * result + (getLdbNoiDung() == null ? 0 : this.getLdbNoiDung().hashCode());
		result = 37 * result + (getMatKhau() == null ? 0 : this.getMatKhau().hashCode());
		result = 37 * result + (getCanBoId() == null ? 0 : this.getCanBoId().hashCode());
		result = 37 * result + (getLuongBien() == null ? 0 : this.getLuongBien().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getSoBienDaDanhDau() == null ? 0 : this.getSoBienDaDanhDau().hashCode());
		result = 37 * result + (getSoBienDaCap() == null ? 0 : this.getSoBienDaCap().hashCode());
		result = 37 * result + (getNgayDuyet() == null ? 0 : this.getNgayDuyet().hashCode());
		result = 37 * result + (getNguoiDuyet() == null ? 0 : this.getNguoiDuyet().hashCode());
		result = 37 * result + (getNguoiQuanLy() == null ? 0 : this.getNguoiQuanLy().hashCode());
		result = 37 * result + (getTtDuyet() == null ? 0 : this.getTtDuyet().hashCode());
		return result;
	}

}
