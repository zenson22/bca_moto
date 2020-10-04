package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DanhSachDonViDacBietDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * DanhSachDonViDacBiet
 */
@DAO(daoClass = DanhSachDonViDacBietDAO.class)
@Caption("{%ghiChu}")
@Entity
@Table(name = "DANH_SACH_DON_VI_DAC_BIET", schema = "BCA_MOTO")
public class DanhSachDonViDacBiet implements java.io.Serializable {

	private long id;
	private DonViCanhsatGt donViCanhsatGt;
	private ChucNangDonViDacBiet chucNangDonViDacBiet;
	private long trangThai;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long nguoiSuaId;
	private Date ngaySua;
	private String ghiChu;
	private String listDsDv;

	public DanhSachDonViDacBiet() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("DonViCanhsatGt")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER")
	public DonViCanhsatGt getDonViCanhsatGt() {
		return this.donViCanhsatGt;
	}

	public void setDonViCanhsatGt(DonViCanhsatGt donViCanhsatGt) {
		this.donViCanhsatGt = donViCanhsatGt;
	}

	@Caption("ChucNangDonViDacBiet")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CHUC_NANG_DAC_BIET_ID", nullable = false, columnDefinition = "NUMBER")
	public ChucNangDonViDacBiet getChucNangDonViDacBiet() {
		return this.chucNangDonViDacBiet;
	}

	public void setChucNangDonViDacBiet(ChucNangDonViDacBiet chucNangDonViDacBiet) {
		this.chucNangDonViDacBiet = chucNangDonViDacBiet;
	}

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)
	public long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
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
	@Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)
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
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 100)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("ListDsDv")
	@Column(name = "LIST_DS_DV", columnDefinition = "VARCHAR2", length = 500)
	public String getListDsDv() {
		return this.listDsDv;
	}

	public void setListDsDv(String listDsDv) {
		this.listDsDv = listDsDv;
	}

}
