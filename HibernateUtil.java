package com.infy.studentdetails;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory=null;;

     static  {
        try {
        	StandardServiceRegistry standardRegistry = 
        		       new StandardServiceRegistryBuilder().configure("com/infy/studentdetails/hibernate.cfg.xml").build();
        			Metadata metaData = 
        		        new MetadataSources(standardRegistry).getMetadataBuilder().build();
        			sessionFactory = metaData.getSessionFactoryBuilder().build();
        	
        } 
        catch (Throwable ex) {
            
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
