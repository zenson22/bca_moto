
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LinhVucGiaoThong;

/**
 * Home object for domain model class LinhVucGiaoThong.
 * 
 * @see LinhVucGiaoThong
 */
public class LinhVucGiaoThongDAO extends JPADAO<LinhVucGiaoThong, Long> {
	public LinhVucGiaoThongDAO() {
		super(LinhVucGiaoThong.class);
	}
}