
package com.etc.bca_moto.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.etc.bca_moto.entities.QdGiamMienTienPhat04;
import com.etc.bca_moto.entities.QdGiamMienTienPhat04_;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class QdGiamMienTienPhat04.
 * 
 * @see QdGiamMienTienPhat04
 */
public class QdGiamMienTienPhat04DAO extends JPADAO<QdGiamMienTienPhat04, Long> {
	public QdGiamMienTienPhat04DAO() {
		super(QdGiamMienTienPhat04.class);
	}

	/**
	 * @queryMethod Do not edit, method is generated by editor!
	 */
	public List<Long> getMaxId() {
		final EntityManager entityManager = em();
	
		final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
	
		final CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
	
		final Root<QdGiamMienTienPhat04> root = criteriaQuery.from(QdGiamMienTienPhat04.class);
	
		criteriaQuery.multiselect(criteriaBuilder.max(root.get(QdGiamMienTienPhat04_.id)));
	
		final TypedQuery<Long> query = entityManager.createQuery(criteriaQuery);
		return query.getResultList();
	}
}