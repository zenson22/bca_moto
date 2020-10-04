package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BienBanVphcDAO;
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
 * BienBanVphc
 */
@DAO(daoClass = BienBanVphcDAO.class)
@Caption("{%soBienBan}")
@Entity
@Table(name = "BIEN_BAN_VPHC", schema = "BCA_MOTO")
public class BienBanVphc implements java.io.Serializable {

	private String soBienBan;
	private String tenCucCsgt;
	private String canCu;
	private String diaDiemVphc;
	private String tenCanBo;
	private String thoiGianVphc;
	private String ngayThangVphc;
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
	private String ngaySinhNvp;
	private String quocTichNvp;
	private String ngheNghiepNvp;
	private String diaChiNvp;
	private String soCmndNvp;
	private String ngayCapCmndNvp;
	private String noiCapCmndNvp;
	private String noiDungVphc;
	private String YKienNvp;
	private String YKienNbh;
	private String tangVatTg;
	private String thoiGianGqvp;
	private String ngayGqvp;
	private String diaDiemGqvp;
	private String thoiHanGqvp;
	private String soTrangBb;
	private String soBanBb;
	private String lyDoKoKyBb;
	private String qdXphc;
	private String qdTgtgtv;
	private String bienPhapNganChanVphc;
	private String thoiGianBbLap;
	private String ngayBbLap;
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
	private String soQdxphc;
	private String soQdtgtv;
	private String soBbtgtv;
	private String soQdtltv;
	private String soBbtltv;
	private Long id;

	public BienBanVphc() {
	}

