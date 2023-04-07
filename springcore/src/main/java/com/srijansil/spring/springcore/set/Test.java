package com.srijansil.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srijansil/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("carDealer");
		CarDealer carDealer2 = (CarDealer) context.getBean("carDealer");

		System.out.println("Hospital Details: ");
		System.out.println("Hospital Name: " + carDealer.getName().getClass().getName());
		System.out.println("Hospital Departments: " + carDealer.getModels().getClass().getName());

		System.out.println(carDealer); // com.srijansil.spring.springcore.set.CarDealer@1b083826

		System.out.println(carDealer2); // com.srijansil.spring.springcore.set.CarDealer@1b083826

		// How much instance we create from the bean , it will create only once, that
		// object.

	}

}
