package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DelMotoDangKyDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DelMotoDangKy
 */
@DAO(daoClass = DelMotoDangKyDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DEL_MOTO_DANG_KY", schema = "BCA_MOTO")
public class DelMotoDangKy implements java.io.Serializable {

	private DelMotoDangKyId id;

	public DelMotoDangKy() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "motoId", column = @Column(name = "MOTO_ID", nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "chuSoHuuId", column = @Column(name = "CHU_SO_HUU_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "phanloaiQuanlyId", column = @Column(name = "PHANLOAI_QUANLY_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "dauBienTheoTinh", column = @Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 12)),
			@AttributeOverride(name = "biensoQuocgiaId", column = @Column(name = "BIENSO_QUOCGIA_ID", columnDefinition = "VARCHAR2", length = 16)),
			@AttributeOverride(name = "biensoDaydu", column = @Column(name = "BIENSO_DAYDU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "biensoCu", column = @Column(name = "BIENSO_CU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "canboDangkyId", column = @Column(name = "CANBO_DANGKY_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayDangky", column = @Column(name = "NGAY_DANGKY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangthaiDangky", column = @Column(name = "TRANGTHAI_DANGKY", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "hieuLucDk", column = @Column(name = "HIEU_LUC_DK", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "ngayTradangky", column = @Column(name = "NGAY_TRADANGKY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayDkLandau", column = @Column(name = "NGAY_DK_LANDAU", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "hieulucDenngay", column = @Column(name = "HIEULUC_DENNGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "soChungnhandk", column = @Column(name = "SO_CHUNGNHANDK", columnDefinition = "VARCHAR2", length = 40)),
			@AttributeOverride(name = "trangthaiHoso", column = @Column(name = "TRANGTHAI_HOSO", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "lydoThuhoiDoicap", column = @Column(name = "LYDO_THUHOI_DOICAP", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "hinhthucCaitao", column = @Column(name = "HINHTHUC_CAITAO", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "noiTamNhap", column = @Column(name = "NOI_TAM_NHAP", columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "ngayTamNhap", column = @Column(name = "NGAY_TAM_NHAP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "noiTaiXuat", column = @Column(name = "NOI_TAI_XUAT", columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "ngayTaiXuat", column = @Column(name = "NGAY_TAI_XUAT", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "duocphepDitu", column = @Column(name = "DUOCPHEP_DITU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ngayDi", column = @Column(name = "NGAY_DI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "duocphepDiden", column = @Column(name = "DUOCPHEP_DIDEN", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ngayDen", column = @Column(name = "NGAY_DEN", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "daTaiXuat", column = @Column(name = "DA_TAI_XUAT", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "capPheDuyet", column = @Column(name = "CAP_PHE_DUYET", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ngayPheDuyet", column = @Column(name = "NGAY_PHE_DUYET", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "mucDichSuDung", column = @Column(name = "MUC_DICH_SU_DUNG", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "noiDungPheDuyet", column = @Column(name = "NOI_DUNG_PHE_DUYET", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "khuKtdbId", column = @Column(name = "KHU_KTDB_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "dauBienQuocGia", column = @Column(name = "DAU_BIEN_QUOC_GIA", columnDefinition = "VARCHAR2", length = 5)),
			@AttributeOverride(name = "motoBienSoid", column = @Column(name = "MOTO_BIEN_SOID", columnDefinition = "NUMBER", precision = 30, scale = 0)),
			@AttributeOverride(name = "lanhDaoDuyet", column = @Column(name = "LANH_DAO_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "doiTruongDuyet", column = @Column(name = "DOI_TRUONG_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "khoa", column = @Column(name = "KHOA", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "phamViHoatDong", column = @Column(name = "PHAM_VI_HOAT_DONG", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "bienSoNuocNgoai", column = @Column(name = "BIEN_SO_NUOC_NGOAI", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "loaiDangKyTam", column = @Column(name = "LOAI_DANG_KY_TAM", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "coQuanCapPhep", column = @Column(name = "CO_QUAN_CAP_PHEP", columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "ngayCapPhep", column = @Column(name = "NGAY_CAP_PHEP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "lanhDaoId", column = @Column(name = "LANH_DAO_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "doiTruongId", column = @Column(name = "DOI_TRUONG_ID", columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "lyDoThuHoi", column = @Column(name = "LY_DO_THU_HOI", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "soPhuHieuKs", column = @Column(name = "SO_PHU_HIEU_KS", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "ngayCapPhuHieu", column = @Column(name = "NGAY_CAP_PHU_HIEU", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "phuHieuHlTuNgay", column = @Column(name = "PHU_HIEU_HL_TU_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "phuHieuHlDenNgay", column = @Column(name = "PHU_HIEU_HL_DEN_NGAY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "donViChuyenDen", column = @Column(name = "DON_VI_CHUYEN_DEN", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "laKhuKtdb", column = @Column(name = "LA_KHU_KTDB", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "soLanDoiCap", column = @Column(name = "SO_LAN_DOI_CAP", columnDefinition = "NUMBER", precision = 2, scale = 0)),
			@AttributeOverride(name = "duLieuCu", column = @Column(name = "DU_LIEU_CU", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "maGiaoDich", column = @Column(name = "MA_GIAO_DICH", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "matBien", column = @Column(name = "MAT_BIEN", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "matDangKy", column = @Column(name = "MAT_DANG_KY", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "biensoTam", column = @Column(name = "BIENSO_TAM", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "canCu", column = @Column(name = "CAN_CU", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "bienHeThongCu", column = @Column(name = "BIEN_HE_THONG_CU", columnDefinition = "VARCHAR2", length = 15)),
			@AttributeOverride(name = "dkMoi", column = @Column(name = "DK_MOI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayCaiTao", column = @Column(name = "NGAY_CAI_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayThuHoi", column = @Column(name = "NGAY_THU_HOI", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayDiChuyen", column = @Column(name = "NGAY_DI_CHUYEN", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "duocphepDiden1", column = @Column(name = "DUOCPHEP_DIDEN1", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "bienSoTrunc", column = @Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "diemDkId", column = @Column(name = "DIEM_DK_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "loaiStnt", column = @Column(name = "LOAI_STNT", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "lyDoTraBien", column = @Column(name = "LY_DO_TRA_BIEN", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ngayTuDongHoanThanh", column = @Column(name = "NGAY_TU_DONG_HOAN_THANH", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nhapDuLieuCu", column = @Column(name = "NHAP_DU_LIEU_CU", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "dangkyTam", column = @Column(name = "DANGKY_TAM", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "seriSo", column = @Column(name = "SERI_SO", columnDefinition = "NUMBER", precision = 10, scale = 0)) })
	public DelMotoDangKyId getId() {
		return this.id;
	}

	public void setId(DelMotoDangKyId id) {
		this.id = id;
	}

}
