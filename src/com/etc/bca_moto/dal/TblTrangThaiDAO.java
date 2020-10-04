
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.TblTrangThai;

/**
 * Home object for domain model class TblTrangThai.
 * 
 * @see TblTrangThai
 */
public class TblTrangThaiDAO extends JPADAO<TblTrangThai, Long> {
	public TblTrangThaiDAO() {
		super(TblTrangThai.class);
	}
}