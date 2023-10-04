package com.customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class getFetchData {

	public static void main(String[] args) {
		//Storing all sessions in factory variable
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		
		Customer customer=(Customer)session.get(Customer.class,1);
		System.out.println(customer);
		

	}

}
