
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.AuthRolePermission;

/**
 * Home object for domain model class AuthRolePermission.
 * 
 * @see AuthRolePermission
 */
public class AuthRolePermissionDAO extends JPADAO<AuthRolePermission, Long> {
	public AuthRolePermissionDAO() {
		super(AuthRolePermission.class);
	}
}