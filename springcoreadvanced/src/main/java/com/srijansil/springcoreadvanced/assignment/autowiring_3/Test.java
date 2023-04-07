package com.srijansil.springcoreadvanced.assignment.autowiring_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/srijansil/springcoreadvanced/assignment/autowiring_3/config.xml");
		
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}

}
