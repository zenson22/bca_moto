package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DiaDanhHcDAO;
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
 * DiaDanhHc
 */
@DAO(daoClass = DiaDanhHcDAO.class)
@Caption("{%ma}")
@Entity
@Table(name = "DIA_DANH_HC", schema = "BCA_MOTO")
public class DiaDanhHc implements java.io.Serializable {

	private long id;
	private String ma;
	private String ten;
	private String ghiChu;
	private Long diaDanhCaptren;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Boolean trangThai;
	private Boolean capHanhChinh;
	private String tenEn;
	private String tienTo;
	private String tienToVtat;
	private Boolean thamGia;
	private Boolean noiNgoaiThanh;
	private String maThamchieu;

	public DiaDanhHc() {
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

	@Caption("Ma")
	@Column(name = "MA", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("Ten")
	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("DiaDanhCaptren")
	@Column(name = "DIA_DANH_CAPTREN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhCaptren() {
		return this.diaDanhCaptren;
	}

	public void setDiaDanhCaptren(Long diaDanhCaptren) {
		this.diaDanhCaptren = diaDanhCaptren;
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

	@Caption("CapHanhChinh")
	@Column(name = "CAP_HANH_CHINH", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getCapHanhChinh() {
		return this.capHanhChinh;
	}

	public void setCapHanhChinh(Boolean capHanhChinh) {
		this.capHanhChinh = capHanhChinh;
	}

	@Caption("TenEn")
	@Column(name = "TEN_EN", columnDefinition = "VARCHAR2", length = 50)
	public String getTenEn() {
		return this.tenEn;
	}

	public void setTenEn(String tenEn) {
		this.tenEn = tenEn;
	}

	@Caption("TienTo")
	@Column(name = "TIEN_TO", columnDefinition = "VARCHAR2", length = 50)
	public String getTienTo() {
		return this.tienTo;
	}

	public void setTienTo(String tienTo) {
		this.tienTo = tienTo;
	}

	@Caption("TienToVtat")
	@Column(name = "TIEN_TO_VTAT", columnDefinition = "VARCHAR2", length = 30)
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
	@Column(name = "MA_THAMCHIEU", columnDefinition = "VARCHAR2", length = 50)
	public String getMaThamchieu() {
		return this.maThamchieu;
	}

	public void setMaThamchieu(String maThamchieu) {
		this.maThamchieu = maThamchieu;
	}

}
