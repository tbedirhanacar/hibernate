package h05.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave05 {

	public static void main(String[] args) {
		
		Book05 b1 = new Book05(10, "Math Book");
		Book05 b2 = new Book05(11, "Science Book");
		Book05 b3 = new Book05(12, "Java Book");
		Book05 b4 = new Book05(13, "Art Book");
		
		List<Book05> bookList1 = new ArrayList();
		bookList1.add(b1);
		bookList1.add(b2);
		bookList1.add(b4);	
		
		List<Book05> bookList2 = new ArrayList();
		bookList2.add(b2);
		bookList2.add(b3);
		bookList2.add(b4);
		
		Student05 std1 = new Student05(101, "Daulet", 10, bookList1);
		Student05 std2 = new Student05(102, "Darren", 11, bookList2);

		List<Student05> studentList = new ArrayList();
		studentList.add(std1);
		b1.setStudentsList(studentList);
		
		List<Student05> studentList2 = new ArrayList();
		studentList2.add(std1);
		studentList2.add(std2);
		b2.setStudentsList(studentList2);
		
		List<Student05> studentList3 = new ArrayList();
		studentList3.add(std2);
		b3.setStudentsList(studentList3); 
		
		List<Student05> studentList4 = new ArrayList();
		studentList3.add(std1);
		studentList3.add(std2);
		b4.setStudentsList(studentList4);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student05.class)
				.addAnnotatedClass(Book05.class);
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(b1);
		s.save(b2);
		s.save(b3);
		s.save(b4);
		
		s.save(std1);
		s.save(std2);
		
		tx.commit();

		
	
		
		
	}

}
