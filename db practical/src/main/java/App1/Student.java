package App1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

//create database with this name , also we can create db with another name with name method 
@Entity
public class Student {
	//consider it as primary key of the table
	@Id
	private int sid;
	//we can ignore column with transient 
	@Transient
	private int number;
	private  Names names;
	private int marks;
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
		return "Student [sid=" + sid + ", names=" + names + ", marks=" + marks + "]";
	}
	
	
}
