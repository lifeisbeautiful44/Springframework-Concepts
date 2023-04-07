package com.srijansil.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
		Service service = context.getBean(Service.class);
		Service service1 = context.getBean(Service.class);
		
		System.out.println(service.hashCode());
		System.out.println(service1.hashCode());

		service.save();
		context.close();

	}
}
