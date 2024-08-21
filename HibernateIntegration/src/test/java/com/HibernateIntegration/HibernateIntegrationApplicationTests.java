package com.HibernateIntegration;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.HibernateIntegration.entity.Employee;
import com.HibernateIntegration.service.EmployeeService;

@SpringBootTest
class HibernateIntegrationApplicationTests {

    @Autowired
    EmployeeService empService;

    @Test
    void contextLoads() {
        List<Employee> employees = empService.list();
        
        // Use AssertJ's Assertions class to perform assertions
        Assertions.assertThat(employees).hasSize(1);
    }
}
