package com.srijansil.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

	@Autowired
	Dao dao;

	public void init() {
		System.out.println("init() method.");
	}

	public void save() {
		dao.create();
	}

	public void destroy() {
		System.out.println("destroy() method.");
	}

}
