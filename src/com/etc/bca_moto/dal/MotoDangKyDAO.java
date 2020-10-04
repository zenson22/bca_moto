
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MotoDangKyId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoDangKy;

/**
 * Home object for domain model class MotoDangKy.
 * 
 * @see MotoDangKy
 */
public class MotoDangKyDAO extends JPADAO<MotoDangKy, MotoDangKyId> {
	public MotoDangKyDAO() {
		super(MotoDangKy.class);
	}
}