package com.etc.bca_moto.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewQd13Tv13Id
 */
@Embeddable
public class ViewQd13Tv13Id implements java.io.Serializable {

	private long id;
	private String soQuyetDinh;
	private Long donViCanhsatGtId;
	private String tenCqCapTren;
	private Long diaDanhHcId;
	private Date ngayLapBbVphc;
	private Long qd11Id;
	private Long bbVphc43Id;
	private Long bbXm34Id;
	private String bbVphcSo;
	private Date bbVphcNgay;
	private String canCuBbXmSo;
	private Date canCuBbXmNgay;
	private String canCuQdGqxpSo;
	private Date canCuQdGqxpNgay;
	private String capBac;
	private String chucVu;
	private String donVi;
	private Long tv13Id;
	private String lyDoTieuHuy;
	private String diaDiemTieuHuy;
	private String thoiGianThucHien;
	private String thanhPhanThamGia;
	private String toChucThucHien;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long cbxlId;
	private Long idNam;
	private Long tinhThanhPhoId;
	private Long namTaoQd;
	private Long nhapBb;
	private Long trangThai;
	private Long soBb43Tc;
	private long idTvtg;
	private long soQd13;
	private Long indexTvtg;
	private String loaiTvtg;
	private Long soLuong;
	private String donViTinh;
	private String ghiChuTvtg;
	private String tinhTrang;
	private String soTvtg;

	public ViewQd13Tv13Id() {
	}

	@Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getSoQuyetDinh() {
		return this.soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	@Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDonViCanhsatGtId() {
		return this.donViCanhsatGtId;
	}

	public void setDonViCanhsatGtId(Long donViCanhsatGtId) {
		this.donViCanhsatGtId = donViCanhsatGtId;
	}

	@Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Column(name = "NGAY_LAP_BB_VPHC", columnDefinition = "DATE", length = 7)
	public Date getNgayLapBbVphc() {
		return this.ngayLapBbVphc;
	}

	public void setNgayLapBbVphc(Date ngayLapBbVphc) {
		this.ngayLapBbVphc = ngayLapBbVphc;
	}

	@Column(name = "QD_11_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getQd11Id() {
		return this.qd11Id;
	}

	public void setQd11Id(Long qd11Id) {
		this.qd11Id = qd11Id;
	}

	@Column(name = "BB_VPHC43_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBbVphc43Id() {
		return this.bbVphc43Id;
	}

	public void setBbVphc43Id(Long bbVphc43Id) {
		this.bbVphc43Id = bbVphc43Id;
	}

	@Column(name = "BB_XM34_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getBbXm34Id() {
		return this.bbXm34Id;
	}

	public void setBbXm34Id(Long bbXm34Id) {
		this.bbXm34Id = bbXm34Id;
	}

	@Column(name = "BB_VPHC_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getBbVphcSo() {
		return this.bbVphcSo;
	}

	public void setBbVphcSo(String bbVphcSo) {
		this.bbVphcSo = bbVphcSo;
	}

	@Column(name = "BB_VPHC_NGAY", columnDefinition = "DATE", length = 7)
	public Date getBbVphcNgay() {
		return this.bbVphcNgay;
	}

	public void setBbVphcNgay(Date bbVphcNgay) {
		this.bbVphcNgay = bbVphcNgay;
	}

	@Column(name = "CAN_CU_BB_XM_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuBbXmSo() {
		return this.canCuBbXmSo;
	}

	public void setCanCuBbXmSo(String canCuBbXmSo) {
		this.canCuBbXmSo = canCuBbXmSo;
	}

	@Column(name = "CAN_CU_BB_XM_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuBbXmNgay() {
		return this.canCuBbXmNgay;
	}

	public void setCanCuBbXmNgay(Date canCuBbXmNgay) {
		this.canCuBbXmNgay = canCuBbXmNgay;
	}

	@Column(name = "CAN_CU_QD_GQXP_SO", columnDefinition = "VARCHAR2", length = 100)
	public String getCanCuQdGqxpSo() {
		return this.canCuQdGqxpSo;
	}

	public void setCanCuQdGqxpSo(String canCuQdGqxpSo) {
		this.canCuQdGqxpSo = canCuQdGqxpSo;
	}

	@Column(name = "CAN_CU_QD_GQXP_NGAY", columnDefinition = "DATE", length = 7)
	public Date getCanCuQdGqxpNgay() {
		return this.canCuQdGqxpNgay;
	}

	public void setCanCuQdGqxpNgay(Date canCuQdGqxpNgay) {
		this.canCuQdGqxpNgay = canCuQdGqxpNgay;
	}

	@Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 60)
	public String getCapBac() {
		return this.capBac;
	}

