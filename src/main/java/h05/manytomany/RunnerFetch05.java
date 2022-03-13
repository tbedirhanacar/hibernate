package h05.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch05 {

	public static void main(String[] args) {

		Student05 std = new Student05();
		
		Book05 book = new Book05();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student05.class)
				.addAnnotatedClass(Book05.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		std = s.get(Student05.class, 101);
		book = s.get(Book05.class, 11);
		
		String hqlQuery = "FROM Book05 WHERE book_name = 'Art Book'";
		List<Object> bookList = s.createQuery(hqlQuery).getResultList();
		
//		for (Object objects : bookList)System.out.println(objects);
		
		//2.Way of getting data as a single data
		Book05 book2 = (Book05) s.createQuery(hqlQuery).getSingleResult();
		
		System.out.println(book2);
		
		tx.commit();
		
//		System.out.println(std);
//		System.out.println(book);
		
	}

}
