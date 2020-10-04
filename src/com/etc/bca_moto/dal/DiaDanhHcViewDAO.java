
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.DiaDanhHcViewId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DiaDanhHcView;

/**
 * Home object for domain model class DiaDanhHcView.
 * 
 * @see DiaDanhHcView
 */
public class DiaDanhHcViewDAO extends JPADAO<DiaDanhHcView, DiaDanhHcViewId> {
	public DiaDanhHcViewDAO() {
		super(DiaDanhHcView.class);
	}
}