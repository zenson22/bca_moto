
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DiaDanhHanhChinhProd;

/**
 * Home object for domain model class DiaDanhHanhChinhProd.
 * 
 * @see DiaDanhHanhChinhProd
 */
public class DiaDanhHanhChinhProdDAO extends JPADAO<DiaDanhHanhChinhProd, Long> {
	public DiaDanhHanhChinhProdDAO() {
		super(DiaDanhHanhChinhProd.class);
	}
}