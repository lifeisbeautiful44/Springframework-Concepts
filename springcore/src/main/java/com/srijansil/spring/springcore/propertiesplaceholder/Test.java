package com.srijansil.spring.springcore.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/srijansil/spring/springcore/propertiesplaceholder/config.xml");
		MyDao dao = (MyDao) context.getBean("dao");
		System.out.println(dao);
	}

}
