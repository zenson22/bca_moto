package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbKhamPhuongTien52DAO;
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
 * BbKhamPhuongTien52
 */
@DAO(daoClass = BbKhamPhuongTien52DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BB_KHAM_PHUONG_TIEN_52", schema = "BCA_MOTO")
public class BbKhamPhuongTien52 implements java.io.Serializable {

	private long idBb52Pk;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private Long qd22Id;
	private Date thoiGianLapBb;
	private String diaDiemLapBb;
	private Long cbxlId1;
	private Long cbxlId2;
	private Long cbxlId3;
	private String chungToiGom;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String diaChiNvp;
	private String YKienTrinhBay;
	private Date thoiGianKhamKt;
	private Date thoiGianBbLapXong;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long idNam;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private String dsChungKien;
	private String tenPhuongtienDovat;
	private Long idBb52;
	private String tangVat1;

	public BbKhamPhuongTien52() {
	}

	@Caption("IdBb52Pk")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID_BB52_PK", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getIdBb52Pk() {
		return this.idBb52Pk;
	}

	public void setIdBb52Pk(long idBb52Pk) {
		this.idBb52Pk = idBb52Pk;
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

	@Caption("Qd22Id")
	@Column(name = "QD_22_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd22Id() {
		return this.qd22Id;
	}

	public void setQd22Id(Long qd22Id) {
		this.qd22Id = qd22Id;
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

	@Caption("YKienTrinhBay")
	@Column(name = "Y_KIEN_TRINH_BAY", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienTrinhBay() {
		return this.YKienTrinhBay;
	}

	public void setYKienTrinhBay(String YKienTrinhBay) {
		this.YKienTrinhBay = YKienTrinhBay;
	}

	@Caption("ThoiGianKhamKt")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_GIAN_KHAM_KT", columnDefinition = "DATE", length = 7)
	public Date getThoiGianKhamKt() {
		return this.thoiGianKhamKt;
	}

	public void setThoiGianKhamKt(Date thoiGianKhamKt) {
		this.thoiGianKhamKt = thoiGianKhamKt;
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

	@Caption("DsChungKien")
	@Column(name = "DS_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 250)
	public String getDsChungKien() {
		return this.dsChungKien;
	}

	public void setDsChungKien(String dsChungKien) {
		this.dsChungKien = dsChungKien;
	}

	@Caption("TenPhuongtienDovat")
	@Column(name = "TEN_PHUONGTIEN_DOVAT", columnDefinition = "VARCHAR2", length = 100)
	public String getTenPhuongtienDovat() {
		return this.tenPhuongtienDovat;
	}

	public void setTenPhuongtienDovat(String tenPhuongtienDovat) {
		this.tenPhuongtienDovat = tenPhuongtienDovat;
	}

	@Caption("IdBb52")
	@Column(name = "ID_BB52", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getIdBb52() {
		return this.idBb52;
	}

	public void setIdBb52(Long idBb52) {
		this.idBb52 = idBb52;
	}

	@Caption("TangVat1")
	@Column(name = "TANG_VAT1", columnDefinition = "VARCHAR2", length = 50)
	public String getTangVat1() {
		return this.tangVat1;
	}

	public void setTangVat1(String tangVat1) {
		this.tangVat1 = tangVat1;
	}

}
