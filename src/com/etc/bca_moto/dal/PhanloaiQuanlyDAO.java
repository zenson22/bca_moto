
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.PhanloaiQuanly;

/**
 * Home object for domain model class PhanloaiQuanly.
 * 
 * @see PhanloaiQuanly
 */
public class PhanloaiQuanlyDAO extends JPADAO<PhanloaiQuanly, Long> {
	public PhanloaiQuanlyDAO() {
		super(PhanloaiQuanly.class);
	}
}