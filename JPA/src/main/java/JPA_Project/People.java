package JPA_Project;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "public")
public class People {
	
	@Id
	private int id;
	private String p_name;
	
	@OneToOne(mappedBy = "people" , cascade = CascadeType.ALL)
	private Mobile mobile;
	
	@OneToMany(mappedBy = "people", cascade = CascadeType.ALL)
	private  List<Books> books;
	
	@ManyToMany(mappedBy = "people" ,cascade = CascadeType.ALL)
	private List<Laptop> laptop;
	
	
	
	
	
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public int getP_ID() {
		return id;
	}
	public void setP_ID(int id) {
		this.id = id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", p_name=" + p_name + ", mobile=" + mobile + ", books=" + books + ", laptop="
				+ laptop + "]";
	}
	
	
	
	
	
	

}
