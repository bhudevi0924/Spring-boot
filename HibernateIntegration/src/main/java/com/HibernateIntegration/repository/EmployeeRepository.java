package com.HibernateIntegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HibernateIntegration.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

}
