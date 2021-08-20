package moreDemo;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


//for applying 2nd level cache we have to add these 2 annotation and also we have to provide strategy
//for second time what we have to want READ data WRIDE data and etc
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class People {
	
	@Id
	private int p_ID;
	private String p_name;
	
	//for fetching all data at once we can use EAGER
	@OneToMany(mappedBy = "people" , fetch = FetchType.EAGER)
	private List<Cloths> closth;
	
	
	
	
	public List<Cloths> getClosth() {
		return closth;
	}
	public void setClosth(List<Cloths> closth) {
		this.closth = closth;
	}
	public int getP_ID() {
		return p_ID;
	}
	public void setP_ID(int p_ID) {
		this.p_ID = p_ID;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	@Override
	public String toString() {
		return "People [p_ID=" + p_ID + ", p_name=" + p_name + ", closth=" + closth + "]";
	}
	
	}
