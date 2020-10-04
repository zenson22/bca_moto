
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.CoQuanChuQuan;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class CoQuanChuQuan.
 * 
 * @see CoQuanChuQuan
 */
public class CoQuanChuQuanDAO extends JPADAO<CoQuanChuQuan, Long> {
	public CoQuanChuQuanDAO() {
		super(CoQuanChuQuan.class);
	}
}