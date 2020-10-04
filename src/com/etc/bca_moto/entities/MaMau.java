package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MaMauDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * MaMau
 */
@DAO(daoClass = MaMauDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MA_MAU", schema = "BCA_MOTO", uniqueConstraints = { @UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "MA_MAU"), @UniqueConstraint(columnNames = "TEN_MAU") })
public class MaMau implements java.io.Serializable {

	private MaMauId id;

	public MaMau() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenMau", column = @Column(name = "TEN_MAU", unique = true, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "maMau", column = @Column(name = "MA_MAU", unique = true, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)) })
	public MaMauId getId() {
		return this.id;
	}

	public void setId(MaMauId id) {
		this.id = id;
	}

}
