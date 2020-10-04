
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.HinhThucXuPhatBoSung;

/**
 * Home object for domain model class HinhThucXuPhatBoSung.
 * 
 * @see HinhThucXuPhatBoSung
 */
public class HinhThucXuPhatBoSungDAO extends JPADAO<HinhThucXuPhatBoSung, Long> {
	public HinhThucXuPhatBoSungDAO() {
		super(HinhThucXuPhatBoSung.class);
	}
}