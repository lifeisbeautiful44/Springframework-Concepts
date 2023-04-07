package com.srijansil.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {

	@RequestMapping("showDetails")
	public ModelAndView showDetails(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("email") String email) {

		System.out.println(id);
		System.out.println(name);
		System.out.println(email);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");

		return modelAndView;
	}

}
