package com.srijansil.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srijansil.springmvcorm.user.entity.User;
import com.srijansil.springmvcorm.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
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
		int result = userService.save(user);
		
		model.addAttribute("result", "The User with the Id has been added: " +result);
          
		return "userReg";
	}
	
	
	@RequestMapping("/getUsers")
	public String getUsers(ModelMap model) {

		/*
		 * ModelAndView modelAndView = new ModelAndView();
		 * modelAndView.setViewName("userReg");
		 */
		
		List<User> users = userService.getUser();
		model.addAttribute("users", users);
		
		return "displayUsers";
	}
	
	
	@RequestMapping("/validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {

		User user = userService.findUserByid(id);
		
		String errMsg = "";
		if(user != null)
		{
			errMsg = id + " is Already exits, please use another Id. ^^ ";
			System.out.println("it is working");
		}
	
		return errMsg;
	}
	

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
