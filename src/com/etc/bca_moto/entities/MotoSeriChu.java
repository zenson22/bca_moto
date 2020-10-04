package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoSeriChuDAO;
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
 * MotoSeriChu
 */
@DAO(daoClass = MotoSeriChuDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_SERI_CHU", schema = "BCA_MOTO", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "SERI_CHU", "DANGKY_TAM" }),
		@UniqueConstraint(columnNames = { "ID", "SERI_CHU", "DANGKY_TAM" }) })
public class MotoSeriChu implements java.io.Serializable {

	private MotoSeriChuId id;

	public MotoSeriChu() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "dangkyTam", column = @Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "trongNuoc", column = @Column(name = "TRONG_NUOC", columnDefinition = "NUMBER", precision = 1, scale = 0)) })
	public MotoSeriChuId getId() {
		return this.id;
	}

	public void setId(MotoSeriChuId id) {
		this.id = id;
	}

}
