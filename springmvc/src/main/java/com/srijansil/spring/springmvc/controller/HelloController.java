package com.srijansil.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {

		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "Srijansil Bohara");
		modelAndView.addObject("salary", 1234);
		
		modelAndView.setViewName("hello");

		return modelAndView;
	}

}
