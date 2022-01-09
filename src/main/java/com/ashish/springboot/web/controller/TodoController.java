package com.ashish.springboot.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ashish.springboot.web.service.TodoService;
import com.ashish.springboot.web.service.ValidationService;

@Controller
@SessionAttributes("name")
public class TodoController {

	@Autowired
	TodoService todoService;
	
	@RequestMapping(value="/manage-todos",method = RequestMethod.GET)
//	@ResponseBody  - when just showing a string on the browser, no need to create any view(html/jsp)
	public String showLoginPage(ModelMap model)
	{
		String name = (String) model.get("name");
		model.put("todos", todoService.retrieveTodos(name));
		return "list-todos";
	}
	@RequestMapping(value="/add-todo",method = RequestMethod.GET)
	public String showAddTodoPage()
	{
		return "add-todo";
	}
	
	@RequestMapping(value="/add-todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc){
		todoService.addTodo((String) model.get("name"), desc, new Date(), false);
		return "redirect:/manage-todos"; //instead of showing directly list-todos page, we the redirecting it to /list-todos so that it can fetch fresh or updated list of todos to show in the list
	}
	
	@RequestMapping(value="/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id)
	{
		todoService.deleteTodo(id);
		return "redirect:/manage-todos";
	}
	
	
}
