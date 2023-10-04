package com.QusAns;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");    
       SessionFactory factory = cfg.buildSessionFactory();
       
       Questions qs = new Questions();
       Questions question=new Questions();
       question.setQuestion("What is collections ?");
       
       Answers answer=new Answers();
       answer.setAnswer("collections is a utility class available in java.utils package");
       answer.setQuestionId(question);
       
       question.setAnswerId(answer);

       
       Session session=factory.openSession();
     
       Transaction tx= session.beginTransaction();
       session.save(question);
       session.save(answer);
     
       tx.commit();
      
      
       
       
       
       
       
    
    }
}
