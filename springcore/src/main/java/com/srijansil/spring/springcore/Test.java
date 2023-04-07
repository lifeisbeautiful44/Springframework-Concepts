package com.srijansil.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
		Employee emp =  (Employee)cxt.getBean("emp");
		
		System.out.println("Employee Details: ");
		System.out.println("Employee id: "+ emp.getId());
		System.out.println("Employee Details: "+ emp.getName());
		
		
        cxt.close();

	}

}
