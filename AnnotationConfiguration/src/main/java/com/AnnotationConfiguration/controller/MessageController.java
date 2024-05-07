package com.AnnotationConfiguration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AnnotationConfiguration.service.MessageService;

@RestController
public class MessageController {

	private MessageService messageService;
	
	@Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/getMessage")
    public String getMessage() {
        return messageService.getMessage();
    }
}
