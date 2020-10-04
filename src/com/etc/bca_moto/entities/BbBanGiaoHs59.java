package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbBanGiaoHs59DAO;
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
 * BbBanGiaoHs59
 */
@DAO(daoClass = BbBanGiaoHs59DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BB_BAN_GIAO_HS_59", schema = "BCA_MOTO")
public class BbBanGiaoHs59 implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private String gioLapBb;
	private String phutLapBb;
	private String diaDiemLap;
	private Long qd24Id;
	private String tenNguoiGiao1;
	private String capBacChucVuNg1;
	private String donViNg1;
	private String tenNguoiGiao2;
	private String capBacChucVuNg2;
	private String donViNg2;
	private String tenNguoiNhan1;
	private String capBacChucVuNn1;
	private String donViNn1;
	private String tenNguoiNhan2;
	private String capBacChucVuNn2;
	private String donViNn2;
	private String banGiaoHsVphc;
	private String gioLapBbXong;
	private String phutLapBbXong;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;

	public BbBanGiaoHs59() {
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

	@Caption("SoBienBan")
	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(String soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Caption("DonViCanhsatGtId")
	@Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCanhsatGtId() {
		return this.donViCanhsatGtId;
	}

	public void setDonViCanhsatGtId(Long donViCanhsatGtId) {
		this.donViCanhsatGtId = donViCanhsatGtId;
	}

	@Caption("TenCqCapTren")
	@Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Caption("NgayLapBb")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(Date ngayLapBb) {
		this.ngayLapBb = ngayLapBb;
	}

	@Caption("GioLapBb")
	@Column(name = "GIO_LAP_BB", columnDefinition = "VARCHAR2", length = 2)
	public String getGioLapBb() {
		return this.gioLapBb;
	}

	public void setGioLapBb(String gioLapBb) {
		this.gioLapBb = gioLapBb;
	}

	@Caption("PhutLapBb")
	@Column(name = "PHUT_LAP_BB", columnDefinition = "VARCHAR2", length = 2)
	public String getPhutLapBb() {
		return this.phutLapBb;
	}

	public void setPhutLapBb(String phutLapBb) {
		this.phutLapBb = phutLapBb;
	}

	@Caption("DiaDiemLap")
	@Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDiemLap() {
		return this.diaDiemLap;
	}

	public void setDiaDiemLap(String diaDiemLap) {
		this.diaDiemLap = diaDiemLap;
	}

	@Caption("Qd24Id")
	@Column(name = "QD24_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd24Id() {
		return this.qd24Id;
	}

	public void setQd24Id(Long qd24Id) {
		this.qd24Id = qd24Id;
	}

	@Caption("TenNguoiGiao1")
	@Column(name = "TEN_NGUOI_GIAO1", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiGiao1() {
		return this.tenNguoiGiao1;
	}

	public void setTenNguoiGiao1(String tenNguoiGiao1) {
		this.tenNguoiGiao1 = tenNguoiGiao1;
	}

	@Caption("CapBacChucVuNg1")
	@Column(name = "CAP_BAC_CHUC_VU_NG1", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVuNg1() {
		return this.capBacChucVuNg1;
	}

	public void setCapBacChucVuNg1(String capBacChucVuNg1) {
		this.capBacChucVuNg1 = capBacChucVuNg1;
	}

	@Caption("DonViNg1")
	@Column(name = "DON_VI_NG1", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViNg1() {
		return this.donViNg1;
	}

	public void setDonViNg1(String donViNg1) {
		this.donViNg1 = donViNg1;
	}

	@Caption("TenNguoiGiao2")
	@Column(name = "TEN_NGUOI_GIAO2", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiGiao2() {
		return this.tenNguoiGiao2;
	}

	public void setTenNguoiGiao2(String tenNguoiGiao2) {
		this.tenNguoiGiao2 = tenNguoiGiao2;
	}

	@Caption("CapBacChucVuNg2")
	@Column(name = "CAP_BAC_CHUC_VU_NG2", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVuNg2() {
		return this.capBacChucVuNg2;
	}

	public void setCapBacChucVuNg2(String capBacChucVuNg2) {
		this.capBacChucVuNg2 = capBacChucVuNg2;
	}

	@Caption("DonViNg2")
	@Column(name = "DON_VI_NG2", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViNg2() {
		return this.donViNg2;
	}

	public void setDonViNg2(String donViNg2) {
		this.donViNg2 = donViNg2;
	}

	@Caption("TenNguoiNhan1")
	@Column(name = "TEN_NGUOI_NHAN1", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiNhan1() {
		return this.tenNguoiNhan1;
	}

	public void setTenNguoiNhan1(String tenNguoiNhan1) {
		this.tenNguoiNhan1 = tenNguoiNhan1;
	}

	@Caption("CapBacChucVuNn1")
	@Column(name = "CAP_BAC_CHUC_VU_NN1", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVuNn1() {
		return this.capBacChucVuNn1;
	}

	public void setCapBacChucVuNn1(String capBacChucVuNn1) {
		this.capBacChucVuNn1 = capBacChucVuNn1;
	}

	@Caption("DonViNn1")
	@Column(name = "DON_VI_NN1", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViNn1() {
		return this.donViNn1;
	}

	public void setDonViNn1(String donViNn1) {
		this.donViNn1 = donViNn1;
	}

	@Caption("TenNguoiNhan2")
	@Column(name = "TEN_NGUOI_NHAN2", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiNhan2() {
		return this.tenNguoiNhan2;
	}

	public void setTenNguoiNhan2(String tenNguoiNhan2) {
		this.tenNguoiNhan2 = tenNguoiNhan2;
	}

	@Caption("CapBacChucVuNn2")
	@Column(name = "CAP_BAC_CHUC_VU_NN2", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVuNn2() {
		return this.capBacChucVuNn2;
	}

	public void setCapBacChucVuNn2(String capBacChucVuNn2) {
		this.capBacChucVuNn2 = capBacChucVuNn2;
	}

	@Caption("DonViNn2")
	@Column(name = "DON_VI_NN2", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViNn2() {
		return this.donViNn2;
	}

	public void setDonViNn2(String donViNn2) {
		this.donViNn2 = donViNn2;
	}

	@Caption("BanGiaoHsVphc")
	@Column(name = "BAN_GIAO_HS_VPHC", columnDefinition = "VARCHAR2", length = 2000)
	public String getBanGiaoHsVphc() {
		return this.banGiaoHsVphc;
	}

	public void setBanGiaoHsVphc(String banGiaoHsVphc) {
		this.banGiaoHsVphc = banGiaoHsVphc;
	}

	@Caption("GioLapBbXong")
	@Column(name = "GIO_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)
	public String getGioLapBbXong() {
		return this.gioLapBbXong;
	}

	public void setGioLapBbXong(String gioLapBbXong) {
		this.gioLapBbXong = gioLapBbXong;
	}

	@Caption("PhutLapBbXong")
	@Column(name = "PHUT_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)
	public String getPhutLapBbXong() {
		return this.phutLapBbXong;
	}

	public void setPhutLapBbXong(String phutLapBbXong) {
		this.phutLapBbXong = phutLapBbXong;
	}

	@Caption("CbxlId")
	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
	}

	@Caption("IdNam")
	@Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdNam() {
		return this.idNam;
	}

	public void setIdNam(Long idNam) {
		this.idNam = idNam;
	}

	@Caption("TinhThanhPhoId")
	@Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTinhThanhPhoId() {
		return this.tinhThanhPhoId;
	}

	public void setTinhThanhPhoId(Long tinhThanhPhoId) {
		this.tinhThanhPhoId = tinhThanhPhoId;
	}

	@Caption("NamTaoQd")
	@Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamTaoQd() {
		return this.namTaoQd;
	}

	public void setNamTaoQd(Long namTaoQd) {
		this.namTaoQd = namTaoQd;
	}

	@Caption("NhapBb")
	@Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapBb() {
		return this.nhapBb;
	}

	public void setNhapBb(Long nhapBb) {
		this.nhapBb = nhapBb;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

}
