
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.CapBac;

/**
 * Home object for domain model class CapBac.
 * 
 * @see CapBac
 */
public class CapBacDAO extends JPADAO<CapBac, Long> {
	public CapBacDAO() {
		super(CapBac.class);
	}
}