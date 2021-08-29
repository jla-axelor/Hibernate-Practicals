package JPA_Project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Books {
	
	@Id
	private int b_no;
	private String b_name;
	
	@ManyToOne
	private People people;


	public int getB_no() {
		return b_no;
	}


	public void setB_no(int b_no) {
		this.b_no = b_no;
	}


	public String getB_name() {
		return b_name;
	}


	public void setB_name(String b_name) {
		this.b_name = b_name;
	}


	public People getPeople() {
		return people;
	}


	public void setPeople(People people) {
		this.people = people;
	}


	@Override
	public String toString() {
		return "Books [b_no=" + b_no + ", b_name=" + b_name;
	}
	
	

}
