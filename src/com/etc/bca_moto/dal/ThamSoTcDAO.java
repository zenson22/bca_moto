
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.ThamSoTc;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class ThamSoTc.
 * 
 * @see ThamSoTc
 */
public class ThamSoTcDAO extends JPADAO<ThamSoTc, Long> {
	public ThamSoTcDAO() {
		super(ThamSoTc.class);
	}
}