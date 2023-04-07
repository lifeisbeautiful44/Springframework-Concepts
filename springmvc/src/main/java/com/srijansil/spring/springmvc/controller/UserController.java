package com.srijansil.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srijansil.spring.springmvc.dto.User;

@Controller
public class UserController {

	@RequestMapping("/showRegistrationPage")
	public String showRegistrarionPage() {

		/*
		 * ModelAndView modelAndView = new ModelAndView();
		 * modelAndView.setViewName("userReg");
		 */
		return "userReg";
	}

	@RequestMapping("/registerUser")
	public String registerUser( User user, ModelMap model) {
		
		/*
		 * ModelAndView modelAndView = new ModelAndView();
		 * modelAndView.addObject("user",user); modelAndView.setViewName("userDetails");
		 */
		
		model.addAttribute(user);
          
		return "userDetails";
	}

}
