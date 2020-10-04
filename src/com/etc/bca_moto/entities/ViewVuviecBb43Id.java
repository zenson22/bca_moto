package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewVuviecBb43Id
 */
@Embeddable
public class ViewVuviecBb43Id implements java.io.Serializable {

	private Long idVuviec;
	private String uuid;
	private Long loaiBbQd;
	private Long bbQdId;
	private String maTheoTt;
	private String maRutgon;
	private String maVuViecVv;
	private Long loaiPtIdVv;
	private String bienKsVv;
	private String tenNvpVv;
	private Long nguoiTaoVv;
	private Date ngayTaoVv;
	private Long nguoiSuaVv;
	private Date ngaySuaVv;
	private Long trangThaiVv;
	private String ghiChuVv;
	private Long dvCsgtIdVv;
	private Long idBb43;
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
	private Long trangThaiBb;
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

	public ViewVuviecBb43Id() {
	}

	@Column(name = "ID_VUVIEC", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getIdVuviec() {
		return this.idVuviec;
	}

	public void setIdVuviec(Long idVuviec) {
		this.idVuviec = idVuviec;
	}

	@Column(name = "UUID", columnDefinition = "VARCHAR2", length = 50)
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Column(name = "LOAI_BB_QD", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLoaiBbQd() {
		return this.loaiBbQd;
	}

	public void setLoaiBbQd(Long loaiBbQd) {
		this.loaiBbQd = loaiBbQd;
	}

	@Column(name = "BB_QD_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getBbQdId() {
		return this.bbQdId;
	}

	public void setBbQdId(Long bbQdId) {
		this.bbQdId = bbQdId;
	}

	@Column(name = "MA_THEO_TT", columnDefinition = "VARCHAR2", length = 100)
	public String getMaTheoTt() {
		return this.maTheoTt;
	}

	public void setMaTheoTt(String maTheoTt) {
		this.maTheoTt = maTheoTt;
	}

	@Column(name = "MA_RUTGON", columnDefinition = "VARCHAR2", length = 50)
	public String getMaRutgon() {
		return this.maRutgon;
	}

	public void setMaRutgon(String maRutgon) {
		this.maRutgon = maRutgon;
	}

	@Column(name = "MA_VU_VIEC_VV", columnDefinition = "VARCHAR2", length = 100)
	public String getMaVuViecVv() {
		return this.maVuViecVv;
	}

	public void setMaVuViecVv(String maVuViecVv) {
		this.maVuViecVv = maVuViecVv;
	}

	@Column(name = "LOAI_PT_ID_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLoaiPtIdVv() {
		return this.loaiPtIdVv;
	}

	public void setLoaiPtIdVv(Long loaiPtIdVv) {
		this.loaiPtIdVv = loaiPtIdVv;
	}

	@Column(name = "BIEN_KS_VV", columnDefinition = "VARCHAR2", length = 30)
	public String getBienKsVv() {
		return this.bienKsVv;
	}

	public void setBienKsVv(String bienKsVv) {
		this.bienKsVv = bienKsVv;
	}

	@Column(name = "TEN_NVP_VV", columnDefinition = "VARCHAR2", length = 500)
	public String getTenNvpVv() {
		return this.tenNvpVv;
	}

	public void setTenNvpVv(String tenNvpVv) {
		this.tenNvpVv = tenNvpVv;
	}

	@Column(name = "NGUOI_TAO_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getNguoiTaoVv() {
		return this.nguoiTaoVv;
	}

	public void setNguoiTaoVv(Long nguoiTaoVv) {
		this.nguoiTaoVv = nguoiTaoVv;
	}

	@Column(name = "NGAY_TAO_VV", columnDefinition = "DATE", length = 7)
	public Date getNgayTaoVv() {
		return this.ngayTaoVv;
	}

	public void setNgayTaoVv(Date ngayTaoVv) {
		this.ngayTaoVv = ngayTaoVv;
	}

	@Column(name = "NGUOI_SUA_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getNguoiSuaVv() {
		return this.nguoiSuaVv;
	}

	public void setNguoiSuaVv(Long nguoiSuaVv) {
		this.nguoiSuaVv = nguoiSuaVv;
	}

	@Column(name = "NGAY_SUA_VV", columnDefinition = "DATE", length = 7)
	public Date getNgaySuaVv() {
		return this.ngaySuaVv;
	}

	public void setNgaySuaVv(Date ngaySuaVv) {
		this.ngaySuaVv = ngaySuaVv;
	}

	@Column(name = "TRANG_THAI_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTrangThaiVv() {
		return this.trangThaiVv;
	}

	public void setTrangThaiVv(Long trangThaiVv) {
		this.trangThaiVv = trangThaiVv;
	}

	@Column(name = "GHI_CHU_VV", columnDefinition = "VARCHAR2", length = 20)
	public String getGhiChuVv() {
		return this.ghiChuVv;
	}

	public void setGhiChuVv(String ghiChuVv) {
		this.ghiChuVv = ghiChuVv;
	}

	@Column(name = "DV_CSGT_ID_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDvCsgtIdVv() {
		return this.dvCsgtIdVv;
	}

	public void setDvCsgtIdVv(Long dvCsgtIdVv) {
		this.dvCsgtIdVv = dvCsgtIdVv;
	}

	@Column(name = "ID_BB43", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdBb43() {
		return this.idBb43;
	}

	public void setIdBb43(Long idBb43) {
		this.idBb43 = idBb43;
	}

	@Column(name = "SO_BIEN_BAN", columnDefinition = "VARCHAR2", length = 50)
	public String getSoBienBan() {
		return this.soBienBan;
	}

	public void setSoBienBan(String soBienBan) {
		this.soBienBan = soBienBan;
	}

	@Column(name = "TEN_CUC_CSGT", columnDefinition = "VARCHAR2", length = 150)
	public String getTenCucCsgt() {
		return this.tenCucCsgt;
	}

	public void setTenCucCsgt(String tenCucCsgt) {
		this.tenCucCsgt = tenCucCsgt;
	}

	@Column(name = "CAN_CU", columnDefinition = "VARCHAR2", length = 500)
	public String getCanCu() {
		return this.canCu;
	}

	public void setCanCu(String canCu) {
		this.canCu = canCu;
	}

	@Column(name = "DIA_DIEM_VPHC", columnDefinition = "VARCHAR2", length = 500)
	public String getDiaDiemVphc() {
		return this.diaDiemVphc;
	}

	public void setDiaDiemVphc(String diaDiemVphc) {
		this.diaDiemVphc = diaDiemVphc;
	}

	@Column(name = "TEN_CAN_BO", columnDefinition = "VARCHAR2", length = 100)
	public String getTenCanBo() {
		return this.tenCanBo;
	}

	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}

	@Column(name = "THOI_GIAN_VPHC", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiGianVphc() {
		return this.thoiGianVphc;
	}

	public void setThoiGianVphc(String thoiGianVphc) {
		this.thoiGianVphc = thoiGianVphc;
	}

	@Column(name = "NGAY_THANG_VPHC", columnDefinition = "DATE", length = 7)
	public Date getNgayThangVphc() {
		return this.ngayThangVphc;
	}

	public void setNgayThangVphc(Date ngayThangVphc) {
		this.ngayThangVphc = ngayThangVphc;
	}

	@Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 60)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Column(name = "DON_VI_CSGT", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViCsgt() {
		return this.donViCsgt;
	}

	public void setDonViCsgt(String donViCsgt) {
		this.donViCsgt = donViCsgt;
	}

	@Column(name = "TEN_NC1", columnDefinition = "VARCHAR2", length = 100)
	public String getTenNc1() {
		return this.tenNc1;
	}

	public void setTenNc1(String tenNc1) {
		this.tenNc1 = tenNc1;
	}

	@Column(name = "NGHE_NGHIEP_NC1", columnDefinition = "VARCHAR2", length = 100)
	public String getNgheNghiepNc1() {
		return this.ngheNghiepNc1;
	}

	public void setNgheNghiepNc1(String ngheNghiepNc1) {
		this.ngheNghiepNc1 = ngheNghiepNc1;
	}

	@Column(name = "SO_CMND_NC1", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNc1() {
		return this.soCmndNc1;
	}

	public void setSoCmndNc1(String soCmndNc1) {
		this.soCmndNc1 = soCmndNc1;
	}

	@Column(name = "DIA_CHI_NC1", columnDefinition = "VARCHAR2", length = 150)
	public String getDiaChiNc1() {
		return this.diaChiNc1;
	}

	public void setDiaChiNc1(String diaChiNc1) {
		this.diaChiNc1 = diaChiNc1;
	}

	@Column(name = "SDT_NC1", columnDefinition = "VARCHAR2", length = 20)
	public String getSdtNc1() {
		return this.sdtNc1;
	}

	public void setSdtNc1(String sdtNc1) {
		this.sdtNc1 = sdtNc1;
	}

	@Column(name = "TEN_NC2", columnDefinition = "VARCHAR2", length = 100)
	public String getTenNc2() {
		return this.tenNc2;
	}

	public void setTenNc2(String tenNc2) {
		this.tenNc2 = tenNc2;
	}

	@Column(name = "NGHE_NGHIEP_NC2", columnDefinition = "VARCHAR2", length = 100)
	public String getNgheNghiepNc2() {
		return this.ngheNghiepNc2;
	}

	public void setNgheNghiepNc2(String ngheNghiepNc2) {
		this.ngheNghiepNc2 = ngheNghiepNc2;
	}

	@Column(name = "SO_CMND_NC2", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNc2() {
		return this.soCmndNc2;
	}

	public void setSoCmndNc2(String soCmndNc2) {
		this.soCmndNc2 = soCmndNc2;
	}

	@Column(name = "DIA_CHI_NC2", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaChiNc2() {
		return this.diaChiNc2;
	}

	public void setDiaChiNc2(String diaChiNc2) {
		this.diaChiNc2 = diaChiNc2;
	}

	@Column(name = "SDT_NC2", columnDefinition = "VARCHAR2", length = 20)
	public String getSdtNc2() {
		return this.sdtNc2;
	}

	public void setSdtNc2(String sdtNc2) {
		this.sdtNc2 = sdtNc2;
	}

	@Column(name = "TEN_NVP", columnDefinition = "VARCHAR2", length = 300)
	public String getTenNvp() {
		return this.tenNvp;
	}

	public void setTenNvp(String tenNvp) {
		this.tenNvp = tenNvp;
	}

	@Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)
	public Date getNgaySinhNvp() {
		return this.ngaySinhNvp;
	}

	public void setNgaySinhNvp(Date ngaySinhNvp) {
		this.ngaySinhNvp = ngaySinhNvp;
	}

	@Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 30)
	public String getQuocTichNvp() {
		return this.quocTichNvp;
	}

	public void setQuocTichNvp(String quocTichNvp) {
		this.quocTichNvp = quocTichNvp;
	}

	@Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 100)
	public String getNgheNghiepNvp() {
		return this.ngheNghiepNvp;
	}

	public void setNgheNghiepNvp(String ngheNghiepNvp) {
		this.ngheNghiepNvp = ngheNghiepNvp;
	}

	@Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 100)
	public String getDiaChiNvp() {
		return this.diaChiNvp;
	}

	public void setDiaChiNvp(String diaChiNvp) {
		this.diaChiNvp = diaChiNvp;
	}

	@Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndNvp() {
		return this.soCmndNvp;
	}

	public void setSoCmndNvp(String soCmndNvp) {
		this.soCmndNvp = soCmndNvp;
	}

	@Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmndNvp() {
		return this.ngayCapCmndNvp;
	}

	public void setNgayCapCmndNvp(Date ngayCapCmndNvp) {
		this.ngayCapCmndNvp = ngayCapCmndNvp;
	}

	@Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)
	public String getNoiCapCmndNvp() {
		return this.noiCapCmndNvp;
	}

	public void setNoiCapCmndNvp(String noiCapCmndNvp) {
		this.noiCapCmndNvp = noiCapCmndNvp;
	}

	@Column(name = "NOI_DUNG_VPHC", columnDefinition = "VARCHAR2", length = 2000)
	public String getNoiDungVphc() {
		return this.noiDungVphc;
	}

	public void setNoiDungVphc(String noiDungVphc) {
		this.noiDungVphc = noiDungVphc;
	}

	@Column(name = "Y_KIEN_NVP", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienNvp() {
		return this.YKienNvp;
	}

	public void setYKienNvp(String YKienNvp) {
		this.YKienNvp = YKienNvp;
	}

	@Column(name = "Y_KIEN_NBH", columnDefinition = "VARCHAR2", length = 200)
	public String getYKienNbh() {
		return this.YKienNbh;
	}

	public void setYKienNbh(String YKienNbh) {
		this.YKienNbh = YKienNbh;
	}

	@Column(name = "TANG_VAT_TG", columnDefinition = "VARCHAR2", length = 1000)
	public String getTangVatTg() {
		return this.tangVatTg;
	}

	public void setTangVatTg(String tangVatTg) {
		this.tangVatTg = tangVatTg;
	}

	@Column(name = "THOI_GIAN_GQVP", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiGianGqvp() {
		return this.thoiGianGqvp;
	}

	public void setThoiGianGqvp(String thoiGianGqvp) {
		this.thoiGianGqvp = thoiGianGqvp;
	}

	@Column(name = "NGAY_GQVP", columnDefinition = "DATE", length = 7)
	public Date getNgayGqvp() {
		return this.ngayGqvp;
	}

	public void setNgayGqvp(Date ngayGqvp) {
		this.ngayGqvp = ngayGqvp;
	}

	@Column(name = "DIA_DIEM_GQVP", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaDiemGqvp() {
		return this.diaDiemGqvp;
	}

	public void setDiaDiemGqvp(String diaDiemGqvp) {
		this.diaDiemGqvp = diaDiemGqvp;
	}

	@Column(name = "THOI_HAN_GQVP", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiHanGqvp() {
		return this.thoiHanGqvp;
	}

	public void setThoiHanGqvp(String thoiHanGqvp) {
		this.thoiHanGqvp = thoiHanGqvp;
	}

	@Column(name = "SO_TRANG_BB", columnDefinition = "VARCHAR2", length = 5)
	public String getSoTrangBb() {
		return this.soTrangBb;
	}

	public void setSoTrangBb(String soTrangBb) {
		this.soTrangBb = soTrangBb;
	}

	@Column(name = "SO_BAN_BB", columnDefinition = "VARCHAR2", length = 5)
	public String getSoBanBb() {
		return this.soBanBb;
	}

	public void setSoBanBb(String soBanBb) {
		this.soBanBb = soBanBb;
	}

	@Column(name = "LY_DO_KO_KY_BB", columnDefinition = "VARCHAR2", length = 100)
	public String getLyDoKoKyBb() {
		return this.lyDoKoKyBb;
	}

	public void setLyDoKoKyBb(String lyDoKoKyBb) {
		this.lyDoKoKyBb = lyDoKoKyBb;
	}

	@Column(name = "QD_XPHC", columnDefinition = "VARCHAR2", length = 2)
	public String getQdXphc() {
		return this.qdXphc;
	}

	public void setQdXphc(String qdXphc) {
		this.qdXphc = qdXphc;
	}

	@Column(name = "QD_TGTGTV", columnDefinition = "VARCHAR2", length = 2)
	public String getQdTgtgtv() {
		return this.qdTgtgtv;
	}

	public void setQdTgtgtv(String qdTgtgtv) {
		this.qdTgtgtv = qdTgtgtv;
	}

	@Column(name = "BIEN_PHAP_NGAN_CHAN_VPHC", columnDefinition = "VARCHAR2", length = 500)
	public String getBienPhapNganChanVphc() {
		return this.bienPhapNganChanVphc;
	}

	public void setBienPhapNganChanVphc(String bienPhapNganChanVphc) {
		this.bienPhapNganChanVphc = bienPhapNganChanVphc;
	}

	@Column(name = "THOI_GIAN_BB_LAP", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiGianBbLap() {
		return this.thoiGianBbLap;
	}

	public void setThoiGianBbLap(String thoiGianBbLap) {
		this.thoiGianBbLap = thoiGianBbLap;
	}

	@Column(name = "NGAY_BB_LAP", columnDefinition = "DATE", length = 7)
	public Date getNgayBbLap() {
		return this.ngayBbLap;
	}

	public void setNgayBbLap(Date ngayBbLap) {
		this.ngayBbLap = ngayBbLap;
	}

	@Column(name = "CAN_BO_TIEP_NHAN_GT", columnDefinition = "VARCHAR2", length = 100)
	public String getCanBoTiepNhanGt() {
		return this.canBoTiepNhanGt;
	}

	public void setCanBoTiepNhanGt(String canBoTiepNhanGt) {
		this.canBoTiepNhanGt = canBoTiepNhanGt;
	}

	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 50)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 50)
	public String getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNguoiSuaId() {
		return this.nguoiSuaId;
	}

	public void setNguoiSuaId(Long nguoiSuaId) {
		this.nguoiSuaId = nguoiSuaId;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "DON_VI_CSGT_CAP_TREN", columnDefinition = "VARCHAR2", length = 100)
	public String getDonViCsgtCapTren() {
		return this.donViCsgtCapTren;
	}

	public void setDonViCsgtCapTren(String donViCsgtCapTren) {
		this.donViCsgtCapTren = donViCsgtCapTren;
	}

	@Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 50)
	public String getLoaiPhuongTien() {
		return this.loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	@Column(name = "LOAI_PHUONG_TIEN_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLoaiPhuongTienId() {
		return this.loaiPhuongTienId;
	}

	public void setLoaiPhuongTienId(Long loaiPhuongTienId) {
		this.loaiPhuongTienId = loaiPhuongTienId;
	}

	@Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 50)
	public String getBienKiemSoat() {
		return this.bienKiemSoat;
	}

	public void setBienKiemSoat(String bienKiemSoat) {
		this.bienKiemSoat = bienKiemSoat;
	}

	@Column(name = "SO_QDXPHC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQdxphc() {
		return this.soQdxphc;
	}

	public void setSoQdxphc(Long soQdxphc) {
		this.soQdxphc = soQdxphc;
	}

	@Column(name = "SO_QDTGTV", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQdtgtv() {
		return this.soQdtgtv;
	}

	public void setSoQdtgtv(Long soQdtgtv) {
		this.soQdtgtv = soQdtgtv;
	}

	@Column(name = "SO_BBTGTV", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBbtgtv() {
		return this.soBbtgtv;
	}

	public void setSoBbtgtv(Long soBbtgtv) {
		this.soBbtgtv = soBbtgtv;
	}

	@Column(name = "SO_QDTLTV", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoQdtltv() {
		return this.soQdtltv;
	}

	public void setSoQdtltv(Long soQdtltv) {
		this.soQdtltv = soQdtltv;
	}

	@Column(name = "SO_BBTLTV", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBbtltv() {
		return this.soBbtltv;
	}

	public void setSoBbtltv(Long soBbtltv) {
		this.soBbtltv = soBbtltv;
	}

	@Column(name = "ID_THEO_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdTheoNam() {
		return this.idTheoNam;
	}

	public void setIdTheoNam(Long idTheoNam) {
		this.idTheoNam = idTheoNam;
	}

	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Column(name = "NAM_LAP_BB", columnDefinition = "VARCHAR2", length = 100)
	public String getNamLapBb() {
		return this.namLapBb;
	}

	public void setNamLapBb(String namLapBb) {
		this.namLapBb = namLapBb;
	}

	@Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapBb() {
		return this.nhapBb;
	}

	public void setNhapBb(Long nhapBb) {
		this.nhapBb = nhapBb;
	}

	@Column(name = "TRANG_THAI_BB", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiBb() {
		return this.trangThaiBb;
	}

	public void setTrangThaiBb(Long trangThaiBb) {
		this.trangThaiBb = trangThaiBb;
	}

	@Column(name = "CAN_BO_XU_LY_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoXuLyId() {
		return this.canBoXuLyId;
	}

	public void setCanBoXuLyId(Long canBoXuLyId) {
		this.canBoXuLyId = canBoXuLyId;
	}

	@Column(name = "CAN_BO_TRA_LAI_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoTraLaiId() {
		return this.canBoTraLaiId;
	}

	public void setCanBoTraLaiId(Long canBoTraLaiId) {
		this.canBoTraLaiId = canBoTraLaiId;
	}

	@Column(name = "NGAY_TRA_LAI", columnDefinition = "DATE", length = 7)
	public Date getNgayTraLai() {
		return this.ngayTraLai;
	}

	public void setNgayTraLai(Date ngayTraLai) {
		this.ngayTraLai = ngayTraLai;
	}

	@Column(name = "NAM_TAO_BB", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamTaoBb() {
		return this.namTaoBb;
	}

	public void setNamTaoBb(Long namTaoBb) {
		this.namTaoBb = namTaoBb;
	}

	@Column(name = "TO_CHUC", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getToChuc() {
		return this.toChuc;
	}

	public void setToChuc(Long toChuc) {
		this.toChuc = toChuc;
	}

	@Column(name = "QUOC_TICH_NVP_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getQuocTichNvpId() {
		return this.quocTichNvpId;
	}

	public void setQuocTichNvpId(Long quocTichNvpId) {
		this.quocTichNvpId = quocTichNvpId;
	}

	@Column(name = "NGHE_NGHIEP_NVP_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getNgheNghiepNvpId() {
		return this.ngheNghiepNvpId;
	}

	public void setNgheNghiepNvpId(Long ngheNghiepNvpId) {
		this.ngheNghiepNvpId = ngheNghiepNvpId;
	}

	@Column(name = "SO_DIEN_THOAI_NVP", columnDefinition = "VARCHAR2", length = 20)
	public String getSoDienThoaiNvp() {
		return this.soDienThoaiNvp;
	}

	public void setSoDienThoaiNvp(String soDienThoaiNvp) {
		this.soDienThoaiNvp = soDienThoaiNvp;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "QUYEN_SO", columnDefinition = "VARCHAR2", length = 30)
	public String getQuyenSo() {
		return this.quyenSo;
	}

	public void setQuyenSo(String quyenSo) {
		this.quyenSo = quyenSo;
	}

	@Column(name = "TEN_NVP_DVC", columnDefinition = "VARCHAR2", length = 300)
	public String getTenNvpDvc() {
		return this.tenNvpDvc;
	}

	public void setTenNvpDvc(String tenNvpDvc) {
		this.tenNvpDvc = tenNvpDvc;
	}

	@Column(name = "TEN_CAN_BO_NHAP", columnDefinition = "VARCHAR2", length = 100)
	public String getTenCanBoNhap() {
		return this.tenCanBoNhap;
	}

	public void setTenCanBoNhap(String tenCanBoNhap) {
		this.tenCanBoNhap = tenCanBoNhap;
	}

	@Column(name = "CAP_BAC_NHAP", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getCapBacNhap() {
		return this.capBacNhap;
	}

	public void setCapBacNhap(Long capBacNhap) {
		this.capBacNhap = capBacNhap;
	}

	@Column(name = "CHUC_VU_NHAP", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getChucVuNhap() {
		return this.chucVuNhap;
	}

	public void setChucVuNhap(Long chucVuNhap) {
		this.chucVuNhap = chucVuNhap;
	}

	@Column(name = "GPLX", columnDefinition = "VARCHAR2", length = 50)
	public String getGplx() {
		return this.gplx;
	}

	public void setGplx(String gplx) {
		this.gplx = gplx;
	}

	@Column(name = "KIEM_DINH", columnDefinition = "VARCHAR2", length = 50)
	public String getKiemDinh() {
		return this.kiemDinh;
	}

	public void setKiemDinh(String kiemDinh) {
		this.kiemDinh = kiemDinh;
	}

	@Column(name = "TINH_THANH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTinhThanhId() {
		return this.tinhThanhId;
	}

	public void setTinhThanhId(Long tinhThanhId) {
		this.tinhThanhId = tinhThanhId;
	}

	@Column(name = "HANG_GPLX", columnDefinition = "VARCHAR2", length = 20)
	public String getHangGplx() {
		return this.hangGplx;
	}

	public void setHangGplx(String hangGplx) {
		this.hangGplx = hangGplx;
	}

	@Column(name = "MA_DON_VI", columnDefinition = "VARCHAR2", length = 50)
	public String getMaDonVi() {
		return this.maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}

	@Column(name = "MA_TINH_THANH", columnDefinition = "VARCHAR2", length = 50)
	public String getMaTinhThanh() {
		return this.maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}

	@Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)
	public String getNgaySinhNvpNhap() {
		return this.ngaySinhNvpNhap;
	}

	public void setNgaySinhNvpNhap(String ngaySinhNvpNhap) {
		this.ngaySinhNvpNhap = ngaySinhNvpNhap;
	}

	@Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 5, scale = 0)
	public Long getCapDonVi() {
		return this.capDonVi;
	}

	public void setCapDonVi(Long capDonVi) {
		this.capDonVi = capDonVi;
	}

	@Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getLinhVucGiaoThong() {
		return this.linhVucGiaoThong;
	}

	public void setLinhVucGiaoThong(Long linhVucGiaoThong) {
		this.linhVucGiaoThong = linhVucGiaoThong;
	}

	@Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)
	public String getMaVuViec() {
		return this.maVuViec;
	}

	public void setMaVuViec(String maVuViec) {
		this.maVuViec = maVuViec;
	}

	@Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)
	public String getMaThongTu() {
		return this.maThongTu;
	}

	public void setMaThongTu(String maThongTu) {
		this.maThongTu = maThongTu;
	}

	@Column(name = "NGAY_LAP_BB", columnDefinition = "VARCHAR2", length = 80)
	public String getNgayLapBb() {
		return this.ngayLapBb;
	}

	public void setNgayLapBb(String ngayLapBb) {
		this.ngayLapBb = ngayLapBb;
	}

	@Column(name = "THOI_GIAN_LAP_BB", columnDefinition = "VARCHAR2", length = 80)
	public String getThoiGianLapBb() {
		return this.thoiGianLapBb;
	}

	public void setThoiGianLapBb(String thoiGianLapBb) {
		this.thoiGianLapBb = thoiGianLapBb;
	}

	@Column(name = "MA_SO_DN", columnDefinition = "VARCHAR2", length = 80)
	public String getMaSoDn() {
		return this.maSoDn;
	}

	public void setMaSoDn(String maSoDn) {
		this.maSoDn = maSoDn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewVuviecBb43Id))
			return false;
		ViewVuviecBb43Id castOther = (ViewVuviecBb43Id) other;

		return ((this.getIdVuviec() == castOther.getIdVuviec()) || (this.getIdVuviec() != null
				&& castOther.getIdVuviec() != null && this.getIdVuviec().equals(castOther.getIdVuviec())))
				&& ((this.getUuid() == castOther.getUuid()) || (this.getUuid() != null && castOther.getUuid() != null
						&& this.getUuid().equals(castOther.getUuid())))
				&& ((this.getLoaiBbQd() == castOther.getLoaiBbQd()) || (this.getLoaiBbQd() != null
						&& castOther.getLoaiBbQd() != null && this.getLoaiBbQd().equals(castOther.getLoaiBbQd())))
				&& ((this.getBbQdId() == castOther.getBbQdId()) || (this.getBbQdId() != null
						&& castOther.getBbQdId() != null && this.getBbQdId().equals(castOther.getBbQdId())))
				&& ((this.getMaTheoTt() == castOther.getMaTheoTt()) || (this.getMaTheoTt() != null
						&& castOther.getMaTheoTt() != null && this.getMaTheoTt().equals(castOther.getMaTheoTt())))
				&& ((this.getMaRutgon() == castOther.getMaRutgon()) || (this.getMaRutgon() != null
						&& castOther.getMaRutgon() != null && this.getMaRutgon().equals(castOther.getMaRutgon())))
				&& ((this.getMaVuViecVv() == castOther.getMaVuViecVv()) || (this.getMaVuViecVv() != null
						&& castOther.getMaVuViecVv() != null && this.getMaVuViecVv().equals(castOther.getMaVuViecVv())))
				&& ((this.getLoaiPtIdVv() == castOther.getLoaiPtIdVv()) || (this.getLoaiPtIdVv() != null
						&& castOther.getLoaiPtIdVv() != null && this.getLoaiPtIdVv().equals(castOther.getLoaiPtIdVv())))
				&& ((this.getBienKsVv() == castOther.getBienKsVv()) || (this.getBienKsVv() != null
						&& castOther.getBienKsVv() != null && this.getBienKsVv().equals(castOther.getBienKsVv())))
				&& ((this.getTenNvpVv() == castOther.getTenNvpVv()) || (this.getTenNvpVv() != null
						&& castOther.getTenNvpVv() != null && this.getTenNvpVv().equals(castOther.getTenNvpVv())))
				&& ((this.getNguoiTaoVv() == castOther.getNguoiTaoVv()) || (this.getNguoiTaoVv() != null
						&& castOther.getNguoiTaoVv() != null && this.getNguoiTaoVv().equals(castOther.getNguoiTaoVv())))
				&& ((this.getNgayTaoVv() == castOther.getNgayTaoVv()) || (this.getNgayTaoVv() != null
						&& castOther.getNgayTaoVv() != null && this.getNgayTaoVv().equals(castOther.getNgayTaoVv())))
				&& ((this.getNguoiSuaVv() == castOther.getNguoiSuaVv()) || (this.getNguoiSuaVv() != null
						&& castOther.getNguoiSuaVv() != null && this.getNguoiSuaVv().equals(castOther.getNguoiSuaVv())))
				&& ((this.getNgaySuaVv() == castOther.getNgaySuaVv()) || (this.getNgaySuaVv() != null
						&& castOther.getNgaySuaVv() != null && this.getNgaySuaVv().equals(castOther.getNgaySuaVv())))
				&& ((this.getTrangThaiVv() == castOther.getTrangThaiVv())
						|| (this.getTrangThaiVv() != null && castOther.getTrangThaiVv() != null
								&& this.getTrangThaiVv().equals(castOther.getTrangThaiVv())))
				&& ((this.getGhiChuVv() == castOther.getGhiChuVv()) || (this.getGhiChuVv() != null
						&& castOther.getGhiChuVv() != null && this.getGhiChuVv().equals(castOther.getGhiChuVv())))
				&& ((this.getDvCsgtIdVv() == castOther.getDvCsgtIdVv()) || (this.getDvCsgtIdVv() != null
						&& castOther.getDvCsgtIdVv() != null && this.getDvCsgtIdVv().equals(castOther.getDvCsgtIdVv())))
				&& ((this.getIdBb43() == castOther.getIdBb43()) || (this.getIdBb43() != null
						&& castOther.getIdBb43() != null && this.getIdBb43().equals(castOther.getIdBb43())))
				&& ((this.getSoBienBan() == castOther.getSoBienBan()) || (this.getSoBienBan() != null
						&& castOther.getSoBienBan() != null && this.getSoBienBan().equals(castOther.getSoBienBan())))
				&& ((this.getTenCucCsgt() == castOther.getTenCucCsgt()) || (this.getTenCucCsgt() != null
						&& castOther.getTenCucCsgt() != null && this.getTenCucCsgt().equals(castOther.getTenCucCsgt())))
				&& ((this.getCanCu() == castOther.getCanCu()) || (this.getCanCu() != null
						&& castOther.getCanCu() != null && this.getCanCu().equals(castOther.getCanCu())))
				&& ((this.getDiaDiemVphc() == castOther.getDiaDiemVphc())
						|| (this.getDiaDiemVphc() != null && castOther.getDiaDiemVphc() != null
								&& this.getDiaDiemVphc().equals(castOther.getDiaDiemVphc())))
				&& ((this.getTenCanBo() == castOther.getTenCanBo()) || (this.getTenCanBo() != null
						&& castOther.getTenCanBo() != null && this.getTenCanBo().equals(castOther.getTenCanBo())))
				&& ((this.getThoiGianVphc() == castOther.getThoiGianVphc())
						|| (this.getThoiGianVphc() != null && castOther.getThoiGianVphc() != null
								&& this.getThoiGianVphc().equals(castOther.getThoiGianVphc())))
				&& ((this.getNgayThangVphc() == castOther.getNgayThangVphc())
						|| (this.getNgayThangVphc() != null && castOther.getNgayThangVphc() != null
								&& this.getNgayThangVphc().equals(castOther.getNgayThangVphc())))
				&& ((this.getChucVu() == castOther.getChucVu()) || (this.getChucVu() != null
						&& castOther.getChucVu() != null && this.getChucVu().equals(castOther.getChucVu())))
				&& ((this.getDonViCsgt() == castOther.getDonViCsgt()) || (this.getDonViCsgt() != null
						&& castOther.getDonViCsgt() != null && this.getDonViCsgt().equals(castOther.getDonViCsgt())))
				&& ((this.getTenNc1() == castOther.getTenNc1()) || (this.getTenNc1() != null
						&& castOther.getTenNc1() != null && this.getTenNc1().equals(castOther.getTenNc1())))
				&& ((this.getNgheNghiepNc1() == castOther.getNgheNghiepNc1())
						|| (this.getNgheNghiepNc1() != null && castOther.getNgheNghiepNc1() != null
								&& this.getNgheNghiepNc1().equals(castOther.getNgheNghiepNc1())))
				&& ((this.getSoCmndNc1() == castOther.getSoCmndNc1()) || (this.getSoCmndNc1() != null
						&& castOther.getSoCmndNc1() != null && this.getSoCmndNc1().equals(castOther.getSoCmndNc1())))
				&& ((this.getDiaChiNc1() == castOther.getDiaChiNc1()) || (this.getDiaChiNc1() != null
						&& castOther.getDiaChiNc1() != null && this.getDiaChiNc1().equals(castOther.getDiaChiNc1())))
				&& ((this.getSdtNc1() == castOther.getSdtNc1()) || (this.getSdtNc1() != null
						&& castOther.getSdtNc1() != null && this.getSdtNc1().equals(castOther.getSdtNc1())))
				&& ((this.getTenNc2() == castOther.getTenNc2()) || (this.getTenNc2() != null
						&& castOther.getTenNc2() != null && this.getTenNc2().equals(castOther.getTenNc2())))
				&& ((this.getNgheNghiepNc2() == castOther.getNgheNghiepNc2())
						|| (this.getNgheNghiepNc2() != null && castOther.getNgheNghiepNc2() != null
								&& this.getNgheNghiepNc2().equals(castOther.getNgheNghiepNc2())))
				&& ((this.getSoCmndNc2() == castOther.getSoCmndNc2()) || (this.getSoCmndNc2() != null
						&& castOther.getSoCmndNc2() != null && this.getSoCmndNc2().equals(castOther.getSoCmndNc2())))
				&& ((this.getDiaChiNc2() == castOther.getDiaChiNc2()) || (this.getDiaChiNc2() != null
						&& castOther.getDiaChiNc2() != null && this.getDiaChiNc2().equals(castOther.getDiaChiNc2())))
				&& ((this.getSdtNc2() == castOther.getSdtNc2()) || (this.getSdtNc2() != null
						&& castOther.getSdtNc2() != null && this.getSdtNc2().equals(castOther.getSdtNc2())))
				&& ((this.getTenNvp() == castOther.getTenNvp()) || (this.getTenNvp() != null
						&& castOther.getTenNvp() != null && this.getTenNvp().equals(castOther.getTenNvp())))
				&& ((this.getNgaySinhNvp() == castOther.getNgaySinhNvp())
						|| (this.getNgaySinhNvp() != null && castOther.getNgaySinhNvp() != null
								&& this.getNgaySinhNvp().equals(castOther.getNgaySinhNvp())))
				&& ((this.getQuocTichNvp() == castOther.getQuocTichNvp())
						|| (this.getQuocTichNvp() != null && castOther.getQuocTichNvp() != null
								&& this.getQuocTichNvp().equals(castOther.getQuocTichNvp())))
				&& ((this.getNgheNghiepNvp() == castOther.getNgheNghiepNvp())
						|| (this.getNgheNghiepNvp() != null && castOther.getNgheNghiepNvp() != null
								&& this.getNgheNghiepNvp().equals(castOther.getNgheNghiepNvp())))
				&& ((this.getDiaChiNvp() == castOther.getDiaChiNvp()) || (this.getDiaChiNvp() != null
						&& castOther.getDiaChiNvp() != null && this.getDiaChiNvp().equals(castOther.getDiaChiNvp())))
				&& ((this.getSoCmndNvp() == castOther.getSoCmndNvp()) || (this.getSoCmndNvp() != null
						&& castOther.getSoCmndNvp() != null && this.getSoCmndNvp().equals(castOther.getSoCmndNvp())))
				&& ((this.getNgayCapCmndNvp() == castOther.getNgayCapCmndNvp())
						|| (this.getNgayCapCmndNvp() != null && castOther.getNgayCapCmndNvp() != null
								&& this.getNgayCapCmndNvp().equals(castOther.getNgayCapCmndNvp())))
				&& ((this.getNoiCapCmndNvp() == castOther.getNoiCapCmndNvp())
						|| (this.getNoiCapCmndNvp() != null && castOther.getNoiCapCmndNvp() != null
								&& this.getNoiCapCmndNvp().equals(castOther.getNoiCapCmndNvp())))
				&& ((this.getNoiDungVphc() == castOther.getNoiDungVphc())
						|| (this.getNoiDungVphc() != null && castOther.getNoiDungVphc() != null
								&& this.getNoiDungVphc().equals(castOther.getNoiDungVphc())))
				&& ((this.getYKienNvp() == castOther.getYKienNvp()) || (this.getYKienNvp() != null
						&& castOther.getYKienNvp() != null && this.getYKienNvp().equals(castOther.getYKienNvp())))
				&& ((this.getYKienNbh() == castOther.getYKienNbh()) || (this.getYKienNbh() != null
						&& castOther.getYKienNbh() != null && this.getYKienNbh().equals(castOther.getYKienNbh())))
				&& ((this.getTangVatTg() == castOther.getTangVatTg()) || (this.getTangVatTg() != null
						&& castOther.getTangVatTg() != null && this.getTangVatTg().equals(castOther.getTangVatTg())))
				&& ((this.getThoiGianGqvp() == castOther.getThoiGianGqvp())
						|| (this.getThoiGianGqvp() != null && castOther.getThoiGianGqvp() != null
								&& this.getThoiGianGqvp().equals(castOther.getThoiGianGqvp())))
				&& ((this.getNgayGqvp() == castOther.getNgayGqvp()) || (this.getNgayGqvp() != null
						&& castOther.getNgayGqvp() != null && this.getNgayGqvp().equals(castOther.getNgayGqvp())))
				&& ((this.getDiaDiemGqvp() == castOther.getDiaDiemGqvp())
						|| (this.getDiaDiemGqvp() != null && castOther.getDiaDiemGqvp() != null
								&& this.getDiaDiemGqvp().equals(castOther.getDiaDiemGqvp())))
				&& ((this.getThoiHanGqvp() == castOther.getThoiHanGqvp())
						|| (this.getThoiHanGqvp() != null && castOther.getThoiHanGqvp() != null
								&& this.getThoiHanGqvp().equals(castOther.getThoiHanGqvp())))
				&& ((this.getSoTrangBb() == castOther.getSoTrangBb()) || (this.getSoTrangBb() != null
						&& castOther.getSoTrangBb() != null && this.getSoTrangBb().equals(castOther.getSoTrangBb())))
				&& ((this.getSoBanBb() == castOther.getSoBanBb()) || (this.getSoBanBb() != null
						&& castOther.getSoBanBb() != null && this.getSoBanBb().equals(castOther.getSoBanBb())))
				&& ((this.getLyDoKoKyBb() == castOther.getLyDoKoKyBb()) || (this.getLyDoKoKyBb() != null
						&& castOther.getLyDoKoKyBb() != null && this.getLyDoKoKyBb().equals(castOther.getLyDoKoKyBb())))
				&& ((this.getQdXphc() == castOther.getQdXphc()) || (this.getQdXphc() != null
						&& castOther.getQdXphc() != null && this.getQdXphc().equals(castOther.getQdXphc())))
				&& ((this.getQdTgtgtv() == castOther.getQdTgtgtv()) || (this.getQdTgtgtv() != null
						&& castOther.getQdTgtgtv() != null && this.getQdTgtgtv().equals(castOther.getQdTgtgtv())))
				&& ((this.getBienPhapNganChanVphc() == castOther.getBienPhapNganChanVphc())
						|| (this.getBienPhapNganChanVphc() != null && castOther.getBienPhapNganChanVphc() != null
								&& this.getBienPhapNganChanVphc().equals(castOther.getBienPhapNganChanVphc())))
				&& ((this.getThoiGianBbLap() == castOther.getThoiGianBbLap())
						|| (this.getThoiGianBbLap() != null && castOther.getThoiGianBbLap() != null
								&& this.getThoiGianBbLap().equals(castOther.getThoiGianBbLap())))
				&& ((this.getNgayBbLap() == castOther.getNgayBbLap()) || (this.getNgayBbLap() != null
						&& castOther.getNgayBbLap() != null && this.getNgayBbLap().equals(castOther.getNgayBbLap())))
				&& ((this.getCanBoTiepNhanGt() == castOther.getCanBoTiepNhanGt())
						|| (this.getCanBoTiepNhanGt() != null && castOther.getCanBoTiepNhanGt() != null
								&& this.getCanBoTiepNhanGt().equals(castOther.getCanBoTiepNhanGt())))
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())))
				&& ((this.getNguoiTaoId() == castOther.getNguoiTaoId()) || (this.getNguoiTaoId() != null
						&& castOther.getNguoiTaoId() != null && this.getNguoiTaoId().equals(castOther.getNguoiTaoId())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNguoiSuaId() == castOther.getNguoiSuaId()) || (this.getNguoiSuaId() != null
						&& castOther.getNguoiSuaId() != null && this.getNguoiSuaId().equals(castOther.getNguoiSuaId())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getDonViCsgtCapTren() == castOther.getDonViCsgtCapTren())
						|| (this.getDonViCsgtCapTren() != null && castOther.getDonViCsgtCapTren() != null
								&& this.getDonViCsgtCapTren().equals(castOther.getDonViCsgtCapTren())))
				&& ((this.getLoaiPhuongTien() == castOther.getLoaiPhuongTien())
						|| (this.getLoaiPhuongTien() != null && castOther.getLoaiPhuongTien() != null
								&& this.getLoaiPhuongTien().equals(castOther.getLoaiPhuongTien())))
				&& ((this.getLoaiPhuongTienId() == castOther.getLoaiPhuongTienId())
						|| (this.getLoaiPhuongTienId() != null && castOther.getLoaiPhuongTienId() != null
								&& this.getLoaiPhuongTienId().equals(castOther.getLoaiPhuongTienId())))
				&& ((this.getBienKiemSoat() == castOther.getBienKiemSoat())
						|| (this.getBienKiemSoat() != null && castOther.getBienKiemSoat() != null
								&& this.getBienKiemSoat().equals(castOther.getBienKiemSoat())))
				&& ((this.getSoQdxphc() == castOther.getSoQdxphc()) || (this.getSoQdxphc() != null
						&& castOther.getSoQdxphc() != null && this.getSoQdxphc().equals(castOther.getSoQdxphc())))
				&& ((this.getSoQdtgtv() == castOther.getSoQdtgtv()) || (this.getSoQdtgtv() != null
						&& castOther.getSoQdtgtv() != null && this.getSoQdtgtv().equals(castOther.getSoQdtgtv())))
				&& ((this.getSoBbtgtv() == castOther.getSoBbtgtv()) || (this.getSoBbtgtv() != null
						&& castOther.getSoBbtgtv() != null && this.getSoBbtgtv().equals(castOther.getSoBbtgtv())))
				&& ((this.getSoQdtltv() == castOther.getSoQdtltv()) || (this.getSoQdtltv() != null
						&& castOther.getSoQdtltv() != null && this.getSoQdtltv().equals(castOther.getSoQdtltv())))
				&& ((this.getSoBbtltv() == castOther.getSoBbtltv()) || (this.getSoBbtltv() != null
						&& castOther.getSoBbtltv() != null && this.getSoBbtltv().equals(castOther.getSoBbtltv())))
				&& ((this.getIdTheoNam() == castOther.getIdTheoNam()) || (this.getIdTheoNam() != null
						&& castOther.getIdTheoNam() != null && this.getIdTheoNam().equals(castOther.getIdTheoNam())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getNamLapBb() == castOther.getNamLapBb()) || (this.getNamLapBb() != null
						&& castOther.getNamLapBb() != null && this.getNamLapBb().equals(castOther.getNamLapBb())))
				&& ((this.getNhapBb() == castOther.getNhapBb()) || (this.getNhapBb() != null
						&& castOther.getNhapBb() != null && this.getNhapBb().equals(castOther.getNhapBb())))
				&& ((this.getTrangThaiBb() == castOther.getTrangThaiBb())
						|| (this.getTrangThaiBb() != null && castOther.getTrangThaiBb() != null
								&& this.getTrangThaiBb().equals(castOther.getTrangThaiBb())))
				&& ((this.getCanBoXuLyId() == castOther.getCanBoXuLyId())
						|| (this.getCanBoXuLyId() != null && castOther.getCanBoXuLyId() != null
								&& this.getCanBoXuLyId().equals(castOther.getCanBoXuLyId())))
				&& ((this.getCanBoTraLaiId() == castOther.getCanBoTraLaiId())
						|| (this.getCanBoTraLaiId() != null && castOther.getCanBoTraLaiId() != null
								&& this.getCanBoTraLaiId().equals(castOther.getCanBoTraLaiId())))
				&& ((this.getNgayTraLai() == castOther.getNgayTraLai()) || (this.getNgayTraLai() != null
						&& castOther.getNgayTraLai() != null && this.getNgayTraLai().equals(castOther.getNgayTraLai())))
				&& ((this.getNamTaoBb() == castOther.getNamTaoBb()) || (this.getNamTaoBb() != null
						&& castOther.getNamTaoBb() != null && this.getNamTaoBb().equals(castOther.getNamTaoBb())))
				&& ((this.getToChuc() == castOther.getToChuc()) || (this.getToChuc() != null
						&& castOther.getToChuc() != null && this.getToChuc().equals(castOther.getToChuc())))
				&& ((this.getQuocTichNvpId() == castOther.getQuocTichNvpId())
						|| (this.getQuocTichNvpId() != null && castOther.getQuocTichNvpId() != null
								&& this.getQuocTichNvpId().equals(castOther.getQuocTichNvpId())))
				&& ((this.getNgheNghiepNvpId() == castOther.getNgheNghiepNvpId())
						|| (this.getNgheNghiepNvpId() != null && castOther.getNgheNghiepNvpId() != null
								&& this.getNgheNghiepNvpId().equals(castOther.getNgheNghiepNvpId())))
				&& ((this.getSoDienThoaiNvp() == castOther.getSoDienThoaiNvp())
						|| (this.getSoDienThoaiNvp() != null && castOther.getSoDienThoaiNvp() != null
								&& this.getSoDienThoaiNvp().equals(castOther.getSoDienThoaiNvp())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getQuyenSo() == castOther.getQuyenSo()) || (this.getQuyenSo() != null
						&& castOther.getQuyenSo() != null && this.getQuyenSo().equals(castOther.getQuyenSo())))
				&& ((this.getTenNvpDvc() == castOther.getTenNvpDvc()) || (this.getTenNvpDvc() != null
						&& castOther.getTenNvpDvc() != null && this.getTenNvpDvc().equals(castOther.getTenNvpDvc())))
				&& ((this.getTenCanBoNhap() == castOther.getTenCanBoNhap())
						|| (this.getTenCanBoNhap() != null && castOther.getTenCanBoNhap() != null
								&& this.getTenCanBoNhap().equals(castOther.getTenCanBoNhap())))
				&& ((this.getCapBacNhap() == castOther.getCapBacNhap()) || (this.getCapBacNhap() != null
						&& castOther.getCapBacNhap() != null && this.getCapBacNhap().equals(castOther.getCapBacNhap())))
				&& ((this.getChucVuNhap() == castOther.getChucVuNhap()) || (this.getChucVuNhap() != null
						&& castOther.getChucVuNhap() != null && this.getChucVuNhap().equals(castOther.getChucVuNhap())))
				&& ((this.getGplx() == castOther.getGplx()) || (this.getGplx() != null && castOther.getGplx() != null
						&& this.getGplx().equals(castOther.getGplx())))
				&& ((this.getKiemDinh() == castOther.getKiemDinh()) || (this.getKiemDinh() != null
						&& castOther.getKiemDinh() != null && this.getKiemDinh().equals(castOther.getKiemDinh())))
				&& ((this.getTinhThanhId() == castOther.getTinhThanhId())
						|| (this.getTinhThanhId() != null && castOther.getTinhThanhId() != null
								&& this.getTinhThanhId().equals(castOther.getTinhThanhId())))
				&& ((this.getHangGplx() == castOther.getHangGplx()) || (this.getHangGplx() != null
						&& castOther.getHangGplx() != null && this.getHangGplx().equals(castOther.getHangGplx())))
				&& ((this.getMaDonVi() == castOther.getMaDonVi()) || (this.getMaDonVi() != null
						&& castOther.getMaDonVi() != null && this.getMaDonVi().equals(castOther.getMaDonVi())))
				&& ((this.getMaTinhThanh() == castOther.getMaTinhThanh())
						|| (this.getMaTinhThanh() != null && castOther.getMaTinhThanh() != null
								&& this.getMaTinhThanh().equals(castOther.getMaTinhThanh())))
				&& ((this.getNgaySinhNvpNhap() == castOther.getNgaySinhNvpNhap())
						|| (this.getNgaySinhNvpNhap() != null && castOther.getNgaySinhNvpNhap() != null
								&& this.getNgaySinhNvpNhap().equals(castOther.getNgaySinhNvpNhap())))
				&& ((this.getCapDonVi() == castOther.getCapDonVi()) || (this.getCapDonVi() != null
						&& castOther.getCapDonVi() != null && this.getCapDonVi().equals(castOther.getCapDonVi())))
				&& ((this.getLinhVucGiaoThong() == castOther.getLinhVucGiaoThong())
						|| (this.getLinhVucGiaoThong() != null && castOther.getLinhVucGiaoThong() != null
								&& this.getLinhVucGiaoThong().equals(castOther.getLinhVucGiaoThong())))
				&& ((this.getMaVuViec() == castOther.getMaVuViec()) || (this.getMaVuViec() != null
						&& castOther.getMaVuViec() != null && this.getMaVuViec().equals(castOther.getMaVuViec())))
				&& ((this.getMaThongTu() == castOther.getMaThongTu()) || (this.getMaThongTu() != null
						&& castOther.getMaThongTu() != null && this.getMaThongTu().equals(castOther.getMaThongTu())))
				&& ((this.getNgayLapBb() == castOther.getNgayLapBb()) || (this.getNgayLapBb() != null
						&& castOther.getNgayLapBb() != null && this.getNgayLapBb().equals(castOther.getNgayLapBb())))
				&& ((this.getThoiGianLapBb() == castOther.getThoiGianLapBb())
						|| (this.getThoiGianLapBb() != null && castOther.getThoiGianLapBb() != null
								&& this.getThoiGianLapBb().equals(castOther.getThoiGianLapBb())))
				&& ((this.getMaSoDn() == castOther.getMaSoDn()) || (this.getMaSoDn() != null
						&& castOther.getMaSoDn() != null && this.getMaSoDn().equals(castOther.getMaSoDn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdVuviec() == null ? 0 : this.getIdVuviec().hashCode());
		result = 37 * result + (getUuid() == null ? 0 : this.getUuid().hashCode());
		result = 37 * result + (getLoaiBbQd() == null ? 0 : this.getLoaiBbQd().hashCode());
		result = 37 * result + (getBbQdId() == null ? 0 : this.getBbQdId().hashCode());
		result = 37 * result + (getMaTheoTt() == null ? 0 : this.getMaTheoTt().hashCode());
		result = 37 * result + (getMaRutgon() == null ? 0 : this.getMaRutgon().hashCode());
		result = 37 * result + (getMaVuViecVv() == null ? 0 : this.getMaVuViecVv().hashCode());
		result = 37 * result + (getLoaiPtIdVv() == null ? 0 : this.getLoaiPtIdVv().hashCode());
		result = 37 * result + (getBienKsVv() == null ? 0 : this.getBienKsVv().hashCode());
		result = 37 * result + (getTenNvpVv() == null ? 0 : this.getTenNvpVv().hashCode());
		result = 37 * result + (getNguoiTaoVv() == null ? 0 : this.getNguoiTaoVv().hashCode());
		result = 37 * result + (getNgayTaoVv() == null ? 0 : this.getNgayTaoVv().hashCode());
		result = 37 * result + (getNguoiSuaVv() == null ? 0 : this.getNguoiSuaVv().hashCode());
		result = 37 * result + (getNgaySuaVv() == null ? 0 : this.getNgaySuaVv().hashCode());
		result = 37 * result + (getTrangThaiVv() == null ? 0 : this.getTrangThaiVv().hashCode());
		result = 37 * result + (getGhiChuVv() == null ? 0 : this.getGhiChuVv().hashCode());
		result = 37 * result + (getDvCsgtIdVv() == null ? 0 : this.getDvCsgtIdVv().hashCode());
		result = 37 * result + (getIdBb43() == null ? 0 : this.getIdBb43().hashCode());
		result = 37 * result + (getSoBienBan() == null ? 0 : this.getSoBienBan().hashCode());
		result = 37 * result + (getTenCucCsgt() == null ? 0 : this.getTenCucCsgt().hashCode());
		result = 37 * result + (getCanCu() == null ? 0 : this.getCanCu().hashCode());
		result = 37 * result + (getDiaDiemVphc() == null ? 0 : this.getDiaDiemVphc().hashCode());
		result = 37 * result + (getTenCanBo() == null ? 0 : this.getTenCanBo().hashCode());
		result = 37 * result + (getThoiGianVphc() == null ? 0 : this.getThoiGianVphc().hashCode());
		result = 37 * result + (getNgayThangVphc() == null ? 0 : this.getNgayThangVphc().hashCode());
		result = 37 * result + (getChucVu() == null ? 0 : this.getChucVu().hashCode());
		result = 37 * result + (getDonViCsgt() == null ? 0 : this.getDonViCsgt().hashCode());
		result = 37 * result + (getTenNc1() == null ? 0 : this.getTenNc1().hashCode());
		result = 37 * result + (getNgheNghiepNc1() == null ? 0 : this.getNgheNghiepNc1().hashCode());
		result = 37 * result + (getSoCmndNc1() == null ? 0 : this.getSoCmndNc1().hashCode());
		result = 37 * result + (getDiaChiNc1() == null ? 0 : this.getDiaChiNc1().hashCode());
		result = 37 * result + (getSdtNc1() == null ? 0 : this.getSdtNc1().hashCode());
		result = 37 * result + (getTenNc2() == null ? 0 : this.getTenNc2().hashCode());
		result = 37 * result + (getNgheNghiepNc2() == null ? 0 : this.getNgheNghiepNc2().hashCode());
		result = 37 * result + (getSoCmndNc2() == null ? 0 : this.getSoCmndNc2().hashCode());
		result = 37 * result + (getDiaChiNc2() == null ? 0 : this.getDiaChiNc2().hashCode());
		result = 37 * result + (getSdtNc2() == null ? 0 : this.getSdtNc2().hashCode());
		result = 37 * result + (getTenNvp() == null ? 0 : this.getTenNvp().hashCode());
		result = 37 * result + (getNgaySinhNvp() == null ? 0 : this.getNgaySinhNvp().hashCode());
		result = 37 * result + (getQuocTichNvp() == null ? 0 : this.getQuocTichNvp().hashCode());
		result = 37 * result + (getNgheNghiepNvp() == null ? 0 : this.getNgheNghiepNvp().hashCode());
		result = 37 * result + (getDiaChiNvp() == null ? 0 : this.getDiaChiNvp().hashCode());
		result = 37 * result + (getSoCmndNvp() == null ? 0 : this.getSoCmndNvp().hashCode());
		result = 37 * result + (getNgayCapCmndNvp() == null ? 0 : this.getNgayCapCmndNvp().hashCode());
		result = 37 * result + (getNoiCapCmndNvp() == null ? 0 : this.getNoiCapCmndNvp().hashCode());
		result = 37 * result + (getNoiDungVphc() == null ? 0 : this.getNoiDungVphc().hashCode());
		result = 37 * result + (getYKienNvp() == null ? 0 : this.getYKienNvp().hashCode());
		result = 37 * result + (getYKienNbh() == null ? 0 : this.getYKienNbh().hashCode());
		result = 37 * result + (getTangVatTg() == null ? 0 : this.getTangVatTg().hashCode());
		result = 37 * result + (getThoiGianGqvp() == null ? 0 : this.getThoiGianGqvp().hashCode());
		result = 37 * result + (getNgayGqvp() == null ? 0 : this.getNgayGqvp().hashCode());
		result = 37 * result + (getDiaDiemGqvp() == null ? 0 : this.getDiaDiemGqvp().hashCode());
		result = 37 * result + (getThoiHanGqvp() == null ? 0 : this.getThoiHanGqvp().hashCode());
		result = 37 * result + (getSoTrangBb() == null ? 0 : this.getSoTrangBb().hashCode());
		result = 37 * result + (getSoBanBb() == null ? 0 : this.getSoBanBb().hashCode());
		result = 37 * result + (getLyDoKoKyBb() == null ? 0 : this.getLyDoKoKyBb().hashCode());
		result = 37 * result + (getQdXphc() == null ? 0 : this.getQdXphc().hashCode());
		result = 37 * result + (getQdTgtgtv() == null ? 0 : this.getQdTgtgtv().hashCode());
		result = 37 * result + (getBienPhapNganChanVphc() == null ? 0 : this.getBienPhapNganChanVphc().hashCode());
		result = 37 * result + (getThoiGianBbLap() == null ? 0 : this.getThoiGianBbLap().hashCode());
		result = 37 * result + (getNgayBbLap() == null ? 0 : this.getNgayBbLap().hashCode());
		result = 37 * result + (getCanBoTiepNhanGt() == null ? 0 : this.getCanBoTiepNhanGt().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNguoiTaoId() == null ? 0 : this.getNguoiTaoId().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNguoiSuaId() == null ? 0 : this.getNguoiSuaId().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getDonViCsgtCapTren() == null ? 0 : this.getDonViCsgtCapTren().hashCode());
		result = 37 * result + (getLoaiPhuongTien() == null ? 0 : this.getLoaiPhuongTien().hashCode());
		result = 37 * result + (getLoaiPhuongTienId() == null ? 0 : this.getLoaiPhuongTienId().hashCode());
		result = 37 * result + (getBienKiemSoat() == null ? 0 : this.getBienKiemSoat().hashCode());
		result = 37 * result + (getSoQdxphc() == null ? 0 : this.getSoQdxphc().hashCode());
		result = 37 * result + (getSoQdtgtv() == null ? 0 : this.getSoQdtgtv().hashCode());
		result = 37 * result + (getSoBbtgtv() == null ? 0 : this.getSoBbtgtv().hashCode());
		result = 37 * result + (getSoQdtltv() == null ? 0 : this.getSoQdtltv().hashCode());
		result = 37 * result + (getSoBbtltv() == null ? 0 : this.getSoBbtltv().hashCode());
		result = 37 * result + (getIdTheoNam() == null ? 0 : this.getIdTheoNam().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getNamLapBb() == null ? 0 : this.getNamLapBb().hashCode());
		result = 37 * result + (getNhapBb() == null ? 0 : this.getNhapBb().hashCode());
		result = 37 * result + (getTrangThaiBb() == null ? 0 : this.getTrangThaiBb().hashCode());
		result = 37 * result + (getCanBoXuLyId() == null ? 0 : this.getCanBoXuLyId().hashCode());
		result = 37 * result + (getCanBoTraLaiId() == null ? 0 : this.getCanBoTraLaiId().hashCode());
		result = 37 * result + (getNgayTraLai() == null ? 0 : this.getNgayTraLai().hashCode());
		result = 37 * result + (getNamTaoBb() == null ? 0 : this.getNamTaoBb().hashCode());
		result = 37 * result + (getToChuc() == null ? 0 : this.getToChuc().hashCode());
		result = 37 * result + (getQuocTichNvpId() == null ? 0 : this.getQuocTichNvpId().hashCode());
		result = 37 * result + (getNgheNghiepNvpId() == null ? 0 : this.getNgheNghiepNvpId().hashCode());
		result = 37 * result + (getSoDienThoaiNvp() == null ? 0 : this.getSoDienThoaiNvp().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getQuyenSo() == null ? 0 : this.getQuyenSo().hashCode());
		result = 37 * result + (getTenNvpDvc() == null ? 0 : this.getTenNvpDvc().hashCode());
		result = 37 * result + (getTenCanBoNhap() == null ? 0 : this.getTenCanBoNhap().hashCode());
		result = 37 * result + (getCapBacNhap() == null ? 0 : this.getCapBacNhap().hashCode());
		result = 37 * result + (getChucVuNhap() == null ? 0 : this.getChucVuNhap().hashCode());
		result = 37 * result + (getGplx() == null ? 0 : this.getGplx().hashCode());
		result = 37 * result + (getKiemDinh() == null ? 0 : this.getKiemDinh().hashCode());
		result = 37 * result + (getTinhThanhId() == null ? 0 : this.getTinhThanhId().hashCode());
		result = 37 * result + (getHangGplx() == null ? 0 : this.getHangGplx().hashCode());
		result = 37 * result + (getMaDonVi() == null ? 0 : this.getMaDonVi().hashCode());
		result = 37 * result + (getMaTinhThanh() == null ? 0 : this.getMaTinhThanh().hashCode());
		result = 37 * result + (getNgaySinhNvpNhap() == null ? 0 : this.getNgaySinhNvpNhap().hashCode());
		result = 37 * result + (getCapDonVi() == null ? 0 : this.getCapDonVi().hashCode());
		result = 37 * result + (getLinhVucGiaoThong() == null ? 0 : this.getLinhVucGiaoThong().hashCode());
		result = 37 * result + (getMaVuViec() == null ? 0 : this.getMaVuViec().hashCode());
		result = 37 * result + (getMaThongTu() == null ? 0 : this.getMaThongTu().hashCode());
		result = 37 * result + (getNgayLapBb() == null ? 0 : this.getNgayLapBb().hashCode());
		result = 37 * result + (getThoiGianLapBb() == null ? 0 : this.getThoiGianLapBb().hashCode());
		result = 37 * result + (getMaSoDn() == null ? 0 : this.getMaSoDn().hashCode());
		return result;
	}

}
