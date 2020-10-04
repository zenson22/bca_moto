
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.NoiCapCmnd;

/**
 * Home object for domain model class NoiCapCmnd.
 * 
 * @see NoiCapCmnd
 */
public class NoiCapCmndDAO extends JPADAO<NoiCapCmnd, Long> {
	public NoiCapCmndDAO() {
		super(NoiCapCmnd.class);
	}
}