package com.greatlearning.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private int ano;
			private String aname;
			private int age;
			
			@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
			@JoinTable(
					name="bollywood",
					joinColumns = @JoinColumn(name="anox"),
					inverseJoinColumns = @JoinColumn(name="mnoy")
					)
			private List<Movie> portfolio;
			
			public Actor() {}

			public int getAno() {
				return ano;
			}

			public void setAno(int ano) {
				this.ano = ano;
			}

			public String getAname() {
				return aname;
			}

			public void setAname(String aname) {
				this.aname = aname;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public List<Movie> getPortfolio() {
				return portfolio;
			}

			public void setPortfolio(List<Movie> portfolio) {
				this.portfolio = portfolio;
			}

			@Override
			public String toString() {
				return "Actor [ano=" + ano + ", aname=" + aname + ", age=" + age + ", portfolio=" + portfolio + "]";
			}
			
			
						
}
