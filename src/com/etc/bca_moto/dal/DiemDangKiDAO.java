
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DiemDangKiId;
import com.etc.bca_moto.entities.DiemDangKi;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DiemDangKi.
 * 
 * @see DiemDangKi
 */
public class DiemDangKiDAO extends JPADAO<DiemDangKi, DiemDangKiId> {
	public DiemDangKiDAO() {
		super(DiemDangKi.class);
	}
}