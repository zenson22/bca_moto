package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewQd13Tv13DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewQd13Tv13
 */
@DAO(daoClass = ViewQd13Tv13DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_QD13_TV13", schema = "BCA_MOTO")
public class ViewQd13Tv13 implements java.io.Serializable {

	private ViewQd13Tv13Id id;

	public ViewQd13Tv13() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soQuyetDinh", column = @Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "donViCanhsatGtId", column = @Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tenCqCapTren", column = @Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayLapBbVphc", column = @Column(name = "NGAY_LAP_BB_VPHC", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "qd11Id", column = @Column(name = "QD_11_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "bbVphc43Id", column = @Column(name = "BB_VPHC43_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "bbXm34Id", column = @Column(name = "BB_XM34_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "bbVphcSo", column = @Column(name = "BB_VPHC_SO", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "bbVphcNgay", column = @Column(name = "BB_VPHC_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canCuBbXmSo", column = @Column(name = "CAN_CU_BB_XM_SO", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "canCuBbXmNgay", column = @Column(name = "CAN_CU_BB_XM_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canCuQdGqxpSo", column = @Column(name = "CAN_CU_QD_GQXP_SO", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "canCuQdGqxpNgay", column = @Column(name = "CAN_CU_QD_GQXP_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "capBac", column = @Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "chucVu", column = @Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "donVi", column = @Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tv13Id", column = @Column(name = "TV_13_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "lyDoTieuHuy", column = @Column(name = "LY_DO_TIEU_HUY", columnDefinition = "VARCHAR2", length = 250)),
			@AttributeOverride(name = "diaDiemTieuHuy", column = @Column(name = "DIA_DIEM_TIEU_HUY", columnDefinition = "VARCHAR2", length = 250)),
			@AttributeOverride(name = "thoiGianThucHien", column = @Column(name = "THOI_GIAN_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "thanhPhanThamGia", column = @Column(name = "THANH_PHAN_THAM_GIA", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "toChucThucHien", column = @Column(name = "TO_CHUC_THUC_HIEN", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "cbxlId", column = @Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tinhThanhPhoId", column = @Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namTaoQd", column = @Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "soBb43Tc", column = @Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "idTvtg", column = @Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soQd13", column = @Column(name = "SO_QD_13", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtg", column = @Column(name = "LOAI_TVTG", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ghiChuTvtg", column = @Column(name = "GHI_CHU_TVTG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soTvtg", column = @Column(name = "SO_TVTG", columnDefinition = "VARCHAR2", length = 50)) })
	public ViewQd13Tv13Id getId() {
		return this.id;
	}

	public void setId(ViewQd13Tv13Id id) {
		this.id = id;
	}

}
