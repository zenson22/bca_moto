package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DvcsgtBackupDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DvcsgtBackup
 */
@DAO(daoClass = DvcsgtBackupDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DVCSGT_BACKUP", schema = "BCA_MOTO")
public class DvcsgtBackup implements java.io.Serializable {

	private DvcsgtBackupId id;

	public DvcsgtBackup() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "dvCsgtCaptrenId", column = @Column(name = "DV_CSGT_CAPTREN_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "diaDanhHanhChinhId", column = @Column(name = "DIA_DANH_HANH_CHINH_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "maDonVi", column = @Column(name = "MA_DON_VI", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tenDonVi", column = @Column(name = "TEN_DON_VI", columnDefinition = "VARCHAR2", length = 100)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "tenCoquanChuquan", column = @Column(name = "TEN_COQUAN_CHUQUAN", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tenCoquanLap", column = @Column(name = "TEN_COQUAN_LAP", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "tenDaydu", column = @Column(name = "TEN_DAYDU", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "dienThoai", column = @Column(name = "DIEN_THOAI", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "fax", column = @Column(name = "FAX", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "email", column = @Column(name = "EMAIL", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "ghiChu", column = @Column(name = "GHI_CHU", columnDefinition = "VARCHAR2")),
			@AttributeOverride(name = "nguoiTaoId", column = @Column(name = "NGUOI_TAO_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSuaId", column = @Column(name = "NGUOI_SUA_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "capDonVi", column = @Column(name = "CAP_DON_VI", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "sapXep", column = @Column(name = "SAP_XEP", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "linhVuc", column = @Column(name = "LINH_VUC", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "maThamchieu", column = @Column(name = "MA_THAMCHIEU", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "tenViettat", column = @Column(name = "TEN_VIETTAT", columnDefinition = "VARCHAR2", length = 500)),
			@AttributeOverride(name = "coQuan", column = @Column(name = "CO_QUAN", columnDefinition = "NUMBER", precision = 2, scale = 0)) })
	public DvcsgtBackupId getId() {
		return this.id;
	}

	public void setId(DvcsgtBackupId id) {
		this.id = id;
	}

}
