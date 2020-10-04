
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LogP6Id;
import com.etc.bca_moto.entities.LogP6;

/**
 * Home object for domain model class LogP6.
 * 
 * @see LogP6
 */
public class LogP6DAO extends JPADAO<LogP6, LogP6Id> {
	public LogP6DAO() {
		super(LogP6.class);
	}
}