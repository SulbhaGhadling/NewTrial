package AggreTest;

import java.io.Serializable;

public class Address implements Serializable {
	private String city;
	private String state;
	private String pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinocode() {
		return pincode;
	}

	public void setPinocode(String pinocode) {
		this.pincode = pinocode;
	}
}
