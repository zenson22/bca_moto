package com.etc.bca_moto.conn;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.vaadin.ui.UI;
import com.xdev.Application;
import com.xdev.communication.Conversationables;
import com.xdev.dal.JPADAO;



public class HibernateConnection<T,ID extends Serializable> extends JPADAO<T, Serializable>{
	
	public static EntityManager em = null;
	public HibernateConnection(final Class<T> persistentClass) {
		super(persistentClass);
	}

	public void getEntityManager(){
		this.em= super.em();
	}
	
	public static void main(final String[] args) {
	final Conversationables conversationables = UI.getCurrent().getSession()
					.getAttribute(Conversationables.class);
		for(final String persistenceUnit : Application.getPersistenceManager()
						.getPersistenceUnits())
				{
					Application.getSessionStrategyProvider()
							.getRequestStartSessionStrategy(conversationables,persistenceUnit)
							.requestStart(conversationables,persistenceUnit);
				}
		System.out.println(System.getProperties().toString() );
	}
}
