package com.greatlearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.greatlearning.model.ChiefMinister;
import com.greatlearning.model.State;

public class OneToOneDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	State s1=new State();
    	s1.setStname("Maharashtra");
    	s1.setCapcity("Mumbai");
    	
    	State s2=new State();
    	s2.setStname("Gujarat");
    	s2.setCapcity("Ahmedabad");
    	
    	
    	ChiefMinister c1=new ChiefMinister();
    	c1.setCmname("Shinde");
    	c1.setCmage(55);
    	
    	ChiefMinister c2=new ChiefMinister();
    	c2.setCmname("Patel");
    	c2.setCmage(65);
    	
    	s1.setMyCm(c1);
    	s2.setMyCm(c2);
    	
//    	c1.setMyState(s1);
//    	c2.setMyState(s2);
    	
    	session.save(s1);
    	session.save(s2);
    	session.save(c1);
    	session.save(c2);
    	
    	tx.commit();
    	
    	session.close();
    	factory.close();

	}

}
