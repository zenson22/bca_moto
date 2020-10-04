package com.etc.bca_moto.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.etc.bca_moto.dal.DonViCanhsatGtDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;

/**
 * DonViCanhsatGt
 */
@DAO(daoClass = DonViCanhsatGtDAO.class)
@Caption("{%maDonVi}")
@Entity
@Table(name = "DON_VI_CANHSAT_GT", schema = "BCA_MOTO")
public class DonViCanhsatGt implements java.io.Serializable {

	private long id;
	private Long dvCsgtCaptrenId;
	private Long diaDanhHanhChinhId;
	private String maDonVi;
	private String tenDonVi;
	private String diaChi;
	private String tenCoquanChuquan;
	private String tenCoquanLap;
	private String tenDaydu;
	private String dienThoai;
	private String fax;
	private String email;
	private String ghiChu;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Boolean trangThai;
	private Boolean capDonVi;
	private Long sapXep;
	private Boolean linhVuc;
	private String maThamchieu;
	private String tenViettat;
	private Long coQuan;
	private String maTrucThuoc;
	private String dvCsgtCaptren;
	private String dvTrucThuoc;
	private Long khoBacId;
	private String maKhoBac;
	private Long nganHangId;
	private String maNganHang;
	private Long diaDiemTamGiuId;
	private Long donViResourceId;
	private Set<DanhSachDonViDacBiet> danhSachDonViDacBiets = new HashSet<>(0);
	private List<AuthUser> authUsers = new ArrayList<>();
	private DiaDanhHanhChinh diaDanhHanhChinh;

	public DonViCanhsatGt() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	@Caption("DvCsgtCaptrenId")
	@Column(name = "DV_CSGT_CAPTREN_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDvCsgtCaptrenId() {
		return this.dvCsgtCaptrenId;
	}

	public void setDvCsgtCaptrenId(final Long dvCsgtCaptrenId) {
		this.dvCsgtCaptrenId = dvCsgtCaptrenId;
	}

	@Caption("DiaDanhHanhChinhId")
	@Column(name = "DIA_DANH_HANH_CHINH_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHanhChinhId() {
		return this.diaDanhHanhChinhId;
	}

	public void setDiaDanhHanhChinhId(final Long diaDanhHanhChinhId) {
		this.diaDanhHanhChinhId = diaDanhHanhChinhId;
	}

	@Caption("MaDonVi")
	@Column(name = "MA_DON_VI", columnDefinition = "VARCHAR2", length = 50)
	public String getMaDonVi() {
		return this.maDonVi;
	}

	public void setMaDonVi(final String maDonVi) {
		this.maDonVi = maDonVi;
	}

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(final String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("DiaChi")
	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 500)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(final String diaChi) {
		this.diaChi = diaChi;
	}

	@Caption("TenCoquanChuquan")
	@Column(name = "TEN_COQUAN_CHUQUAN", columnDefinition = "VARCHAR2")
	public String getTenCoquanChuquan() {
		return this.tenCoquanChuquan;
	}

	public void setTenCoquanChuquan(final String tenCoquanChuquan) {
		this.tenCoquanChuquan = tenCoquanChuquan;
	}

	@Caption("TenCoquanLap")
	@Column(name = "TEN_COQUAN_LAP", columnDefinition = "VARCHAR2")
	public String getTenCoquanLap() {
		return this.tenCoquanLap;
	}

	public void setTenCoquanLap(final String tenCoquanLap) {
		this.tenCoquanLap = tenCoquanLap;
	}

	@Caption("TenDaydu")
	@Column(name = "TEN_DAYDU", columnDefinition = "VARCHAR2", length = 500)
	public String getTenDaydu() {
		return this.tenDaydu;
	}

	public void setTenDaydu(final String tenDaydu) {
		this.tenDaydu = tenDaydu;
	}

	@Caption("DienThoai")
	@Column(name = "DIEN_THOAI", columnDefinition = "VARCHAR2")
	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(final String dienThoai) {
		this.dienThoai = dienThoai;
	}

	@Caption("Fax")
	@Column(name = "FAX", columnDefinition = "VARCHAR2")
	public String getFax() {
		return this.fax;
	}

	public void setFax(final String fax) {
		this.fax = fax;
	}

