
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.TrangThaiKichHoat;

/**
 * Home object for domain model class TrangThaiKichHoat.
 * 
 * @see TrangThaiKichHoat
 */
public class TrangThaiKichHoatDAO extends JPADAO<TrangThaiKichHoat, Long> {
	public TrangThaiKichHoatDAO() {
		super(TrangThaiKichHoat.class);
	}
}