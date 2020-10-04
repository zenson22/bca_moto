
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.MotoSeriChu;
import com.etc.bca_moto.entities.MotoSeriChuId;

/**
 * Home object for domain model class MotoSeriChu.
 * 
 * @see MotoSeriChu
 */
public class MotoSeriChuDAO extends JPADAO<MotoSeriChu, MotoSeriChuId> {
	public MotoSeriChuDAO() {
		super(MotoSeriChu.class);
	}
}