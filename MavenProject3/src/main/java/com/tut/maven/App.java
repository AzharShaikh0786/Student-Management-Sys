package com.tut.maven;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..." );
        
        
        
        Configuration cfg = new Configuration();
        cfg.configure("/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        
        StudentDetail stDetail = new StudentDetail();
        stDetail.setId(10);
        stDetail.setName("Safdar");
        stDetail.setDegree("CSE");
        
        
        
        StudentDataFeild stdField = new StudentDataFeild();
        stdField.setCity("Khi");
        stdField.setDate(new Date());
        stdField.setName("Mazhar");
        stdField.setOpen(true);
        stdField.setX(324.24);
        
        
        
        Session session = sf.openSession();
        
        session.save(stdField);
        session.save(stDetail);
        
        StudentDetail std = (StudentDetail)session.get(StudentDetail.class,06);
        System.out.println(std.getName());
        session.beginTransaction().commit();
        session.close();
        sf.close();
        
        
    }
}
