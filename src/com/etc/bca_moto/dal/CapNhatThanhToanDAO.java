
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.CapNhatThanhToan;

/**
 * Home object for domain model class CapNhatThanhToan.
 * 
 * @see CapNhatThanhToan
 */
public class CapNhatThanhToanDAO extends JPADAO<CapNhatThanhToan, String> {
	public CapNhatThanhToanDAO() {
		super(CapNhatThanhToan.class);
	}
}