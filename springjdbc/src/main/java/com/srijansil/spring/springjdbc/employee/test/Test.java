package com.srijansil.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srijansil.spring.springjdbc.employee.dao.EmployeeDao;
import com.srijansil.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srijansil/spring/springjdbc/employee/test/config.xml");
		EmployeeDao daoImpl = (EmployeeDao) context.getBean("daoImpl");

		Employee emp = new Employee();
		/*
		 * emp.setId(1); emp.setFirstName("CHill");
		 * emp.setLastName("Brother, no worries");
		 */

		/*
		 * to insert the employee..
		 *  int results = daoImpl.create(emp);
		 * System.out.println("Number of records inserted is: " + results);
		 */

		/*
		 * to update the employee..
		 *  int results = daoImpl.update(emp);
		 * System.out.println("Number of records updated: "+results);
		 */

		/*
		 * to delete the employee.. 
		 * int results = daoImpl.delete(1);
		 * System.out.println("Number of records deleted: "+results);
		 */

		/*
		 * To read the single the record.
		 *  Employee read = daoImpl.read(2);
		 * System.out.println(read);
		 */

		List<Employee> results = daoImpl.findAllRecords();
		System.out.println("All the records of employee.");
		for (Employee emmp : results) {
			System.out.println(emmp.getId());
			System.out.println(emmp.getFirstName());
			System.out.println(emmp.getLastName());
		}

	}

}
