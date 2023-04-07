package com.srijansil.spring.springjdbc.assignment;

import java.util.List;

public interface PassengerDao {
	
	int create(Passenger p);
	
	int update(Passenger p);
	
	int delete(int id);
	
	Passenger read(int id);
	
	List<Passenger> findAllPassenger();

}
