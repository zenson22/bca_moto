
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.AuthGroup;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class AuthGroup.
 * 
 * @see AuthGroup
 */
public class AuthGroupDAO extends JPADAO<AuthGroup, Long> {
	public AuthGroupDAO() {
		super(AuthGroup.class);
	}
}