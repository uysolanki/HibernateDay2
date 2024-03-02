package com.greatlearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.greatlearning.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
//    	Student s1=new Student();
//    	s1.setSname("Alice");
//    	s1.setPer(78.5);
//    	
//    	session.save(s1);
    	
    	Student s2=(Student)session.get(Student.class,1);
    	System.out.println(s2);  //1 Alice 78.5
    	s2.setPer(77.7);
    	session.saveOrUpdate(s2);
    	
    	tx.commit();
    	session.close();
    	factory.close();

    }
}
