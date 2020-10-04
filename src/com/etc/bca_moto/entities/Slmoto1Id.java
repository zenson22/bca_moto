package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Slmoto1Id
 */
@Embeddable
public class Slmoto1Id implements java.io.Serializable {

	private String bien;
	private Date ngayDk;
	private String bienCu;
	private String chuXe;
	private String soCmnd;
	private String diaChi;
	private String nhanHieu;
	private String soLoai;
	private Long cm;
	private String loaixe;
	private String soMay;
	private String soKhung;
	private String mau;
	private String soHq;
	private String boSung;
	private String ghiChu;
	private Date ngaynhap;
	private String soSeri;
	private String soTem;
	private String nguonGoc;
	private String soHuu;
	private String tonTai;
	private String veViec;
	private Date ngayCmnd;
	private Date ngayDkd;
	private Date ngayBs;
	private String songuoi;
	private String congsuat;
	private String nsxuat;
	private String ttrong;
	private String hhoa;
	private Date ngayHh;
	private Date convertDate;
	private String dataOfUnit;
	private Date migrationDate;
	private Boolean action;
	private String note;
	private String tenPlQlyCu;
	private String tenPlQlyMoi;
	private Long phanLoaiQlyId;
	private String tenNHieuCu;
	private String tenNHieuMoi;
	private Long idNhanHieuMoi;
	private Long idLoaiXeMoi;
	private String tenNgGocCu;
	private String tenNgGocXeMoi;
	private String maNgGocXeMoi;
	private Long mauBien;
	private Long idMauMoi;
	private Long motoId;
	private Long dungTichMoi;
	private String dauBienTheoTinh;
	private String biensoQuocgiaId;
	private String biensoQuocgia;
	private String trangthaiDangky;
	private String trangthaiHoso;
	private String seriChu;
	private Long trangThaiCd;
	private String dienGiaiTrangThai;
	private String loiChuyenDoi;
	private Long quocGiaId;
	private Long diaDanhHc;
	private String trangThaiXe;
	private Long diaDanhHanhChinhId;
	private String bienSoTrunc;
	private String biensoDaydu;
	private String noiCapChungTu;
	private String soChungTu;
	private Date ngayCapNhat;
	private Date ngayTao;

	public Slmoto1Id() {
	}

	@Column(name = "BIEN", columnDefinition = "VARCHAR2", length = 840)
	public String getBien() {
		return this.bien;
	}

	public void setBien(String bien) {
		this.bien = bien;
	}

	@Column(name = "NGAY_DK", columnDefinition = "DATE", length = 7)
	public Date getNgayDk() {
		return this.ngayDk;
	}

	public void setNgayDk(Date ngayDk) {
		this.ngayDk = ngayDk;
	}

	@Column(name = "BIEN_CU", columnDefinition = "VARCHAR2", length = 840)
	public String getBienCu() {
		return this.bienCu;
	}

	public void setBienCu(String bienCu) {
		this.bienCu = bienCu;
	}

