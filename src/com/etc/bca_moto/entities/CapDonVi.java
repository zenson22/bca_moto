package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.CapDonViDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * CapDonVi
 */
@DAO(daoClass = CapDonViDAO.class)
@Caption("{%tenCap}")
@Entity
@Table(name = "CAP_DON_VI", schema = "BCA_MOTO")
public class CapDonVi implements java.io.Serializable {

	private long id;
	private String tenCap;

	public CapDonVi() {
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

	@Caption("TenCap")
	@Column(name = "TEN_CAP", columnDefinition = "VARCHAR2", length = 200)
	public String getTenCap() {
		return this.tenCap;
	}

	public void setTenCap(String tenCap) {
		this.tenCap = tenCap;
	}

}
