package com.srijansil.spring.springmvc2.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srijansil.spring.springmvc2.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView readObject() {

		ModelAndView modelAndView = new ModelAndView();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Rosa");
		e1.setSalary(1000);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Marry");
		e2.setSalary(2000);

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("Jane");
		e3.setSalary(3000);

		ArrayList<Employee> emplooyess = new ArrayList<Employee>();
		emplooyess.add(e1);
		emplooyess.add(e2);
		emplooyess.add(e3);

		modelAndView.addObject("emplooyess", emplooyess);

		modelAndView.setViewName("listView");

		return modelAndView;
	}

}
