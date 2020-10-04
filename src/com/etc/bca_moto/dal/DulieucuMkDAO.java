
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DulieucuMkId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DulieucuMk;

/**
 * Home object for domain model class DulieucuMk.
 * 
 * @see DulieucuMk
 */
public class DulieucuMkDAO extends JPADAO<DulieucuMk, DulieucuMkId> {
	public DulieucuMkDAO() {
		super(DulieucuMk.class);
	}
}