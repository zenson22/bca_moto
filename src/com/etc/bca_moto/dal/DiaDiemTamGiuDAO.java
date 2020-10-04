
package com.etc.bca_moto.dal;

import com.xdev.dal.JPADAO;
import com.etc.bca_moto.entities.DiaDiemTamGiu;

/**
 * Home object for domain model class DiaDiemTamGiu.
 * 
 * @see DiaDiemTamGiu
 */
public class DiaDiemTamGiuDAO extends JPADAO<DiaDiemTamGiu, Long> {
	public DiaDiemTamGiuDAO() {
		super(DiaDiemTamGiu.class);
	}
}