	@Column(name = "CHU_XE", columnDefinition = "VARCHAR2", length = 920)
	public String getChuXe() {
		return this.chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	@Column(name = "SO_CMND", columnDefinition = "VARCHAR2", length = 848)
	public String getSoCmnd() {
		return this.soCmnd;
	}

	public void setSoCmnd(String soCmnd) {
		this.soCmnd = soCmnd;
	}

	@Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 920)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "NHAN_HIEU", columnDefinition = "VARCHAR2", length = 812)
	public String getNhanHieu() {
		return this.nhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}

	@Column(name = "SO_LOAI", columnDefinition = "VARCHAR2", length = 840)
	public String getSoLoai() {
		return this.soLoai;
	}

	public void setSoLoai(String soLoai) {
		this.soLoai = soLoai;
	}

	@Column(name = "CM", columnDefinition = "NUMBER", precision = 4, scale = 0)
	public Long getCm() {
		return this.cm;
	}

	public void setCm(Long cm) {
		this.cm = cm;
	}

	@Column(name = "LOAIXE", columnDefinition = "VARCHAR2", length = 804)
	public String getLoaixe() {
		return this.loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	@Column(name = "SO_MAY", columnDefinition = "VARCHAR2", length = 880)
	public String getSoMay() {
		return this.soMay;
	}

	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}

	@Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2", length = 880)
	public String getSoKhung() {
		return this.soKhung;
	}

	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}

	@Column(name = "MAU", columnDefinition = "VARCHAR2", length = 808)
	public String getMau() {
		return this.mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	@Column(name = "SO_HQ", columnDefinition = "VARCHAR2", length = 848)
	public String getSoHq() {
		return this.soHq;
	}

	public void setSoHq(String soHq) {
		this.soHq = soHq;
	}

	@Column(name = "BO_SUNG", columnDefinition = "VARCHAR2", length = 816)
	public String getBoSung() {
		return this.boSung;
	}

	public void setBoSung(String boSung) {
		this.boSung = boSung;
	}

	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1120)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Column(name = "NGAYNHAP", columnDefinition = "DATE", length = 7)
	public Date getNgaynhap() {
		return this.ngaynhap;
	}

	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	@Column(name = "SO_SERI", columnDefinition = "VARCHAR2", length = 840)
	public String getSoSeri() {
		return this.soSeri;
	}

	public void setSoSeri(String soSeri) {
		this.soSeri = soSeri;
	}

	@Column(name = "SO_TEM", columnDefinition = "VARCHAR2", length = 848)
	public String getSoTem() {
		return this.soTem;
	}

	public void setSoTem(String soTem) {
		this.soTem = soTem;
	}

	@Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 808)
	public String getNguonGoc() {
		return this.nguonGoc;
	}

	public void setNguonGoc(String nguonGoc) {
		this.nguonGoc = nguonGoc;
	}

	@Column(name = "SO_HUU", columnDefinition = "VARCHAR2", length = 808)
	public String getSoHuu() {
		return this.soHuu;
	}

	public void setSoHuu(String soHuu) {
		this.soHuu = soHuu;
	}

	@Column(name = "TON_TAI", columnDefinition = "VARCHAR2", length = 808)
	public String getTonTai() {
		return this.tonTai;
	}

	public void setTonTai(String tonTai) {
		this.tonTai = tonTai;
	}

	@Column(name = "VE_VIEC", columnDefinition = "VARCHAR2", length = 808)
	public String getVeViec() {
		return this.veViec;
	}

	public void setVeViec(String veViec) {
		this.veViec = veViec;
	}

	@Column(name = "NGAY_CMND", columnDefinition = "DATE", length = 7)
	public Date getNgayCmnd() {
		return this.ngayCmnd;
	}

	public void setNgayCmnd(Date ngayCmnd) {
		this.ngayCmnd = ngayCmnd;
	}

	@Column(name = "NGAY_DKD", columnDefinition = "DATE", length = 7)
	public Date getNgayDkd() {
		return this.ngayDkd;
	}

	public void setNgayDkd(Date ngayDkd) {
		this.ngayDkd = ngayDkd;
	}

	@Column(name = "NGAY_BS", columnDefinition = "DATE", length = 7)
	public Date getNgayBs() {
		return this.ngayBs;
	}

	public void setNgayBs(Date ngayBs) {
		this.ngayBs = ngayBs;
	}

	@Column(name = "SONGUOI", columnDefinition = "VARCHAR2", length = 808)
	public String getSonguoi() {
		return this.songuoi;
	}

	public void setSonguoi(String songuoi) {
		this.songuoi = songuoi;
	}

	@Column(name = "CONGSUAT", columnDefinition = "VARCHAR2", length = 824)
	public String getCongsuat() {
		return this.congsuat;
	}

	public void setCongsuat(String congsuat) {
		this.congsuat = congsuat;
	}

	@Column(name = "NSXUAT", columnDefinition = "VARCHAR2", length = 816)
	public String getNsxuat() {
		return this.nsxuat;
	}

	public void setNsxuat(String nsxuat) {
		this.nsxuat = nsxuat;
	}

	@Column(name = "TTRONG", columnDefinition = "VARCHAR2", length = 816)
	public String getTtrong() {
		return this.ttrong;
	}

	public void setTtrong(String ttrong) {
		this.ttrong = ttrong;
	}

	@Column(name = "HHOA", columnDefinition = "VARCHAR2", length = 816)
	public String getHhoa() {
		return this.hhoa;
	}

	public void setHhoa(String hhoa) {
		this.hhoa = hhoa;
	}

	@Column(name = "NGAY_HH", columnDefinition = "DATE", length = 7)
	public Date getNgayHh() {
		return this.ngayHh;
	}

	public void setNgayHh(Date ngayHh) {
		this.ngayHh = ngayHh;
	}

	@Column(name = "CONVERT_DATE", columnDefinition = "DATE", length = 7)
	public Date getConvertDate() {
		return this.convertDate;
	}

	public void setConvertDate(Date convertDate) {
		this.convertDate = convertDate;
	}

	@Column(name = "DATA_OF_UNIT", columnDefinition = "VARCHAR2", length = 800)
	public String getDataOfUnit() {
		return this.dataOfUnit;
	}

	public void setDataOfUnit(String dataOfUnit) {
		this.dataOfUnit = dataOfUnit;
	}

	@Column(name = "MIGRATION_DATE", columnDefinition = "DATE", length = 7)
	public Date getMigrationDate() {
		return this.migrationDate;
	}

	public void setMigrationDate(Date migrationDate) {
		this.migrationDate = migrationDate;
	}

	@Column(name = "ACTION", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getAction() {
		return this.action;
	}

	public void setAction(Boolean action) {
		this.action = action;
	}

	@Column(name = "NOTE", columnDefinition = "VARCHAR2", length = 800)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "TEN_PL_QLY_CU", columnDefinition = "VARCHAR2", length = 500)
	public String getTenPlQlyCu() {
		return this.tenPlQlyCu;
	}

	public void setTenPlQlyCu(String tenPlQlyCu) {
		this.tenPlQlyCu = tenPlQlyCu;
	}

	@Column(name = "TEN_PL_QLY_MOI", columnDefinition = "VARCHAR2", length = 500)
	public String getTenPlQlyMoi() {
		return this.tenPlQlyMoi;
	}

	public void setTenPlQlyMoi(String tenPlQlyMoi) {
		this.tenPlQlyMoi = tenPlQlyMoi;
	}

	@Column(name = "PHAN_LOAI_QLY_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getPhanLoaiQlyId() {
		return this.phanLoaiQlyId;
	}

	public void setPhanLoaiQlyId(Long phanLoaiQlyId) {
		this.phanLoaiQlyId = phanLoaiQlyId;
	}

	@Column(name = "TEN_N_HIEU_CU", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNHieuCu() {
		return this.tenNHieuCu;
	}

	public void setTenNHieuCu(String tenNHieuCu) {
		this.tenNHieuCu = tenNHieuCu;
	}

	@Column(name = "TEN_N_HIEU_MOI", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNHieuMoi() {
		return this.tenNHieuMoi;
	}

	public void setTenNHieuMoi(String tenNHieuMoi) {
		this.tenNHieuMoi = tenNHieuMoi;
	}

	@Column(name = "ID_NHAN_HIEU_MOI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getIdNhanHieuMoi() {
		return this.idNhanHieuMoi;
	}

	public void setIdNhanHieuMoi(Long idNhanHieuMoi) {
		this.idNhanHieuMoi = idNhanHieuMoi;
	}

	@Column(name = "ID_LOAI_XE_MOI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getIdLoaiXeMoi() {
		return this.idLoaiXeMoi;
	}

	public void setIdLoaiXeMoi(Long idLoaiXeMoi) {
		this.idLoaiXeMoi = idLoaiXeMoi;
	}

	@Column(name = "TEN_NG_GOC_CU", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNgGocCu() {
		return this.tenNgGocCu;
	}

	public void setTenNgGocCu(String tenNgGocCu) {
		this.tenNgGocCu = tenNgGocCu;
	}

	@Column(name = "TEN_NG_GOC_XE_MOI", columnDefinition = "VARCHAR2", length = 200)
	public String getTenNgGocXeMoi() {
		return this.tenNgGocXeMoi;
	}

	public void setTenNgGocXeMoi(String tenNgGocXeMoi) {
		this.tenNgGocXeMoi = tenNgGocXeMoi;
	}

	@Column(name = "MA_NG_GOC_XE_MOI", columnDefinition = "VARCHAR2", length = 30)
	public String getMaNgGocXeMoi() {
		return this.maNgGocXeMoi;
	}

	public void setMaNgGocXeMoi(String maNgGocXeMoi) {
		this.maNgGocXeMoi = maNgGocXeMoi;
	}

	@Column(name = "MAU_BIEN", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMauBien() {
		return this.mauBien;
	}

	public void setMauBien(Long mauBien) {
		this.mauBien = mauBien;
	}

	@Column(name = "ID_MAU_MOI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getIdMauMoi() {
		return this.idMauMoi;
	}

	public void setIdMauMoi(Long idMauMoi) {
		this.idMauMoi = idMauMoi;
	}

	@Column(name = "MOTO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getMotoId() {
		return this.motoId;
	}

	public void setMotoId(Long motoId) {
		this.motoId = motoId;
	}

	@Column(name = "DUNG_TICH_MOI", columnDefinition = "NUMBER", precision = 6, scale = 0)
	public Long getDungTichMoi() {
		return this.dungTichMoi;
	}

	public void setDungTichMoi(Long dungTichMoi) {
		this.dungTichMoi = dungTichMoi;
	}

	@Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 10)
	public String getDauBienTheoTinh() {
		return this.dauBienTheoTinh;
	}

	public void setDauBienTheoTinh(String dauBienTheoTinh) {
		this.dauBienTheoTinh = dauBienTheoTinh;
	}

	@Column(name = "BIENSO_QUOCGIA_ID", columnDefinition = "VARCHAR2", length = 10)
	public String getBiensoQuocgiaId() {
		return this.biensoQuocgiaId;
	}

	public void setBiensoQuocgiaId(String biensoQuocgiaId) {
		this.biensoQuocgiaId = biensoQuocgiaId;
	}

	@Column(name = "BIENSO_QUOCGIA", columnDefinition = "VARCHAR2", length = 10)
	public String getBiensoQuocgia() {
		return this.biensoQuocgia;
	}

	public void setBiensoQuocgia(String biensoQuocgia) {
		this.biensoQuocgia = biensoQuocgia;
	}

	@Column(name = "TRANGTHAI_DANGKY", columnDefinition = "VARCHAR2", length = 10)
	public String getTrangthaiDangky() {
		return this.trangthaiDangky;
	}

	public void setTrangthaiDangky(String trangthaiDangky) {
		this.trangthaiDangky = trangthaiDangky;
	}

	@Column(name = "TRANGTHAI_HOSO", columnDefinition = "VARCHAR2", length = 10)
	public String getTrangthaiHoso() {
		return this.trangthaiHoso;
	}

	public void setTrangthaiHoso(String trangthaiHoso) {
		this.trangthaiHoso = trangthaiHoso;
	}

	@Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 120)
	public String getSeriChu() {
		return this.seriChu;
	}

	public void setSeriChu(String seriChu) {
		this.seriChu = seriChu;
	}

	@Column(name = "TRANG_THAI_CD", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTrangThaiCd() {
		return this.trangThaiCd;
	}

	public void setTrangThaiCd(Long trangThaiCd) {
		this.trangThaiCd = trangThaiCd;
	}

	@Column(name = "DIEN_GIAI_TRANG_THAI", columnDefinition = "VARCHAR2", length = 1000)
	public String getDienGiaiTrangThai() {
		return this.dienGiaiTrangThai;
	}

	public void setDienGiaiTrangThai(String dienGiaiTrangThai) {
		this.dienGiaiTrangThai = dienGiaiTrangThai;
	}

	@Column(name = "LOI_CHUYEN_DOI", columnDefinition = "VARCHAR2", length = 2000)
	public String getLoiChuyenDoi() {
		return this.loiChuyenDoi;
	}

	public void setLoiChuyenDoi(String loiChuyenDoi) {
		this.loiChuyenDoi = loiChuyenDoi;
	}

	@Column(name = "QUOC_GIA_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getQuocGiaId() {
		return this.quocGiaId;
	}

	public void setQuocGiaId(Long quocGiaId) {
		this.quocGiaId = quocGiaId;
	}

	@Column(name = "DIA_DANH_HC", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDiaDanhHc() {
		return this.diaDanhHc;
	}

	public void setDiaDanhHc(Long diaDanhHc) {
		this.diaDanhHc = diaDanhHc;
	}

	@Column(name = "TRANG_THAI_XE", columnDefinition = "VARCHAR2", length = 10)
	public String getTrangThaiXe() {
		return this.trangThaiXe;
	}

	public void setTrangThaiXe(String trangThaiXe) {
		this.trangThaiXe = trangThaiXe;
	}

	@Column(name = "DIA_DANH_HANH_CHINH_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getDiaDanhHanhChinhId() {
		return this.diaDanhHanhChinhId;
	}

	public void setDiaDanhHanhChinhId(Long diaDanhHanhChinhId) {
		this.diaDanhHanhChinhId = diaDanhHanhChinhId;
	}

	@Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 240)
	public String getBienSoTrunc() {
		return this.bienSoTrunc;
	}

	public void setBienSoTrunc(String bienSoTrunc) {
		this.bienSoTrunc = bienSoTrunc;
	}

	@Column(name = "BIENSO_DAYDU", columnDefinition = "VARCHAR2", length = 240)
	public String getBiensoDaydu() {
		return this.biensoDaydu;
	}

	public void setBiensoDaydu(String biensoDaydu) {
		this.biensoDaydu = biensoDaydu;
	}

	@Column(name = "NOI_CAP_CHUNG_TU", columnDefinition = "VARCHAR2", length = 200)
	public String getNoiCapChungTu() {
		return this.noiCapChungTu;
	}

	public void setNoiCapChungTu(String noiCapChungTu) {
		this.noiCapChungTu = noiCapChungTu;
	}

	@Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 200)
	public String getSoChungTu() {
		return this.soChungTu;
	}

	public void setSoChungTu(String soChungTu) {
		this.soChungTu = soChungTu;
	}

	@Column(name = "NGAY_CAP_NHAT", columnDefinition = "DATE", length = 7)
	public Date getNgayCapNhat() {
		return this.ngayCapNhat;
	}

	public void setNgayCapNhat(Date ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}

	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Slmoto1Id))
			return false;
		Slmoto1Id castOther = (Slmoto1Id) other;

		return ((this.getBien() == castOther.getBien()) || (this.getBien() != null && castOther.getBien() != null
				&& this.getBien().equals(castOther.getBien())))
				&& ((this.getNgayDk() == castOther.getNgayDk()) || (this.getNgayDk() != null
						&& castOther.getNgayDk() != null && this.getNgayDk().equals(castOther.getNgayDk())))
				&& ((this.getBienCu() == castOther.getBienCu()) || (this.getBienCu() != null
						&& castOther.getBienCu() != null && this.getBienCu().equals(castOther.getBienCu())))
				&& ((this.getChuXe() == castOther.getChuXe()) || (this.getChuXe() != null
						&& castOther.getChuXe() != null && this.getChuXe().equals(castOther.getChuXe())))
				&& ((this.getSoCmnd() == castOther.getSoCmnd()) || (this.getSoCmnd() != null
						&& castOther.getSoCmnd() != null && this.getSoCmnd().equals(castOther.getSoCmnd())))
				&& ((this.getDiaChi() == castOther.getDiaChi()) || (this.getDiaChi() != null
						&& castOther.getDiaChi() != null && this.getDiaChi().equals(castOther.getDiaChi())))
				&& ((this.getNhanHieu() == castOther.getNhanHieu()) || (this.getNhanHieu() != null
						&& castOther.getNhanHieu() != null && this.getNhanHieu().equals(castOther.getNhanHieu())))
				&& ((this.getSoLoai() == castOther.getSoLoai()) || (this.getSoLoai() != null
						&& castOther.getSoLoai() != null && this.getSoLoai().equals(castOther.getSoLoai())))
				&& ((this.getCm() == castOther.getCm()) || (this.getCm() != null && castOther.getCm() != null
						&& this.getCm().equals(castOther.getCm())))
				&& ((this.getLoaixe() == castOther.getLoaixe()) || (this.getLoaixe() != null
						&& castOther.getLoaixe() != null && this.getLoaixe().equals(castOther.getLoaixe())))
				&& ((this.getSoMay() == castOther.getSoMay()) || (this.getSoMay() != null
						&& castOther.getSoMay() != null && this.getSoMay().equals(castOther.getSoMay())))
				&& ((this.getSoKhung() == castOther.getSoKhung()) || (this.getSoKhung() != null
						&& castOther.getSoKhung() != null && this.getSoKhung().equals(castOther.getSoKhung())))
				&& ((this.getMau() == castOther.getMau()) || (this.getMau() != null && castOther.getMau() != null
						&& this.getMau().equals(castOther.getMau())))
				&& ((this.getSoHq() == castOther.getSoHq()) || (this.getSoHq() != null && castOther.getSoHq() != null
						&& this.getSoHq().equals(castOther.getSoHq())))
				&& ((this.getBoSung() == castOther.getBoSung()) || (this.getBoSung() != null
						&& castOther.getBoSung() != null && this.getBoSung().equals(castOther.getBoSung())))
				&& ((this.getGhiChu() == castOther.getGhiChu()) || (this.getGhiChu() != null
						&& castOther.getGhiChu() != null && this.getGhiChu().equals(castOther.getGhiChu())))
				&& ((this.getNgaynhap() == castOther.getNgaynhap()) || (this.getNgaynhap() != null
						&& castOther.getNgaynhap() != null && this.getNgaynhap().equals(castOther.getNgaynhap())))
				&& ((this.getSoSeri() == castOther.getSoSeri()) || (this.getSoSeri() != null
						&& castOther.getSoSeri() != null && this.getSoSeri().equals(castOther.getSoSeri())))
				&& ((this.getSoTem() == castOther.getSoTem()) || (this.getSoTem() != null
						&& castOther.getSoTem() != null && this.getSoTem().equals(castOther.getSoTem())))
				&& ((this.getNguonGoc() == castOther.getNguonGoc()) || (this.getNguonGoc() != null
						&& castOther.getNguonGoc() != null && this.getNguonGoc().equals(castOther.getNguonGoc())))
				&& ((this.getSoHuu() == castOther.getSoHuu()) || (this.getSoHuu() != null
						&& castOther.getSoHuu() != null && this.getSoHuu().equals(castOther.getSoHuu())))
				&& ((this.getTonTai() == castOther.getTonTai()) || (this.getTonTai() != null
						&& castOther.getTonTai() != null && this.getTonTai().equals(castOther.getTonTai())))
				&& ((this.getVeViec() == castOther.getVeViec()) || (this.getVeViec() != null
						&& castOther.getVeViec() != null && this.getVeViec().equals(castOther.getVeViec())))
				&& ((this.getNgayCmnd() == castOther.getNgayCmnd()) || (this.getNgayCmnd() != null
						&& castOther.getNgayCmnd() != null && this.getNgayCmnd().equals(castOther.getNgayCmnd())))
				&& ((this.getNgayDkd() == castOther.getNgayDkd()) || (this.getNgayDkd() != null
						&& castOther.getNgayDkd() != null && this.getNgayDkd().equals(castOther.getNgayDkd())))
				&& ((this.getNgayBs() == castOther.getNgayBs()) || (this.getNgayBs() != null
						&& castOther.getNgayBs() != null && this.getNgayBs().equals(castOther.getNgayBs())))
				&& ((this.getSonguoi() == castOther.getSonguoi()) || (this.getSonguoi() != null
						&& castOther.getSonguoi() != null && this.getSonguoi().equals(castOther.getSonguoi())))
				&& ((this.getCongsuat() == castOther.getCongsuat()) || (this.getCongsuat() != null
						&& castOther.getCongsuat() != null && this.getCongsuat().equals(castOther.getCongsuat())))
				&& ((this.getNsxuat() == castOther.getNsxuat()) || (this.getNsxuat() != null
						&& castOther.getNsxuat() != null && this.getNsxuat().equals(castOther.getNsxuat())))
				&& ((this.getTtrong() == castOther.getTtrong()) || (this.getTtrong() != null
						&& castOther.getTtrong() != null && this.getTtrong().equals(castOther.getTtrong())))
				&& ((this.getHhoa() == castOther.getHhoa()) || (this.getHhoa() != null && castOther.getHhoa() != null
						&& this.getHhoa().equals(castOther.getHhoa())))
				&& ((this.getNgayHh() == castOther.getNgayHh()) || (this.getNgayHh() != null
						&& castOther.getNgayHh() != null && this.getNgayHh().equals(castOther.getNgayHh())))
				&& ((this.getConvertDate() == castOther.getConvertDate())
						|| (this.getConvertDate() != null && castOther.getConvertDate() != null
								&& this.getConvertDate().equals(castOther.getConvertDate())))
				&& ((this.getDataOfUnit() == castOther.getDataOfUnit()) || (this.getDataOfUnit() != null
						&& castOther.getDataOfUnit() != null && this.getDataOfUnit().equals(castOther.getDataOfUnit())))
				&& ((this.getMigrationDate() == castOther.getMigrationDate())
						|| (this.getMigrationDate() != null && castOther.getMigrationDate() != null
								&& this.getMigrationDate().equals(castOther.getMigrationDate())))
				&& ((this.getAction() == castOther.getAction()) || (this.getAction() != null
						&& castOther.getAction() != null && this.getAction().equals(castOther.getAction())))
				&& ((this.getNote() == castOther.getNote()) || (this.getNote() != null && castOther.getNote() != null
						&& this.getNote().equals(castOther.getNote())))
				&& ((this.getTenPlQlyCu() == castOther.getTenPlQlyCu()) || (this.getTenPlQlyCu() != null
						&& castOther.getTenPlQlyCu() != null && this.getTenPlQlyCu().equals(castOther.getTenPlQlyCu())))
				&& ((this.getTenPlQlyMoi() == castOther.getTenPlQlyMoi())
						|| (this.getTenPlQlyMoi() != null && castOther.getTenPlQlyMoi() != null
								&& this.getTenPlQlyMoi().equals(castOther.getTenPlQlyMoi())))
				&& ((this.getPhanLoaiQlyId() == castOther.getPhanLoaiQlyId())
						|| (this.getPhanLoaiQlyId() != null && castOther.getPhanLoaiQlyId() != null
								&& this.getPhanLoaiQlyId().equals(castOther.getPhanLoaiQlyId())))
				&& ((this.getTenNHieuCu() == castOther.getTenNHieuCu()) || (this.getTenNHieuCu() != null
						&& castOther.getTenNHieuCu() != null && this.getTenNHieuCu().equals(castOther.getTenNHieuCu())))
				&& ((this.getTenNHieuMoi() == castOther.getTenNHieuMoi())
						|| (this.getTenNHieuMoi() != null && castOther.getTenNHieuMoi() != null
								&& this.getTenNHieuMoi().equals(castOther.getTenNHieuMoi())))
				&& ((this.getIdNhanHieuMoi() == castOther.getIdNhanHieuMoi())
						|| (this.getIdNhanHieuMoi() != null && castOther.getIdNhanHieuMoi() != null
								&& this.getIdNhanHieuMoi().equals(castOther.getIdNhanHieuMoi())))
				&& ((this.getIdLoaiXeMoi() == castOther.getIdLoaiXeMoi())
						|| (this.getIdLoaiXeMoi() != null && castOther.getIdLoaiXeMoi() != null
								&& this.getIdLoaiXeMoi().equals(castOther.getIdLoaiXeMoi())))
				&& ((this.getTenNgGocCu() == castOther.getTenNgGocCu()) || (this.getTenNgGocCu() != null
						&& castOther.getTenNgGocCu() != null && this.getTenNgGocCu().equals(castOther.getTenNgGocCu())))
				&& ((this.getTenNgGocXeMoi() == castOther.getTenNgGocXeMoi())
						|| (this.getTenNgGocXeMoi() != null && castOther.getTenNgGocXeMoi() != null
								&& this.getTenNgGocXeMoi().equals(castOther.getTenNgGocXeMoi())))
				&& ((this.getMaNgGocXeMoi() == castOther.getMaNgGocXeMoi())
						|| (this.getMaNgGocXeMoi() != null && castOther.getMaNgGocXeMoi() != null
								&& this.getMaNgGocXeMoi().equals(castOther.getMaNgGocXeMoi())))
				&& ((this.getMauBien() == castOther.getMauBien()) || (this.getMauBien() != null
						&& castOther.getMauBien() != null && this.getMauBien().equals(castOther.getMauBien())))
				&& ((this.getIdMauMoi() == castOther.getIdMauMoi()) || (this.getIdMauMoi() != null
						&& castOther.getIdMauMoi() != null && this.getIdMauMoi().equals(castOther.getIdMauMoi())))
				&& ((this.getMotoId() == castOther.getMotoId()) || (this.getMotoId() != null
						&& castOther.getMotoId() != null && this.getMotoId().equals(castOther.getMotoId())))
				&& ((this.getDungTichMoi() == castOther.getDungTichMoi())
						|| (this.getDungTichMoi() != null && castOther.getDungTichMoi() != null
								&& this.getDungTichMoi().equals(castOther.getDungTichMoi())))
				&& ((this.getDauBienTheoTinh() == castOther.getDauBienTheoTinh())
						|| (this.getDauBienTheoTinh() != null && castOther.getDauBienTheoTinh() != null
								&& this.getDauBienTheoTinh().equals(castOther.getDauBienTheoTinh())))
				&& ((this.getBiensoQuocgiaId() == castOther.getBiensoQuocgiaId())
						|| (this.getBiensoQuocgiaId() != null && castOther.getBiensoQuocgiaId() != null
								&& this.getBiensoQuocgiaId().equals(castOther.getBiensoQuocgiaId())))
				&& ((this.getBiensoQuocgia() == castOther.getBiensoQuocgia())
						|| (this.getBiensoQuocgia() != null && castOther.getBiensoQuocgia() != null
								&& this.getBiensoQuocgia().equals(castOther.getBiensoQuocgia())))
				&& ((this.getTrangthaiDangky() == castOther.getTrangthaiDangky())
						|| (this.getTrangthaiDangky() != null && castOther.getTrangthaiDangky() != null
								&& this.getTrangthaiDangky().equals(castOther.getTrangthaiDangky())))
				&& ((this.getTrangthaiHoso() == castOther.getTrangthaiHoso())
						|| (this.getTrangthaiHoso() != null && castOther.getTrangthaiHoso() != null
								&& this.getTrangthaiHoso().equals(castOther.getTrangthaiHoso())))
				&& ((this.getSeriChu() == castOther.getSeriChu()) || (this.getSeriChu() != null
						&& castOther.getSeriChu() != null && this.getSeriChu().equals(castOther.getSeriChu())))
				&& ((this.getTrangThaiCd() == castOther.getTrangThaiCd())
						|| (this.getTrangThaiCd() != null && castOther.getTrangThaiCd() != null
								&& this.getTrangThaiCd().equals(castOther.getTrangThaiCd())))
				&& ((this.getDienGiaiTrangThai() == castOther.getDienGiaiTrangThai())
						|| (this.getDienGiaiTrangThai() != null && castOther.getDienGiaiTrangThai() != null
								&& this.getDienGiaiTrangThai().equals(castOther.getDienGiaiTrangThai())))
				&& ((this.getLoiChuyenDoi() == castOther.getLoiChuyenDoi())
						|| (this.getLoiChuyenDoi() != null && castOther.getLoiChuyenDoi() != null
								&& this.getLoiChuyenDoi().equals(castOther.getLoiChuyenDoi())))
				&& ((this.getQuocGiaId() == castOther.getQuocGiaId()) || (this.getQuocGiaId() != null
						&& castOther.getQuocGiaId() != null && this.getQuocGiaId().equals(castOther.getQuocGiaId())))
				&& ((this.getDiaDanhHc() == castOther.getDiaDanhHc()) || (this.getDiaDanhHc() != null
						&& castOther.getDiaDanhHc() != null && this.getDiaDanhHc().equals(castOther.getDiaDanhHc())))
				&& ((this.getTrangThaiXe() == castOther.getTrangThaiXe())
						|| (this.getTrangThaiXe() != null && castOther.getTrangThaiXe() != null
								&& this.getTrangThaiXe().equals(castOther.getTrangThaiXe())))
				&& ((this.getDiaDanhHanhChinhId() == castOther.getDiaDanhHanhChinhId())
						|| (this.getDiaDanhHanhChinhId() != null && castOther.getDiaDanhHanhChinhId() != null
								&& this.getDiaDanhHanhChinhId().equals(castOther.getDiaDanhHanhChinhId())))
				&& ((this.getBienSoTrunc() == castOther.getBienSoTrunc())
						|| (this.getBienSoTrunc() != null && castOther.getBienSoTrunc() != null
								&& this.getBienSoTrunc().equals(castOther.getBienSoTrunc())))
				&& ((this.getBiensoDaydu() == castOther.getBiensoDaydu())
						|| (this.getBiensoDaydu() != null && castOther.getBiensoDaydu() != null
								&& this.getBiensoDaydu().equals(castOther.getBiensoDaydu())))
				&& ((this.getNoiCapChungTu() == castOther.getNoiCapChungTu())
						|| (this.getNoiCapChungTu() != null && castOther.getNoiCapChungTu() != null
								&& this.getNoiCapChungTu().equals(castOther.getNoiCapChungTu())))
				&& ((this.getSoChungTu() == castOther.getSoChungTu()) || (this.getSoChungTu() != null
						&& castOther.getSoChungTu() != null && this.getSoChungTu().equals(castOther.getSoChungTu())))
				&& ((this.getNgayCapNhat() == castOther.getNgayCapNhat())
						|| (this.getNgayCapNhat() != null && castOther.getNgayCapNhat() != null
								&& this.getNgayCapNhat().equals(castOther.getNgayCapNhat())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBien() == null ? 0 : this.getBien().hashCode());
		result = 37 * result + (getNgayDk() == null ? 0 : this.getNgayDk().hashCode());
		result = 37 * result + (getBienCu() == null ? 0 : this.getBienCu().hashCode());
		result = 37 * result + (getChuXe() == null ? 0 : this.getChuXe().hashCode());
		result = 37 * result + (getSoCmnd() == null ? 0 : this.getSoCmnd().hashCode());
		result = 37 * result + (getDiaChi() == null ? 0 : this.getDiaChi().hashCode());
		result = 37 * result + (getNhanHieu() == null ? 0 : this.getNhanHieu().hashCode());
		result = 37 * result + (getSoLoai() == null ? 0 : this.getSoLoai().hashCode());
		result = 37 * result + (getCm() == null ? 0 : this.getCm().hashCode());
		result = 37 * result + (getLoaixe() == null ? 0 : this.getLoaixe().hashCode());
		result = 37 * result + (getSoMay() == null ? 0 : this.getSoMay().hashCode());
		result = 37 * result + (getSoKhung() == null ? 0 : this.getSoKhung().hashCode());
		result = 37 * result + (getMau() == null ? 0 : this.getMau().hashCode());
		result = 37 * result + (getSoHq() == null ? 0 : this.getSoHq().hashCode());
		result = 37 * result + (getBoSung() == null ? 0 : this.getBoSung().hashCode());
		result = 37 * result + (getGhiChu() == null ? 0 : this.getGhiChu().hashCode());
		result = 37 * result + (getNgaynhap() == null ? 0 : this.getNgaynhap().hashCode());
		result = 37 * result + (getSoSeri() == null ? 0 : this.getSoSeri().hashCode());
		result = 37 * result + (getSoTem() == null ? 0 : this.getSoTem().hashCode());
		result = 37 * result + (getNguonGoc() == null ? 0 : this.getNguonGoc().hashCode());
		result = 37 * result + (getSoHuu() == null ? 0 : this.getSoHuu().hashCode());
		result = 37 * result + (getTonTai() == null ? 0 : this.getTonTai().hashCode());
		result = 37 * result + (getVeViec() == null ? 0 : this.getVeViec().hashCode());
		result = 37 * result + (getNgayCmnd() == null ? 0 : this.getNgayCmnd().hashCode());
		result = 37 * result + (getNgayDkd() == null ? 0 : this.getNgayDkd().hashCode());
		result = 37 * result + (getNgayBs() == null ? 0 : this.getNgayBs().hashCode());
		result = 37 * result + (getSonguoi() == null ? 0 : this.getSonguoi().hashCode());
		result = 37 * result + (getCongsuat() == null ? 0 : this.getCongsuat().hashCode());
		result = 37 * result + (getNsxuat() == null ? 0 : this.getNsxuat().hashCode());
		result = 37 * result + (getTtrong() == null ? 0 : this.getTtrong().hashCode());
		result = 37 * result + (getHhoa() == null ? 0 : this.getHhoa().hashCode());
		result = 37 * result + (getNgayHh() == null ? 0 : this.getNgayHh().hashCode());
		result = 37 * result + (getConvertDate() == null ? 0 : this.getConvertDate().hashCode());
		result = 37 * result + (getDataOfUnit() == null ? 0 : this.getDataOfUnit().hashCode());
		result = 37 * result + (getMigrationDate() == null ? 0 : this.getMigrationDate().hashCode());
		result = 37 * result + (getAction() == null ? 0 : this.getAction().hashCode());
		result = 37 * result + (getNote() == null ? 0 : this.getNote().hashCode());
		result = 37 * result + (getTenPlQlyCu() == null ? 0 : this.getTenPlQlyCu().hashCode());
		result = 37 * result + (getTenPlQlyMoi() == null ? 0 : this.getTenPlQlyMoi().hashCode());
		result = 37 * result + (getPhanLoaiQlyId() == null ? 0 : this.getPhanLoaiQlyId().hashCode());
		result = 37 * result + (getTenNHieuCu() == null ? 0 : this.getTenNHieuCu().hashCode());
		result = 37 * result + (getTenNHieuMoi() == null ? 0 : this.getTenNHieuMoi().hashCode());
		result = 37 * result + (getIdNhanHieuMoi() == null ? 0 : this.getIdNhanHieuMoi().hashCode());
		result = 37 * result + (getIdLoaiXeMoi() == null ? 0 : this.getIdLoaiXeMoi().hashCode());
		result = 37 * result + (getTenNgGocCu() == null ? 0 : this.getTenNgGocCu().hashCode());
		result = 37 * result + (getTenNgGocXeMoi() == null ? 0 : this.getTenNgGocXeMoi().hashCode());
		result = 37 * result + (getMaNgGocXeMoi() == null ? 0 : this.getMaNgGocXeMoi().hashCode());
		result = 37 * result + (getMauBien() == null ? 0 : this.getMauBien().hashCode());
		result = 37 * result + (getIdMauMoi() == null ? 0 : this.getIdMauMoi().hashCode());
		result = 37 * result + (getMotoId() == null ? 0 : this.getMotoId().hashCode());
		result = 37 * result + (getDungTichMoi() == null ? 0 : this.getDungTichMoi().hashCode());
		result = 37 * result + (getDauBienTheoTinh() == null ? 0 : this.getDauBienTheoTinh().hashCode());
		result = 37 * result + (getBiensoQuocgiaId() == null ? 0 : this.getBiensoQuocgiaId().hashCode());
		result = 37 * result + (getBiensoQuocgia() == null ? 0 : this.getBiensoQuocgia().hashCode());
		result = 37 * result + (getTrangthaiDangky() == null ? 0 : this.getTrangthaiDangky().hashCode());
		result = 37 * result + (getTrangthaiHoso() == null ? 0 : this.getTrangthaiHoso().hashCode());
		result = 37 * result + (getSeriChu() == null ? 0 : this.getSeriChu().hashCode());
		result = 37 * result + (getTrangThaiCd() == null ? 0 : this.getTrangThaiCd().hashCode());
		result = 37 * result + (getDienGiaiTrangThai() == null ? 0 : this.getDienGiaiTrangThai().hashCode());
		result = 37 * result + (getLoiChuyenDoi() == null ? 0 : this.getLoiChuyenDoi().hashCode());
		result = 37 * result + (getQuocGiaId() == null ? 0 : this.getQuocGiaId().hashCode());
		result = 37 * result + (getDiaDanhHc() == null ? 0 : this.getDiaDanhHc().hashCode());
		result = 37 * result + (getTrangThaiXe() == null ? 0 : this.getTrangThaiXe().hashCode());
		result = 37 * result + (getDiaDanhHanhChinhId() == null ? 0 : this.getDiaDanhHanhChinhId().hashCode());
		result = 37 * result + (getBienSoTrunc() == null ? 0 : this.getBienSoTrunc().hashCode());
		result = 37 * result + (getBiensoDaydu() == null ? 0 : this.getBiensoDaydu().hashCode());
		result = 37 * result + (getNoiCapChungTu() == null ? 0 : this.getNoiCapChungTu().hashCode());
		result = 37 * result + (getSoChungTu() == null ? 0 : this.getSoChungTu().hashCode());
		result = 37 * result + (getNgayCapNhat() == null ? 0 : this.getNgayCapNhat().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		return result;
	}

}
