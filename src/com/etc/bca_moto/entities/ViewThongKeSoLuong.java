package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewThongKeSoLuongDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewThongKeSoLuong
 */
@DAO(daoClass = ViewThongKeSoLuongDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_THONG_KE_SO_LUONG", schema = "BCA_MOTO")
public class ViewThongKeSoLuong implements java.io.Serializable {

	private ViewThongKeSoLuongId id;

	public ViewThongKeSoLuong() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ngays", column = @Column(name = "NGAYS", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "dangKyMoi", column = @Column(name = "DANG_KY_MOI", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "dangKyTam", column = @Column(name = "DANG_KY_TAM", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "dangKyNghiepVu", column = @Column(name = "DANG_KY_NGHIEP_VU", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "sangTen", column = @Column(name = "SANG_TEN", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "chuyenDi", column = @Column(name = "CHUYEN_DI", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "chuyenDen", column = @Column(name = "CHUYEN_DEN", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "thuHoi", column = @Column(name = "THU_HOI", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "doiCap", column = @Column(name = "DOI_CAP", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "traBien", column = @Column(name = "TRA_BIEN", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "dangKyTraBien", column = @Column(name = "DANG_KY_TRA_BIEN", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "tongSoDk", column = @Column(name = "TONG_SO_DK", columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public ViewThongKeSoLuongId getId() {
		return this.id;
	}

	public void setId(ViewThongKeSoLuongId id) {
		this.id = id;
	}

}
