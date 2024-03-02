package com.greatlearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mno;
	private String mname;
	private int ryear;
	
	public Movie() {}
	public Movie(int mno, String mname, int ryear) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.ryear = ryear;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getRyear() {
		return ryear;
	}
	public void setRyear(int ryear) {
		this.ryear = ryear;
	}
	@Override
	public String toString() {
		return "Movie [mno=" + mno + ", mname=" + mname + ", ryear=" + ryear + "]";
	}
	
	
	
	
}
