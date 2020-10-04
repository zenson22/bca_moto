package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BienbanViphamHcDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * BienbanViphamHc
 */
@DAO(daoClass = BienbanViphamHcDAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BIENBAN_VIPHAM_HC", schema = "BCA_MOTO")
public class BienbanViphamHc implements java.io.Serializable {

	private long id;
	private TblTrangThai tblTrangThai;
	private String soBienBan;
	private String tenCucCsgt;
	private String canCu;
	private String diaDiemVphc;
	private String tenCanBo;
	private String thoiGianVphc;
	private Date ngayThangVphc;
	private String chucVu;
	private String donViCsgt;
	private String tenNc1;
	private String ngheNghiepNc1;
	private String soCmndNc1;
	private String diaChiNc1;
	private String sdtNc1;
	private String tenNc2;
	private String ngheNghiepNc2;
	private String soCmndNc2;
	private String diaChiNc2;
	private String sdtNc2;
	private String tenNvp;
	private Date ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String diaChiNvp;
	private String soCmndNvp;
	private Date ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String noiDungVphc;
	private String YKienNvp;
	private String YKienNbh;
	private String tangVatTg;
	private String thoiGianGqvp;
	private Date ngayGqvp;
	private String diaDiemGqvp;
	private String thoiHanGqvp;
	private String soTrangBb;
	private String soBanBb;
	private String lyDoKoKyBb;
	private String qdXphc;
	private String qdTgtgtv;
	private String bienPhapNganChanVphc;
	private String thoiGianBbLap;
	private Date ngayBbLap;
	private String canBoTiepNhanGt;
	private String nguoiTao;
	private Long nguoiTaoId;
	private Date ngayTao;
	private String nguoiSua;
	private Long nguoiSuaId;
	private Date ngaySua;
	private String ghiChu;
	private String donViCsgtCapTren;
	private String loaiPhuongTien;
	private Long loaiPhuongTienId;
	private String bienKiemSoat;
	private Long soQdxphc;
	private Long soQdtgtv;
	private Long soBbtgtv;
	private Long soQdtltv;
	private Long soBbtltv;
	private Long idTheoNam;
	private Long diaDanhHcId;
	private String namLapBb;
	private Long nhapBb;
	private Long canBoXuLyId;
	private Long canBoTraLaiId;
	private Date ngayTraLai;
	private Long namTaoBb;
	private Long toChuc;
	private Long quocTichNvpId;
	private Long ngheNghiepNvpId;
	private String soDienThoaiNvp;
	private Long trangThai;
	private String quyenSo;
	private String tenNvpDvc;
	private String tenCanBoNhap;
	private Long capBacNhap;
	private Long chucVuNhap;
	private String gplx;
	private String kiemDinh;
	private Long tinhThanhId;
	private String hangGplx;
	private String maDonVi;
	private String maTinhThanh;
	private String ngaySinhNvpNhap;
	private Long capDonVi;
	private Long linhVucGiaoThong;
	private String maVuViec;
	private String maThongTu;
	private String ngayLapBb;
	private String thoiGianLapBb;
	private String maSoDn;
	private String thoiDiemVphc;
	private Set<HanhViVpBb43> hanhViVpBb43s = new HashSet<HanhViVpBb43>(0);

	public BienbanViphamHc() {
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

	@Caption("TblTrangThai")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TRANG_THAI_BB", columnDefinition = "NUMBER")
	public TblTrangThai getTblTrangThai() {
		return this.tblTrangThai;
	}

	public void setTblTrangThai(TblTrangThai tblTrangThai) {
		this.tblTrangThai = tblTrangThai;
	}

	@Caption("SoBienBan")
	@Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(String soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Caption("TenCucCsgt")
	@Column(name = "TEN_CUC_CSGT", columnDefinition = "VARCHAR2", length = 150)
	public String getTenCucCsgt() {
		return this.tenCucCsgt;
	}

	public void setTenCucCsgt(String tenCucCsgt) {
		this.tenCucCsgt = tenCucCsgt;
	}

	@Caption("CanCu")
	@Column(name = "CAN_CU", nullable = false, columnDefinition = "VARCHAR2", length = 500)
	public String getCanCu() {
		return this.canCu;
	}

	public void setCanCu(String canCu) {
		this.canCu = canCu;
	}

	@Caption("DiaDiemVphc")
	@Column(name = "DIA_DIEM_VPHC", nullable = false, columnDefinition = "VARCHAR2", length = 500)
	public String getDiaDiemVphc() {
		return this.diaDiemVphc;
	}

	public void setDiaDiemVphc(String diaDiemVphc) {
		this.diaDiemVphc = diaDiemVphc;
	}

	@Caption("TenCanBo")
	@Column(name = "TEN_CAN_BO", columnDefinition = "VARCHAR2", length = 100)
	public String getTenCanBo() {
		return this.tenCanBo;
	}

	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}

	@Caption("ThoiGianVphc")
	@Column(name = "THOI_GIAN_VPHC", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getThoiGianVphc() {
		return this.thoiGianVphc;
	}

	public void setThoiGianVphc(String thoiGianVphc) {
		this.thoiGianVphc = thoiGianVphc;
	}

	@Caption("NgayThangVphc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_THANG_VPHC", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayThangVphc() {
		return this.ngayThangVphc;
	}

	public void setNgayThangVphc(Date ngayThangVphc) {
		this.ngayThangVphc = ngayThangVphc;
	}

	@Caption("ChucVu")
	@Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 60)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Caption("DonViCsgt")
	@Column(name = "DON_VI_CSGT", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getDonViCsgt() {
		return this.donViCsgt;
	}

	public void setDonViCsgt(String donViCsgt) {
		this.donViCsgt = donViCsgt;
	}

	@Caption("TenNc1")
	@Column(name = "TEN_NC1", columnDefinition = "VARCHAR2", length = 100)
	public String getTenNc1() {
		return this.tenNc1;
	}

	public void setTenNc1(String tenNc1) {
		this.tenNc1 = tenNc1;
	}

	@Caption("NgheNghiepNc1")
	@Column(name = "NGHE_NGHIEP_NC1", columnDefinition = "VARCHAR2", length = 100)
	public String getNgheNghiepNc1() {
		return this.ngheNghiepNc1;
	}

	public void setNgheNghiepNc1(String ngheNghiepNc1) {
		this.ngheNghiepNc1 = ngheNghiepNc1;
	}

	@Caption("SoCmndNc1")
	@Column(name = "SO_CMND_NC1", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNc1() {
		return this.soCmndNc1;
	}

	public void setSoCmndNc1(String soCmndNc1) {
		this.soCmndNc1 = soCmndNc1;
	}

	@Caption("DiaChiNc1")
	@Column(name = "DIA_CHI_NC1", columnDefinition = "VARCHAR2", length = 150)
	public String getDiaChiNc1() {
		return this.diaChiNc1;
	}

	public void setDiaChiNc1(String diaChiNc1) {
		this.diaChiNc1 = diaChiNc1;
	}

	@Caption("SdtNc1")
	@Column(name = "SDT_NC1", columnDefinition = "VARCHAR2", length = 20)
	public String getSdtNc1() {
		return this.sdtNc1;
	}

	public void setSdtNc1(String sdtNc1) {
		this.sdtNc1 = sdtNc1;
	}

	@Caption("TenNc2")
	@Column(name = "TEN_NC2", columnDefinition = "VARCHAR2", length = 100)
	public String getTenNc2() {
		return this.tenNc2;
	}

	public void setTenNc2(String tenNc2) {
		this.tenNc2 = tenNc2;
	}

	@Caption("NgheNghiepNc2")
	@Column(name = "NGHE_NGHIEP_NC2", columnDefinition = "VARCHAR2", length = 100)
	public String getNgheNghiepNc2() {
		return this.ngheNghiepNc2;
	}

	public void setNgheNghiepNc2(String ngheNghiepNc2) {
		this.ngheNghiepNc2 = ngheNghiepNc2;
	}

	@Caption("SoCmndNc2")
	@Column(name = "SO_CMND_NC2", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNc2() {
		return this.soCmndNc2;
	}

	public void setSoCmndNc2(String soCmndNc2) {
		this.soCmndNc2 = soCmndNc2;
	}

	@Caption("DiaChiNc2")
	@Column(name = "DIA_CHI_NC2", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaChiNc2() {
		return this.diaChiNc2;
	}

	public void setDiaChiNc2(String diaChiNc2) {
		this.diaChiNc2 = diaChiNc2;
	}

	@Caption("SdtNc2")
	@Column(name = "SDT_NC2", columnDefinition = "VARCHAR2", length = 20)
	public String getSdtNc2() {
		return this.sdtNc2;
	}

	public void setSdtNc2(String sdtNc2) {
		this.sdtNc2 = sdtNc2;
	}

	@Caption("TenNvp")
	@Column(name = "TEN_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 300)
	public String getTenNvp() {
		return this.tenNvp;
	}

	public void setTenNvp(String tenNvp) {
		this.tenNvp = tenNvp;
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
	@Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 30)
	public String getQuocTichNvp() {
		return this.quocTichNvp;
	}

	public void setQuocTichNvp(String quocTichNvp) {
		this.quocTichNvp = quocTichNvp;
	}

	@Caption("NgheNghiepNvp")
	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 100)
	public String getNgheNghiepNvp() {
		return this.ngheNghiepNvp;
	}

	public void setNgheNghiepNvp(String ngheNghiepNvp) {
		this.ngheNghiepNvp = ngheNghiepNvp;
	}

	@Caption("DiaChiNvp")
	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 500)
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
	@Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)
	public String getNoiCapCmndNvp() {
		return this.noiCapCmndNvp;
	}

	public void setNoiCapCmndNvp(String noiCapCmndNvp) {
		this.noiCapCmndNvp = noiCapCmndNvp;
	}

	@Caption("NoiDungVphc")
	@Column(name = "NOI_DUNG_VPHC", nullable = false, columnDefinition = "VARCHAR2", length = 2000)
	public String getNoiDungVphc() {
		return this.noiDungVphc;
	}

	public void setNoiDungVphc(String noiDungVphc) {
		this.noiDungVphc = noiDungVphc;
	}

	@Caption("YKienNvp")
	@Column(name = "Y_KIEN_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienNvp() {
		return this.YKienNvp;
	}

	public void setYKienNvp(String YKienNvp) {
		this.YKienNvp = YKienNvp;
	}

	@Caption("YKienNbh")
	@Column(name = "Y_KIEN_NBH", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienNbh() {
		return this.YKienNbh;
	}

	public void setYKienNbh(String YKienNbh) {
		this.YKienNbh = YKienNbh;
	}

	@Caption("TangVatTg")
	@Column(name = "TANG_VAT_TG", columnDefinition = "VARCHAR2", length = 1000)
	public String getTangVatTg() {
		return this.tangVatTg;
	}

	public void setTangVatTg(String tangVatTg) {
		this.tangVatTg = tangVatTg;
	}

	@Caption("ThoiGianGqvp")
	@Column(name = "THOI_GIAN_GQVP", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getThoiGianGqvp() {
		return this.thoiGianGqvp;
	}

	public void setThoiGianGqvp(String thoiGianGqvp) {
		this.thoiGianGqvp = thoiGianGqvp;
	}

	@Caption("NgayGqvp")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_GQVP", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayGqvp() {
		return this.ngayGqvp;
	}

	public void setNgayGqvp(Date ngayGqvp) {
		this.ngayGqvp = ngayGqvp;
	}

	@Caption("DiaDiemGqvp")
	@Column(name = "DIA_DIEM_GQVP", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getDiaDiemGqvp() {
		return this.diaDiemGqvp;
	}

	public void setDiaDiemGqvp(String diaDiemGqvp) {
		this.diaDiemGqvp = diaDiemGqvp;
	}

	@Caption("ThoiHanGqvp")
	@Column(name = "THOI_HAN_GQVP", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanGqvp() {
		return this.thoiHanGqvp;
	}

	public void setThoiHanGqvp(String thoiHanGqvp) {
		this.thoiHanGqvp = thoiHanGqvp;
	}

	@Caption("SoTrangBb")
	@Column(name = "SO_TRANG_BB", nullable = false, columnDefinition = "VARCHAR2", length = 5)
	public String getSoTrangBb() {
		return this.soTrangBb;
	}

	public void setSoTrangBb(String soTrangBb) {
		this.soTrangBb = soTrangBb;
	}

	@Caption("SoBanBb")
	@Column(name = "SO_BAN_BB", nullable = false, columnDefinition = "VARCHAR2", length = 5)
	public String getSoBanBb() {
		return this.soBanBb;
	}

	public void setSoBanBb(String soBanBb) {
		this.soBanBb = soBanBb;
	}

	@Caption("LyDoKoKyBb")
	@Column(name = "LY_DO_KO_KY_BB", columnDefinition = "VARCHAR2", length = 100)
	public String getLyDoKoKyBb() {
		return this.lyDoKoKyBb;
	}

	public void setLyDoKoKyBb(String lyDoKoKyBb) {
		this.lyDoKoKyBb = lyDoKoKyBb;
	}

	@Caption("QdXphc")
	@Column(name = "QD_XPHC", columnDefinition = "VARCHAR2", length = 2)
	public String getQdXphc() {
		return this.qdXphc;
	}

	public void setQdXphc(String qdXphc) {
		this.qdXphc = qdXphc;
	}

	@Caption("QdTgtgtv")
	@Column(name = "QD_TGTGTV", columnDefinition = "VARCHAR2", length = 2)
	public String getQdTgtgtv() {
		return this.qdTgtgtv;
	}

	public void setQdTgtgtv(String qdTgtgtv) {
		this.qdTgtgtv = qdTgtgtv;
	}

	@Caption("BienPhapNganChanVphc")
	@Column(name = "BIEN_PHAP_NGAN_CHAN_VPHC", columnDefinition = "VARCHAR2", length = 500)
	public String getBienPhapNganChanVphc() {
		return this.bienPhapNganChanVphc;
	}

	public void setBienPhapNganChanVphc(String bienPhapNganChanVphc) {
		this.bienPhapNganChanVphc = bienPhapNganChanVphc;
	}

	@Caption("ThoiGianBbLap")
	@Column(name = "THOI_GIAN_BB_LAP", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getThoiGianBbLap() {
		return this.thoiGianBbLap;
	}

	public void setThoiGianBbLap(String thoiGianBbLap) {
		this.thoiGianBbLap = thoiGianBbLap;
	}

	@Caption("NgayBbLap")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_BB_LAP", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayBbLap() {
		return this.ngayBbLap;
	}

	public void setNgayBbLap(Date ngayBbLap) {
		this.ngayBbLap = ngayBbLap;
	}

	@Caption("CanBoTiepNhanGt")
	@Column(name = "CAN_BO_TIEP_NHAN_GT", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoTiepNhanGt() {
		return this.canBoTiepNhanGt;
	}

	public void setCanBoTiepNhanGt(String canBoTiepNhanGt) {
		this.canBoTiepNhanGt = canBoTiepNhanGt;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 50)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 50)
	public String getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("DonViCsgtCapTren")
	@Column(name = "DON_VI_CSGT_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getDonViCsgtCapTren() {
		return this.donViCsgtCapTren;
	}

	public void setDonViCsgtCapTren(String donViCsgtCapTren) {
		this.donViCsgtCapTren = donViCsgtCapTren;
	}

	@Caption("LoaiPhuongTien")
	@Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 50)
	public String getLoaiPhuongTien() {
		return this.loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	@Caption("LoaiPhuongTienId")
	@Column(name = "LOAI_PHUONG_TIEN_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLoaiPhuongTienId() {
		return this.loaiPhuongTienId;
	}

	public void setLoaiPhuongTienId(Long loaiPhuongTienId) {
		this.loaiPhuongTienId = loaiPhuongTienId;
	}

	@Caption("BienKiemSoat")
	@Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 50)
	public String getBienKiemSoat() {
		return this.bienKiemSoat;
	}

	public void setBienKiemSoat(String bienKiemSoat) {
		this.bienKiemSoat = bienKiemSoat;
	}

	@Caption("SoQdxphc")
	@Column(name = "SO_QDXPHC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQdxphc() {
		return this.soQdxphc;
	}

	public void setSoQdxphc(Long soQdxphc) {
		this.soQdxphc = soQdxphc;
	}

	@Caption("SoQdtgtv")
	@Column(name = "SO_QDTGTV", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQdtgtv() {
		return this.soQdtgtv;
	}

	public void setSoQdtgtv(Long soQdtgtv) {
		this.soQdtgtv = soQdtgtv;
	}

	@Caption("SoBbtgtv")
	@Column(name = "SO_BBTGTV", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBbtgtv() {
		return this.soBbtgtv;
	}

	public void setSoBbtgtv(Long soBbtgtv) {
		this.soBbtgtv = soBbtgtv;
	}

	@Caption("SoQdtltv")
	@Column(name = "SO_QDTLTV", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQdtltv() {
		return this.soQdtltv;
	}

	public void setSoQdtltv(Long soQdtltv) {
		this.soQdtltv = soQdtltv;
	}

	@Caption("SoBbtltv")
	@Column(name = "SO_BBTLTV", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBbtltv() {
		return this.soBbtltv;
	}

	public void setSoBbtltv(Long soBbtltv) {
		this.soBbtltv = soBbtltv;
	}

	@Caption("IdTheoNam")
	@Column(name = "ID_THEO_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdTheoNam() {
		return this.idTheoNam;
	}

	public void setIdTheoNam(Long idTheoNam) {
		this.idTheoNam = idTheoNam;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Caption("NamLapBb")
	@Column(name = "NAM_LAP_BB", columnDefinition = "VARCHAR2", length = 100)
	public String getNamLapBb() {
		return this.namLapBb;
	}

	public void setNamLapBb(String namLapBb) {
		this.namLapBb = namLapBb;
	}

	@Caption("NhapBb")
	@Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapBb() {
		return this.nhapBb;
	}

	public void setNhapBb(Long nhapBb) {
		this.nhapBb = nhapBb;
	}

	@Caption("CanBoXuLyId")
	@Column(name = "CAN_BO_XU_LY_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoXuLyId() {
		return this.canBoXuLyId;
	}

	public void setCanBoXuLyId(Long canBoXuLyId) {
		this.canBoXuLyId = canBoXuLyId;
	}

	@Caption("CanBoTraLaiId")
	@Column(name = "CAN_BO_TRA_LAI_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoTraLaiId() {
		return this.canBoTraLaiId;
	}

	public void setCanBoTraLaiId(Long canBoTraLaiId) {
		this.canBoTraLaiId = canBoTraLaiId;
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

	@Caption("ToChuc")
	@Column(name = "TO_CHUC", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getToChuc() {
		return this.toChuc;
	}

	public void setToChuc(Long toChuc) {
		this.toChuc = toChuc;
	}

	@Caption("QuocTichNvpId")
	@Column(name = "QUOC_TICH_NVP_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getQuocTichNvpId() {
		return this.quocTichNvpId;
	}

	public void setQuocTichNvpId(Long quocTichNvpId) {
		this.quocTichNvpId = quocTichNvpId;
	}

	@Caption("NgheNghiepNvpId")
	@Column(name = "NGHE_NGHIEP_NVP_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNgheNghiepNvpId() {
		return this.ngheNghiepNvpId;
	}

	public void setNgheNghiepNvpId(Long ngheNghiepNvpId) {
		this.ngheNghiepNvpId = ngheNghiepNvpId;
	}

	@Caption("SoDienThoaiNvp")
	@Column(name = "SO_DIEN_THOAI_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getSoDienThoaiNvp() {
		return this.soDienThoaiNvp;
	}

	public void setSoDienThoaiNvp(String soDienThoaiNvp) {
		this.soDienThoaiNvp = soDienThoaiNvp;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("QuyenSo")
	@Column(name = "QUYEN_SO", columnDefinition = "VARCHAR2", length = 30)
	public String getQuyenSo() {
		return this.quyenSo;
	}

	public void setQuyenSo(String quyenSo) {
		this.quyenSo = quyenSo;
	}

	@Caption("TenNvpDvc")
	@Column(name = "TEN_NVP_DVC", columnDefinition = "VARCHAR2", length = 300)
	public String getTenNvpDvc() {
		return this.tenNvpDvc;
	}

	public void setTenNvpDvc(String tenNvpDvc) {
		this.tenNvpDvc = tenNvpDvc;
	}

	@Caption("TenCanBoNhap")
	@Column(name = "TEN_CAN_BO_NHAP", columnDefinition = "VARCHAR2", length = 100)
	public String getTenCanBoNhap() {
		return this.tenCanBoNhap;
	}

	public void setTenCanBoNhap(String tenCanBoNhap) {
		this.tenCanBoNhap = tenCanBoNhap;
	}

	@Caption("CapBacNhap")
	@Column(name = "CAP_BAC_NHAP", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getCapBacNhap() {
		return this.capBacNhap;
	}

	public void setCapBacNhap(Long capBacNhap) {
		this.capBacNhap = capBacNhap;
	}

	@Caption("ChucVuNhap")
	@Column(name = "CHUC_VU_NHAP", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getChucVuNhap() {
		return this.chucVuNhap;
	}

	public void setChucVuNhap(Long chucVuNhap) {
		this.chucVuNhap = chucVuNhap;
	}

	@Caption("Gplx")
	@Column(name = "GPLX", columnDefinition = "VARCHAR2", length = 50)
	public String getGplx() {
		return this.gplx;
	}

	public void setGplx(String gplx) {
		this.gplx = gplx;
	}

	@Caption("KiemDinh")
	@Column(name = "KIEM_DINH", columnDefinition = "VARCHAR2", length = 50)
	public String getKiemDinh() {
		return this.kiemDinh;
	}

	public void setKiemDinh(String kiemDinh) {
		this.kiemDinh = kiemDinh;
	}

	@Caption("TinhThanhId")
	@Column(name = "TINH_THANH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTinhThanhId() {
		return this.tinhThanhId;
	}

	public void setTinhThanhId(Long tinhThanhId) {
		this.tinhThanhId = tinhThanhId;
	}

	@Caption("HangGplx")
	@Column(name = "HANG_GPLX", columnDefinition = "VARCHAR2", length = 20)
	public String getHangGplx() {
		return this.hangGplx;
	}

	public void setHangGplx(String hangGplx) {
		this.hangGplx = hangGplx;
	}

	@Caption("MaDonVi")
	@Column(name = "MA_DON_VI", columnDefinition = "VARCHAR2", length = 50)
	public String getMaDonVi() {
		return this.maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}

	@Caption("MaTinhThanh")
	@Column(name = "MA_TINH_THANH", columnDefinition = "VARCHAR2", length = 50)
	public String getMaTinhThanh() {
		return this.maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}

	@Caption("NgaySinhNvpNhap")
	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Caption("CapDonVi")
	@Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getCapDonVi() {
		return this.capDonVi;
	}

	public void setCapDonVi(Long capDonVi) {
		this.capDonVi = capDonVi;
	}

	@Caption("LinhVucGiaoThong")
	@Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLinhVucGiaoThong() {
		return this.linhVucGiaoThong;
	}

	public void setLinhVucGiaoThong(Long linhVucGiaoThong) {
		this.linhVucGiaoThong = linhVucGiaoThong;
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

	@Caption("NgayLapBb")
	@Column(name = "NGAY_LAP_BB", columnDefinition = "VARCHAR2", length = 80)
	public String getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(String ngayLapBb) {
		this.ngayLapBb = ngayLapBb;
	}

	@Caption("ThoiGianLapBb")
	@Column(name = "THOI_GIAN_LAP_BB", columnDefinition = "VARCHAR2", length = 80)
	public String getThoiGianLapBb() {
		return this.thoiGianLapBb;
	}

	public void setThoiGianLapBb(String thoiGianLapBb) {
		this.thoiGianLapBb = thoiGianLapBb;
	}

	@Caption("MaSoDn")
	@Column(name = "MA_SO_DN", columnDefinition = "VARCHAR2", length = 80)
	public String getMaSoDn() {
		return this.maSoDn;
	}

	public void setMaSoDn(String maSoDn) {
		this.maSoDn = maSoDn;
	}

	@Caption("ThoiDiemVphc")
	@Column(name = "THOI_DIEM_VPHC", columnDefinition = "VARCHAR2", length = 500)
	public String getThoiDiemVphc() {
		return this.thoiDiemVphc;
	}

	public void setThoiDiemVphc(String thoiDiemVphc) {
		this.thoiDiemVphc = thoiDiemVphc;
	}

	@Caption("HanhViVpBb43s")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bienbanViphamHc")
	public Set<HanhViVpBb43> getHanhViVpBb43s() {
		return this.hanhViVpBb43s;
	}

	public void setHanhViVpBb43s(Set<HanhViVpBb43> hanhViVpBb43s) {
		this.hanhViVpBb43s = hanhViVpBb43s;
	}

}
