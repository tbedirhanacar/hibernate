package h08.update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave08 {

	public static void main(String[] args) {

		Student08 std1 = new Student08(101, "Daulet", 10);
		Student08 std2 = new Student08(102, "Darren", 11);		
		Student08 std3 = new Student08(103, "Esma", 12);
		Student08 std4 = new Student08(104, "Ali Can", 14);	
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student08.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(std1);
		s.save(std2);
		s.save(std3);
		s.save(std4);

		
		tx.commit();
	}

}
