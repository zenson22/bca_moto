
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.QuyenDanhDauBienId;
import com.etc.bca_moto.entities.QuyenDanhDauBien;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class QuyenDanhDauBien.
 * 
 * @see QuyenDanhDauBien
 */
public class QuyenDanhDauBienDAO extends JPADAO<QuyenDanhDauBien, QuyenDanhDauBienId> {
	public QuyenDanhDauBienDAO() {
		super(QuyenDanhDauBien.class);
	}
}