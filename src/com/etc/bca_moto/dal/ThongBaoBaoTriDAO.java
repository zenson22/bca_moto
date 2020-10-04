
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.ThongBaoBaoTri;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class ThongBaoBaoTri.
 * 
 * @see ThongBaoBaoTri
 */
public class ThongBaoBaoTriDAO extends JPADAO<ThongBaoBaoTri, Long> {
	public ThongBaoBaoTriDAO() {
		super(ThongBaoBaoTri.class);
	}
}