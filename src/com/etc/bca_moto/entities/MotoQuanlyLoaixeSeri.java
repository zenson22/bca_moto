package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoQuanlyLoaixeSeriDAO;
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
 * MotoQuanlyLoaixeSeri
 */
@DAO(daoClass = MotoQuanlyLoaixeSeriDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_QUANLY_LOAIXE_SERI", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class MotoQuanlyLoaixeSeri implements java.io.Serializable {

	private MotoQuanlyLoaixeSeriId id;

	public MotoQuanlyLoaixeSeri() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "phanloaiQuanlyId", column = @Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "motoLoaiXe", column = @Column(name = "MOTO_LOAI_XE", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "motoSeriChuid", column = @Column(name = "MOTO_SERI_CHUID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "dangkyTam", column = @Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)) })
	public MotoQuanlyLoaixeSeriId getId() {
		return this.id;
	}

	public void setId(MotoQuanlyLoaixeSeriId id) {
		this.id = id;
	}

}
