
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.CanBoTest;
import com.etc.bca_moto.entities.CanBoTestId;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class CanBoTest.
 * 
 * @see CanBoTest
 */
public class CanBoTestDAO extends JPADAO<CanBoTest, CanBoTestId> {
	public CanBoTestDAO() {
		super(CanBoTest.class);
	}
}