
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DvcsgtBackup;
import com.etc.bca_moto.entities.DvcsgtBackupId;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DvcsgtBackup.
 * 
 * @see DvcsgtBackup
 */
public class DvcsgtBackupDAO extends JPADAO<DvcsgtBackup, DvcsgtBackupId> {
	public DvcsgtBackupDAO() {
		super(DvcsgtBackup.class);
	}
}