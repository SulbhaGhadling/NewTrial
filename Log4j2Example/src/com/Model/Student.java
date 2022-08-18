package com.Model;

public class Student {
	private int sID;
	private String sName, sAddress;

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "\nStudent \tsID: " + sID + "\tsName: " + sName + "\tsAddress: " + sAddress;
	}

}
