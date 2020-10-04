
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.AuthRole;

/**
 * Home object for domain model class AuthRole.
 * 
 * @see AuthRole
 */
public class AuthRoleDAO extends JPADAO<AuthRole, Long> {
	public AuthRoleDAO() {
		super(AuthRole.class);
	}
}