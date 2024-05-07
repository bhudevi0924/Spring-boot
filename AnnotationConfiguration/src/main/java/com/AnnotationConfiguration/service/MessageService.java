package com.AnnotationConfiguration.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	public String getMessage() {
		return "Message Service Triggered.";
	}
}
