package com.tut.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tut.HiberanteUtils.HibernateConf;

public class UpdateStudentData {

	
	public static void main(String args[]) {
		

		SessionFactory sf = HibernateConf.sf();
		Session session = sf.openSession();
		StudentDataFeild sdf = session.get(StudentDataFeild.class,2);
		sdf.setName("AsadUllah");
		
		session.update(sdf);
		session.beginTransaction().commit();
		
		session.close();
		sf.close();
		
		
		
		
	}
}
