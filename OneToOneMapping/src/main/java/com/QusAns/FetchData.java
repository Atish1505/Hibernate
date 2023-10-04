package com.QusAns;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		//Getting Values from Table
	       
       	Questions qus=(Questions)session.get(Questions.class,1);
       	System.out.println(qus.getQuestionId()+"  "+qus.getQuestion()+" ");
       	System.out.println(qus.getAnswerId().getAnswer());
     
       	
       	session.close();
       	factory.close();
		

	}

}
