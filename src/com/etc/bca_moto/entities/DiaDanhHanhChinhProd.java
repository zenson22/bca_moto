package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DiaDanhHanhChinhProdDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import java.util.HashSet;
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

/**
 * DiaDanhHanhChinhProd
 */
@DAO(daoClass = DiaDanhHanhChinhProdDAO.class)
@Caption("{%ma}")
@Entity
@Table(name = "DIA_DANH_HANH_CHINH_PROD", schema = "BCA_MOTO")
public class DiaDanhHanhChinhProd implements java.io.Serializable {

	private long id;
	private com.etc.bca_moto.entities.DiaDanhHanhChinhProd diaDanhHanhChinhProd;
	private String ma;
	private String ten;
	private String ghiChu;
	private long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private boolean trangThai;
	private Boolean capHanhChinh;
	private String tenEn;
	private String tienTo;
	private String tienToVtat;
	private Boolean thamGia;
	private Boolean noiNgoaiThanh;
	private String maThamchieu;
	private Set<com.etc.bca_moto.entities.DiaDanhHanhChinhProd> diaDanhHanhChinhProds = new HashSet<com.etc.bca_moto.entities.DiaDanhHanhChinhProd>(
			0);

	public DiaDanhHanhChinhProd() {
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

	@Caption("DiaDanhHanhChinhProd")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DIADANH_CAPTREN", columnDefinition = "NUMBER")
	public com.etc.bca_moto.entities.DiaDanhHanhChinhProd getDiaDanhHanhChinhProd() {
		return this.diaDanhHanhChinhProd;
	}

	public void setDiaDanhHanhChinhProd(com.etc.bca_moto.entities.DiaDanhHanhChinhProd diaDanhHanhChinhProd) {
		this.diaDanhHanhChinhProd = diaDanhHanhChinhProd;
	}

	@Caption("Ma")
	@Column(name = "MA", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("Ten")
	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 400)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("CapHanhChinh")
	@Column(name = "CAP_HANH_CHINH", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getCapHanhChinh() {
		return this.capHanhChinh;
	}

	public void setCapHanhChinh(Boolean capHanhChinh) {
		this.capHanhChinh = capHanhChinh;
	}

	@Caption("TenEn")
	@Column(name = "TEN_EN", columnDefinition = "VARCHAR2", length = 200)
	public String getTenEn() {
		return this.tenEn;
	}

	public void setTenEn(String tenEn) {
		this.tenEn = tenEn;
	}

	@Caption("TienTo")
	@Column(name = "TIEN_TO", columnDefinition = "VARCHAR2", length = 200)
	public String getTienTo() {
		return this.tienTo;
	}

	public void setTienTo(String tienTo) {
		this.tienTo = tienTo;
	}

	@Caption("TienToVtat")
	@Column(name = "TIEN_TO_VTAT", columnDefinition = "VARCHAR2", length = 120)
	public String getTienToVtat() {
		return this.tienToVtat;
	}

	public void setTienToVtat(String tienToVtat) {
		this.tienToVtat = tienToVtat;
	}

	@Caption("ThamGia")
	@Column(name = "THAM_GIA", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getThamGia() {
		return this.thamGia;
	}

	public void setThamGia(Boolean thamGia) {
		this.thamGia = thamGia;
	}

	@Caption("NoiNgoaiThanh")
	@Column(name = "NOI_NGOAI_THANH", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getNoiNgoaiThanh() {
		return this.noiNgoaiThanh;
	}

	public void setNoiNgoaiThanh(Boolean noiNgoaiThanh) {
		this.noiNgoaiThanh = noiNgoaiThanh;
	}

	@Caption("MaThamchieu")
	@Column(name = "MA_THAMCHIEU", columnDefinition = "VARCHAR2", length = 200)
	public String getMaThamchieu() {
		return this.maThamchieu;
	}

	public void setMaThamchieu(String maThamchieu) {
		this.maThamchieu = maThamchieu;
	}

	@Caption("DiaDanhHanhChinhProds")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "diaDanhHanhChinhProd")
	public Set<com.etc.bca_moto.entities.DiaDanhHanhChinhProd> getDiaDanhHanhChinhProds() {
		return this.diaDanhHanhChinhProds;
	}

	public void setDiaDanhHanhChinhProds(Set<com.etc.bca_moto.entities.DiaDanhHanhChinhProd> diaDanhHanhChinhProds) {
		this.diaDanhHanhChinhProds = diaDanhHanhChinhProds;
	}

}
