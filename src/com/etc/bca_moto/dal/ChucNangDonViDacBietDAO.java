
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.ChucNangDonViDacBiet;

/**
 * Home object for domain model class ChucNangDonViDacBiet.
 * 
 * @see ChucNangDonViDacBiet
 */
public class ChucNangDonViDacBietDAO extends JPADAO<ChucNangDonViDacBiet, Long> {
	public ChucNangDonViDacBietDAO() {
		super(ChucNangDonViDacBiet.class);
	}
}