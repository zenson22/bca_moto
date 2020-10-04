
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MaMau;
import com.etc.bca_moto.entities.MaMauId;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class MaMau.
 * 
 * @see MaMau
 */
public class MaMauDAO extends JPADAO<MaMau, MaMauId> {
	public MaMauDAO() {
		super(MaMau.class);
	}
}