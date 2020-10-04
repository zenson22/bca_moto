
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.TempMotoHsKemtheo;

/**
 * Home object for domain model class TempMotoHsKemtheo.
 * 
 * @see TempMotoHsKemtheo
 */
public class TempMotoHsKemtheoDAO extends JPADAO<TempMotoHsKemtheo, Long> {
	public TempMotoHsKemtheoDAO() {
		super(TempMotoHsKemtheo.class);
	}
}