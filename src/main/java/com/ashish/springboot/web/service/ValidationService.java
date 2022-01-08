package com.ashish.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {

	public boolean validateUser(String username,String password) {
		
		if(username.equalsIgnoreCase("astha") && password.equalsIgnoreCase("12312300"))
			return true;
		
		return false;
	}
}
