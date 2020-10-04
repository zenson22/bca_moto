
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.LuatNghidinh;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class LuatNghidinh.
 * 
 * @see LuatNghidinh
 */
public class LuatNghidinhDAO extends JPADAO<LuatNghidinh, Long> {
	public LuatNghidinhDAO() {
		super(LuatNghidinh.class);
	}
}