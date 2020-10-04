package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbKnqd46DAO;
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
 * BbKnqd46
 */
@DAO(daoClass = BbKnqd46DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BB_KNQD_46", schema = "BCA_MOTO")
public class BbKnqd46 implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private String gioLap;
	private String phutLap;
	private String diaDiemLap;
	private String canBoLap1;
	private String canBoLap2;
	private String capBacChucVu1;
	private String capBacChucVu2;
	private String donVi1;
	private String donVi2;
	private Long qd02Id;
	private String vphcSo;
	private String vphcNgay;
	private String vphcNguoiKy;
	private String chungKien;
	private String chinhQuyenXacNhan;
	private String nguoiDaiDienChinhQuyen;
	private String nguoiChungKien;
	private String nguoiLapBb;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;

	public BbKnqd46() {
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
	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 20)
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

	@Caption("GioLap")
	@Column(name = "GIO_LAP", columnDefinition = "VARCHAR2", length = 2)
	public String getGioLap() {
		return this.gioLap;
	}

	public void setGioLap(String gioLap) {
		this.gioLap = gioLap;
	}

	@Caption("PhutLap")
	@Column(name = "PHUT_LAP", columnDefinition = "VARCHAR2", length = 2)
	public String getPhutLap() {
		return this.phutLap;
	}

	public void setPhutLap(String phutLap) {
		this.phutLap = phutLap;
	}

	@Caption("DiaDiemLap")
	@Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaDiemLap() {
		return this.diaDiemLap;
	}

	public void setDiaDiemLap(String diaDiemLap) {
		this.diaDiemLap = diaDiemLap;
	}

	@Caption("CanBoLap1")
	@Column(name = "CAN_BO_LAP1", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLap1() {
		return this.canBoLap1;
	}

	public void setCanBoLap1(String canBoLap1) {
		this.canBoLap1 = canBoLap1;
	}

	@Caption("CanBoLap2")
	@Column(name = "CAN_BO_LAP2", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLap2() {
		return this.canBoLap2;
	}

	public void setCanBoLap2(String canBoLap2) {
		this.canBoLap2 = canBoLap2;
	}

	@Caption("CapBacChucVu1")
	@Column(name = "CAP_BAC_CHUC_VU_1", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu1() {
		return this.capBacChucVu1;
	}

	public void setCapBacChucVu1(String capBacChucVu1) {
		this.capBacChucVu1 = capBacChucVu1;
	}

	@Caption("CapBacChucVu2")
	@Column(name = "CAP_BAC_CHUC_VU_2", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu2() {
		return this.capBacChucVu2;
	}

	public void setCapBacChucVu2(String capBacChucVu2) {
		this.capBacChucVu2 = capBacChucVu2;
	}

	@Caption("DonVi1")
	@Column(name = "DON_VI_1", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi1() {
		return this.donVi1;
	}

	public void setDonVi1(String donVi1) {
		this.donVi1 = donVi1;
	}

	@Caption("DonVi2")
	@Column(name = "DON_VI_2", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi2() {
		return this.donVi2;
	}

	public void setDonVi2(String donVi2) {
		this.donVi2 = donVi2;
	}

	@Caption("Qd02Id")
	@Column(name = "QD_02_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd02Id() {
		return this.qd02Id;
	}

	public void setQd02Id(Long qd02Id) {
		this.qd02Id = qd02Id;
	}

	@Caption("VphcSo")
	@Column(name = "VPHC_SO", columnDefinition = "VARCHAR2", length = 50)
	public String getVphcSo() {
		return this.vphcSo;
	}

	public void setVphcSo(String vphcSo) {
		this.vphcSo = vphcSo;
	}

	@Caption("VphcNgay")
	@Column(name = "VPHC_NGAY", columnDefinition = "VARCHAR2", length = 50)
	public String getVphcNgay() {
		return this.vphcNgay;
	}

	public void setVphcNgay(String vphcNgay) {
		this.vphcNgay = vphcNgay;
	}

	@Caption("VphcNguoiKy")
	@Column(name = "VPHC_NGUOI_KY", columnDefinition = "VARCHAR2", length = 50)
	public String getVphcNguoiKy() {
		return this.vphcNguoiKy;
	}

	public void setVphcNguoiKy(String vphcNguoiKy) {
		this.vphcNguoiKy = vphcNguoiKy;
	}

	@Caption("ChungKien")
	@Column(name = "CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 50)
	public String getChungKien() {
		return this.chungKien;
	}

	public void setChungKien(String chungKien) {
		this.chungKien = chungKien;
	}

	@Caption("ChinhQuyenXacNhan")
	@Column(name = "CHINH_QUYEN_XAC_NHAN", columnDefinition = "VARCHAR2", length = 80)
	public String getChinhQuyenXacNhan() {
		return this.chinhQuyenXacNhan;
	}

	public void setChinhQuyenXacNhan(String chinhQuyenXacNhan) {
		this.chinhQuyenXacNhan = chinhQuyenXacNhan;
	}

	@Caption("NguoiDaiDienChinhQuyen")
	@Column(name = "NGUOI_DAI_DIEN_CHINH_QUYEN", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiDaiDienChinhQuyen() {
		return this.nguoiDaiDienChinhQuyen;
	}

	public void setNguoiDaiDienChinhQuyen(String nguoiDaiDienChinhQuyen) {
		this.nguoiDaiDienChinhQuyen = nguoiDaiDienChinhQuyen;
	}

	@Caption("NguoiChungKien")
	@Column(name = "NGUOI_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiChungKien() {
		return this.nguoiChungKien;
	}

	public void setNguoiChungKien(String nguoiChungKien) {
		this.nguoiChungKien = nguoiChungKien;
	}

	@Caption("NguoiLapBb")
	@Column(name = "NGUOI_LAP_BB", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiLapBb() {
		return this.nguoiLapBb;
	}

	public void setNguoiLapBb(String nguoiLapBb) {
		this.nguoiLapBb = nguoiLapBb;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
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
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)
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
