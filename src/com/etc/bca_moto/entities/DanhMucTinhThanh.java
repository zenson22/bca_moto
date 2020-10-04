package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DanhMucTinhThanhDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * DanhMucTinhThanh
 */
@DAO(daoClass = DanhMucTinhThanhDAO.class)
@Caption("{%maTinhThanh}")
@Entity
@Table(name = "DANH_MUC_TINH_THANH", schema = "BCA_MOTO")
public class DanhMucTinhThanh implements java.io.Serializable {

	private long id;
	private String maTinhThanh;
	private String tenTinhThanh;
	private Long capHanhChinh;
	private String maCapTren;
	private Long ddResourseId;

	public DanhMucTinhThanh() {
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

	@Caption("MaTinhThanh")
	@Column(name = "MA_TINH_THANH", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getMaTinhThanh() {
		return this.maTinhThanh;
	}

	public void setMaTinhThanh(String maTinhThanh) {
		this.maTinhThanh = maTinhThanh;
	}

	@Caption("TenTinhThanh")
	@Column(name = "TEN_TINH_THANH", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTenTinhThanh() {
		return this.tenTinhThanh;
	}

	public void setTenTinhThanh(String tenTinhThanh) {
		this.tenTinhThanh = tenTinhThanh;
	}

	@Caption("CapHanhChinh")
	@Column(name = "CAP_HANH_CHINH", columnDefinition = "NUMBER", precision = 10, scale = 0)
	public Long getCapHanhChinh() {
		return this.capHanhChinh;
	}

	public void setCapHanhChinh(Long capHanhChinh) {
		this.capHanhChinh = capHanhChinh;
	}

	@Caption("MaCapTren")
	@Column(name = "MA_CAP_TREN", columnDefinition = "VARCHAR2", length = 20)
	public String getMaCapTren() {
		return this.maCapTren;
	}

	public void setMaCapTren(String maCapTren) {
		this.maCapTren = maCapTren;
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
