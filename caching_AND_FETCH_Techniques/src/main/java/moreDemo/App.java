/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package moreDemo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(People.class)
    			.addAnnotatedClass(Cloths.class);
    	SessionFactory sf = con.buildSessionFactory();
    	
    	
//        People people = new People();
//        people.setP_ID(1);
//        people.setP_name("Jaydeep");
//        
//        People people1 = new People();
//        people1.setP_ID(2);
//        people1.setP_name("Hemang");
//        
//        People people2 = new People();
//        people2.setP_ID(3);
//        people2.setP_name("kaif");
//        
//        People people3 = new People();
//        people3.setP_ID(4);
//        people3.setP_name("Kishan");
//    	
//    	
//    	Cloths cl1 = new Cloths();
//    	cl1.setC_ID(1001);
//    	cl1.setPrice(2500);
//    	
//    	Cloths cl2 = new Cloths();
//    	cl2.setC_ID(2002);
//    	cl2.setPrice(2000);
//    	
//    	Cloths cl3 = new Cloths();
//    	cl3.setC_ID(3003);
//    	cl3.setPrice(3000);
//    	
//    	List<Cloths> cls = Arrays.asList(cl1,cl2,cl3);
//    	people.setClosth(cls);
//    	cl1.setPeople(people);
//    	cl2.setPeople(people);
//    	cl3.setPeople(people);
     	
//    	s1.save(people);
//    	s1.save(people1);
//    	s1.save(people2);
//    	s1.save(people3);
//    	
//    	s1.save(cl1);
//    	s1.save(cl2);
//    	s1.save(cl3);
        
        Session s1 = sf.openSession();
        Transaction tx = s1.beginTransaction();
        
        People p1 = s1.get(People.class, 1);
        //for LAZY fetch it will fire query for ID and name 
        //It will fire second query for colths
        
        //after using EAGER the query fires only once 
        System.out.println(p1.toString());
        
        
        //we can check if out object present in first level cache
        //it return boolean
//       System.out.println( s1.contains(p1));
        
        tx.commit();
        s1.close();
        
        
       System.out.println("--------------------------------------------------------------------"); 
       
       
        Session s2 = sf.openSession();
        Transaction tx1 = s2.beginTransaction();
        //after applying s2n level cache it will not hit db if data was present in our session factory 
     
//        People p2 = s2.get(People.class, 1);
//        System.out.println(p2.toString());
        		
       
        
        tx1.commit();
        s2.close();

        
       
    }
}
