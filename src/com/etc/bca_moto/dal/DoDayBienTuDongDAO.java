
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DoDayBienTuDong;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DoDayBienTuDongId;

/**
 * Home object for domain model class DoDayBienTuDong.
 * 
 * @see DoDayBienTuDong
 */
public class DoDayBienTuDongDAO extends JPADAO<DoDayBienTuDong, DoDayBienTuDongId> {
	public DoDayBienTuDongDAO() {
		super(DoDayBienTuDong.class);
	}
}