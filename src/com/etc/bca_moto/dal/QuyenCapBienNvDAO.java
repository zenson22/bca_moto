
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.QuyenCapBienNv;
import com.etc.bca_moto.entities.QuyenCapBienNvId;

/**
 * Home object for domain model class QuyenCapBienNv.
 * 
 * @see QuyenCapBienNv
 */
public class QuyenCapBienNvDAO extends JPADAO<QuyenCapBienNv, QuyenCapBienNvId> {
	public QuyenCapBienNvDAO() {
		super(QuyenCapBienNv.class);
	}
}