package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DanhMucPhuongXaDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * DanhMucPhuongXa
 */
@DAO(daoClass = DanhMucPhuongXaDAO.class)
@Caption("{%maPhuongXa}")
@Entity
@Table(name = "DANH_MUC_PHUONG_XA", schema = "BCA_MOTO")
public class DanhMucPhuongXa implements java.io.Serializable {

	private long id;
	private String maPhuongXa;
	private String tenPhuongXa;
	private String maQuanHuyen;
	private Long capHanhChinh;
	private Long ddResourseId;

	public DanhMucPhuongXa() {
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

	@Caption("MaPhuongXa")
	@Column(name = "MA_PHUONG_XA", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getMaPhuongXa() {
		return this.maPhuongXa;
	}

	public void setMaPhuongXa(String maPhuongXa) {
		this.maPhuongXa = maPhuongXa;
	}

	@Caption("TenPhuongXa")
	@Column(name = "TEN_PHUONG_XA", nullable = false, columnDefinition = "VARCHAR2", length = 100)
	public String getTenPhuongXa() {
		return this.tenPhuongXa;
	}

	public void setTenPhuongXa(String tenPhuongXa) {
		this.tenPhuongXa = tenPhuongXa;
	}

	@Caption("MaQuanHuyen")
	@Column(name = "MA_QUAN_HUYEN", nullable = false, columnDefinition = "VARCHAR2", length = 20)
	public String getMaQuanHuyen() {
		return this.maQuanHuyen;
	}

	public void setMaQuanHuyen(String maQuanHuyen) {
		this.maQuanHuyen = maQuanHuyen;
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
