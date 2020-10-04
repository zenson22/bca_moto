package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DauBienQuocGiumDAO;
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
 * DauBienQuocGium
 */
@DAO(daoClass = DauBienQuocGiumDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DAU_BIEN_QUOC_GIA", schema = "BCA_MOTO", uniqueConstraints = { @UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = { "DAU_BIEN_QUOC_GIA", "BIENSO_QUOCGIA_ID" }) })
public class DauBienQuocGium implements java.io.Serializable {

	private DauBienQuocGiumId id;

	public DauBienQuocGium() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "dauBienQuocGia", column = @Column(name = "DAU_BIEN_QUOC_GIA", nullable = false, columnDefinition = "VARCHAR2", length = 16)),
			@AttributeOverride(name = "biensoQuocgiaId", column = @Column(name = "BIENSO_QUOCGIA_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 2000)) })
	public DauBienQuocGiumId getId() {
		return this.id;
	}

	public void setId(DauBienQuocGiumId id) {
		this.id = id;
	}

}
