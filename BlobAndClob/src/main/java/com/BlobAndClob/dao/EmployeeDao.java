package com.BlobAndClob.dao;

import com.BlobAndClob.entity.Employee;

public interface EmployeeDao {
	public void insertEmployee(Employee emp);
	
	public Employee readEmployee();
}
