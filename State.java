package com.greatlearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String stname;
	private String capcity;
	
	@OneToOne
	@JoinColumn(name="cmname")
	ChiefMinister myCm;
	
	public State() {}
	public State(int sno, String stname, String capcity) {
		this.sno = sno;
		this.stname = stname;
		this.capcity = capcity;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getCapcity() {
		return capcity;
	}
	public void setCapcity(String capcity) {
		this.capcity = capcity;
	}
	
	
	public ChiefMinister getMyCm() {
		return myCm;
	}
	public void setMyCm(ChiefMinister myCm) {
		this.myCm = myCm;
	}
	@Override
	public String toString() {
		return "State [sno=" + sno + ", stname=" + stname + ", capcity=" + capcity + ", myCm=" + myCm + "]";
	}
	
	
	
}
