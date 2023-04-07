package com.srijansil.spring.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srijansil.spring.springmvc2.dto.User;

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
