
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DoituongVp;

/**
 * Home object for domain model class DoituongVp.
 * 
 * @see DoituongVp
 */
public class DoituongVpDAO extends JPADAO<DoituongVp, Long> {
	public DoituongVpDAO() {
		super(DoituongVp.class);
	}
}