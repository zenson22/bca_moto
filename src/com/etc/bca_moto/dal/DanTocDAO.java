
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DanToc;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DanToc.
 * 
 * @see DanToc
 */
public class DanTocDAO extends JPADAO<DanToc, Long> {
	public DanTocDAO() {
		super(DanToc.class);
	}
}