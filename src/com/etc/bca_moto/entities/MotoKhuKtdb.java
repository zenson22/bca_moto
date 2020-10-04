package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoKhuKtdbDAO;
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
 * MotoKhuKtdb
 */
@DAO(daoClass = MotoKhuKtdbDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_KHU_KTDB", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class MotoKhuKtdb implements java.io.Serializable {

	private MotoKhuKtdbId id;

	public MotoKhuKtdb() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", nullable = false, columnDefinition = "VARCHAR2", length = 8)),
			@AttributeOverride(name = "dangkyTam", column = @Column(name = "DANGKY_TAM", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "motoSeriChuid", column = @Column(name = "MOTO_SERI_CHUID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "tenEn", column = @Column(name = "TEN_EN", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)) })
	public MotoKhuKtdbId getId() {
		return this.id;
	}

	public void setId(MotoKhuKtdbId id) {
		this.id = id;
	}

}
