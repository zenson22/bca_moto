
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.ViewTracuuMotoId;
import com.etc.bca_moto.entities.ViewTracuuMoto;

/**
 * Home object for domain model class ViewTracuuMoto.
 * 
 * @see ViewTracuuMoto
 */
public class ViewTracuuMotoDAO extends JPADAO<ViewTracuuMoto, ViewTracuuMotoId> {
	public ViewTracuuMotoDAO() {
		super(ViewTracuuMoto.class);
	}
}