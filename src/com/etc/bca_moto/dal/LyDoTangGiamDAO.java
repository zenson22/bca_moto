
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.LyDoTangGiam;

/**
 * Home object for domain model class LyDoTangGiam.
 * 
 * @see LyDoTangGiam
 */
public class LyDoTangGiamDAO extends JPADAO<LyDoTangGiam, Long> {
	public LyDoTangGiamDAO() {
		super(LyDoTangGiam.class);
	}
}