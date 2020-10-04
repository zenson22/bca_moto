
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.TempLsMotoPortal;

/**
 * Home object for domain model class TempLsMotoPortal.
 * 
 * @see TempLsMotoPortal
 */
public class TempLsMotoPortalDAO extends JPADAO<TempLsMotoPortal, Long> {
	public TempLsMotoPortalDAO() {
		super(TempLsMotoPortal.class);
	}
}