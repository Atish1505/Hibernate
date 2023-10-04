package com.MTM;

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
        System.out.println( "Many To Many Mapping Started!" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        
        emp1.setName("Aatish Pawar");
        emp2.setName("Anish Jha");
        
        Project p1=new Project();
        Project p2=new Project();
        
        p1.setPname("Library Management System");
        p2.setPname("CHATBOT");
        
        List<Employee> employees=new ArrayList<Employee>();
        List<Project> projects=new ArrayList<Project>();
        
        employees.add(emp1);
        employees.add(emp2);
        
        projects.add(p1);
        projects.add(p2);
        
        emp1.setProject(projects);
        p1.setEmployee(employees);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(emp1);
        session.save(emp2);
        session.save(p1);
        session.save(p2);
        
        tx.commit();
        
        factory.close();
        
        
    }
}
