package com.app.main;

import com.app.model.Monster;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Demo3 {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory factory = configuration.buildSessionFactory(builder.build());
        Session session2 = factory.openSession();
        Transaction transaction = session2.beginTransaction();
        // now ready to do things...

// Task1 -> Try HQL with select, update and delete
        String hql = "FROM com.app.model.Monster";
        Query hqlQuery = session2.createQuery(hql);
        List<Monster> monsterList=hqlQuery.list();
        for(Monster m:monsterList){
            System.out.println("test");
            System.out.println(m);
        }


        String hql2 = "UPDATE com.app.model.Monster SET damage = 7 WHERE damage = 4";
        Query hqlQuery2 = session2.createQuery(hql2);
        hqlQuery2.executeUpdate();
//        monsterList=hqlQuery2.list();
//        for(Monster m:monsterList){
//            System.out.println("test");
//            System.out.println(m);
//        }


        String hql3 = "UPDATE com.app.model.Monster SET damage = :dmg WHERE damage = :dmgfrom";
        Query hqlQuery3 = session2.createQuery(hql3);
        hqlQuery3.setInteger("dmg", 19);
        hqlQuery3.setInteger("dmgfrom", 23);
        hqlQuery3.executeUpdate();


//        String hsqlDelete = "Delete com.app.model.Monster WHERE damage = 3";
//        Query deleteQuery = session2.createQuery(hsqlDelete);
//        deleteQuery.executeUpdate();
    //WORKED!



//        Query query=session2.createQuery("from com.app.model.Monster where max_hp > :hp");
////        query.setString("city","Bangalore");
//        query.setInteger("hp",50);





        //end transaction, close session...
        transaction.commit();
        session2.close();
        factory.close();
    }
}
