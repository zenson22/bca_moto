package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdChuyenHs24DAO;
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
 * QdChuyenHs24
 */
@DAO(daoClass = QdChuyenHs24DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_CHUYEN_HS_24", schema = "BCA_MOTO")
public class QdChuyenHs24 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapQd;
	private Long qd30Id;
	private String qd25Id;
	private String bb43Id;
	private String bb43So;
	private Date bb43Ngay;
	private String qd25So;
	private Date qd25Ngay;
	private String qd25Ky;
	private String qd30So;
	private Date qd30Ngay;
	private Long cbxlId;
	private String capBac;
	private String chucVu;
	private String donVi;
	private String dauHieuPt;
	private String coQuanTruyCuu;
	private String soTap;
	private String soTrang;
	private String tenTvPt;
	private String toChucTb;
	private String toChucThucHien;
	private String nguoiRaQd;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long idNam;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private String diaDanhHc;
	private String donViCanhsat;

	public QdChuyenHs24() {
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
	@Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 30)
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

	@Caption("NgayLapQd")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_QD", columnDefinition = "DATE", length = 7)
	public Date getNgayLapQd() {
		return this.ngayLapQd;
	}

	public void setNgayLapQd(Date ngayLapQd) {
		this.ngayLapQd = ngayLapQd;
	}

	@Caption("Qd30Id")
	@Column(name = "QD_30_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd30Id() {
		return this.qd30Id;
	}

	public void setQd30Id(Long qd30Id) {
		this.qd30Id = qd30Id;
	}

	@Caption("Qd25Id")
	@Column(name = "QD_25_ID", columnDefinition = "VARCHAR2", length = 100)
	public String getQd25Id() {
		return this.qd25Id;
	}

	public void setQd25Id(String qd25Id) {
		this.qd25Id = qd25Id;
	}

	@Caption("Bb43Id")
	@Column(name = "BB_43_ID", columnDefinition = "VARCHAR2", length = 100)
	public String getBb43Id() {
		return this.bb43Id;
	}

	public void setBb43Id(String bb43Id) {
		this.bb43Id = bb43Id;
	}

	@Caption("Bb43So")
	@Column(name = "BB43_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getBb43So() {
		return this.bb43So;
	}

	public void setBb43So(String bb43So) {
		this.bb43So = bb43So;
	}

	@Caption("Bb43Ngay")
	@Temporal(TemporalType.DATE)
	@Column(name = "BB43_NGAY", columnDefinition = "DATE", length = 7)
	public Date getBb43Ngay() {
		return this.bb43Ngay;
	}

	public void setBb43Ngay(Date bb43Ngay) {
		this.bb43Ngay = bb43Ngay;
	}

	@Caption("Qd25So")
	@Column(name = "QD_25_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getQd25So() {
		return this.qd25So;
	}

	public void setQd25So(String qd25So) {
		this.qd25So = qd25So;
	}

	@Caption("Qd25Ngay")
	@Temporal(TemporalType.DATE)
	@Column(name = "QD_25_NGAY", columnDefinition = "DATE", length = 7)
	public Date getQd25Ngay() {
		return this.qd25Ngay;
	}

	public void setQd25Ngay(Date qd25Ngay) {
		this.qd25Ngay = qd25Ngay;
	}

	@Caption("Qd25Ky")
	@Column(name = "QD_25_KY", columnDefinition = "VARCHAR2", length = 100)
	public String getQd25Ky() {
		return this.qd25Ky;
	}

	public void setQd25Ky(String qd25Ky) {
		this.qd25Ky = qd25Ky;
	}

	@Caption("Qd30So")
	@Column(name = "QD_30_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getQd30So() {
		return this.qd30So;
	}

	public void setQd30So(String qd30So) {
		this.qd30So = qd30So;
	}

	@Caption("Qd30Ngay")
	@Temporal(TemporalType.DATE)
	@Column(name = "QD_30_NGAY", columnDefinition = "DATE", length = 7)
	public Date getQd30Ngay() {
		return this.qd30Ngay;
	}

	public void setQd30Ngay(Date qd30Ngay) {
		this.qd30Ngay = qd30Ngay;
	}

	@Caption("CbxlId")
	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
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

	@Caption("DauHieuPt")
	@Column(name = "DAU_HIEU_PT", columnDefinition = "VARCHAR2", length = 200)
	public String getDauHieuPt() {
		return this.dauHieuPt;
	}

	public void setDauHieuPt(String dauHieuPt) {
		this.dauHieuPt = dauHieuPt;
	}

	@Caption("CoQuanTruyCuu")
	@Column(name = "CO_QUAN_TRUY_CUU", columnDefinition = "VARCHAR2", length = 200)
	public String getCoQuanTruyCuu() {
		return this.coQuanTruyCuu;
	}

	public void setCoQuanTruyCuu(String coQuanTruyCuu) {
		this.coQuanTruyCuu = coQuanTruyCuu;
	}

	@Caption("SoTap")
	@Column(name = "SO_TAP", columnDefinition = "VARCHAR2", length = 5)
	public String getSoTap() {
		return this.soTap;
	}

	public void setSoTap(String soTap) {
		this.soTap = soTap;
	}

	@Caption("SoTrang")
	@Column(name = "SO_TRANG", columnDefinition = "VARCHAR2", length = 5)
	public String getSoTrang() {
		return this.soTrang;
	}

	public void setSoTrang(String soTrang) {
		this.soTrang = soTrang;
	}

	@Caption("TenTvPt")
	@Column(name = "TEN_TV_PT", columnDefinition = "VARCHAR2", length = 400)
	public String getTenTvPt() {
		return this.tenTvPt;
	}

	public void setTenTvPt(String tenTvPt) {
		this.tenTvPt = tenTvPt;
	}

	@Caption("ToChucTb")
	@Column(name = "TO_CHUC_TB", columnDefinition = "VARCHAR2", length = 100)
	public String getToChucTb() {
		return this.toChucTb;
	}

	public void setToChucTb(String toChucTb) {
		this.toChucTb = toChucTb;
	}

	@Caption("ToChucThucHien")
	@Column(name = "TO_CHUC_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getToChucThucHien() {
		return this.toChucThucHien;
	}

	public void setToChucThucHien(String toChucThucHien) {
		this.toChucThucHien = toChucThucHien;
	}

	@Caption("NguoiRaQd")
	@Column(name = "NGUOI_RA_QD", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiRaQd() {
		return this.nguoiRaQd;
	}

	public void setNguoiRaQd(String nguoiRaQd) {
		this.nguoiRaQd = nguoiRaQd;
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

	@Caption("IdNam")
	@Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdNam() {
		return this.idNam;
	}

	public void setIdNam(Long idNam) {
		this.idNam = idNam;
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

	@Caption("DiaDanhHc")
	@Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 30)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Caption("DonViCanhsat")
	@Column(name = "DON_VI_CANHSAT", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViCanhsat() {
		return this.donViCanhsat;
	}

	public void setDonViCanhsat(String donViCanhsat) {
		this.donViCanhsat = donViCanhsat;
	}

}
