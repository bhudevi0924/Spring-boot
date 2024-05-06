package com.ApplicationContext.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApplicationContext.ACComponent;

@RestController
public class ApplicationContextController {

	private ACComponent component;

    @Autowired
    public ApplicationContextController(ACComponent component) {
        this.component = component;
    }

    @GetMapping("/message")
    public String getMessage() {
        return component.displayMessage();
    }
}
