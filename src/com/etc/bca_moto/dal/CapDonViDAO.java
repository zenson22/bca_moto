
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.CapDonVi;

/**
 * Home object for domain model class CapDonVi.
 * 
 * @see CapDonVi
 */
public class CapDonViDAO extends JPADAO<CapDonVi, Long> {
	public CapDonViDAO() {
		super(CapDonVi.class);
	}
}