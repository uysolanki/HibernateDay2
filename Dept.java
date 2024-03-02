package com.greatlearning.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dept {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int dno;
		private String dname;
		private String location;
		
		@OneToMany(mappedBy = "d", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		private List<Emp> emplist;
		
		public Dept() {}
		public Dept(int dno, String dname, String location, List<Emp> emplist) {
			this.dno = dno;
			this.dname = dname;
			this.location = location;
			this.emplist = emplist;
		}
		public int getDno() {
			return dno;
		}
		public void setDno(int dno) {
			this.dno = dno;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public List<Emp> getEmplist() {
			return emplist;
		}
		public void setEmplist(List<Emp> emplist) {
			this.emplist = emplist;
		}
		@Override
		public String toString() {
			return "Dept [dno=" + dno + ", dname=" + dname + ", location=" + location + ", emplist=" + emplist + "]";
		}
		
		
		
		
		
}
