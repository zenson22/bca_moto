
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoKhuKtdbId;
import com.etc.bca_moto.entities.MotoKhuKtdb;

/**
 * Home object for domain model class MotoKhuKtdb.
 * 
 * @see MotoKhuKtdb
 */
public class MotoKhuKtdbDAO extends JPADAO<MotoKhuKtdb, MotoKhuKtdbId> {
	public MotoKhuKtdbDAO() {
		super(MotoKhuKtdb.class);
	}
}