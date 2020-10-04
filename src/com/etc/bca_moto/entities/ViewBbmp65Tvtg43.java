package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewBbmp65Tvtg43DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewBbmp65Tvtg43
 */
@DAO(daoClass = ViewBbmp65Tvtg43DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_BBMP65_TVTG43", schema = "BCA_MOTO")
public class ViewBbmp65Tvtg43 implements java.io.Serializable {

	private ViewBbmp65Tvtg43Id id;

	public ViewBbmp65Tvtg43() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBanMnp", column = @Column(name = "SO_BIEN_BAN_MNP", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "donViCanhsatGtId", column = @Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tenCqCapTren", column = @Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "canCu", column = @Column(name = "CAN_CU", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "gioLapBb", column = @Column(name = "GIO_LAP_BB", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "phutLapBb", column = @Column(name = "PHUT_LAP_BB", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "diaDiemLap", column = @Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "canBoLapId", column = @Column(name = "CAN_BO_LAP_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "capBacChucVu", column = @Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "donVi", column = @Column(name = "DON_VI", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "nguoiChungKien", column = @Column(name = "NGUOI_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "nguoiBaoQuan", column = @Column(name = "NGUOI_BAO_QUAN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "qdMoTvSo", column = @Column(name = "QD_MO_TV_SO", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "qdMoTvNgay", column = @Column(name = "QD_MO_TV_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "thuTucHcSo", column = @Column(name = "THU_TUC_HC_SO", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "thuTucHcNgay", column = @Column(name = "THU_TUC_HC_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "YKienBoSung", column = @Column(name = "Y_KIEN_BO_SUNG", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "bb64Id", column = @Column(name = "BB64_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayLapBbXong", column = @Column(name = "NGAY_LAP_BB_XONG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "gioLapBbXong", column = @Column(name = "GIO_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "phutLapBbXong", column = @Column(name = "PHUT_LAP_BB_XONG", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "giaoCho", column = @Column(name = "GIAO_CHO", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "cbxlId", column = @Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tinhThanhPhoId", column = @Column(name = "TINH_THANH_PHO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namTaoQd", column = @Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySinhNvpNhap", column = @Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "canBoLap", column = @Column(name = "CAN_BO_LAP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "qdTamgiuSo", column = @Column(name = "QD_TAMGIU_SO", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "qdTamgiuNgay", column = @Column(name = "QD_TAMGIU_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "soBb43Tc", column = @Column(name = "SO_BB43_TC", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "tangVat1", column = @Column(name = "TANG_VAT1", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "tangVat2", column = @Column(name = "TANG_VAT2", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "idTvtg", column = @Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtgId", column = @Column(name = "LOAI_TVTG_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtg", column = @Column(name = "LOAI_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soTvtg", column = @Column(name = "SO_TVTG", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "hangTvtg", column = @Column(name = "HANG_TVTG", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "noiCapTvtg", column = @Column(name = "NOI_CAP_TVTG", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "hieuLucTvtg", column = @Column(name = "HIEU_LUC_TVTG", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)) })
	public ViewBbmp65Tvtg43Id getId() {
		return this.id;
	}

	public void setId(ViewBbmp65Tvtg43Id id) {
		this.id = id;
	}

}
