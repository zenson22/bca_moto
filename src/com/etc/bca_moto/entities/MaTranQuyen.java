package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MaTranQuyenDAO;
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
 * MaTranQuyen
 */
@DAO(daoClass = MaTranQuyenDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MA_TRAN_QUYEN", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class MaTranQuyen implements java.io.Serializable {

	private MaTranQuyenId id;

	public MaTranQuyen() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "quyenId", column = @Column(name = "QUYEN_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "sel", column = @Column(name = "SEL", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ins", column = @Column(name = "INS", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "upd", column = @Column(name = "UPD", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "del", column = @Column(name = "DEL", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)) })
	public MaTranQuyenId getId() {
		return this.id;
	}

	public void setId(MaTranQuyenId id) {
		this.id = id;
	}

}
