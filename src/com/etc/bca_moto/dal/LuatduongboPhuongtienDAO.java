
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LuatduongboPhuongtien;

/**
 * Home object for domain model class LuatduongboPhuongtien.
 * 
 * @see LuatduongboPhuongtien
 */
public class LuatduongboPhuongtienDAO extends JPADAO<LuatduongboPhuongtien, Long> {
	public LuatduongboPhuongtienDAO() {
		super(LuatduongboPhuongtien.class);
	}
}