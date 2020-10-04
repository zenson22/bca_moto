package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ChucVuDAO;
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
 * ChucVu
 */
@DAO(daoClass = ChucVuDAO.class)
@Caption("{%tenChucVu}")
@Entity
@Table(name = "CHUC_VU", schema = "BCA_MOTO")
public class ChucVu implements java.io.Serializable {

	private long id;
	private String tenChucVu;
	private String tenVietTat;
	private Date ngayTao;
	private Long nguoiTaoId;

	public ChucVu() {
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

	@Caption("TenChucVu")
	@Column(name = "TEN_CHUC_VU", columnDefinition = "VARCHAR2", length = 200)
	public String getTenChucVu() {
		return this.tenChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}

	@Caption("TenVietTat")
	@Column(name = "TEN_VIET_TAT", columnDefinition = "VARCHAR2", length = 200)
	public String getTenVietTat() {
		return this.tenVietTat;
	}

	public void setTenVietTat(String tenVietTat) {
		this.tenVietTat = tenVietTat;
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

	@Caption("NguoiTaoId")
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)
	public Long getNguoiTaoId() {
		return this.nguoiTaoId;
	}

	public void setNguoiTaoId(Long nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

}
