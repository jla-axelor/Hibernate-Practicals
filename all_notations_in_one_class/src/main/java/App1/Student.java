package App1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

//create database with this name , also we can create db with another name with name method 
@Entity
public class Student {
	//consider it as primary key of the table
	@Id
	private int sid;
	//we can ignore column with transient 
	
	private  Names names;
	private int marks;
	
	
	//OneToOne Relation mapping  
	//Student class and Books class
	@OneToOne
	private Books books;
	
	//OneToMany with Laptop class
	@OneToMany(mappedBy = "student")
 	private List<Laptop> laptop;
	
	//M2M with Mobils class
	@ManyToMany(mappedBy = "student")
	private List<Mobils> mobils;
	
	
	
	
	
	
	
	
	public List<Mobils> getMobils() {
		return mobils;
	}
	public void setMobils(List<Mobils> mobils) {
		this.mobils = mobils;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Names getNames() {
		return names;
	}
	public void setNames(Names names) {
		this.names = names;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", names=" + names + ", marks=" + marks + ", books=" + books + ", laptop="
				+ laptop + "]";
	}

	
	
	
	
}
