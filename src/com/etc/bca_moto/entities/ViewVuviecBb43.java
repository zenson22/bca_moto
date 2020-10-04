package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewVuviecBb43DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewVuviecBb43
 */
@DAO(daoClass = ViewVuviecBb43DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_VUVIEC_BB43", schema = "BCA_MOTO")
public class ViewVuviecBb43 implements java.io.Serializable {

	private ViewVuviecBb43Id id;

	public ViewVuviecBb43() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idVuviec", column = @Column(name = "ID_VUVIEC", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "uuid", column = @Column(name = "UUID", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "loaiBbQd", column = @Column(name = "LOAI_BB_QD", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "bbQdId", column = @Column(name = "BB_QD_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "maTheoTt", column = @Column(name = "MA_THEO_TT", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "maRutgon", column = @Column(name = "MA_RUTGON", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "maVuViecVv", column = @Column(name = "MA_VU_VIEC_VV", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "loaiPtIdVv", column = @Column(name = "LOAI_PT_ID_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "bienKsVv", column = @Column(name = "BIEN_KS_VV", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "tenNvpVv", column = @Column(name = "TEN_NVP_VV", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "nguoiTaoVv", column = @Column(name = "NGUOI_TAO_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ngayTaoVv", column = @Column(name = "NGAY_TAO_VV", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSuaVv", column = @Column(name = "NGUOI_SUA_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ngaySuaVv", column = @Column(name = "NGAY_SUA_VV", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiVv", column = @Column(name = "TRANG_THAI_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ghiChuVv", column = @Column(name = "GHI_CHU_VV", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "dvCsgtIdVv", column = @Column(name = "DV_CSGT_ID_VV", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "idBb43", column = @Column(name = "ID_BB43", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tenCucCsgt", column = @Column(name = "TEN_CUC_CSGT", columnDefinition = "VARCHAR2", length = 150)),
			@AttributeOverride(name = "canCu", column = @Column(name = "CAN_CU", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "diaDiemVphc", column = @Column(name = "DIA_DIEM_VPHC", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "tenCanBo", column = @Column(name = "TEN_CAN_BO", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "thoiGianVphc", column = @Column(name = "THOI_GIAN_VPHC", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayThangVphc", column = @Column(name = "NGAY_THANG_VPHC", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "chucVu", column = @Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "donViCsgt", column = @Column(name = "DON_VI_CSGT", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "tenNc1", column = @Column(name = "TEN_NC1", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ngheNghiepNc1", column = @Column(name = "NGHE_NGHIEP_NC1", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "soCmndNc1", column = @Column(name = "SO_CMND_NC1", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "diaChiNc1", column = @Column(name = "DIA_CHI_NC1", columnDefinition = "VARCHAR2", length = 150)),
			@AttributeOverride(name = "sdtNc1", column = @Column(name = "SDT_NC1", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "tenNc2", column = @Column(name = "TEN_NC2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "ngheNghiepNc2", column = @Column(name = "NGHE_NGHIEP_NC2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "soCmndNc2", column = @Column(name = "SO_CMND_NC2", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "diaChiNc2", column = @Column(name = "DIA_CHI_NC2", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "sdtNc2", column = @Column(name = "SDT_NC2", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "tenNvp", column = @Column(name = "TEN_NVP", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "ngaySinhNvp", column = @Column(name = "NGAY_SINH_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "quocTichNvp", column = @Column(name = "QUOC_TICH_NVP", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "ngheNghiepNvp", column = @Column(name = "NGHE_NGHIEP_NVP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "diaChiNvp", column = @Column(name = "DIA_CHI_NVP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "soCmndNvp", column = @Column(name = "SO_CMND_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapCmndNvp", column = @Column(name = "NGAY_CAP_CMND_NVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiCapCmndNvp", column = @Column(name = "NOI_CAP_CMND_NVP", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "noiDungVphc", column = @Column(name = "NOI_DUNG_VPHC", columnDefinition = "VARCHAR2", length = 2000)),
			@AttributeOverride(name = "YKienNvp", column = @Column(name = "Y_KIEN_NVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "YKienNbh", column = @Column(name = "Y_KIEN_NBH", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "tangVatTg", column = @Column(name = "TANG_VAT_TG", columnDefinition = "VARCHAR2", length = 1000)),
			@AttributeOverride(name = "thoiGianGqvp", column = @Column(name = "THOI_GIAN_GQVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayGqvp", column = @Column(name = "NGAY_GQVP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "diaDiemGqvp", column = @Column(name = "DIA_DIEM_GQVP", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "thoiHanGqvp", column = @Column(name = "THOI_HAN_GQVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "soTrangBb", column = @Column(name = "SO_TRANG_BB", columnDefinition = "VARCHAR2", length = 5)),
			@AttributeOverride(name = "soBanBb", column = @Column(name = "SO_BAN_BB", columnDefinition = "VARCHAR2", length = 5)),
			@AttributeOverride(name = "lyDoKoKyBb", column = @Column(name = "LY_DO_KO_KY_BB", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "qdXphc", column = @Column(name = "QD_XPHC", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "qdTgtgtv", column = @Column(name = "QD_TGTGTV", columnDefinition = "VARCHAR2", length = 2)),
			@AttributeOverride(name = "bienPhapNganChanVphc", column = @Column(name = "BIEN_PHAP_NGAN_CHAN_VPHC", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "thoiGianBbLap", column = @Column(name = "THOI_GIAN_BB_LAP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayBbLap", column = @Column(name = "NGAY_BB_LAP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "canBoTiepNhanGt", column = @Column(name = "CAN_BO_TIEP_NHAN_GT", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "nguoiTaoId", column = @Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "nguoiSuaId", column = @Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "donViCsgtCapTren", column = @Column(name = "DON_VI_CSGT_CAP_TREN", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "loaiPhuongTien", column = @Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "loaiPhuongTienId", column = @Column(name = "LOAI_PHUONG_TIEN_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "bienKiemSoat", column = @Column(name = "BIEN_KIEM_SOAT", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "soQdxphc", column = @Column(name = "SO_QDXPHC", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soQdtgtv", column = @Column(name = "SO_QDTGTV", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBbtgtv", column = @Column(name = "SO_BBTGTV", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soQdtltv", column = @Column(name = "SO_QDTLTV", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBbtltv", column = @Column(name = "SO_BBTLTV", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "idTheoNam", column = @Column(name = "ID_THEO_NAM", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "namLapBb", column = @Column(name = "NAM_LAP_BB", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "nhapBb", column = @Column(name = "NHAP_BB", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "trangThaiBb", column = @Column(name = "TRANG_THAI_BB", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "canBoXuLyId", column = @Column(name = "CAN_BO_XU_LY_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "canBoTraLaiId", column = @Column(name = "CAN_BO_TRA_LAI_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTraLai", column = @Column(name = "NGAY_TRA_LAI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "namTaoBb", column = @Column(name = "NAM_TAO_BB", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "toChuc", column = @Column(name = "TO_CHUC", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "quocTichNvpId", column = @Column(name = "QUOC_TICH_NVP_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngheNghiepNvpId", column = @Column(name = "NGHE_NGHIEP_NVP_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "soDienThoaiNvp", column = @Column(name = "SO_DIEN_THOAI_NVP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "quyenSo", column = @Column(name = "QUYEN_SO", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "tenNvpDvc", column = @Column(name = "TEN_NVP_DVC", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "tenCanBoNhap", column = @Column(name = "TEN_CAN_BO_NHAP", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "capBacNhap", column = @Column(name = "CAP_BAC_NHAP", columnDefinition = "NUMBER", precision = 5, scale = 0)),
			@AttributeOverride(name = "chucVuNhap", column = @Column(name = "CHUC_VU_NHAP", columnDefinition = "NUMBER", precision = 5, scale = 0)),
			@AttributeOverride(name = "gplx", column = @Column(name = "GPLX", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "kiemDinh", column = @Column(name = "KIEM_DINH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tinhThanhId", column = @Column(name = "TINH_THANH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "hangGplx", column = @Column(name = "HANG_GPLX", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "maDonVi", column = @Column(name = "MA_DON_VI", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "maTinhThanh", column = @Column(name = "MA_TINH_THANH", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngaySinhNvpNhap", column = @Column(name = "NGAY_SINH_NVP_NHAP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "capDonVi", column = @Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 5, scale = 0)),
			@AttributeOverride(name = "linhVucGiaoThong", column = @Column(name = "LINH_VUC_GIAO_THONG", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "maVuViec", column = @Column(name = "MA_VU_VIEC", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "maThongTu", column = @Column(name = "MA_THONG_TU", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngayLapBb", column = @Column(name = "NGAY_LAP_BB", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "thoiGianLapBb", column = @Column(name = "THOI_GIAN_LAP_BB", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "maSoDn", column = @Column(name = "MA_SO_DN", columnDefinition = "VARCHAR2", length = 80)) })
	public ViewVuviecBb43Id getId() {
		return this.id;
	}

	public void setId(ViewVuviecBb43Id id) {
		this.id = id;
	}

}
