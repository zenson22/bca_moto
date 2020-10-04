package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewBbtt54Tvtg54DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewBbtt54Tvtg54
 */
@DAO(daoClass = ViewBbtt54Tvtg54DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_BBTT54_TVTG54", schema = "BCA_MOTO")
public class ViewBbtt54Tvtg54 implements java.io.Serializable {

	private ViewBbtt54Tvtg54Id id;

	public ViewBbtt54Tvtg54() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", nullable = false, columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "donViCanhsatGtId", column = @Column(name = "DON_VI_CANHSAT_GT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "qd11Id", column = @Column(name = "QD_11_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "thoiGianLapBb", column = @Column(name = "THOI_GIAN_LAP_BB", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "diaDiemLapBb", column = @Column(name = "DIA_DIEM_LAP_BB", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "cbxlId1", column = @Column(name = "CBXL_ID1", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "cbxlId2", column = @Column(name = "CBXL_ID2", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "cbxlId3", column = @Column(name = "CBXL_ID3", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "chungToiGom", column = @Column(name = "CHUNG_TOI_GOM", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "dsChungKien", column = @Column(name = "DS_CHUNG_KIEN", columnDefinition = "VARCHAR2", length = 250)),
			@AttributeOverride(name = "tienHanhKham", column = @Column(name = "TIEN_HANH_KHAM", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 150)),
			@AttributeOverride(name = "daTienHanhNp", column = @Column(name = "DA_TIEN_HANH_NP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "nguoiCk", column = @Column(name = "NGUOI_CK", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "YKienCaNhan", column = @Column(name = "Y_KIEN_CA_NHAN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "YKienNguoiCk", column = @Column(name = "Y_KIEN_NGUOI_CK", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "YKienBoSung", column = @Column(name = "Y_KIEN_BO_SUNG", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "thoiGianBbLapXong", column = @Column(name = "THOI_GIAN_BB_LAP_XONG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "idNam", column = @Column(name = "ID_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namTaoQd", column = @Column(name = "NAM_TAO_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiKiBb", column = @Column(name = "NGUOI_KI_BB", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "idTvtg", column = @Column(name = "ID_TVTG", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan54", column = @Column(name = "SO_BIEN_BAN_54", nullable = false, columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "indexTvtg", column = @Column(name = "INDEX_TVTG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "loaiTvtg", column = @Column(name = "LOAI_TVTG", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soLuong", column = @Column(name = "SO_LUONG", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViTinh", column = @Column(name = "DON_VI_TINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ghiChuTvtg", column = @Column(name = "GHI_CHU_TVTG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tinhTrang", column = @Column(name = "TINH_TRANG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soTvtg", column = @Column(name = "SO_TVTG", columnDefinition = "VARCHAR2", length = 20)) })
	public ViewBbtt54Tvtg54Id getId() {
		return this.id;
	}

	public void setId(ViewBbtt54Tvtg54Id id) {
		this.id = id;
	}

}
