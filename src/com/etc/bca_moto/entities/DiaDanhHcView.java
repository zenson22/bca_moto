package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DiaDanhHcViewDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DiaDanhHcView
 */
@DAO(daoClass = DiaDanhHcViewDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DIA_DANH_HC_VIEW", schema = "BCA_MOTO")
public class DiaDanhHcView implements java.io.Serializable {

	private DiaDanhHcViewId id;

	public DiaDanhHcView() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ma", column = @Column(name = "MA", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ddResourseId", column = @Column(name = "DD_RESOURSE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "capHanhChinh", column = @Column(name = "CAP_HANH_CHINH", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ddCapTren", column = @Column(name = "DD_CAP_TREN", columnDefinition = "NUMBER", precision = 10, scale = 0)) })
	public DiaDanhHcViewId getId() {
		return this.id;
	}

	public void setId(DiaDanhHcViewId id) {
		this.id = id;
	}

}
