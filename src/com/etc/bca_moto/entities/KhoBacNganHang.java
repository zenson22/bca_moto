package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.KhoBacNganHangDAO;
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
 * KhoBacNganHang
 */
@DAO(daoClass = KhoBacNganHangDAO.class)
@Caption("{%ma}")
@Entity
@Table(name = "KHO_BAC_NGAN_HANG", schema = "BCA_MOTO")
public class KhoBacNganHang implements java.io.Serializable {

	private long id;
	private String ma;
	private String maCha;
	private String ten;
	private String diaChi;
	private Long loai;
	private String tenKbCapTren;
	private Long dvCsgtId;
	private Long diaDanhHcId;
	private Long tinhThanhId;
	private String ghiChu;
	private String ma8So;
	private String soDienThoai;
	private String tienToBienLai;
	private Boolean trangThaiKichHoat;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;

	public KhoBacNganHang() {
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
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 20)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("MaCha")
	@Column(name = "MA_CHA", columnDefinition = "VARCHAR2", length = 20)
	public String getMaCha() {
		return this.maCha;
	}

	public void setMaCha(String maCha) {
		this.maCha = maCha;
	}

	@Caption("Ten")
	@Column(name = "TEN", columnDefinition = "VARCHAR2", length = 500)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("DiaChi")
	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Caption("Loai")
	@Column(name = "LOAI", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getLoai() {
		return this.loai;
	}

	public void setLoai(Long loai) {
		this.loai = loai;
	}

	@Caption("TenKbCapTren")
	@Column(name = "TEN_KB_CAP_TREN", columnDefinition = "VARCHAR2", length = 100)
	public String getTenKbCapTren() {
		return this.tenKbCapTren;
	}

	public void setTenKbCapTren(String tenKbCapTren) {
		this.tenKbCapTren = tenKbCapTren;
	}

	@Caption("DvCsgtId")
	@Column(name = "DV_CSGT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDvCsgtId() {
		return this.dvCsgtId;
	}

	public void setDvCsgtId(Long dvCsgtId) {
		this.dvCsgtId = dvCsgtId;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Caption("TinhThanhId")
	@Column(name = "TINH_THANH_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTinhThanhId() {
		return this.tinhThanhId;
	}

	public void setTinhThanhId(Long tinhThanhId) {
		this.tinhThanhId = tinhThanhId;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("Ma8So")
	@Column(name = "MA_8_SO", columnDefinition = "VARCHAR2", length = 20)
	public String getMa8So() {
		return this.ma8So;
	}

	public void setMa8So(String ma8So) {
		this.ma8So = ma8So;
	}

	@Caption("SoDienThoai")
	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 15)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Caption("TienToBienLai")
	@Column(name = "TIEN_TO_BIEN_LAI", columnDefinition = "VARCHAR2", length = 15)
	public String getTienToBienLai() {
		return this.tienToBienLai;
	}

	public void setTienToBienLai(String tienToBienLai) {
		this.tienToBienLai = tienToBienLai;
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
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
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

}
