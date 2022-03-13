package h04.onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		
		Student04 std = new Student04();
		
		Book04 book = new Book04();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student04.class)
				.addAnnotatedClass(Book04.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		std = s.get(Student04.class, 101);
		
		book = s.get(Book04.class, 12);
		
		tx.commit();
		
//		List<Book04> bookList = std.getBookList();
//		
//		for (Book04 b : bookList) {
//			System.out.println(b);
//		}
//		
//		System.out.println(std);
		
//		System.out.println(book);
		
//		String sqlQuery = "SELECT s.name, s.std_id, b.book_name "
//				+ "FROM Student04 s "
//				+ "INNER JOIN Book04 b "
//				+ "ON s.std_id=b.std_id";
//		
//		List<Object[]> sqlList1 = s.createSQLQuery(sqlQuery).getResultList();
//		
//		for (Object[] arrays : sqlList1) {
//			for (Object objects : arrays) {
//				System.out.println(objects);
//			}
//		}
		
		String hqlQuery = "SELECT s.name, s.std_id, b.book_name "
				+ "FROM Student04 s "
				+ "INNER JOIN Book04 b "
				+ "ON s.std_id=b.student";
		
		List<Object[]> hqlList1 = s.createQuery(hqlQuery).getResultList();
		
		for (Object[] arrays : hqlList1) {
			System.out.println(Arrays.toString(arrays));
		}
	
	}

}
