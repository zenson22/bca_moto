package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MotoMaLoaiXeId
 */
@Embeddable
public class MotoMaLoaiXeId implements java.io.Serializable {

	private long id;
	private String maLoai;
	private String tenLoai;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private long trangThaiKichHoat;
	private Long nhomXeId;
	private String dienGiai;
	private Long sapXep;
	private String inTheoMau;
	private String nhapLieuTheoMau;
	private String maLoaiXe;
	private Long motoMaLoaiXeId;
	private String tenLoaiXe;

	public MotoMaLoaiXeId() {
	}

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "MA_LOAI", columnDefinition = "VARCHAR2", length = 80)
	public String getMaLoai() {
		return this.maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	@Column(name = "TEN_LOAI", nullable = false, columnDefinition = "VARCHAR2", length = 1020)
	public String getTenLoai() {
		return this.tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
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

	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(long trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Column(name = "NHOM_XE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNhomXeId() {
		return this.nhomXeId;
	}

	public void setNhomXeId(Long nhomXeId) {
		this.nhomXeId = nhomXeId;
	}

	@Column(name = "DIEN_GIAI", columnDefinition = "VARCHAR2", length = 1024)
	public String getDienGiai() {
		return this.dienGiai;
	}

	public void setDienGiai(String dienGiai) {
		this.dienGiai = dienGiai;
	}

	@Column(name = "SAP_XEP", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getSapXep() {
		return this.sapXep;
	}

	public void setSapXep(Long sapXep) {
		this.sapXep = sapXep;
	}

	@Column(name = "IN_THEO_MAU", columnDefinition = "VARCHAR2", length = 2)
	public String getInTheoMau() {
		return this.inTheoMau;
	}

	public void setInTheoMau(String inTheoMau) {
		this.inTheoMau = inTheoMau;
	}

	@Column(name = "NHAP_LIEU_THEO_MAU", columnDefinition = "VARCHAR2", length = 2)
	public String getNhapLieuTheoMau() {
		return this.nhapLieuTheoMau;
	}

	public void setNhapLieuTheoMau(String nhapLieuTheoMau) {
		this.nhapLieuTheoMau = nhapLieuTheoMau;
	}

	@Column(name = "MA_LOAI_XE", columnDefinition = "VARCHAR2", length = 20)
	public String getMaLoaiXe() {
		return this.maLoaiXe;
	}

	public void setMaLoaiXe(String maLoaiXe) {
		this.maLoaiXe = maLoaiXe;
	}

	@Column(name = "MOTO_MA_LOAI_XE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMotoMaLoaiXeId() {
		return this.motoMaLoaiXeId;
	}

	public void setMotoMaLoaiXeId(Long motoMaLoaiXeId) {
		this.motoMaLoaiXeId = motoMaLoaiXeId;
	}

	@Column(name = "TEN_LOAI_XE", columnDefinition = "VARCHAR2", length = 1020)
	public String getTenLoaiXe() {
		return this.tenLoaiXe;
	}

	public void setTenLoaiXe(String tenLoaiXe) {
		this.tenLoaiXe = tenLoaiXe;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MotoMaLoaiXeId))
			return false;
		MotoMaLoaiXeId castOther = (MotoMaLoaiXeId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getMaLoai() == castOther.getMaLoai()) || (this.getMaLoai() != null
						&& castOther.getMaLoai() != null && this.getMaLoai().equals(castOther.getMaLoai())))
				&& ((this.getTenLoai() == castOther.getTenLoai()) || (this.getTenLoai() != null
						&& castOther.getTenLoai() != null && this.getTenLoai().equals(castOther.getTenLoai())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.getTrangThaiKichHoat() == castOther.getTrangThaiKichHoat())
				&& ((this.getNhomXeId() == castOther.getNhomXeId()) || (this.getNhomXeId() != null
						&& castOther.getNhomXeId() != null && this.getNhomXeId().equals(castOther.getNhomXeId())))
				&& ((this.getDienGiai() == castOther.getDienGiai()) || (this.getDienGiai() != null
						&& castOther.getDienGiai() != null && this.getDienGiai().equals(castOther.getDienGiai())))
				&& ((this.getSapXep() == castOther.getSapXep()) || (this.getSapXep() != null
						&& castOther.getSapXep() != null && this.getSapXep().equals(castOther.getSapXep())))
				&& ((this.getInTheoMau() == castOther.getInTheoMau()) || (this.getInTheoMau() != null
						&& castOther.getInTheoMau() != null && this.getInTheoMau().equals(castOther.getInTheoMau())))
				&& ((this.getNhapLieuTheoMau() == castOther.getNhapLieuTheoMau())
						|| (this.getNhapLieuTheoMau() != null && castOther.getNhapLieuTheoMau() != null
								&& this.getNhapLieuTheoMau().equals(castOther.getNhapLieuTheoMau())))
				&& ((this.getMaLoaiXe() == castOther.getMaLoaiXe()) || (this.getMaLoaiXe() != null
						&& castOther.getMaLoaiXe() != null && this.getMaLoaiXe().equals(castOther.getMaLoaiXe())))
				&& ((this.getMotoMaLoaiXeId() == castOther.getMotoMaLoaiXeId())
						|| (this.getMotoMaLoaiXeId() != null && castOther.getMotoMaLoaiXeId() != null
								&& this.getMotoMaLoaiXeId().equals(castOther.getMotoMaLoaiXeId())))
				&& ((this.getTenLoaiXe() == castOther.getTenLoaiXe()) || (this.getTenLoaiXe() != null
						&& castOther.getTenLoaiXe() != null && this.getTenLoaiXe().equals(castOther.getTenLoaiXe())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getMaLoai() == null ? 0 : this.getMaLoai().hashCode());
		result = 37 * result + (getTenLoai() == null ? 0 : this.getTenLoai().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (int) this.getTrangThaiKichHoat();
		result = 37 * result + (getNhomXeId() == null ? 0 : this.getNhomXeId().hashCode());
		result = 37 * result + (getDienGiai() == null ? 0 : this.getDienGiai().hashCode());
		result = 37 * result + (getSapXep() == null ? 0 : this.getSapXep().hashCode());
		result = 37 * result + (getInTheoMau() == null ? 0 : this.getInTheoMau().hashCode());
		result = 37 * result + (getNhapLieuTheoMau() == null ? 0 : this.getNhapLieuTheoMau().hashCode());
		result = 37 * result + (getMaLoaiXe() == null ? 0 : this.getMaLoaiXe().hashCode());
		result = 37 * result + (getMotoMaLoaiXeId() == null ? 0 : this.getMotoMaLoaiXeId().hashCode());
		result = 37 * result + (getTenLoaiXe() == null ? 0 : this.getTenLoaiXe().hashCode());
		return result;
	}

}
