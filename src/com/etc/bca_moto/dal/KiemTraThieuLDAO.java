
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.KiemTraThieuL;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class KiemTraThieuL.
 * 
 * @see KiemTraThieuL
 */
public class KiemTraThieuLDAO extends JPADAO<KiemTraThieuL, Long> {
	public KiemTraThieuLDAO() {
		super(KiemTraThieuL.class);
	}
}