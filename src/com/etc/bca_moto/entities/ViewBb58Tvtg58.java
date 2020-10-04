package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewBb58Tvtg58DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewBb58Tvtg58
 */
@DAO(daoClass = ViewBb58Tvtg58DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_BB58_TVTG58", schema = "BCA_MOTO")
public class ViewBb58Tvtg58 implements java.io.Serializable {

	private ViewBb58Tvtg58Id id;

	public ViewBb58Tvtg58() {
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
			@AttributeOverride(name = "qd36Id", column = @Column(name = "QD36_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tenNguoiGiao1", column = @Column(name = "TEN_NGUOI_GIAO1", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "capBacChucVuNg1", column = @Column(name = "CAP_BAC_CHUC_VU_NG1", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "donViNg1", column = @Column(name = "DON_VI_NG1", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tenNguoiGiao2", column = @Column(name = "TEN_NGUOI_GIAO2", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "capBacChucVuNg2", column = @Column(name = "CAP_BAC_CHUC_VU_NG2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "donViNg2", column = @Column(name = "DON_VI_NG2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "gioLapBbXong", column = @Column(name = "GIO_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "phutLapBbXong", column = @Column(name = "PHUT_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "cbxlId", column = @Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tinhThanhPhoId", column = @Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namTaoQd", column = @Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "idTvtg", column = @Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan58", column = @Column(name = "SO_BIEN_BAN_58", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtg", column = @Column(name = "LOAI_TVTG", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ghiChuTvtg", column = @Column(name = "GHI_CHU_TVTG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soTvtg", column = @Column(name = "SO_TVTG", columnDefinition = "VARCHAR2", length = 20)) })
	public ViewBb58Tvtg58Id getId() {
		return this.id;
	}

	public void setId(ViewBb58Tvtg58Id id) {
		this.id = id;
	}

}
