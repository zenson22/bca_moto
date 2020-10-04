package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdGiamMienTienPhat04DAO;
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
 * QdGiamMienTienPhat04
 */
@DAO(daoClass = QdGiamMienTienPhat04DAO.class)
@Caption("{%coQuanChuQuan}")
@Entity
@Table(name = "QD_GIAM_MIEN_TIEN_PHAT_04", schema = "BCA_MOTO")
public class QdGiamMienTienPhat04 implements java.io.Serializable {

	private long id;
	private String coQuanChuQuan;
	private String soQuyetDinh;
	private Date ngayTaoQuyetDinh;
	private String canCuQdVphcSo;
	private Date canCuQdVphcNgay;
	private String vphcKy;
	private String canCuQdHoanThSo;
	private Date canCuQdHoanThNgay;
	private String hoanThKy;
	private String canCuQdGqSo;
	private Date canCuQdGqNgay;
	private Date ngayXetDon;
	private Long canBoRaQdId;
	private String capBacChucVu;
	private String donVi;
	private String tenNguoiNvp;
	private String coQuanXn;
	private String tienPhatDuocGiamBangSo;
	private String tienPhatDuocGiamBangChu;
	private String tienPhatSauGiamBangSo;
	private String tienPhatSauGiamBangChu;
	private String lyDoGiam;
	private String tangVatNhanLai;
	private String phoiHopThucHienQd;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Long ddhcId;
	private Long trangThaiQd;
	private String diaDanhHc;
	private String maThongTu;
	private String maVuViec;
	private Long namLapQd;
	private Long donViCsgtId;

