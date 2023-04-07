package com.srijansil.spring.springjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class Dao {
	
	public void create()
	{
		System.out.println("The Dao is created and connected to database, and a new record is added.");
	}

}
