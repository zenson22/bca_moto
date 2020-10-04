package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdChamDutGq31DAO;
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
 * QdChamDutGq31
 */
@DAO(daoClass = QdChamDutGq31DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_CHAM_DUT_GQ_31", schema = "BCA_MOTO")
public class QdChamDutGq31 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private Long diaDanhHcId;
	private Date ngayLapQd;
	private String canCuQd;
	private String coCauToChuc;
	private Long canBoRaQdId;
	private String capBacChucVu;
	private String donViCsgt;
	private String tenNguoiGq;
	private Long chucVuNgqId;
	private Long donViNgqId;
	private String thamQuyenCua;
	private Date ngayThiHanh;
	private String chiuTrachNhiem;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapQd;
	private Long trangThaiQd;
	private String chucVuNgq;
	private String donViNgq;
	private Long qd30id;

	public QdChamDutGq31() {
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

	@Caption("CanCuQd")
	@Column(name = "CAN_CU_QD", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQd() {
		return this.canCuQd;
	}

	public void setCanCuQd(String canCuQd) {
		this.canCuQd = canCuQd;
	}

	@Caption("CoCauToChuc")
	@Column(name = "CO_CAU_TO_CHUC", columnDefinition = "VARCHAR2", length = 200)
	public String getCoCauToChuc() {
		return this.coCauToChuc;
	}

	public void setCoCauToChuc(String coCauToChuc) {
		this.coCauToChuc = coCauToChuc;
	}

	@Caption("CanBoRaQdId")
	@Column(name = "CAN_BO_RA_QD_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCanBoRaQdId() {
		return this.canBoRaQdId;
	}

	public void setCanBoRaQdId(Long canBoRaQdId) {
		this.canBoRaQdId = canBoRaQdId;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 50)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Caption("DonViCsgt")
	@Column(name = "DON_VI_CSGT", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViCsgt() {
		return this.donViCsgt;
	}

	public void setDonViCsgt(String donViCsgt) {
		this.donViCsgt = donViCsgt;
	}

	@Caption("TenNguoiGq")
	@Column(name = "TEN_NGUOI_GQ", columnDefinition = "VARCHAR2", length = 50)
	public String getTenNguoiGq() {
		return this.tenNguoiGq;
	}

	public void setTenNguoiGq(String tenNguoiGq) {
		this.tenNguoiGq = tenNguoiGq;
	}

	@Caption("ChucVuNgqId")
	@Column(name = "CHUC_VU_NGQ_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getChucVuNgqId() {
		return this.chucVuNgqId;
	}

	public void setChucVuNgqId(Long chucVuNgqId) {
		this.chucVuNgqId = chucVuNgqId;
	}

	@Caption("DonViNgqId")
	@Column(name = "DON_VI_NGQ_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViNgqId() {
		return this.donViNgqId;
	}

	public void setDonViNgqId(Long donViNgqId) {
		this.donViNgqId = donViNgqId;
	}

	@Caption("ThamQuyenCua")
	@Column(name = "THAM_QUYEN_CUA", columnDefinition = "VARCHAR2", length = 100)
	public String getThamQuyenCua() {
		return this.thamQuyenCua;
	}

	public void setThamQuyenCua(String thamQuyenCua) {
		this.thamQuyenCua = thamQuyenCua;
	}

	@Caption("NgayThiHanh")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_THI_HANH", columnDefinition = "DATE", length = 7)
	public Date getNgayThiHanh() {
		return this.ngayThiHanh;
	}

	public void setNgayThiHanh(Date ngayThiHanh) {
		this.ngayThiHanh = ngayThiHanh;
	}

	@Caption("ChiuTrachNhiem")
	@Column(name = "CHIU_TRACH_NHIEM", columnDefinition = "VARCHAR2", length = 150)
	public String getChiuTrachNhiem() {
		return this.chiuTrachNhiem;
	}

	public void setChiuTrachNhiem(String chiuTrachNhiem) {
		this.chiuTrachNhiem = chiuTrachNhiem;
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

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
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

	@Caption("NhapQd")
	@Column(name = "NHAP_QD", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapQd() {
		return this.nhapQd;
	}

	public void setNhapQd(Long nhapQd) {
		this.nhapQd = nhapQd;
	}

	@Caption("TrangThaiQd")
	@Column(name = "TRANG_THAI_QD", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiQd() {
		return this.trangThaiQd;
	}

	public void setTrangThaiQd(Long trangThaiQd) {
		this.trangThaiQd = trangThaiQd;
	}

	@Caption("ChucVuNgq")
	@Column(name = "CHUC_VU_NGQ", columnDefinition = "VARCHAR2", length = 150)
	public String getChucVuNgq() {
		return this.chucVuNgq;
	}

	public void setChucVuNgq(String chucVuNgq) {
		this.chucVuNgq = chucVuNgq;
	}

	@Caption("DonViNgq")
	@Column(name = "DON_VI_NGQ", columnDefinition = "VARCHAR2", length = 150)
	public String getDonViNgq() {
		return this.donViNgq;
	}

	public void setDonViNgq(String donViNgq) {
		this.donViNgq = donViNgq;
	}

	@Caption("Qd30id")
	@Column(name = "QD30ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd30id() {
		return this.qd30id;
	}

	public void setQd30id(Long qd30id) {
		this.qd30id = qd30id;
	}

}
