package com.srijansil.spring.springcoreadvanced.injecting.interfaces.annontationsway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srijansil/spring/springcoreadvanced/injecting/interfaces/annontationsway/config.xml");

		CustomerOrder customerOrder  = (CustomerOrder) context.getBean("customerOrder");
		customerOrder.placeOrder();
	}

}
