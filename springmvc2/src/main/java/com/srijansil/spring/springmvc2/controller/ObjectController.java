package com.srijansil.spring.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srijansil.spring.springmvc2.dto.Employee;

@Controller
public class ObjectController {
	
	
	@RequestMapping("/readObject")
	public ModelAndView readObject()
	{
	
		ModelAndView modelAndView = new ModelAndView();
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Rosa");
		employee.setSalary(1000);
		modelAndView.addObject("employee", employee);
		
		modelAndView.setViewName("objectView");
		
		return modelAndView;
	}

}
