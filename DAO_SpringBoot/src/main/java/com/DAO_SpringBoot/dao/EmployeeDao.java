package com.DAO_SpringBoot.dao;

import java.util.List;

import com.DAO_SpringBoot.entity.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();
    public Employee getEmployee(int DeveloperId);
    public void updateEmployee(Employee emp);
    public void deleteEmployee(Employee emp);
}
