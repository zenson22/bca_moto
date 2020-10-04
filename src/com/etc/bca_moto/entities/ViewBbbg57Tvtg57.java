package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewBbbg57Tvtg57DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewBbbg57Tvtg57
 */
@DAO(daoClass = ViewBbbg57Tvtg57DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_BBBG57_TVTG57", schema = "BCA_MOTO")
public class ViewBbbg57Tvtg57 implements java.io.Serializable {

	private ViewBbbg57Tvtg57Id id;

	public ViewBbbg57Tvtg57() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "donViCanhsatGtId", column = @Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tenCqCapTren", column = @Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "gioLapBb", column = @Column(name = "GIO_LAP_BB", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "phutLapBb", column = @Column(name = "PHUT_LAP_BB", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "diaDiemLap", column = @Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "canCuQdId", column = @Column(name = "CAN_CU_QD_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tenNguoiGiao1", column = @Column(name = "TEN_NGUOI_GIAO1", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "capBacChucVuNg1", column = @Column(name = "CAP_BAC_CHUC_VU_NG1", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "donViNg1", column = @Column(name = "DON_VI_NG1", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tenNguoiGiao2", column = @Column(name = "TEN_NGUOI_GIAO2", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "capBacChucVuNg2", column = @Column(name = "CAP_BAC_CHUC_VU_NG2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "donViNg2", column = @Column(name = "DON_VI_NG2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tenNguoiNhan1", column = @Column(name = "TEN_NGUOI_NHAN1", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "capBacChucVuNn1", column = @Column(name = "CAP_BAC_CHUC_VU_NN1", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "donViNn1", column = @Column(name = "DON_VI_NN1", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tenNguoiNhan2", column = @Column(name = "TEN_NGUOI_NHAN2", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "capBacChucVuNn2", column = @Column(name = "CAP_BAC_CHUC_VU_NN2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "donViNn2", column = @Column(name = "DON_VI_NN2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "gioLapBbXong", column = @Column(name = "GIO_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "phutLapBbXong", column = @Column(name = "PHUT_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "cbxlId", column = @Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tinhThanhPhoId", column = @Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namTaoQd", column = @Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "idTvtg", column = @Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan57", column = @Column(name = "SO_BIEN_BAN_57", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtg", column = @Column(name = "LOAI_TVTG", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ghiChuTvtg", column = @Column(name = "GHI_CHU_TVTG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soTvtg", column = @Column(name = "SO_TVTG", columnDefinition = "VARCHAR2", length = 20)) })
	public ViewBbbg57Tvtg57Id getId() {
		return this.id;
	}

	public void setId(ViewBbbg57Tvtg57Id id) {
		this.id = id;
	}

}
