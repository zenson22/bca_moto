
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.AuthTest;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class AuthTest.
 * 
 * @see AuthTest
 */
public class AuthTestDAO extends JPADAO<AuthTest, Long> {
	public AuthTestDAO() {
		super(AuthTest.class);
	}
}