package com.thevarungupta.ProjectHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main2( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        //System.out.println(factory);
        
        // saving a new record in employee table
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("Mark");
        employee.setAge(20);
        employee.setEmail("m@gmail.com");
        employee.setSalary(10000);
        
        Session session =  factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(employee);
        
        tx.commit();
//        Session session = factory.getCurrentSession();
//        session.save(employee);
        
        
        System.out.println("record inserted");
        session.close();
        
        
        
        
        
        
    }
}
