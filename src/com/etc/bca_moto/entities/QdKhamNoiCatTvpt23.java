package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdKhamNoiCatTvpt23DAO;
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
 * QdKhamNoiCatTvpt23
 */
@DAO(daoClass = QdKhamNoiCatTvpt23DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_KHAM_NOI_CAT_TVPT_23", schema = "BCA_MOTO")
public class QdKhamNoiCatTvpt23 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapBbVphc;
	private Long qd30Id;
	private Long bb53Id;
	private String bpTamGiu;
	private String qd30So;
	private Date qd30Ngay;
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
	private String lyDoKham;
	private String phamViKham;
	private String diaDiemKham;
	private String toChucChapHanh;
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
	private String tenDonVi;
	private String diaDanhHc;
	private String canBoLapbb;
	private String noiONvp;
	private String tochucThuTien;

	public QdKhamNoiCatTvpt23() {
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

	@Caption("NgayLapBbVphc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_BB_VPHC", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBbVphc() {
		return this.ngayLapBbVphc;
	}

	public void setNgayLapBbVphc(Date ngayLapBbVphc) {
		this.ngayLapBbVphc = ngayLapBbVphc;
	}

	@Caption("Qd30Id")
	@Column(name = "QD_30_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd30Id() {
		return this.qd30Id;
	}

	public void setQd30Id(Long qd30Id) {
		this.qd30Id = qd30Id;
	}

	@Caption("Bb53Id")
	@Column(name = "BB_53_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBb53Id() {
		return this.bb53Id;
	}

	public void setBb53Id(Long bb53Id) {
		this.bb53Id = bb53Id;
	}

	@Caption("BpTamGiu")
	@Column(name = "BP_TAM_GIU", columnDefinition = "VARCHAR2", length = 150)
	public String getBpTamGiu() {
		return this.bpTamGiu;
	}

	public void setBpTamGiu(String bpTamGiu) {
		this.bpTamGiu = bpTamGiu;
	}

	@Caption("Qd30So")
	@Column(name = "QD30_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getQd30So() {
		return this.qd30So;
	}

	public void setQd30So(String qd30So) {
		this.qd30So = qd30So;
	}

	@Caption("Qd30Ngay")
	@Temporal(TemporalType.DATE)
	@Column(name = "QD30_NGAY", columnDefinition = "DATE", length = 7)
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

	@Caption("LyDoKham")
	@Column(name = "LY_DO_KHAM", columnDefinition = "VARCHAR2", length = 150)
	public String getLyDoKham() {
		return this.lyDoKham;
	}

	public void setLyDoKham(String lyDoKham) {
		this.lyDoKham = lyDoKham;
	}

	@Caption("PhamViKham")
	@Column(name = "PHAM_VI_KHAM", columnDefinition = "VARCHAR2", length = 150)
	public String getPhamViKham() {
		return this.phamViKham;
	}

	public void setPhamViKham(String phamViKham) {
		this.phamViKham = phamViKham;
	}

	@Caption("DiaDiemKham")
	@Column(name = "DIA_DIEM_KHAM", columnDefinition = "VARCHAR2", length = 150)
	public String getDiaDiemKham() {
		return this.diaDiemKham;
	}

	public void setDiaDiemKham(String diaDiemKham) {
		this.diaDiemKham = diaDiemKham;
	}

	@Caption("ToChucChapHanh")
	@Column(name = "TO_CHUC_CHAP_HANH", columnDefinition = "VARCHAR2", length = 100)
	public String getToChucChapHanh() {
		return this.toChucChapHanh;
	}

	public void setToChucChapHanh(String toChucChapHanh) {
		this.toChucChapHanh = toChucChapHanh;
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

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("DiaDanhHc")
	@Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 50)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Caption("CanBoLapbb")
	@Column(name = "CAN_BO_LAPBB", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoLapbb() {
		return this.canBoLapbb;
	}

	public void setCanBoLapbb(String canBoLapbb) {
		this.canBoLapbb = canBoLapbb;
	}

	@Caption("NoiONvp")
	@Column(name = "NOI_O_NVP", columnDefinition = "VARCHAR2", length = 150)
	public String getNoiONvp() {
		return this.noiONvp;
	}

	public void setNoiONvp(String noiONvp) {
		this.noiONvp = noiONvp;
	}

	@Caption("TochucThuTien")
	@Column(name = "TOCHUC_THU_TIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getTochucThuTien() {
		return this.tochucThuTien;
	}

	public void setTochucThuTien(String tochucThuTien) {
		this.tochucThuTien = tochucThuTien;
	}

}
