package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.TempMotoPortalDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TempMotoPortal
 */
@DAO(daoClass = TempMotoPortalDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "TEMP_MOTO_PORTAL", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class TempMotoPortal implements java.io.Serializable {

	private TempMotoPortalId id;

	public TempMotoPortal() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "quocGiaId", column = @Column(name = "QUOC_GIA_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "diadanhHanhchinhId", column = @Column(name = "DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "soDienThoai", column = @Column(name = "SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "motoMaLoaiXeId", column = @Column(name = "MOTO_MA_LOAI_XE_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "motoNhanhieuLoaixeId", column = @Column(name = "MOTO_NHANHIEU_LOAIXE_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "soLoai", column = @Column(name = "SO_LOAI", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "soMay", column = @Column(name = "SO_MAY", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "soKhung", column = @Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "phanloaiQuanlyId", column = @Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "loaiGiayto", column = @Column(name = "LOAI_GIAYTO", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "idSo", column = @Column(name = "ID_SO", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "idNgayCap", column = @Column(name = "ID_NGAY_CAP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "idNoiCap", column = @Column(name = "ID_NOI_CAP", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "maSoThue", column = @Column(name = "MA_SO_THUE", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "taiKhoan", column = @Column(name = "TAI_KHOAN", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "nganHang", column = @Column(name = "NGAN_HANG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "mauXe", column = @Column(name = "MAU_XE", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "mauSon", column = @Column(name = "MAU_SON", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "loaiNhienLieu", column = @Column(name = "LOAI_NHIEN_LIEU", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "dungTich", column = @Column(name = "DUNG_TICH", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "songuoiDuocphepcho", column = @Column(name = "SONGUOI_DUOCPHEPCHO", columnDefinition = "NUMBER", precision = 6, scale = 0)),
			@AttributeOverride(name = "nuocSx", column = @Column(name = "NUOC_SX", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "namSx", column = @Column(name = "NAM_SX", columnDefinition = "NUMBER", precision = 4, scale = 0)),
			@AttributeOverride(name = "nienHanSuDung", column = @Column(name = "NIEN_HAN_SU_DUNG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguonGoc", column = @Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "soChungTu", column = @Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 14)),
			@AttributeOverride(name = "ngaycapChungtu", column = @Column(name = "NGAYCAP_CHUNGTU", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "coquanCapchungtu", column = @Column(name = "COQUAN_CAPCHUNGTU", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1000)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "maHoso", column = @Column(name = "MA_HOSO", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "maNhom", column = @Column(name = "MA_NHOM", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "trangThaiDangKy", column = @Column(name = "TRANG_THAI_DANG_KY", columnDefinition = "NVARCHAR2", length = 40)),
			@AttributeOverride(name = "ngayDk", column = @Column(name = "NGAY_DK", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "soxeDangky", column = @Column(name = "SOXE_DANGKY", columnDefinition = "NUMBER", precision = 3, scale = 0)),
			@AttributeOverride(name = "thoigianDk", column = @Column(name = "THOIGIAN_DK", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "diemDkId", column = @Column(name = "DIEM_DK_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "bienSo", column = @Column(name = "BIEN_SO", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "oldTen", column = @Column(name = "OLD_TEN", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "oldQuocGiaId", column = @Column(name = "OLD_QUOC_GIA_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "oldDiadanhHanhchinhId", column = @Column(name = "OLD_DIADANH_HANHCHINH_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "oldDiaChi", column = @Column(name = "OLD_DIA_CHI", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "oldSoDienThoai", column = @Column(name = "OLD_SO_DIEN_THOAI", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "oldPhanloaiQuanlyId", column = @Column(name = "OLD_PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "oldLoaiGiayto", column = @Column(name = "OLD_LOAI_GIAYTO", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "oldIdSo", column = @Column(name = "OLD_ID_SO", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "oldIdNgayCap", column = @Column(name = "OLD_ID_NGAY_CAP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "oldIdNoiCap", column = @Column(name = "OLD_ID_NOI_CAP", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "loaiSangten", column = @Column(name = "LOAI_SANGTEN", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "lydoThuhoiDoicap", column = @Column(name = "LYDO_THUHOI_DOICAP", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "bienSoTrunc", column = @Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "hinhthucCaitao", column = @Column(name = "HINHTHUC_CAITAO", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "canhanTochuc", column = @Column(name = "CANHAN_TOCHUC", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "oldCanhanTochuc", column = @Column(name = "OLD_CANHAN_TOCHUC", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "lyDoKhac", column = @Column(name = "LY_DO_KHAC", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "giaytoKemtheo", column = @Column(name = "GIAYTO_KEMTHEO", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "coquanGuiDenghithuhoi", column = @Column(name = "COQUAN_GUI_DENGHITHUHOI", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "motoNhanhieukhac", column = @Column(name = "MOTO_NHANHIEUKHAC", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "mauSonKhac", column = @Column(name = "MAU_SON_KHAC", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "lyDoThuHoi", column = @Column(name = "LY_DO_THU_HOI", columnDefinition = "NVARCHAR2", length = 40)),
			@AttributeOverride(name = "motoLoaixekhac", column = @Column(name = "MOTO_LOAIXEKHAC", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "maNopThueTruocBa", column = @Column(name = "MA_NOP_THUE_TRUOC_BA", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "cmndThue", column = @Column(name = "CMND_THUE", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "noiDungCaiTaoKhac", column = @Column(name = "NOI_DUNG_CAI_TAO_KHAC", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "lyDoStdc", column = @Column(name = "LY_DO_STDC", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ngayDen", column = @Column(name = "NGAY_DEN", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayDi", column = @Column(name = "NGAY_DI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "diemDi", column = @Column(name = "DIEM_DI", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "diemDen", column = @Column(name = "DIEM_DEN", columnDefinition = "VARCHAR2", length = 200)) })
	public TempMotoPortalId getId() {
		return this.id;
	}

	public void setId(TempMotoPortalId id) {
		this.id = id;
	}

}
