package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DiaDiemTamGiuDAO;
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
 * DiaDiemTamGiu
 */
@DAO(daoClass = DiaDiemTamGiuDAO.class)
@Caption("{%tenDonVi}")
@Entity
@Table(name = "DIA_DIEM_TAM_GIU", schema = "BCA_MOTO")
public class DiaDiemTamGiu implements java.io.Serializable {

	private long id;
	private String tenDonVi;
	private String diaDiem;
	private String soDienThoai;
	private String loaiNoiGiu;
	private Long donViCsgtId;
	private Boolean trangThaiKichHoat;
	private String nguoiTao;
	private Date ngayTao;
	private String nguoiSua;
	private Date ngaySua;
	private String ghiChu;
	private Long diaDanhHanhChinhId;

	public DiaDiemTamGiu() {
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

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 500)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("DiaDiem")
	@Column(name = "DIA_DIEM", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaDiem() {
		return this.diaDiem;
	}

	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}

	@Caption("SoDienThoai")
	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 15)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Caption("LoaiNoiGiu")
	@Column(name = "LOAI_NOI_GIU", columnDefinition = "VARCHAR2", length = 50)
	public String getLoaiNoiGiu() {
		return this.loaiNoiGiu;
	}

	public void setLoaiNoiGiu(String loaiNoiGiu) {
		this.loaiNoiGiu = loaiNoiGiu;
	}

	@Caption("DonViCsgtId")
	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

	@Caption("TrangThaiKichHoat")
	@Column(name = "TRANG_THAI_KICH_HOAT", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(Boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 50)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
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

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 50)
	public String getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
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

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("DiaDanhHanhChinhId")
	@Column(name = "DIA_DANH_HANH_CHINH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDanhHanhChinhId() {
		return this.diaDanhHanhChinhId;
	}

	public void setDiaDanhHanhChinhId(Long diaDanhHanhChinhId) {
		this.diaDanhHanhChinhId = diaDanhHanhChinhId;
	}

}
