
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoTraBien;

/**
 * Home object for domain model class MotoTraBien.
 * 
 * @see MotoTraBien
 */
public class MotoTraBienDAO extends JPADAO<MotoTraBien, Long> {
	public MotoTraBienDAO() {
		super(MotoTraBien.class);
	}
}