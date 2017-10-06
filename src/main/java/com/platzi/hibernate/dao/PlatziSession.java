package com.platzi.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PlatziSession {
	private Session session;

	public PlatziSession() {
		SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	
}
