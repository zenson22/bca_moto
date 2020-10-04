package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BangThamsoDAO;
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
 * BangThamso
 */
@DAO(daoClass = BangThamsoDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "BANG_THAMSO", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class BangThamso implements java.io.Serializable {

	private BangThamsoId id;

	public BangThamso() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "vungDulieu", column = @Column(name = "VUNG_DULIEU", nullable = false, columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "maThamso", column = @Column(name = "MA_THAMSO", nullable = false, columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "dienGiai", column = @Column(name = "DIEN_GIAI", nullable = false, columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "thamsoNguoidung", column = @Column(name = "THAMSO_NGUOIDUNG", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "bangThamsoId", column = @Column(name = "BANG_THAMSO_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "sapXep", column = @Column(name = "SAP_XEP", columnDefinition = "NUMBER", precision = 5, scale = 0)) })
	public BangThamsoId getId() {
		return this.id;
	}

	public void setId(BangThamsoId id) {
		this.id = id;
	}

}
