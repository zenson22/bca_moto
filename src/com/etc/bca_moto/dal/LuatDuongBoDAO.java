
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LuatDuongBo;

/**
 * Home object for domain model class LuatDuongBo.
 * 
 * @see LuatDuongBo
 */
public class LuatDuongBoDAO extends JPADAO<LuatDuongBo, Long> {
	public LuatDuongBoDAO() {
		super(LuatDuongBo.class);
	}
}