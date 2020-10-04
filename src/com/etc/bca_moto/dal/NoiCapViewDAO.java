
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.NoiCapViewId;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.NoiCapView;

/**
 * Home object for domain model class NoiCapView.
 * 
 * @see NoiCapView
 */
public class NoiCapViewDAO extends JPADAO<NoiCapView, NoiCapViewId> {
	public NoiCapViewDAO() {
		super(NoiCapView.class);
	}
}