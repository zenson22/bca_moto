
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.NoicapGiayto;

/**
 * Home object for domain model class NoicapGiayto.
 * 
 * @see NoicapGiayto
 */
public class NoicapGiaytoDAO extends JPADAO<NoicapGiayto, Long> {
	public NoicapGiaytoDAO() {
		super(NoicapGiayto.class);
	}
}