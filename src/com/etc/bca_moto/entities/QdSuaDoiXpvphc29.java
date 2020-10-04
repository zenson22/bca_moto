package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QdSuaDoiXpvphc29DAO;
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
 * QdSuaDoiXpvphc29
 */
@DAO(daoClass = QdSuaDoiXpvphc29DAO.class)
@Caption("{%soQuyetDinh}")
@Entity
@Table(name = "QD_SUA_DOI_XPVPHC_29", schema = "BCA_MOTO")
public class QdSuaDoiXpvphc29 implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private Long qdVphc02Id;
	private Long diaDanhHcId;
	private Date ngayLapQd;
	private String canCuQdGiaoquyenSo;
	private String canCuNghiDinh;
	private Long canBoRaQdId;
	private String capBacChucVu;
	private String qdXuphatVphcSo;
	private Date qdXuphatVphcNgay;
	private String nguoiKy;
	private String tenNguoiNvp;
	private String ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String diaChiNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String lyDoSuaDoi;
	private String noiDungSuaDoi;
	private String hinhThucXuPhat;
	private Long tongTienBangSo;
	private String tongTienBangChu;
	private String hinhThucXuPhatBs;
	private String bienPhapNganChan;
	private String bienPhapKhacPhuc;
	private String donViThuTien;
	private String donViToChuc;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private Long capTrenPheDuyet;
	private Long capDuoiKyNhay;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapQd;
	private Long trangThaiQd;
	private Date canCuQdGiaoquyenNgay;
	private String maVuViec;
	private String maThongTu;

	public QdSuaDoiXpvphc29() {
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

	@Caption("QdVphc02Id")
	@Column(name = "QD_VPHC02_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQdVphc02Id() {
		return this.qdVphc02Id;
	}

	public void setQdVphc02Id(Long qdVphc02Id) {
		this.qdVphc02Id = qdVphc02Id;
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

	@Caption("CanCuQdGiaoquyenSo")
	@Column(name = "CAN_CU_QD_GIAOQUYEN_SO", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQdGiaoquyenSo() {
		return this.canCuQdGiaoquyenSo;
	}

	public void setCanCuQdGiaoquyenSo(String canCuQdGiaoquyenSo) {
		this.canCuQdGiaoquyenSo = canCuQdGiaoquyenSo;
	}

	@Caption("CanCuNghiDinh")
	@Column(name = "CAN_CU_NGHI_DINH", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuNghiDinh() {
		return this.canCuNghiDinh;
	}

	public void setCanCuNghiDinh(String canCuNghiDinh) {
		this.canCuNghiDinh = canCuNghiDinh;
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
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Caption("QdXuphatVphcSo")
	@Column(name = "QD_XUPHAT_VPHC_SO", columnDefinition = "VARCHAR2", length = 150)
	public String getQdXuphatVphcSo() {
		return this.qdXuphatVphcSo;
	}

	public void setQdXuphatVphcSo(String qdXuphatVphcSo) {
		this.qdXuphatVphcSo = qdXuphatVphcSo;
	}

	@Caption("QdXuphatVphcNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "QD_XUPHAT_VPHC_NGAY", columnDefinition = "DATE", length = 7)
	public Date getQdXuphatVphcNgay() {
		return this.qdXuphatVphcNgay;
	}

	public void setQdXuphatVphcNgay(Date qdXuphatVphcNgay) {
		this.qdXuphatVphcNgay = qdXuphatVphcNgay;
	}

	@Caption("NguoiKy")
	@Column(name = "NGUOI_KY", columnDefinition = "VARCHAR2", length = 100)
	public String getNguoiKy() {
		return this.nguoiKy;
	}

	public void setNguoiKy(String nguoiKy) {
		this.nguoiKy = nguoiKy;
	}

	@Caption("TenNguoiNvp")
	@Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 50)
	public String getTenNguoiNvp() {
		return this.tenNguoiNvp;
	}

	public void setTenNguoiNvp(String tenNguoiNvp) {
		this.tenNguoiNvp = tenNguoiNvp;
	}

	@Caption("NgaySinhNvp")
	@Column(name = "NGAY_SINH_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvp() {
		return this.ngaySinhNvp;
	}

	public void setNgaySinhNvp(String ngaySinhNvp) {
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

	@Caption("DiaChiNvp")
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
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
	@Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 150)
	public String getNoiCapCmndNvp() {
		return this.noiCapCmndNvp;
	}

	public void setNoiCapCmndNvp(String noiCapCmndNvp) {
		this.noiCapCmndNvp = noiCapCmndNvp;
	}

	@Caption("LyDoSuaDoi")
	@Column(name = "LY_DO_SUA_DOI", columnDefinition = "VARCHAR2", length = 100)
	public String getLyDoSuaDoi() {
		return this.lyDoSuaDoi;
	}

	public void setLyDoSuaDoi(String lyDoSuaDoi) {
		this.lyDoSuaDoi = lyDoSuaDoi;
	}

	@Caption("NoiDungSuaDoi")
	@Column(name = "NOI_DUNG_SUA_DOI", columnDefinition = "VARCHAR2", length = 300)
	public String getNoiDungSuaDoi() {
		return this.noiDungSuaDoi;
	}

	public void setNoiDungSuaDoi(String noiDungSuaDoi) {
		this.noiDungSuaDoi = noiDungSuaDoi;
	}

	@Caption("HinhThucXuPhat")
	@Column(name = "HINH_THUC_XU_PHAT", columnDefinition = "VARCHAR2", length = 300)
	public String getHinhThucXuPhat() {
		return this.hinhThucXuPhat;
	}

	public void setHinhThucXuPhat(String hinhThucXuPhat) {
		this.hinhThucXuPhat = hinhThucXuPhat;
	}

	@Caption("TongTienBangSo")
	@Column(name = "TONG_TIEN_BANG_SO", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTongTienBangSo() {
		return this.tongTienBangSo;
	}

	public void setTongTienBangSo(Long tongTienBangSo) {
		this.tongTienBangSo = tongTienBangSo;
	}

	@Caption("TongTienBangChu")
	@Column(name = "TONG_TIEN_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getTongTienBangChu() {
		return this.tongTienBangChu;
	}

	public void setTongTienBangChu(String tongTienBangChu) {
		this.tongTienBangChu = tongTienBangChu;
	}

	@Caption("HinhThucXuPhatBs")
	@Column(name = "HINH_THUC_XU_PHAT_BS", columnDefinition = "VARCHAR2", length = 300)
	public String getHinhThucXuPhatBs() {
		return this.hinhThucXuPhatBs;
	}

	public void setHinhThucXuPhatBs(String hinhThucXuPhatBs) {
		this.hinhThucXuPhatBs = hinhThucXuPhatBs;
	}

	@Caption("BienPhapNganChan")
	@Column(name = "BIEN_PHAP_NGAN_CHAN", columnDefinition = "VARCHAR2", length = 300)
	public String getBienPhapNganChan() {
		return this.bienPhapNganChan;
	}

	public void setBienPhapNganChan(String bienPhapNganChan) {
		this.bienPhapNganChan = bienPhapNganChan;
	}

	@Caption("BienPhapKhacPhuc")
	@Column(name = "BIEN_PHAP_KHAC_PHUC", columnDefinition = "VARCHAR2", length = 300)
	public String getBienPhapKhacPhuc() {
		return this.bienPhapKhacPhuc;
	}

	public void setBienPhapKhacPhuc(String bienPhapKhacPhuc) {
		this.bienPhapKhacPhuc = bienPhapKhacPhuc;
	}

	@Caption("DonViThuTien")
	@Column(name = "DON_VI_THU_TIEN", columnDefinition = "VARCHAR2", length = 150)
	public String getDonViThuTien() {
		return this.donViThuTien;
	}

	public void setDonViThuTien(String donViThuTien) {
		this.donViThuTien = donViThuTien;
	}

	@Caption("DonViToChuc")
	@Column(name = "DON_VI_TO_CHUC", columnDefinition = "VARCHAR2", length = 150)
	public String getDonViToChuc() {
		return this.donViToChuc;
	}

	public void setDonViToChuc(String donViToChuc) {
		this.donViToChuc = donViToChuc;
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

	@Caption("CanCuQdGiaoquyenNgay")
	@Temporal(TemporalType.DATE)
	@Column(name = "CAN_CU_QD_GIAOQUYEN_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdGiaoquyenNgay() {
		return this.canCuQdGiaoquyenNgay;
	}

	public void setCanCuQdGiaoquyenNgay(Date canCuQdGiaoquyenNgay) {
		this.canCuQdGiaoquyenNgay = canCuQdGiaoquyenNgay;
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

}
