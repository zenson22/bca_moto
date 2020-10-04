
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoBienSo;
import com.etc.bca_moto.entities.MotoBienSoId;

/**
 * Home object for domain model class MotoBienSo.
 * 
 * @see MotoBienSo
 */
public class MotoBienSoDAO extends JPADAO<MotoBienSo, MotoBienSoId> {
	public MotoBienSoDAO() {
		super(MotoBienSo.class);
	}
}