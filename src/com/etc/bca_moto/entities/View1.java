package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.View1DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * View1
 */
@DAO(daoClass = View1DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW1", schema = "BCA_MOTO")
public class View1 implements java.io.Serializable {

	private View1Id id;

	public View1() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "indexHvvp", column = @Column(name = "INDEX_HVVP", columnDefinition = "NUMBER", precision = 20, scale = 0)) })
	public View1Id getId() {
		return this.id;
	}

	public void setId(View1Id id) {
		this.id = id;
	}

}
