
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.TinhThanh;

/**
 * Home object for domain model class TinhThanh.
 * 
 * @see TinhThanh
 */
public class TinhThanhDAO extends JPADAO<TinhThanh, Long> {
	public TinhThanhDAO() {
		super(TinhThanh.class);
	}
}