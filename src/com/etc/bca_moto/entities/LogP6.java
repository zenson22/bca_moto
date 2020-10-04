package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LogP6DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LogP6
 */
@DAO(daoClass = LogP6DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "LOG_P6", schema = "BCA_MOTO")
public class LogP6 implements java.io.Serializable {

	private LogP6Id id;

	public LogP6() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "tenCanBo", column = @Column(name = "TEN_CAN_BO", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "donVi", column = @Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "thoiGianThaoTac", column = @Column(name = "THOI_GIAN_THAO_TAC", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "chucNangSuDung", column = @Column(name = "CHUC_NANG_SU_DUNG", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "moTa", column = @Column(name = "MO_TA", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "canBoId", column = @Column(name = "CAN_BO_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "bienSo", column = @Column(name = "BIEN_SO", columnDefinition = "VARCHAR2")) })
	public LogP6Id getId() {
		return this.id;
	}

	public void setId(LogP6Id id) {
		this.id = id;
	}

}
