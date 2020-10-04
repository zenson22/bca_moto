package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QuyenDAO;
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
 * Quyen
 */
@DAO(daoClass = QuyenDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "QUYEN", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class Quyen implements java.io.Serializable {

	private QuyenId id;

	public Quyen() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "maQuyen", column = @Column(name = "MA_QUYEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "tenQuyen", column = @Column(name = "TEN_QUYEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "loai", column = @Column(name = "LOAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)) })
	public QuyenId getId() {
		return this.id;
	}

	public void setId(QuyenId id) {
		this.id = id;
	}

}
