
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DsCanBo;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DsCanBo.
 * 
 * @see DsCanBo
 */
public class DsCanBoDAO extends JPADAO<DsCanBo, Long> {
	public DsCanBoDAO() {
		super(DsCanBo.class);
	}
}