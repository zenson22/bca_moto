
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.AuthResource;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class AuthResource.
 * 
 * @see AuthResource
 */
public class AuthResourceDAO extends JPADAO<AuthResource, Long> {
	public AuthResourceDAO() {
		super(AuthResource.class);
	}
}