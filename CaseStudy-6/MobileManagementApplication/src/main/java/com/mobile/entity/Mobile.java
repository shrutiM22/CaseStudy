package com.mobile.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobilemangement")   //creates table named mobilemangement
public class Mobile {
	
	@Id              //primary key mid
	private int mid;
	private String mname;
	private String mtype;
	private int mprice;
	private int mwarranty;
	private int mImeiNo;
	
		
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(int mid, String mname, String mtype, int mprice, int mwarranty,int mImeiNo) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mtype = mtype;
		this.mprice = mprice;
		this.mwarranty = mwarranty;
		this.mImeiNo = mImeiNo;
	}
	
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getmImeiNo() {
		return mImeiNo;
	}
	public void setmImeiNo(int mImeiNo) {
		this.mImeiNo = mImeiNo;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	public int getMwarranty() {
		return mwarranty;
	}
	public void setMwarranty(int mwarranty) {
		this.mwarranty = mwarranty;
	}

	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", mname=" + mname + ", mtype=" + mtype + ", mprice=" + mprice + ", mwarranty="
				+ mwarranty + ", mImeiNo=" + mImeiNo + "]";
	}

	
	
	
	
	

}
