
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.TempMotoPortalId;
import com.etc.bca_moto.entities.TempMotoPortal;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class TempMotoPortal.
 * 
 * @see TempMotoPortal
 */
public class TempMotoPortalDAO extends JPADAO<TempMotoPortal, TempMotoPortalId> {
	public TempMotoPortalDAO() {
		super(TempMotoPortal.class);
	}
}