package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DsCanBoDAO;
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
 * DsCanBo
 */
@DAO(daoClass = DsCanBoDAO.class)
@Caption("{%tenCanBo}")
@Entity
@Table(name = "DS_CAN_BO", schema = "BCA_MOTO")
public class DsCanBo implements java.io.Serializable {

	private long id;
	private String tenCanBo;
	private String capBac;
	private String login;
	private String matKhau;
	private String soHieu;
	private String email;
	private String dienThoaiDd;
	private String ghiChu;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Boolean trangThai;
	private Boolean lanhDaoDuyet;
	private Boolean truongPhongDuyet;
	private String YKienTruongPhong;
	private Boolean doiMatkhau;
	private Long donViCsgtId;
	private Long macDinh;
	private Long huyenId;
	private Long xaId;
	private Long tinhId;

	public DsCanBo() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("TenCanBo")
	@Column(name = "TEN_CAN_BO", columnDefinition = "VARCHAR2", length = 50)
	public String getTenCanBo() {
		return this.tenCanBo;
	}

	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}

	@Caption("CapBac")
	@Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 250)
	public String getCapBac() {
		return this.capBac;
	}

	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}

	@Caption("Login")
	@Column(name = "LOGIN", columnDefinition = "VARCHAR2")
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Caption("MatKhau")
	@Column(name = "MAT_KHAU", columnDefinition = "VARCHAR2", length = 32)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Caption("SoHieu")
	@Column(name = "SO_HIEU", columnDefinition = "VARCHAR2", length = 20)
	public String getSoHieu() {
		return this.soHieu;
	}

	public void setSoHieu(String soHieu) {
		this.soHieu = soHieu;
	}

	@Caption("Email")
	@Column(name = "EMAIL", columnDefinition = "VARCHAR2")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Caption("DienThoaiDd")
	@Column(name = "DIEN_THOAI_DD", columnDefinition = "VARCHAR2", length = 100)
	public String getDienThoaiDd() {
		return this.dienThoaiDd;
	}

	public void setDienThoaiDd(String dienThoaiDd) {
		this.dienThoaiDd = dienThoaiDd;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
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

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
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
	@Column(name = "Y_KIEN_TRUONG_PHONG", columnDefinition = "VARCHAR2", length = 500)
	public String getYKienTruongPhong() {
		return this.YKienTruongPhong;
	}

	public void setYKienTruongPhong(String YKienTruongPhong) {
		this.YKienTruongPhong = YKienTruongPhong;
	}

	@Caption("DoiMatkhau")
	@Column(name = "DOI_MATKHAU", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getDoiMatkhau() {
		return this.doiMatkhau;
	}

	public void setDoiMatkhau(Boolean doiMatkhau) {
		this.doiMatkhau = doiMatkhau;
	}

	@Caption("DonViCsgtId")
	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Caption("MacDinh")
	@Column(name = "MAC_DINH", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMacDinh() {
		return this.macDinh;
	}

	public void setMacDinh(Long macDinh) {
		this.macDinh = macDinh;
	}

	@Caption("HuyenId")
	@Column(name = "HUYEN_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getHuyenId() {
		return this.huyenId;
	}

	public void setHuyenId(Long huyenId) {
		this.huyenId = huyenId;
	}

	@Caption("XaId")
	@Column(name = "XA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getXaId() {
		return this.xaId;
	}

	public void setXaId(Long xaId) {
		this.xaId = xaId;
	}

	@Caption("TinhId")
	@Column(name = "TINH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTinhId() {
		return this.tinhId;
	}

	public void setTinhId(Long tinhId) {
		this.tinhId = tinhId;
	}

}
