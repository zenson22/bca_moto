package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoMaLoaiXeDAO;
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
 * MotoMaLoaiXe
 */
@DAO(daoClass = MotoMaLoaiXeDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_MA_LOAI_XE", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class MotoMaLoaiXe implements java.io.Serializable {

	private MotoMaLoaiXeId id;

	public MotoMaLoaiXe() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "maLoai", column = @Column(name = "MA_LOAI", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "tenLoai", column = @Column(name = "TEN_LOAI", nullable = false, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nhomXeId", column = @Column(name = "NHOM_XE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "dienGiai", column = @Column(name = "DIEN_GIAI", columnDefinition = "VARCHAR2", length = 1024)),
			@AttributeOverride(name = "sapXep", column = @Column(name = "SAP_XEP", columnDefinition = "NUMBER", precision = 5, scale = 0)),
			@AttributeOverride(name = "inTheoMau", column = @Column(name = "IN_THEO_MAU", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "nhapLieuTheoMau", column = @Column(name = "NHAP_LIEU_THEO_MAU", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "maLoaiXe", column = @Column(name = "MA_LOAI_XE", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "motoMaLoaiXeId", column = @Column(name = "MOTO_MA_LOAI_XE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenLoaiXe", column = @Column(name = "TEN_LOAI_XE", columnDefinition = "VARCHAR2", length = 1020)) })
	public MotoMaLoaiXeId getId() {
		return this.id;
	}

	public void setId(MotoMaLoaiXeId id) {
		this.id = id;
	}

}
