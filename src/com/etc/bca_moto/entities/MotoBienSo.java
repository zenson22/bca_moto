package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoBienSoDAO;
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
 * MotoBienSo
 */
@DAO(daoClass = MotoBienSoDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_BIEN_SO", schema = "BCA_MOTO", uniqueConstraints = { @UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = { "MAU_BIEN", "BIEN_SO_TRUNC" }) })
public class MotoBienSo implements java.io.Serializable {

	private MotoBienSoId id;

	public MotoBienSo() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "dauBienTheoTinh", column = @Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 12)),
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "dauBienQuocGia", column = @Column(name = "DAU_BIEN_QUOC_GIA", columnDefinition = "VARCHAR2", length = 16)),
			@AttributeOverride(name = "seriSo", column = @Column(name = "SERI_SO", nullable = false, columnDefinition = "VARCHAR2", length = 4)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", nullable = false, columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "dangkyTam", column = @Column(name = "DANGKY_TAM", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "canboTaobiensoId", column = @Column(name = "CANBO_TAOBIENSO_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTaobienso", column = @Column(name = "NGAY_TAOBIENSO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "daCap", column = @Column(name = "DA_CAP", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "canboNghiepvuId", column = @Column(name = "CANBO_NGHIEPVU_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nghiepVu", column = @Column(name = "NGHIEP_VU", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ngayNghiepvu", column = @Column(name = "NGAY_NGHIEPVU", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canboThuhoiId", column = @Column(name = "CANBO_THUHOI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "thuHoi", column = @Column(name = "THU_HOI", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ngayThuhoi", column = @Column(name = "NGAY_THUHOI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canboPhanphoiId", column = @Column(name = "CANBO_PHANPHOI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayPhanphoi", column = @Column(name = "NGAY_PHANPHOI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "phanphoiDiemdkId", column = @Column(name = "PHANPHOI_DIEMDK_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "dauBienQuocGiaid", column = @Column(name = "DAU_BIEN_QUOC_GIAID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "motoSeriChuid", column = @Column(name = "MOTO_SERI_CHUID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "bienDayDu", column = @Column(name = "BIEN_DAY_DU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "congVanId", column = @Column(name = "CONG_VAN_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "biensoQuocgiaId", column = @Column(name = "BIENSO_QUOCGIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "bienSoTrunc", column = @Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 20)) })
	public MotoBienSoId getId() {
		return this.id;
	}

	public void setId(MotoBienSoId id) {
		this.id = id;
	}

}
