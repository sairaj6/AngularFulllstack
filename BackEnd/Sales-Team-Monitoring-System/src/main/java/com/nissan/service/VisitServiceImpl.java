package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IEmployeeDao;
import com.nissan.dao.IVisitDao;
import com.nissan.model.Employee;
import com.nissan.model.Visit;

@Service
public class VisitServiceImpl implements IVisitService {

	@Autowired
	private IVisitDao visitDao;
	
	@Autowired
	private IEmployeeDao employeeDao;
	
	@Override
	public List<Visit> listAllVisits() {
		
		return visitDao.findAll();
	}

	@Override
	public Visit searchById(Integer _visitId) {
		
		return visitDao.findById(_visitId).get();
	}

	@Override
	public Visit addVisit(Visit _newVisit) {
		
		return visitDao.save(_newVisit);
	}

	@Override
	public List<Employee> listAllEmployees() {
		
		return employeeDao.findAll();
	}

	@Override
	public Employee addEmployee(Employee _newEmployee) {
		
		return employeeDao.save(_newEmployee);
	}

}
