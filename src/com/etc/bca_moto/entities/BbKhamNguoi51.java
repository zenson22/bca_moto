package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbKhamNguoi51DAO;
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
 * BbKhamNguoi51
 */
@DAO(daoClass = BbKhamNguoi51DAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BB_KHAM_NGUOI_51", schema = "BCA_MOTO")
public class BbKhamNguoi51 implements java.io.Serializable {

	private long id;
	private String soBienBan;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapBb;
	private Long qd21Id;
	private String thuTucHcSo;
	private Date thuTucHcNgay;
	private String thuTucHcKy;
	private Date thoiGianLapBb;
	private String diaDiemLapBb;
	private Long cbxlId;
	private String capBac;
	private String chucVu;
	private String donVi;
	private String soCmnd;
	private String soDienThoai;
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
	private String nguoiNhanBb;
	private Date thoiGianBbLapXong;
	private String nguoiLapBb;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long idNam;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private String danhSachNguoiCk;
	private String gioLapBbXong;
	private String phutLapBbXong;

	public BbKhamNguoi51() {
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

	@Caption("Qd21Id")
	@Column(name = "QD_21_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd21Id() {
		return this.qd21Id;
	}

	public void setQd21Id(Long qd21Id) {
		this.qd21Id = qd21Id;
	}

	@Caption("ThuTucHcSo")
	@Column(name = "THU_TUC_HC_SO", columnDefinition = "VARCHAR2", length = 100)
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

	@Caption("ThuTucHcKy")
	@Column(name = "THU_TUC_HC_KY", columnDefinition = "VARCHAR2", length = 100)
	public String getThuTucHcKy() {
		return this.thuTucHcKy;
	}

	public void setThuTucHcKy(String thuTucHcKy) {
		this.thuTucHcKy = thuTucHcKy;
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

	@Caption("SoCmnd")
	@Column(name = "SO_CMND", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmnd() {
		return this.soCmnd;
	}

	public void setSoCmnd(String soCmnd) {
		this.soCmnd = soCmnd;
	}

	@Caption("SoDienThoai")
	@Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)
	public String getSoDienThoai() {
		return this.soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
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
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 120)
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

	@Caption("NguoiNhanBb")
	@Column(name = "NGUOI_NHAN_BB", columnDefinition = "VARCHAR2", length = 150)
	public String getNguoiNhanBb() {
		return this.nguoiNhanBb;
	}

	public void setNguoiNhanBb(String nguoiNhanBb) {
		this.nguoiNhanBb = nguoiNhanBb;
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

	@Caption("DanhSachNguoiCk")
	@Column(name = "DANH_SACH_NGUOI_CK", columnDefinition = "VARCHAR2", length = 2000)
	public String getDanhSachNguoiCk() {
		return this.danhSachNguoiCk;
	}

	public void setDanhSachNguoiCk(String danhSachNguoiCk) {
		this.danhSachNguoiCk = danhSachNguoiCk;
	}

	@Caption("GioLapBbXong")
	@Column(name = "GIO_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 20)
	public String getGioLapBbXong() {
		return this.gioLapBbXong;
	}

	public void setGioLapBbXong(String gioLapBbXong) {
		this.gioLapBbXong = gioLapBbXong;
	}

	@Caption("PhutLapBbXong")
	@Column(name = "PHUT_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 20)
	public String getPhutLapBbXong() {
		return this.phutLapBbXong;
	}

	public void setPhutLapBbXong(String phutLapBbXong) {
		this.phutLapBbXong = phutLapBbXong;
	}

}
