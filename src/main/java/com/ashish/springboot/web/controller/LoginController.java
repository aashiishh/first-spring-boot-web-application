package com.ashish.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashish.springboot.web.service.ValidationService;

@Controller
public class LoginController {

	@Autowired
	ValidationService validationService;
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
//	@ResponseBody  - when just showing a string on the browser, no need to create any view(html/jsp)
	public String showLoginPage(ModelMap model)
	{
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		boolean isValidUser = validationService.validateUser(name, password);
		if(!isValidUser)
		{
			model.put("message", "*Wrong Credentials!!");
			return "login";
		}
		
		model.put("message", "login Successfull!!");
		model.put("name", name);
		return "welcome";
	}
	
	@RequestMapping("/logout")
	public String showLogoutPage(ModelMap model)
	{
		model.put("logoutMessage", "User logged out successfully!!");
		return "login";
	}
}