	@Caption("SoBienBan")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "SO_BIEN_BAN", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(String soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Caption("TenCucCsgt")
	@Column(name = "TEN_CUC_CSGT", columnDefinition = "VARCHAR2", length = 50)
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
	@Column(name = "TEN_CAN_BO", nullable = false, columnDefinition = "VARCHAR2", length = 30)
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
	@Column(name = "NGAY_THANG_VPHC", nullable = false, columnDefinition = "VARCHAR2", length = 40)
	public String getNgayThangVphc() {
		return this.ngayThangVphc;
	}

	public void setNgayThangVphc(String ngayThangVphc) {
		this.ngayThangVphc = ngayThangVphc;
	}

	@Caption("ChucVu")
	@Column(name = "CHUC_VU", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Caption("DonViCsgt")
	@Column(name = "DON_VI_CSGT", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getDonViCsgt() {
		return this.donViCsgt;
	}

	public void setDonViCsgt(String donViCsgt) {
		this.donViCsgt = donViCsgt;
	}

	@Caption("TenNc1")
	@Column(name = "TEN_NC1", columnDefinition = "VARCHAR2", length = 30)
	public String getTenNc1() {
		return this.tenNc1;
	}

	public void setTenNc1(String tenNc1) {
		this.tenNc1 = tenNc1;
	}

	@Caption("NgheNghiepNc1")
	@Column(name = "NGHE_NGHIEP_NC1", columnDefinition = "VARCHAR2", length = 30)
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
	@Column(name = "DIA_CHI_NC1", columnDefinition = "VARCHAR2", length = 100)
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
	@Column(name = "TEN_NC2", columnDefinition = "VARCHAR2", length = 30)
	public String getTenNc2() {
		return this.tenNc2;
	}

	public void setTenNc2(String tenNc2) {
		this.tenNc2 = tenNc2;
	}

	@Caption("NgheNghiepNc2")
	@Column(name = "NGHE_NGHIEP_NC2", columnDefinition = "VARCHAR2", length = 30)
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
	@Column(name = "NGAY_SINH_NVP", columnDefinition = "VARCHAR2", length = 40)
	public String getNgaySinhNvp() {
		return this.ngaySinhNvp;
	}

	public void setNgaySinhNvp(String ngaySinhNvp) {
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
	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 30)
	public String getNgheNghiepNvp() {
		return this.ngheNghiepNvp;
	}

	public void setNgheNghiepNvp(String ngheNghiepNvp) {
		this.ngheNghiepNvp = ngheNghiepNvp;
	}

	@Caption("DiaChiNvp")
	@Column(name = "DIA_CHI_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 100)
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
	@Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 40)
	public String getNgayCapCmndNvp() {
		return this.ngayCapCmndNvp;
	}

	public void setNgayCapCmndNvp(String ngayCapCmndNvp) {
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
	@Column(name = "TANG_VAT_TG", columnDefinition = "VARCHAR2", length = 500)
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
	@Column(name = "NGAY_GQVP", nullable = false, columnDefinition = "VARCHAR2", length = 40)
	public String getNgayGqvp() {
		return this.ngayGqvp;
	}

	public void setNgayGqvp(String ngayGqvp) {
		this.ngayGqvp = ngayGqvp;
	}

	@Caption("DiaDiemGqvp")
	@Column(name = "DIA_DIEM_GQVP", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getDiaDiemGqvp() {
		return this.diaDiemGqvp;
	}

	public void setDiaDiemGqvp(String diaDiemGqvp) {
		this.diaDiemGqvp = diaDiemGqvp;
	}

	@Caption("ThoiHanGqvp")
	@Column(name = "THOI_HAN_GQVP", nullable = false, columnDefinition = "VARCHAR2", length = 20)
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
	@Column(name = "QD_XPHC", nullable = false, columnDefinition = "VARCHAR2", length = 2)
	public String getQdXphc() {
		return this.qdXphc;
	}

	public void setQdXphc(String qdXphc) {
		this.qdXphc = qdXphc;
	}

	@Caption("QdTgtgtv")
	@Column(name = "QD_TGTGTV", nullable = false, columnDefinition = "VARCHAR2", length = 2)
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
	@Column(name = "NGAY_BB_LAP", nullable = false, columnDefinition = "VARCHAR2", length = 40)
	public String getNgayBbLap() {
		return this.ngayBbLap;
	}

	public void setNgayBbLap(String ngayBbLap) {
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
	@Column(name = "DON_VI_CSGT_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 50)
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
	@Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 20)
	public String getBienKiemSoat() {
		return this.bienKiemSoat;
	}

	public void setBienKiemSoat(String bienKiemSoat) {
		this.bienKiemSoat = bienKiemSoat;
	}

	@Caption("SoQdxphc")
	@Column(name = "SO_QDXPHC", columnDefinition = "VARCHAR2", length = 20)
	public String getSoQdxphc() {
		return this.soQdxphc;
	}

	public void setSoQdxphc(String soQdxphc) {
		this.soQdxphc = soQdxphc;
	}

	@Caption("SoQdtgtv")
	@Column(name = "SO_QDTGTV", columnDefinition = "VARCHAR2", length = 20)
	public String getSoQdtgtv() {
		return this.soQdtgtv;
	}

	public void setSoQdtgtv(String soQdtgtv) {
		this.soQdtgtv = soQdtgtv;
	}

	@Caption("SoBbtgtv")
	@Column(name = "SO_BBTGTV", columnDefinition = "VARCHAR2", length = 20)
	public String getSoBbtgtv() {
		return this.soBbtgtv;
	}

	public void setSoBbtgtv(String soBbtgtv) {
		this.soBbtgtv = soBbtgtv;
	}

	@Caption("SoQdtltv")
	@Column(name = "SO_QDTLTV", columnDefinition = "VARCHAR2", length = 20)
	public String getSoQdtltv() {
		return this.soQdtltv;
	}

	public void setSoQdtltv(String soQdtltv) {
		this.soQdtltv = soQdtltv;
	}

	@Caption("SoBbtltv")
	@Column(name = "SO_BBTLTV", columnDefinition = "VARCHAR2", length = 20)
	public String getSoBbtltv() {
		return this.soBbtltv;
	}

	public void setSoBbtltv(String soBbtltv) {
		this.soBbtltv = soBbtltv;
	}

	@Caption("Id")
	@Column(name = "ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
