
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.AuthUser;

/**
 * Home object for domain model class AuthUser.
 * 
 * @see AuthUser
 */
public class AuthUserDAO extends JPADAO<AuthUser, Long> {
	public AuthUserDAO() {
		super(AuthUser.class);
	}
}