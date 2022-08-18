package com.model;

public class Course {
	private int cID;
	private String cName;
	

	@Override
	public String toString() {
		return cID + "\t\t" + cName; 
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

}
