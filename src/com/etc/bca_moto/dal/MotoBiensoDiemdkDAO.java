
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MotoBiensoDiemdkId;
import com.etc.bca_moto.entities.MotoBiensoDiemdk;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class MotoBiensoDiemdk.
 * 
 * @see MotoBiensoDiemdk
 */
public class MotoBiensoDiemdkDAO extends JPADAO<MotoBiensoDiemdk, MotoBiensoDiemdkId> {
	public MotoBiensoDiemdkDAO() {
		super(MotoBiensoDiemdk.class);
	}
}