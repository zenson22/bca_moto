
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DelMotoId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DelMoto;

/**
 * Home object for domain model class DelMoto.
 * 
 * @see DelMoto
 */
public class DelMotoDAO extends JPADAO<DelMoto, DelMotoId> {
	public DelMotoDAO() {
		super(DelMoto.class);
	}
}