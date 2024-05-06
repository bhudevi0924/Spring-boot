package com.BeanFactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BeanFactory.model.BeanModel;

@RestController
public class BeanController {

	private final BeanModel beanModel;

    @Autowired
    public BeanController(BeanModel beanModel) {
        this.beanModel = beanModel;
    }

    @GetMapping("/message")
    public String getMessage() {
        return beanModel.getMessage();
    }
}
