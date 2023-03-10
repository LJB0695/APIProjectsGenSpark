package org.example;
import net.bytebuddy.asm.MemberSubstitution;
import org.example.Entity.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();

//        Animal a1 = new Animal();
//        a1.setAnimalID(1);
//        a1.setAnimalSpecies("Red Panda");
//        a1.setColor("Red");
//        session.save(a1);
//
//        Animal a2 = new Animal();
//        a2.setAnimalID(2);
//        a2.setAnimalSpecies("Pig");
//        a2.setColor("pink");
//        session.save(a2);

        Animal a3 = new Animal();
        a3.setAnimalID(3);
        a3.setAnimalSpecies("Lemur");
        a3.setColor("Black and White");
        //session.save(a3);
        session.delete(a3);

//        Query query = session.createQuery("update Animal set animalSpecies=:n where animalId=:i");
//        query.setParameter("n", "Fox");
//        query.setParameter("i", 1);
//        int status = query.executeUpdate();
//        System.out.println(status);


//        List<Animal> animalList = query.list();
//
//        for (Animal animals: animalList) {
//            System.out.println(animals.toString());
//
//        }


        t.commit();
        System.out.println("Deleted successfully");
        session.close();
        sessionFactory.close();
    }
}
