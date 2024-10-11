package com.tap.manager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.entity.user;

public class HibernateManager {
	private Session session;
	private Transaction t;
	public void connect() {
		session=new Configuration().configure().buildSessionFactory().openSession();
		System.out.println(session);
	}
	public void add(user u) {
	t=	session.beginTransaction();
	session.persist(u);
	t.commit();	
	}

}
