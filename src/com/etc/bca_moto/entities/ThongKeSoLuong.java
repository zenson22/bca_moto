package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ThongKeSoLuongDAO;
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
 * ThongKeSoLuong
 */
@DAO(daoClass = ThongKeSoLuongDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "THONG_KE_SO_LUONG", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class ThongKeSoLuong implements java.io.Serializable {

	private ThongKeSoLuongId id;

	public ThongKeSoLuong() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "dangKyMoi", column = @Column(name = "DANG_KY_MOI", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "dangKyTam", column = @Column(name = "DANG_KY_TAM", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "dangKyNv", column = @Column(name = "DANG_KY_NV", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "sangTen", column = @Column(name = "SANG_TEN", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "chuyenDi", column = @Column(name = "CHUYEN_DI", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "chuyenDen", column = @Column(name = "CHUYEN_DEN", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "thuHoi", column = @Column(name = "THU_HOI", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "caiTao", column = @Column(name = "CAI_TAO", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "traBien", column = @Column(name = "TRA_BIEN", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "tongSoDk", column = @Column(name = "TONG_SO_DK", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "tongSoQl", column = @Column(name = "TONG_SO_QL", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "ngay", column = @Column(name = "NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "dangKyTraBien", column = @Column(name = "DANG_KY_TRA_BIEN", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public ThongKeSoLuongId getId() {
		return this.id;
	}

	public void setId(ThongKeSoLuongId id) {
		this.id = id;
	}

}
