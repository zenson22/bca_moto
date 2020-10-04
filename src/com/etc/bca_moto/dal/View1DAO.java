
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.View1Id;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.View1;

/**
 * Home object for domain model class View1.
 * 
 * @see View1
 */
public class View1DAO extends JPADAO<View1, View1Id> {
	public View1DAO() {
		super(View1.class);
	}
}