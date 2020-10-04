package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.KiemTraThieuLDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * KiemTraThieuL
 */
@DAO(daoClass = KiemTraThieuLDAO.class)
@Caption("{%col}")
@Entity
@Table(name = "KIEM_TRA_THIEU_LS", schema = "BCA_MOTO")
public class KiemTraThieuL implements java.io.Serializable {

	private Long col;

	public KiemTraThieuL() {
	}

	@Caption("Col")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "COL", columnDefinition = "NUMBER", precision = 22, scale = 0)
	public Long getCol() {
		return this.col;
	}

	public void setCol(Long col) {
		this.col = col;
	}

}
