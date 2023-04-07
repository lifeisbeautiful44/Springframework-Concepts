package com.srijansil.spring.springorm.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	
	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/srijansil/spring/springorm/assignment/config.xml");
		
		PassengerDao passenegerDaoImpl = (PassengerDao) context.getBean("passengerDaoImpl");
		
		Passenger passenger = new Passenger();
		passenger.setId(1);
		passenger.setFirstName("Rosa");
		passenger.setLastName("A.I.");
		
		/*
		 * passenegerDaoImpl.create(passenger);
		 */		
		
//		passenegerDaoImpl.update(passenger);
		
		Passenger passenger2 = passenegerDaoImpl.find(2);
		System.out.println(passenger2);
		
		
		
		List<Passenger> findAll = passenegerDaoImpl.findAll();
		System.out.println(findAll);
		
		
	}
	

}
