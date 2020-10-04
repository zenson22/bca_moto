
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MotoQuanlyLoaixeSeri;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoQuanlyLoaixeSeriId;

/**
 * Home object for domain model class MotoQuanlyLoaixeSeri.
 * 
 * @see MotoQuanlyLoaixeSeri
 */
public class MotoQuanlyLoaixeSeriDAO extends JPADAO<MotoQuanlyLoaixeSeri, MotoQuanlyLoaixeSeriId> {
	public MotoQuanlyLoaixeSeriDAO() {
		super(MotoQuanlyLoaixeSeri.class);
	}
}