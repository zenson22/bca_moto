package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DauBienTheoTinhDAO;
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
 * DauBienTheoTinh
 */
@DAO(daoClass = DauBienTheoTinhDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DAU_BIEN_THEO_TINH", schema = "BCA_MOTO", uniqueConstraints = {
		@UniqueConstraint(columnNames = "DAU_BIEN_THEO_TINH"),
		@UniqueConstraint(columnNames = { "DAU_BIEN_THEO_TINH", "DON_VI_CSGT_ID" }) })
public class DauBienTheoTinh implements java.io.Serializable {

	private DauBienTheoTinhId id;

	public DauBienTheoTinh() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "dauBienTheoTinh", column = @Column(name = "DAU_BIEN_THEO_TINH", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 12)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 2000)) })
	public DauBienTheoTinhId getId() {
		return this.id;
	}

	public void setId(DauBienTheoTinhId id) {
		this.id = id;
	}

}
