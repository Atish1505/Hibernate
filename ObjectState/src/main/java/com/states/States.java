package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class States 
{
    public static void main( String[] args )
    {
        System.out.println( "Project States Started !" );
        
        //buliding session factory
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Student student=new Student();
        student.setSname("Anish Jha");
        student.setScity("Darbhanga");
        student.setCerti(new Certificate("Java","6 Months"));
        //Student : Is in Transient State because we set the values now
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(student);
        //Student : is in Persistent State because it now associated with Session and Database
        //if we change value here it will affect on Db lets see
        student.setScity("Bangalore");
        //here "Darbhanga " value change to "Bangalore"
      //now if we see database it fire update command to change values
        tx.commit();
        session.close();
        //Student: Now in a detached State because we close the session not it not associated with DB
        student.setSname("Aatish Pawar");
        //it will print session values 
        System.out.println(student);
        
        System.out.println("Stated Ended !");
        
        
       
        
    }
}
