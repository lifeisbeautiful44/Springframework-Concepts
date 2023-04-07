package com.srijansil.spring.springcore.lifecycle.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srijansil/spring/springcore/lifecycle/xmlconfig/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		
		System.out.println(patient);
		context.registerShutdownHook();

	
	
	}

}
