package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.CanBoDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * CanBo
 */
@DAO(daoClass = CanBoDAO.class)
@Caption("{%tenCanBo}")
@Entity
@Table(name = "CAN_BO", schema = "BCA_MOTO")
public class CanBo implements java.io.Serializable {

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
	private long roleId;
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

	public CanBo() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("TenCanBo")
	@Column(name = "TEN_CAN_BO", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTenCanBo() {
		return this.tenCanBo;
	}

	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}

	@Caption("Login")
	@Column(name = "LOGIN", nullable = false, columnDefinition = "VARCHAR2", length = 120)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Caption("MatKhau")
	@Column(name = "MAT_KHAU", nullable = false, columnDefinition = "VARCHAR2", length = 400)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Caption("SoHieu")
	@Column(name = "SO_HIEU", nullable = false, columnDefinition = "VARCHAR2", length = 40)
	public String getSoHieu() {
		return this.soHieu;
	}

	public void setSoHieu(String soHieu) {
		this.soHieu = soHieu;
	}

	@Caption("Email")
	@Column(name = "EMAIL", columnDefinition = "VARCHAR2", length = 1020)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Caption("DienThoai")
	@Column(name = "DIEN_THOAI", columnDefinition = "VARCHAR2", length = 120)
	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	@Caption("DienThoaiDd")
	@Column(name = "DIEN_THOAI_DD", columnDefinition = "VARCHAR2", length = 120)
	public String getDienThoaiDd() {
		return this.dienThoaiDd;
	}

	public void setDienThoaiDd(String dienThoaiDd) {
		this.dienThoaiDd = dienThoaiDd;
	}

	@Caption("ChucVu")
	@Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 120)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("RoleId")
	@Column(name = "ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	@Caption("DonViCsgtId")
	@Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Caption("DiemDangKiId")
	@Column(name = "DIEM_DANG_KI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiemDangKiId() {
		return this.diemDangKiId;
	}

	public void setDiemDangKiId(Long diemDangKiId) {
		this.diemDangKiId = diemDangKiId;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Caption("NgaySua")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Caption("TrangThaiKichHoat")
	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Caption("LoaiPtdk")
	@Column(name = "LOAI_PTDK", columnDefinition = "VARCHAR2", length = 120)
	public String getLoaiPtdk() {
		return this.loaiPtdk;
	}

	public void setLoaiPtdk(String loaiPtdk) {
		this.loaiPtdk = loaiPtdk;
	}

	@Caption("LanhDaoDuyet")
	@Column(name = "LANH_DAO_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getLanhDaoDuyet() {
		return this.lanhDaoDuyet;
	}

	public void setLanhDaoDuyet(Boolean lanhDaoDuyet) {
		this.lanhDaoDuyet = lanhDaoDuyet;
	}

	@Caption("TruongPhongDuyet")
	@Column(name = "TRUONG_PHONG_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTruongPhongDuyet() {
		return this.truongPhongDuyet;
	}

	public void setTruongPhongDuyet(Boolean truongPhongDuyet) {
		this.truongPhongDuyet = truongPhongDuyet;
	}

	@Caption("YKienTruongPhong")
	@Column(name = "Y_KIEN_TRUONG_PHONG", columnDefinition = "VARCHAR2", length = 2000)
	public String getYKienTruongPhong() {
		return this.YKienTruongPhong;
	}

	public void setYKienTruongPhong(String YKienTruongPhong) {
		this.YKienTruongPhong = YKienTruongPhong;
	}

	@Caption("CapBac")
	@Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 200)
	public String getCapBac() {
		return this.capBac;
	}

	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}

}
