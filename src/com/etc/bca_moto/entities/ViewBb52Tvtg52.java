package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewBb52Tvtg52DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewBb52Tvtg52
 */
@DAO(daoClass = ViewBb52Tvtg52DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_BB52_TVTG52", schema = "BCA_MOTO")
public class ViewBb52Tvtg52 implements java.io.Serializable {

	private ViewBb52Tvtg52Id id;

	public ViewBb52Tvtg52() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idBb52Pk", column = @Column(name = "ID_BB52_PK", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "donViCanhsatGtId", column = @Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "qd22Id", column = @Column(name = "QD_22_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "thoiGianLapBb", column = @Column(name = "THOI_GIAN_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "diaDiemLapBb", column = @Column(name = "DIA_DIEM_LAP_BB", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "cbxlId1", column = @Column(name = "CBXL_ID1", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "cbxlId2", column = @Column(name = "CBXL_ID2", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "cbxlId3", column = @Column(name = "CBXL_ID3", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "chungToiGom", column = @Column(name = "CHUNG_TOI_GOM", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 150)),
			@AttributeOverride(name = "YKienTrinhBay", column = @Column(name = "Y_KIEN_TRINH_BAY", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "thoiGianKhamKt", column = @Column(name = "THOI_GIAN_KHAM_KT", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "thoiGianBbLapXong", column = @Column(name = "THOI_GIAN_BB_LAP_XONG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namTaoQd", column = @Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "dsChungKien", column = @Column(name = "DS_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 250)),
			@AttributeOverride(name = "tenPhuongtienDovat", column = @Column(name = "TEN_PHUONGTIEN_DOVAT", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "idBb52", column = @Column(name = "ID_BB52", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tangVat1", column = @Column(name = "TANG_VAT1", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "idTvtg", column = @Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "idTvBb52", column = @Column(name = "ID_TV_BB52", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtg", column = @Column(name = "LOAI_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ghiChuTvtg", column = @Column(name = "GHI_CHU_TVTG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)) })
	public ViewBb52Tvtg52Id getId() {
		return this.id;
	}

	public void setId(ViewBb52Tvtg52Id id) {
		this.id = id;
	}

}
