package h06.lazy_fetch_eager_fetch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave06 {

	public static void main(String[] args) {

		Book06 b1 = new Book06 (10, "Math Book");
		Book06 b2 = new Book06 (11, "Science Book");
		Book06 b3 = new Book06 (12, "Java Book");
		
		List<Book06> bookList = new ArrayList();
		bookList.add(b1);
		bookList.add(b2);
		
		Student06 std = new Student06 (101, "Daulet", 12, bookList);
		b1.setStudent(std);
		b2.setStudent(std);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student06.class)
				.addAnnotatedClass(Book06.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(b1);
		s.save(b2);
		s.save(b3);
		
		s.save(std);
		
		tx.commit();
		
	}

}
