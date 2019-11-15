package com.example.spring.boot.demo.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.spring.boot.demo.service.ApiService;

@Service
public class ApiServiceImpl  implements ApiService{
	
	@Value("${homeValue}")
	private String homeValue;
	
	public String message() {
		return homeValue;
	}
	
}
