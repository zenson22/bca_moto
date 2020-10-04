
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.BaoCaoThMoto;
import com.etc.bca_moto.entities.BaoCaoThMotoId;

/**
 * Home object for domain model class BaoCaoThMoto.
 * 
 * @see BaoCaoThMoto
 */
public class BaoCaoThMotoDAO extends JPADAO<BaoCaoThMoto, BaoCaoThMotoId> {
	public BaoCaoThMotoDAO() {
		super(BaoCaoThMoto.class);
	}
}