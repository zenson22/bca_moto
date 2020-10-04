
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DanhMucTinhThanh;

/**
 * Home object for domain model class DanhMucTinhThanh.
 * 
 * @see DanhMucTinhThanh
 */
public class DanhMucTinhThanhDAO extends JPADAO<DanhMucTinhThanh, Long> {
	public DanhMucTinhThanhDAO() {
		super(DanhMucTinhThanh.class);
	}
}