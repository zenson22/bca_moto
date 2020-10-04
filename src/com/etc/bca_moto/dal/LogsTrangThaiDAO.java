
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.LogsTrangThai;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LogsTrangThaiId;

/**
 * Home object for domain model class LogsTrangThai.
 * 
 * @see LogsTrangThai
 */
public class LogsTrangThaiDAO extends JPADAO<LogsTrangThai, LogsTrangThaiId> {
	public LogsTrangThaiDAO() {
		super(LogsTrangThai.class);
	}
}