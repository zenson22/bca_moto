package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdGiaoQuyenCuongCheQdxphcDAO;
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
 * QdGiaoQuyenCuongCheQdxphc
 */
@DAO(daoClass = QdGiaoQuyenCuongCheQdxphcDAO.class)
@Caption("{%coQuanChuQuan}")
@Entity
@Table(name = "QD_GIAO_QUYEN_CUONG_CHE_QDXPHC", schema = "BCA_MOTO")
public class QdGiaoQuyenCuongCheQdxphc implements java.io.Serializable {

	private long id;
	private String coQuanChuQuan;
	private String donVi;
	private String soQuyetDinh;
	private Date ngayTaoQuyetDinh;
	private String canCuVanBan;
	private Long canBoRaQd;
	private String capBacChucVu;
	private String canBoDuocGiaoQuyen;
	private Long chucVuId;
	private Long donViCbNhan;
	private String lyDoGiaoQuyen;
	private String thoiHanGiaoQuyen;
	private Date ngayHieuLuc;
	private String doiTuongThiHanh;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;

	public QdGiaoQuyenCuongCheQdxphc() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
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

	@Caption("DonVi")
	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 200)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
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

	@Caption("CanCuVanBan")
	@Column(name = "CAN_CU_VAN_BAN", columnDefinition = "VARCHAR2", length = 500)
	public String getCanCuVanBan() {
		return this.canCuVanBan;
	}

	public void setCanCuVanBan(String canCuVanBan) {
		this.canCuVanBan = canCuVanBan;
	}

	@Caption("CanBoRaQd")
	@Column(name = "CAN_BO_RA_QD", columnDefinition = "NUMBER", precision = 38, scale = 0)
	public Long getCanBoRaQd() {
		return this.canBoRaQd;
	}

	public void setCanBoRaQd(Long canBoRaQd) {
		this.canBoRaQd = canBoRaQd;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 200)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Caption("CanBoDuocGiaoQuyen")
	@Column(name = "CAN_BO_DUOC_GIAO_QUYEN", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoDuocGiaoQuyen() {
		return this.canBoDuocGiaoQuyen;
	}

	public void setCanBoDuocGiaoQuyen(String canBoDuocGiaoQuyen) {
		this.canBoDuocGiaoQuyen = canBoDuocGiaoQuyen;
	}

	@Caption("ChucVuId")
	@Column(name = "CHUC_VU_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getChucVuId() {
		return this.chucVuId;
	}

	public void setChucVuId(Long chucVuId) {
		this.chucVuId = chucVuId;
	}

	@Caption("DonViCbNhan")
	@Column(name = "DON_VI_CB_NHAN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCbNhan() {
		return this.donViCbNhan;
	}

	public void setDonViCbNhan(Long donViCbNhan) {
		this.donViCbNhan = donViCbNhan;
	}

	@Caption("LyDoGiaoQuyen")
	@Column(name = "LY_DO_GIAO_QUYEN", columnDefinition = "VARCHAR2", length = 500)
	public String getLyDoGiaoQuyen() {
		return this.lyDoGiaoQuyen;
	}

	public void setLyDoGiaoQuyen(String lyDoGiaoQuyen) {
		this.lyDoGiaoQuyen = lyDoGiaoQuyen;
	}

	@Caption("ThoiHanGiaoQuyen")
	@Column(name = "THOI_HAN_GIAO_QUYEN", columnDefinition = "VARCHAR2", length = 200)
	public String getThoiHanGiaoQuyen() {
		return this.thoiHanGiaoQuyen;
	}

	public void setThoiHanGiaoQuyen(String thoiHanGiaoQuyen) {
		this.thoiHanGiaoQuyen = thoiHanGiaoQuyen;
	}

	@Caption("NgayHieuLuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HIEU_LUC", columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Caption("DoiTuongThiHanh")
	@Column(name = "DOI_TUONG_THI_HANH", columnDefinition = "VARCHAR2", length = 200)
	public String getDoiTuongThiHanh() {
		return this.doiTuongThiHanh;
	}

	public void setDoiTuongThiHanh(String doiTuongThiHanh) {
		this.doiTuongThiHanh = doiTuongThiHanh;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 38, scale = 0)
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
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 38, scale = 0)
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

}
