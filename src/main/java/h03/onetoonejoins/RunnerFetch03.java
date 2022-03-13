package h03.onetoonejoins;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch03 {

	public static void main(String[] args) {
		
		Student03 std = new Student03();
		Dairy dairy = new Dairy();
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student03.class)
				.addAnnotatedClass(Dairy.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		std = s.get(Student03.class, 101);
//		dairy = s.get(Dairy.class, 10);
		
		tx.commit();
		
//		System.out.println(std);
//		System.out.println(dairy);
		
//		String sqlQuery2 = "SELECT s.student_name, d.dairy, s.grade, s.student_id "
//				+ "FROM Student03 s LEFT JOIN "
//				+ "Dairy d ON s.student_id = d.student_id";
//		
//		List<Object[]> sqlList2 = s.createSQLQuery(sqlQuery2).getResultList();
//		
//		for (Object[] o : sqlList2) {
//			System.out.println("\n" + Arrays.toString(o));
//		}
//		
//		String hqlQuery2 = "SELECT s.name, d.dairy, s.grade, s.student_id "
//				+ "FROM Student03 s INNER JOIN "
//				+ "Dairy d ON s.student_id = d.student";
//		
//		List<Object[]> hqlList2 = s.createQuery(hqlQuery2).getResultList();
//		
//		for (Object[] o : hqlList2) {
//			System.out.println(Arrays.toString(o));
//		}
		
		//Fetch all the records getting name, id, grade, dairy, we need to use SQL Query and HQL Query
//		String sqlQuery3 = "SELECT s.student_name, d.dairy_id, s.grade, d.dairy "
//			+ "FROM Student03 s FULL JOIN "
//			+ "Dairy d ON s.student_id = d.student_id";
//
//		List<Object[]> sqlList3 = s.createSQLQuery(sqlQuery3).getResultList();
//		
//		for (Object[] o : sqlList3) {
//			System.out.println("\n" + Arrays.toString(o));
//		}
		
//		String hqlQuery3 = "SELECT s.name, d.dairy_id, s.grade, d.dairy "
//				+ "FROM Student03 s FULL JOIN "
//				+ "Dairy d ON s.student_id = d.student";
//
//			List<Object[]> hqlList3 = s.createQuery(hqlQuery3).getResultList();
//			
//			for (Object[] o : hqlList3) {
//				System.out.println("\n" + Arrays.toString(o));
//			}
		//Fetch all records from both tables
//		String sqlQuery4 = "SELECT s.student_name, s.student_id, s.grade, d.dairy_id, d.dairy "
//		+ "FROM Student03 s FULL JOIN "
//		+ "Dairy d ON s.student_id = d.student_id";
//
//		List<Object[]> sqlList4 = s.createSQLQuery(sqlQuery4).getResultList();
//		
//		for (Object[] o : sqlList4) {
//			System.out.println("\n" + Arrays.toString(o));
//		}
		
		String hqlQuery4 = "FROM Student03 s FULL JOIN Dairy d ON s.student_id = d.student";

		List<Object[]> hqlList4 = s.createQuery(hqlQuery4).getResultList();
		
		for (Object[] o : hqlList4) {
			System.out.println("\n" + Arrays.toString(o));
		}

	}

}
