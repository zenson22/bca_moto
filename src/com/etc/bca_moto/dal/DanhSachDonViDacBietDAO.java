
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DanhSachDonViDacBiet;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class DanhSachDonViDacBiet.
 * 
 * @see DanhSachDonViDacBiet
 */
public class DanhSachDonViDacBietDAO extends JPADAO<DanhSachDonViDacBiet, Long> {
	public DanhSachDonViDacBietDAO() {
		super(DanhSachDonViDacBiet.class);
	}
}