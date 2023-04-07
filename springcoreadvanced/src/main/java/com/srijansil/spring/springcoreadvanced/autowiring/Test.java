package com.srijansil.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/srijansil/spring/springcoreadvanced/autowiring/config.xml");
		
		Employee employee = (Employee)context.getBean("employee");
		
		System.out.println(employee);

		
	}

}
