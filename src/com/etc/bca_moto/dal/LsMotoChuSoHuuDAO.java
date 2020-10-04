
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.LsMotoChuSoHuuId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LsMotoChuSoHuu;

/**
 * Home object for domain model class LsMotoChuSoHuu.
 * 
 * @see LsMotoChuSoHuu
 */
public class LsMotoChuSoHuuDAO extends JPADAO<LsMotoChuSoHuu, LsMotoChuSoHuuId> {
	public LsMotoChuSoHuuDAO() {
		super(LsMotoChuSoHuu.class);
	}
}