package h02.embeddables;

import javax.persistence.Embeddable;

@Embeddable //This means this class can be in a table
public class Courses {

	private String selective;
	private String mandatory;
	public Courses() {
	}
	public Courses(String selective, String mandatory) {
		super();
		this.selective = selective;
		this.mandatory = mandatory;
	}
	public String getSelective() {
		return selective;
	}
	public void setSelective(String selective) {
		this.selective = selective;
	}
	public String getMandatory() {
		return mandatory;
	}
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}
	@Override
	public String toString() {
		return "[selective=" + selective + ", mandatory=" + mandatory + "]";
	}
	
	
	
}
