package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.VuViecDAO;
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
 * VuViec
 */
@DAO(daoClass = VuViecDAO.class)
@Caption("{%tenCqCapTren}")
@Entity
@Table(name = "VU_VIEC", schema = "BCA_MOTO")
public class VuViec implements java.io.Serializable {

	private long id;
	private long maThamChieu;
	private String tenCqCapTren;
	private String tenDonVi;
	private String tenCanBo;
	private String thoiGianViPham;
	private Date ngayViPham;
	private String diaDiemViPham;
	private String capBacChucVu;
	private Long phanLoaiVuViec;
	private String hanhViViPham;
	private String tenDoiTuongVp;
	private String diaChiDtViPham;
	private Date ngaySinhDtViPham;
	private String quocTichDtViPham;
	private String ngheNghiepDtViPham;
	private String soCmndDtViPham;
	private Date ngayCapCmndDtvp;
	private String noiCapCmndDtvp;
	private String thoiGianGiaiQuyetVp;
	private Date ngayRaQuyetDinh;
	private Date ngayGiaiQuyetVp;
	private String diaDiemGqvp;
	private String loaiPhuongTien;
	private String bienKiemSoat;
	private String hinhThucXuPhat;
	private Long tongMucPhat;
	private String tongMucPhatBangChu;
	private Long kinhPhiKhacPhuc;
	private Long diaDanhHanhChinhId;
	private Long canBoXuLyId;
	private Long trangThaiVuViec;
	private String ghiChu;

	public VuViec() {
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

	@Caption("MaThamChieu")
	@Column(name = "MA_THAM_CHIEU", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)
	public long getMaThamChieu() {
		return this.maThamChieu;
	}

	public void setMaThamChieu(long maThamChieu) {
		this.maThamChieu = maThamChieu;
	}

	@Caption("TenCqCapTren")
	@Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 100)
	public String getTenCqCapTren() {
		return this.tenCqCapTren;
	}

	public void setTenCqCapTren(String tenCqCapTren) {
		this.tenCqCapTren = tenCqCapTren;
	}

