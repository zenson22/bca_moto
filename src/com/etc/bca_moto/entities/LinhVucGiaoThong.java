package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LinhVucGiaoThongDAO;
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
 * LinhVucGiaoThong
 */
@DAO(daoClass = LinhVucGiaoThongDAO.class)
@Caption("{%tenLinhVuc}")
@Entity
@Table(name = "LINH_VUC_GIAO_THONG", schema = "BCA_MOTO")
public class LinhVucGiaoThong implements java.io.Serializable {

	private long id;
	private String tenLinhVuc;
	private String ma;
	private String moTa;
	private Boolean trangThai;
	private Long nguoiTaoId;
	private Date ngayTao;
	private Long defaultId;
	private String refIds;

	public LinhVucGiaoThong() {
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

	@Caption("TenLinhVuc")
	@Column(name = "TEN_LINH_VUC", columnDefinition = "VARCHAR2", length = 400)
	public String getTenLinhVuc() {
		return this.tenLinhVuc;
	}

	public void setTenLinhVuc(String tenLinhVuc) {
		this.tenLinhVuc = tenLinhVuc;
	}

	@Caption("Ma")
	@Column(name = "MA", columnDefinition = "VARCHAR2", length = 100)
	public String getMa() {
		return this.ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Caption("MoTa")
	@Column(name = "MO_TA", columnDefinition = "VARCHAR2", length = 1020)
	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
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
	@Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", scale = 0)
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

	@Caption("DefaultId")
	@Column(name = "DEFAULT_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDefaultId() {
		return this.defaultId;
	}

	public void setDefaultId(Long defaultId) {
		this.defaultId = defaultId;
	}

	@Caption("RefIds")
	@Column(name = "REF_IDS", columnDefinition = "VARCHAR2", length = 20)
	public String getRefIds() {
		return this.refIds;
	}

	public void setRefIds(String refIds) {
		this.refIds = refIds;
	}

}
