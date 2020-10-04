package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ChucNangDonViDacBietDAO;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * ChucNangDonViDacBiet
 */
@DAO(daoClass = ChucNangDonViDacBietDAO.class)
@Caption("{%tenChucNang}")
@Entity
@Table(name = "CHUC_NANG_DON_VI_DAC_BIET", schema = "BCA_MOTO")
public class ChucNangDonViDacBiet implements java.io.Serializable {

	private long id;
	private String tenChucNang;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThai;
	private String ghiChu;
	private Set<DanhSachDonViDacBiet> danhSachDonViDacBiets = new HashSet<DanhSachDonViDacBiet>(0);

	public ChucNangDonViDacBiet() {
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

	@Caption("TenChucNang")
	@Column(name = "TEN_CHUC_NANG", nullable = false, columnDefinition = "VARCHAR2", length = 200)
	public String getTenChucNang() {
		return this.tenChucNang;
	}

	public void setTenChucNang(String tenChucNang) {
		this.tenChucNang = tenChucNang;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(Long nguoiTao) {
		this.nguoiTao = nguoiTao;
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
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 22, scale = 0)
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

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Long trangThai) {
		this.trangThai = trangThai;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 100)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("DanhSachDonViDacBiets")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chucNangDonViDacBiet")
	public Set<DanhSachDonViDacBiet> getDanhSachDonViDacBiets() {
		return this.danhSachDonViDacBiets;
	}

	public void setDanhSachDonViDacBiets(Set<DanhSachDonViDacBiet> danhSachDonViDacBiets) {
		this.danhSachDonViDacBiets = danhSachDonViDacBiets;
	}

}
