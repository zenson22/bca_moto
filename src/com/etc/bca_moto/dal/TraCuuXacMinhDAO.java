
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.TraCuuXacMinhId;
import com.etc.bca_moto.entities.TraCuuXacMinh;

/**
 * Home object for domain model class TraCuuXacMinh.
 * 
 * @see TraCuuXacMinh
 */
public class TraCuuXacMinhDAO extends JPADAO<TraCuuXacMinh, TraCuuXacMinhId> {
	public TraCuuXacMinhDAO() {
		super(TraCuuXacMinh.class);
	}
}