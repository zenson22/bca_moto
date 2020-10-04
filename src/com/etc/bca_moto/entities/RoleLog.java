package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.RoleLogDAO;
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
 * RoleLog
 */
@DAO(daoClass = RoleLogDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "ROLE_LOG", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class RoleLog implements java.io.Serializable {

	private RoleLogId id;

	public RoleLog() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "tableName", column = @Column(name = "TABLE_NAME", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "sel", column = @Column(name = "SEL", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ins", column = @Column(name = "INS", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "upd", column = @Column(name = "UPD", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "del", column = @Column(name = "DEL", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)) })
	public RoleLogId getId() {
		return this.id;
	}

	public void setId(RoleLogId id) {
		this.id = id;
	}

}
