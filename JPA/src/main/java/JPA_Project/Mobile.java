package JPA_Project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "public")
public class Mobile {
	
	@Id
	private int m_id;
	private String m_name;
	
	@OneToOne
	private People people;
	
	
	
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	@Override
	public String toString() {
		return "Mobile [m_id=" + m_id + ", m_name=" + m_name + "]";
	}
	
	

}
