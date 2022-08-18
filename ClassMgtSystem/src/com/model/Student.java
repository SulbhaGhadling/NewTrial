package com.model;

public class Student {
	private int sID;
	private String sName;
	private Batch batch;

	@Override
	public String toString() {
		return sID + "\t\t" + sName + "\t\t" + batch.getbName();
	}

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

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}
}
