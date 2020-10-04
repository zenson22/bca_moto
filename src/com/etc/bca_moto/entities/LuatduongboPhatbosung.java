package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LuatduongboPhatbosungDAO;
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
 * LuatduongboPhatbosung
 */
@DAO(daoClass = LuatduongboPhatbosungDAO.class)
@Caption("{%nguoiTao}")
@Entity
@Table(name = "LUATDUONGBO_PHATBOSUNG", schema = "BCA_MOTO")
public class LuatduongboPhatbosung implements java.io.Serializable {

	private long id;
	private long luatId;
	private long hinhThucPhatId;
	private String nguoiTao;
	private Date ngayTao;
	private String nguoiSua;
	private Date ngaySua;

	public LuatduongboPhatbosung() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Caption("LuatId")
	@Column(name = "LUAT_ID", nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getLuatId() {
		return this.luatId;
	}

	public void setLuatId(long luatId) {
		this.luatId = luatId;
	}

	@Caption("HinhThucPhatId")
	@Column(name = "HINH_THUC_PHAT_ID", nullable = false, columnDefinition = "NUMBER", precision = 38, scale = 0)
	public long getHinhThucPhatId() {
		return this.hinhThucPhatId;
	}

	public void setHinhThucPhatId(long hinhThucPhatId) {
		this.hinhThucPhatId = hinhThucPhatId;
	}

	@Caption("NguoiTao")
	@Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 300)
	public String getNguoiTao() {
		return this.nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
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
	@Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 300)
	public String getNguoiSua() {
		return this.nguoiSua;
	}

	public void setNguoiSua(String nguoiSua) {
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

}
