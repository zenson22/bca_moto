package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TestQdXpvphc01DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TestQdXpvphc01
 */
@DAO(daoClass = TestQdXpvphc01DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "TEST_QD_XPVPHC_01", schema = "BCA_MOTO")
public class TestQdXpvphc01 implements java.io.Serializable {

	private TestQdXpvphc01Id id;

	public TestQdXpvphc01() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soQuyetDinh", column = @Column(name = "SO_QUYET_DINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tenCqCapTren", column = @Column(name = "TEN_CQ_CAP_TREN", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tenDonVi", column = @Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "soBienBanTc", column = @Column(name = "SO_BIEN_BAN_TC", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "diaDanhHc", column = @Column(name = "DIA_DANH_HC", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngayLapQd", column = @Column(name = "NGAY_LAP_QD", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canCuXlvphc", column = @Column(name = "CAN_CU_XLVPHC", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "canCuNghiDinh", column = @Column(name = "CAN_CU_NGHI_DINH", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "canCuBienBan", column = @Column(name = "CAN_CU_BIEN_BAN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "canCuBbGt", column = @Column(name = "CAN_CU_BB_GT", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngayThangGt", column = @Column(name = "NGAY_THANG_GT", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canBoRaQd", column = @Column(name = "CAN_BO_RA_QD", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "canBoRaQdId", column = @Column(name = "CAN_BO_RA_QD_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "hinhThucXp", column = @Column(name = "HINH_THUC_XP", columnDefinition = "VARCHAR2", length = 250)),
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "tnGiamNhe", column = @Column(name = "TN_GIAM_NHE", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "xuPhatBoSung", column = @Column(name = "XU_PHAT_BO_SUNG", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "bienPhapNganChan", column = @Column(name = "BIEN_PHAP_NGAN_CHAN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "bienPhapKhacPhuc", column = @Column(name = "BIEN_PHAP_KHAC_PHUC", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "thoiHanXpbs", column = @Column(name = "THOI_HAN_XPBS", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "thoiHanKphq", column = @Column(name = "THOI_HAN_KPHQ", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "kinhPhiKp", column = @Column(name = "KINH_PHI_KP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "kinhPhiBangChu", column = @Column(name = "KINH_PHI_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "donViKp", column = @Column(name = "DON_VI_KP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tongMucPhat", column = @Column(name = "TONG_MUC_PHAT", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "mucPhatBangChu", column = @Column(name = "MUC_PHAT_BANG_CHU", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngayHieuLuc", column = @Column(name = "NGAY_HIEU_LUC", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "diaChiNopTien", column = @Column(name = "DIA_CHI_NOP_TIEN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "thoiHanNopPhat", column = @Column(name = "THOI_HAN_NOP_PHAT", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "donViThuTien", column = @Column(name = "DON_VI_THU_TIEN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "dvThiHanhQd", column = @Column(name = "DV_THI_HANH_QD", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "capTrenPheDuyet", column = @Column(name = "CAP_TREN_PHE_DUYET", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "capDuoiKyNhay", column = @Column(name = "CAP_DUOI_KY_NHAY", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "canBoNhanXuLy", column = @Column(name = "CAN_BO_NHAN_XU_LY", columnDefinition = "VARCHAR2", length = 70)),
			@AttributeOverride(name = "cbxlId", column = @Column(name = "CBXL_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "capBacChucVu", column = @Column(name = "CAP_BAC_CHUC_VU", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "hanhViVp", column = @Column(name = "HANH_VI_VP", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "tangVatTg", column = @Column(name = "TANG_VAT_TG", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "idTheoNam", column = @Column(name = "ID_THEO_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "nhapQd", column = @Column(name = "NHAP_QD", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThaiQd", column = @Column(name = "TRANG_THAI_QD", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "namLapQd", column = @Column(name = "NAM_LAP_QD", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "toChuc", column = @Column(name = "TO_CHUC", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "tinhThanhId", column = @Column(name = "TINH_THANH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "quocGiaId", column = @Column(name = "QUOC_GIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "cancuNdId", column = @Column(name = "CANCU_ND_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "bienKiemSoat", column = @Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "tgDiadiemVp", column = @Column(name = "TG_DIADIEM_VP", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "gioNhanQd", column = @Column(name = "GIO_NHAN_QD", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "phutNhanQd", column = @Column(name = "PHUT_NHAN_QD", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "linhVucGiaoThong", column = @Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "maVuViec", column = @Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "maThongTu", column = @Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "dobNvp", column = @Column(name = "DOB_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "nguoiGiamHo", column = @Column(name = "NGUOI_GIAM_HO", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ngayCanCuXphc", column = @Column(name = "NGAY_CAN_CU_XPHC", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "diaDiemLap", column = @Column(name = "DIA_DIEM_LAP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "loaiPhuongTien", column = @Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "loaiPhuongTienId", column = @Column(name = "LOAI_PHUONG_TIEN_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayThangVphc", column = @Column(name = "NGAY_THANG_VPHC", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "thoiGianVphc", column = @Column(name = "THOI_GIAN_VPHC", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "diaDiemVphc", column = @Column(name = "DIA_DIEM_VPHC", columnDefinition = "VARCHAR2", length = 2000)) })
	public TestQdXpvphc01Id getId() {
		return this.id;
	}

	public void setId(TestQdXpvphc01Id id) {
		this.id = id;
	}

}