	@Caption("TenDonVi")
	@Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 100)
	public String getTenDonVi() {
		return this.tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	@Caption("TenCanBo")
	@Column(name = "TEN_CAN_BO", columnDefinition = "VARCHAR2", length = 100)
	public String getTenCanBo() {
		return this.tenCanBo;
	}

	public void setTenCanBo(String tenCanBo) {
		this.tenCanBo = tenCanBo;
	}

	@Caption("ThoiGianViPham")
	@Column(name = "THOI_GIAN_VI_PHAM", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiGianViPham() {
		return this.thoiGianViPham;
	}

	public void setThoiGianViPham(String thoiGianViPham) {
		this.thoiGianViPham = thoiGianViPham;
	}

	@Caption("NgayViPham")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_VI_PHAM", columnDefinition = "DATE", length = 7)
	public Date getNgayViPham() {
		return this.ngayViPham;
	}

	public void setNgayViPham(Date ngayViPham) {
		this.ngayViPham = ngayViPham;
	}

	@Caption("DiaDiemViPham")
	@Column(name = "DIA_DIEM_VI_PHAM", columnDefinition = "VARCHAR2", length = 300)
	public String getDiaDiemViPham() {
		return this.diaDiemViPham;
	}

	public void setDiaDiemViPham(String diaDiemViPham) {
		this.diaDiemViPham = diaDiemViPham;
	}

	@Caption("CapBacChucVu")
	@Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)
	public String getCapBacChucVu() {
		return this.capBacChucVu;
	}

	public void setCapBacChucVu(String capBacChucVu) {
		this.capBacChucVu = capBacChucVu;
	}

	@Caption("PhanLoaiVuViec")
	@Column(name = "PHAN_LOAI_VU_VIEC", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getPhanLoaiVuViec() {
		return this.phanLoaiVuViec;
	}

	public void setPhanLoaiVuViec(Long phanLoaiVuViec) {
		this.phanLoaiVuViec = phanLoaiVuViec;
	}

	@Caption("HanhViViPham")
	@Column(name = "HANH_VI_VI_PHAM", columnDefinition = "VARCHAR2", length = 2000)
	public String getHanhViViPham() {
		return this.hanhViViPham;
	}

	public void setHanhViViPham(String hanhViViPham) {
		this.hanhViViPham = hanhViViPham;
	}

	@Caption("TenDoiTuongVp")
	@Column(name = "TEN_DOI_TUONG_VP", columnDefinition = "VARCHAR2", length = 100)
	public String getTenDoiTuongVp() {
		return this.tenDoiTuongVp;
	}

	public void setTenDoiTuongVp(String tenDoiTuongVp) {
		this.tenDoiTuongVp = tenDoiTuongVp;
	}

	@Caption("DiaChiDtViPham")
	@Column(name = "DIA_CHI_DT_VI_PHAM", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaChiDtViPham() {
		return this.diaChiDtViPham;
	}

	public void setDiaChiDtViPham(String diaChiDtViPham) {
		this.diaChiDtViPham = diaChiDtViPham;
	}

	@Caption("NgaySinhDtViPham")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_SINH_DT_VI_PHAM", columnDefinition = "DATE", length = 7)
	public Date getNgaySinhDtViPham() {
		return this.ngaySinhDtViPham;
	}

	public void setNgaySinhDtViPham(Date ngaySinhDtViPham) {
		this.ngaySinhDtViPham = ngaySinhDtViPham;
	}

	@Caption("QuocTichDtViPham")
	@Column(name = "QUOC_TICH_DT_VI_PHAM", columnDefinition = "VARCHAR2", length = 100)
	public String getQuocTichDtViPham() {
		return this.quocTichDtViPham;
	}

	public void setQuocTichDtViPham(String quocTichDtViPham) {
		this.quocTichDtViPham = quocTichDtViPham;
	}

	@Caption("NgheNghiepDtViPham")
	@Column(name = "NGHE_NGHIEP_DT_VI_PHAM", columnDefinition = "VARCHAR2", length = 100)
	public String getNgheNghiepDtViPham() {
		return this.ngheNghiepDtViPham;
	}

	public void setNgheNghiepDtViPham(String ngheNghiepDtViPham) {
		this.ngheNghiepDtViPham = ngheNghiepDtViPham;
	}

	@Caption("SoCmndDtViPham")
	@Column(name = "SO_CMND_DT_VI_PHAM", columnDefinition = "VARCHAR2", length = 20)
	public String getSoCmndDtViPham() {
		return this.soCmndDtViPham;
	}

	public void setSoCmndDtViPham(String soCmndDtViPham) {
		this.soCmndDtViPham = soCmndDtViPham;
	}

	@Caption("NgayCapCmndDtvp")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_CAP_CMND_DTVP", columnDefinition = "DATE", length = 7)
	public Date getNgayCapCmndDtvp() {
		return this.ngayCapCmndDtvp;
	}

	public void setNgayCapCmndDtvp(Date ngayCapCmndDtvp) {
		this.ngayCapCmndDtvp = ngayCapCmndDtvp;
	}

	@Caption("NoiCapCmndDtvp")
	@Column(name = "NOI_CAP_CMND_DTVP", columnDefinition = "VARCHAR2", length = 100)
	public String getNoiCapCmndDtvp() {
		return this.noiCapCmndDtvp;
	}

	public void setNoiCapCmndDtvp(String noiCapCmndDtvp) {
		this.noiCapCmndDtvp = noiCapCmndDtvp;
	}

	@Caption("ThoiGianGiaiQuyetVp")
	@Column(name = "THOI_GIAN_GIAI_QUYET_VP", columnDefinition = "VARCHAR2", length = 20)
	public String getThoiGianGiaiQuyetVp() {
		return this.thoiGianGiaiQuyetVp;
	}

	public void setThoiGianGiaiQuyetVp(String thoiGianGiaiQuyetVp) {
		this.thoiGianGiaiQuyetVp = thoiGianGiaiQuyetVp;
	}

	@Caption("NgayRaQuyetDinh")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_RA_QUYET_DINH", columnDefinition = "DATE", length = 7)
	public Date getNgayRaQuyetDinh() {
		return this.ngayRaQuyetDinh;
	}

	public void setNgayRaQuyetDinh(Date ngayRaQuyetDinh) {
		this.ngayRaQuyetDinh = ngayRaQuyetDinh;
	}

	@Caption("NgayGiaiQuyetVp")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_GIAI_QUYET_VP", columnDefinition = "DATE", length = 7)
	public Date getNgayGiaiQuyetVp() {
		return this.ngayGiaiQuyetVp;
	}

	public void setNgayGiaiQuyetVp(Date ngayGiaiQuyetVp) {
		this.ngayGiaiQuyetVp = ngayGiaiQuyetVp;
	}

	@Caption("DiaDiemGqvp")
	@Column(name = "DIA_DIEM_GQVP", columnDefinition = "VARCHAR2", length = 200)
	public String getDiaDiemGqvp() {
		return this.diaDiemGqvp;
	}

	public void setDiaDiemGqvp(String diaDiemGqvp) {
		this.diaDiemGqvp = diaDiemGqvp;
	}

	@Caption("LoaiPhuongTien")
	@Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 100)
	public String getLoaiPhuongTien() {
		return this.loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	@Caption("BienKiemSoat")
	@Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 30)
	public String getBienKiemSoat() {
		return this.bienKiemSoat;
	}

	public void setBienKiemSoat(String bienKiemSoat) {
		this.bienKiemSoat = bienKiemSoat;
	}

	@Caption("HinhThucXuPhat")
	@Column(name = "HINH_THUC_XU_PHAT", columnDefinition = "VARCHAR2", length = 100)
	public String getHinhThucXuPhat() {
		return this.hinhThucXuPhat;
	}

	public void setHinhThucXuPhat(String hinhThucXuPhat) {
		this.hinhThucXuPhat = hinhThucXuPhat;
	}

	@Caption("TongMucPhat")
	@Column(name = "TONG_MUC_PHAT", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTongMucPhat() {
		return this.tongMucPhat;
	}

	public void setTongMucPhat(Long tongMucPhat) {
		this.tongMucPhat = tongMucPhat;
	}

	@Caption("TongMucPhatBangChu")
	@Column(name = "TONG_MUC_PHAT_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getTongMucPhatBangChu() {
		return this.tongMucPhatBangChu;
	}

	public void setTongMucPhatBangChu(String tongMucPhatBangChu) {
		this.tongMucPhatBangChu = tongMucPhatBangChu;
	}

	@Caption("KinhPhiKhacPhuc")
	@Column(name = "KINH_PHI_KHAC_PHUC", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getKinhPhiKhacPhuc() {
		return this.kinhPhiKhacPhuc;
	}

	public void setKinhPhiKhacPhuc(Long kinhPhiKhacPhuc) {
		this.kinhPhiKhacPhuc = kinhPhiKhacPhuc;
	}

	@Caption("DiaDanhHanhChinhId")
	@Column(name = "DIA_DANH_HANH_CHINH_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getDiaDanhHanhChinhId() {
		return this.diaDanhHanhChinhId;
	}

	public void setDiaDanhHanhChinhId(Long diaDanhHanhChinhId) {
		this.diaDanhHanhChinhId = diaDanhHanhChinhId;
	}

	@Caption("CanBoXuLyId")
	@Column(name = "CAN_BO_XU_LY_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getCanBoXuLyId() {
		return this.canBoXuLyId;
	}

	public void setCanBoXuLyId(Long canBoXuLyId) {
		this.canBoXuLyId = canBoXuLyId;
	}

	@Caption("TrangThaiVuViec")
	@Column(name = "TRANG_THAI_VU_VIEC", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getTrangThaiVuViec() {
		return this.trangThaiVuViec;
	}

	public void setTrangThaiVuViec(Long trangThaiVuViec) {
		this.trangThaiVuViec = trangThaiVuViec;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
