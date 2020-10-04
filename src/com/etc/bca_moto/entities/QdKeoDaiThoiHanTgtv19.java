package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdKeoDaiThoiHanTgtv19DAO;
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
 * QdKeoDaiThoiHanTgtv19
 */
@DAO(daoClass = QdKeoDaiThoiHanTgtv19DAO.class)
@Caption("{%coQuanChuQuan}")
@Entity
@Table(name = "QD_KEO_DAI_THOI_HAN_TGTV_19", schema = "BCA_MOTO")
public class QdKeoDaiThoiHanTgtv19 implements java.io.Serializable {

	private long id;
	private String coQuanChuQuan;
	private String soQuyetDinh;
	private Long qd34Id;
	private Long qd18Id;
	private Long bb50Id;
	private Long diaDanhHcId;
	private Date ngayTaoQuyetDinh;
	private String canCuQdtgSo;
	private Date canCuQdtgNgay;
	private String canCuQdtgKy;
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
	private String diaChiNvp;
	private String tangVatTg;
	private String lyDoKeoDaiTh;
	private String keoDaiTheoGio;
	private String keoDaiTheoPhut;
	private Date tuNgay;
	private Date denNgay;
	private String toChucChapHanh;
	private String toChucThucHien;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private String keTuHoiGio;
	private String keTuHoiPhut;
	private String denHoiGio;
	private String denHoiPhut;
	private String diaDanhHanhchinh;

	public QdKeoDaiThoiHanTgtv19() {
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

	@Caption("Qd34Id")
	@Column(name = "QD34_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd34Id() {
		return this.qd34Id;
	}

	public void setQd34Id(Long qd34Id) {
		this.qd34Id = qd34Id;
	}

	@Caption("Qd18Id")
	@Column(name = "QD18_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd18Id() {
		return this.qd18Id;
	}

	public void setQd18Id(Long qd18Id) {
		this.qd18Id = qd18Id;
	}

	@Caption("Bb50Id")
	@Column(name = "BB50_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBb50Id() {
		return this.bb50Id;
	}

	public void setBb50Id(Long bb50Id) {
		this.bb50Id = bb50Id;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
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

	@Caption("CanCuQdtgSo")
	@Column(name = "CAN_CU_QDTG_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuQdtgSo() {
		return this.canCuQdtgSo;
	}

	public void setCanCuQdtgSo(String canCuQdtgSo) {
		this.canCuQdtgSo = canCuQdtgSo;
	}

	@Caption("CanCuQdtgNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QDTG_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdtgNgay() {
		return this.canCuQdtgNgay;
	}

	public void setCanCuQdtgNgay(Date canCuQdtgNgay) {
		this.canCuQdtgNgay = canCuQdtgNgay;
	}

	@Caption("CanCuQdtgKy")
	@Column(name = "CAN_CU_QDTG_KY", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQdtgKy() {
		return this.canCuQdtgKy;
	}

	public void setCanCuQdtgKy(String canCuQdtgKy) {
		this.canCuQdtgKy = canCuQdtgKy;
	}

	@Caption("CanCuQdgqSo")
	@Column(name = "CAN_CU_QDGQ_SO", columnDefinition = "VARCHAR2", length = 100)
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

	@Caption("TangVatTg")
	@Column(name = "TANG_VAT_TG", columnDefinition = "VARCHAR2", length = 200)
	public String getTangVatTg() {
		return this.tangVatTg;
	}

	public void setTangVatTg(String tangVatTg) {
		this.tangVatTg = tangVatTg;
	}

	@Caption("LyDoKeoDaiTh")
	@Column(name = "LY_DO_KEO_DAI_TH", columnDefinition = "VARCHAR2", length = 150)
	public String getLyDoKeoDaiTh() {
		return this.lyDoKeoDaiTh;
	}

	public void setLyDoKeoDaiTh(String lyDoKeoDaiTh) {
		this.lyDoKeoDaiTh = lyDoKeoDaiTh;
	}

	@Caption("KeoDaiTheoGio")
	@Column(name = "KEO_DAI_THEO_GIO", columnDefinition = "VARCHAR2", length = 10)
	public String getKeoDaiTheoGio() {
		return this.keoDaiTheoGio;
	}

	public void setKeoDaiTheoGio(String keoDaiTheoGio) {
		this.keoDaiTheoGio = keoDaiTheoGio;
	}

	@Caption("KeoDaiTheoPhut")
	@Column(name = "KEO_DAI_THEO_PHUT", columnDefinition = "VARCHAR2", length = 10)
	public String getKeoDaiTheoPhut() {
		return this.keoDaiTheoPhut;
	}

	public void setKeoDaiTheoPhut(String keoDaiTheoPhut) {
		this.keoDaiTheoPhut = keoDaiTheoPhut;
	}

	@Caption("TuNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "TU_NGAY", columnDefinition = "DATE", length = 7)
	public Date getTuNgay() {
		return this.tuNgay;
	}

	public void setTuNgay(Date tuNgay) {
		this.tuNgay = tuNgay;
	}

	@Caption("DenNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "DEN_NGAY", columnDefinition = "DATE", length = 7)
	public Date getDenNgay() {
		return this.denNgay;
	}

	public void setDenNgay(Date denNgay) {
		this.denNgay = denNgay;
	}

	@Caption("ToChucChapHanh")
	@Column(name = "TO_CHUC_CHAP_HANH", columnDefinition = "VARCHAR2", length = 150)
	public String getToChucChapHanh() {
		return this.toChucChapHanh;
	}

	public void setToChucChapHanh(String toChucChapHanh) {
		this.toChucChapHanh = toChucChapHanh;
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

	@Caption("KeTuHoiGio")
	@Column(name = "KE_TU_HOI_GIO", columnDefinition = "VARCHAR2", length = 10)
	public String getKeTuHoiGio() {
		return this.keTuHoiGio;
	}

	public void setKeTuHoiGio(String keTuHoiGio) {
		this.keTuHoiGio = keTuHoiGio;
	}

	@Caption("KeTuHoiPhut")
	@Column(name = "KE_TU_HOI_PHUT", columnDefinition = "VARCHAR2", length = 10)
	public String getKeTuHoiPhut() {
		return this.keTuHoiPhut;
	}

	public void setKeTuHoiPhut(String keTuHoiPhut) {
		this.keTuHoiPhut = keTuHoiPhut;
	}

	@Caption("DenHoiGio")
	@Column(name = "DEN_HOI_GIO", columnDefinition = "VARCHAR2", length = 10)
	public String getDenHoiGio() {
		return this.denHoiGio;
	}

	public void setDenHoiGio(String denHoiGio) {
		this.denHoiGio = denHoiGio;
	}

	@Caption("DenHoiPhut")
	@Column(name = "DEN_HOI_PHUT", columnDefinition = "VARCHAR2", length = 10)
	public String getDenHoiPhut() {
		return this.denHoiPhut;
	}

	public void setDenHoiPhut(String denHoiPhut) {
		this.denHoiPhut = denHoiPhut;
	}

	@Caption("DiaDanhHanhchinh")
	@Column(name = "DIA_DANH_HANHCHINH", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDanhHanhchinh() {
		return this.diaDanhHanhchinh;
	}

	public void setDiaDanhHanhchinh(String diaDanhHanhchinh) {
		this.diaDanhHanhchinh = diaDanhHanhchinh;
	}

}
