
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MaDonVi;

/**
 * Home object for domain model class MaDonVi.
 * 
 * @see MaDonVi
 */
public class MaDonViDAO extends JPADAO<MaDonVi, Long> {
	public MaDonViDAO() {
		super(MaDonVi.class);
	}
}