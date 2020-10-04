package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdGiaoTvpt36DAO;
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
 * QdGiaoTvpt36
 */
@DAO(daoClass = QdGiaoTvpt36DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_GIAO_TVPT_36", schema = "BCA_MOTO")
public class QdGiaoTvpt36 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapQd;
	private Long qd30Id;
	private String bb43Id;
	private Long cbxlId;
	private String capBac;
	private String chucVu;
	private String donVi;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String diaChiNvp;
	private String tvpt;
	private String lyDoGiaoTvpt;
	private String thoiHanTg;
	private Date tgTuNgay;
	private Date tgDenNgay;
	private String toChucCh;
	private String toChucTh;
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

	public QdGiaoTvpt36() {
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

	@Caption("Bb43Id")
	@Column(name = "BB_43_ID", columnDefinition = "VARCHAR2", length = 100)
	public String getBb43Id() {
		return this.bb43Id;
	}

	public void setBb43Id(String bb43Id) {
		this.bb43Id = bb43Id;
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

	@Caption("TenNguoiNvp")
	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNguoiNvp() {
		return this.tenNguoiNvp;
	}

	public void setTenNguoiNvp(String tenNguoiNvp) {
		this.tenNguoiNvp = tenNguoiNvp;
	}

	@Caption("NgaySinhNvp")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)
	public Date getNgaySinhNvp() {
		return this.ngaySinhNvp;
	}

	public void setNgaySinhNvp(Date ngaySinhNvp) {
		this.ngaySinhNvp = ngaySinhNvp;
	}

	@Caption("QuocTichNvp")
	@Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)
	public String getQuocTichNvp() {
		return this.quocTichNvp;
	}

	public void setQuocTichNvp(String quocTichNvp) {
		this.quocTichNvp = quocTichNvp;
	}

	@Caption("NgheNghiepNvp")
	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getNgheNghiepNvp() {
		return this.ngheNghiepNvp;
	}

	public void setNgheNghiepNvp(String ngheNghiepNvp) {
		this.ngheNghiepNvp = ngheNghiepNvp;
	}

	@Caption("SoCmndNvp")
	@Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNvp() {
		return this.soCmndNvp;
	}

	public void setSoCmndNvp(String soCmndNvp) {
		this.soCmndNvp = soCmndNvp;
	}

	@Caption("NgayCapCmndNvp")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmndNvp() {
		return this.ngayCapCmndNvp;
	}

	public void setNgayCapCmndNvp(Date ngayCapCmndNvp) {
		this.ngayCapCmndNvp = ngayCapCmndNvp;
	}

	@Caption("NoiCapCmndNvp")
	@Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)
	public String getNoiCapCmndNvp() {
		return this.noiCapCmndNvp;
	}

	public void setNoiCapCmndNvp(String noiCapCmndNvp) {
		this.noiCapCmndNvp = noiCapCmndNvp;
	}

	@Caption("DiaChiNvp")
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Caption("Tvpt")
	@Column(name = "TVPT", columnDefinition = "VARCHAR2", length = 300)
	public String getTvpt() {
		return this.tvpt;
	}

	public void setTvpt(String tvpt) {
		this.tvpt = tvpt;
	}

	@Caption("LyDoGiaoTvpt")
	@Column(name = "LY_DO_GIAO_TVPT", columnDefinition = "VARCHAR2", length = 200)
	public String getLyDoGiaoTvpt() {
		return this.lyDoGiaoTvpt;
	}

	public void setLyDoGiaoTvpt(String lyDoGiaoTvpt) {
		this.lyDoGiaoTvpt = lyDoGiaoTvpt;
	}

	@Caption("ThoiHanTg")
	@Column(name = "THOI_HAN_TG", columnDefinition = "VARCHAR2", length = 5)
	public String getThoiHanTg() {
		return this.thoiHanTg;
	}

	public void setThoiHanTg(String thoiHanTg) {
		this.thoiHanTg = thoiHanTg;
	}

	@Caption("TgTuNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "TG_TU_NGAY", columnDefinition = "DATE", length = 7)
	public Date getTgTuNgay() {
		return this.tgTuNgay;
	}

	public void setTgTuNgay(Date tgTuNgay) {
		this.tgTuNgay = tgTuNgay;
	}

	@Caption("TgDenNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "TG_DEN_NGAY", columnDefinition = "DATE", length = 7)
	public Date getTgDenNgay() {
		return this.tgDenNgay;
	}

	public void setTgDenNgay(Date tgDenNgay) {
		this.tgDenNgay = tgDenNgay;
	}

	@Caption("ToChucCh")
	@Column(name = "TO_CHUC_CH", columnDefinition = "VARCHAR2", length = 150)
	public String getToChucCh() {
		return this.toChucCh;
	}

	public void setToChucCh(String toChucCh) {
		this.toChucCh = toChucCh;
	}

	@Caption("ToChucTh")
	@Column(name = "TO_CHUC_TH", columnDefinition = "VARCHAR2", length = 150)
	public String getToChucTh() {
		return this.toChucTh;
	}

	public void setToChucTh(String toChucTh) {
		this.toChucTh = toChucTh;
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
