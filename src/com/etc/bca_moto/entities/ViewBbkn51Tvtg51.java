package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewBbkn51Tvtg51DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewBbkn51Tvtg51
 */
@DAO(daoClass = ViewBbkn51Tvtg51DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_BBKN51_TVTG51", schema = "BCA_MOTO")
public class ViewBbkn51Tvtg51 implements java.io.Serializable {

	private ViewBbkn51Tvtg51Id id;

	public ViewBbkn51Tvtg51() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBanKn", column = @Column(name = "SO_BIEN_BAN_KN", nullable = false, columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "donViCanhsatGtId", column = @Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tenCqCapTren", column = @Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "qd21Id", column = @Column(name = "QD_21_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "thuTucHcSo", column = @Column(name = "THU_TUC_HC_SO", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "thuTucHcNgay", column = @Column(name = "THU_TUC_HC_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "thuTucHcKy", column = @Column(name = "THU_TUC_HC_KY", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "thoiGianLapBb", column = @Column(name = "THOI_GIAN_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "diaDiemLapBb", column = @Column(name = "DIA_DIEM_LAP_BB", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "cbxlId", column = @Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "capBac", column = @Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "chucVu", column = @Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "donVi", column = @Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "soCmnd", column = @Column(name = "SO_CMND", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "soDienThoai", column = @Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "YKienTrinhBay", column = @Column(name = "Y_KIEN_TRINH_BAY", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "thoiGianKhamKt", column = @Column(name = "THOI_GIAN_KHAM_KT", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiNhanBb", column = @Column(name = "NGUOI_NHAN_BB", columnDefinition = "VARCHAR2", length = 150)),
			@AttributeOverride(name = "thoiGianBbLapXong", column = @Column(name = "THOI_GIAN_BB_LAP_XONG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiLapBb", column = @Column(name = "NGUOI_LAP_BB", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namTaoQd", column = @Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "danhSachNguoiCk", column = @Column(name = "DANH_SACH_NGUOI_CK", columnDefinition = "VARCHAR2", length = 2000)),
			@AttributeOverride(name = "gioLapBbXong", column = @Column(name = "GIO_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "phutLapBbXong", column = @Column(name = "PHUT_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "idTvtg", column = @Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenTvtg", column = @Column(name = "TEN_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "diaDiemTvtg", column = @Column(name = "DIA_DIEM_TVTG", columnDefinition = "VARCHAR2", length = 120)) })
	public ViewBbkn51Tvtg51Id getId() {
		return this.id;
	}

	public void setId(ViewBbkn51Tvtg51Id id) {
		this.id = id;
	}

}
