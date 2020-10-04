
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DelMotoChuSoHuu;
import com.etc.bca_moto.entities.DelMotoChuSoHuuId;

/**
 * Home object for domain model class DelMotoChuSoHuu.
 * 
 * @see DelMotoChuSoHuu
 */
public class DelMotoChuSoHuuDAO extends JPADAO<DelMotoChuSoHuu, DelMotoChuSoHuuId> {
	public DelMotoChuSoHuuDAO() {
		super(DelMotoChuSoHuu.class);
	}
}