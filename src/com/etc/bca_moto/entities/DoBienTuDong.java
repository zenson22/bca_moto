package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DoBienTuDongDAO;
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
 * DoBienTuDong
 */
@DAO(daoClass = DoBienTuDongDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DO_BIEN_TU_DONG", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class DoBienTuDong implements java.io.Serializable {

	private DoBienTuDongId id;

	public DoBienTuDong() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "diemDkId", column = @Column(name = "DIEM_DK_ID", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", nullable = false, columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "seriChu", column = @Column(name = "SERI_CHU", nullable = false, columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "luongBienCap", column = @Column(name = "LUONG_BIEN_CAP", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "luongBienCon", column = @Column(name = "LUONG_BIEN_CON", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "trangThai", column = @Column(name = "TRANG_THAI", nullable = false, columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", nullable = false, columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "daSuDung", column = @Column(name = "DA_SU_DUNG", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "dauBienTheoTinh", column = @Column(name = "DAU_BIEN_THEO_TINH", columnDefinition = "VARCHAR2", length = 3)),
			@AttributeOverride(name = "ketThuc", column = @Column(name = "KET_THUC", columnDefinition = "NUMBER", precision = 1, scale = 0)) })
	public DoBienTuDongId getId() {
		return this.id;
	}

	public void setId(DoBienTuDongId id) {
		this.id = id;
	}

}
