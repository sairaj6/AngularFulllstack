package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.Employee;
@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer> {

}
