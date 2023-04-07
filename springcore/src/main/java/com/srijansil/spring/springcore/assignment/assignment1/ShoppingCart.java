package com.srijansil.spring.springcore.assignment.assignment1;

public class ShoppingCart {

	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ShoppingKart [item=" + item + "]";
	}

}
