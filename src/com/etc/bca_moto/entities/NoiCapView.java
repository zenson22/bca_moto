package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.NoiCapViewDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NoiCapView
 */
@DAO(daoClass = NoiCapViewDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "NOI_CAP_VIEW", schema = "BCA_MOTO")
public class NoiCapView implements java.io.Serializable {

	private NoiCapViewId id;

	public NoiCapView() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", columnDefinition = "VARCHAR2", length = 160)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "loai", column = @Column(name = "LOAI", columnDefinition = "CHAR", length = 2)) })
	public NoiCapViewId getId() {
		return this.id;
	}

	public void setId(NoiCapViewId id) {
		this.id = id;
	}

}
