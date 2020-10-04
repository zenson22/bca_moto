package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TraCuuXacMinhDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TraCuuXacMinh
 */
@DAO(daoClass = TraCuuXacMinhDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "TRA_CUU_XAC_MINH", schema = "BCA_MOTO")
public class TraCuuXacMinh implements java.io.Serializable {

	private TraCuuXacMinhId id;

	public TraCuuXacMinh() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "canBoId", column = @Column(name = "CAN_BO_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "thamSo", column = @Column(name = "THAM_SO", columnDefinition = "VARCHAR2", length = 4000)) })
	public TraCuuXacMinhId getId() {
		return this.id;
	}

	public void setId(TraCuuXacMinhId id) {
		this.id = id;
	}

}
