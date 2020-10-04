
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MotoMaNhanHieu;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoMaNhanHieuId;

/**
 * Home object for domain model class MotoMaNhanHieu.
 * 
 * @see MotoMaNhanHieu
 */
public class MotoMaNhanHieuDAO extends JPADAO<MotoMaNhanHieu, MotoMaNhanHieuId> {
	public MotoMaNhanHieuDAO() {
		super(MotoMaNhanHieu.class);
	}
}