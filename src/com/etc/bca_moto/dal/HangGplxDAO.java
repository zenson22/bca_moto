
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.HangGplx;

/**
 * Home object for domain model class HangGplx.
 * 
 * @see HangGplx
 */
public class HangGplxDAO extends JPADAO<HangGplx, Long> {
	public HangGplxDAO() {
		super(HangGplx.class);
	}
}