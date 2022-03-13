package h04.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerDelete04 {

	public static void main(String[] args) {
		
		Student04 std = new Student04();
		Book04 book = new Book04();
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student04.class)
				.addAnnotatedClass(Book04.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		String sqlQuery = "DELETE FROM Student04";
//		
//		int numOfRowsDeleted = s.createQuery(sqlQuery).executeUpdate();
//		System.out.println(numOfRowsDeleted + " records have been deleted");
		
		std = s.get(Student04.class, 101);
		s.delete(std);
		
		tx.commit();
		
		
		
	}

}
