package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;
import com.nissan.model.Visit;
import com.nissan.service.IVisitService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class VisitController {

	@Autowired
	IVisitService visitService;
	
	// List all Visits
	@GetMapping("visits")
	public List<Visit> listOfAllVisits() {
		return visitService.listAllVisits();
	}
	
	@GetMapping("visits/{_visitId}")
	public Visit getVisitById(@PathVariable Integer _visitId) {
		return visitService.searchById(_visitId);
		
	}
	
	@PostMapping("visits")
	public Visit addNewVisit(@RequestBody Visit _visit) {
		return visitService.addVisit(_visit);
	}
	
	
	// List all Employee
	@GetMapping("employees")
	public List<Employee> listOfAllEmployees() {
		return visitService.listAllEmployees();
	}
	
	@PostMapping("employees")
	public Employee addNewEmployee(@RequestBody Employee _employee) {
		return visitService.addEmployee(_employee);
	}
}
