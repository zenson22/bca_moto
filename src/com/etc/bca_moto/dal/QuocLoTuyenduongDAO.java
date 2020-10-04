
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.QuocLoTuyenduong;

/**
 * Home object for domain model class QuocLoTuyenduong.
 * 
 * @see QuocLoTuyenduong
 */
public class QuocLoTuyenduongDAO extends JPADAO<QuocLoTuyenduong, Long> {
	public QuocLoTuyenduongDAO() {
		super(QuocLoTuyenduong.class);
	}
}