package com.app.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MultiDemo {
    public static void main(String[] args) {

        Configuration configuration=new Configuration().configure();
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory factory=configuration.buildSessionFactory(builder.build());
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        // now ready to do things...

        //many-to-many relationship:
        //A deity should have many worshippers
        //worshipers can worship many deities




        //end transaction, close session...
        transaction.commit();
        session.close();
        factory.close();
    }

}
