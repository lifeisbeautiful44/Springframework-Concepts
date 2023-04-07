package com.srijansil.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/srijansil/spring/springcore/properties/propconfig.xml");
		
		CountriesAndLanguages cnl = (CountriesAndLanguages) context.getBean("cnl");
		
		System.out.println(cnl);
	}

}
