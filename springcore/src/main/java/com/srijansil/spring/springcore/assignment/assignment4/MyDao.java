package com.srijansil.spring.springcore.assignment.assignment4;

public class MyDao {

	private String url;
	private String userName;
	private String password;

	@Override
	public String toString() {
		return "MyDao [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

	public MyDao(String url, String userName, String password) {
	
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

}
