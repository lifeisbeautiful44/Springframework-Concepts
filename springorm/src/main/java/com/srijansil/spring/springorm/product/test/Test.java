package com.srijansil.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srijansil.spring.springorm.product.dao.ProductDao;
import com.srijansil.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/srijansil/spring/springorm/product/test/config.xml");

		ProductDao productDaoImpl = (ProductDao) context.getBean("productDaoImpl");

		/*
		 * Product product = new Product(); product.setId(1); product.setName("Iphone");
		 * product.setDesc("It is an apple product and iphone 17 with new features");
		 * product.setPrice(1000.23);
		 * 
		 * int results = productDaoImpl.create(product);
		 * 
		 * System.out.println("The results are described below: " + results);
		 * 
		 * productDaoImpl.update(product);
		 * 
		 * productDaoImpl.delete(product);
		
		Product product = productDaoImpl.find(1);
		System.out.println(product);
		 */
		
		List<Product> products = productDaoImpl.findAll();
		System.out.println(products);
	}

}
