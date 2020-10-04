
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.LogCanBo;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LogCanBoId;

/**
 * Home object for domain model class LogCanBo.
 * 
 * @see LogCanBo
 */
public class LogCanBoDAO extends JPADAO<LogCanBo, LogCanBoId> {
	public LogCanBoDAO() {
		super(LogCanBo.class);
	}
}