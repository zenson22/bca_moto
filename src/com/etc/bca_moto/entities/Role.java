package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.RoleDAO;
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
 * Role
 */
@DAO(daoClass = RoleDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "ROLE", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Role implements java.io.Serializable {

	private RoleId id;

	public Role() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenRole", column = @Column(name = "TEN_ROLE", nullable = false, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "roleMacDinh", column = @Column(name = "ROLE_MAC_DINH", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)) })
	public RoleId getId() {
		return this.id;
	}

	public void setId(RoleId id) {
		this.id = id;
	}

}
