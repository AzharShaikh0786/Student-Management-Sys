package com.tut.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.HiberanteUtils.HibernateConf;

public class DeleteStudentData {

	
	public static void main(String args[]) {
		
		SessionFactory sf = HibernateConf.sf();
		
		Session session = sf.openSession();
		StudentDataFeild sdf = session.get(StudentDataFeild.class,3);
		
		session.delete(sdf);
		session.beginTransaction().commit();
		
		session.close();
		sf.close();
		
		
		
	}
	
	
	
}
