package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave01 {

	public static void main(String[] args) {
		
		Student01 std1 = new Student01(101, "Ali Can", 10);
		Student01 std2 = new Student01(102, "Veli Han", 11);

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);
		SessionFactory s1 = con.buildSessionFactory();
		Session s = s1.openSession();
		
		Transaction tx = s.beginTransaction();
		s.save(std1);
		s.save(std2);
		tx.commit();

	}
}
