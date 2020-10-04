package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdApDungBpKphq12DAO;
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
 * QdApDungBpKphq12
 */
@DAO(daoClass = QdApDungBpKphq12DAO.class)
@Caption("{%coQuanChuQuan}")
@Entity
@Table(name = "QD_AP_DUNG_BP_KPHQ_12", schema = "BCA_MOTO")
public class QdApDungBpKphq12 implements java.io.Serializable {

	private long id;
	private String coQuanChuQuan;
	private String soQuyetDinh;
	private Long qd43Id;
	private Long qd30Id;
	private Date ngayTaoQuyetDinh;
	private String canCuBbvphcSo;
	private Date canCuBbvphcNgay;
	private String canCuQdgqSo;
	private Date canCuQdgqNgay;
	private Long canBoRaQdId;
	private String capBacChucVu;
	private String donVi;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String tinhTietLienQuan;
	private String hauQuaCanKhacPhuc;
	private String lyDoKhongRaQd;
	private String bienPhapKhacPhuc;
	private String kinhPhiBangSo;
	private String kinhPhiBangChu;
	private String coQuanThucHien;
	private Date ngayHieuLuc;
	private String toChucChapHanh;
	private Short thoiHanThucHien;
	private String phoiHopThucHien;
	private String toChucThucHien;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;

	public QdApDungBpKphq12() {
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

	@Caption("Qd43Id")
	@Column(name = "QD43_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd43Id() {
		return this.qd43Id;
	}

	public void setQd43Id(Long qd43Id) {
		this.qd43Id = qd43Id;
	}

	@Caption("Qd30Id")
	@Column(name = "QD30_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd30Id() {
		return this.qd30Id;
	}

	public void setQd30Id(Long qd30Id) {
		this.qd30Id = qd30Id;
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

	@Caption("CanCuBbvphcSo")
	@Column(name = "CAN_CU_BBVPHC_SO", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuBbvphcSo() {
		return this.canCuBbvphcSo;
	}

	public void setCanCuBbvphcSo(String canCuBbvphcSo) {
		this.canCuBbvphcSo = canCuBbvphcSo;
	}

	@Caption("CanCuBbvphcNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_BBVPHC_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuBbvphcNgay() {
		return this.canCuBbvphcNgay;
	}

	public void setCanCuBbvphcNgay(Date canCuBbvphcNgay) {
		this.canCuBbvphcNgay = canCuBbvphcNgay;
	}

	@Caption("CanCuQdgqSo")
	@Column(name = "CAN_CU_QDGQ_SO", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQdgqSo() {
		return this.canCuQdgqSo;
	}

	public void setCanCuQdgqSo(String canCuQdgqSo) {
		this.canCuQdgqSo = canCuQdgqSo;
	}

	@Caption("CanCuQdgqNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QDGQ_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdgqNgay() {
		return this.canCuQdgqNgay;
	}

	public void setCanCuQdgqNgay(Date canCuQdgqNgay) {
		this.canCuQdgqNgay = canCuQdgqNgay;
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

	@Caption("TinhTietLienQuan")
	@Column(name = "TINH_TIET_LIEN_QUAN", columnDefinition = "VARCHAR2", length = 150)
	public String getTinhTietLienQuan() {
		return this.tinhTietLienQuan;
	}

	public void setTinhTietLienQuan(String tinhTietLienQuan) {
		this.tinhTietLienQuan = tinhTietLienQuan;
	}

	@Caption("HauQuaCanKhacPhuc")
	@Column(name = "HAU_QUA_CAN_KHAC_PHUC", columnDefinition = "VARCHAR2", length = 150)
	public String getHauQuaCanKhacPhuc() {
		return this.hauQuaCanKhacPhuc;
	}

	public void setHauQuaCanKhacPhuc(String hauQuaCanKhacPhuc) {
		this.hauQuaCanKhacPhuc = hauQuaCanKhacPhuc;
	}

	@Caption("LyDoKhongRaQd")
	@Column(name = "LY_DO_KHONG_RA_QD", columnDefinition = "VARCHAR2", length = 180)
	public String getLyDoKhongRaQd() {
		return this.lyDoKhongRaQd;
	}

	public void setLyDoKhongRaQd(String lyDoKhongRaQd) {
		this.lyDoKhongRaQd = lyDoKhongRaQd;
	}

	@Caption("BienPhapKhacPhuc")
	@Column(name = "BIEN_PHAP_KHAC_PHUC", columnDefinition = "VARCHAR2", length = 350)
	public String getBienPhapKhacPhuc() {
		return this.bienPhapKhacPhuc;
	}

	public void setBienPhapKhacPhuc(String bienPhapKhacPhuc) {
		this.bienPhapKhacPhuc = bienPhapKhacPhuc;
	}

	@Caption("KinhPhiBangSo")
	@Column(name = "KINH_PHI_BANG_SO", columnDefinition = "VARCHAR2", length = 20)
	public String getKinhPhiBangSo() {
		return this.kinhPhiBangSo;
	}

	public void setKinhPhiBangSo(String kinhPhiBangSo) {
		this.kinhPhiBangSo = kinhPhiBangSo;
	}

	@Caption("KinhPhiBangChu")
	@Column(name = "KINH_PHI_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getKinhPhiBangChu() {
		return this.kinhPhiBangChu;
	}

	public void setKinhPhiBangChu(String kinhPhiBangChu) {
		this.kinhPhiBangChu = kinhPhiBangChu;
	}

	@Caption("CoQuanThucHien")
	@Column(name = "CO_QUAN_THUC_HIEN", columnDefinition = "VARCHAR2", length = 200)
	public String getCoQuanThucHien() {
		return this.coQuanThucHien;
	}

	public void setCoQuanThucHien(String coQuanThucHien) {
		this.coQuanThucHien = coQuanThucHien;
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

	@Caption("ToChucChapHanh")
	@Column(name = "TO_CHUC_CHAP_HANH", columnDefinition = "VARCHAR2", length = 100)
	public String getToChucChapHanh() {
		return this.toChucChapHanh;
	}

	public void setToChucChapHanh(String toChucChapHanh) {
		this.toChucChapHanh = toChucChapHanh;
	}

	@Caption("ThoiHanThucHien")
	@Column(name = "THOI_HAN_THUC_HIEN", columnDefinition = "NUMBER", precision = 3, scale = 0)
	public Short getThoiHanThucHien() {
		return this.thoiHanThucHien;
	}

	public void setThoiHanThucHien(Short thoiHanThucHien) {
		this.thoiHanThucHien = thoiHanThucHien;
	}

	@Caption("PhoiHopThucHien")
	@Column(name = "PHOI_HOP_THUC_HIEN", columnDefinition = "VARCHAR2", length = 150)
	public String getPhoiHopThucHien() {
		return this.phoiHopThucHien;
	}

	public void setPhoiHopThucHien(String phoiHopThucHien) {
		this.phoiHopThucHien = phoiHopThucHien;
	}

	@Caption("ToChucThucHien")
	@Column(name = "TO_CHUC_THUC_HIEN", columnDefinition = "VARCHAR2", length = 150)
	public String getToChucThucHien() {
		return this.toChucThucHien;
	}

	public void setToChucThucHien(String toChucThucHien) {
		this.toChucThucHien = toChucThucHien;
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

}
