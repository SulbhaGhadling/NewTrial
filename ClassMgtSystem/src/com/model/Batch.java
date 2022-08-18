package com.model;

public class Batch {
	private int bID;
	private String bName;
	private Faculty faculty;

	@Override
	public String toString() {
		return bID + "\t\t" + bName + "\t\t" + faculty.getfName();
	}

	public int getbID() {
		return bID;
	}

	public void setbID(int bID) {
		this.bID = bID;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
}
