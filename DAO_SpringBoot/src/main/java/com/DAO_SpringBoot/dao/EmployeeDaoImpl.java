package com.DAO_SpringBoot.dao;

import java.util.ArrayList;
import java.util.List;

import com.DAO_SpringBoot.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	List<Employee> employees;
	
	public EmployeeDaoImpl()
    {
		employees = new ArrayList<Employee>();
		Employee Developer1 = new Employee(1, "Bhudevi Dobbala");
		Employee Developer2 = new Employee(2, "Bhudevi Devi");
        employees.add(Developer1);
        employees.add(Developer2);
    }
	
	 @Override
	    public void deleteEmployee(Employee emp)
	    {
	        employees.remove(emp.getEmpId());
	        System.out.println("empId "
	                           + emp.getEmpId()
	                           + ", deleted from database");
	    }
	 
	 @Override public List<Employee> getAllEmployees()
	    {
	        return employees;
	    }
	
	    @Override public Employee getEmployee(int empId)
	    {
	        return employees.get(empId);
	    }
	 
	    @Override
	    public void updateEmployee(Employee emp)
	    {
	        employees.get(emp.getEmpId())
	            .setEmpName(emp.getEmpName());
	        System.out.println("employeeId "
	                           + emp.getEmpId()
	                           + ", updated in the database");
	    }
}
