
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.QuyenNguoidungId;
import com.etc.bca_moto.entities.QuyenNguoidung;

/**
 * Home object for domain model class QuyenNguoidung.
 * 
 * @see QuyenNguoidung
 */
public class QuyenNguoidungDAO extends JPADAO<QuyenNguoidung, QuyenNguoidungId> {
	public QuyenNguoidungDAO() {
		super(QuyenNguoidung.class);
	}
}