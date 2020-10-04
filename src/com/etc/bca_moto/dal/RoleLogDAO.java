
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.RoleLogId;
import com.etc.bca_moto.entities.RoleLog;

/**
 * Home object for domain model class RoleLog.
 * 
 * @see RoleLog
 */
public class RoleLogDAO extends JPADAO<RoleLog, RoleLogId> {
	public RoleLogDAO() {
		super(RoleLog.class);
	}
}