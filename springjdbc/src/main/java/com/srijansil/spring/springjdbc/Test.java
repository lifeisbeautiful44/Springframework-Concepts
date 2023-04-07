package com.srijansil.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/srijansil/spring/springjdbc/config.xml");
		JdbcTemplate jdbctemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		
		String mysql="insert into employee values(?,?,?)";
		
		int result = jdbctemplate.update(mysql, 1,"Srijansil", "Bohara");
		
		System.out.println("Number of records inserted: "+ result);

	}

}
