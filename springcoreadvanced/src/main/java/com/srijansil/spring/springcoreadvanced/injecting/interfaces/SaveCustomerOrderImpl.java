package com.srijansil.spring.springcoreadvanced.injecting.interfaces;

public class SaveCustomerOrderImpl implements SaveCustomerOrderDao {

	@Override
	public void saveOrder() {
		System.out.println(
				"The customer order has been saved in the database, Thank you we will notify you soon. (Inisde the CustomerDaoImpl)");
	}

}
