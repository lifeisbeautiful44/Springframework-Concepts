package com.srijansil.spring.springcoreadvanced.injecting.interfaces.annontationsway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("customerOrder")
public class CustomerOrderImpl implements CustomerOrder {

	@Autowired
	@Qualifier("saveCustomerOrder2")
	private SaveCustomerOrderDao dao;

	@Override
	public void placeOrder() {
		System.out.println("Customer Order is generated, inside the CustomerOrderImpl...");
		dao.saveOrder();
	}
	
	

	/*
	 * public SaveCustomerOrderDao getDao() { return dao; }
	 * 
	 * public void setDao(SaveCustomerOrderDao dao) { this.dao = dao; }
	 */
	
//	public CustomerOrderImpl(SaveCustomerOrderDao dao)
//	{
//		this.dao =dao;
//	}
	
	

}
