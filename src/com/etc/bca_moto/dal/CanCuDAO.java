
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.CanCu;

/**
 * Home object for domain model class CanCu.
 * 
 * @see CanCu
 */
public class CanCuDAO extends JPADAO<CanCu, Long> {
	public CanCuDAO() {
		super(CanCu.class);
	}
}