package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewQd18Tv18DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewQd18Tv18
 */
@DAO(daoClass = ViewQd18Tv18DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_QD18_TV18", schema = "BCA_MOTO")
public class ViewQd18Tv18 implements java.io.Serializable {

	private ViewQd18Tv18Id id;

	public ViewQd18Tv18() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soQuyetDinh", column = @Column(name = "SO_QUYET_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tenCqCapTren", column = @Column(name = "TEN_CQ_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "tenDonVi", column = @Column(name = "TEN_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soBienBanTc", column = @Column(name = "SO_BIEN_BAN_TC", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "diaDanhHc", column = @Column(name = "DIA_DANH_HC", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngayLapQd", column = @Column(name = "NGAY_LAP_QD", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canCuXlvphc", column = @Column(name = "CAN_CU_XLVPHC", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "canCuNghiDinh", column = @Column(name = "CAN_CU_NGHI_DINH", nullable = false, columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "canCuBienBan", column = @Column(name = "CAN_CU_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "canBoRaQd", column = @Column(name = "CAN_BO_RA_QD", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "canBoRaQdId", column = @Column(name = "CAN_BO_RA_QD_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "lyDoTamGiu", column = @Column(name = "LY_DO_TAM_GIU", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "diaDiemTamGiu", column = @Column(name = "DIA_DIEM_TAM_GIU", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "thoiHanTu", column = @Column(name = "THOI_HAN_TU", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "thoiHanDen", column = @Column(name = "THOI_HAN_DEN", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "capTrenPheDuyet", column = @Column(name = "CAP_TREN_PHE_DUYET", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "capDuoiKyNhay", column = @Column(name = "CAP_DUOI_KY_NHAY", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "canBoNhanXuLy", column = @Column(name = "CAN_BO_NHAN_XU_LY", columnDefinition = "VARCHAR2", length = 70)),
			@AttributeOverride(name = "cbxlId", column = @Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "capBacChucVu", column = @Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tinhThanhPhoId", column = @Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "thoiHanTg", column = @Column(name = "THOI_HAN_TG", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "canBoTraLai", column = @Column(name = "CAN_BO_TRA_LAI", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTraLai", column = @Column(name = "NGAY_TRA_LAI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayBatDauXl", column = @Column(name = "NGAY_BAT_DAU_XL", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "soBb43Tc", column = @Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namLapQd", column = @Column(name = "NAM_LAP_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapQd", column = @Column(name = "NHAP_QD", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThaiQd", column = @Column(name = "TRANG_THAI_QD", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySinhNvpNhap", column = @Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "maVuViec", column = @Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "maThongTu", column = @Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "diaDiemTamGiuId", column = @Column(name = "DIA_DIEM_TAM_GIU_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tangVatTamGiu1", column = @Column(name = "TANG_VAT_TAM_GIU1", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "tangVatTamGiu2", column = @Column(name = "TANG_VAT_TAM_GIU2", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "canCuGqSo", column = @Column(name = "CAN_CU_GQ_SO", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "canCuGqNgay", column = @Column(name = "CAN_CU_GQ_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "linhVucGiaoThong", column = @Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "tangVatTamGiu3", column = @Column(name = "TANG_VAT_TAM_GIU3", columnDefinition = "VARCHAR2", length = 2000)),
			@AttributeOverride(name = "tangVatTamGiu4", column = @Column(name = "TANG_VAT_TAM_GIU4", columnDefinition = "VARCHAR2", length = 2000)),
			@AttributeOverride(name = "loaiTvtgId", column = @Column(name = "LOAI_TVTG_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtg", column = @Column(name = "LOAI_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "soTvtg", column = @Column(name = "SO_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)) })
	public ViewQd18Tv18Id getId() {
		return this.id;
	}

	public void setId(ViewQd18Tv18Id id) {
		this.id = id;
	}

}