	@Caption("Email")
	@Column(name = "EMAIL", columnDefinition = "VARCHAR2")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(final String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(final Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(final Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(final Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
	}

	@Caption("NgaySua")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(final Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(final Boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("CapDonVi")
	@Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getCapDonVi() {
		return this.capDonVi;
	}

	public void setCapDonVi(final Boolean capDonVi) {
		this.capDonVi = capDonVi;
	}

	@Caption("SapXep")
	@Column(name = "SAP_XEP", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSapXep() {
		return this.sapXep;
	}

	public void setSapXep(final Long sapXep) {
		this.sapXep = sapXep;
	}

	@Caption("LinhVuc")
	@Column(name = "LINH_VUC", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getLinhVuc() {
		return this.linhVuc;
	}

	public void setLinhVuc(final Boolean linhVuc) {
		this.linhVuc = linhVuc;
	}

	@Caption("MaThamchieu")
	@Column(name = "MA_THAMCHIEU", columnDefinition = "VARCHAR2", length = 50)
	public String getMaThamchieu() {
		return this.maThamchieu;
	}

	public void setMaThamchieu(final String maThamchieu) {
		this.maThamchieu = maThamchieu;
	}

	@Caption("TenViettat")
	@Column(name = "TEN_VIETTAT", columnDefinition = "VARCHAR2", length = 500)
	public String getTenViettat() {
		return this.tenViettat;
	}

	public void setTenViettat(final String tenViettat) {
		this.tenViettat = tenViettat;
	}

	@Caption("CoQuan")
	@Column(name = "CO_QUAN", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getCoQuan() {
		return this.coQuan;
	}

	public void setCoQuan(final Long coQuan) {
		this.coQuan = coQuan;
	}

	@Caption("MaTrucThuoc")
	@Column(name = "MA_TRUC_THUOC", columnDefinition = "VARCHAR2", length = 20)
	public String getMaTrucThuoc() {
		return this.maTrucThuoc;
	}

	public void setMaTrucThuoc(final String maTrucThuoc) {
		this.maTrucThuoc = maTrucThuoc;
	}

	@Caption("DvCsgtCaptren")
	@Column(name = "DV_CSGT_CAPTREN", columnDefinition = "VARCHAR2", length = 20)
	public String getDvCsgtCaptren() {
		return this.dvCsgtCaptren;
	}

	public void setDvCsgtCaptren(final String dvCsgtCaptren) {
		this.dvCsgtCaptren = dvCsgtCaptren;
	}

	@Caption("DvTrucThuoc")
	@Column(name = "DV_TRUC_THUOC", columnDefinition = "VARCHAR2", length = 20)
	public String getDvTrucThuoc() {
		return this.dvTrucThuoc;
	}

	public void setDvTrucThuoc(final String dvTrucThuoc) {
		this.dvTrucThuoc = dvTrucThuoc;
	}

	@Caption("KhoBacId")
	@Column(name = "KHO_BAC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getKhoBacId() {
		return this.khoBacId;
	}

	public void setKhoBacId(final Long khoBacId) {
		this.khoBacId = khoBacId;
	}

	@Caption("MaKhoBac")
	@Column(name = "MA_KHO_BAC", columnDefinition = "VARCHAR2", length = 20)
	public String getMaKhoBac() {
		return this.maKhoBac;
	}

	public void setMaKhoBac(final String maKhoBac) {
		this.maKhoBac = maKhoBac;
	}

	@Caption("NganHangId")
	@Column(name = "NGAN_HANG_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNganHangId() {
		return this.nganHangId;
	}

	public void setNganHangId(final Long nganHangId) {
		this.nganHangId = nganHangId;
	}

	@Caption("MaNganHang")
	@Column(name = "MA_NGAN_HANG", columnDefinition = "VARCHAR2", length = 20)
	public String getMaNganHang() {
		return this.maNganHang;
	}

	public void setMaNganHang(final String maNganHang) {
		this.maNganHang = maNganHang;
	}

	@Caption("DiaDiemTamGiuId")
	@Column(name = "DIA_DIEM_TAM_GIU_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDiemTamGiuId() {
		return this.diaDiemTamGiuId;
	}

	public void setDiaDiemTamGiuId(final Long diaDiemTamGiuId) {
		this.diaDiemTamGiuId = diaDiemTamGiuId;
	}

	@Caption("DonViResourceId")
	@Column(name = "DON_VI_RESOURCE_ID", columnDefinition = "NUMBER", precision = 6, scale = 0)
	public Long getDonViResourceId() {
		return this.donViResourceId;
	}

	public void setDonViResourceId(final Long donViResourceId) {
		this.donViResourceId = donViResourceId;
	}

	@Caption("DanhSachDonViDacBiets")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "donViCanhsatGt")
	public Set<DanhSachDonViDacBiet> getDanhSachDonViDacBiets() {
		return this.danhSachDonViDacBiets;
	}

	public void setDanhSachDonViDacBiets(final Set<DanhSachDonViDacBiet> danhSachDonViDacBiets) {
		this.danhSachDonViDacBiets = danhSachDonViDacBiets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "donViCanhsatGt")
	public List<AuthUser> getAuthUsers() {
		return this.authUsers;
	}

	public void setAuthUsers(final List<AuthUser> authUsers) {
		this.authUsers = authUsers;
	}

	public AuthUser addAuthUser(final AuthUser authUser) {
		getAuthUsers().add(authUser);
		authUser.setDonViCanhsatGt(this);
		return authUser;
	}

	public AuthUser removeAuthUser(final AuthUser authUser) {
		getAuthUsers().remove(authUser);
		authUser.setDonViCanhsatGt(null);
		return authUser;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DIADANHHANHCHINH_ID")
	public DiaDanhHanhChinh getDiaDanhHanhChinh() {
		return this.diaDanhHanhChinh;
	}

	public void setDiaDanhHanhChinh(final DiaDanhHanhChinh diaDanhHanhChinh) {
		this.diaDanhHanhChinh = diaDanhHanhChinh;
	}

}
