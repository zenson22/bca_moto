package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdTamGiu18DAO;
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
 * QdTamGiu18
 */
@DAO(daoClass = QdTamGiu18DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_TAM_GIU18", schema = "BCA_MOTO")
public class QdTamGiu18 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private String tenCqCapTren;
	private String tenDonVi;
	private String soBienBanTc;
	private String diaDanhHc;
	private Date ngayLapQd;
	private String canCuXlvphc;
	private String canCuNghiDinh;
	private String canCuBienBan;
	private String canBoRaQd;
	private long canBoRaQdId;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String lyDoTamGiu;
	private String diaDiemTamGiu;
	private Date thoiHanTu;
	private Date thoiHanDen;
	private String ghiChu;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private Long capTrenPheDuyet;
	private Long capDuoiKyNhay;
	private String canBoNhanXuLy;
	private Long cbxlId;
	private String capBacChucVu;
	private Date ngayLapBb;
	private String diaChiNvp;
	private Long idNam;
	private Long tinhThanhPhoId;
	private String thoiHanTg;
	private Long canBoTraLai;
	private Date ngayTraLai;
	private Date ngayBatDauXl;
	private Long soBb43Tc;
	private Long namLapQd;
	private Long nhapQd;
	private Long trangThaiQd;
	private String ngaySinhNvpNhap;
	private String maVuViec;
	private String maThongTu;
	private Long diaDiemTamGiuId;
	private String tangVatTamGiu1;
	private String tangVatTamGiu2;
	private String canCuGqSo;
	private Date canCuGqNgay;
	private Long linhVucGiaoThong;
	private String tangVatTamGiu3;
	private String tangVatTamGiu4;
	private Long donViNhapBb;

	public QdTamGiu18() {
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

	@Caption("TenCqCapTren")
	@Column(name = "TEN_CQ_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 150)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("SoBienBanTc")
	@Column(name = "SO_BIEN_BAN_TC", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBanTc() {
		return this.soBienBanTc;
	}

	public void setSoBienBanTc(String soBienBanTc) {
		this.soBienBanTc = soBienBanTc;
	}

	@Caption("DiaDanhHc")
	@Column(name = "DIA_DANH_HC", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Caption("NgayLapQd")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_QD", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayLapQd() {
		return this.ngayLapQd;
	}

	public void setNgayLapQd(Date ngayLapQd) {
		this.ngayLapQd = ngayLapQd;
	}

	@Caption("CanCuXlvphc")
	@Column(name = "CAN_CU_XLVPHC", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuXlvphc() {
		return this.canCuXlvphc;
	}

	public void setCanCuXlvphc(String canCuXlvphc) {
		this.canCuXlvphc = canCuXlvphc;
	}

	@Caption("CanCuNghiDinh")
	@Column(name = "CAN_CU_NGHI_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 500)
	public String getCanCuNghiDinh() {
		return this.canCuNghiDinh;
	}

	public void setCanCuNghiDinh(String canCuNghiDinh) {
		this.canCuNghiDinh = canCuNghiDinh;
	}

	@Caption("CanCuBienBan")
	@Column(name = "CAN_CU_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuBienBan() {
		return this.canCuBienBan;
	}

	public void setCanCuBienBan(String canCuBienBan) {
		this.canCuBienBan = canCuBienBan;
	}

	@Caption("CanBoRaQd")
	@Column(name = "CAN_BO_RA_QD", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getCanBoRaQd() {
		return this.canBoRaQd;
	}

	public void setCanBoRaQd(String canBoRaQd) {
		this.canBoRaQd = canBoRaQd;
	}

	@Caption("CanBoRaQdId")
	@Column(name = "CAN_BO_RA_QD_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanBoRaQdId() {
		return this.canBoRaQdId;
	}

	public void setCanBoRaQdId(long canBoRaQdId) {
		this.canBoRaQdId = canBoRaQdId;
	}

	@Caption("TenNguoiNvp")
	@Column(name = "TEN_NGUOI_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 300)
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
	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 50)
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

	@Caption("LyDoTamGiu")
	@Column(name = "LY_DO_TAM_GIU", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getLyDoTamGiu() {
		return this.lyDoTamGiu;
	}

	public void setLyDoTamGiu(String lyDoTamGiu) {
		this.lyDoTamGiu = lyDoTamGiu;
	}

	@Caption("DiaDiemTamGiu")
	@Column(name = "DIA_DIEM_TAM_GIU", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getDiaDiemTamGiu() {
		return this.diaDiemTamGiu;
	}

	public void setDiaDiemTamGiu(String diaDiemTamGiu) {
		this.diaDiemTamGiu = diaDiemTamGiu;
	}

	@Caption("ThoiHanTu")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_HAN_TU", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getThoiHanTu() {
		return this.thoiHanTu;
	}

	public void setThoiHanTu(Date thoiHanTu) {
		this.thoiHanTu = thoiHanTu;
	}

	@Caption("ThoiHanDen")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_HAN_DEN", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getThoiHanDen() {
		return this.thoiHanDen;
	}

	public void setThoiHanDen(Date thoiHanDen) {
		this.thoiHanDen = thoiHanDen;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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

	@Caption("CapTrenPheDuyet")
	@Column(name = "CAP_TREN_PHE_DUYET", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapTrenPheDuyet() {
		return this.capTrenPheDuyet;
	}

	public void setCapTrenPheDuyet(Long capTrenPheDuyet) {
		this.capTrenPheDuyet = capTrenPheDuyet;
	}

	@Caption("CapDuoiKyNhay")
	@Column(name = "CAP_DUOI_KY_NHAY", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapDuoiKyNhay() {
		return this.capDuoiKyNhay;
	}

	public void setCapDuoiKyNhay(Long capDuoiKyNhay) {
		this.capDuoiKyNhay = capDuoiKyNhay;
	}

	@Caption("CanBoNhanXuLy")
	@Column(name = "CAN_BO_NHAN_XU_LY", columnDefinition = "VARCHAR2", length = 70)
	public String getCanBoNhanXuLy() {
		return this.canBoNhanXuLy;
	}

	public void setCanBoNhanXuLy(String canBoNhanXuLy) {
		this.canBoNhanXuLy = canBoNhanXuLy;
	}

	@Caption("CbxlId")
	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
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

	@Caption("DiaChiNvp")
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
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

	@Caption("ThoiHanTg")
	@Column(name = "THOI_HAN_TG", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanTg() {
		return this.thoiHanTg;
	}

	public void setThoiHanTg(String thoiHanTg) {
		this.thoiHanTg = thoiHanTg;
	}

	@Caption("CanBoTraLai")
	@Column(name = "CAN_BO_TRA_LAI", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoTraLai() {
		return this.canBoTraLai;
	}

	public void setCanBoTraLai(Long canBoTraLai) {
		this.canBoTraLai = canBoTraLai;
	}

	@Caption("NgayTraLai")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TRA_LAI", columnDefinition = "DATE", length = 7)
	public Date getNgayTraLai() {
		return this.ngayTraLai;
	}

	public void setNgayTraLai(Date ngayTraLai) {
		this.ngayTraLai = ngayTraLai;
	}

	@Caption("NgayBatDauXl")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_BAT_DAU_XL", columnDefinition = "DATE", length = 7)
	public Date getNgayBatDauXl() {
		return this.ngayBatDauXl;
	}

	public void setNgayBatDauXl(Date ngayBatDauXl) {
		this.ngayBatDauXl = ngayBatDauXl;
	}

	@Caption("SoBb43Tc")
	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Caption("NamLapQd")
	@Column(name = "NAM_LAP_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamLapQd() {
		return this.namLapQd;
	}

	public void setNamLapQd(Long namLapQd) {
		this.namLapQd = namLapQd;
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

	@Caption("NgaySinhNvpNhap")
	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Caption("MaVuViec")
	@Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)
	public String getMaVuViec() {
		return this.maVuViec;
	}

	public void setMaVuViec(String maVuViec) {
		this.maVuViec = maVuViec;
	}

	@Caption("MaThongTu")
	@Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)
	public String getMaThongTu() {
		return this.maThongTu;
	}

	public void setMaThongTu(String maThongTu) {
		this.maThongTu = maThongTu;
	}

	@Caption("DiaDiemTamGiuId")
	@Column(name = "DIA_DIEM_TAM_GIU_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDiemTamGiuId() {
		return this.diaDiemTamGiuId;
	}

	public void setDiaDiemTamGiuId(Long diaDiemTamGiuId) {
		this.diaDiemTamGiuId = diaDiemTamGiuId;
	}

	@Caption("TangVatTamGiu1")
	@Column(name = "TANG_VAT_TAM_GIU1", columnDefinition = "VARCHAR2", length = 500)
	public String getTangVatTamGiu1() {
		return this.tangVatTamGiu1;
	}

	public void setTangVatTamGiu1(String tangVatTamGiu1) {
		this.tangVatTamGiu1 = tangVatTamGiu1;
	}

	@Caption("TangVatTamGiu2")
	@Column(name = "TANG_VAT_TAM_GIU2", columnDefinition = "VARCHAR2", length = 500)
	public String getTangVatTamGiu2() {
		return this.tangVatTamGiu2;
	}

	public void setTangVatTamGiu2(String tangVatTamGiu2) {
		this.tangVatTamGiu2 = tangVatTamGiu2;
	}

	@Caption("CanCuGqSo")
	@Column(name = "CAN_CU_GQ_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuGqSo() {
		return this.canCuGqSo;
	}

	public void setCanCuGqSo(String canCuGqSo) {
		this.canCuGqSo = canCuGqSo;
	}

	@Caption("CanCuGqNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_GQ_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuGqNgay() {
		return this.canCuGqNgay;
	}

	public void setCanCuGqNgay(Date canCuGqNgay) {
		this.canCuGqNgay = canCuGqNgay;
	}

	@Caption("LinhVucGiaoThong")
	@Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLinhVucGiaoThong() {
		return this.linhVucGiaoThong;
	}

	public void setLinhVucGiaoThong(Long linhVucGiaoThong) {
		this.linhVucGiaoThong = linhVucGiaoThong;
	}

	@Caption("TangVatTamGiu3")
	@Column(name = "TANG_VAT_TAM_GIU3", columnDefinition = "VARCHAR2", length = 2000)
	public String getTangVatTamGiu3() {
		return this.tangVatTamGiu3;
	}

	public void setTangVatTamGiu3(String tangVatTamGiu3) {
		this.tangVatTamGiu3 = tangVatTamGiu3;
	}

	@Caption("TangVatTamGiu4")
	@Column(name = "TANG_VAT_TAM_GIU4", columnDefinition = "VARCHAR2", length = 2000)
	public String getTangVatTamGiu4() {
		return this.tangVatTamGiu4;
	}

	public void setTangVatTamGiu4(String tangVatTamGiu4) {
		this.tangVatTamGiu4 = tangVatTamGiu4;
	}

	@Caption("DonViNhapBb")
	@Column(name = "DON_VI_NHAP_BB", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViNhapBb() {
		return this.donViNhapBb;
	}

	public void setDonViNhapBb(Long donViNhapBb) {
		this.donViNhapBb = donViNhapBb;
	}

}
