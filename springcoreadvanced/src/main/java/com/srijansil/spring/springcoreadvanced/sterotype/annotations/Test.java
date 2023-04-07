package com.srijansil.spring.springcoreadvanced.sterotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/srijansil/spring/springcoreadvanced/sterotype/annotations/config.xml");
		Teacher teacher = (Teacher) context.getBean("tea");
		Teacher teacher1 = (Teacher) context.getBean("tea");

		System.out.println(teacher.hashCode());
		System.out.println(teacher1);

		
	}

}
