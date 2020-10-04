package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.BaoCaoThMotoLDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BaoCaoThMotoL
 */
@DAO(daoClass = BaoCaoThMotoLDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "BAO_CAO_TH_MOTO_LS", schema = "BCA_MOTO")
public class BaoCaoThMotoL implements java.io.Serializable {

	private BaoCaoThMotoLId id;

	public BaoCaoThMotoL() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "biensoDaydu", column = @Column(name = "BIENSO_DAYDU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "biensoCu", column = @Column(name = "BIENSO_CU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "tenCanBoDangKy", column = @Column(name = "TEN_CAN_BO_DANG_KY", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "login", column = @Column(name = "LOGIN", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenDonViCsgt", column = @Column(name = "TEN_DON_VI_CSGT", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "diemDangKiId", column = @Column(name = "DIEM_DANG_KI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenDdk", column = @Column(name = "TEN_DDK", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "quocgiaId", column = @Column(name = "QUOCGIA_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenQuocgia", column = @Column(name = "TEN_QUOCGIA", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "soDienThoai", column = @Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "diadanhHanhchinhId", column = @Column(name = "DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenDdhcxa", column = @Column(name = "TEN_DDHCXA", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "idHuyen", column = @Column(name = "ID_HUYEN", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenHuyen", column = @Column(name = "TEN_HUYEN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "idTinh", column = @Column(name = "ID_TINH", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenTinh", column = @Column(name = "TEN_TINH", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 2048)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "tenMauBien", column = @Column(name = "TEN_MAU_BIEN", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "ngayDangky", column = @Column(name = "NGAY_DANGKY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "strNgayDangky", column = @Column(name = "STR_NGAY_DANGKY", columnDefinition = "VARCHAR2", length = 8)),
			@AttributeOverride(name = "thongkeNgay", column = @Column(name = "THONGKE_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "maLoaiXeId", column = @Column(name = "MA_LOAI_XE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenLoaiXe", column = @Column(name = "TEN_LOAI_XE", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "nhanhieuLoaixeId", column = @Column(name = "NHANHIEU_LOAIXE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenNhanHieu", column = @Column(name = "TEN_NHAN_HIEU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "soLoai", column = @Column(name = "SO_LOAI", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "soKhung", column = @Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "soMay", column = @Column(name = "SO_MAY", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "phanloaiQuanlyId", column = @Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenPhanLoaiQuanly", column = @Column(name = "TEN_PHAN_LOAI_QUANLY", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "loaiGiayto", column = @Column(name = "LOAI_GIAYTO", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "tenLoaiGiayTo", column = @Column(name = "TEN_LOAI_GIAY_TO", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "idSo", column = @Column(name = "ID_SO", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "idNgayCap", column = @Column(name = "ID_NGAY_CAP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "idNoiCap", column = @Column(name = "ID_NOI_CAP", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "tenNoiCapCmnd", column = @Column(name = "TEN_NOI_CAP_CMND", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "maSoThue", column = @Column(name = "MA_SO_THUE", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "taiKhoan", column = @Column(name = "TAI_KHOAN", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "nganHang", column = @Column(name = "NGAN_HANG", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "mauXe", column = @Column(name = "MAU_XE", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenMauXe", column = @Column(name = "TEN_MAU_XE", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "loaiNhienLieu", column = @Column(name = "LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "tenLoaiNhienLieu", column = @Column(name = "TEN_LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "congSuat", column = @Column(name = "CONG_SUAT", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "dungTich", column = @Column(name = "DUNG_TICH", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "nuocSx", column = @Column(name = "NUOC_SX", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenQuocGiaSx", column = @Column(name = "TEN_QUOC_GIA_SX", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "namSx", column = @Column(name = "NAM_SX", columnDefinition = "NUMBER", precision = 4, scale = 0)),
			@AttributeOverride(name = "nienHanSuDung", column = @Column(name = "NIEN_HAN_SU_DUNG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "hieulucDenngay", column = @Column(name = "HIEULUC_DENNGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguonGoc", column = @Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "tenNguonGoc", column = @Column(name = "TEN_NGUON_GOC", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "soChungTu", column = @Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 80)),
			@AttributeOverride(name = "ngaycapChungtu", column = @Column(name = "NGAYCAP_CHUNGTU", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "coquanCapchungtu", column = @Column(name = "COQUAN_CAPCHUNGTU", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "tenTrangThaiXe", column = @Column(name = "TEN_TRANG_THAI_XE", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "soChungnhandk", column = @Column(name = "SO_CHUNGNHANDK", columnDefinition = "VARCHAR2", length = 40)),
			@AttributeOverride(name = "trangthaiHoso", column = @Column(name = "TRANGTHAI_HOSO", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "tenTrangthaiHoso", column = @Column(name = "TEN_TRANGTHAI_HOSO", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "trangthaiDangky", column = @Column(name = "TRANGTHAI_DANGKY", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "tenTrangthaiDangky", column = @Column(name = "TEN_TRANGTHAI_DANGKY", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayDkLandau", column = @Column(name = "NGAY_DK_LANDAU", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "strNgayDkLandau", column = @Column(name = "STR_NGAY_DK_LANDAU", columnDefinition = "VARCHAR2", length = 8)),
			@AttributeOverride(name = "ngayDi", column = @Column(name = "NGAY_DI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayDen", column = @Column(name = "NGAY_DEN", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "hinhthucCaitao", column = @Column(name = "HINHTHUC_CAITAO", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "tenLoaiCaiTao", column = @Column(name = "TEN_LOAI_CAI_TAO", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "lydoThuhoiDoicap", column = @Column(name = "LYDO_THUHOI_DOICAP", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "tenLoaiDoiCap", column = @Column(name = "TEN_LOAI_DOI_CAP", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "maGiaoDich", column = @Column(name = "MA_GIAO_DICH", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ngayCaiTao", column = @Column(name = "NGAY_CAI_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayThuHoi", column = @Column(name = "NGAY_THU_HOI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayDiChuyen", column = @Column(name = "NGAY_DI_CHUYEN", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "motoId", column = @Column(name = "MOTO_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "songuoiDuocphepcho", column = @Column(name = "SONGUOI_DUOCPHEPCHO", columnDefinition = "NUMBER", precision = 2, scale = 0)) })
	public BaoCaoThMotoLId getId() {
		return this.id;
	}

	public void setId(BaoCaoThMotoLId id) {
		this.id = id;
	}

}
