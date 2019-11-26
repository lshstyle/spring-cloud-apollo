package com.example.spring.boot.service.impl;

import org.springframework.stereotype.Service;

import com.example.spring.boot.service.ApiService;

@Service
public class ApiServiceImpl  implements ApiService{
	
	
	public String message() {
		return "homeValue";
	}
	
}
