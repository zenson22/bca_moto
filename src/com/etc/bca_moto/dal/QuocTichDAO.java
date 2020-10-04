
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.QuocTich;

/**
 * Home object for domain model class QuocTich.
 * 
 * @see QuocTich
 */
public class QuocTichDAO extends JPADAO<QuocTich, Long> {
	public QuocTichDAO() {
		super(QuocTich.class);
	}
}