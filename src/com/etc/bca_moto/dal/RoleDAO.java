
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.RoleId;
import com.etc.bca_moto.entities.Role;

/**
 * Home object for domain model class Role.
 * 
 * @see Role
 */
public class RoleDAO extends JPADAO<Role, RoleId> {
	public RoleDAO() {
		super(Role.class);
	}
}