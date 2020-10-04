
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.AuthGroupGroupNmId;
import com.etc.bca_moto.entities.AuthGroupGroupNm;

/**
 * Home object for domain model class AuthGroupGroupNm.
 * 
 * @see AuthGroupGroupNm
 */
public class AuthGroupGroupNmDAO extends JPADAO<AuthGroupGroupNm, AuthGroupGroupNmId> {
	public AuthGroupGroupNmDAO() {
		super(AuthGroupGroupNm.class);
	}
}