package h08.update;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Student08 {
	
	@Id
	private int student_id;
	
	@Column(name="student_name")//To give a new name
	private String name;
	
	//@Transient//To skip the column name for database table
	private int grade;
	
	public Student08() {
	}
	public Student08(int student_id, String name, int grade) {
		this.student_id = student_id;
		this.name = name;
		this.grade = grade;
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
	@Override
	public String toString() {
		return "Student01 [student_id=" + student_id + ", name=" + name + ", grade=" + grade + "]";
	}

}
