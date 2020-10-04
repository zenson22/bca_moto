package com.etc.bca_moto.entities;

import com.etc.bca_moto.dal.MaPhatVphcDAO;
import com.xdev.dal.DAO;
import com.xdev.util.Caption;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * MaPhatVphc
 */
@DAO(daoClass = MaPhatVphcDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "MA_PHAT_VPHC", schema = "BCA_MOTO")
public class MaPhatVphc implements java.io.Serializable {

	private String id;
	private String maVphc;
	private String description;

	public MaPhatVphc() {
	}

	@Caption("Id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Id

	@Column(name = "ID", unique = true, nullable = false, columnDefinition = "VARCHAR2", length = 50)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Caption("MaVphc")
	@Column(name = "MA_VPHC", columnDefinition = "VARCHAR2", length = 40)
	public String getMaVphc() {
		return this.maVphc;
	}

	public void setMaVphc(String maVphc) {
		this.maVphc = maVphc;
	}

	@Caption("Description")
	@Column(name = "DESCRIPTION", columnDefinition = "VARCHAR2", length = 400)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
