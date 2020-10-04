package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.HanhViViPhamDAO;
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
 * HanhViViPham
 */
@DAO(daoClass = HanhViViPhamDAO.class)
@Caption("{%maThamChieu}")
@Entity
@Table(name = "HANH_VI_VI_PHAM", schema = "BCA_MOTO")
public class HanhViViPham implements java.io.Serializable {

	private long id;
	private Long chaId;
	private long luatId;
	private String maThamChieu;
	private Long ma;
	private String noiDung;
	private Long soTienNhoNhat;
	private Long soTienLonNhat;
	private Long soTienMacDinh;
	private Long kieu;
	private Long loaiKhuVuc;
	private Date ngayHieuLuc;
	private Date ngayHetHl;
	private long trangThai;
	private long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private Long suaDoiId;
	private Long tcStnn;
	private Long tcStln;
	private Long tcStmd;
	private Long diaDanhHcId;
	private Long loaiPhuongTienId;
	private String luatThamChieu;
	private String tomTat;
	private String ghiChu;

	public HanhViViPham() {
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

	@Caption("ChaId")
	@Column(name = "CHA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getChaId() {
		return this.chaId;
	}

	public void setChaId(Long chaId) {
		this.chaId = chaId;
	}

	@Caption("LuatId")
	@Column(name = "LUAT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getLuatId() {
		return this.luatId;
	}

	public void setLuatId(long luatId) {
		this.luatId = luatId;
	}

	@Caption("MaThamChieu")
	@Column(name = "MA_THAM_CHIEU", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getMaThamChieu() {
		return this.maThamChieu;
	}

	public void setMaThamChieu(String maThamChieu) {
		this.maThamChieu = maThamChieu;
	}

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getMa() {
		return this.ma;
	}

	public void setMa(Long ma) {
		this.ma = ma;
	}

	@Caption("NoiDung")
	@Column(name = "NOI_DUNG", nullable = false, columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Caption("SoTienNhoNhat")
	@Column(name = "SO_TIEN_NHO_NHAT", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienNhoNhat() {
		return this.soTienNhoNhat;
	}

	public void setSoTienNhoNhat(Long soTienNhoNhat) {
		this.soTienNhoNhat = soTienNhoNhat;
	}

	@Caption("SoTienLonNhat")
	@Column(name = "SO_TIEN_LON_NHAT", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienLonNhat() {
		return this.soTienLonNhat;
	}

	public void setSoTienLonNhat(Long soTienLonNhat) {
		this.soTienLonNhat = soTienLonNhat;
	}

	@Caption("SoTienMacDinh")
	@Column(name = "SO_TIEN_MAC_DINH", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getSoTienMacDinh() {
		return this.soTienMacDinh;
	}

	public void setSoTienMacDinh(Long soTienMacDinh) {
		this.soTienMacDinh = soTienMacDinh;
	}

	@Caption("Kieu")
	@Column(name = "KIEU", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getKieu() {
		return this.kieu;
	}

	public void setKieu(Long kieu) {
		this.kieu = kieu;
	}

	@Caption("LoaiKhuVuc")
	@Column(name = "LOAI_KHU_VUC", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLoaiKhuVuc() {
		return this.loaiKhuVuc;
	}

	public void setLoaiKhuVuc(Long loaiKhuVuc) {
		this.loaiKhuVuc = loaiKhuVuc;
	}

	@Caption("NgayHieuLuc")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HIEU_LUC", columnDefinition = "DATE", length = 7)
	public Date getNgayHieuLuc() {
		return this.ngayHieuLuc;
	}

	public void setNgayHieuLuc(Date ngayHieuLuc) {
		this.ngayHieuLuc = ngayHieuLuc;
	}

	@Caption("NgayHetHl")
	@Temporal(TemporalType.DATE)
	@Column(name = "NGAY_HET_HL", columnDefinition = "DATE", length = 7)
	public Date getNgayHetHl() {
		return this.ngayHetHl;
	}

	public void setNgayHetHl(Date ngayHetHl) {
		this.ngayHetHl = ngayHetHl;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)
	public long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
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

	@Caption("SuaDoiId")
	@Column(name = "SUA_DOI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getSuaDoiId() {
		return this.suaDoiId;
	}

	public void setSuaDoiId(Long suaDoiId) {
		this.suaDoiId = suaDoiId;
	}

	@Caption("TcStnn")
	@Column(name = "TC_STNN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTcStnn() {
		return this.tcStnn;
	}

	public void setTcStnn(Long tcStnn) {
		this.tcStnn = tcStnn;
	}

	@Caption("TcStln")
	@Column(name = "TC_STLN", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTcStln() {
		return this.tcStln;
	}

	public void setTcStln(Long tcStln) {
		this.tcStln = tcStln;
	}

	@Caption("TcStmd")
	@Column(name = "TC_STMD", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getTcStmd() {
		return this.tcStmd;
	}

	public void setTcStmd(Long tcStmd) {
		this.tcStmd = tcStmd;
	}

	@Caption("DiaDanhHcId")
	@Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDiaDanhHcId() {
		return this.diaDanhHcId;
	}

	public void setDiaDanhHcId(Long diaDanhHcId) {
		this.diaDanhHcId = diaDanhHcId;
	}

	@Caption("LoaiPhuongTienId")
	@Column(name = "LOAI_PHUONG_TIEN_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLoaiPhuongTienId() {
		return this.loaiPhuongTienId;
	}

	public void setLoaiPhuongTienId(Long loaiPhuongTienId) {
		this.loaiPhuongTienId = loaiPhuongTienId;
	}

	@Caption("LuatThamChieu")
	@Column(name = "LUAT_THAM_CHIEU", columnDefinition = "VARCHAR2", length = 1000)
	public String getLuatThamChieu() {
		return this.luatThamChieu;
	}

	public void setLuatThamChieu(String luatThamChieu) {
		this.luatThamChieu = luatThamChieu;
	}

	@Caption("TomTat")
	@Column(name = "TOM_TAT", columnDefinition = "VARCHAR2", length = 1000)
	public String getTomTat() {
		return this.tomTat;
	}

	public void setTomTat(String tomTat) {
		this.tomTat = tomTat;
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
