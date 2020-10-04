
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DanhMucThongTin;

/**
 * Home object for domain model class DanhMucThongTin.
 * 
 * @see DanhMucThongTin
 */
public class DanhMucThongTinDAO extends JPADAO<DanhMucThongTin, Long> {
	public DanhMucThongTinDAO() {
		super(DanhMucThongTin.class);
	}
}