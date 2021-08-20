package moreDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cloths {
	@Id
	private int c_ID;
	private int price;
	
	@ManyToOne
	private People people;

	public int getC_ID() {
		return c_ID;
	}

	public void setC_ID(int c_ID) {
		this.c_ID = c_ID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Cloths [c_ID=" + c_ID + ", price=" + price + "]";
	}
	
	
}
