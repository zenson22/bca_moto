package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.DulieucuMkDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DulieucuMk
 */
@DAO(daoClass = DulieucuMkDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "DULIEUCU_MK", schema = "BCA_MOTO")
public class DulieucuMk implements java.io.Serializable {

	private DulieucuMkId id;

	public DulieucuMk() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "donViCsgtId", column = @Column(name = "DON_VI_CSGT_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "canBoId", column = @Column(name = "CAN_BO_ID", columnDefinition = "NUMBER", precision = 22, scale = 0)),
			@AttributeOverride(name = "bienSo", column = @Column(name = "BIEN_SO", columnDefinition = "VARCHAR2", length = 20)),
			@AttributeOverride(name = "matKhau", column = @Column(name = "MAT_KHAU", columnDefinition = "VARCHAR2", length = 25)),
			@AttributeOverride(name = "daCap", column = @Column(name = "DA_CAP", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "nguoiTao", column = @Column(name = "NGUOI_TAO", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "ngayTao", column = @Column(name = "NGAY_TAO", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "nguoiSua", column = @Column(name = "NGUOI_SUA", columnDefinition = "VARCHAR2", length = 30)),
			@AttributeOverride(name = "ngaySua", column = @Column(name = "NGAY_SUA", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "mauBien", column = @Column(name = "MAU_BIEN", columnDefinition = "NUMBER", precision = 1, scale = 0)),
			@AttributeOverride(name = "id", column = @Column(name = "ID", columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public DulieucuMkId getId() {
		return this.id;
	}

	public void setId(DulieucuMkId id) {
		this.id = id;
	}

}
