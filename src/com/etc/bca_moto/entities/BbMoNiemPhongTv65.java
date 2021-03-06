package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbMoNiemPhongTv65DAO;
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
 * BbMoNiemPhongTv65
 */
@DAO(daoClass = BbMoNiemPhongTv65DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BB_MO_NIEM_PHONG_TV_65", schema = "BCA_MOTO")
public class BbMoNiemPhongTv65 implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private String canCu;
	private Date ngayLapBb;
	private String gioLapBb;
	private String phutLapBb;
	private String diaDiemLap;
	private Long canBoLapId;
	private String capBacChucVu;
	private String donVi;
	private String nguoiChungKien;
	private String nguoiBaoQuan;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String qdMoTvSo;
	private Date qdMoTvNgay;
	private String thuTucHcSo;
	private Date thuTucHcNgay;
	private String YKienBoSung;
	private Long bb64Id;
	private Date ngayLapBbXong;
	private String gioLapBbXong;
	private String phutLapBbXong;
	private String giaoCho;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private String ngaySinhNvpNhap;
	private String diaChiNvp;
	private String canBoLap;
	private String qdTamgiuSo;
	private Date qdTamgiuNgay;
	private Long soBb43Tc;
	private String tangVat1;
	private String tangVat2;

	public BbMoNiemPhongTv65() {
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

	@Caption("CanCu")
	@Column(name = "CAN_CU", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCu() {
		return this.canCu;
	}

	public void setCanCu(String canCu) {
		this.canCu = canCu;
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

	@Caption("CanBoLapId")
	@Column(name = "CAN_BO_LAP_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoLapId() {
		return this.canBoLapId;
	}

	public void setCanBoLapId(Long canBoLapId) {
		this.canBoLapId = canBoLapId;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Caption("DonVi")
	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Caption("NguoiChungKien")
	@Column(name = "NGUOI_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getNguoiChungKien() {
		return this.nguoiChungKien;
	}

	public void setNguoiChungKien(String nguoiChungKien) {
		this.nguoiChungKien = nguoiChungKien;
	}

	@Caption("NguoiBaoQuan")
	@Column(name = "NGUOI_BAO_QUAN", columnDefinition = "VARCHAR2", length = 200)
	public String getNguoiBaoQuan() {
		return this.nguoiBaoQuan;
	}

	public void setNguoiBaoQuan(String nguoiBaoQuan) {
		this.nguoiBaoQuan = nguoiBaoQuan;
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
	@Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 100)
	public String getNoiCapCmndNvp() {
		return this.noiCapCmndNvp;
	}

	public void setNoiCapCmndNvp(String noiCapCmndNvp) {
		this.noiCapCmndNvp = noiCapCmndNvp;
	}

	@Caption("QdMoTvSo")
	@Column(name = "QD_MO_TV_SO", columnDefinition = "VARCHAR2", length = 60)
	public String getQdMoTvSo() {
		return this.qdMoTvSo;
	}

	public void setQdMoTvSo(String qdMoTvSo) {
		this.qdMoTvSo = qdMoTvSo;
	}

	@Caption("QdMoTvNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "QD_MO_TV_NGAY", columnDefinition = "DATE", length = 7)
	public Date getQdMoTvNgay() {
		return this.qdMoTvNgay;
	}

	public void setQdMoTvNgay(Date qdMoTvNgay) {
		this.qdMoTvNgay = qdMoTvNgay;
	}

	@Caption("ThuTucHcSo")
	@Column(name = "THU_TUC_HC_SO", columnDefinition = "VARCHAR2", length = 60)
	public String getThuTucHcSo() {
		return this.thuTucHcSo;
	}

	public void setThuTucHcSo(String thuTucHcSo) {
		this.thuTucHcSo = thuTucHcSo;
	}

	@Caption("ThuTucHcNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "THU_TUC_HC_NGAY", columnDefinition = "DATE", length = 7)
	public Date getThuTucHcNgay() {
		return this.thuTucHcNgay;
	}

	public void setThuTucHcNgay(Date thuTucHcNgay) {
		this.thuTucHcNgay = thuTucHcNgay;
	}

	@Caption("YKienBoSung")
	@Column(name = "Y_KIEN_BO_SUNG", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienBoSung() {
		return this.YKienBoSung;
	}

	public void setYKienBoSung(String YKienBoSung) {
		this.YKienBoSung = YKienBoSung;
	}

	@Caption("Bb64Id")
	@Column(name = "BB64_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBb64Id() {
		return this.bb64Id;
	}

	public void setBb64Id(Long bb64Id) {
		this.bb64Id = bb64Id;
	}

	@Caption("NgayLapBbXong")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_BB_XONG", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBbXong() {
		return this.ngayLapBbXong;
	}

	public void setNgayLapBbXong(Date ngayLapBbXong) {
		this.ngayLapBbXong = ngayLapBbXong;
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

	@Caption("GiaoCho")
	@Column(name = "GIAO_CHO", columnDefinition = "VARCHAR2", length = 100)
	public String getGiaoCho() {
		return this.giaoCho;
	}

	public void setGiaoCho(String giaoCho) {
		this.giaoCho = giaoCho;
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

	@Caption("NgaySinhNvpNhap")
	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Caption("DiaChiNvp")
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Caption("CanBoLap")
	@Column(name = "CAN_BO_LAP", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLap() {
		return this.canBoLap;
	}

	public void setCanBoLap(String canBoLap) {
		this.canBoLap = canBoLap;
	}

	@Caption("QdTamgiuSo")
	@Column(name = "QD_TAMGIU_SO", columnDefinition = "VARCHAR2", length = 60)
	public String getQdTamgiuSo() {
		return this.qdTamgiuSo;
	}

	public void setQdTamgiuSo(String qdTamgiuSo) {
		this.qdTamgiuSo = qdTamgiuSo;
	}

	@Caption("QdTamgiuNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "QD_TAMGIU_NGAY", columnDefinition = "DATE", length = 7)
	public Date getQdTamgiuNgay() {
		return this.qdTamgiuNgay;
	}

	public void setQdTamgiuNgay(Date qdTamgiuNgay) {
		this.qdTamgiuNgay = qdTamgiuNgay;
	}

	@Caption("SoBb43Tc")
	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Caption("TangVat1")
	@Column(name = "TANG_VAT1", columnDefinition = "VARCHAR2", length = 500)
	public String getTangVat1() {
		return this.tangVat1;
	}

	public void setTangVat1(String tangVat1) {
		this.tangVat1 = tangVat1;
	}

	@Caption("TangVat2")
	@Column(name = "TANG_VAT2", columnDefinition = "VARCHAR2", length = 500)
	public String getTangVat2() {
		return this.tangVat2;
	}

	public void setTangVat2(String tangVat2) {
		this.tangVat2 = tangVat2;
	}

}
