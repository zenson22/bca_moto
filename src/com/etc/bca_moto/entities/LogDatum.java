package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LogDatumDAO;
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
 * LogDatum
 */
@DAO(daoClass = LogDatumDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "LOG_DATA", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class LogDatum implements java.io.Serializable {

	private LogDatumId id;

	public LogDatum() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "action", column = @Column(name = "ACTION", nullable = false, columnDefinition = "VARCHAR2", length = 12)),
			@AttributeOverride(name = "dataXml", column = @Column(name = "DATA_XML", nullable = false, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "logId", column = @Column(name = "LOG_ID", nullable = false, columnDefinition = "NUMBER", scale = 0)) })
	public LogDatumId getId() {
		return this.id;
	}

	public void setId(LogDatumId id) {
		this.id = id;
	}

}
