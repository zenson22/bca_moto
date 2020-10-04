package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BbTraLai60DAO;
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
 * BbTraLai60
 */
@DAO(daoClass = BbTraLai60DAO.class)
@Caption("{%soBienBanTl}")
@Entity
@Table(name = "BB_TRA_LAI60", schema = "BCA_MOTO")
public class BbTraLai60 implements java.io.Serializable {

	private long id;
	private String soBienBanTl;
	private String tenCqCapTren;
	private String tenDonVi;
	private String soBienBanTc;
	private String diaDanhHc;
	private Date ngayLapBbTl;
	private String canCuXlvphc;
	private String danhSachCanBo;
	private String canCuQuyetDinhTg;
	private String canBoTaoBbTl;
	private long canBoTaoBbTlId;
	private String tenNguoiNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private Long soQuyetDinhTgTc;
	private Date ngayQuyetDinhTl;
	private String canBoKyQdTl;
	private Date thoiGianLapBbTl;
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
	private String ngayLapBb;
	private String diaChiNvp;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Date thoiGianTg;
	private String danhSachTvTl;
	private String YKienNvp;
	private String YKienNck;
	private String YKienBoSung;
	private String lyDoKhongKyBb;
	private String diaDiemTl;
	private Date ngayBatDauXl;
	private Long canBoTraLai;
	private Date ngayTraLai;
	private Long namTaoBb;
	private Long nhapBb;
	private Long trangThaiBb;
	private Long soBb43Tc;
	private Long soBb20;
	private Date ngayTaoBb20;
	private String maVuViec;
	private String maThongTu;
	private String ngaySinhNvpNhap;
	private Long linhVucGiaoThong;

