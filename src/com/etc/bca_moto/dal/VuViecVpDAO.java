
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.VuViecVp;

/**
 * Home object for domain model class VuViecVp.
 * 
 * @see VuViecVp
 */
public class VuViecVpDAO extends JPADAO<VuViecVp, String> {
	public VuViecVpDAO() {
		super(VuViecVp.class);
	}
}