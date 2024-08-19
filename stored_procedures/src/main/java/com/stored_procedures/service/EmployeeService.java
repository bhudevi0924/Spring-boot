package com.stored_procedures.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stored_procedures.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository  employeeRepository;
	
	public int getTotalEmployees() {
		return employeeRepository.nqGetTotalEmployees();
	}
}
