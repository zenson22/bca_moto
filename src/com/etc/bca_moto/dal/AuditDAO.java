
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.Audit;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Audit.
 * 
 * @see Audit
 */
public class AuditDAO extends JPADAO<Audit, Long> {
	public AuditDAO() {
		super(Audit.class);
	}
}