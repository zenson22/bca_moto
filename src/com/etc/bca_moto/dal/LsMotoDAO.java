
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.LsMoto;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LsMotoId;

/**
 * Home object for domain model class LsMoto.
 * 
 * @see LsMoto
 */
public class LsMotoDAO extends JPADAO<LsMoto, LsMotoId> {
	public LsMotoDAO() {
		super(LsMoto.class);
	}
}