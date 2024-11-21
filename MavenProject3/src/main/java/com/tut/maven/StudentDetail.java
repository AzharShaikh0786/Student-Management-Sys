package com.tut.maven;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDetail {
	
	@Id
	private int id ;
	private String name ;
	private String degree;
	
	
	public StudentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentDetail(int id, String name, String degree) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	

	
	
	
	
}
