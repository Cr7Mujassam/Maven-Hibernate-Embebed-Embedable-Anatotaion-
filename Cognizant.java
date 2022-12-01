package Embeded.Anatotaion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Cognizant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Emp_Id;
	private Emp_Address emp;
	
	
	public int getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}
	public Emp_Address getEmp() {
		return emp;
	}
	public void setEmp(Emp_Address emp) {
		this.emp = emp;
	}
}
