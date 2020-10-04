
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.PhuongTienTggt;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class PhuongTienTggt.
 * 
 * @see PhuongTienTggt
 */
public class PhuongTienTggtDAO extends JPADAO<PhuongTienTggt, Long> {
	public PhuongTienTggtDAO() {
		super(PhuongTienTggt.class);
	}
}