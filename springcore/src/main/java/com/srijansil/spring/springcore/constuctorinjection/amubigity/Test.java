package com.srijansil.spring.springcore.constuctorinjection.amubigity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/srijansil/spring/springcore/constuctorinjection/amubigity/config.xml");
		
		Addition addition = (Addition)context.getBean("addition");
		
		System.out.println(addition);

		
	}

}
