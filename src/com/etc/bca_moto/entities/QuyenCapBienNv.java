package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QuyenCapBienNvDAO;
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
 * QuyenCapBienNv
 */
@DAO(daoClass = QuyenCapBienNvDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "QUYEN_CAP_BIEN_NV", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class QuyenCapBienNv implements java.io.Serializable {

	private QuyenCapBienNvId id;

	public QuyenCapBienNv() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "canBoId", column = @Column(name = "CAN_BO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "congVanId", column = @Column(name = "CONG_VAN_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "matKhau", column = @Column(name = "MAT_KHAU", columnDefinition = "VARCHAR2", length = 25)),
			@AttributeOverride(name = "daCap", column = @Column(name = "DA_CAP", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soKhung", column = @Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2", length = 26)),
			@AttributeOverride(name = "soMay", column = @Column(name = "SO_MAY", columnDefinition = "VARCHAR2", length = 26)),
			@AttributeOverride(name = "motoBienSoId", column = @Column(name = "MOTO_BIEN_SO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public QuyenCapBienNvId getId() {
		return this.id;
	}

	public void setId(QuyenCapBienNvId id) {
		this.id = id;
	}

}
