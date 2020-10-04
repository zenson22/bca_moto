package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.QuyenDanhDauBienDAO;
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
 * QuyenDanhDauBien
 */
@DAO(daoClass = QuyenDanhDauBienDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "QUYEN_DANH_DAU_BIEN", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class QuyenDanhDauBien implements java.io.Serializable {

	private QuyenDanhDauBienId id;

	public QuyenDanhDauBien() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "gddvSoCongVan", column = @Column(name = "GDDV_SO_CONG_VAN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "gddvNgayCongVan", column = @Column(name = "GDDV_NGAY_CONG_VAN", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "gddvNguoiDuyet", column = @Column(name = "GDDV_NGUOI_DUYET", columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "gddvNoiDung", column = @Column(name = "GDDV_NOI_DUNG", columnDefinition = "VARCHAR2", length = 512)),
			@AttributeOverride(name = "ldcSoCongVan", column = @Column(name = "LDC_SO_CONG_VAN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ldcNgayCongVan", column = @Column(name = "LDC_NGAY_CONG_VAN", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ldcNguoiDuyet", column = @Column(name = "LDC_NGUOI_DUYET", columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "ldcNoiDung", column = @Column(name = "LDC_NOI_DUNG", columnDefinition = "VARCHAR2", length = 512)),
			@AttributeOverride(name = "ldbSoCongVan", column = @Column(name = "LDB_SO_CONG_VAN", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "ldbNgayCongVan", column = @Column(name = "LDB_NGAY_CONG_VAN", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ldbNguoiDuyet", column = @Column(name = "LDB_NGUOI_DUYET", columnDefinition = "VARCHAR2", length = 400)),
			@AttributeOverride(name = "ldbNoiDung", column = @Column(name = "LDB_NOI_DUNG", columnDefinition = "VARCHAR2", length = 512)),
			@AttributeOverride(name = "matKhau", column = @Column(name = "MAT_KHAU", columnDefinition = "VARCHAR2", length = 25)),
			@AttributeOverride(name = "canBoId", column = @Column(name = "CAN_BO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "luongBien", column = @Column(name = "LUONG_BIEN", columnDefinition = "NUMBER", precision = 3, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "soBienDaDanhDau", column = @Column(name = "SO_BIEN_DA_DANH_DAU", columnDefinition = "NUMBER", precision = 3, scale = 0)),
			@AttributeOverride(name = "soBienDaCap", column = @Column(name = "SO_BIEN_DA_CAP", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ngayDuyet", column = @Column(name = "NGAY_DUYET", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiDuyet", column = @Column(name = "NGUOI_DUYET", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "nguoiQuanLy", column = @Column(name = "NGUOI_QUAN_LY", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "ttDuyet", column = @Column(name = "TT_DUYET", columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public QuyenDanhDauBienId getId() {
		return this.id;
	}

	public void setId(QuyenDanhDauBienId id) {
		this.id = id;
	}

}
