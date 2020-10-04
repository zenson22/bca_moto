
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.ThongKeSoLuongId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.ThongKeSoLuong;

/**
 * Home object for domain model class ThongKeSoLuong.
 * 
 * @see ThongKeSoLuong
 */
public class ThongKeSoLuongDAO extends JPADAO<ThongKeSoLuong, ThongKeSoLuongId> {
	public ThongKeSoLuongDAO() {
		super(ThongKeSoLuong.class);
	}
}