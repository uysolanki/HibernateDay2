package com.greatlearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.greatlearning.model.Dept;
import com.greatlearning.model.Emp;

public class OneToManyDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	
//	Dept d1=new Dept();
//	d1.setDname("IT");
//	d1.setLocation("Pune");
//	
//	Dept d2=new Dept();
//	d2.setDname("Sales");
//	d2.setLocation("Jaipur");
//	
//	
//	Emp e1=new Emp();
//	e1.setEname("Alice");
//	e1.setSalary(800);
//	e1.setD(d1);
//	
//	Emp e2=new Emp();
//	e2.setEname("Ben");
//	e2.setSalary(900);
//	e2.setD(d1);
//	
//	Emp e3=new Emp();
//	e3.setEname("Chris");
//	e3.setSalary(1000);
//	e3.setD(d2);
//	
//	session.save(d1);
//	session.save(d2);
//	session.save(e1);
//	session.save(e2);
//	session.save(e3);
		Dept dx=(Dept)session.get(Dept.class, 1); //select 1 Table,2 Table join??
		session.delete(dx);
		tx.commit();
	
	session.close();
	factory.close();
}
}
