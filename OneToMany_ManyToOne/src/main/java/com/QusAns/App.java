package com.QusAns;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started !" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Questions question=new Questions();
        question.setQuestion("What is Java ? ");
        
        Answers answer1=new Answers();
        answer1.setAnswer("Java is a programming Langauge");
        answer1.setQuestion(question);
        
        Answers answer2=new Answers();
        answer2.setAnswer("Java is Secure, safe & robust");
        answer2.setQuestion(question);
        
        Answers answer3=new Answers();
        answer3.setAnswer("It is completely based on object oriented Prgramming");
        answer3.setQuestion(question);
        
        List<Answers> list=new ArrayList<Answers>();
        list.add(answer1);
        list.add(answer2);
        list.add(answer3);
        
        question.setAnswers(list);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(question);
        session.save(answer1);
        session.save(answer2);
        session.save(answer3);
        
        tx.commit();
        session.close();
        factory.close();
        
    }
}
