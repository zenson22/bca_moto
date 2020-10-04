package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoMaNhanHieuDAO;
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
 * MotoMaNhanHieu
 */
@DAO(daoClass = MotoMaNhanHieuDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_MA_NHAN_HIEU", schema = "BCA_MOTO", uniqueConstraints = { @UniqueConstraint(columnNames = "MA"),
		@UniqueConstraint(columnNames = "ID") })
public class MotoMaNhanHieu implements java.io.Serializable {

	private MotoMaNhanHieuId id;

	public MotoMaNhanHieu() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ma", column = @Column(name = "MA", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 40)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "nhomNhanhieuid", column = @Column(name = "NHOM_NHANHIEUID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "kiemSoatSoKhung", column = @Column(name = "KIEM_SOAT_SO_KHUNG", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "kiemSoatSoMay", column = @Column(name = "KIEM_SOAT_SO_MAY", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "sapXep", column = @Column(name = "SAP_XEP", columnDefinition = "NUMBER", precision = 5, scale = 0)) })
	public MotoMaNhanHieuId getId() {
		return this.id;
	}

	public void setId(MotoMaNhanHieuId id) {
		this.id = id;
	}

}
