package h02.embeddables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {

	public static void main(String[] args) {
		
		Courses courses = new Courses("Music", "Math");
		
		Student02 std = new Student02(101, "Ali Can", 10, courses);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student02.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
			
		s.save(std);
		
		tx.commit();
		
	}

}
