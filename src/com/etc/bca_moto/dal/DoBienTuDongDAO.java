
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DoBienTuDong;
import com.etc.bca_moto.entities.DoBienTuDongId;

/**
 * Home object for domain model class DoBienTuDong.
 * 
 * @see DoBienTuDong
 */
public class DoBienTuDongDAO extends JPADAO<DoBienTuDong, DoBienTuDongId> {
	public DoBienTuDongDAO() {
		super(DoBienTuDong.class);
	}
}