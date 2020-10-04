
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.VuViec;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class VuViec.
 * 
 * @see VuViec
 */
public class VuViecDAO extends JPADAO<VuViec, Long> {
	public VuViecDAO() {
		super(VuViec.class);
	}
}