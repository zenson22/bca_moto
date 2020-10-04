package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.PsTxnDAO;
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
 * PsTxn
 */
@DAO(daoClass = PsTxnDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "PS_TXN", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = { "COLLID", "ID" }))
public class PsTxn implements java.io.Serializable {

	private PsTxnId id;

	public PsTxn() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "parentid", column = @Column(name = "PARENTID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "collid", column = @Column(name = "COLLID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "content", column = @Column(name = "CONTENT", columnDefinition = "BLOB")),
			@AttributeOverride(name = "creationDate", column = @Column(name = "CREATION_DATE", columnDefinition = "DATE", length = 7)) })
	public PsTxnId getId() {
		return this.id;
	}

	public void setId(PsTxnId id) {
		this.id = id;
	}

}
