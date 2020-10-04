
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.QuyenNguoidungBackupId;
import com.etc.bca_moto.entities.QuyenNguoidungBackup;

/**
 * Home object for domain model class QuyenNguoidungBackup.
 * 
 * @see QuyenNguoidungBackup
 */
public class QuyenNguoidungBackupDAO extends JPADAO<QuyenNguoidungBackup, QuyenNguoidungBackupId> {
	public QuyenNguoidungBackupDAO() {
		super(QuyenNguoidungBackup.class);
	}
}