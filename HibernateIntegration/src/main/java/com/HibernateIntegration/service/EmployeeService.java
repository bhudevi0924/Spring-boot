package com.HibernateIntegration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HibernateIntegration.entity.Employee;
import com.HibernateIntegration.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository empRepository;
	
	public List<Employee> list() {
		return empRepository.findAll();
	}
}
