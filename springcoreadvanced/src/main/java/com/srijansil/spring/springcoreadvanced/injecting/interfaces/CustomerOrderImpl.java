package com.srijansil.spring.springcoreadvanced.injecting.interfaces;

public class CustomerOrderImpl implements CustomerOrder {

	private SaveCustomerOrderDao dao;

	@Override
	public void placeOrder() {
		System.out.println("Customer Order is generated, inside the CustomerOrderImpl...");
		dao.saveOrder();
	}

	public SaveCustomerOrderDao getDao() {
		return dao;
	}

	public void setDao(SaveCustomerOrderDao dao) {
		this.dao = dao;
	}
	
//	public CustomerOrderImpl(SaveCustomerOrderDao dao)
//	{
//		this.dao =dao;
//	}
	
	

}
