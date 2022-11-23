package com.bharadwaj.microservices.departments.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString

public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int noOfEmp;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public Department(String name, int noOfEmp) {
		super();
		this.name = name;
		this.noOfEmp = noOfEmp;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

//	public Department(long id, String name, int noOfEmp) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.noOfEmp = noOfEmp;
//	}
}