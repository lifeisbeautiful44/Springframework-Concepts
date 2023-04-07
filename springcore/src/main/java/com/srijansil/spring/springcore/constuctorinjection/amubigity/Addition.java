package com.srijansil.spring.springcore.constuctorinjection.amubigity;

public class Addition {

	public Addition(double a, double b) {
		System.out.println("Inside the double");

	}

	public Addition(int a, int b) {
		System.out.println("Inside the init");

	}
	

	public Addition(String a, String b) {
		System.out.println("Inside the string");

	}


}
