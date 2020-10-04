
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.BangThamso;
import com.etc.bca_moto.entities.BangThamsoId;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class BangThamso.
 * 
 * @see BangThamso
 */
public class BangThamsoDAO extends JPADAO<BangThamso, BangThamsoId> {
	public BangThamsoDAO() {
		super(BangThamso.class);
	}
}