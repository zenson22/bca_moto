
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.ViewTracuuLschId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.ViewTracuuLsch;

/**
 * Home object for domain model class ViewTracuuLsch.
 * 
 * @see ViewTracuuLsch
 */
public class ViewTracuuLschDAO extends JPADAO<ViewTracuuLsch, ViewTracuuLschId> {
	public ViewTracuuLschDAO() {
		super(ViewTracuuLsch.class);
	}
}