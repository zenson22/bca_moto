package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BienPhapKhacPhucDAO;
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
 * BienPhapKhacPhuc
 */
@DAO(daoClass = BienPhapKhacPhucDAO.class)
@Caption("{%ma}")
@Entity
@Table(name = "BIEN_PHAP_KHAC_PHUC", schema = "BCA_MOTO")
public class BienPhapKhacPhuc implements java.io.Serializable {

	private long id;
	private String ma;
	private String noiDung;
	private Long nguoiTao;
	private Date ngayTao;
	private Long nguoiSua;
	private Date ngaySua;
	private String ghiChu;
	private Long loai;

	public BienPhapKhacPhuc() {
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

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 20)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("NoiDung")
	@Column(name = "NOI_DUNG", columnDefinition = "VARCHAR2", length = 1000)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
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

	@Caption("GhiChu")
	@Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")
	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Caption("Loai")
	@Column(name = "LOAI", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getLoai() {
		return this.loai;
	}

	public void setLoai(Long loai) {
		this.loai = loai;
	}

}
