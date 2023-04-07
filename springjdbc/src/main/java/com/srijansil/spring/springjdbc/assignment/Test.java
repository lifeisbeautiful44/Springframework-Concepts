package com.srijansil.spring.springjdbc.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/srijansil/spring/springjdbc/assignment/config.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDaoImpl");
		
		/*
		 * Passenger passenger = new Passenger(); passenger.setId(1);
		 * passenger.setFirstName("Srijansil"); passenger.setLastName("Updated");
		 */
		
		/*
		 * int result = passengerDao.update(passenger);
		 * System.out.println("Passenger updated: "+ result);
		 */
		
		/*
		 * int result = passengerDao.delete(1);
		 * System.out.println("Passenger deleted: "+ result);
		 */
		Passenger p = passengerDao.read(2);
		System.out.println(p);
		
		List<Passenger> p1 = passengerDao.findAllPassenger();
		System.out.println(p1);
		



	}

}
