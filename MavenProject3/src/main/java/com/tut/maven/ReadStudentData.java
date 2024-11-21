package com.tut.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.HiberanteUtils.HibernateConf;

public class ReadStudentData {

	
	public static void main(String args[]) {
		
		
		SessionFactory sf = HibernateConf.sf();

		Session session = sf.openSession();
		StudentDataFeild sdf = session.get(StudentDataFeild.class,2);
		
		System.out.println(sdf.getName());
		
		
//		sdf.setCity("Lahore");
		
//		session.beginTransaction().commit();
//		
//		session.update(sdf);
		
		session.close();
		
		sf.close();
		
		
		
		
	}
	
	
}
