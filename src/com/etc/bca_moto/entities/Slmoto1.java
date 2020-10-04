package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.Slmoto1DAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Slmoto1
 */
@DAO(daoClass = Slmoto1DAO.class)
@Caption("{%id}")
@Entity
@Table(name = "SLMOTO1", schema = "BCA_MOTO")
public class Slmoto1 implements java.io.Serializable {

	private Slmoto1Id id;

	public Slmoto1() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "bien", column = @Column(name = "BIEN", columnDefinition = "VARCHAR2", length = 840)),
			@AttributeOverride(name = "ngayDk", column = @Column(name = "NGAY_DK", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "bienCu", column = @Column(name = "BIEN_CU", columnDefinition = "VARCHAR2", length = 840)),
			@AttributeOverride(name = "chuXe", column = @Column(name = "CHU_XE", columnDefinition = "VARCHAR2", length = 920)),
			@AttributeOverride(name = "soCmnd", column = @Column(name = "SO_CMND", columnDefinition = "VARCHAR2", length = 848)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 920)),
			@AttributeOverride(name = "nhanHieu", column = @Column(name = "NHAN_HIEU", columnDefinition = "VARCHAR2", length = 812)),
			@AttributeOverride(name = "soLoai", column = @Column(name = "SO_LOAI", columnDefinition = "VARCHAR2", length = 840)),
			@AttributeOverride(name = "cm", column = @Column(name = "CM", columnDefinition = "NUMBER", precision = 4, scale = 0)),
			@AttributeOverride(name = "loaixe", column = @Column(name = "LOAIXE", columnDefinition = "VARCHAR2", length = 804)),
			@AttributeOverride(name = "soMay", column = @Column(name = "SO_MAY", columnDefinition = "VARCHAR2", length = 880)),
			@AttributeOverride(name = "soKhung", column = @Column(name = "SO_KHUNG", columnDefinition = "VARCHAR2", length = 880)),
			@AttributeOverride(name = "mau", column = @Column(name = "MAU", columnDefinition = "VARCHAR2", length = 808)),
			@AttributeOverride(name = "soHq", column = @Column(name = "SO_HQ", columnDefinition = "VARCHAR2", length = 848)),
			@AttributeOverride(name = "boSung", column = @Column(name = "BO_SUNG", columnDefinition = "VARCHAR2", length = 816)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1120)),
			@AttributeOverride(name = "ngaynhap", column = @Column(name = "NGAYNHAP", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "soSeri", column = @Column(name = "SO_SERI", columnDefinition = "VARCHAR2", length = 840)),
			@AttributeOverride(name = "soTem", column = @Column(name = "SO_TEM", columnDefinition = "VARCHAR2", length = 848)),
			@AttributeOverride(name = "nguonGoc", column = @Column(name = "NGUON_GOC", columnDefinition = "VARCHAR2", length = 808)),
			@AttributeOverride(name = "soHuu", column = @Column(name = "SO_HUU", columnDefinition = "VARCHAR2", length = 808)),
			@AttributeOverride(name = "tonTai", column = @Column(name = "TON_TAI", columnDefinition = "VARCHAR2", length = 808)),
			@AttributeOverride(name = "veViec", column = @Column(name = "VE_VIEC", columnDefinition = "VARCHAR2", length = 808)),
			@AttributeOverride(name = "ngayCmnd", column = @Column(name = "NGAY_CMND", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayDkd", column = @Column(name = "NGAY_DKD", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayBs", column = @Column(name = "NGAY_BS", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "songuoi", column = @Column(name = "SONGUOI", columnDefinition = "VARCHAR2", length = 808)),
			@AttributeOverride(name = "congsuat", column = @Column(name = "CONGSUAT", columnDefinition = "VARCHAR2", length = 824)),
			@AttributeOverride(name = "nsxuat", column = @Column(name = "NSXUAT", columnDefinition = "VARCHAR2", length = 816)),
			@AttributeOverride(name = "ttrong", column = @Column(name = "TTRONG", columnDefinition = "VARCHAR2", length = 816)),
			@AttributeOverride(name = "hhoa", column = @Column(name = "HHOA", columnDefinition = "VARCHAR2", length = 816)),
			@AttributeOverride(name = "ngayHh", column = @Column(name = "NGAY_HH", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "convertDate", column = @Column(name = "CONVERT_DATE", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "dataOfUnit", column = @Column(name = "DATA_OF_UNIT", columnDefinition = "VARCHAR2", length = 800)),
			@AttributeOverride(name = "migrationDate", column = @Column(name = "MIGRATION_DATE", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "action", column = @Column(name = "ACTION", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "note", column = @Column(name = "NOTE", columnDefinition = "VARCHAR2", length = 800)),
			@AttributeOverride(name = "tenPlQlyCu", column = @Column(name = "TEN_PL_QLY_CU", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "tenPlQlyMoi", column = @Column(name = "TEN_PL_QLY_MOI", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "phanLoaiQlyId", column = @Column(name = "PHAN_LOAI_QLY_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "tenNHieuCu", column = @Column(name = "TEN_N_HIEU_CU", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "tenNHieuMoi", column = @Column(name = "TEN_N_HIEU_MOI", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "idNhanHieuMoi", column = @Column(name = "ID_NHAN_HIEU_MOI", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "idLoaiXeMoi", column = @Column(name = "ID_LOAI_XE_MOI", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "tenNgGocCu", column = @Column(name = "TEN_NG_GOC_CU", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "tenNgGocXeMoi", column = @Column(name = "TEN_NG_GOC_XE_MOI", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "maNgGocXeMoi", column = @Column(name = "MA_NG_GOC_XE_MOI", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "idMauMoi", column = @Column(name = "ID_MAU_MOI", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "motoId", column = @Column(name = "MOTO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "dungTichMoi", column = @Column(name = "DUNG_TICH_MOI", columnDefinition = "NUMBER", precision = 6, scale = 0)),
			@AttributeOverride(name = "dauBienTheoTinh", column = @Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "biensoQuocgiaId", column = @Column(name = "BIENSO_QUOCGIA_ID", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "biensoQuocgia", column = @Column(name = "BIENSO_QUOCGIA", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "trangthaiDangky", column = @Column(name = "TRANGTHAI_DANGKY", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "trangthaiHoso", column = @Column(name = "TRANGTHAI_HOSO", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "trangThaiCd", column = @Column(name = "TRANG_THAI_CD", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "dienGiaiTrangThai", column = @Column(name = "DIEN_GIAI_TRANG_THAI", columnDefinition = "VARCHAR2", length = 1000)),
			@AttributeOverride(name = "loiChuyenDoi", column = @Column(name = "LOI_CHUYEN_DOI", columnDefinition = "VARCHAR2", length = 2000)),
			@AttributeOverride(name = "quocGiaId", column = @Column(name = "QUOC_GIA_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "diaDanhHc", column = @Column(name = "DIA_DANH_HC", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "trangThaiXe", column = @Column(name = "TRANG_THAI_XE", columnDefinition = "VARCHAR2", length = 10)),
			@AttributeOverride(name = "diaDanhHanhChinhId", column = @Column(name = "DIA_DANH_HANH_CHINH_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "bienSoTrunc", column = @Column(name = "BIEN_SO_TRUNC", columnDefinition = "VARCHAR2", length = 240)),
			@AttributeOverride(name = "biensoDaydu", column = @Column(name = "BIENSO_DAYDU", columnDefinition = "VARCHAR2", length = 240)),
			@AttributeOverride(name = "noiCapChungTu", column = @Column(name = "NOI_CAP_CHUNG_TU", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "soChungTu", column = @Column(name = "SO_CHUNG_TU", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "ngayCapNhat", column = @Column(name = "NGAY_CAP_NHAT", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)) })
	public Slmoto1Id getId() {
		return this.id;
	}

	public void setId(Slmoto1Id id) {
		this.id = id;
	}

}
