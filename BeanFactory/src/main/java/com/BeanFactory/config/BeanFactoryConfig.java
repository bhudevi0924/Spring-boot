package com.BeanFactory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.BeanFactory.model.BeanModel;

@Configuration
public class BeanFactoryConfig {

    @Bean
    public BeanModel myBean() {
        return new BeanModel("Hello, From Bean Model");
    }
}