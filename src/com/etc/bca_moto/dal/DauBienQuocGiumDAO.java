
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DauBienQuocGiumId;
import com.etc.bca_moto.entities.DauBienQuocGium;

/**
 * Home object for domain model class DauBienQuocGium.
 * 
 * @see DauBienQuocGium
 */
public class DauBienQuocGiumDAO extends JPADAO<DauBienQuocGium, DauBienQuocGiumId> {
	public DauBienQuocGiumDAO() {
		super(DauBienQuocGium.class);
	}
}