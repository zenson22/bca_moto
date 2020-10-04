
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.PsTxn;
import com.etc.bca_moto.entities.PsTxnId;

/**
 * Home object for domain model class PsTxn.
 * 
 * @see PsTxn
 */
public class PsTxnDAO extends JPADAO<PsTxn, PsTxnId> {
	public PsTxnDAO() {
		super(PsTxn.class);
	}
}