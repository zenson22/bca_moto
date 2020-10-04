
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.QuocGium;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.QuocGiumId;

/**
 * Home object for domain model class QuocGium.
 * 
 * @see QuocGium
 */
public class QuocGiumDAO extends JPADAO<QuocGium, QuocGiumId> {
	public QuocGiumDAO() {
		super(QuocGium.class);
	}
}