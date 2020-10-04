package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TrangThaiKichHoatDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * TrangThaiKichHoat
 */
@DAO(daoClass = TrangThaiKichHoatDAO.class)
@Caption("{%trangThai}")
@Entity
@Table(name = "TRANG_THAI_KICH_HOAT", schema = "BCA_MOTO")
public class TrangThaiKichHoat implements java.io.Serializable {

	private long id;
	private String trangThai;

	public TrangThaiKichHoat() {
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

	@Caption("TrangThai")
	@Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 50)
	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

}
