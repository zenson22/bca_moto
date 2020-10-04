
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.BackLogByYear;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.BackLogByYearId;

/**
 * Home object for domain model class BackLogByYear.
 * 
 * @see BackLogByYear
 */
public class BackLogByYearDAO extends JPADAO<BackLogByYear, BackLogByYearId> {
	public BackLogByYearDAO() {
		super(BackLogByYear.class);
	}
}