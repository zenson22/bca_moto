
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.ViewMotoBienDangKy;
import com.etc.bca_moto.entities.ViewMotoBienDangKyId;

/**
 * Home object for domain model class ViewMotoBienDangKy.
 * 
 * @see ViewMotoBienDangKy
 */
public class ViewMotoBienDangKyDAO extends JPADAO<ViewMotoBienDangKy, ViewMotoBienDangKyId> {
	public ViewMotoBienDangKyDAO() {
		super(ViewMotoBienDangKy.class);
	}
}