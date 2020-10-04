package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MotoHosoDAO;
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
 * MotoHoso
 */
@DAO(daoClass = MotoHosoDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MOTO_HOSO", schema = "BCA_MOTO", uniqueConstraints = @UniqueConstraint(columnNames = "ID"))
public class MotoHoso implements java.io.Serializable {

	private MotoHosoId id;

	public MotoHoso() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "id", column = @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMBER", precision = 10, scale = 0)),
			@AttributeOverride(name = "soTailieu", column = @Column(name = "SO_TAILIEU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "ngayThang", column = @Column(name = "NGAY_THANG", columnDefinition = "DATE", length = 7)),
			@AttributeOverride(name = "trichYeu", column = @Column(name = "TRICH_YEU", columnDefinition = "VARCHAR2", length = 1020)),
			@AttributeOverride(name = "soTrang", column = @Column(name = "SO_TRANG", columnDefinition = "NUMBER", precision = 3, scale = 0)),
			@AttributeOverride(name = "motoDangky", column = @Column(name = "MOTO_DANGKY", nullable = false, columnDefinition = "NUMBER", scale = 0)),
			@AttributeOverride(name = "stt", column = @Column(name = "STT", columnDefinition = "NUMBER", precision = 22, scale = 0)) })
	public MotoHosoId getId() {
		return this.id;
	}

	public void setId(MotoHosoId id) {
		this.id = id;
	}

}
