
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.HanhViViPham;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class HanhViViPham.
 * 
 * @see HanhViViPham
 */
public class HanhViViPhamDAO extends JPADAO<HanhViViPham, Long> {
	public HanhViViPhamDAO() {
		super(HanhViViPham.class);
	}
}