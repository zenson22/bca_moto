
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.Log;
import com.etc.bca_moto.entities.LogId;

/**
 * Home object for domain model class Log.
 * 
 * @see Log
 */
public class LogDAO extends JPADAO<Log, LogId> {
	public LogDAO() {
		super(Log.class);
	}
}