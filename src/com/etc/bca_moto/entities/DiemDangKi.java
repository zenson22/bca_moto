package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DiemDangKiDAO;
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
 * DiemDangKi
 */
@DAO(daoClass = DiemDangKiDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DIEM_DANG_KI", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class DiemDangKi implements java.io.Serializable {

	private DiemDangKiId id;

	public DiemDangKi() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ten", column = @Column(name = "TEN", columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "loaiPtdk", column = @Column(name = "LOAI_PTDK", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "diadanhHanhchinhId", column = @Column(name = "DIADANH_HANHCHINH_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "soLuongBien", column = @Column(name = "SO_LUONG_BIEN", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenDayDu", column = @Column(name = "TEN_DAY_DU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "quanHuyenId", column = @Column(name = "QUAN_HUYEN_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "dong1", column = @Column(name = "DONG1", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "dong2", column = @Column(name = "DONG2", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "dong3", column = @Column(name = "DONG3", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "tcxmTieuDe1", column = @Column(name = "TCXM_TIEU_DE1", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "tcxmTieuDe2", column = @Column(name = "TCXM_TIEU_DE2", columnDefinition = "VARCHAR2", length = 500)) })
	public DiemDangKiId getId() {
		return this.id;
	}

	public void setId(DiemDangKiId id) {
		this.id = id;
	}

}
