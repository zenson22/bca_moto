
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.AuthRoleRoleNm;
import com.etc.bca_moto.entities.AuthRoleRoleNmId;

/**
 * Home object for domain model class AuthRoleRoleNm.
 * 
 * @see AuthRoleRoleNm
 */
public class AuthRoleRoleNmDAO extends JPADAO<AuthRoleRoleNm, AuthRoleRoleNmId> {
	public AuthRoleRoleNmDAO() {
		super(AuthRoleRoleNm.class);
	}
}