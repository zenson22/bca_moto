package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LyDoTangGiamDAO;
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
 * LyDoTangGiam
 */
@DAO(daoClass = LyDoTangGiamDAO.class)
@Caption("{%quyDinhTai}")
@Entity
@Table(name = "LY_DO_TANG_GIAM", schema = "BCA_MOTO")
public class LyDoTangGiam implements java.io.Serializable {

	private long id;
	private Long nghiDinhCpId;
	private String quyDinhTai;
	private String ma;
	private String noiDung;
	private String ghiChu;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private Long trangThaiKichHoat;
	private Long phanLoai;

	public LyDoTangGiam() {
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

	@Caption("NghiDinhCpId")
	@Column(name = "NGHI_DINH_CP_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNghiDinhCpId() {
		return this.nghiDinhCpId;
	}

	public void setNghiDinhCpId(Long nghiDinhCpId) {
		this.nghiDinhCpId = nghiDinhCpId;
	}

	@Caption("QuyDinhTai")
	@Column(name = "QUY_DINH_TAI", columnDefinition = "VARCHAR2", length = 100)
	public String getQuyDinhTai() {
		return this.quyDinhTai;
	}

	public void setQuyDinhTai(String quyDinhTai) {
		this.quyDinhTai = quyDinhTai;
	}

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 20)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("NoiDung")
	@Column(name = "NOI_DUNG", columnDefinition = "VARCHAR2", length = 300)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 200)
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)
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
	@Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)
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
	@Column(name = "TRANG_THAI_KICH_HOAT", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getTrangThaiKichHoat() {
		return this.trangThaiKichHoat;
	}

	public void setTrangThaiKichHoat(Long trangThaiKichHoat) {
		this.trangThaiKichHoat = trangThaiKichHoat;
	}

	@Caption("PhanLoai")
	@Column(name = "PHAN_LOAI", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getPhanLoai() {
		return this.phanLoai;
	}

	public void setPhanLoai(Long phanLoai) {
		this.phanLoai = phanLoai;
	}

}
