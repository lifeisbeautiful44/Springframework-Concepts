package com.srijansil.spring.springcore.lifecycle.xmlconfig;

public class Patient {

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
	
	public void init()
	{
		System.out.println("Inside the init Method.");
		System.out.println("After the object is created , i am run.");
	}
	
	public void destroy()
	{
		System.out.println("Inside the destroy method Method.");
		System.out.println("Before the object or the container is destroyed, i am run. ");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}

}
