package com.ApplicationContext.service;

import org.springframework.stereotype.Service;

@Service
public class ApplicationContextService {

	public String getMessage() {
        return "Hello from MyService!";
    }
}
