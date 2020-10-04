package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.ViewTracuuMotoDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewTracuuMoto
 */
@DAO(daoClass = ViewTracuuMotoDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "VIEW_TRACUU_MOTO", schema = "BCA_MOTO")
public class ViewTracuuMoto implements java.io.Serializable {

	private ViewTracuuMotoId id;

	public ViewTracuuMoto() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "biensoDaydu", column = @Column(name = "BIENSO_DAYDU", columnDefinition = "VARCHAR2", length = 60)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", columnDefinition = "VARCHAR2", length = 4000)),
			@AttributeOverride(name = "chuSoHuu", column = @Column(name = "CHU_SO_HUU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "diaChi", column = @Column(name = "DIA_CHI", columnDefinition = "VARCHAR2", length = 2048)),
			@AttributeOverride(name = "loaiXe", column = @Column(name = "LOAI_XE", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "nhanHieu", column = @Column(name = "NHAN_HIEU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "mauXe", column = @Column(name = "MAU_XE", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ngayDangky", column = @Column(name = "NGAY_DANGKY", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngayDkLandau", column = @Column(name = "NGAY_DK_LANDAU", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)) })
	public ViewTracuuMotoId getId() {
		return this.id;
	}

	public void setId(ViewTracuuMotoId id) {
		this.id = id;
	}

}
