package com.cdac.firsthbmapp;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.cdac.firsthbmapp.dto.Employee;

public class Main4 {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		ServiceRegistry sr = ssrb.build();
		
		SessionFactory sf = cfg.buildSessionFactory(sr);
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Employee emp = (Employee)s.get(Employee.class, 121);
		System.out.println("get called");
	//	System.out.println(emp);
		t.commit();
		s.flush();
		s.close();
		sf.close();
		
		
	}

}
