
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.LsMotoDangKy;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LsMotoDangKyId;

/**
 * Home object for domain model class LsMotoDangKy.
 * 
 * @see LsMotoDangKy
 */
public class LsMotoDangKyDAO extends JPADAO<LsMotoDangKy, LsMotoDangKyId> {
	public LsMotoDangKyDAO() {
		super(LsMotoDangKy.class);
	}
}