package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LsMotoChuSoHuuId
 */
@Embeddable
public class LsMotoChuSoHuuId implements java.io.Serializable {

	private long id;
	private String ten;
	private Long diadanhHanhchinhId;
	private String diaChi;
	private String loaiGiayto;
	private String idSo;
	private Date idNgayCap;
	private String idNoiCap;
	private String soDienThoai;
	private Long quocgiaId;
	private Long chuSoHuuId;
	private String ghiChu;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private String maSoThue;
	private String taiKhoan;
	private String nganHang;
	private Long duLieuCu;
	private Long phanloaiQuanlyId;
	private Long maGiaoDich;

	public LsMotoChuSoHuuId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiadanhHanhchinhId() {
		return this.diadanhHanhchinhId;
	}

	public void setDiadanhHanhchinhId(Long diadanhHanhchinhId) {
		this.diadanhHanhchinhId = diadanhHanhchinhId;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 2048)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "LOAI_GIAYTO", columnDefinition = "VARCHAR2", length = 120)
	public String getLoaiGiayto() {
		return this.loaiGiayto;
	}

	public void setLoaiGiayto(String loaiGiayto) {
		this.loaiGiayto = loaiGiayto;
	}

	@Column(name = "ID_SO", columnDefinition = "VARCHAR2", length = 1020)
	public String getIdSo() {
		return this.idSo;
	}

	public void setIdSo(String idSo) {
		this.idSo = idSo;
	}

	@Column(name = "ID_NGAY_CAP", columnDefinition = "DATE", length = 7)
	public Date getIdNgayCap() {
		return this.idNgayCap;
	}

	public void setIdNgayCap(Date idNgayCap) {
		this.idNgayCap = idNgayCap;
	}

	@Column(name = "ID_NOI_CAP", columnDefinition = "VARCHAR2", length = 1020)
	public String getIdNoiCap() {
		return this.idNoiCap;
	}

	public void setIdNoiCap(String idNoiCap) {
		this.idNoiCap = idNoiCap;
	}

	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 1020)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Column(name = "QUOCGIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getQuocgiaId() {
		return this.quocgiaId;
	}

	public void setQuocgiaId(Long quocgiaId) {
		this.quocgiaId = quocgiaId;
	}

	@Column(name = "CHU_SO_HUU_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getChuSoHuuId() {
		return this.chuSoHuuId;
	}

	public void setChuSoHuuId(Long chuSoHuuId) {
		this.chuSoHuuId = chuSoHuuId;
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

	@Column(name = "MA_SO_THUE", columnDefinition = "VARCHAR2", length = 20)
	public String getMaSoThue() {
		return this.maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	@Column(name = "TAI_KHOAN", columnDefinition = "VARCHAR2", length = 30)
	public String getTaiKhoan() {
		return this.taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@Column(name = "NGAN_HANG", columnDefinition = "VARCHAR2", length = 50)
	public String getNganHang() {
		return this.nganHang;
	}

	public void setNganHang(String nganHang) {
		this.nganHang = nganHang;
	}

	@Column(name = "DU_LIEU_CU", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDuLieuCu() {
		return this.duLieuCu;
	}

	public void setDuLieuCu(Long duLieuCu) {
		this.duLieuCu = duLieuCu;
	}

	@Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getPhanloaiQuanlyId() {
		return this.phanloaiQuanlyId;
	}

	public void setPhanloaiQuanlyId(Long phanloaiQuanlyId) {
		this.phanloaiQuanlyId = phanloaiQuanlyId;
	}

	@Column(name = "MA_GIAO_DICH", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMaGiaoDich() {
		return this.maGiaoDich;
	}

	public void setMaGiaoDich(Long maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LsMotoChuSoHuuId))
			return false;
		LsMotoChuSoHuuId castOther = (LsMotoChuSoHuuId) other;

		return (this.getId() == castOther.getId()) && ((this.getTen() == castOther.getTen())
				|| (this.getTen() != null && castOther.getTen() != null && this.getTen().equals(castOther.getTen())))
				&& ((this.getDiadanhHanhchinhId() == castOther.getDiadanhHanhchinhId())
						|| (this.getDiadanhHanhchinhId() != null && castOther.getDiadanhHanhchinhId() != null
								&& this.getDiadanhHanhchinhId().equals(castOther.getDiadanhHanhchinhId())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getLoaiGiayto() == castOther.getLoaiGiayto()) || (this.getLoaiGiayto() != null
						&& castOther.getLoaiGiayto() != null && this.getLoaiGiayto().equals(castOther.getLoaiGiayto())))
				&& ((this.getIdSo() == castOther.getIdSo()) || (this.getIdSo() != null && castOther.getIdSo() != null
						&& this.getIdSo().equals(castOther.getIdSo())))
				&& ((this.getIdNgayCap() == castOther.getIdNgayCap()) || (this.getIdNgayCap() != null
						&& castOther.getIdNgayCap() != null && this.getIdNgayCap().equals(castOther.getIdNgayCap())))
				&& ((this.getIdNoiCap() == castOther.getIdNoiCap()) || (this.getIdNoiCap() != null
						&& castOther.getIdNoiCap() != null && this.getIdNoiCap().equals(castOther.getIdNoiCap())))
				&& ((this.getSoDienThoai() == castOther.getSoDienThoai())
						|| (this.getSoDienThoai() != null && castOther.getSoDienThoai() != null
								&& this.getSoDienThoai().equals(castOther.getSoDienThoai())))
				&& ((this.getQuocgiaId() == castOther.getQuocgiaId()) || (this.getQuocgiaId() != null
						&& castOther.getQuocgiaId() != null && this.getQuocgiaId().equals(castOther.getQuocgiaId())))
				&& ((this.getChuSoHuuId() == castOther.getChuSoHuuId()) || (this.getChuSoHuuId() != null
						&& castOther.getChuSoHuuId() != null && this.getChuSoHuuId().equals(castOther.getChuSoHuuId())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getMaSoThue() == castOther.getMaSoThue()) || (this.getMaSoThue() != null
						&& castOther.getMaSoThue() != null && this.getMaSoThue().equals(castOther.getMaSoThue())))
				&& ((this.getTaiKhoan() == castOther.getTaiKhoan()) || (this.getTaiKhoan() != null
						&& castOther.getTaiKhoan() != null && this.getTaiKhoan().equals(castOther.getTaiKhoan())))
				&& ((this.getNganHang() == castOther.getNganHang()) || (this.getNganHang() != null
						&& castOther.getNganHang() != null && this.getNganHang().equals(castOther.getNganHang())))
				&& ((this.getDuLieuCu() == castOther.getDuLieuCu()) || (this.getDuLieuCu() != null
						&& castOther.getDuLieuCu() != null && this.getDuLieuCu().equals(castOther.getDuLieuCu())))
				&& ((this.getPhanloaiQuanlyId() == castOther.getPhanloaiQuanlyId())
						|| (this.getPhanloaiQuanlyId() != null && castOther.getPhanloaiQuanlyId() != null
								&& this.getPhanloaiQuanlyId().equals(castOther.getPhanloaiQuanlyId())))
				&& ((this.getMaGiaoDich() == castOther.getMaGiaoDich())
						|| (this.getMaGiaoDich() != null && castOther.getMaGiaoDich() != null
								&& this.getMaGiaoDich().equals(castOther.getMaGiaoDich())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTen() == null ? 0 : this.getTen().hashCode());
		result = 37 * result + (getDiadanhHanhchinhId() == null ? 0 : this.getDiadanhHanhchinhId().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getLoaiGiayto() == null ? 0 : this.getLoaiGiayto().hashCode());
		result = 37 * result + (getIdSo() == null ? 0 : this.getIdSo().hashCode());
		result = 37 * result + (getIdNgayCap() == null ? 0 : this.getIdNgayCap().hashCode());
		result = 37 * result + (getIdNoiCap() == null ? 0 : this.getIdNoiCap().hashCode());
		result = 37 * result + (getSoDienThoai() == null ? 0 : this.getSoDienThoai().hashCode());
		result = 37 * result + (getQuocgiaId() == null ? 0 : this.getQuocgiaId().hashCode());
		result = 37 * result + (getChuSoHuuId() == null ? 0 : this.getChuSoHuuId().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getMaSoThue() == null ? 0 : this.getMaSoThue().hashCode());
		result = 37 * result + (getTaiKhoan() == null ? 0 : this.getTaiKhoan().hashCode());
		result = 37 * result + (getNganHang() == null ? 0 : this.getNganHang().hashCode());
		result = 37 * result + (getDuLieuCu() == null ? 0 : this.getDuLieuCu().hashCode());
		result = 37 * result + (getPhanloaiQuanlyId() == null ? 0 : this.getPhanloaiQuanlyId().hashCode());
		result = 37 * result + (getMaGiaoDich() == null ? 0 : this.getMaGiaoDich().hashCode());
		return result;
	}

}
