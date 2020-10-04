package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QuocLoTuyenduongDAO;
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
 * QuocLoTuyenduong
 */
@DAO(daoClass = QuocLoTuyenduongDAO.class)
@Caption("{%ma}")
@Entity
@Table(name = "QUOC_LO_TUYENDUONG", schema = "BCA_MOTO")
public class QuocLoTuyenduong implements java.io.Serializable {

	private long id;
	private Long chaId;
	private String ma;
	private String tenDuong;
	private String batDauTu;
	private String ketThucTai;
	private Double chieuDai;
	private Long kieu;
	private Long loaiKhuVuc;
	private String ghiChu;
	private Boolean trangThai;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;

	public QuocLoTuyenduong() {
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

	@Caption("ChaId")
	@Column(name = "CHA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getChaId() {
		return this.chaId;
	}

	public void setChaId(Long chaId) {
		this.chaId = chaId;
	}

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 100)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("TenDuong")
	@Column(name = "TEN_DUONG", columnDefinition = "VARCHAR2")
	public String getTenDuong() {
		return this.tenDuong;
	}

	public void setTenDuong(String tenDuong) {
		this.tenDuong = tenDuong;
	}

	@Caption("BatDauTu")
	@Column(name = "BAT_DAU_TU", columnDefinition = "VARCHAR2", length = 500)
	public String getBatDauTu() {
		return this.batDauTu;
	}

	public void setBatDauTu(String batDauTu) {
		this.batDauTu = batDauTu;
	}

	@Caption("KetThucTai")
	@Column(name = "KET_THUC_TAI", columnDefinition = "VARCHAR2", length = 500)
	public String getKetThucTai() {
		return this.ketThucTai;
	}

	public void setKetThucTai(String ketThucTai) {
		this.ketThucTai = ketThucTai;
	}

	@Caption("ChieuDai")
	@Column(name = "CHIEU_DAI", columnDefinition = "NUMBER", precision = 10, scale = 3)
	public Double getChieuDai() {
		return this.chieuDai;
	}

	public void setChieuDai(Double chieuDai) {
		this.chieuDai = chieuDai;
	}

	@Caption("Kieu")
	@Column(name = "KIEU", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getKieu() {
		return this.kieu;
	}

	public void setKieu(Long kieu) {
		this.kieu = kieu;
	}

	@Caption("LoaiKhuVuc")
	@Column(name = "LOAI_KHU_VUC", columnDefinition = "NUMBER", precision = 2, scale = 0)
	public Long getLoaiKhuVuc() {
		return this.loaiKhuVuc;
	}

	public void setLoaiKhuVuc(Long loaiKhuVuc) {
		this.loaiKhuVuc = loaiKhuVuc;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 400)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 1, scale = 0)
	public Boolean getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
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

	@Caption("NguoiSuaId")
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
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

}
