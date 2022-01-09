package com.ashish.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {

	public boolean validateUser(String username,String password) {
		//changed by Ashish
		if(username.equalsIgnoreCase(username) && password.equalsIgnoreCase(password))
			return true;
		
		return false;
	}
}
