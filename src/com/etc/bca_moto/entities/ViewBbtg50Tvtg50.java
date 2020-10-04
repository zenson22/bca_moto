package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewBbtg50Tvtg50DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewBbtg50Tvtg50
 */
@DAO(daoClass = ViewBbtg50Tvtg50DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_BBTG50_TVTG50", schema = "BCA_MOTO")
public class ViewBbtg50Tvtg50 implements java.io.Serializable {

	private ViewBbtg50Tvtg50Id id;

	public ViewBbtg50Tvtg50() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBanTg", column = @Column(name = "SO_BIEN_BAN_TG", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tenCqCapTren", column = @Column(name = "TEN_CQ_CAP_TREN", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "tenDonVi", column = @Column(name = "TEN_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 150)),
			@AttributeOverride(name = "soBienBanTc", column = @Column(name = "SO_BIEN_BAN_TC", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "diaDanhHc", column = @Column(name = "DIA_DANH_HC", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngayLapBbTg", column = @Column(name = "NGAY_LAP_BB_TG", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canCuXlvphc", column = @Column(name = "CAN_CU_XLVPHC", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "danhSachCanBo", column = @Column(name = "DANH_SACH_CAN_BO", columnDefinition = "VARCHAR2", length = 2000)),
			@AttributeOverride(name = "canCuQuyetDinhTg", column = @Column(name = "CAN_CU_QUYET_DINH_TG", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "canBoTaoBbTg", column = @Column(name = "CAN_BO_TAO_BB_TG", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "canBoTaoBbTgId", column = @Column(name = "CAN_BO_TAO_BB_TG_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", nullable = false, columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "soQuyetDinhTgTc", column = @Column(name = "SO_QUYET_DINH_TG_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayQuyetDinhTd", column = @Column(name = "NGAY_QUYET_DINH_TD", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canBoKyQdTg", column = @Column(name = "CAN_BO_KY_QD_TG", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "thoiGianLapBbTg", column = @Column(name = "THOI_GIAN_LAP_BB_TG", nullable = false, columnDefinition = "DATE", length = 7)),
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
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tinhThanhPhoId", column = @Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "thoiGianTg", column = @Column(name = "THOI_GIAN_TG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "danhSachNguoiCk", column = @Column(name = "DANH_SACH_NGUOI_CK", columnDefinition = "VARCHAR2", length = 2000)),
			@AttributeOverride(name = "YKienNvp", column = @Column(name = "Y_KIEN_NVP", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "YKienNck", column = @Column(name = "Y_KIEN_NCK", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "YKienBoSung", column = @Column(name = "Y_KIEN_BO_SUNG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "lyDoKhongKyBb", column = @Column(name = "LY_DO_KHONG_KY_BB", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "diaDiemTg", column = @Column(name = "DIA_DIEM_TG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "ngayBatDauXl", column = @Column(name = "NGAY_BAT_DAU_XL", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canBoTraLai", column = @Column(name = "CAN_BO_TRA_LAI", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTraLai", column = @Column(name = "NGAY_TRA_LAI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "namTaoBb", column = @Column(name = "NAM_TAO_BB", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThaiBb", column = @Column(name = "TRANG_THAI_BB", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "soBb43Tc", column = @Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "gioLapBb", column = @Column(name = "GIO_LAP_BB", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "phutLapBb", column = @Column(name = "PHUT_LAP_BB", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "canBo18", column = @Column(name = "CAN_BO_18", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "maVuViec", column = @Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "maThongTu", column = @Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "dacDiemTangVat1", column = @Column(name = "DAC_DIEM_TANG_VAT1", columnDefinition = "VARCHAR2", length = 1000)),
			@AttributeOverride(name = "dacDiemTangVat2", column = @Column(name = "DAC_DIEM_TANG_VAT2", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "ghiChu1", column = @Column(name = "GHI_CHU1", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "ghiChu2", column = @Column(name = "GHI_CHU2", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "ngaySinhNvpNhap", column = @Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "linhVucGiaoThong", column = @Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "idTvtg", column = @Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan50", column = @Column(name = "SO_BIEN_BAN_50", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtg", column = @Column(name = "LOAI_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ghiChuTvtg", column = @Column(name = "GHI_CHU_TVTG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soTvtg", column = @Column(name = "SO_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "dacDiemChung", column = @Column(name = "DAC_DIEM_CHUNG", columnDefinition = "VARCHAR2", length = 500)) })
	public ViewBbtg50Tvtg50Id getId() {
		return this.id;
	}

	public void setId(ViewBbtg50Tvtg50Id id) {
		this.id = id;
	}

}
