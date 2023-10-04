package com.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Project Started !");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// creating object of customer class

		Customer ctm = new Customer();
		ctm.setCname("Prasanna");
		ctm.setCcity("Acharya");

		// creating object od order class & store values in it
		Orders order = new Orders();
		order.setOrder_id(1);
		order.setOrder_type("cloths");
		order.setOrder_name("Shirt");
		
		// joining two objects with each other
		ctm.setOrder(order);
		// retrieving session from session factory
		Session session = factory.openSession();
		// begin transaction
		Transaction tx = session.beginTransaction();

		session.save(ctm);

		tx.commit();
		session.close();
		factory.close();

	}
}