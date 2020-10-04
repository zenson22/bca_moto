
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.NgheNghiep;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class NgheNghiep.
 * 
 * @see NgheNghiep
 */
public class NgheNghiepDAO extends JPADAO<NgheNghiep, Long> {
	public NgheNghiepDAO() {
		super(NgheNghiep.class);
	}
}