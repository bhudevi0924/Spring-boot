package com.JpaIntegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.JpaIntegration.entity.Customer;
import com.JpaIntegration.repository.CustomerRepository;

@SpringBootApplication
public class JpaIntegrationApplication {
	
//	 private static final Logger log = LoggerFactory.getLogger(JpaIntegrationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JpaIntegrationApplication.class, args);
	}
	
	@Bean
	  public CommandLineRunner demo(CustomerRepository repository) {
	    return (args) -> {
	      // save customers
	      repository.save(new Customer("Bhudevi", "Dobbala"));
	      repository.save(new Customer("Bhudevi", "D"));

	      // fetch all customers
	      System.out.print("Customers found with findAll():");
	      System.out.print("-------------------------------");
	      repository.findAll().forEach(customer -> {
	    	 System.out.print(customer.toString());
	      });
	      System.out.print("");

	      // fetch customers by last name
	      System.out.print("Customer found with findByLastName('D'):");
	      System.out.print("--------------------------------------------");
	      repository.findByLastName("D").forEach(d -> {
	    	 System.out.print(d.toString());
	      });
	    };
	  }


}
