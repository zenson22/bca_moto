package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdTieuHuyTv13DAO;
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
 * QdTieuHuyTv13
 */
@DAO(daoClass = QdTieuHuyTv13DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_TIEU_HUY_TV_13", schema = "BCA_MOTO")
public class QdTieuHuyTv13 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapBbVphc;
	private Long qd11Id;
	private Long bbVphc43Id;
	private Long bbXm34Id;
	private String bbVphcSo;
	private Date bbVphcNgay;
	private String canCuBbXmSo;
	private Date canCuBbXmNgay;
	private String canCuQdGqxpSo;
	private Date canCuQdGqxpNgay;
	private String capBac;
	private String chucVu;
	private String donVi;
	private Long tv13Id;
	private String lyDoTieuHuy;
	private String diaDiemTieuHuy;
	private String thoiGianThucHien;
	private String thanhPhanThamGia;
	private String toChucThucHien;
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

	public QdTieuHuyTv13() {
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

	@Caption("NgayLapBbVphc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_BB_VPHC", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBbVphc() {
		return this.ngayLapBbVphc;
	}

	public void setNgayLapBbVphc(Date ngayLapBbVphc) {
		this.ngayLapBbVphc = ngayLapBbVphc;
	}

	@Caption("Qd11Id")
	@Column(name = "QD_11_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd11Id() {
		return this.qd11Id;
	}

	public void setQd11Id(Long qd11Id) {
		this.qd11Id = qd11Id;
	}

	@Caption("BbVphc43Id")
	@Column(name = "BB_VPHC43_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBbVphc43Id() {
		return this.bbVphc43Id;
	}

	public void setBbVphc43Id(Long bbVphc43Id) {
		this.bbVphc43Id = bbVphc43Id;
	}

	@Caption("BbXm34Id")
	@Column(name = "BB_XM34_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBbXm34Id() {
		return this.bbXm34Id;
	}

	public void setBbXm34Id(Long bbXm34Id) {
		this.bbXm34Id = bbXm34Id;
	}

	@Caption("BbVphcSo")
	@Column(name = "BB_VPHC_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getBbVphcSo() {
		return this.bbVphcSo;
	}

	public void setBbVphcSo(String bbVphcSo) {
		this.bbVphcSo = bbVphcSo;
	}

	@Caption("BbVphcNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "BB_VPHC_NGAY", columnDefinition = "DATE", length = 7)
	public Date getBbVphcNgay() {
		return this.bbVphcNgay;
	}

	public void setBbVphcNgay(Date bbVphcNgay) {
		this.bbVphcNgay = bbVphcNgay;
	}

	@Caption("CanCuBbXmSo")
	@Column(name = "CAN_CU_BB_XM_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuBbXmSo() {
		return this.canCuBbXmSo;
	}

	public void setCanCuBbXmSo(String canCuBbXmSo) {
		this.canCuBbXmSo = canCuBbXmSo;
	}

	@Caption("CanCuBbXmNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_BB_XM_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuBbXmNgay() {
		return this.canCuBbXmNgay;
	}

	public void setCanCuBbXmNgay(Date canCuBbXmNgay) {
		this.canCuBbXmNgay = canCuBbXmNgay;
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

	@Caption("Tv13Id")
	@Column(name = "TV_13_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTv13Id() {
		return this.tv13Id;
	}

	public void setTv13Id(Long tv13Id) {
		this.tv13Id = tv13Id;
	}

	@Caption("LyDoTieuHuy")
	@Column(name = "LY_DO_TIEU_HUY", columnDefinition = "VARCHAR2", length = 250)
	public String getLyDoTieuHuy() {
		return this.lyDoTieuHuy;
	}

	public void setLyDoTieuHuy(String lyDoTieuHuy) {
		this.lyDoTieuHuy = lyDoTieuHuy;
	}

	@Caption("DiaDiemTieuHuy")
	@Column(name = "DIA_DIEM_TIEU_HUY", columnDefinition = "VARCHAR2", length = 250)
	public String getDiaDiemTieuHuy() {
		return this.diaDiemTieuHuy;
	}

	public void setDiaDiemTieuHuy(String diaDiemTieuHuy) {
		this.diaDiemTieuHuy = diaDiemTieuHuy;
	}

	@Caption("ThoiGianThucHien")
	@Column(name = "THOI_GIAN_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getThoiGianThucHien() {
		return this.thoiGianThucHien;
	}

	public void setThoiGianThucHien(String thoiGianThucHien) {
		this.thoiGianThucHien = thoiGianThucHien;
	}

	@Caption("ThanhPhanThamGia")
	@Column(name = "THANH_PHAN_THAM_GIA", columnDefinition = "VARCHAR2", length = 100)
	public String getThanhPhanThamGia() {
		return this.thanhPhanThamGia;
	}

	public void setThanhPhanThamGia(String thanhPhanThamGia) {
		this.thanhPhanThamGia = thanhPhanThamGia;
	}

	@Caption("ToChucThucHien")
	@Column(name = "TO_CHUC_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getToChucThucHien() {
		return this.toChucThucHien;
	}

	public void setToChucThucHien(String toChucThucHien) {
		this.toChucThucHien = toChucThucHien;
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
