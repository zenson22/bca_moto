
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.BienBanVphc;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class BienBanVphc.
 * 
 * @see BienBanVphc
 */
public class BienBanVphcDAO extends JPADAO<BienBanVphc, String> {
	public BienBanVphcDAO() {
		super(BienBanVphc.class);
	}
}