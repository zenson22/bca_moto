
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.Slmoto1;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.Slmoto1Id;

/**
 * Home object for domain model class Slmoto1.
 * 
 * @see Slmoto1
 */
public class Slmoto1DAO extends JPADAO<Slmoto1, Slmoto1Id> {
	public Slmoto1DAO() {
		super(Slmoto1.class);
	}
}