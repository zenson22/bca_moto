package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QuyenNguoidungDAO;
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
 * QuyenNguoidung
 */
@DAO(daoClass = QuyenNguoidungDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "QUYEN_NGUOIDUNG", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class QuyenNguoidung implements java.io.Serializable {

	private QuyenNguoidungId id;

	public QuyenNguoidung() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "quyenid", column = @Column(name = "QUYENID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "canBoId", column = @Column(name = "CAN_BO_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "sel", column = @Column(name = "SEL", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ins", column = @Column(name = "INS", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "upd", column = @Column(name = "UPD", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "del", column = @Column(name = "DEL", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 200)) })
	public QuyenNguoidungId getId() {
		return this.id;
	}

	public void setId(QuyenNguoidungId id) {
		this.id = id;
	}

}
