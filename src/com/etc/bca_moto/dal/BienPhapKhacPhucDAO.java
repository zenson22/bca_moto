
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.BienPhapKhacPhuc;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class BienPhapKhacPhuc.
 * 
 * @see BienPhapKhacPhuc
 */
public class BienPhapKhacPhucDAO extends JPADAO<BienPhapKhacPhuc, Long> {
	public BienPhapKhacPhucDAO() {
		super(BienPhapKhacPhuc.class);
	}
}