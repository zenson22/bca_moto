
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DauBienTheoTinh;
import com.etc.bca_moto.entities.DauBienTheoTinhId;

/**
 * Home object for domain model class DauBienTheoTinh.
 * 
 * @see DauBienTheoTinh
 */
public class DauBienTheoTinhDAO extends JPADAO<DauBienTheoTinh, DauBienTheoTinhId> {
	public DauBienTheoTinhDAO() {
		super(DauBienTheoTinh.class);
	}
}