package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.LsMotoDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LsMoto
 */
@DAO(daoClass = LsMotoDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "LS_MOTO", schema = "BCA_MOTO")
public class LsMoto implements java.io.Serializable {

	private LsMotoId id;

	public LsMoto() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "soMay", column = @Column(name = "SO_MAY", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "soKhung", column = @Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "nuocSx", column = @Column(name = "NUOC_SX", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "namSx", column = @Column(name = "NAM_SX", columnDefinition = "NUMBER", precision = 4, scale = 0)),
			@AttributeOverride(name = "dungTich", column = @Column(name = "DUNG_TICH", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "congSuat", column = @Column(name = "CONG_SUAT", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "nienHanSuDung", column = @Column(name = "NIEN_HAN_SU_DUNG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "songuoiDuocphepcho", column = @Column(name = "SONGUOI_DUOCPHEPCHO", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "anhMoto", column = @Column(name = "ANH_MOTO", columnDefinition = "BLOB")),
			@AttributeOverride(name = "nguonGoc", column = @Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "soChungTu", column = @Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "ngaycapChungtu", column = @Column(name = "NGAYCAP_CHUNGTU", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "coquanCapchungtu", column = @Column(name = "COQUAN_CAPCHUNGTU", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "loaiNhienLieu", column = @Column(name = "LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "mauXe", column = @Column(name = "MAU_XE", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "noiBao", column = @Column(name = "NOI_BAO", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngayBao", column = @Column(name = "NGAY_BAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "nhanhieuLoaixeId", column = @Column(name = "NHANHIEU_LOAIXE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "soLoai", column = @Column(name = "SO_LOAI", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "maLoaiXeId", column = @Column(name = "MA_LOAI_XE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "hinhThucXuLy", column = @Column(name = "HINH_THUC_XU_LY", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "maGiaoDich", column = @Column(name = "MA_GIAO_DICH", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "duLieuCu", column = @Column(name = "DU_LIEU_CU", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "thoiGianXuLy", column = @Column(name = "THOI_GIAN_XU_LY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiDung", column = @Column(name = "NOI_DUNG", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "soTruc", column = @Column(name = "SO_TRUC", columnDefinition = "NUMBER", precision = 1, scale = 0)) })
	public LsMotoId getId() {
		return this.id;
	}

	public void setId(LsMotoId id) {
		this.id = id;
	}

}
