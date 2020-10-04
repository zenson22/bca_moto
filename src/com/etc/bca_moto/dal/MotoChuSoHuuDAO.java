
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MotoChuSoHuuId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoChuSoHuu;

/**
 * Home object for domain model class MotoChuSoHuu.
 * 
 * @see MotoChuSoHuu
 */
public class MotoChuSoHuuDAO extends JPADAO<MotoChuSoHuu, MotoChuSoHuuId> {
	public MotoChuSoHuuDAO() {
		super(MotoChuSoHuu.class);
	}
}