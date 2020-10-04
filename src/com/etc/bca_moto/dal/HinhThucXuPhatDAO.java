
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.HinhThucXuPhat;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class HinhThucXuPhat.
 * 
 * @see HinhThucXuPhat
 */
public class HinhThucXuPhatDAO extends JPADAO<HinhThucXuPhat, Long> {
	public HinhThucXuPhatDAO() {
		super(HinhThucXuPhat.class);
	}
}