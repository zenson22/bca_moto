
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DelMotoDangKy;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DelMotoDangKyId;

/**
 * Home object for domain model class DelMotoDangKy.
 * 
 * @see DelMotoDangKy
 */
public class DelMotoDangKyDAO extends JPADAO<DelMotoDangKy, DelMotoDangKyId> {
	public DelMotoDangKyDAO() {
		super(DelMotoDangKy.class);
	}
}