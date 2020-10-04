
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.SysEventLog;

/**
 * Home object for domain model class SysEventLog.
 * 
 * @see SysEventLog
 */
public class SysEventLogDAO extends JPADAO<SysEventLog, Long> {
	public SysEventLogDAO() {
		super(SysEventLog.class);
	}
}