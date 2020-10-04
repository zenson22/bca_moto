
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.CanBo;

/**
 * Home object for domain model class CanBo.
 * 
 * @see CanBo
 */
public class CanBoDAO extends JPADAO<CanBo, Long> {
	public CanBoDAO() {
		super(CanBo.class);
	}
}