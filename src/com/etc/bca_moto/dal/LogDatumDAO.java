
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.LogDatum;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LogDatumId;

/**
 * Home object for domain model class LogDatum.
 * 
 * @see LogDatum
 */
public class LogDatumDAO extends JPADAO<LogDatum, LogDatumId> {
	public LogDatumDAO() {
		super(LogDatum.class);
	}
}