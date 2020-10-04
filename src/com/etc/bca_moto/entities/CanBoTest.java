package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.CanBoTestDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CanBoTest
 */
@DAO(daoClass = CanBoTestDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "CAN_BO_TEST", schema = "BCA_MOTO")
public class CanBoTest implements java.io.Serializable {

	private CanBoTestId id;

	public CanBoTest() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "tenCanBo", column = @Column(name = "TEN_CAN_BO", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "login", column = @Column(name = "LOGIN", nullable = false, columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "matKhau", column = @Column(name = "MAT_KHAU", nullable = false, columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "soHieu", column = @Column(name = "SO_HIEU", nullable = false, columnDefinition = "VARCHAR2", length = 40)),
			@AttributeOverride(name = "email", column = @Column(name = "EMAIL", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "dienThoai", column = @Column(name = "DIEN_THOAI", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "dienThoaiDd", column = @Column(name = "DIEN_THOAI_DD", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "chucVu", column = @Column(name = "CHUC_VU", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "roleId", column = @Column(name = "ROLE_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "diemDangKiId", column = @Column(name = "DIEM_DANG_KI_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "loaiPtdk", column = @Column(name = "LOAI_PTDK", columnDefinition = "VARCHAR2", length = 120)),
			@AttributeOverride(name = "lanhDaoDuyet", column = @Column(name = "LANH_DAO_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "truongPhongDuyet", column = @Column(name = "TRUONG_PHONG_DUYET", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "YKienTruongPhong", column = @Column(name = "Y_KIEN_TRUONG_PHONG", columnDefinition = "VARCHAR2", length = 2000)),
			@AttributeOverride(name = "capBac", column = @Column(name = "CAP_BAC", columnDefinition = "VARCHAR2", length = 200)) })
	public CanBoTestId getId() {
		return this.id;
	}

	public void setId(CanBoTestId id) {
		this.id = id;
	}

}
