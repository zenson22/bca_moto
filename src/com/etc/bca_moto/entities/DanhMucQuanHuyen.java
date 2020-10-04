package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DanhMucQuanHuyenDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * DanhMucQuanHuyen
 */
@DAO(daoClass = DanhMucQuanHuyenDAO.class)
@Caption("{%maQuanHuyen}")
@Entity
@Table(name = "DANH_MUC_QUAN_HUYEN", schema = "BCA_MOTO")
public class DanhMucQuanHuyen implements java.io.Serializable {

	private long id;
	private String maQuanHuyen;
	private String tenQuanHuyen;
	private String maTinhThanh;
	private Long capHanhChinh;
	private Long ddResourseId;

	public DanhMucQuanHuyen() {
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

	@Caption("MaQuanHuyen")
	@Column(name = "MA_QUAN_HUYEN", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getMaQuanHuyen() {
		return this.maQuanHuyen;
	}

	public void setMaQuanHuyen(String maQuanHuyen) {
		this.maQuanHuyen = maQuanHuyen;
	}

	@Caption("TenQuanHuyen")
	@Column(name = "TEN_QUAN_HUYEN", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTenQuanHuyen() {
		return this.tenQuanHuyen;
	}

	public void setTenQuanHuyen(String tenQuanHuyen) {
		this.tenQuanHuyen = tenQuanHuyen;
	}

	@Caption("MaTinhThanh")
	@Column(name = "MA_TINH_THANH", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getMaTinhThanh() {
		return this.maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}

	@Caption("CapHanhChinh")
	@Column(name = "CAP_HANH_CHINH", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapHanhChinh() {
		return this.capHanhChinh;
	}

	public void setCapHanhChinh(Long capHanhChinh) {
		this.capHanhChinh = capHanhChinh;
	}

	@Caption("DdResourseId")
	@Column(name = "DD_RESOURSE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getDdResourseId() {
		return this.ddResourseId;
	}

	public void setDdResourseId(Long ddResourseId) {
		this.ddResourseId = ddResourseId;
	}

}
