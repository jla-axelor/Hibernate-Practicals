package App1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Books {
	@Id
	private int b_id;
	private String b_name;
	
	//OneToOne Relation mapping  
	@OneToOne(mappedBy = "books")
	private Student student;
	
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	@Override
	public String toString() {
		return "Books [b_name=" + b_name + "]";
	}
	
	
	
	
	
}
