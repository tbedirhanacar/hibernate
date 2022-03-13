package h08.update;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerUpdate08 {

	public static void main(String[] args) {

		Student08 std = new Student08();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student08.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		String hqlQuery = "UPDATE Student08 s SET s.name = 'Veli Han' WHERE s.name='Ali Can'";
//		int updatedRows = s.createQuery(hqlQuery).executeUpdate();
//		
//		System.out.println(updatedRows + " row(s) updated");
		
//		std = s.get(Student08.class, 103);
//		
//		std.setGrade(14);
//		
//		std.setName("Ayse");
		
			List<Student08> list = new ArrayList<Student08>();
			for (int i = 101; i < 105; i++) {
				Student08 std2 = new Student08();
				std2 = s.get(Student08.class, i);
				std2.setName("Osman Tan");
				if (std2.getName().equalsIgnoreCase("Darren")) {
					
				}
				 
				list.add(std2);
			}
		


		
		
//		String hqlQuery2 = "UPDATE Student08 s SET s.name = 'Osman Can' WHERE s.grade>11";
//		int updatedRows = s.createQuery(hqlQuery2).executeUpdate();
//		System.out.println(updatedRows + " row(s) updated");
//		
		tx.commit();
	}

}
