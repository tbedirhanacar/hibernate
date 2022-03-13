package h01.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

	public static void main(String[] args) {

		Student01 std1 = new Student01();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student01.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		std1 = s.get(Student01.class, 101);
		
		tx.commit();
		
		System.out.println(std1);
		
	}

}
