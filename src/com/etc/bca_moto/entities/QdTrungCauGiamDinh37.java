package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdTrungCauGiamDinh37DAO;
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
 * QdTrungCauGiamDinh37
 */
@DAO(daoClass = QdTrungCauGiamDinh37DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_TRUNG_CAU_GIAM_DINH_37", schema = "BCA_MOTO")
public class QdTrungCauGiamDinh37 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private String bbvphcSo;
	private String bbvphcNgay;
	private String bbPhienGtSo;
	private String bbPhienGtNgay;
	private String bbXacMinhSo;
	private String bbXacMinhNgay;
	private String canCuQdGqxpSo;
	private Date canCuQdGqxpNgay;
	private String capBac;
	private String chucVu;
	private String donVi;
	private String trungCau;
	private String doiTuongGiamDinh;
	private String noiDungGiamDinh;
	private String taiLieuLienQuan;
	private String toChucThucHien;
	private String caNhanDaiDienViPham;
	private String toChucThucHienGiamDinh;
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
	private Long soBb43Tc;

	public QdTrungCauGiamDinh37() {
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

	@Caption("BbvphcSo")
	@Column(name = "BBVPHC_SO", columnDefinition = "VARCHAR2", length = 50)
	public String getBbvphcSo() {
		return this.bbvphcSo;
	}

	public void setBbvphcSo(String bbvphcSo) {
		this.bbvphcSo = bbvphcSo;
	}

	@Caption("BbvphcNgay")
	@Column(name = "BBVPHC_NGAY", columnDefinition = "VARCHAR2", length = 50)
	public String getBbvphcNgay() {
		return this.bbvphcNgay;
	}

	public void setBbvphcNgay(String bbvphcNgay) {
		this.bbvphcNgay = bbvphcNgay;
	}

	@Caption("BbPhienGtSo")
	@Column(name = "BB_PHIEN_GT_SO", columnDefinition = "VARCHAR2", length = 50)
	public String getBbPhienGtSo() {
		return this.bbPhienGtSo;
	}

	public void setBbPhienGtSo(String bbPhienGtSo) {
		this.bbPhienGtSo = bbPhienGtSo;
	}

	@Caption("BbPhienGtNgay")
	@Column(name = "BB_PHIEN_GT_NGAY", columnDefinition = "VARCHAR2", length = 50)
	public String getBbPhienGtNgay() {
		return this.bbPhienGtNgay;
	}

	public void setBbPhienGtNgay(String bbPhienGtNgay) {
		this.bbPhienGtNgay = bbPhienGtNgay;
	}

	@Caption("BbXacMinhSo")
	@Column(name = "BB_XAC_MINH_SO", columnDefinition = "VARCHAR2", length = 50)
	public String getBbXacMinhSo() {
		return this.bbXacMinhSo;
	}

	public void setBbXacMinhSo(String bbXacMinhSo) {
		this.bbXacMinhSo = bbXacMinhSo;
	}

	@Caption("BbXacMinhNgay")
	@Column(name = "BB_XAC_MINH_NGAY", columnDefinition = "VARCHAR2", length = 50)
	public String getBbXacMinhNgay() {
		return this.bbXacMinhNgay;
	}

	public void setBbXacMinhNgay(String bbXacMinhNgay) {
		this.bbXacMinhNgay = bbXacMinhNgay;
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

	@Caption("TrungCau")
	@Column(name = "TRUNG_CAU", columnDefinition = "VARCHAR2", length = 300)
	public String getTrungCau() {
		return this.trungCau;
	}

	public void setTrungCau(String trungCau) {
		this.trungCau = trungCau;
	}

	@Caption("DoiTuongGiamDinh")
	@Column(name = "DOI_TUONG_GIAM_DINH", columnDefinition = "VARCHAR2", length = 300)
	public String getDoiTuongGiamDinh() {
		return this.doiTuongGiamDinh;
	}

	public void setDoiTuongGiamDinh(String doiTuongGiamDinh) {
		this.doiTuongGiamDinh = doiTuongGiamDinh;
	}

	@Caption("NoiDungGiamDinh")
	@Column(name = "NOI_DUNG_GIAM_DINH", columnDefinition = "VARCHAR2", length = 300)
	public String getNoiDungGiamDinh() {
		return this.noiDungGiamDinh;
	}

	public void setNoiDungGiamDinh(String noiDungGiamDinh) {
		this.noiDungGiamDinh = noiDungGiamDinh;
	}

	@Caption("TaiLieuLienQuan")
	@Column(name = "TAI_LIEU_LIEN_QUAN", columnDefinition = "VARCHAR2", length = 300)
	public String getTaiLieuLienQuan() {
		return this.taiLieuLienQuan;
	}

	public void setTaiLieuLienQuan(String taiLieuLienQuan) {
		this.taiLieuLienQuan = taiLieuLienQuan;
	}

	@Caption("ToChucThucHien")
	@Column(name = "TO_CHUC_THUC_HIEN", columnDefinition = "VARCHAR2", length = 300)
	public String getToChucThucHien() {
		return this.toChucThucHien;
	}

	public void setToChucThucHien(String toChucThucHien) {
		this.toChucThucHien = toChucThucHien;
	}

	@Caption("CaNhanDaiDienViPham")
	@Column(name = "CA_NHAN_DAI_DIEN_VI_PHAM", columnDefinition = "VARCHAR2", length = 300)
	public String getCaNhanDaiDienViPham() {
		return this.caNhanDaiDienViPham;
	}

	public void setCaNhanDaiDienViPham(String caNhanDaiDienViPham) {
		this.caNhanDaiDienViPham = caNhanDaiDienViPham;
	}

	@Caption("ToChucThucHienGiamDinh")
	@Column(name = "TO_CHUC_THUC_HIEN_GIAM_DINH", columnDefinition = "VARCHAR2", length = 300)
	public String getToChucThucHienGiamDinh() {
		return this.toChucThucHienGiamDinh;
	}

	public void setToChucThucHienGiamDinh(String toChucThucHienGiamDinh) {
		this.toChucThucHienGiamDinh = toChucThucHienGiamDinh;
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

	@Caption("SoBb43Tc")
	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

}
