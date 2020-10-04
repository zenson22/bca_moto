
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DanhMucPhuongXa;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DanhMucPhuongXa.
 * 
 * @see DanhMucPhuongXa
 */
public class DanhMucPhuongXaDAO extends JPADAO<DanhMucPhuongXa, Long> {
	public DanhMucPhuongXaDAO() {
		super(DanhMucPhuongXa.class);
	}
}