	public BbTraLai60() {
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

	@Caption("SoBienBanTl")
	@Column(name = "SO_BIEN_BAN_TL", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBanTl() {
		return this.soBienBanTl;
	}

	public void setSoBienBanTl(String soBienBanTl) {
		this.soBienBanTl = soBienBanTl;
	}

	@Caption("TenCqCapTren")
	@Column(name = "TEN_CQ_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 100)
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
	@Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 50)
	public String getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(String diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Caption("NgayLapBbTl")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_LAP_BB_TL", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBbTl() {
		return this.ngayLapBbTl;
	}

	public void setNgayLapBbTl(Date ngayLapBbTl) {
		this.ngayLapBbTl = ngayLapBbTl;
	}

	@Caption("CanCuXlvphc")
	@Column(name = "CAN_CU_XLVPHC", columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuXlvphc() {
		return this.canCuXlvphc;
	}

	public void setCanCuXlvphc(String canCuXlvphc) {
		this.canCuXlvphc = canCuXlvphc;
	}

	@Caption("DanhSachCanBo")
	@Column(name = "DANH_SACH_CAN_BO", columnDefinition = "VARCHAR2", length = 2000)
	public String getDanhSachCanBo() {
		return this.danhSachCanBo;
	}

	public void setDanhSachCanBo(String danhSachCanBo) {
		this.danhSachCanBo = danhSachCanBo;
	}

	@Caption("CanCuQuyetDinhTg")
	@Column(name = "CAN_CU_QUYET_DINH_TG", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getCanCuQuyetDinhTg() {
		return this.canCuQuyetDinhTg;
	}

	public void setCanCuQuyetDinhTg(String canCuQuyetDinhTg) {
		this.canCuQuyetDinhTg = canCuQuyetDinhTg;
	}

	@Caption("CanBoTaoBbTl")
	@Column(name = "CAN_BO_TAO_BB_TL", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getCanBoTaoBbTl() {
		return this.canBoTaoBbTl;
	}

	public void setCanBoTaoBbTl(String canBoTaoBbTl) {
		this.canBoTaoBbTl = canBoTaoBbTl;
	}

	@Caption("CanBoTaoBbTlId")
	@Column(name = "CAN_BO_TAO_BB_TL_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getCanBoTaoBbTlId() {
		return this.canBoTaoBbTlId;
	}

	public void setCanBoTaoBbTlId(long canBoTaoBbTlId) {
		this.canBoTaoBbTlId = canBoTaoBbTlId;
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

	@Caption("SoQuyetDinhTgTc")
	@Column(name = "SO_QUYET_DINH_TG_TC", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getSoQuyetDinhTgTc() {
		return this.soQuyetDinhTgTc;
	}

	public void setSoQuyetDinhTgTc(Long soQuyetDinhTgTc) {
		this.soQuyetDinhTgTc = soQuyetDinhTgTc;
	}

	@Caption("NgayQuyetDinhTl")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_QUYET_DINH_TL", columnDefinition = "DATE", length = 7)
	public Date getNgayQuyetDinhTl() {
		return this.ngayQuyetDinhTl;
	}

	public void setNgayQuyetDinhTl(Date ngayQuyetDinhTl) {
		this.ngayQuyetDinhTl = ngayQuyetDinhTl;
	}

	@Caption("CanBoKyQdTl")
	@Column(name = "CAN_BO_KY_QD_TL", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoKyQdTl() {
		return this.canBoKyQdTl;
	}

	public void setCanBoKyQdTl(String canBoKyQdTl) {
		this.canBoKyQdTl = canBoKyQdTl;
	}

	@Caption("ThoiGianLapBbTl")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_GIAN_LAP_BB_TL", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getThoiGianLapBbTl() {
		return this.thoiGianLapBbTl;
	}

	public void setThoiGianLapBbTl(Date thoiGianLapBbTl) {
		this.thoiGianLapBbTl = thoiGianLapBbTl;
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
	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
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
	@Column(name = "NGAY_LAP_BB", columnDefinition = "VARCHAR2", length = 20)
	public String getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(String ngayLapBb) {
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

	@Caption("ThoiGianTg")
	@Temporal(TemporalType.DATE)
	@Column(name = "THOI_GIAN_TG", columnDefinition = "DATE", length = 7)
	public Date getThoiGianTg() {
		return this.thoiGianTg;
	}

	public void setThoiGianTg(Date thoiGianTg) {
		this.thoiGianTg = thoiGianTg;
	}

	@Caption("DanhSachTvTl")
	@Column(name = "DANH_SACH_TV_TL", columnDefinition = "VARCHAR2", length = 2000)
	public String getDanhSachTvTl() {
		return this.danhSachTvTl;
	}

	public void setDanhSachTvTl(String danhSachTvTl) {
		this.danhSachTvTl = danhSachTvTl;
	}

	@Caption("YKienNvp")
	@Column(name = "Y_KIEN_NVP", columnDefinition = "VARCHAR2", length = 500)
	public String getYKienNvp() {
		return this.YKienNvp;
	}

	public void setYKienNvp(String YKienNvp) {
		this.YKienNvp = YKienNvp;
	}

	@Caption("YKienNck")
	@Column(name = "Y_KIEN_NCK", columnDefinition = "VARCHAR2", length = 500)
	public String getYKienNck() {
		return this.YKienNck;
	}

	public void setYKienNck(String YKienNck) {
		this.YKienNck = YKienNck;
	}

	@Caption("YKienBoSung")
	@Column(name = "Y_KIEN_BO_SUNG", columnDefinition = "VARCHAR2", length = 500)
	public String getYKienBoSung() {
		return this.YKienBoSung;
	}

	public void setYKienBoSung(String YKienBoSung) {
		this.YKienBoSung = YKienBoSung;
	}

	@Caption("LyDoKhongKyBb")
	@Column(name = "LY_DO_KHONG_KY_BB", columnDefinition = "VARCHAR2", length = 300)
	public String getLyDoKhongKyBb() {
		return this.lyDoKhongKyBb;
	}

	public void setLyDoKhongKyBb(String lyDoKhongKyBb) {
		this.lyDoKhongKyBb = lyDoKhongKyBb;
	}

	@Caption("DiaDiemTl")
	@Column(name = "DIA_DIEM_TL", columnDefinition = "VARCHAR2", length = 500)
	public String getDiaDiemTl() {
		return this.diaDiemTl;
	}

	public void setDiaDiemTl(String diaDiemTl) {
		this.diaDiemTl = diaDiemTl;
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

	@Caption("NamTaoBb")
	@Column(name = "NAM_TAO_BB", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamTaoBb() {
		return this.namTaoBb;
	}

	public void setNamTaoBb(Long namTaoBb) {
		this.namTaoBb = namTaoBb;
	}

	@Caption("NhapBb")
	@Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapBb() {
		return this.nhapBb;
	}

	public void setNhapBb(Long nhapBb) {
		this.nhapBb = nhapBb;
	}

	@Caption("TrangThaiBb")
	@Column(name = "TRANG_THAI_BB", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiBb() {
		return this.trangThaiBb;
	}

	public void setTrangThaiBb(Long trangThaiBb) {
		this.trangThaiBb = trangThaiBb;
	}

	@Caption("SoBb43Tc")
	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Caption("SoBb20")
	@Column(name = "SO_BB20", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSoBb20() {
		return this.soBb20;
	}

	public void setSoBb20(Long soBb20) {
		this.soBb20 = soBb20;
	}

	@Caption("NgayTaoBb20")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO_BB20", columnDefinition = "DATE", length = 7)
	public Date getNgayTaoBb20() {
		return this.ngayTaoBb20;
	}

	public void setNgayTaoBb20(Date ngayTaoBb20) {
		this.ngayTaoBb20 = ngayTaoBb20;
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

	@Caption("NgaySinhNvpNhap")
	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Caption("LinhVucGiaoThong")
	@Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLinhVucGiaoThong() {
		return this.linhVucGiaoThong;
	}

	public void setLinhVucGiaoThong(Long linhVucGiaoThong) {
		this.linhVucGiaoThong = linhVucGiaoThong;
	}

}
