
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MaPhatVphc;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class MaPhatVphc.
 * 
 * @see MaPhatVphc
 */
public class MaPhatVphcDAO extends JPADAO<MaPhatVphc, String> {
	public MaPhatVphcDAO() {
		super(MaPhatVphc.class);
	}
}