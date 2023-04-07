package com.srijansil.spring.springcore.propertiesplaceholder;

public class MyDao {
	
	String serverName;
	
	public MyDao(String dbName)
	{
		serverName = dbName;
	}

	@Override
	public String toString() {
		return "MyDao [serverName=" + serverName + "]";
	}

}
