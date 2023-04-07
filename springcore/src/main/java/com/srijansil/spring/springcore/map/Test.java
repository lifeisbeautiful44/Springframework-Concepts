package com.srijansil.spring.springcore.map;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/srijansil/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		
		System.out.println("Products Details:: ");
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
		
	
	}
	

	


}
