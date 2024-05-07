package com.ApplicationContext;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class ApplicationContextApplication {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//comment this line for running xlmBeanFactory
//		SpringApplication.run(ApplicationContextApplication.class, args);
		
		// Load the bean definitions from beans.xml
				XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		        
		        // Retrieve the HelloWorld bean from the factory
		        xmlBeanFactoryClass helloWorld = (xmlBeanFactoryClass) factory.getBean("helloWorld");
		        
		        // Call a method on the HelloWorld bean
		        helloWorld.getMessage();
			}
	}


