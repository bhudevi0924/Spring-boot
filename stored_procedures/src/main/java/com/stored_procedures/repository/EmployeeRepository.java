package com.stored_procedures.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.stored_procedures.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//native query to run the stored procedure
	@Query(value="select gettotalemployees()", nativeQuery = true)
	int nqGetTotalEmployees();
	
}
