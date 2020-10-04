
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.MotoMaLoaiXeId;
import com.etc.bca_moto.entities.MotoMaLoaiXe;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class MotoMaLoaiXe.
 * 
 * @see MotoMaLoaiXe
 */
public class MotoMaLoaiXeDAO extends JPADAO<MotoMaLoaiXe, MotoMaLoaiXeId> {
	public MotoMaLoaiXeDAO() {
		super(MotoMaLoaiXe.class);
	}
}