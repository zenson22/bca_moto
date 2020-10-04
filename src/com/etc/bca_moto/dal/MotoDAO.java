
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoId;
import com.etc.bca_moto.entities.Moto;

/**
 * Home object for domain model class Moto.
 * 
 * @see Moto
 */
public class MotoDAO extends JPADAO<Moto, MotoId> {
	public MotoDAO() {
		super(Moto.class);
	}
}