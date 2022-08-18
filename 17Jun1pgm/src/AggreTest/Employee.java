package AggreTest;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empid;
	private String empname;
	private Address address;
	private Location lca;

	public Location getLca() {
		return lca;
	}

	public void setLca(Location lca) {
		this.lca = lca;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
