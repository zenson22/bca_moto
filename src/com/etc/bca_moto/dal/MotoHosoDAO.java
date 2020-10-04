
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MotoHosoId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoHoso;

/**
 * Home object for domain model class MotoHoso.
 * 
 * @see MotoHoso
 */
public class MotoHosoDAO extends JPADAO<MotoHoso, MotoHosoId> {
	public MotoHosoDAO() {
		super(MotoHoso.class);
	}
}