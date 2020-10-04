
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.ChucVu;

/**
 * Home object for domain model class ChucVu.
 * 
 * @see ChucVu
 */
public class ChucVuDAO extends JPADAO<ChucVu, Long> {
	public ChucVuDAO() {
		super(ChucVu.class);
	}
}