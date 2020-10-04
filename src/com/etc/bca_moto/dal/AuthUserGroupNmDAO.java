
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.AuthUserGroupNmId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.AuthUserGroupNm;

/**
 * Home object for domain model class AuthUserGroupNm.
 * 
 * @see AuthUserGroupNm
 */
public class AuthUserGroupNmDAO extends JPADAO<AuthUserGroupNm, AuthUserGroupNmId> {
	public AuthUserGroupNmDAO() {
		super(AuthUserGroupNm.class);
	}
}