
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.YearIndex;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class YearIndex.
 * 
 * @see YearIndex
 */
public class YearIndexDAO extends JPADAO<YearIndex, Long> {
	public YearIndexDAO() {
		super(YearIndex.class);
	}
}