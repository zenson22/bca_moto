
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.NhomHvvp;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class NhomHvvp.
 * 
 * @see NhomHvvp
 */
public class NhomHvvpDAO extends JPADAO<NhomHvvp, Long> {
	public NhomHvvpDAO() {
		super(NhomHvvp.class);
	}
}