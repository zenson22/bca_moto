
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.ThongBaoXeTichThu;

/**
 * Home object for domain model class ThongBaoXeTichThu.
 * 
 * @see ThongBaoXeTichThu
 */
public class ThongBaoXeTichThuDAO extends JPADAO<ThongBaoXeTichThu, Long> {
	public ThongBaoXeTichThuDAO() {
		super(ThongBaoXeTichThu.class);
	}
}