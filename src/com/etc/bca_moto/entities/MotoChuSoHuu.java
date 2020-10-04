package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoChuSoHuuDAO;
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
 * MotoChuSoHuu
 */
@DAO(daoClass = MotoChuSoHuuDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_CHU_SO_HUU", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class MotoChuSoHuu implements java.io.Serializable {

	private MotoChuSoHuuId id;

	public MotoChuSoHuu() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", nullable = false, columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "diadanhHanhchinhId", column = @Column(name = "DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 2048)),
			@AttributeOverride(name = "loaiGiayto", column = @Column(name = "LOAI_GIAYTO", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "idSo", column = @Column(name = "ID_SO", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "idNgayCap", column = @Column(name = "ID_NGAY_CAP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "idNoiCap", column = @Column(name = "ID_NOI_CAP", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "soDienThoai", column = @Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "quocgiaId", column = @Column(name = "QUOCGIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "chuSoHuuId", column = @Column(name = "CHU_SO_HUU_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "maSoThue", column = @Column(name = "MA_SO_THUE", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "taiKhoan", column = @Column(name = "TAI_KHOAN", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "nganHang", column = @Column(name = "NGAN_HANG", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "duLieuCu", column = @Column(name = "DU_LIEU_CU", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "phanloaiQuanlyId", column = @Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "maGiaoDich", column = @Column(name = "MA_GIAO_DICH", columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public MotoChuSoHuuId getId() {
		return this.id;
	}

	public void setId(MotoChuSoHuuId id) {
		this.id = id;
	}

}
