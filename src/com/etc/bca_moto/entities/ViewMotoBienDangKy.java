package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewMotoBienDangKyDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewMotoBienDangKy
 */
@DAO(daoClass = ViewMotoBienDangKyDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_MOTO_BIEN_DANG_KY", schema = "BCA_MOTO")
public class ViewMotoBienDangKy implements java.io.Serializable {

	private ViewMotoBienDangKyId id;

	public ViewMotoBienDangKy() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "diemdangky", column = @Column(name = "DIEMDANGKY", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "diemDangKiId", column = @Column(name = "DIEM_DANG_KI_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "dauBienTheoTinh", column = @Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 12)),
			@AttributeOverride(name = "quocgia", column = @Column(name = "QUOCGIA", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "dauBienQuocGia", column = @Column(name = "DAU_BIEN_QUOC_GIA", columnDefinition = "VARCHAR2", length = 16)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", nullable = false, columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "dangkyTam", column = @Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "tu", column = @Column(name = "TU", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "den", column = @Column(name = "DEN", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "dacap", column = @Column(name = "DACAP", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "tongSo", column = @Column(name = "TONG_SO", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "canboPhanphoi", column = @Column(name = "CANBO_PHANPHOI", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "ngayPhanphoi", column = @Column(name = "NGAY_PHANPHOI", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canboSua", column = @Column(name = "CANBO_SUA", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)) })
	public ViewMotoBienDangKyId getId() {
		return this.id;
	}

	public void setId(ViewMotoBienDangKyId id) {
		this.id = id;
	}

}
