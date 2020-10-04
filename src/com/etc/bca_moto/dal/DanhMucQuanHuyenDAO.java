
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DanhMucQuanHuyen;

/**
 * Home object for domain model class DanhMucQuanHuyen.
 * 
 * @see DanhMucQuanHuyen
 */
public class DanhMucQuanHuyenDAO extends JPADAO<DanhMucQuanHuyen, Long> {
	public DanhMucQuanHuyenDAO() {
		super(DanhMucQuanHuyen.class);
	}
}