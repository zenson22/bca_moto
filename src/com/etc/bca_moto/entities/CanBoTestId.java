package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CanBoTestId
 */
@Embeddable
public class CanBoTestId implements java.io.Serializable {

	private long id;
	private String tenCanBo;
	private String login;
	private String matKhau;
	private String soHieu;
	private String email;
	private String dienThoai;
	private String dienThoaiDd;
	private String chucVu;
	private String ghiChu;
	private Long roleId;
	private long donViCsgtId;
	private Long diemDangKiId;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private String loaiPtdk;
	private Boolean lanhDaoDuyet;
	private Boolean truongPhongDuyet;
	private String YKienTruongPhong;
	private String capBac;

	public CanBoTestId() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "TEN_CAN_BO", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTenCanBo() {
		return this.tenCanBo;
	}

	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}

	@Column(name = "LOGIN", nullable = false, columnDefinition = "VARCHAR2", length = 120)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "MAT_KHAU", nullable = false, columnDefinition = "VARCHAR2", length = 400)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Column(name = "SO_HIEU", nullable = false, columnDefinition = "VARCHAR2", length = 40)
	public String getSoHieu() {
		return this.soHieu;
	}

	public void setSoHieu(String soHieu) {
		this.soHieu = soHieu;
	}

	@Column(name = "EMAIL", columnDefinition = "VARCHAR2", length = 1020)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "DIEN_THOAI", columnDefinition = "VARCHAR2", length = 120)
	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	@Column(name = "DIEN_THOAI_DD", columnDefinition = "VARCHAR2", length = 120)
	public String getDienThoaiDd() {
		return this.dienThoaiDd;
	}

	public void setDienThoaiDd(String dienThoaiDd) {
		this.dienThoaiDd = dienThoaiDd;
	}

	@Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 120)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "ROLE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Column(name = "DIEM_DANG_KI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiemDangKiId() {
		return this.diemDangKiId;
	}

	public void setDiemDangKiId(Long diemDangKiId) {
		this.diemDangKiId = diemDangKiId;
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

	@Column(name = "LOAI_PTDK", columnDefinition = "VARCHAR2", length = 120)
	public String getLoaiPtdk() {
		return this.loaiPtdk;
	}

	public void setLoaiPtdk(String loaiPtdk) {
		this.loaiPtdk = loaiPtdk;
	}

	@Column(name = "LANH_DAO_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getLanhDaoDuyet() {
		return this.lanhDaoDuyet;
	}

	public void setLanhDaoDuyet(Boolean lanhDaoDuyet) {
		this.lanhDaoDuyet = lanhDaoDuyet;
	}

	@Column(name = "TRUONG_PHONG_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTruongPhongDuyet() {
		return this.truongPhongDuyet;
	}

	public void setTruongPhongDuyet(Boolean truongPhongDuyet) {
		this.truongPhongDuyet = truongPhongDuyet;
	}

	@Column(name = "Y_KIEN_TRUONG_PHONG", columnDefinition = "VARCHAR2", length = 2000)
	public String getYKienTruongPhong() {
		return this.YKienTruongPhong;
	}

	public void setYKienTruongPhong(String YKienTruongPhong) {
		this.YKienTruongPhong = YKienTruongPhong;
	}

	@Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 200)
	public String getCapBac() {
		return this.capBac;
	}

	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CanBoTestId))
			return false;
		CanBoTestId castOther = (CanBoTestId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getTenCanBo() == castOther.getTenCanBo()) || (this.getTenCanBo() != null
						&& castOther.getTenCanBo() != null && this.getTenCanBo().equals(castOther.getTenCanBo())))
				&& ((this.getLogin() == castOther.getLogin()) || (this.getLogin() != null
						&& castOther.getLogin() != null && this.getLogin().equals(castOther.getLogin())))
				&& ((this.getMatKhau() == castOther.getMatKhau()) || (this.getMatKhau() != null
						&& castOther.getMatKhau() != null && this.getMatKhau().equals(castOther.getMatKhau())))
				&& ((this.getSoHieu() == castOther.getSoHieu()) || (this.getSoHieu() != null
						&& castOther.getSoHieu() != null && this.getSoHieu().equals(castOther.getSoHieu())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getDienThoai() == castOther.getDienThoai()) || (this.getDienThoai() != null
						&& castOther.getDienThoai() != null && this.getDienThoai().equals(castOther.getDienThoai())))
				&& ((this.getDienThoaiDd() == castOther.getDienThoaiDd())
						|| (this.getDienThoaiDd() != null && castOther.getDienThoaiDd() != null
								&& this.getDienThoaiDd().equals(castOther.getDienThoaiDd())))
				&& ((this.getChucVu() == castOther.getChucVu()) || (this.getChucVu() != null
						&& castOther.getChucVu() != null && this.getChucVu().equals(castOther.getChucVu())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getRoleId() == castOther.getRoleId()) || (this.getRoleId() != null
						&& castOther.getRoleId() != null && this.getRoleId().equals(castOther.getRoleId())))
				&& (this.getDonViCsgtId() == castOther.getDonViCsgtId())
				&& ((this.getDiemDangKiId() == castOther.getDiemDangKiId())
						|| (this.getDiemDangKiId() != null && castOther.getDiemDangKiId() != null
								&& this.getDiemDangKiId().equals(castOther.getDiemDangKiId())))
				&& (this.getNguoiTao() == castOther.getNguoiTao())
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& (this.isTrangThaiKichHoat() == castOther.isTrangThaiKichHoat())
				&& ((this.getLoaiPtdk() == castOther.getLoaiPtdk()) || (this.getLoaiPtdk() != null
						&& castOther.getLoaiPtdk() != null && this.getLoaiPtdk().equals(castOther.getLoaiPtdk())))
				&& ((this.getLanhDaoDuyet() == castOther.getLanhDaoDuyet())
						|| (this.getLanhDaoDuyet() != null && castOther.getLanhDaoDuyet() != null
								&& this.getLanhDaoDuyet().equals(castOther.getLanhDaoDuyet())))
				&& ((this.getTruongPhongDuyet() == castOther.getTruongPhongDuyet())
						|| (this.getTruongPhongDuyet() != null && castOther.getTruongPhongDuyet() != null
								&& this.getTruongPhongDuyet().equals(castOther.getTruongPhongDuyet())))
				&& ((this.getYKienTruongPhong() == castOther.getYKienTruongPhong())
						|| (this.getYKienTruongPhong() != null && castOther.getYKienTruongPhong() != null
								&& this.getYKienTruongPhong().equals(castOther.getYKienTruongPhong())))
				&& ((this.getCapBac() == castOther.getCapBac()) || (this.getCapBac() != null
						&& castOther.getCapBac() != null && this.getCapBac().equals(castOther.getCapBac())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getTenCanBo() == null ? 0 : this.getTenCanBo().hashCode());
		result = 37 * result + (getLogin() == null ? 0 : this.getLogin().hashCode());
		result = 37 * result + (getMatKhau() == null ? 0 : this.getMatKhau().hashCode());
		result = 37 * result + (getSoHieu() == null ? 0 : this.getSoHieu().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getDienThoai() == null ? 0 : this.getDienThoai().hashCode());
		result = 37 * result + (getDienThoaiDd() == null ? 0 : this.getDienThoaiDd().hashCode());
		result = 37 * result + (getChucVu() == null ? 0 : this.getChucVu().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result + (int) this.getDonViCsgtId();
		result = 37 * result + (getDiemDangKiId() == null ? 0 : this.getDiemDangKiId().hashCode());
		result = 37 * result + (int) this.getNguoiTao();
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (this.isTrangThaiKichHoat() ? 1 : 0);
		result = 37 * result + (getLoaiPtdk() == null ? 0 : this.getLoaiPtdk().hashCode());
		result = 37 * result + (getLanhDaoDuyet() == null ? 0 : this.getLanhDaoDuyet().hashCode());
		result = 37 * result + (getTruongPhongDuyet() == null ? 0 : this.getTruongPhongDuyet().hashCode());
		result = 37 * result + (getYKienTruongPhong() == null ? 0 : this.getYKienTruongPhong().hashCode());
		result = 37 * result + (getCapBac() == null ? 0 : this.getCapBac().hashCode());
		return result;
	}

}
