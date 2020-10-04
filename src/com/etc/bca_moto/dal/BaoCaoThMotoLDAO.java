
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.BaoCaoThMotoLId;
import com.etc.bca_moto.entities.BaoCaoThMotoL;

/**
 * Home object for domain model class BaoCaoThMotoL.
 * 
 * @see BaoCaoThMotoL
 */
public class BaoCaoThMotoLDAO extends JPADAO<BaoCaoThMotoL, BaoCaoThMotoLId> {
	public BaoCaoThMotoLDAO() {
		super(BaoCaoThMotoL.class);
	}
}