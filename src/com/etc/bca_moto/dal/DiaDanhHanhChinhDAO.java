
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DiaDanhHanhChinh;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DiaDanhHanhChinh.
 * 
 * @see DiaDanhHanhChinh
 */
public class DiaDanhHanhChinhDAO extends JPADAO<DiaDanhHanhChinh, Long> {
	public DiaDanhHanhChinhDAO() {
		super(DiaDanhHanhChinh.class);
	}
}