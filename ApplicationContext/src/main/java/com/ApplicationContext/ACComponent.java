package com.ApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ApplicationContext.service.ApplicationContextService;

@Component
public class ACComponent {

	 private ApplicationContextService service;

	    @Autowired
	    public ACComponent(ApplicationContextService service) {
	        this.service = service;
	    }

	    public String displayMessage() {
	       return service.getMessage();
	    }
}
