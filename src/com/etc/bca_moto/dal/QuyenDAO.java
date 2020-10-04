
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.Quyen;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.QuyenId;

/**
 * Home object for domain model class Quyen.
 * 
 * @see Quyen
 */
public class QuyenDAO extends JPADAO<Quyen, QuyenId> {
	public QuyenDAO() {
		super(Quyen.class);
	}
}