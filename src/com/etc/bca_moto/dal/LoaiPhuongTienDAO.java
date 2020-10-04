
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.LoaiPhuongTien;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class LoaiPhuongTien.
 * 
 * @see LoaiPhuongTien
 */
public class LoaiPhuongTienDAO extends JPADAO<LoaiPhuongTien, Long> {
	public LoaiPhuongTienDAO() {
		super(LoaiPhuongTien.class);
	}
}