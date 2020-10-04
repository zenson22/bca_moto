
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.AuthGroupResourceNmId;
import com.etc.bca_moto.entities.AuthGroupResourceNm;

/**
 * Home object for domain model class AuthGroupResourceNm.
 * 
 * @see AuthGroupResourceNm
 */
public class AuthGroupResourceNmDAO extends JPADAO<AuthGroupResourceNm, AuthGroupResourceNmId> {
	public AuthGroupResourceNmDAO() {
		super(AuthGroupResourceNm.class);
	}
}