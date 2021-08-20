package App1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity(name = "Mobile_Phones")
public class Mobils {

		@Id
		@Column(name = "Mobile_ID")
		private int m_id;
		private String m_name;
		
		//M2M relation with student
		@ManyToMany
		private List<Student> student;

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

		public List<Student> getStudent() {
			return student;
		}

		public void setStudent(List<Student> student) {
			this.student = student;
		}

		@Override
		public String toString() {
			return "Mobils [m_id=" + m_id + ", m_name=" + m_name + ", student=" + student + "]";
		}

		
		
}
