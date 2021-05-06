package  com.app.main;

import com.app.model.Monster;
import com.app.model.Player;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Configuration configuration=new Configuration().configure();
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory factory=configuration.buildSessionFactory(builder.build());
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        // now ready to do things...

        //DEMO!
        /*
        Player p1=new Player(100,"Sachin");
        System.out.println(session.save(p1));
        Player p2=new Player(101,"Raj");
        System.out.println(session.save(p2));

        Player p=(Player)session.get(Player.class,101);
        System.out.println(p);
////
//        Player p1=new Player(100,"Sachin Updated");
//        session.update(p1);

//        session.delete(p);
           */
        //DEMO2 - fiddle
        //looks like annotations are new -used to use XML mapping...
        Monster slime = new Monster("slime", 15, "water", 3);
        Monster skeleton = new Monster("skeleton", 12, "void", 3);
        Monster boar = new Monster("boar", 4, null, 3);
        Monster archer = new Monster("archer", 24, null, 4);
        Monster goldDragon = new Monster("gold dragon", 74, "fire", 23);
        Monster silverDragon = new Monster("silver dragon", 78, "water", 17);


        session.save(skeleton);
        session.save(boar);
        session.save(archer);
        session.save(goldDragon);
        session.save(silverDragon);
        session.save(slime);
        //testing too long name
        Monster evilSlime = new Monster("slime12345678901234567890", 15, "water", 3);
//        session.save(evilSlime); //throws error! (good)

        Query query=session.createQuery("from com.app.model.Monster where max_hp > :hp");
//        query.setString("city","Bangalore");
        query.setInteger("hp",50);
//        List<Player> playerList=query.list();
        List<Monster> monsterList=query.list();
//
//        System.out.println("Query(HQL) API demo");
        for(Monster m:monsterList){
            System.out.println(m);
        }




        //need to test deleting... can I delete without the player object?
        //- delete with just id? try with monster









        //end transaction, close session...
        transaction.commit();
        session.close();
        factory.close();
    }
}
