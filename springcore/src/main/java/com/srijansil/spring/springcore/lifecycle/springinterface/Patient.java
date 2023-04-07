package com.srijansil.spring.springcore.lifecycle.springinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Firstof all the object is created and setter is invoked.");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside the init Method.");
		System.out.println("After the object is created , i am run.");
	}
	
	@Override
	public void destroy() throws Exception {
		  System.out.println("Inside the destroy method Method."); 
		  System.out.println("Before the object or the container is destroyed, i am run. ");		
	}
	

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}




}
