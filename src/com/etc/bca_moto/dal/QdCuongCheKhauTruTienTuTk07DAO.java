
package com.etc.bca_moto.dal;

import java.util.List;

import javax.persistence.Query;

import com.etc.bca_moto.entities.QdCuongCheKhauTruTienTuTk07;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class QdCuongCheKhauTruTienTuTk07.
 * 
 * @see QdCuongCheKhauTruTienTuTk07
 */
public class QdCuongCheKhauTruTienTuTk07DAO extends JPADAO<QdCuongCheKhauTruTienTuTk07, Long> {
	public QdCuongCheKhauTruTienTuTk07DAO() {
		super(QdCuongCheKhauTruTienTuTk07.class);
	}
public List<QdCuongCheKhauTruTienTuTk07> GetQdById(final long Idx){
	final String SQL = "select * from BCA_MOTO.QD_CUONG_CHE_KHAU_TRU_TIEN_TU_TK07 WHERE QD_CUONG_CHE_KHAU_TRU_TIEN_TU_TK07.ID = "+ Idx;
	final Query nativeQuery = em().createNativeQuery(SQL, QdCuongCheKhauTruTienTuTk07.class);
	final List<QdCuongCheKhauTruTienTuTk07> resultList = nativeQuery.getResultList();
	 return resultList;
 }
}