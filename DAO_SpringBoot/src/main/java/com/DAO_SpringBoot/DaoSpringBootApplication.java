package com.DAO_SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DAO_SpringBoot.dao.EmployeeDaoImpl;
import com.DAO_SpringBoot.entity.Employee;

@SpringBootApplication
public class DaoSpringBootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DaoSpringBootApplication.class, args);
		 EmployeeDaoImpl empdao = new EmployeeDaoImpl();
		 
	        for (Employee emp :
	        	empdao.getAllEmployees()) {
	            System.out.println("EmployeeId : "
	                               + emp.getEmpId()
	                               + ", Name : "
	                               + emp.getEmpName());
	        }
	 
	        Employee emp
	            = empdao.getAllEmployees().get(0);
	 
	        emp.setEmpName("Bhudevi D");
	        empdao.updateEmployee(emp);
	 
	        empdao.getEmployee(0);
	        System.out.println(
	            "EmployeeId : " + emp.getEmpId()
	            + ", Name : " + emp.getEmpName());
	}
}

