
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DiaDanhHc;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DiaDanhHc.
 * 
 * @see DiaDanhHc
 */
public class DiaDanhHcDAO extends JPADAO<DiaDanhHc, Long> {
	public DiaDanhHcDAO() {
		super(DiaDanhHc.class);
	}
}