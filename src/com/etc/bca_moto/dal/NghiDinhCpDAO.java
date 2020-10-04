
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.NghiDinhCp;

/**
 * Home object for domain model class NghiDinhCp.
 * 
 * @see NghiDinhCp
 */
public class NghiDinhCpDAO extends JPADAO<NghiDinhCp, Long> {
	public NghiDinhCpDAO() {
		super(NghiDinhCp.class);
	}
}