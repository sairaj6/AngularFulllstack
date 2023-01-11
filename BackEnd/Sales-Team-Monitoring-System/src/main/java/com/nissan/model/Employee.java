package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblemployee")
public class Employee {

	//instance variables/fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	
	//default constr
	public Employee() {
		super();
	}
	
	//parameterized constr
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//getters & setters
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//toString
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