	public void setCapBac(String capBac) {
		this.capBac = capBac;
	}

	@Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 60)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Column(name = "TV_13_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTv13Id() {
		return this.tv13Id;
	}

	public void setTv13Id(Long tv13Id) {
		this.tv13Id = tv13Id;
	}

	@Column(name = "LY_DO_TIEU_HUY", columnDefinition = "VARCHAR2", length = 250)
	public String getLyDoTieuHuy() {
		return this.lyDoTieuHuy;
	}

	public void setLyDoTieuHuy(String lyDoTieuHuy) {
		this.lyDoTieuHuy = lyDoTieuHuy;
	}

	@Column(name = "DIA_DIEM_TIEU_HUY", columnDefinition = "VARCHAR2", length = 250)
	public String getDiaDiemTieuHuy() {
		return this.diaDiemTieuHuy;
	}

	public void setDiaDiemTieuHuy(String diaDiemTieuHuy) {
		this.diaDiemTieuHuy = diaDiemTieuHuy;
	}

	@Column(name = "THOI_GIAN_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getThoiGianThucHien() {
		return this.thoiGianThucHien;
	}

	public void setThoiGianThucHien(String thoiGianThucHien) {
		this.thoiGianThucHien = thoiGianThucHien;
	}

	@Column(name = "THANH_PHAN_THAM_GIA", columnDefinition = "VARCHAR2", length = 100)
	public String getThanhPhanThamGia() {
		return this.thanhPhanThamGia;
	}

	public void setThanhPhanThamGia(String thanhPhanThamGia) {
		this.thanhPhanThamGia = thanhPhanThamGia;
	}

	@Column(name = "TO_CHUC_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getToChucThucHien() {
		return this.toChucThucHien;
	}

	public void setToChucThucHien(String toChucThucHien) {
		this.toChucThucHien = toChucThucHien;
	}

	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(Long nguoiSua) {
		this.nguoiSua = nguoiSua;
	}

	@Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)
	public Date getNgaySua() {
		return this.ngaySua;
	}

	public void setNgaySua(Date ngaySua) {
		this.ngaySua = ngaySua;
	}

	@Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCbxlId() {
		return this.cbxlId;
	}

	public void setCbxlId(Long cbxlId) {
		this.cbxlId = cbxlId;
	}

	@Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getIdNam() {
		return this.idNam;
	}

	public void setIdNam(Long idNam) {
		this.idNam = idNam;
	}

	@Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTinhThanhPhoId() {
		return this.tinhThanhPhoId;
	}

	public void setTinhThanhPhoId(Long tinhThanhPhoId) {
		this.tinhThanhPhoId = tinhThanhPhoId;
	}

	@Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNamTaoQd() {
		return this.namTaoQd;
	}

	public void setNamTaoQd(Long namTaoQd) {
		this.namTaoQd = namTaoQd;
	}

	@Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getNhapBb() {
		return this.nhapBb;
	}

	public void setNhapBb(Long nhapBb) {
		this.nhapBb = nhapBb;
	}

	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoBb43Tc() {
		return this.soBb43Tc;
	}

	public void setSoBb43Tc(Long soBb43Tc) {
		this.soBb43Tc = soBb43Tc;
	}

	@Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getIdTvtg() {
		return this.idTvtg;
	}

	public void setIdTvtg(long idTvtg) {
		this.idTvtg = idTvtg;
	}

	@Column(name = "SO_QD_13", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)
	public long getSoQd13() {
		return this.soQd13;
	}

	public void setSoQd13(long soQd13) {
		this.soQd13 = soQd13;
	}

	@Column(name = "INDEX_TVTG", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getIndexTvtg() {
		return this.indexTvtg;
	}

	public void setIndexTvtg(Long indexTvtg) {
		this.indexTvtg = indexTvtg;
	}

	@Column(name = "LOAI_TVTG", columnDefinition = "VARCHAR2", length = 50)
	public String getLoaiTvtg() {
		return this.loaiTvtg;
	}

	public void setLoaiTvtg(String loaiTvtg) {
		this.loaiTvtg = loaiTvtg;
	}

	@Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(Long soLuong) {
		this.soLuong = soLuong;
	}

	@Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)
	public String getDonViTinh() {
		return this.donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	@Column(name = "GHI_CHU_TVTG", columnDefinition = "VARCHAR2")
	public String getGhiChuTvtg() {
		return this.ghiChuTvtg;
	}

	public void setGhiChuTvtg(String ghiChuTvtg) {
		this.ghiChuTvtg = ghiChuTvtg;
	}

	@Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)
	public String getTinhTrang() {
		return this.tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Column(name = "SO_TVTG", columnDefinition = "VARCHAR2", length = 50)
	public String getSoTvtg() {
		return this.soTvtg;
	}

	public void setSoTvtg(String soTvtg) {
		this.soTvtg = soTvtg;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewQd13Tv13Id))
			return false;
		ViewQd13Tv13Id castOther = (ViewQd13Tv13Id) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSoQuyetDinh() == castOther.getSoQuyetDinh())
						|| (this.getSoQuyetDinh() != null && castOther.getSoQuyetDinh() != null
								&& this.getSoQuyetDinh().equals(castOther.getSoQuyetDinh())))
				&& ((this.getDonViCanhsatGtId() == castOther.getDonViCanhsatGtId())
						|| (this.getDonViCanhsatGtId() != null && castOther.getDonViCanhsatGtId() != null
								&& this.getDonViCanhsatGtId().equals(castOther.getDonViCanhsatGtId())))
				&& ((this.getTenCqCapTren() == castOther.getTenCqCapTren())
						|| (this.getTenCqCapTren() != null && castOther.getTenCqCapTren() != null
								&& this.getTenCqCapTren().equals(castOther.getTenCqCapTren())))
				&& ((this.getDiaDanhHcId() == castOther.getDiaDanhHcId())
						|| (this.getDiaDanhHcId() != null && castOther.getDiaDanhHcId() != null
								&& this.getDiaDanhHcId().equals(castOther.getDiaDanhHcId())))
				&& ((this.getNgayLapBbVphc() == castOther.getNgayLapBbVphc())
						|| (this.getNgayLapBbVphc() != null && castOther.getNgayLapBbVphc() != null
								&& this.getNgayLapBbVphc().equals(castOther.getNgayLapBbVphc())))
				&& ((this.getQd11Id() == castOther.getQd11Id()) || (this.getQd11Id() != null
						&& castOther.getQd11Id() != null && this.getQd11Id().equals(castOther.getQd11Id())))
				&& ((this.getBbVphc43Id() == castOther.getBbVphc43Id()) || (this.getBbVphc43Id() != null
						&& castOther.getBbVphc43Id() != null && this.getBbVphc43Id().equals(castOther.getBbVphc43Id())))
				&& ((this.getBbXm34Id() == castOther.getBbXm34Id()) || (this.getBbXm34Id() != null
						&& castOther.getBbXm34Id() != null && this.getBbXm34Id().equals(castOther.getBbXm34Id())))
				&& ((this.getBbVphcSo() == castOther.getBbVphcSo()) || (this.getBbVphcSo() != null
						&& castOther.getBbVphcSo() != null && this.getBbVphcSo().equals(castOther.getBbVphcSo())))
				&& ((this.getBbVphcNgay() == castOther.getBbVphcNgay()) || (this.getBbVphcNgay() != null
						&& castOther.getBbVphcNgay() != null && this.getBbVphcNgay().equals(castOther.getBbVphcNgay())))
				&& ((this.getCanCuBbXmSo() == castOther.getCanCuBbXmSo())
						|| (this.getCanCuBbXmSo() != null && castOther.getCanCuBbXmSo() != null
								&& this.getCanCuBbXmSo().equals(castOther.getCanCuBbXmSo())))
				&& ((this.getCanCuBbXmNgay() == castOther.getCanCuBbXmNgay())
						|| (this.getCanCuBbXmNgay() != null && castOther.getCanCuBbXmNgay() != null
								&& this.getCanCuBbXmNgay().equals(castOther.getCanCuBbXmNgay())))
				&& ((this.getCanCuQdGqxpSo() == castOther.getCanCuQdGqxpSo())
						|| (this.getCanCuQdGqxpSo() != null && castOther.getCanCuQdGqxpSo() != null
								&& this.getCanCuQdGqxpSo().equals(castOther.getCanCuQdGqxpSo())))
				&& ((this.getCanCuQdGqxpNgay() == castOther.getCanCuQdGqxpNgay())
						|| (this.getCanCuQdGqxpNgay() != null && castOther.getCanCuQdGqxpNgay() != null
								&& this.getCanCuQdGqxpNgay().equals(castOther.getCanCuQdGqxpNgay())))
				&& ((this.getCapBac() == castOther.getCapBac()) || (this.getCapBac() != null
						&& castOther.getCapBac() != null && this.getCapBac().equals(castOther.getCapBac())))
				&& ((this.getChucVu() == castOther.getChucVu()) || (this.getChucVu() != null
						&& castOther.getChucVu() != null && this.getChucVu().equals(castOther.getChucVu())))
				&& ((this.getDonVi() == castOther.getDonVi()) || (this.getDonVi() != null
						&& castOther.getDonVi() != null && this.getDonVi().equals(castOther.getDonVi())))
				&& ((this.getTv13Id() == castOther.getTv13Id()) || (this.getTv13Id() != null
						&& castOther.getTv13Id() != null && this.getTv13Id().equals(castOther.getTv13Id())))
				&& ((this.getLyDoTieuHuy() == castOther.getLyDoTieuHuy())
						|| (this.getLyDoTieuHuy() != null && castOther.getLyDoTieuHuy() != null
								&& this.getLyDoTieuHuy().equals(castOther.getLyDoTieuHuy())))
				&& ((this.getDiaDiemTieuHuy() == castOther.getDiaDiemTieuHuy())
						|| (this.getDiaDiemTieuHuy() != null && castOther.getDiaDiemTieuHuy() != null
								&& this.getDiaDiemTieuHuy().equals(castOther.getDiaDiemTieuHuy())))
				&& ((this.getThoiGianThucHien() == castOther.getThoiGianThucHien())
						|| (this.getThoiGianThucHien() != null && castOther.getThoiGianThucHien() != null
								&& this.getThoiGianThucHien().equals(castOther.getThoiGianThucHien())))
				&& ((this.getThanhPhanThamGia() == castOther.getThanhPhanThamGia())
						|| (this.getThanhPhanThamGia() != null && castOther.getThanhPhanThamGia() != null
								&& this.getThanhPhanThamGia().equals(castOther.getThanhPhanThamGia())))
				&& ((this.getToChucThucHien() == castOther.getToChucThucHien())
						|| (this.getToChucThucHien() != null && castOther.getToChucThucHien() != null
								&& this.getToChucThucHien().equals(castOther.getToChucThucHien())))
				&& ((this.getNguoiTao() == castOther.getNguoiTao()) || (this.getNguoiTao() != null
						&& castOther.getNguoiTao() != null && this.getNguoiTao().equals(castOther.getNguoiTao())))
				&& ((this.getNgayTao() == castOther.getNgayTao()) || (this.getNgayTao() != null
						&& castOther.getNgayTao() != null && this.getNgayTao().equals(castOther.getNgayTao())))
				&& ((this.getNguoiSua() == castOther.getNguoiSua()) || (this.getNguoiSua() != null
						&& castOther.getNguoiSua() != null && this.getNguoiSua().equals(castOther.getNguoiSua())))
				&& ((this.getNgaySua() == castOther.getNgaySua()) || (this.getNgaySua() != null
						&& castOther.getNgaySua() != null && this.getNgaySua().equals(castOther.getNgaySua())))
				&& ((this.getCbxlId() == castOther.getCbxlId()) || (this.getCbxlId() != null
						&& castOther.getCbxlId() != null && this.getCbxlId().equals(castOther.getCbxlId())))
				&& ((this.getIdNam() == castOther.getIdNam()) || (this.getIdNam() != null
						&& castOther.getIdNam() != null && this.getIdNam().equals(castOther.getIdNam())))
				&& ((this.getTinhThanhPhoId() == castOther.getTinhThanhPhoId())
						|| (this.getTinhThanhPhoId() != null && castOther.getTinhThanhPhoId() != null
								&& this.getTinhThanhPhoId().equals(castOther.getTinhThanhPhoId())))
				&& ((this.getNamTaoQd() == castOther.getNamTaoQd()) || (this.getNamTaoQd() != null
						&& castOther.getNamTaoQd() != null && this.getNamTaoQd().equals(castOther.getNamTaoQd())))
				&& ((this.getNhapBb() == castOther.getNhapBb()) || (this.getNhapBb() != null
						&& castOther.getNhapBb() != null && this.getNhapBb().equals(castOther.getNhapBb())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())))
				&& ((this.getSoBb43Tc() == castOther.getSoBb43Tc()) || (this.getSoBb43Tc() != null
						&& castOther.getSoBb43Tc() != null && this.getSoBb43Tc().equals(castOther.getSoBb43Tc())))
				&& (this.getIdTvtg() == castOther.getIdTvtg()) && (this.getSoQd13() == castOther.getSoQd13())
				&& ((this.getIndexTvtg() == castOther.getIndexTvtg()) || (this.getIndexTvtg() != null
						&& castOther.getIndexTvtg() != null && this.getIndexTvtg().equals(castOther.getIndexTvtg())))
				&& ((this.getLoaiTvtg() == castOther.getLoaiTvtg()) || (this.getLoaiTvtg() != null
						&& castOther.getLoaiTvtg() != null && this.getLoaiTvtg().equals(castOther.getLoaiTvtg())))
				&& ((this.getSoLuong() == castOther.getSoLuong()) || (this.getSoLuong() != null
						&& castOther.getSoLuong() != null && this.getSoLuong().equals(castOther.getSoLuong())))
				&& ((this.getDonViTinh() == castOther.getDonViTinh()) || (this.getDonViTinh() != null
						&& castOther.getDonViTinh() != null && this.getDonViTinh().equals(castOther.getDonViTinh())))
				&& ((this.getGhiChuTvtg() == castOther.getGhiChuTvtg()) || (this.getGhiChuTvtg() != null
						&& castOther.getGhiChuTvtg() != null && this.getGhiChuTvtg().equals(castOther.getGhiChuTvtg())))
				&& ((this.getTinhTrang() == castOther.getTinhTrang()) || (this.getTinhTrang() != null
						&& castOther.getTinhTrang() != null && this.getTinhTrang().equals(castOther.getTinhTrang())))
				&& ((this.getSoTvtg() == castOther.getSoTvtg()) || (this.getSoTvtg() != null
						&& castOther.getSoTvtg() != null && this.getSoTvtg().equals(castOther.getSoTvtg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getId();
		result = 37 * result + (getSoQuyetDinh() == null ? 0 : this.getSoQuyetDinh().hashCode());
		result = 37 * result + (getDonViCanhsatGtId() == null ? 0 : this.getDonViCanhsatGtId().hashCode());
		result = 37 * result + (getTenCqCapTren() == null ? 0 : this.getTenCqCapTren().hashCode());
		result = 37 * result + (getDiaDanhHcId() == null ? 0 : this.getDiaDanhHcId().hashCode());
		result = 37 * result + (getNgayLapBbVphc() == null ? 0 : this.getNgayLapBbVphc().hashCode());
		result = 37 * result + (getQd11Id() == null ? 0 : this.getQd11Id().hashCode());
		result = 37 * result + (getBbVphc43Id() == null ? 0 : this.getBbVphc43Id().hashCode());
		result = 37 * result + (getBbXm34Id() == null ? 0 : this.getBbXm34Id().hashCode());
		result = 37 * result + (getBbVphcSo() == null ? 0 : this.getBbVphcSo().hashCode());
		result = 37 * result + (getBbVphcNgay() == null ? 0 : this.getBbVphcNgay().hashCode());
		result = 37 * result + (getCanCuBbXmSo() == null ? 0 : this.getCanCuBbXmSo().hashCode());
		result = 37 * result + (getCanCuBbXmNgay() == null ? 0 : this.getCanCuBbXmNgay().hashCode());
		result = 37 * result + (getCanCuQdGqxpSo() == null ? 0 : this.getCanCuQdGqxpSo().hashCode());
		result = 37 * result + (getCanCuQdGqxpNgay() == null ? 0 : this.getCanCuQdGqxpNgay().hashCode());
		result = 37 * result + (getCapBac() == null ? 0 : this.getCapBac().hashCode());
		result = 37 * result + (getChucVu() == null ? 0 : this.getChucVu().hashCode());
		result = 37 * result + (getDonVi() == null ? 0 : this.getDonVi().hashCode());
		result = 37 * result + (getTv13Id() == null ? 0 : this.getTv13Id().hashCode());
		result = 37 * result + (getLyDoTieuHuy() == null ? 0 : this.getLyDoTieuHuy().hashCode());
		result = 37 * result + (getDiaDiemTieuHuy() == null ? 0 : this.getDiaDiemTieuHuy().hashCode());
		result = 37 * result + (getThoiGianThucHien() == null ? 0 : this.getThoiGianThucHien().hashCode());
		result = 37 * result + (getThanhPhanThamGia() == null ? 0 : this.getThanhPhanThamGia().hashCode());
		result = 37 * result + (getToChucThucHien() == null ? 0 : this.getToChucThucHien().hashCode());
		result = 37 * result + (getNguoiTao() == null ? 0 : this.getNguoiTao().hashCode());
		result = 37 * result + (getNgayTao() == null ? 0 : this.getNgayTao().hashCode());
		result = 37 * result + (getNguoiSua() == null ? 0 : this.getNguoiSua().hashCode());
		result = 37 * result + (getNgaySua() == null ? 0 : this.getNgaySua().hashCode());
		result = 37 * result + (getCbxlId() == null ? 0 : this.getCbxlId().hashCode());
		result = 37 * result + (getIdNam() == null ? 0 : this.getIdNam().hashCode());
		result = 37 * result + (getTinhThanhPhoId() == null ? 0 : this.getTinhThanhPhoId().hashCode());
		result = 37 * result + (getNamTaoQd() == null ? 0 : this.getNamTaoQd().hashCode());
		result = 37 * result + (getNhapBb() == null ? 0 : this.getNhapBb().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		result = 37 * result + (getSoBb43Tc() == null ? 0 : this.getSoBb43Tc().hashCode());
		result = 37 * result + (int) this.getIdTvtg();
		result = 37 * result + (int) this.getSoQd13();
		result = 37 * result + (getIndexTvtg() == null ? 0 : this.getIndexTvtg().hashCode());
		result = 37 * result + (getLoaiTvtg() == null ? 0 : this.getLoaiTvtg().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonViTinh() == null ? 0 : this.getDonViTinh().hashCode());
		result = 37 * result + (getGhiChuTvtg() == null ? 0 : this.getGhiChuTvtg().hashCode());
		result = 37 * result + (getTinhTrang() == null ? 0 : this.getTinhTrang().hashCode());
		result = 37 * result + (getSoTvtg() == null ? 0 : this.getSoTvtg().hashCode());
		return result;
	}

}
