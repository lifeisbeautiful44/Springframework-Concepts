package com.srijansil.spring.springjdbc.employee.dao;

import java.util.List;

import com.srijansil.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	int create(Employee emp);
	
	int update(Employee emp);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> findAllRecords();

}
