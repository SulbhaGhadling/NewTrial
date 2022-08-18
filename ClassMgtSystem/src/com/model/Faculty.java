package com.model;

public class Faculty {
	private int fID;
	private String fName;
	private Course course;

	@Override
	public String toString() {
		return fID + "\t\t" + fName + "\t\t" + course.getcName() ;
	}

	public int getfID() {
		return fID;
	}

	public void setfID(int fID) {
		this.fID = fID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
