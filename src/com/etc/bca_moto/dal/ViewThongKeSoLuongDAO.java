
package com.etc.bca_moto.dal;

import com.etc.bca_moto.entities.ViewThongKeSoLuong;
import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.ViewThongKeSoLuongId;

/**
 * Home object for domain model class ViewThongKeSoLuong.
 * 
 * @see ViewThongKeSoLuong
 */
public class ViewThongKeSoLuongDAO extends JPADAO<ViewThongKeSoLuong, ViewThongKeSoLuongId> {
	public ViewThongKeSoLuongDAO() {
		super(ViewThongKeSoLuong.class);
	}
}