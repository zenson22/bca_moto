
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.TangVatTg;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class TangVatTg.
 * 
 * @see TangVatTg
 */
public class TangVatTgDAO extends JPADAO<TangVatTg, Long> {
	public TangVatTgDAO() {
		super(TangVatTg.class);
	}
}