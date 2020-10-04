
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MaTranQuyenId;
import com.etc.bca_moto.entities.MaTranQuyen;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class MaTranQuyen.
 * 
 * @see MaTranQuyen
 */
public class MaTranQuyenDAO extends JPADAO<MaTranQuyen, MaTranQuyenId> {
	public MaTranQuyenDAO() {
		super(MaTranQuyen.class);
	}
}