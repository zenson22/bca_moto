
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DonViCsgtId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DonViCsgt;

/**
 * Home object for domain model class DonViCsgt.
 * 
 * @see DonViCsgt
 */
public class DonViCsgtDAO extends JPADAO<DonViCsgt, DonViCsgtId> {
	public DonViCsgtDAO() {
		super(DonViCsgt.class);
	}
}