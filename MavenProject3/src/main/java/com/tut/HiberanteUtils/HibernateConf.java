package com.tut.HiberanteUtils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConf {
	
	private static SessionFactory sf = null;
	public static SessionFactory sf() {
		
		if(sf==null) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure();
		
		sf = cfg.buildSessionFactory();
		
		}
		return sf;
		
	}
	

	

}
