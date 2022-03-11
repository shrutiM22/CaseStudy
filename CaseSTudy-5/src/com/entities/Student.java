package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studDATA")
public class Student {
	@Id
	private int sId;
	@Column(length=15)
	private String sName;
	private int standard;
	@Column(length=20)
	private String sInterest;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getsInterest() {
		return sInterest;
	}
	public void setsInterest(String sInterest) {
		this.sInterest = sInterest;
	}
	
	public Student() {
		//default constructor
	}
	public Student(int sId, String sName, int standard, String sInterest) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.standard = standard;
		this.sInterest = sInterest;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", standard=" + standard + ", sInterest=" + sInterest + "]";
	}

}
