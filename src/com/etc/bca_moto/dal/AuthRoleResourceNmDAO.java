
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.AuthRoleResourceNm;
import com.etc.bca_moto.entities.AuthRoleResourceNmId;

/**
 * Home object for domain model class AuthRoleResourceNm.
 * 
 * @see AuthRoleResourceNm
 */
public class AuthRoleResourceNmDAO extends JPADAO<AuthRoleResourceNm, AuthRoleResourceNmId> {
	public AuthRoleResourceNmDAO() {
		super(AuthRoleResourceNm.class);
	}
}