	public QdGiamMienTienPhat04() {
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

	@Caption("CoQuanChuQuan")
	@Column(name = "CO_QUAN_CHU_QUAN", columnDefinition = "VARCHAR2", length = 200)
	public String getCoQuanChuQuan() {
		return this.coQuanChuQuan;
	}

	public void setCoQuanChuQuan(String coQuanChuQuan) {
		this.coQuanChuQuan = coQuanChuQuan;
	}

	@Caption("SoQuyetDinh")
	@Column(name = "SO_QUYET_DINH", columnDefinition = "VARCHAR2", length = 100)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Caption("NgayTaoQuyetDinh")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO_QUYET_DINH", columnDefinition = "DATE", length = 7)
	public Date getNgayTaoQuyetDinh() {
		return this.ngayTaoQuyetDinh;
	}

	public void setNgayTaoQuyetDinh(Date ngayTaoQuyetDinh) {
		this.ngayTaoQuyetDinh = ngayTaoQuyetDinh;
	}

	@Caption("CanCuQdVphcSo")
	@Column(name = "CAN_CU_QD_VPHC_SO", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQdVphcSo() {
		return this.canCuQdVphcSo;
	}

	public void setCanCuQdVphcSo(String canCuQdVphcSo) {
		this.canCuQdVphcSo = canCuQdVphcSo;
	}

	@Caption("CanCuQdVphcNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QD_VPHC_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdVphcNgay() {
		return this.canCuQdVphcNgay;
	}

	public void setCanCuQdVphcNgay(Date canCuQdVphcNgay) {
		this.canCuQdVphcNgay = canCuQdVphcNgay;
	}

	@Caption("VphcKy")
	@Column(name = "VPHC_KY", columnDefinition = "VARCHAR2", length = 200)
	public String getVphcKy() {
		return this.vphcKy;
	}

	public void setVphcKy(String vphcKy) {
		this.vphcKy = vphcKy;
	}

	@Caption("CanCuQdHoanThSo")
	@Column(name = "CAN_CU_QD_HOAN_TH_SO", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQdHoanThSo() {
		return this.canCuQdHoanThSo;
	}

	public void setCanCuQdHoanThSo(String canCuQdHoanThSo) {
		this.canCuQdHoanThSo = canCuQdHoanThSo;
	}

	@Caption("CanCuQdHoanThNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QD_HOAN_TH_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdHoanThNgay() {
		return this.canCuQdHoanThNgay;
	}

	public void setCanCuQdHoanThNgay(Date canCuQdHoanThNgay) {
		this.canCuQdHoanThNgay = canCuQdHoanThNgay;
	}

	@Caption("HoanThKy")
	@Column(name = "HOAN_TH_KY", columnDefinition = "VARCHAR2", length = 200)
	public String getHoanThKy() {
		return this.hoanThKy;
	}

	public void setHoanThKy(String hoanThKy) {
		this.hoanThKy = hoanThKy;
	}

	@Caption("CanCuQdGqSo")
	@Column(name = "CAN_CU_QD_GQ_SO", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQdGqSo() {
		return this.canCuQdGqSo;
	}

	public void setCanCuQdGqSo(String canCuQdGqSo) {
		this.canCuQdGqSo = canCuQdGqSo;
	}

	@Caption("CanCuQdGqNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QD_GQ_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdGqNgay() {
		return this.canCuQdGqNgay;
	}

	public void setCanCuQdGqNgay(Date canCuQdGqNgay) {
		this.canCuQdGqNgay = canCuQdGqNgay;
	}

	@Caption("NgayXetDon")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_XET_DON", columnDefinition = "DATE", length = 7)
	public Date getNgayXetDon() {
		return this.ngayXetDon;
	}

	public void setNgayXetDon(Date ngayXetDon) {
		this.ngayXetDon = ngayXetDon;
	}

	@Caption("CanBoRaQdId")
	@Column(name = "CAN_BO_RA_QD_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoRaQdId() {
		return this.canBoRaQdId;
	}

	public void setCanBoRaQdId(Long canBoRaQdId) {
		this.canBoRaQdId = canBoRaQdId;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 200)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Caption("DonVi")
	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 200)
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

	@Caption("CoQuanXn")
	@Column(name = "CO_QUAN_XN", columnDefinition = "VARCHAR2", length = 200)
	public String getCoQuanXn() {
		return this.coQuanXn;
	}

	public void setCoQuanXn(String coQuanXn) {
		this.coQuanXn = coQuanXn;
	}

	@Caption("TienPhatDuocGiamBangSo")
	@Column(name = "TIEN_PHAT_DUOC_GIAM_BANG_SO", columnDefinition = "VARCHAR2", length = 20)
	public String getTienPhatDuocGiamBangSo() {
		return this.tienPhatDuocGiamBangSo;
	}

	public void setTienPhatDuocGiamBangSo(String tienPhatDuocGiamBangSo) {
		this.tienPhatDuocGiamBangSo = tienPhatDuocGiamBangSo;
	}

	@Caption("TienPhatDuocGiamBangChu")
	@Column(name = "TIEN_PHAT_DUOC_GIAM_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getTienPhatDuocGiamBangChu() {
		return this.tienPhatDuocGiamBangChu;
	}

	public void setTienPhatDuocGiamBangChu(String tienPhatDuocGiamBangChu) {
		this.tienPhatDuocGiamBangChu = tienPhatDuocGiamBangChu;
	}

	@Caption("TienPhatSauGiamBangSo")
	@Column(name = "TIEN_PHAT_SAU_GIAM_BANG_SO", columnDefinition = "VARCHAR2", length = 20)
	public String getTienPhatSauGiamBangSo() {
		return this.tienPhatSauGiamBangSo;
	}

	public void setTienPhatSauGiamBangSo(String tienPhatSauGiamBangSo) {
		this.tienPhatSauGiamBangSo = tienPhatSauGiamBangSo;
	}

	@Caption("TienPhatSauGiamBangChu")
	@Column(name = "TIEN_PHAT_SAU_GIAM_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getTienPhatSauGiamBangChu() {
		return this.tienPhatSauGiamBangChu;
	}

	public void setTienPhatSauGiamBangChu(String tienPhatSauGiamBangChu) {
		this.tienPhatSauGiamBangChu = tienPhatSauGiamBangChu;
	}

	@Caption("LyDoGiam")
	@Column(name = "LY_DO_GIAM", columnDefinition = "VARCHAR2", length = 200)
	public String getLyDoGiam() {
		return this.lyDoGiam;
	}

	public void setLyDoGiam(String lyDoGiam) {
		this.lyDoGiam = lyDoGiam;
	}

	@Caption("TangVatNhanLai")
	@Column(name = "TANG_VAT_NHAN_LAI", columnDefinition = "VARCHAR2", length = 200)
	public String getTangVatNhanLai() {
		return this.tangVatNhanLai;
	}

	public void setTangVatNhanLai(String tangVatNhanLai) {
		this.tangVatNhanLai = tangVatNhanLai;
	}

	@Caption("PhoiHopThucHienQd")
	@Column(name = "PHOI_HOP_THUC_HIEN_QD", columnDefinition = "VARCHAR2", length = 150)
	public String getPhoiHopThucHienQd() {
		return this.phoiHopThucHienQd;
	}

	public void setPhoiHopThucHienQd(String phoiHopThucHienQd) {
		this.phoiHopThucHienQd = phoiHopThucHienQd;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
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

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
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

	@Caption("DdhcId")
	@Column(name = "DDHC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDdhcId() {
		return this.ddhcId;
	}

	public void setDdhcId(Long ddhcId) {
		this.ddhcId = ddhcId;
	}

	@Caption("TrangThaiQd")
	@Column(name = "TRANG_THAI_QD", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiQd() {
		return this.trangThaiQd;
	}

	public void setTrangThaiQd(Long trangThaiQd) {
		this.trangThaiQd = trangThaiQd;
	}

	@Caption("DiaDanhHc")
	@Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 50)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Caption("MaThongTu")
	@Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)
	public String getMaThongTu() {
		return this.maThongTu;
	}

	public void setMaThongTu(String maThongTu) {
		this.maThongTu = maThongTu;
	}

	@Caption("MaVuViec")
	@Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)
	public String getMaVuViec() {
		return this.maVuViec;
	}

	public void setMaVuViec(String maVuViec) {
		this.maVuViec = maVuViec;
	}

	@Caption("NamLapQd")
	@Column(name = "NAM_LAP_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamLapQd() {
		return this.namLapQd;
	}

	public void setNamLapQd(Long namLapQd) {
		this.namLapQd = namLapQd;
	}

	@Caption("DonViCsgtId")
	@Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCsgtId() {
		return this.donViCsgtId;
	}

	public void setDonViCsgtId(Long donViCsgtId) {
		this.donViCsgtId = donViCsgtId;
	}

}
