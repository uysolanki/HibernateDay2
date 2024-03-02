package com.greatlearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ChiefMinister {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int cmno;     
		private String cmname;
		private int cmage;
		
		@OneToOne(mappedBy = "myCm")
		State myState;
		
		
		public ChiefMinister() {}
		public ChiefMinister(int cmno, String cmname, int cmage) {
			this.cmno = cmno;
			this.cmname = cmname;
			this.cmage = cmage;
		}
		public int getCmno() {
			return cmno;
		}
		public void setCmno(int cmno) {
			this.cmno = cmno;
		}
		public String getCmname() {
			return cmname;
		}
		public void setCmname(String cmname) {
			this.cmname = cmname;
		}
		public int getCmage() {
			return cmage;
		}
		public void setCmage(int cmage) {
			this.cmage = cmage;
		}
		
		
		public State getMyState() {
			return myState;
		}
		public void setMyState(State myState) {
			this.myState = myState;
		}
		@Override
		public String toString() {
			return "ChiefMinister [cmno=" + cmno + ", cmname=" + cmname + ", cmage=" + cmage + ", myState=" + myState
					+ "]";
		}
		
		
		
		
}
