package com.srijansil.spring.springcore.assignment.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/srijansil/spring/springcore/assignment/assignment1/shoppingcartconfig.xml");
		ShoppingCart shoopingCart = (ShoppingCart)context.getBean("shoopingCart");
		
		System.out.println(shoopingCart);
	}

}
