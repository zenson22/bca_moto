package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LogsTrangThaiDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LogsTrangThai
 */
@DAO(daoClass = LogsTrangThaiDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "LOGS_TRANG_THAI", schema = "BCA_MOTO")
public class LogsTrangThai implements java.io.Serializable {

	private LogsTrangThaiId id;

	public LogsTrangThai() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "loai", column = @Column(name = "LOAI", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "qdId", column = @Column(name = "QD_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "trangThaiId", column = @Column(name = "TRANG_THAI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)) })
	public LogsTrangThaiId getId() {
		return this.id;
	}

	public void setId(LogsTrangThaiId id) {
		this.id = id;
	}

}
