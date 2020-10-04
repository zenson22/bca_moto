
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.KhoBacNganHang;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class KhoBacNganHang.
 * 
 * @see KhoBacNganHang
 */
public class KhoBacNganHangDAO extends JPADAO<KhoBacNganHang, Long> {
	public KhoBacNganHangDAO() {
		super(KhoBacNganHang.class);
	}
}