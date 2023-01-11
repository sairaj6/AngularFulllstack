package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;
import com.nissan.model.Visit;

public interface IVisitService {

	//get all visits
	List<Visit> listAllVisits();
	
	Visit searchById(Integer _visitId);

	Visit addVisit(Visit _newVisit);
	
	List<Employee> listAllEmployees();
	
	Employee addEmployee(Employee _newEmployee);
}
