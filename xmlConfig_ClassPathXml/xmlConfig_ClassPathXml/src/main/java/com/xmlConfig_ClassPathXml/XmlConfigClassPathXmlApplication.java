package com.xmlConfig_ClassPathXml;


import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xmlConfig_ClassPathXml.entity.Employee;

@SpringBootApplication
public class XmlConfigClassPathXmlApplication {

	public static void main(String[] args) {
//		SpringApplication.run(XmlConfigClassPathXmlApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Address: " + employee.getEmpAddress());
		
	}

}
