package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DonViCsgtDAO;
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
 * DonViCsgt
 */
@DAO(daoClass = DonViCsgtDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DON_VI_CSGT", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class DonViCsgt implements java.io.Serializable {

	private DonViCsgtId id;

	public DonViCsgt() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "maDonVi", column = @Column(name = "MA_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "tenDonVi", column = @Column(name = "TEN_DON_VI", nullable = false, columnDefinition = "VARCHAR2", length = 200)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "dvCsgtCaptrenId", column = @Column(name = "DV_CSGT_CAPTREN_ID", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "diadanhHanhchinhId", column = @Column(name = "DIADANH_HANHCHINH_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThaiKichHoat", column = @Column(name = "TRANG_THAI_KICH_HOAT", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "capDonVi", column = @Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "khoangCachIn", column = @Column(name = "KHOANG_CACH_IN", columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public DonViCsgtId getId() {
		return this.id;
	}

	public void setId(DonViCsgtId id) {
		this.id = id;
	}

}
