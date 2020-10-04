package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QuocGiumDAO;
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
 * QuocGium
 */
@DAO(daoClass = QuocGiumDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "QUOC_GIA", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class QuocGium implements java.io.Serializable {

	private QuocGiumId id;

	public QuocGium() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "vietTat", column = @Column(name = "VIET_TAT", columnDefinition = "VARCHAR2", length = 40)),
			@AttributeOverride(name = "latochucQuocte", column = @Column(name = "LATOCHUC_QUOCTE", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "tenEn", column = @Column(name = "TEN_EN", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "tenDayDu", column = @Column(name = "TEN_DAY_DU", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tenTiengViet", column = @Column(name = "TEN_TIENG_VIET", columnDefinition = "VARCHAR2", length = 50)) })
	public QuocGiumId getId() {
		return this.id;
	}

	public void setId(QuocGiumId id) {
		this.id = id;
	}

}
