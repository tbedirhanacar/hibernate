package h02.embeddables;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student02 {
	
	@Id
	private int student_id;
	private String name;
	private int grade;
	private Courses courses;
	
	public Student02() {
	}
	public Student02(int student_id, String name, int grade, Courses courses) {
		this.student_id = student_id;
		this.name = name;
		this.grade = grade;
		this.courses = courses;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Courses getCourses() {
		return courses;
	}
	public void setCourses(Courses courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student02 [student_id=" + student_id + ", name=" + name + ", grade=" + grade + ", courses=" + courses
				+ "]";
	}
	

	

}
