/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package App1;

import java.util.Arrays;
import java.util.List;

import org.checkerframework.checker.units.qual.m2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Names n1 = new Names();
		n1.setFirst_name("Jaydeep");
		n1.setLast_name("Ladva");
		
		Names n2 = new Names();
		n2.setFirst_name("Jack");
		n2.setLast_name("Axelor");

		Books books = new Books();
		books.setB_id(101);
		books.setB_name("OOP with Java");
		
		Books books2 = new Books();
		books2.setB_id(202);
		books2.setB_name("python Programming");

		//1st student
		Student student = new Student();
		student.setSid(1);
		student.setNames(n1);
		student.setMarks(99);
		
		//2nd student
		Student student2 = new Student();
		student2.setSid(2);
		student2.setNames(n2);
		student2.setMarks(97);

		
		Laptop l1 = new Laptop();
		l1.setI_name("Dell");
		l1.setL_id(1011);
		l1.setStudent(student);

		Laptop l2 = new Laptop();
		l2.setI_name("HP");
		l2.setL_id(2011);
		l2.setStudent(student);

		Laptop l3 = new Laptop();
		l3.setI_name("Lenovo");
		l3.setL_id(3011);
		l3.setStudent(student);
		
		Mobils m1 = new Mobils();
		m1.setM_id(10001);
		m1.setM_name("iPhone");
		
		Mobils m2 = new Mobils();
		m2.setM_id(20002);
		m2.setM_name("Samsung");
		

		List<Laptop> lps = Arrays.asList(l1, l2, l3);
		
		//list of student
		List<Student> sts = Arrays.asList(student,student2);
		
		List<Mobils> mbs = Arrays.asList(m1,m2);
		
		student.setBooks(books);
		student2.setBooks(books2);
		
		student.setLaptop(lps);
		
		books.setStudent(student);
		books2.setStudent(student2);
		
		student.setMobils(mbs);
		student2.setMobils(mbs);
		
		m1.setStudent(sts);
		m2.setStudent(sts);
		
		
		// first configure
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Books.class).addAnnotatedClass(Laptop.class)
				.addAnnotatedClass(Mobils.class);
		// There is no need to annotate Embeddable class
		// .addAnnotatedClass(Names.class);
		// create session fectory
		SessionFactory sf = con.buildSessionFactory();

		// open session
		Session s1 = sf.openSession();
		// begin transaction
		Transaction tx = s1.beginTransaction();
		// save stuff
		s1.save(student);
		s1.save(l1);
		s1.save(l2);
		s1.save(l3);
		s1.save(books);
		s1.save(books2);

		s1.save(student2);
		s1.save(m1);
		s1.save(m2);
//		Student st = s1.get(Student.class, 1);
//		System.out.println(st);

		tx.commit();
		s1.close();

	}
}
