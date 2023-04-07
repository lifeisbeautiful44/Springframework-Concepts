package com.srijansil.spring.springcoreadvanced.injecting.interfaces.annontationsway;

import org.springframework.stereotype.Component;

@Component("saveCustomerOrder2")
public class SaveCustomerOrderImpl2 implements SaveCustomerOrderDao {

	@Override
	public void saveOrder() {
		System.out.println(
				"The customer order 2 has been saved in the database, Thank you we will notify you soon. (Inisde the CustomerDaoImpl2 )");
	}

}
