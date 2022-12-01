package Embeded.Anatotaion;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Emp_Address {
	@Column(name="Add_Pincode")
	public int pincode;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
