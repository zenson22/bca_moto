package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoBiensoDiemdkDAO;
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
 * MotoBiensoDiemdk
 */
@DAO(daoClass = MotoBiensoDiemdkDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_BIENSO_DIEMDK", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class MotoBiensoDiemdk implements java.io.Serializable {

	private MotoBiensoDiemdkId id;

	public MotoBiensoDiemdk() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "dauBienTheoTinh", column = @Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 12)),
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "biensoQuocgiaId", column = @Column(name = "BIENSO_QUOCGIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "dauBienQuocGia", column = @Column(name = "DAU_BIEN_QUOC_GIA", columnDefinition = "VARCHAR2", length = 16)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", nullable = false, columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "dangkyTam", column = @Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "tu", column = @Column(name = "TU", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "den", column = @Column(name = "DEN", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "diemDangKiId", column = @Column(name = "DIEM_DANG_KI_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "canboPhanphoiId", column = @Column(name = "CANBO_PHANPHOI_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayPhanphoi", column = @Column(name = "NGAY_PHANPHOI", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "seriChuId", column = @Column(name = "SERI_CHU_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "conLai", column = @Column(name = "CON_LAI", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "daCap", column = @Column(name = "DA_CAP", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "tongSo", column = @Column(name = "TONG_SO", columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public MotoBiensoDiemdkId getId() {
		return this.id;
	}

	public void setId(MotoBiensoDiemdkId id) {
		this.id = id;
	}

}
