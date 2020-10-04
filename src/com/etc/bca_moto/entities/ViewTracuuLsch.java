package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewTracuuLschDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewTracuuLsch
 */
@DAO(daoClass = ViewTracuuLschDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_TRACUU_LSCH", schema = "BCA_MOTO")
public class ViewTracuuLsch implements java.io.Serializable {

	private ViewTracuuLschId id;

	public ViewTracuuLsch() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tenNguoiNvp", column = @Column(name = "TEN_NGUOI_NVP", columnDefinition = "VARCHAR2", length = 300)),
			@AttributeOverride(name = "diaDanhHcId", column = @Column(name = "DIA_DANH_HC_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "soBienBan", column = @Column(name = "SO_BIEN_BAN", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "indexHvvp", column = @Column(name = "INDEX_HVVP", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "noiDungVphc", column = @Column(name = "NOI_DUNG_VPHC", columnDefinition = "VARCHAR2", length = 1000)),
			@AttributeOverride(name = "bienKs", column = @Column(name = "BIEN_KS", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "gplx", column = @Column(name = "GPLX", columnDefinition = "VARCHAR2", length = 50)),
			@AttributeOverride(name = "loaiPtId", column = @Column(name = "LOAI_PT_ID", columnDefinition = "NUMBER", precision = 20, scale = 0)),
			@AttributeOverride(name = "thoiGianVphc", column = @Column(name = "THOI_GIAN_VPHC", columnDefinition = "VARCHAR2", length = 128)),
			@AttributeOverride(name = "diaDiemVphc", column = @Column(name = "DIA_DIEM_VPHC", columnDefinition = "VARCHAR2", length = 1824)),
			@AttributeOverride(name = "loaiPhuongTien", column = @Column(name = "LOAI_PHUONG_TIEN", columnDefinition = "VARCHAR2", length = 200)) })
	public ViewTracuuLschId getId() {
		return this.id;
	}

	public void setId(ViewTracuuLschId id) {
		this.id = id;
	}

}
