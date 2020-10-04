package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DiaDanhHanhChinhDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * DiaDanhHanhChinh
 */
@DAO(daoClass = DiaDanhHanhChinhDAO.class)
@Caption("{%ma}")
@Entity
@Table(name = "DIA_DANH_HANH_CHINH", schema = "BCA_MOTO")
public class DiaDanhHanhChinh implements java.io.Serializable {

	private long id;
	private String ma;
	private String ten;
	private String ghiChu;
	private Long diadanhCaptren;
	private long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private boolean trangThaiKichHoat;
	private Boolean capHanhChinh;
	private String tenEn;
	private String tienTo;
	private String tienToVtat;
	private String maTongCucThongKe;
	private String maTinhThanh;
	private String maQuanHuyen;
	private String maPhuongXa;
	private String tenHieu;
	private String khuVuc;
	private Long ddResourceId;
	private List<DonViCanhsatGt> donViCanhsatGts = new ArrayList<>();
	public DiaDanhHanhChinh() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("Ma")
	@Column(name = "MA", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("Ten")
	@Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("DiadanhCaptren")
	@Column(name = "DIADANH_CAPTREN", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiadanhCaptren() {
		return this.diadanhCaptren;
	}

	public void setDiadanhCaptren(Long diadanhCaptren) {
		this.diadanhCaptren = diadanhCaptren;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(long nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	@Caption("NgayTao")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)
	public Date getNgayTao() {
		return this.ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	@Caption("NguoiSua")
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)
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

	@Caption("TrangThaiKichHoat")
	@Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)
	public boolean isTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(boolean trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Caption("CapHanhChinh")
	@Column(name = "CAP_HANH_CHINH", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getCapHanhChinh() {
		return this.capHanhChinh;
	}

	public void setCapHanhChinh(Boolean capHanhChinh) {
		this.capHanhChinh = capHanhChinh;
	}

	@Caption("TenEn")
	@Column(name = "TEN_EN", columnDefinition = "VARCHAR2", length = 50)
	public String getTenEn() {
		return this.tenEn;
	}

	public void setTenEn(String tenEn) {
		this.tenEn = tenEn;
	}

	@Caption("TienTo")
	@Column(name = "TIEN_TO", columnDefinition = "VARCHAR2", length = 50)
	public String getTienTo() {
		return this.tienTo;
	}

	public void setTienTo(String tienTo) {
		this.tienTo = tienTo;
	}

	@Caption("TienToVtat")
	@Column(name = "TIEN_TO_VTAT", columnDefinition = "VARCHAR2", length = 30)
	public String getTienToVtat() {
		return this.tienToVtat;
	}

	public void setTienToVtat(String tienToVtat) {
		this.tienToVtat = tienToVtat;
	}

	@Caption("MaTongCucThongKe")
	@Column(name = "MA_TONG_CUC_THONG_KE", columnDefinition = "VARCHAR2", length = 20)
	public String getMaTongCucThongKe() {
		return this.maTongCucThongKe;
	}

	public void setMaTongCucThongKe(String maTongCucThongKe) {
		this.maTongCucThongKe = maTongCucThongKe;
	}

	@Caption("MaTinhThanh")
	@Column(name = "MA_TINH_THANH", columnDefinition = "VARCHAR2", length = 20)
	public String getMaTinhThanh() {
		return this.maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}

	@Caption("MaQuanHuyen")
	@Column(name = "MA_QUAN_HUYEN", columnDefinition = "VARCHAR2", length = 20)
	public String getMaQuanHuyen() {
		return this.maQuanHuyen;
	}

	public void setMaQuanHuyen(String maQuanHuyen) {
		this.maQuanHuyen = maQuanHuyen;
	}

	@Caption("MaPhuongXa")
	@Column(name = "MA_PHUONG_XA", columnDefinition = "VARCHAR2", length = 20)
	public String getMaPhuongXa() {
		return this.maPhuongXa;
	}

	public void setMaPhuongXa(String maPhuongXa) {
		this.maPhuongXa = maPhuongXa;
	}

	@Caption("TenHieu")
	@Column(name = "TEN_HIEU", columnDefinition = "VARCHAR2", length = 50)
	public String getTenHieu() {
		return this.tenHieu;
	}

	public void setTenHieu(String tenHieu) {
		this.tenHieu = tenHieu;
	}

	@Caption("KhuVuc")
	@Column(name = "KHU_VUC", columnDefinition = "VARCHAR2", length = 50)
	public String getKhuVuc() {
		return this.khuVuc;
	}

	public void setKhuVuc(String khuVuc) {
		this.khuVuc = khuVuc;
	}

	@Caption("DdResourceId")
	@Column(name = "DD_RESOURCE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDdResourceId() {
		return this.ddResourceId;
	}

	public void setDdResourceId(Long ddResourceId) {
		this.ddResourceId = ddResourceId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "diaDanhHanhChinh")
	public List<DonViCanhsatGt> getDonViCanhsatGts() {
		return donViCanhsatGts;
	}

	public void setDonViCanhsatGts(List<DonViCanhsatGt> donViCanhsatGts) {
		this.donViCanhsatGts = donViCanhsatGts;
	}

	public DonViCanhsatGt addDonViCanhsatGt(DonViCanhsatGt donViCanhsatGt) {
		getDonViCanhsatGts().add(donViCanhsatGt);
		donViCanhsatGt.setDiaDanhHanhChinh(this);
		return donViCanhsatGt;
	}

	public DonViCanhsatGt removeDonViCanhsatGt(DonViCanhsatGt donViCanhsatGt) {
		getDonViCanhsatGts().remove(donViCanhsatGt);
		donViCanhsatGt.setDiaDanhHanhChinh(null);
		return donViCanhsatGt;
	}

}
