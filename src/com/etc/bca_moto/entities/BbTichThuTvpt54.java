package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbTichThuTvpt54DAO;
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
 * BbTichThuTvpt54
 */
@DAO(daoClass = BbTichThuTvpt54DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BB_TICH_THU_TVPT_54", schema = "BCA_MOTO")
public class BbTichThuTvpt54 implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private Long qd11Id;
	private Date thoiGianLapBb;
	private String diaDiemLapBb;
	private Long cbxlId1;
	private Long cbxlId2;
	private Long cbxlId3;
	private String chungToiGom;
	private String dsChungKien;
	private String tienHanhKham;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String diaChiNvp;
	private String daTienHanhNp;
	private String nguoiCk;
	private String YKienCaNhan;
	private String YKienNguoiCk;
	private String YKienBoSung;
	private Date thoiGianBbLapXong;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long idNam;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private String nguoiKiBb;

	public BbTichThuTvpt54() {
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
	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 30)
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

	@Caption("Qd11Id")
	@Column(name = "QD_11_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd11Id() {
		return this.qd11Id;
	}

	public void setQd11Id(Long qd11Id) {
		this.qd11Id = qd11Id;
	}

	@Caption("ThoiGianLapBb")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_GIAN_LAP_BB", columnDefinition = "DATE", length = 7)
	public Date getThoiGianLapBb() {
		return this.thoiGianLapBb;
	}

	public void setThoiGianLapBb(Date thoiGianLapBb) {
		this.thoiGianLapBb = thoiGianLapBb;
	}

	@Caption("DiaDiemLapBb")
	@Column(name = "DIA_DIEM_LAP_BB", columnDefinition = "VARCHAR2", length = 120)
	public String getDiaDiemLapBb() {
		return this.diaDiemLapBb;
	}

	public void setDiaDiemLapBb(String diaDiemLapBb) {
		this.diaDiemLapBb = diaDiemLapBb;
	}

	@Caption("CbxlId1")
	@Column(name = "CBXL_ID1", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId1() {
		return this.cbxlId1;
	}

	public void setCbxlId1(Long cbxlId1) {
		this.cbxlId1 = cbxlId1;
	}

	@Caption("CbxlId2")
	@Column(name = "CBXL_ID2", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId2() {
		return this.cbxlId2;
	}

	public void setCbxlId2(Long cbxlId2) {
		this.cbxlId2 = cbxlId2;
	}

	@Caption("CbxlId3")
	@Column(name = "CBXL_ID3", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId3() {
		return this.cbxlId3;
	}

	public void setCbxlId3(Long cbxlId3) {
		this.cbxlId3 = cbxlId3;
	}

	@Caption("ChungToiGom")
	@Column(name = "CHUNG_TOI_GOM", columnDefinition = "VARCHAR2", length = 300)
	public String getChungToiGom() {
		return this.chungToiGom;
	}

	public void setChungToiGom(String chungToiGom) {
		this.chungToiGom = chungToiGom;
	}

	@Caption("DsChungKien")
	@Column(name = "DS_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 250)
	public String getDsChungKien() {
		return this.dsChungKien;
	}

	public void setDsChungKien(String dsChungKien) {
		this.dsChungKien = dsChungKien;
	}

	@Caption("TienHanhKham")
	@Column(name = "TIEN_HANH_KHAM", columnDefinition = "VARCHAR2", length = 300)
	public String getTienHanhKham() {
		return this.tienHanhKham;
	}

	public void setTienHanhKham(String tienHanhKham) {
		this.tienHanhKham = tienHanhKham;
	}

	@Caption("TenNguoiNvp")
	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 100)
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
	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 500)
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
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 150)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Caption("DaTienHanhNp")
	@Column(name = "DA_TIEN_HANH_NP", columnDefinition = "VARCHAR2", length = 100)
	public String getDaTienHanhNp() {
		return this.daTienHanhNp;
	}

	public void setDaTienHanhNp(String daTienHanhNp) {
		this.daTienHanhNp = daTienHanhNp;
	}

	@Caption("NguoiCk")
	@Column(name = "NGUOI_CK", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiCk() {
		return this.nguoiCk;
	}

	public void setNguoiCk(String nguoiCk) {
		this.nguoiCk = nguoiCk;
	}

	@Caption("YKienCaNhan")
	@Column(name = "Y_KIEN_CA_NHAN", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienCaNhan() {
		return this.YKienCaNhan;
	}

	public void setYKienCaNhan(String YKienCaNhan) {
		this.YKienCaNhan = YKienCaNhan;
	}

	@Caption("YKienNguoiCk")
	@Column(name = "Y_KIEN_NGUOI_CK", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienNguoiCk() {
		return this.YKienNguoiCk;
	}

	public void setYKienNguoiCk(String YKienNguoiCk) {
		this.YKienNguoiCk = YKienNguoiCk;
	}

	@Caption("YKienBoSung")
	@Column(name = "Y_KIEN_BO_SUNG", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienBoSung() {
		return this.YKienBoSung;
	}

	public void setYKienBoSung(String YKienBoSung) {
		this.YKienBoSung = YKienBoSung;
	}

	@Caption("ThoiGianBbLapXong")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_GIAN_BB_LAP_XONG", columnDefinition = "DATE", length = 7)
	public Date getThoiGianBbLapXong() {
		return this.thoiGianBbLapXong;
	}

	public void setThoiGianBbLapXong(Date thoiGianBbLapXong) {
		this.thoiGianBbLapXong = thoiGianBbLapXong;
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

	@Caption("NguoiKiBb")
	@Column(name = "NGUOI_KI_BB", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiKiBb() {
		return this.nguoiKiBb;
	}

	public void setNguoiKiBb(String nguoiKiBb) {
		this.nguoiKiBb = nguoiKiBb;
	}

}
