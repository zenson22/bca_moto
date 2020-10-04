
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DonviKhobac;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DonviKhobac.
 * 
 * @see DonviKhobac
 */
public class DonviKhobacDAO extends JPADAO<DonviKhobac, Long> {
	public DonviKhobacDAO() {
		super(DonviKhobac.class);
	}
}