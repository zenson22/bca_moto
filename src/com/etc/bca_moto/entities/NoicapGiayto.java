package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.NoicapGiaytoDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * NoicapGiayto
 */
@DAO(daoClass = NoicapGiaytoDAO.class)
@Caption("{%ten}")
@Entity
@Table(name = "NOICAP_GIAYTO", schema = "BCA_MOTO")
public class NoicapGiayto implements java.io.Serializable {

	private long id;
	private TangVatTg tangVatTg;
	private long diaDanhHanhChinhId;
	private String ten;
	private String ma;
	private String diaChi;
	private String dienThoai;
	private String fax;
	private String email;
	private String ghiChu;
	private boolean trangThai;
	private long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Long tinhId;
	private Long huyenId;
	private String timKiem;

	public NoicapGiayto() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("TangVatTg")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "KIEU", nullable = false, columnDefinition = "NUMBER")
	public TangVatTg getTangVatTg() {
		return this.tangVatTg;
	}

	public void setTangVatTg(TangVatTg tangVatTg) {
		this.tangVatTg = tangVatTg;
	}

	@Caption("DiaDanhHanhChinhId")
	@Column(name = "DIA_DANH_HANH_CHINH_ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getDiaDanhHanhChinhId() {
		return this.diaDanhHanhChinhId;
	}

	public void setDiaDanhHanhChinhId(long diaDanhHanhChinhId) {
		this.diaDanhHanhChinhId = diaDanhHanhChinhId;
	}

	@Caption("Ten")
	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 400)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("DiaChi")
	@Column(name = "DIA_CHI", nullable = false, columnDefinition = "VARCHAR2", length = 2000)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Caption("DienThoai")
	@Column(name = "DIEN_THOAI", columnDefinition = "VARCHAR2", length = 1000)
	public String getDienThoai() {
		return this.dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	@Caption("Fax")
	@Column(name = "FAX", columnDefinition = "VARCHAR2", length = 1020)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Caption("Email")
	@Column(name = "EMAIL", columnDefinition = "VARCHAR2", length = 1020)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 4000)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", nullable = false, columnDefinition = "NUMBER", scale = 0)
	public long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
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

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", scale = 0)
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

	@Caption("TinhId")
	@Column(name = "TINH_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getTinhId() {
		return this.tinhId;
	}

	public void setTinhId(Long tinhId) {
		this.tinhId = tinhId;
	}

	@Caption("HuyenId")
	@Column(name = "HUYEN_ID", columnDefinition = "NUMBER", scale = 0)
	public Long getHuyenId() {
		return this.huyenId;
	}

	public void setHuyenId(Long huyenId) {
		this.huyenId = huyenId;
	}

	@Caption("TimKiem")
	@Column(name = "TIM_KIEM", columnDefinition = "VARCHAR2")
	public String getTimKiem() {
		return this.timKiem;
	}

	public void setTimKiem(String timKiem) {
		this.timKiem = timKiem;
	}

}
