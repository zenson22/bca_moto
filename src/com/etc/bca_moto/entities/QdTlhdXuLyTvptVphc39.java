package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdTlhdXuLyTvptVphc39DAO;
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
 * QdTlhdXuLyTvptVphc39
 */
@DAO(daoClass = QdTlhdXuLyTvptVphc39DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_TLHD_XU_LY_TVPT_VPHC_39", schema = "BCA_MOTO")
public class QdTlhdXuLyTvptVphc39 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private String qd13So;
	private String qd13Ngay;
	private String qd13Ky;
	private String canCuQdGqxpSo;
	private Date canCuQdGqxpNgay;
	private Date canCuQdGqxpKy;
	private String capBac;
	private String chucVu;
	private String donVi;
	private String tenChuTich;
	private String daiDienCqChuTich;
	private String tenPhoChuTich;
	private String daiDienCqPhoChuTich;
	private String tenThuKy;
	private String daiDienCqThuKy;
	private String tenThanhVien;
	private String daiDienCqThanhVien;
	private String qdGuiCho;
	private String tenHoiDong;
	private String truocNgay;
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

	public QdTlhdXuLyTvptVphc39() {
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

	@Caption("SoQuyetDinh")
	@Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
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

	@Caption("Qd13So")
	@Column(name = "QD13_SO", columnDefinition = "VARCHAR2", length = 50)
	public String getQd13So() {
		return this.qd13So;
	}

	public void setQd13So(String qd13So) {
		this.qd13So = qd13So;
	}

	@Caption("Qd13Ngay")
	@Column(name = "QD13_NGAY", columnDefinition = "VARCHAR2", length = 50)
	public String getQd13Ngay() {
		return this.qd13Ngay;
	}

	public void setQd13Ngay(String qd13Ngay) {
		this.qd13Ngay = qd13Ngay;
	}

	@Caption("Qd13Ky")
	@Column(name = "QD13_KY", columnDefinition = "VARCHAR2", length = 50)
	public String getQd13Ky() {
		return this.qd13Ky;
	}

	public void setQd13Ky(String qd13Ky) {
		this.qd13Ky = qd13Ky;
	}

	@Caption("CanCuQdGqxpSo")
	@Column(name = "CAN_CU_QD_GQXP_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuQdGqxpSo() {
		return this.canCuQdGqxpSo;
	}

	public void setCanCuQdGqxpSo(String canCuQdGqxpSo) {
		this.canCuQdGqxpSo = canCuQdGqxpSo;
	}

	@Caption("CanCuQdGqxpNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QD_GQXP_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdGqxpNgay() {
		return this.canCuQdGqxpNgay;
	}

	public void setCanCuQdGqxpNgay(Date canCuQdGqxpNgay) {
		this.canCuQdGqxpNgay = canCuQdGqxpNgay;
	}

	@Caption("CanCuQdGqxpKy")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QD_GQXP_KY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdGqxpKy() {
		return this.canCuQdGqxpKy;
	}

	public void setCanCuQdGqxpKy(Date canCuQdGqxpKy) {
		this.canCuQdGqxpKy = canCuQdGqxpKy;
	}

	@Caption("CapBac")
	@Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 60)
	public String getCapBac() {
		return this.capBac;
	}

	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}

	@Caption("ChucVu")
	@Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 60)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Caption("DonVi")
	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Caption("TenChuTich")
	@Column(name = "TEN_CHU_TICH", columnDefinition = "VARCHAR2", length = 300)
	public String getTenChuTich() {
		return this.tenChuTich;
	}

	public void setTenChuTich(String tenChuTich) {
		this.tenChuTich = tenChuTich;
	}

	@Caption("DaiDienCqChuTich")
	@Column(name = "DAI_DIEN_CQ_CHU_TICH", columnDefinition = "VARCHAR2", length = 300)
	public String getDaiDienCqChuTich() {
		return this.daiDienCqChuTich;
	}

	public void setDaiDienCqChuTich(String daiDienCqChuTich) {
		this.daiDienCqChuTich = daiDienCqChuTich;
	}

	@Caption("TenPhoChuTich")
	@Column(name = "TEN_PHO_CHU_TICH", columnDefinition = "VARCHAR2", length = 300)
	public String getTenPhoChuTich() {
		return this.tenPhoChuTich;
	}

	public void setTenPhoChuTich(String tenPhoChuTich) {
		this.tenPhoChuTich = tenPhoChuTich;
	}

	@Caption("DaiDienCqPhoChuTich")
	@Column(name = "DAI_DIEN_CQ_PHO_CHU_TICH", columnDefinition = "VARCHAR2", length = 300)
	public String getDaiDienCqPhoChuTich() {
		return this.daiDienCqPhoChuTich;
	}

	public void setDaiDienCqPhoChuTich(String daiDienCqPhoChuTich) {
		this.daiDienCqPhoChuTich = daiDienCqPhoChuTich;
	}

	@Caption("TenThuKy")
	@Column(name = "TEN_THU_KY", columnDefinition = "VARCHAR2", length = 300)
	public String getTenThuKy() {
		return this.tenThuKy;
	}

	public void setTenThuKy(String tenThuKy) {
		this.tenThuKy = tenThuKy;
	}

	@Caption("DaiDienCqThuKy")
	@Column(name = "DAI_DIEN_CQ_THU_KY", columnDefinition = "VARCHAR2", length = 300)
	public String getDaiDienCqThuKy() {
		return this.daiDienCqThuKy;
	}

	public void setDaiDienCqThuKy(String daiDienCqThuKy) {
		this.daiDienCqThuKy = daiDienCqThuKy;
	}

	@Caption("TenThanhVien")
	@Column(name = "TEN_THANH_VIEN", columnDefinition = "VARCHAR2", length = 300)
	public String getTenThanhVien() {
		return this.tenThanhVien;
	}

	public void setTenThanhVien(String tenThanhVien) {
		this.tenThanhVien = tenThanhVien;
	}

	@Caption("DaiDienCqThanhVien")
	@Column(name = "DAI_DIEN_CQ_THANH_VIEN", columnDefinition = "VARCHAR2", length = 300)
	public String getDaiDienCqThanhVien() {
		return this.daiDienCqThanhVien;
	}

	public void setDaiDienCqThanhVien(String daiDienCqThanhVien) {
		this.daiDienCqThanhVien = daiDienCqThanhVien;
	}

	@Caption("QdGuiCho")
	@Column(name = "QD_GUI_CHO", columnDefinition = "VARCHAR2", length = 300)
	public String getQdGuiCho() {
		return this.qdGuiCho;
	}

	public void setQdGuiCho(String qdGuiCho) {
		this.qdGuiCho = qdGuiCho;
	}

	@Caption("TenHoiDong")
	@Column(name = "TEN_HOI_DONG", columnDefinition = "VARCHAR2", length = 300)
	public String getTenHoiDong() {
		return this.tenHoiDong;
	}

	public void setTenHoiDong(String tenHoiDong) {
		this.tenHoiDong = tenHoiDong;
	}

	@Caption("TruocNgay")
	@Column(name = "TRUOC_NGAY", columnDefinition = "VARCHAR2", length = 300)
	public String getTruocNgay() {
		return this.truocNgay;
	}

	public void setTruocNgay(String truocNgay) {
		this.truocNgay = truocNgay;
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
