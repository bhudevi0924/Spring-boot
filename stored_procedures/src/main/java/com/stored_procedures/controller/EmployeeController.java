package com.stored_procedures.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stored_procedures.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("totalEmployees")
	public int getTotalEmployees() {
		return employeeService.getTotalEmployees();
	}
}
